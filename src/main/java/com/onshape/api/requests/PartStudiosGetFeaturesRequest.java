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
import com.onshape.api.responses.PartStudiosGetFeaturesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getFeatures API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetFeaturesRequest {
  /**
   * ID of a feature; repeat query param to add more than one
   */
  @JsonProperty("featureId")
  String featureId;

  /**
   * Whether or not to output simple sketch info without geometry
   */
  @JsonProperty("noSketchGeometry")
  Boolean noSketchGeometry;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  PartStudiosGetFeaturesRequest(String featureId, Boolean noSketchGeometry, String linkDocumentId) {
    this.featureId = featureId;
    this.noSketchGeometry = noSketchGeometry;
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
     * ID of a feature; repeat query param to add more than one
     */
    private String featureId;

    /**
     * Whether or not to output simple sketch info without geometry
     */
    private Boolean noSketchGeometry;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get ID of a feature; repeat query param to add more than one
     *
     * @return ID of a feature; repeat query param to add more than one
     *
     */
    public final String featureId() {
      return this.featureId;
    }

    /**
     * Set ID of a feature; repeat query param to add more than one
     *
     * @param value ID of a feature; repeat query param to add more than one
     *
     * @return the Builder object.
     */
    public final Builder featureId(String value) {
      this.featureId = value;
      return this;
    }

    /**
     * Get Whether or not to output simple sketch info without geometry
     *
     * @return Whether or not to output simple sketch info without geometry
     *
     */
    public final Boolean noSketchGeometry() {
      return this.noSketchGeometry;
    }

    /**
     * Set Whether or not to output simple sketch info without geometry
     *
     * @param value Whether or not to output simple sketch info without geometry
     *
     * @return the Builder object.
     */
    public final Builder noSketchGeometry(Boolean value) {
      this.noSketchGeometry = value;
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

    private PartStudiosGetFeaturesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetFeaturesRequest(featureId,noSketchGeometry,linkDocumentId);
    }

    /**
     * Calls getFeatures method, Get the definition of the feature list for a part studio. See the developer portal feature list
     *                 help topic for additional information
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
    public final PartStudiosGetFeaturesResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/features", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("featureId", featureId, "noSketchGeometry", noSketchGeometry, "linkDocumentId", linkDocumentId), com.onshape.api.responses.PartStudiosGetFeaturesResponse.class);
    }

    /**
     * Calls getFeatures method, Get the definition of the feature list for a part studio. See the developer portal feature list
     *                 help topic for additional information
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetFeaturesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/features", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("featureId", featureId, "noSketchGeometry", noSketchGeometry, "linkDocumentId", linkDocumentId), com.onshape.api.responses.PartStudiosGetFeaturesResponse.class);
    }
  }
}
