/*
 * The MIT License
 *
 * Copyright 2018 Onshape Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.onshape.api.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.AbstractBlob;
import com.onshape.api.types.Blob;
import com.onshape.api.types.ErrorResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.JsonObjectOrArrayInputStream;
import com.onshape.api.types.OAuthTokenResponse;
import com.onshape.api.types.OnshapeVersion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.media.multipart.Boundary;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.hashids.Hashids;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

/**
 * @author Peter Harman peter.harman@cae.tech
 */
public class BaseClient {

    private String baseURL = "https://cad.onshape.com";
    private String oauthURL = "https://oauth.onshape.com/oauth/token";
    private final Client client;
    private final Hashids hashids = new Hashids("cloudCADIsGreat", 25, "abcdefghijklmnopqrstuvwxyz01234567890");
    private final ObjectMapper objectMapper;
    private String accessKey;
    private String secretKey;
    private OAuthTokenResponse token;
    private Date tokenReceived;
    private String clientId;
    private String clientSecret;
    private File workingDir;
    private PollingHandler pollingHandler;
    private boolean usingValidation;
    private final Set<RequestListener> requestListeners;
    private static final ObjectMapper TOSTRINGMAPPER;
    //Set TIMEOUT to 10 minutes to match Onshape TIMEOUT.
    private final int TIMEOUT = 600000;

    public static final String ONSHAPE_JSON_V1 = "application/vnd.onshape.v1+json";
    public static final String ONSHAPE_JSON_V2 = "application/vnd.onshape.v2+json";
    private static final String[] JSON_MEDIA_TYPES = new String[]{ONSHAPE_JSON_V2, ONSHAPE_JSON_V1, MediaType.APPLICATION_JSON};
    private static final Predicate<String> IS_JSON_MEDIA_TYPE = (String type) -> Stream.of(JSON_MEDIA_TYPES).anyMatch(jsonType -> type.startsWith(jsonType));

    public static final String ONSHAPE_OCTET_STREAM_V1 = "application/vnd.onshape.v1+octet-stream";
    public static final String ONSHAPE_OCTET_STREAM_V2 = "application/vnd.onshape.v2+octet-stream";
    private static final String[] BINARY_MEDIA_TYPES = new String[]{ONSHAPE_OCTET_STREAM_V2, ONSHAPE_OCTET_STREAM_V1, MediaType.APPLICATION_OCTET_STREAM, "*/*"};

    static {
        TOSTRINGMAPPER = new ObjectMapper();
        TOSTRINGMAPPER.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public BaseClient() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        JacksonJaxbJsonProvider jacksonProvider = new JacksonJaxbJsonProvider();
        jacksonProvider.setMapper(objectMapper);
        ClientConfig clientConfig = new ClientConfig(jacksonProvider);
        clientConfig.property(ClientProperties.CONNECT_TIMEOUT, TIMEOUT);
        clientConfig.property(ClientProperties.READ_TIMEOUT, TIMEOUT);
        clientConfig.register(MultiPartFeature.class);
        clientConfig.register(new CompressionReaderInterceptor());
        client = ClientBuilder.newClient(clientConfig);
        workingDir = new File(System.getProperty("java.io.tmpdir"));
        usingValidation = true;
        requestListeners = new HashSet<>();
    }

    /**
     * Get the base URL this client is currently pointed at
     *
     * @return base URL
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Set the base URL this client should point at
     *
     * @param baseURL base URL
     */
    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getOauthURL() {
        return oauthURL;
    }

    public void setOauthURL(String oauthURL) {
        this.oauthURL = oauthURL;
    }

    /**
     * Check whether the client is using validation of required fields before
     * HTTP methods are called
     *
     * @return true if validation is enabled
     */
    public boolean isUsingValidation() {
        return usingValidation;
    }

    /**
     * Set whether the client is using validation of required fields before HTTP
     * methods are called
     *
     * @param usingValidation true if validation is desired
     */
    public void setUsingValidation(boolean usingValidation) {
        this.usingValidation = usingValidation;
    }

    /**
     * Get the current Onshape version
     *
     * @return OnshapeVersion object
     * @throws OnshapeException On HTTP error
     */
    public OnshapeVersion version() throws OnshapeException {
        return call("GET", "/build", null, new HashMap<>(), new HashMap<>(), OnshapeVersion.class);
    }

    /**
     * Set credentials for using API keys
     *
     * @param accessKey API access key
     * @param secretKey API secret key
     */
    public void setAPICredentials(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    /**
     * Set a previously requested OAuth token
     *
     * @param token Token object from server
     * @param tokenReceived Date that token was received
     * @param clientId Client id of application
     * @param clientSecret Client secret of application
     */
    public void setOAuthTokenResponse(OAuthTokenResponse token, Date tokenReceived, String clientId, String clientSecret) {
        this.token = token;
        this.tokenReceived = tokenReceived;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Get the active OAuth token
     *
     * @return Token object stored in client
     */
    public OAuthTokenResponse getToken() {
        return token;
    }

    /**
     * Get the time at which the OAuth token was received.
     *
     * @return Date token received
     */
    public Date getTokenReceived() {
        return tokenReceived;
    }

    /**
     * Set an access code received from an OAuth request.
     *
     * @param code Code returned from server
     * @param clientId Client id of application
     * @param clientSecret Client secret of application
     * @param redirectURI URI to redirect to after authentication
     * @throws com.onshape.api.exceptions.OnshapeException On HTTP or
     * serialization error.
     */
    public void setOAuthAccessCode(String code, String clientId, String clientSecret, String redirectURI) throws OnshapeException {
        WebTarget target = client.target("https://oauth.onshape.com/oauth/token");
        MultivaluedMap<String, String> formData = new MultivaluedHashMap<>();
        formData.add("grant_type", "authorization_code");
        formData.add("code", code);
        formData.add("client_id", clientId);
        formData.add("client_secret", clientSecret);
        formData.add("redirect_uri", redirectURI);
        Response response = target.request().post(Entity.form(formData));
        switch (response.getStatusInfo().getFamily()) {
            case SUCCESSFUL:
                setOAuthTokenResponse(response.readEntity(OAuthTokenResponse.class), new Date(), clientId, clientSecret);
                return;
            default:
                throw new OnshapeException(response.getStatusInfo().getReasonPhrase());
        }
    }

    void refreshOAuthToken() throws OnshapeException {
        WebTarget target = client.target(oauthURL);
        MultivaluedMap<String, String> formData = new MultivaluedHashMap<>();
        formData.add("grant_type", "refresh_token");
        formData.add("refresh_token", token.getRefreshToken());
        formData.add("client_id", clientId);
        formData.add("client_secret", clientSecret);
        Response response = target.request().post(Entity.form(formData));
        switch (response.getStatusInfo().getFamily()) {
            case SUCCESSFUL:
                setOAuthTokenResponse(response.readEntity(OAuthTokenResponse.class), new Date(), clientId, clientSecret);
                return;
            default:
                throw new OnshapeException(response.getStatusInfo().getReasonPhrase());
        }
    }

    /**
     * Gets the directory that saved files will be stored in
     *
     * @return Working directory
     */
    public File getWorkingDir() {
        return workingDir;
    }

    /**
     * Sets the directory that saved files will be stored in
     *
     * @param workingDir Working directory
     */
    public void setWorkingDir(File workingDir) {
        this.workingDir = workingDir;
    }

    /**
     * Performs the HTTP call and transforms the result to the required class.
     *
     * @param <T> Return type
     * @param method HTTP method
     * @param url URL
     * @param payload Payload object for POST/PUT calls
     * @param urlParameters Map of path parameters
     * @param queryParameters Map of query parameters
     * @param type Return type
     * @return Response object
     * @throws com.onshape.api.exceptions.OnshapeException On HTTP or
     * serialization error.
     */
    public final <T> T call(String method, String url, Object payload, Map<String, Object> urlParameters, Map<String, Object> queryParameters, Class<T> type) throws OnshapeException {
        // Determine if the response type should be binary or JSON
        boolean jsonResponse = true;
        if (File.class.equals(type) || Blob.class.equals(type)) {
            jsonResponse = false;
        } else {
            for (Field field : type.getDeclaredFields()) {
                if (File.class.equals(field.getType()) || Blob.class.equals(field.getType())) {
                    jsonResponse = false;
                }
            }
        }
        // Call the HTTP method
        Response response = call(method, url, payload, urlParameters, queryParameters, jsonResponse);
        // Return the raw stream and headers if requested
        if (InputStreamWithHeaders.class.equals(type)) {
            return type.cast(new InputStreamWithHeaders((InputStream) response.getEntity(), response.getHeaders()));
        }
        // Deserialize the response
        if (response.getMediaType() == null) {
            if (type.getDeclaredFields().length == 0) {
                try {
                    // Response type is just an empty object, create one
                    return type.newInstance();
                } catch (IllegalAccessException | InstantiationException ex) {
                    throw new OnshapeException("Failed to create response object");
                }
            }
            throw new OnshapeException("No entity in response");
        }
        if (IS_JSON_MEDIA_TYPE.test(response.getMediaType().toString())) {
            // Special case: Return a String
            if (String.class.equals(type)) {
                return type.cast(response.readEntity(String.class));
            }
            // Get the Content-Length value
            Optional<Integer> contentLength = Optional.ofNullable(response.getHeaderString("Content-Length"))
                    .filter(cL -> cL.matches("[0-9]+")).map(cL -> Integer.valueOf(cL));
            // Special case: If Content-Length is 0
            if (contentLength.isPresent() && contentLength.get() == 0) {
                if (type.getDeclaredFields().length == 0) {
                    try {
                        // Response type is just an empty object, create one
                        return type.newInstance();
                    } catch (IllegalAccessException | InstantiationException ex) {
                        throw new OnshapeException("Failed to create response object");
                    }
                }
                throw new OnshapeException("No entity in response");
            }
            try {
                // Special case: If it is an array, and the response type has a single array field, then read that
                InputStream inputStream = new JsonObjectOrArrayInputStream(type, response.readEntity(InputStream.class));
                return objectMapper.readValue(inputStream, type);
            } catch (IOException | SecurityException ex) {
                throw new OnshapeException("Error while deserializing response", ex);
            }
        } else {
            String ext = response.getMediaType().getSubtype();
            try (InputStream input = "gzip".equals(response.getHeaderString("Content-Encoding"))
                    ? new GZIPInputStream((InputStream) response.getEntity())
                    : (InputStream) response.getEntity()) {
                if (File.class.equals(type)) {
                    try {
                        File f = File.createTempFile("onshape", "." + ext, workingDir);
                        try (FileOutputStream fos = new FileOutputStream(f)) {
                            int n;
                            byte[] buffer = new byte[1024];
                            while ((n = input.read(buffer)) > -1) {
                                fos.write(buffer, 0, n);
                            }
                            fos.flush();
                        }
                        return type.cast(f);
                    } catch (IOException ex) {
                        throw new OnshapeException("Error while copying to local file", ex);
                    }
                } else if (InputStream.class.isAssignableFrom(type)) {
                    return type.cast(input);
                } else if (type.getDeclaredFields().length == 1) {
                    if (File.class.equals(type.getDeclaredFields()[0].getType())) {
                        try {
                            File f = File.createTempFile("onshape", "." + ext, workingDir);
                            try (FileOutputStream fos = new FileOutputStream(f)) {
                                int n;
                                byte[] buffer = new byte[1024];
                                while ((n = input.read(buffer)) > -1) {
                                    fos.write(buffer, 0, n);
                                }
                                fos.flush();
                            }
                            Constructor<T> constructor = type.getDeclaredConstructor();
                            constructor.setAccessible(true);
                            T out = constructor.newInstance();
                            Field field = type.getDeclaredFields()[0];
                            field.setAccessible(true);
                            field.set(out, f);
                            return out;
                        } catch (IOException | IllegalArgumentException | IllegalAccessException
                                | InstantiationException | InvocationTargetException
                                | NoSuchMethodException | SecurityException ex) {
                            throw new OnshapeException("Error while copying to local file", ex);
                        }
                    } else if (Blob.class.equals(type.getDeclaredFields()[0].getType())) {
                        try {
                            Blob blob = new Blob(input, response.getHeaderString("Content-Disposition"));
                            Constructor<T> constructor = type.getDeclaredConstructor();
                            constructor.setAccessible(true);
                            T out = constructor.newInstance();
                            Field field = type.getDeclaredFields()[0];
                            field.setAccessible(true);
                            field.set(out, blob);
                            return out;
                        } catch (IOException | IllegalArgumentException | IllegalAccessException
                                | InstantiationException | InvocationTargetException
                                | NoSuchMethodException | SecurityException ex) {
                            throw new OnshapeException("Error while creating blob", ex);
                        }
                    }
                }
            } catch (IOException ex) {
                throw new OnshapeException("Error while decompressing gzip stream", ex);
            }
        }
        throw new OnshapeException("Unable to convert media-type " + response.getMediaType() + " to type " + type);
    }

    /**
     * Shortcut for GET of specific URL
     *
     * @param <T> Return type
     * @param url URL
     * @param type Return type
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final <T> T get(String url, Class<T> type) throws OnshapeException {
        return call("get", url, null, buildMap(), buildMap(), type);
    }

    Response call(String method, String url, Object payload, Map<String, Object> urlParameters, Map<String, Object> queryParameters, boolean jsonResponse) throws OnshapeException {
        // Construct the URI from the parameters
        URI uri = buildURI(url, urlParameters, queryParameters);
        // Create a WebTarget for the URI
        WebTarget target = client.target(uri).property(ClientProperties.FOLLOW_REDIRECTS, Boolean.FALSE);
        Invocation.Builder invocationBuilder = target.request(jsonResponse ? JSON_MEDIA_TYPES : BINARY_MEDIA_TYPES);
        // Accept gzip compressed responses
        invocationBuilder.header("Accept-Encoding", "gzip");
        // Set the content-type and build the entity
        Entity entity;
        switch (method.toUpperCase()) {
            case "GET":
            case "HEAD":
            case "DELETE":
                invocationBuilder.header("Content-Type", MediaType.APPLICATION_JSON);
                entity = null;
                break;
            default:
                entity = createEntity(payload, invocationBuilder);
        }
        // Add authentication headers, via either OAuth or API keys
        if (token != null) {
            if ((new Date().getTime() - tokenReceived.getTime()) / 1000 > token.getExpiresIn() * 0.9) {
                try {
                    refreshOAuthToken();
                } catch (OnshapeException ex) {
                    throw new OnshapeException("Error while refreshing access token", ex);
                }
            }
            invocationBuilder = invocationBuilder.header("Authorization", "Bearer " + token.getAccessToken());
        } else if (accessKey != null && secretKey != null) {
            invocationBuilder = signature(invocationBuilder, uri, method, entity == null ? MediaType.APPLICATION_JSON_TYPE : entity.getMediaType());
        }
        // Notify listeners
        List<ResponseListener> responseListeners = requestListeners.stream().map((rl) -> rl.request(method, uri, entity)).collect(Collectors.toList());
        // Perform the method call
        Response response = entity == null ? invocationBuilder.method(method.toUpperCase()) : invocationBuilder.method(method.toUpperCase(), entity);
        // Handle the response
        responseListeners.forEach((rl) -> rl.response(response));
        switch (response.getStatusInfo().getFamily()) {
            case SUCCESSFUL:
                return response;
            case REDIRECTION:
                return call(method, response.getHeaderString("Location"), payload, buildMap(), buildMap(), jsonResponse);
            default:
                // Attempt to read further details from the response from Onshape
                ErrorResponse errorResponse = null;
                try {
                    errorResponse = response.readEntity(ErrorResponse.class);
                } catch (Throwable ex) {
                }
                if (errorResponse != null && errorResponse.getMessage() != null
                        && !errorResponse.getMessage().isEmpty()) {
                    throw new OnshapeException(response.getStatusInfo().getStatusCode(), errorResponse.getMessage());
                }
                // Failed to deserialize an error message so just repond with the status code
                throw new OnshapeException(response.getStatusInfo().getStatusCode(), response.getStatusInfo().getReasonPhrase());
        }
    }

    /**
     * Convert payload object to an entity: either JSON or Multipart Form
     *
     * @param payload Payload (request) object
     * @param headers Map of headers
     * @return An Entity
     * @throws OnshapeException If fail to serialize successfully
     */
    Entity createEntity(Object payload, Invocation.Builder invocationBuilder) throws OnshapeException {
        MediaType mediaType;
        Field fileField = null;
        Field blobField = null;
        for (Field field : payload.getClass().getDeclaredFields()) {
            if (File.class.equals(field.getType())) {
                fileField = field;
            } else if (AbstractBlob.class.isAssignableFrom(field.getType())) {
                blobField = field;
            }
        }
        // If no File, then return JSON entity
        if (fileField == null && blobField == null) {
            mediaType = MediaType.APPLICATION_JSON_TYPE;
            invocationBuilder.header("Content-Type", mediaType.toString());
            return Entity.entity(payload, mediaType);
        }
        // Else create multipart entity
        FormDataMultiPart multipart = new FormDataMultiPart();
        try {
            for (Field field : payload.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("fileContentLength".equals(field.getName())) {
                    if (fileField != null) {
                        fileField.setAccessible(true);
                        multipart.field(field.getName(), Long.toString(((File) fileField.get(payload)).length()));
                    } else if (blobField != null) {
                        blobField.setAccessible(true);
                        multipart.field(field.getName(), Integer.toString(((AbstractBlob) blobField.get(payload)).getData().length));
                    }
                } else if (!field.equals(fileField) && !field.equals(blobField) && field.get(payload) != null) {
                    multipart.field(field.getName(), field.get(payload).toString());
                }
            }
            if (fileField != null) {
                fileField.setAccessible(true);
                multipart.bodyPart(new FileDataBodyPart("file", (File) fileField.get(payload), MediaType.WILDCARD_TYPE));
            } else if (blobField != null) {
                blobField.setAccessible(true);
                multipart.bodyPart(new FormDataBodyPart(
                        ((AbstractBlob) blobField.get(payload)).getFormDataContentDisposition("file"),
                        ((AbstractBlob) blobField.get(payload)).getData(), MediaType.WILDCARD_TYPE));
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new OnshapeException("Failed to convert payload to multipart form", ex);
        }
        // Add an XSRF header: Not currently required by Onshape APIs
        //addXSRFHeader(invocationBuilder);
        // Add a boundary subtype to the media-type, this will be used in the entity and signature (if using API keys)
        mediaType = Boundary.addBoundary(MediaType.MULTIPART_FORM_DATA_TYPE);
        invocationBuilder.header("Content-Type", mediaType.toString());
        return Entity.entity(multipart, mediaType);
    }

    /**
     * Add XSRF header to the request headers
     *
     * @param headers The request headers
     * @throws OnshapeException If an error occurs calling the method
     */
    void addXSRFHeader(Invocation.Builder invocationBuilder) throws OnshapeException {
        // Fetch the /api/clientinfo/xsrf method
        Response xsrfResponse = call("get", "/clientinfo/xsrf", null, buildMap(), buildMap(), true);
        XSRFResponse xsrfValues = xsrfResponse.readEntity(XSRFResponse.class);
        // Find the Set-Cookie header containing the token value
        String xsrfToken = null;
        for (Object setCookieHeader : xsrfResponse.getHeaders().get("Set-Cookie")) {
            if (setCookieHeader.toString().trim().startsWith(xsrfValues.getXsrfTokenName())) {
                xsrfToken = setCookieHeader.toString().trim().split(";")[0].replace(xsrfValues.getXsrfTokenName() + "=", "");
            }
        }
        // Add the XSRF header
        if (xsrfToken != null) {
            invocationBuilder.header(xsrfValues.getXsrfHeaderName(), xsrfToken);
        }
    }

    /**
     * Represents response from /api/clientinfo/xsrf method
     */
    static class XSRFResponse {

        @JsonProperty
        private String xsrfTokenName;
        @JsonProperty
        private String xsrfHeaderName;

        public String getXsrfTokenName() {
            return xsrfTokenName;
        }

        public String getXsrfHeaderName() {
            return xsrfHeaderName;
        }

    }

    /**
     * Utility method to construct a Map from a varargs array of Objects.
     *
     * @param objs Array of name-value pairs.
     * @return Map A map containing the names and values as keys and values.
     */
    public final Map<String, Object> buildMap(Object... objs) {
        Map<String, Object> out = new LinkedHashMap<>();
        for (int i = 0; i < objs.length; i += 2) {
            out.put(objs[i].toString(), objs[i + 1]);
        }
        return out;
    }

    URI buildURI(String path, Map<String, Object> urlParameters, Map<String, Object> queryParameters) throws OnshapeException {
        UriBuilder uriBuilder;
        if (path.startsWith("/")) {
            uriBuilder = UriBuilder.fromUri(baseURL + "/api" + path
                    .replaceAll(":([a-zA-Z][a-zA-Z0-9]*)", "{$1}")
                    .replace("[wvm]", "{wvmType}")
                    .replace("[wv]", "{wvType}")
                    .replace("[cu]", "{cuType}"));
        } else {
            uriBuilder = UriBuilder.fromUri(path
                    .replaceAll(":([a-zA-Z][a-zA-Z0-9]*)", "{$1}")
                    .replace("[wvm]", "{wvmType}")
                    .replace("[wv]", "{wvType}")
                    .replace("[cu]", "{cuType}"));
        }
        queryParameters.entrySet().stream().filter((queryParameter) -> (queryParameter.getValue() != null))
                .forEachOrdered((queryParameter) -> {
                    uriBuilder.replaceQueryParam(queryParameter.getKey(), queryParameter.getValue());
                });
        try {
            return uriBuilder.buildFromMap(urlParameters);
        } catch (IllegalArgumentException iae) {
            throw new OnshapeException("Path parameters missing in call to " + path, iae);
        }
    }

    private long count = 0L;

    Invocation.Builder signature(Invocation.Builder builder, URI uri, String method, MediaType mediaType) throws OnshapeException {
        String date = getDateString();
        String onNonce = hashids.encode(new Date().getTime(), count++);
        String path = uri.getRawPath();
        String query = uri.getRawQuery() == null ? "" : uri.getRawQuery();
        String str = (method + '\n' + onNonce + '\n' + date + '\n' + mediaType.toString() + '\n'
                + path + '\n' + query + '\n').toLowerCase();
        String auth = "On " + accessKey + ":HmacSHA256:" + encodeSignature(str);
        builder.header("Date", date);
        builder.header("On-Nonce", onNonce);
        builder.header("Authorization", auth);
        return builder;
    }

    String encodeSignature(String data) throws OnshapeException {
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            return Base64.getEncoder().encodeToString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
        } catch (NoSuchAlgorithmException | InvalidKeyException | UnsupportedEncodingException ex) {
            throw new OnshapeException("Error while encoding API signature", ex);
        }
    }

    String getDateString() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat.format(calendar.getTime());
    }

    /**
     * Serializes objects to pretty-printed JSON. Only to be used from generated
     * classes.
     *
     * @param obj The Request or Response object
     * @return String of pretty-printed JSON
     * @throws RuntimeException On serialization error
     */
    public static String toString(Object obj) {
        try {
            return TOSTRINGMAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Use javax.validation framework to validate request object before sending
     * to server.
     *
     * @param <T> Request object type
     * @param obj Request object
     * @throws OnshapeException If required fields are missing
     */
    public <T> void validate(T obj) throws OnshapeException {
        if (usingValidation) {
            ValidatorFactory factory = Validation.byDefaultProvider()
                    .configure().messageInterpolator(new ParameterMessageInterpolator())
                    .buildValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<T>> violations = validator.validate(obj);
            if (!violations.isEmpty()) {
                StringBuilder message = new StringBuilder("Validation of request object failed");
                violations.forEach((violation) -> message.append(", ")
                        .append(violation.getPropertyPath().toString())
                        .append(" ").append(violation.getMessage()));
                throw new OnshapeException(message.toString());
            }
        }
    }

    /**
     * Fetches utility object for polling GET requests via this client.
     *
     * @return PollingHandler instance
     */
    public PollingHandler getPollingHandler() {
        if (pollingHandler == null) {
            pollingHandler = new PollingHandler(this);
        }
        return pollingHandler;
    }

    /**
     * Add a listener to capture request and response for each HTTP call
     *
     * @param listener The RequestListener implementation
     */
    public void addRequestListener(RequestListener listener) {
        requestListeners.add(listener);
    }

    /**
     * Remove a listener
     *
     * @param listener The RequestListener implementation
     */
    public void removeRequestListener(RequestListener listener) {
        requestListeners.remove(listener);
    }

    /**
     * Listener interface for HTTP requests and their responses. The
     * RequestListener returns a new ResponseListener for each call, to ensure
     * that requests and responses are associated even from different threads.
     */
    public static interface RequestListener {

        /**
         * @param method HTTP method
         * @param uri The URI called, including path and query parameters
         * @param entity The Entity object used or null
         * @return A ResponseListener object to capture the response to this
         * HTTP call
         */
        public ResponseListener request(String method, URI uri, Entity entity);
    }

    /**
     * Listener for response objects, returned from a RequestListener
     */
    public static interface ResponseListener {

        /**
         * Called for each HTTP response (successful or not)
         *
         * @param response The HTTP response
         */
        public void response(Response response);
    }
}
