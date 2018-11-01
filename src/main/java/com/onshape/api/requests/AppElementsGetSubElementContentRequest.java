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
import com.onshape.api.responses.AppElementsGetSubElementContentResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getSubElementContent API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppElementsGetSubElementContentRequest {
  /**
   * Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
   */
  @JsonProperty("changeId")
  String changeId;

  /**
   * Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
   */
  @JsonProperty("baseChangeId")
  String baseChangeId;

  /**
   * Id of a sub-element to use as a restriction for returned data
   */
  @JsonProperty("subelementId")
  String subelementId;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AppElementsGetSubElementContentRequest(String transactionId, String changeId, String baseChangeId,
      String subelementId, String linkDocumentId) {
    this.transactionId = transactionId;
    this.changeId = changeId;
    this.baseChangeId = baseChangeId;
    this.subelementId = subelementId;
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
     * Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
     */
    private String transactionId;

    /**
     * Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
     */
    private String changeId;

    /**
     * Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
     */
    private String baseChangeId;

    /**
     * Id of a sub-element to use as a restriction for returned data
     */
    private String subelementId;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
     *
     * @return Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
     *
     * @param value Id of the transaction in which the ids should be retrieved. Valid only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
     *
     * @return Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
     *
     */
    public final String changeId() {
      return this.changeId;
    }

    /**
     * Set Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
     *
     * @param value Id of the change at which the ids should be retrieved. If not specified, defaults to the latest change in the workspace, version or microversion. May be specified only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder changeId(String value) {
      this.changeId = value;
      return this;
    }

    /**
     * Get Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
     *
     * @return Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
     *
     */
    public final String baseChangeId() {
      return this.baseChangeId;
    }

    /**
     * Set Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
     *
     * @param value Id of a change made prior to the specified or implied changeId. If specified, only changes made after the base changeId are returned.
     *
     * @return the Builder object.
     */
    public final Builder baseChangeId(String value) {
      this.baseChangeId = value;
      return this;
    }

    /**
     * Get Id of a sub-element to use as a restriction for returned data
     *
     * @return Id of a sub-element to use as a restriction for returned data
     *
     */
    public final String subelementId() {
      return this.subelementId;
    }

    /**
     * Set Id of a sub-element to use as a restriction for returned data
     *
     * @param value Id of a sub-element to use as a restriction for returned data
     *
     * @return the Builder object.
     */
    public final Builder subelementId(String value) {
      this.subelementId = value;
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

    private AppElementsGetSubElementContentRequest build() {
      return new com.onshape.api.requests.AppElementsGetSubElementContentRequest(transactionId,changeId,baseChangeId,subelementId,linkDocumentId);
    }

    /**
     * Calls getSubElementContent method, Get content of sub-elements in a workspace
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
    public final AppElementsGetSubElementContentResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/content", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("transactionId", transactionId, "changeId", changeId, "baseChangeId", baseChangeId, "subelementId", subelementId, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AppElementsGetSubElementContentResponse.class);
    }

    /**
     * Calls getSubElementContent method, Get content of sub-elements in a workspace
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsGetSubElementContentResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/content", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppElementsGetSubElementContentResponse.class);
    }
  }
}
