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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.onshape.api.exceptions.OnshapeException;
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
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
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
import org.hashids.Hashids;

/**
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class BaseClient {

    private final String baseURL = "https://cad.onshape.com/api";
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
        client = ClientBuilder.newClient(new ClientConfig(jacksonProvider));
        workingDir = new File(System.getProperty("java.io.tmpdir"));
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
        Response response = call(method, url, payload, urlParameters, queryParameters);
        if (response.getMediaType().toString().startsWith(MediaType.APPLICATION_JSON)) {
            String stringEntity = response.readEntity(String.class);
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
                try {
                    File f = File.createTempFile("onshape", "." + ext, workingDir);
                    InputStream input = (InputStream) response.getEntity();
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
            } else if (type.getDeclaredFields().length == 1 && "file".equals(type.getDeclaredFields()[0].getName()) && File.class.equals(type.getDeclaredFields()[0].getType())) {
                try {
                    File f = File.createTempFile("onshape", "." + ext, workingDir);
                    InputStream input = (InputStream) response.getEntity();
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

    Response call(String method, String url, Object payload, Map<String, Object> urlParameters, Map<String, Object> queryParameters) throws OnshapeException {
        // Construct the URI from the parameters
        URI uri = buildURI(url, urlParameters, queryParameters);
        // Create a WebTarget for the URI
        WebTarget target = client.target(uri);
        Response response;
        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE)
                .header("Accept", "application/vnd.onshape.v1+json")
                .header("Content-Type", "application/json");
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
            invocationBuilder = signature(invocationBuilder, uri, method);
        }
        response = invocationBuilder.method(method.toUpperCase(),
                Entity.entity("GET".equals(method.toUpperCase()) ? null : payload, MediaType.APPLICATION_JSON_TYPE));
        switch (response.getStatusInfo().getFamily()) {
            case SUCCESSFUL:
                return response;
            case REDIRECTION:
                return call(method, response.getHeaderString("Location"), payload, urlParameters, queryParameters);
            default:
                throw new OnshapeException(response.getStatusInfo().getReasonPhrase());
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

    URI buildURI(String path, Map<String, Object> urlParameters, Map<String, Object> queryParameters) {
        UriBuilder uriBuilder;
        if (path.startsWith("/")) {
            uriBuilder = UriBuilder.fromUri(baseURL + path
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
        return uriBuilder.buildFromMap(urlParameters);
    }

    private long count = 0L;

    Invocation.Builder signature(Invocation.Builder builder, URI uri, String method) throws OnshapeException {
        String date = getDateString();
        String onNonce = hashids.encode(new Date().getTime(), count++);
        String path = uri.getPath();
        String query = uri.getQuery() == null ? "" : uri.getQuery();
        String str = (method + '\n' + onNonce + '\n' + date + '\n' + "application/json" + '\n'
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
}
