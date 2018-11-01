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
import com.onshape.api.responses.PartStudiosComparePartStudioResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for comparePartStudio API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosComparePartStudioRequest {
  /**
   * Id of the Workspace to compare the Part Studio with
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Id of a Version to compare the Part Studio with
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Id of a document microversion to compare the Part Studio with
   */
  @JsonProperty("microversionId")
  Number microversionId;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  PartStudiosComparePartStudioRequest(String workspaceId, String versionId, Number microversionId,
      String linkDocumentId) {
    this.workspaceId = workspaceId;
    this.versionId = versionId;
    this.microversionId = microversionId;
    this.linkDocumentId = linkDocumentId;
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
     * Id of the Workspace to compare the Part Studio with
     */
    private String workspaceId;

    /**
     * Id of a Version to compare the Part Studio with
     */
    private String versionId;

    /**
     * Id of a document microversion to compare the Part Studio with
     */
    private Number microversionId;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the Workspace to compare the Part Studio with
     *
     * @return Id of the Workspace to compare the Part Studio with
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Id of the Workspace to compare the Part Studio with
     *
     * @param value Id of the Workspace to compare the Part Studio with
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get Id of a Version to compare the Part Studio with
     *
     * @return Id of a Version to compare the Part Studio with
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Id of a Version to compare the Part Studio with
     *
     * @param value Id of a Version to compare the Part Studio with
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Id of a document microversion to compare the Part Studio with
     *
     * @return Id of a document microversion to compare the Part Studio with
     *
     */
    public final Number microversionId() {
      return this.microversionId;
    }

    /**
     * Set Id of a document microversion to compare the Part Studio with
     *
     * @param value Id of a document microversion to compare the Part Studio with
     *
     * @return the Builder object.
     */
    public final Builder microversionId(Number value) {
      this.microversionId = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private PartStudiosComparePartStudioRequest build() {
      return new com.onshape.api.requests.PartStudiosComparePartStudioRequest(workspaceId,versionId,microversionId,linkDocumentId);
    }

    /**
     * Calls comparePartStudio method, Compare Part Studio in different versions / workspaces of a Document. Comparison can be done
     *                 between any combinations of source Workspace | Version | Microversion (specified in URL) and
     *                 target Workspace | Version | Microversion (specified as a query parameter). One of versionId,
     *                 workspaceId, or microversionId query parameters needs to be specified to identify target
     *                 microversion of the comparison. The result of the comparison is indicated by the following
     *                 values: of NONE - entity exists in both source and target states and there's no change in its
     *                 state | MODIFIED - entity exists in both source and target states and there's some change in its
     *                 state | ADDED - entity exists in target only | DELETED - entity exists in source only.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final PartStudiosComparePartStudioResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/compare", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("workspaceId", workspaceId, "versionId", versionId, "microversionId", microversionId, "linkDocumentId", linkDocumentId), com.onshape.api.responses.PartStudiosComparePartStudioResponse.class);
    }

    /**
     * Calls comparePartStudio method, Compare Part Studio in different versions / workspaces of a Document. Comparison can be done
     *                 between any combinations of source Workspace | Version | Microversion (specified in URL) and
     *                 target Workspace | Version | Microversion (specified as a query parameter). One of versionId,
     *                 workspaceId, or microversionId query parameters needs to be specified to identify target
     *                 microversion of the comparison. The result of the comparison is indicated by the following
     *                 values: of NONE - entity exists in both source and target states and there's no change in its
     *                 state | MODIFIED - entity exists in both source and target states and there's some change in its
     *                 state | ADDED - entity exists in target only | DELETED - entity exists in source only.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosComparePartStudioResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/compare", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.PartStudiosComparePartStudioResponse.class);
    }
  }
}
