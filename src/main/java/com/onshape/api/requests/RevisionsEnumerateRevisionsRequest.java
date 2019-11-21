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
import com.onshape.api.responses.RevisionsEnumerateRevisionsResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for enumerateRevisions API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class RevisionsEnumerateRevisionsRequest {
  /**
   * Number of results to return per page (max is 100)
   */
  @JsonProperty("limit")
  Number limit;

  /**
   * Only find the latest revisions of each part number
   */
  @JsonProperty("latestOnly")
  Boolean latestOnly;

  /**
   * An ISO-8601 UTC time string to find revisions since this instant
   */
  @JsonProperty("after")
  String after;

  RevisionsEnumerateRevisionsRequest(Number limit, Boolean latestOnly, String after) {
    this.limit = limit;
    this.latestOnly = latestOnly;
    this.after = after;
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
     * Number of results to return per page (max is 100)
     */
    private Number limit;

    /**
     * Only find the latest revisions of each part number
     */
    private Boolean latestOnly;

    /**
     * An ISO-8601 UTC time string to find revisions since this instant
     */
    private String after;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Number of results to return per page (max is 100)
     *
     * @return Number of results to return per page (max is 100)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 100)
     *
     * @param value Number of results to return per page (max is 100)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    /**
     * Get Only find the latest revisions of each part number
     *
     * @return Only find the latest revisions of each part number
     *
     */
    public final Boolean latestOnly() {
      return this.latestOnly;
    }

    /**
     * Set Only find the latest revisions of each part number
     *
     * @param value Only find the latest revisions of each part number
     *
     * @return the Builder object.
     */
    public final Builder latestOnly(Boolean value) {
      this.latestOnly = value;
      return this;
    }

    /**
     * Get An ISO-8601 UTC time string to find revisions since this instant
     *
     * @return An ISO-8601 UTC time string to find revisions since this instant
     *
     */
    public final String after() {
      return this.after;
    }

    /**
     * Set An ISO-8601 UTC time string to find revisions since this instant
     *
     * @param value An ISO-8601 UTC time string to find revisions since this instant
     *
     * @return the Builder object.
     */
    public final Builder after(String value) {
      this.after = value;
      return this;
    }

    private RevisionsEnumerateRevisionsRequest build() {
      return new com.onshape.api.requests.RevisionsEnumerateRevisionsRequest(limit,latestOnly,after);
    }

    /**
     * Calls enumerateRevisions method, Enumerate all revisions released in a company. Returns a slice of the all revisions per API call
     *                 and to get the next set of results use the "next" URL from the response. Only company admins can
     *                 enumerate all revisions in a company.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Company Id
     *
     * @param elementType Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob (Default: null) */
    public final RevisionsEnumerateRevisionsResponse call(String cid, Number elementType) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/revisions/companies/:cid", build(), onshape.buildMap("cid", cid), onshape.buildMap("limit", limit, "latestOnly", latestOnly, "after", after, "elementType", elementType), com.onshape.api.responses.RevisionsEnumerateRevisionsResponse.class);
    }
  }
}
