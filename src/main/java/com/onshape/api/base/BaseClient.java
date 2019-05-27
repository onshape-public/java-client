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
import com.onshape.api.types.Blob;
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
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
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
import org.glassfish.jersey.media.multipart.Boundary;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.hashids.Hashids;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

/**
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class BaseClient {

    private String baseURL = "https://cad.onshape.com";
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
    private static final ObjectMapper TOSTRINGMAPPER;

    static {
        TOSTRINGMAPPER = new ObjectMapper();
        TOSTRINGMAPPER.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public BaseClient() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        JacksonJaxbJsonProvider jacksonProvider = new JacksonJaxbJsonProvider();
        jacksonProvider.setMapper(objectMapper);
        ClientConfig clientConfig = new ClientConfig(jacksonProvider);
        clientConfig.register(MultiPartFeature.class);
        clientConfig.register(new CompressionReaderInterceptor());
        client = ClientBuilder.newClient(clientConfig);
        workingDir = new File(System.getProperty("java.io.tmpdir"));
        usingValidation = true;
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
        WebTarget target = client.target("https://oauth.onshape.com/oauth/token");
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
        if (response.getMediaType().toString().startsWith(MediaType.APPLICATION_JSON)) {
            String stringEntity = response.readEntity(String.class);
            // Special case: Return a String
            if(String.class.equals(type)) {
                return type.cast(stringEntity);
            }
            // Special case: If it is an array, and the response type has a single array field, then read that
            try {
                if (stringEntity.startsWith("[") && type.getDeclaredFields().length == 1 && type.getDeclaredFields()[0].getType().isArray()) {
                    String fieldName = type.getDeclaredFields()[0].getName();
                    return objectMapper.readValue("{ \"" + fieldName + "\" : " + stringEntity + " }", type);
                } else {
                    return objectMapper.readValue(stringEntity, type);
                }
            } catch (IOException | SecurityException ex) {
                throw new OnshapeException("Error while deserializing response, response was\n" + stringEntity, ex);
            }
        } else {
            String ext = response.getMediaType().getSubtype();
            if (File.class.equals(type)) {
                try (InputStream input = (InputStream) response.getEntity()) {
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
            } else if (type.getDeclaredFields().length == 1) {
                if (File.class.equals(type.getDeclaredFields()[0].getType())) {
                    try (InputStream input = (InputStream) response.getEntity()) {
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
                        Blob blob = new Blob((InputStream) response.getEntity());
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
        WebTarget target = client.target(uri);
        Invocation.Builder invocationBuilder = target.request(jsonResponse ? MediaType.APPLICATION_JSON_TYPE : MediaType.APPLICATION_OCTET_STREAM_TYPE)
                .header("Accept", jsonResponse ? "application/vnd.onshape.v1+json" : "application/vnd.onshape.v1+octet-stream");
        // Accept gzip compressed responses
        invocationBuilder.header("Accept-Encoding", "gzip");
        // Set the content-type and build the entity
        Entity entity;
        switch (method.toUpperCase()) {
            case "GET":
            case "HEAD":
            case "DELETE":
                invocationBuilder.header("Content-Type", MediaType.APPLICATION_JSON_TYPE.toString());
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
        // Perform the method call
        Response response = entity == null ? invocationBuilder.method(method.toUpperCase()) : invocationBuilder.method(method.toUpperCase(), entity);
        // Handle the response
        switch (response.getStatusInfo().getFamily()) {
            case SUCCESSFUL:
                return response;
            case REDIRECTION:
                return call(method, response.getHeaderString("Location"), payload, urlParameters, queryParameters, jsonResponse);
            default:
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
        for (Field field : payload.getClass().getDeclaredFields()) {
            if (File.class.equals(field.getType())) {
                fileField = field;
            }
        }
        // If no File, then return JSON entity
        if (fileField == null) {
            mediaType = MediaType.APPLICATION_JSON_TYPE;
            invocationBuilder.header("Content-Type", mediaType.toString());
            return Entity.entity(payload, mediaType);
        }
        // Else create multipart entity        
        FormDataMultiPart multipart = new FormDataMultiPart();
        try {
            for (Field field : payload.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (!fileField.equals(field) && field.get(payload) != null) {
                    multipart.field(field.getName(), field.get(payload).toString());
                }
            }
            fileField.setAccessible(true);
            multipart.bodyPart(new FileDataBodyPart("file", (File) fileField.get(payload), MediaType.WILDCARD_TYPE));
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
                    .replaceAll(":([^\\/:]+)", "{$1}")
                    .replace("[wvm]", "{wvmType}")
                    .replace("[wv]", "{wvType}")
                    .replace("[cu]", "{cuType}"));
        } else {
            uriBuilder = UriBuilder.fromUri(path
                    .replaceAll(":([^\\/:]+)", "{$1}")
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
        String path = uri.getPath();
        String query = uri.getQuery() == null ? "" : uri.getQuery();
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
     * @throws RuntimeException On serialization error
     * @return String of pretty-printed JSON
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
                violations.forEach((violation) -> message.append(", ").append(violation.getMessage()));
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
}
