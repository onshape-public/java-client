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
package com.onshape.api.exceptions;

/**
 * Exception thrown by the Onshape client.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class OnshapeException extends Exception {

    private final int statusCode;

    public OnshapeException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public OnshapeException(String message) {
        super(message);
        this.statusCode = 0;
    }

    public OnshapeException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = 0;
    }

    /**
     * Returns true if this, or the initial exception thrown that caused this,
     * is due to an HTTP error and therefore has an HTTP status code.
     *
     * @return true if caused by HTTP error
     */
    public boolean isHTTPError() {
        return statusCode != 0
                || (getCause() instanceof OnshapeException)
                && ((OnshapeException) getCause()).isHTTPError();
    }

    /**
     * Returns the status code of the HTTP error that caused this exception, or
     * 0 if it is not caused by an HTTP error.
     *
     * @return HTTP status code or 0
     */
    @SuppressWarnings("ThrowableResultIgnored")
    public int getStatusCode() {
        return ((getCause() instanceof OnshapeException)
                && ((OnshapeException) getCause()).isHTTPError())
                ? ((OnshapeException) getCause()).getStatusCode()
                : statusCode;
    }
}
