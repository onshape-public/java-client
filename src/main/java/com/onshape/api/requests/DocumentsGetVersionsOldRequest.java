// The MIT License (MIT)
//
// Copyright (c) 2018 - Present Onshape Inc. 
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.DocumentsGetVersionsOldResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getVersionsOld API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsGetVersionsOldRequest {
  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
   */
  @JsonProperty("limit")
  Number limit;

  DocumentsGetVersionsOldRequest(Number offset, Number limit) {
    this.offset = offset;
    this.limit = limit;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Where to begin search results
     *
     * @return Where to begin search results
     *
     */
    public final Number offset() {
      return this.offset;
    }

    /**
     * Set Where to begin search results
     *
     * @param value Where to begin search results
     *
     * @return the Builder object.
     */
    public final Builder offset(Number value) {
      this.offset = value;
      return this;
    }

    /**
     * Get Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
     *
     * @return Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
     *
     * @param value Number of results to return per page. When specified, it cannot exceed 20. Default is unlimited
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private DocumentsGetVersionsOldRequest build() {
      return new com.onshape.api.requests.DocumentsGetVersionsOldRequest(offset,limit);
    }

    /**
     * Calls getVersionsOld method, Get all document versions
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsGetVersionsOldResponse call() throws OnshapeException {
      return onshape.call("get", "/documents/:did/versions", build(), onshape.buildMap(), onshape.buildMap("offset", offset, "limit", limit), com.onshape.api.responses.DocumentsGetVersionsOldResponse.class);
    }

    /**
     * Calls getVersionsOld method, Get all document versions
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsGetVersionsOldResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/documents/:did/versions", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.DocumentsGetVersionsOldResponse.class);
    }
  }
}
