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
package com.onshape.api.desktop;

import com.onshape.api.base.BaseClient;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.OAuthTokenResponse;
import fi.iki.elonen.NanoHTTPD;
import java.awt.Desktop;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Utility class for desktop based applications to launch Onshape client.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class OnshapeDesktop {

    private final String clientId;
    private final String clientSecret;
    private final int port;
    private static Server server;

    /**
     * Creates a new instance with given application id.
     *
     * @param clientId Client ID of application.
     * @param clientSecret Client secret of application.
     */
    public OnshapeDesktop(String clientId, String clientSecret) {
        this(clientId, clientSecret, 6789);
    }

    /**
     * Creates a new instance with given application id and port.
     *
     * @param clientId Client ID of application.
     * @param clientSecret Client secret of application.
     * @param port Network port to use for HTTP server.
     */
    public OnshapeDesktop(String clientId, String clientSecret, int port) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.port = port;
    }

    /**
     * Launches browser-based login and sets credentials on the given Onshape
     * client instance.
     *
     * @param client An Onshape API client instance.
     * @throws OnshapeException On HTTP, authentication, or serialization,
     * error.
     */
    public void setupClient(BaseClient client) throws OnshapeException {
        client.setOAuthAccessCode(getAccessCodeFromBrowser(), clientId, clientSecret, "http://localhost:" + Integer.toString(port));
    }

    /**
     * Applies previously obtained OAuth token to the given Onshape client
     * instance.
     *
     * @param client An Onshape API client instance.
     * @param token An OAuth token previously obtained.
     * @param tokenReceived The time at which the token was obtained.
     */
    public void setupClient(BaseClient client, OAuthTokenResponse token, Date tokenReceived) {
        client.setOAuthTokenResponse(token, tokenReceived, clientId, clientSecret);
    }

    private String getAccessCodeFromBrowser() throws OnshapeException {
        if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                final BlockingQueue<String> responseQueue = new ArrayBlockingQueue<>(1);
                // server is static so that we can kill it if we call it multiple times
                // if we kill it after fetching the code, we fail to send the page to the browser
                if (server != null) {
                    server.stop();
                    server = null;
                }
                server = new Server(responseQueue, port, "code");
                Desktop.getDesktop().browse(new URI("https://oauth.onshape.com/oauth/authorize?response_type=code&client_id=" + URLEncoder.encode(clientId, "UTF-8")));
                return responseQueue.take();
            } catch (IOException | URISyntaxException | InterruptedException ex) {
                throw new OnshapeException("", ex);
            }
        }
        throw new OnshapeException("Could not access browser to launch sign in page");
    }

    private static class Server extends NanoHTTPD {

        private final BlockingQueue<String> responseQueue;
        private final String responseParam;

        Server(BlockingQueue<String> responseQueue, int port, String responseParam) throws IOException {
            super(port);
            this.responseQueue = responseQueue;
            this.responseParam = responseParam;
            start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        }

        @Override
        public Response serve(IHTTPSession session) {
            try {
                return newFixedLengthResponse("<html><body><script>window.close()</script></body></html>\n");
            } finally {
                responseQueue.offer(getResponse(session.getQueryParameterString()));
            }
        }

        public String getResponse(String query) {
            return splitQuery(query).get(responseParam);
        }

        public Map<String, String> splitQuery(String query) {
            Map<String, String> query_pairs = new LinkedHashMap<>();
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                try {
                    query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
                } catch (UnsupportedEncodingException ex) {
                }
            }
            return query_pairs;
        }
    }
}
