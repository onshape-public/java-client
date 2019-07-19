/*
 * The MIT License
 *
 * Copyright 2019 Onshape Inc.
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
package com.onshape.api.types;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Captures the InputStream from a response, together with the response headers
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class InputStreamWithHeaders {

    private final InputStream inputStream;
    private final MultivaluedMap<String, Object> headers;

    public InputStreamWithHeaders(InputStream inputStream, MultivaluedMap<String, Object> headers) {
        this.inputStream = inputStream;
        this.headers = headers;
    }

    /**
     * Returns the InputStream as received, which may or may not be gzip
     * compressed.
     *
     * @return InputStream matching the Content-Type and Content-Encoding
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Returns an InputStream, decompressing the raw InputStream if it had been
     * gzip compressed.
     *
     * @return InputStream matching the Content-Type
     * @throws java.io.IOException On error during decompression
     */
    public InputStream getDecompressedInputStream() throws IOException {
        return "gzip".equals(getContentEncoding())
                ? new GZIPInputStream(inputStream)
                : inputStream;
    }

    /**
     * Get the headers returned from Onshape
     *
     * @return MultivaluedMap of headers
     */
    public MultivaluedMap<String, Object> getHeaders() {
        return headers;
    }

    /**
     * Get the value of a particular header
     *
     * @param header The name of the header of interest
     * @return null if the header is not defined, an empty String if it is
     * empty, or a String joining each header value with ','
     */
    public String getHeaderString(String header) {
        List<Object> headerObjects = headers.get(header);
        if (headerObjects == null) {
            return null;
        }
        if (headerObjects.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(headerObjects.get(0).toString());
        headerObjects.listIterator(1).forEachRemaining((obj) -> sb.append(',').append(obj.toString()));
        return sb.toString();
    }

    /**
     * Get the Content-Type of the returned InputStream
     *
     * @return A String of the Content-Type, or null if it is not defined
     */
    public String getContentType() {
        return getHeaderString("Content-Type");
    }

    /**
     * Get the Content-Encoding of the returned InputStream
     *
     * @return A String of the Content-Encoding, or null if it is not defined
     */
    public String getContentEncoding() {
        return getHeaderString("Content-Encoding");
    }

}
