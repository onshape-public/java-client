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
import com.onshape.api.responses.AppElementsCompareAppElementJsonResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for compareAppElementJson API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCompareAppElementJsonRequest {
  /**
   * Id of the Workspace to compare the App element with
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Id of a Version to compare the App element with
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Id of a document microversion to compare the App element with
   */
  @JsonProperty("microversionId")
  Number microversionId;

  /**
   * format of the return value. Values: default|full_path|json_patch
   */
  @JsonProperty("jsonDifferenceFormat")
  String jsonDifferenceFormat;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AppElementsCompareAppElementJsonRequest(String workspaceId, String versionId,
      Number microversionId, String jsonDifferenceFormat, String linkDocumentId) {
    this.workspaceId = workspaceId;
    this.versionId = versionId;
    this.microversionId = microversionId;
    this.jsonDifferenceFormat = jsonDifferenceFormat;
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
     * Id of the Workspace to compare the App element with
     */
    private String workspaceId;

    /**
     * Id of a Version to compare the App element with
     */
    private String versionId;

    /**
     * Id of a document microversion to compare the App element with
     */
    private Number microversionId;

    /**
     * format of the return value. Values: default|full_path|json_patch
     */
    private String jsonDifferenceFormat;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the Workspace to compare the App element with
     *
     * @return Id of the Workspace to compare the App element with
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Id of the Workspace to compare the App element with
     *
     * @param value Id of the Workspace to compare the App element with
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get Id of a Version to compare the App element with
     *
     * @return Id of a Version to compare the App element with
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Id of a Version to compare the App element with
     *
     * @param value Id of a Version to compare the App element with
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Id of a document microversion to compare the App element with
     *
     * @return Id of a document microversion to compare the App element with
     *
     */
    public final Number microversionId() {
      return this.microversionId;
    }

    /**
     * Set Id of a document microversion to compare the App element with
     *
     * @param value Id of a document microversion to compare the App element with
     *
     * @return the Builder object.
     */
    public final Builder microversionId(Number value) {
      this.microversionId = value;
      return this;
    }

    /**
     * Get format of the return value. Values: default|full_path|json_patch
     *
     * @return format of the return value. Values: default|full_path|json_patch
     *
     */
    public final String jsonDifferenceFormat() {
      return this.jsonDifferenceFormat;
    }

    /**
     * Set format of the return value. Values: default|full_path|json_patch
     *
     * @param value format of the return value. Values: default|full_path|json_patch
     *
     * @return the Builder object.
     */
    public final Builder jsonDifferenceFormat(String value) {
      this.jsonDifferenceFormat = value;
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

    private AppElementsCompareAppElementJsonRequest build() {
      return new com.onshape.api.requests.AppElementsCompareAppElementJsonRequest(workspaceId,versionId,microversionId,jsonDifferenceFormat,linkDocumentId);
    }

    /**
     * Calls compareAppElementJson method, Compare App Element JSON trees in different versions / workspaces of a Document. Comparison can
     *                 be done between any combinations of source Workspace | Version | Microversion (specified in URL)
     *                 and target Workspace | Version | Microversion (specified as a query parameter). One of versionId,
     *                 workspaceId, or microversionId query parameters needs to be specified to identify target
     *                 microversion of the comparison. The result of the comparison is a list of BTGEdits
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
    public final AppElementsCompareAppElementJsonResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/compare", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("workspaceId", workspaceId, "versionId", versionId, "microversionId", microversionId, "jsonDifferenceFormat", jsonDifferenceFormat, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AppElementsCompareAppElementJsonResponse.class);
    }

    /**
     * Calls compareAppElementJson method, Compare App Element JSON trees in different versions / workspaces of a Document. Comparison can
     *                 be done between any combinations of source Workspace | Version | Microversion (specified in URL)
     *                 and target Workspace | Version | Microversion (specified as a query parameter). One of versionId,
     *                 workspaceId, or microversionId query parameters needs to be specified to identify target
     *                 microversion of the comparison. The result of the comparison is a list of BTGEdits
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsCompareAppElementJsonResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/compare", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("workspaceId", workspaceId, "versionId", versionId, "microversionId", microversionId, "jsonDifferenceFormat", jsonDifferenceFormat, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AppElementsCompareAppElementJsonResponse.class);
    }
  }
}
