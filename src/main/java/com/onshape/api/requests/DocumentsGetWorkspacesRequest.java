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
import com.onshape.api.responses.DocumentsGetWorkspacesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getWorkspaces API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsGetWorkspacesRequest {
  /**
   * Do not return read-only workspaces
   */
  @JsonProperty("noreadonly")
  String noreadonly;

  DocumentsGetWorkspacesRequest(String noreadonly) {
    this.noreadonly = noreadonly;
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
     * Do not return read-only workspaces
     */
    private String noreadonly;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Do not return read-only workspaces
     *
     * @return Do not return read-only workspaces
     *
     */
    public final String noreadonly() {
      return this.noreadonly;
    }

    /**
     * Set Do not return read-only workspaces
     *
     * @param value Do not return read-only workspaces
     *
     * @return the Builder object.
     */
    public final Builder noreadonly(String value) {
      this.noreadonly = value;
      return this;
    }

    private DocumentsGetWorkspacesRequest build() {
      return new com.onshape.api.requests.DocumentsGetWorkspacesRequest(noreadonly);
    }

    /**
     * Calls getWorkspaces method, List workspaces in document
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     */
    public final DocumentsGetWorkspacesResponse call(String did) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/workspaces", build(), onshape.buildMap("did", did), onshape.buildMap("noreadonly", noreadonly), com.onshape.api.responses.DocumentsGetWorkspacesResponse.class);
    }

    /**
     * Calls getWorkspaces method, List workspaces in document
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsGetWorkspacesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/workspaces", build(), onshape.buildMap("did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsGetWorkspacesResponse.class);
    }
  }
}
