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
import com.onshape.api.responses.ProjectsGetProjectsResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getProjects API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ProjectsGetProjectsRequest {
  /**
   * The sort order by date created.
   */
  @JsonProperty("sortOrder")
  String sortOrder;

  /**
   * Page offset
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Page size, number of the items returned will not exceed this value
   */
  @JsonProperty("limit")
  Number limit;

  ProjectsGetProjectsRequest(String sortOrder, Number offset, Number limit) {
    this.sortOrder = sortOrder;
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
     * The sort order by date created.
     */
    private String sortOrder;

    /**
     * Page offset
     */
    private Number offset;

    /**
     * Page size, number of the items returned will not exceed this value
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The sort order by date created.
     *
     * @return The sort order by date created.
     *
     */
    public final String sortOrder() {
      return this.sortOrder;
    }

    /**
     * Set The sort order by date created.
     *
     * @param value The sort order by date created.
     *
     * @return the Builder object.
     */
    public final Builder sortOrder(String value) {
      this.sortOrder = value;
      return this;
    }

    /**
     * Get Page offset
     *
     * @return Page offset
     *
     */
    public final Number offset() {
      return this.offset;
    }

    /**
     * Set Page offset
     *
     * @param value Page offset
     *
     * @return the Builder object.
     */
    public final Builder offset(Number value) {
      this.offset = value;
      return this;
    }

    /**
     * Get Page size, number of the items returned will not exceed this value
     *
     * @return Page size, number of the items returned will not exceed this value
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Page size, number of the items returned will not exceed this value
     *
     * @param value Page size, number of the items returned will not exceed this value
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private ProjectsGetProjectsRequest build() {
      return new com.onshape.api.requests.ProjectsGetProjectsRequest(sortOrder,offset,limit);
    }

    /**
     * Calls getProjects method, Returns info about all the projects defined in the session's enterprise company. Enterprise only.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ProjectsGetProjectsResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/projects", build(), onshape.buildMap(), onshape.buildMap("sortOrder", sortOrder, "offset", offset, "limit", limit), com.onshape.api.responses.ProjectsGetProjectsResponse.class);
    }
  }
}
