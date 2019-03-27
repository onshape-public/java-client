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
import com.onshape.api.responses.DocumentsRestoreMicroversionResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for restoreMicroversion API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsRestoreMicroversionRequest {
  /**
   * The document in which to restore a microversion
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * The microversion to restore to.
   */
  @JsonProperty("mvId")
  @NotNull
  String mvId;

  /**
   * The workspace in which to restore
   */
  @JsonProperty("workspaceId")
  @NotNull
  String workspaceId;

  DocumentsRestoreMicroversionRequest(String documentId, String mvId, String workspaceId) {
    this.documentId = documentId;
    this.mvId = mvId;
    this.workspaceId = workspaceId;
  }

  /**
   * Get The document in which to restore a microversion
   *
   * @return The document in which to restore a microversion
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The microversion to restore to.
   *
   * @return The microversion to restore to.
   *
   */
  public final String getMvId() {
    return this.mvId;
  }

  /**
   * Get The workspace in which to restore
   *
   * @return The workspace in which to restore
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
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
     * The document in which to restore a microversion
     */
    private String documentId;

    /**
     * The microversion to restore to.
     */
    private String mvId;

    /**
     * The workspace in which to restore
     */
    private String workspaceId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The document in which to restore a microversion
     *
     * @return The document in which to restore a microversion
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set The document in which to restore a microversion
     *
     * @param value The document in which to restore a microversion
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get The microversion to restore to.
     *
     * @return The microversion to restore to.
     *
     */
    public final String mvId() {
      return this.mvId;
    }

    /**
     * Set The microversion to restore to.
     *
     * @param value The microversion to restore to.
     *
     * @return the Builder object.
     */
    public final Builder mvId(String value) {
      this.mvId = value;
      return this;
    }

    /**
     * Get The workspace in which to restore
     *
     * @return The workspace in which to restore
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set The workspace in which to restore
     *
     * @param value The workspace in which to restore
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    private DocumentsRestoreMicroversionRequest build() {
      return new com.onshape.api.requests.DocumentsRestoreMicroversionRequest(documentId,mvId,workspaceId);
    }

    /**
     * Calls restoreMicroversion method, Restores document to an old microversion in its history.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param mvid Microversion ID
     */
    public final DocumentsRestoreMicroversionResponse call(String did, String wid, String mvid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did/workspaces/:wid/restore/:mvid", build(), onshape.buildMap("did", did, "wid", wid, "mvid", mvid), onshape.buildMap(), com.onshape.api.responses.DocumentsRestoreMicroversionResponse.class);
    }

    /**
     * Calls restoreMicroversion method, Restores document to an old microversion in its history.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param mvid Microversion ID
     */
    public final DocumentsRestoreMicroversionResponse call(OnshapeDocument document, String mvid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did/workspaces/:wid/restore/:mvid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "mvid", mvid), onshape.buildMap(), com.onshape.api.responses.DocumentsRestoreMicroversionResponse.class);
    }
  }
}
