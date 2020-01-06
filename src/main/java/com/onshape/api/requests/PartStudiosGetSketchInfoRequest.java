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
import com.onshape.api.responses.PartStudiosGetSketchInfoResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getSketchInfo API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetSketchInfoRequest {
  /**
   * ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
   */
  @JsonProperty("sketchId")
  String sketchId;

  /**
   * Whether or not to output with respect to global 3D coordinate system
   */
  @JsonProperty("output3D")
  Boolean output3D;

  /**
   * Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
   */
  @JsonProperty("curvePoints")
  Boolean curvePoints;

  /**
   * Whether or not to just output simple sketch info without geometry
   */
  @JsonProperty("includeGeometry")
  Boolean includeGeometry;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  PartStudiosGetSketchInfoRequest(String sketchId, Boolean output3D, Boolean curvePoints,
      Boolean includeGeometry, String linkDocumentId, String configuration) {
    this.sketchId = sketchId;
    this.output3D = output3D;
    this.curvePoints = curvePoints;
    this.includeGeometry = includeGeometry;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
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
     * ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
     */
    private String sketchId;

    /**
     * Whether or not to output with respect to global 3D coordinate system
     */
    private Boolean output3D;

    /**
     * Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
     */
    private Boolean curvePoints;

    /**
     * Whether or not to just output simple sketch info without geometry
     */
    private Boolean includeGeometry;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
     *
     * @return ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
     *
     */
    public final String sketchId() {
      return this.sketchId;
    }

    /**
     * Set ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
     *
     * @param value ID of a sketch feature; repeat query param to add more than one. If no sketchId query parameter is passed, all sketches in the part studio are returned.
     *
     * @return the Builder object.
     */
    public final Builder sketchId(String value) {
      this.sketchId = value;
      return this;
    }

    /**
     * Get Whether or not to output with respect to global 3D coordinate system
     *
     * @return Whether or not to output with respect to global 3D coordinate system
     *
     */
    public final Boolean output3D() {
      return this.output3D;
    }

    /**
     * Set Whether or not to output with respect to global 3D coordinate system
     *
     * @param value Whether or not to output with respect to global 3D coordinate system
     *
     * @return the Builder object.
     */
    public final Builder output3D(Boolean value) {
      this.output3D = value;
      return this;
    }

    /**
     * Get Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
     *
     * @return Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
     *
     */
    public final Boolean curvePoints() {
      return this.curvePoints;
    }

    /**
     * Set Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
     *
     * @param value Whether or not to output start/quarter/mid/end points, start/end tangent vectors, and length of sketch curves
     *
     * @return the Builder object.
     */
    public final Builder curvePoints(Boolean value) {
      this.curvePoints = value;
      return this;
    }

    /**
     * Get Whether or not to just output simple sketch info without geometry
     *
     * @return Whether or not to just output simple sketch info without geometry
     *
     */
    public final Boolean includeGeometry() {
      return this.includeGeometry;
    }

    /**
     * Set Whether or not to just output simple sketch info without geometry
     *
     * @param value Whether or not to just output simple sketch info without geometry
     *
     * @return the Builder object.
     */
    public final Builder includeGeometry(Boolean value) {
      this.includeGeometry = value;
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

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    private PartStudiosGetSketchInfoRequest build() {
      return new com.onshape.api.requests.PartStudiosGetSketchInfoRequest(sketchId,output3D,curvePoints,includeGeometry,linkDocumentId,configuration);
    }

    /**
     * Calls getSketchInfo method, Get information for sketches in a part studio
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
    public final PartStudiosGetSketchInfoResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/sketches", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("sketchId", sketchId, "output3D", output3D, "curvePoints", curvePoints, "includeGeometry", includeGeometry, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetSketchInfoResponse.class);
    }

    /**
     * Calls getSketchInfo method, Get information for sketches in a part studio
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetSketchInfoResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/sketches", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("sketchId", sketchId, "output3D", output3D, "curvePoints", curvePoints, "includeGeometry", includeGeometry, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetSketchInfoResponse.class);
    }
  }
}
