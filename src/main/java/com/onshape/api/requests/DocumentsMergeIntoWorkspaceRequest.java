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
import com.onshape.api.responses.DocumentsMergeIntoWorkspaceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for mergeIntoWorkspace API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsMergeIntoWorkspaceRequest {
  /**
   * The type, either workspace or version.
   */
  @JsonProperty("type")
  @NotNull
  String type;

  /**
   * the id.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  DocumentsMergeIntoWorkspaceRequest(String type, String id) {
    this.type = type;
    this.id = id;
  }

  /**
   * Get The type, either workspace or version.
   *
   * @return The type, either workspace or version.
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get the id.
   *
   * @return the id.
   *
   */
  public final String getId() {
    return this.id;
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
     * The type, either workspace or version.
     */
    private String type;

    /**
     * the id.
     */
    private String id;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The type, either workspace or version.
     *
     * @return The type, either workspace or version.
     *
     */
    public final String type() {
      return this.type;
    }

    /**
     * Set The type, either workspace or version.
     *
     * @param value The type, either workspace or version.
     *
     * @return the Builder object.
     */
    public final Builder type(String value) {
      this.type = value;
      return this;
    }

    /**
     * Get the id.
     *
     * @return the id.
     *
     */
    public final String id() {
      return this.id;
    }

    /**
     * Set the id.
     *
     * @param value the id.
     *
     * @return the Builder object.
     */
    public final Builder id(String value) {
      this.id = value;
      return this;
    }

    private DocumentsMergeIntoWorkspaceRequest build() {
      return new com.onshape.api.requests.DocumentsMergeIntoWorkspaceRequest(type,id);
    }

    /**
     * Calls mergeIntoWorkspace method, Merge a version or workspace into another
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final DocumentsMergeIntoWorkspaceResponse call(String did, String wid) throws
        OnshapeException {
      return onshape.call("post", "/documents/:did/workspaces/:wid/merge", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsMergeIntoWorkspaceResponse.class);
    }

    /**
     * Calls mergeIntoWorkspace method, Merge a version or workspace into another
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final DocumentsMergeIntoWorkspaceResponse call(OnshapeDocument document, String wid)
        throws OnshapeException {
      return onshape.call("post", "/documents/:did/workspaces/:wid/merge", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsMergeIntoWorkspaceResponse.class);
    }
  }
}
