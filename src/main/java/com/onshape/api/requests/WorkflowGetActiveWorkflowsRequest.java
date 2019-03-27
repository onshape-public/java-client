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
import com.onshape.api.responses.WorkflowGetActiveWorkflowsResponse;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getActiveWorkflows API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class WorkflowGetActiveWorkflowsRequest {
  /**
   * Document ID that is owned by company for which workflow info is requested.
   */
  @JsonProperty("documentId")
  String documentId;

  /**
   * Whether to include the full workflow json
   */
  @JsonProperty("full")
  Boolean full;

  WorkflowGetActiveWorkflowsRequest(String documentId, Boolean full) {
    this.documentId = documentId;
    this.full = full;
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
     * Document ID that is owned by company for which workflow info is requested.
     */
    private String documentId;

    /**
     * Whether to include the full workflow json
     */
    private Boolean full;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Document ID that is owned by company for which workflow info is requested.
     *
     * @return Document ID that is owned by company for which workflow info is requested.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set Document ID that is owned by company for which workflow info is requested.
     *
     * @param value Document ID that is owned by company for which workflow info is requested.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Whether to include the full workflow json
     *
     * @return Whether to include the full workflow json
     *
     */
    public final Boolean full() {
      return this.full;
    }

    /**
     * Set Whether to include the full workflow json
     *
     * @param value Whether to include the full workflow json
     *
     * @return the Builder object.
     */
    public final Builder full(Boolean value) {
      this.full = value;
      return this;
    }

    private WorkflowGetActiveWorkflowsRequest build() {
      return new com.onshape.api.requests.WorkflowGetActiveWorkflowsRequest(documentId,full);
    }

    /**
     * Calls getActiveWorkflows method, Get active workflows for the logged-in user's company, optionally specific to a document
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final WorkflowGetActiveWorkflowsResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/workflow/active", build(), onshape.buildMap(), onshape.buildMap("documentId", documentId, "full", full), com.onshape.api.responses.WorkflowGetActiveWorkflowsResponse.class);
    }
  }
}
