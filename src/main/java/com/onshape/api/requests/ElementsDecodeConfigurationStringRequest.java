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
import com.onshape.api.responses.ElementsDecodeConfigurationStringResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for decodeConfigurationString API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class ElementsDecodeConfigurationStringRequest {
  /**
   * If true, additional data is returned for user-viewable information
   */
  @JsonProperty("includeDisplay")
  Boolean includeDisplay;

  /**
   * If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
   */
  @JsonProperty("configurationIsId")
  Boolean configurationIsId;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  ElementsDecodeConfigurationStringRequest(Boolean includeDisplay, Boolean configurationIsId,
      String linkDocumentId) {
    this.includeDisplay = includeDisplay;
    this.configurationIsId = configurationIsId;
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
     * If true, additional data is returned for user-viewable information
     */
    private Boolean includeDisplay;

    /**
     * If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
     */
    private Boolean configurationIsId;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get If true, additional data is returned for user-viewable information
     *
     * @return If true, additional data is returned for user-viewable information
     *
     */
    public final Boolean includeDisplay() {
      return this.includeDisplay;
    }

    /**
     * Set If true, additional data is returned for user-viewable information
     *
     * @param value If true, additional data is returned for user-viewable information
     *
     * @return the Builder object.
     */
    public final Builder includeDisplay(Boolean value) {
      this.includeDisplay = value;
      return this;
    }

    /**
     * Get If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
     *
     * @return If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
     *
     */
    public final Boolean configurationIsId() {
      return this.configurationIsId;
    }

    /**
     * Set If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
     *
     * @param value If true, the cid parameter should be interpreted as a configurationId rather than an encoded configuration, in which case the wvmid must be a version or microversion and the configurationId must be obtained from that version or microversion.
     *
     * @return the Builder object.
     */
    public final Builder configurationIsId(Boolean value) {
      this.configurationIsId = value;
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

    private ElementsDecodeConfigurationStringRequest build() {
      return new com.onshape.api.requests.ElementsDecodeConfigurationStringRequest(includeDisplay,configurationIsId,linkDocumentId);
    }

    /**
     * Calls decodeConfigurationString method, Converts a configuration string or configuration id into parameter map form.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid configuration string or configuration id to decode (must be url-encoded).
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final ElementsDecodeConfigurationStringResponse call(String cid, String did, WVM wvmType,
        String wvm, String eid) throws OnshapeException {
      return onshape.call("get", "/elements/d/:did/[wvm]/:wvm/e/:eid/configurationencodings/:cid", build(), onshape.buildMap("cid", cid, "did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("includeDisplay", includeDisplay, "configurationIsId", configurationIsId, "linkDocumentId", linkDocumentId), com.onshape.api.responses.ElementsDecodeConfigurationStringResponse.class);
    }

    /**
     * Calls decodeConfigurationString method, Converts a configuration string or configuration id into parameter map form.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid configuration string or configuration id to decode (must be url-encoded).
     */
    public final ElementsDecodeConfigurationStringResponse call(OnshapeDocument document,
        String cid) throws OnshapeException {
      return onshape.call("get", "/elements/d/:did/[wvm]/:wvm/e/:eid/configurationencodings/:cid", build(), onshape.buildMap("cid", cid, "did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.ElementsDecodeConfigurationStringResponse.class);
    }
  }
}
