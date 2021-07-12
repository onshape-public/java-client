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
import com.onshape.api.responses.PartStudiosExportGltfResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for exportGltf API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosExportGltfRequest {
  /**
   * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
   */
  @JsonProperty("partId")
  String partId;

  /**
   * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

  /**
   * Max facet width. This specifies the limit on the size of any side of a tessellation facet.
   */
  @JsonProperty("maxFacetWidth")
  Number maxFacetWidth;

  /**
   * IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
   */
  @JsonProperty("faceId")
  String faceId;

  /**
   * medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
   */
  @JsonProperty("precomputedLevelOfDetail")
  String precomputedLevelOfDetail;

  /**
   * Determines if face appearance data will be included in the output
   */
  @JsonProperty("outputFaceAppearances")
  Boolean outputFaceAppearances;

  /**
   * Determines if separate nodes will be created for each face or per part.
   */
  @JsonProperty("outputSeparateFaceNodes")
  Boolean outputSeparateFaceNodes;

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

  PartStudiosExportGltfRequest(String partId, Number angleTolerance, Number chordTolerance,
      Number maxFacetWidth, String faceId, String precomputedLevelOfDetail,
      Boolean outputFaceAppearances, Boolean outputSeparateFaceNodes, String linkDocumentId,
      String configuration) {
    this.partId = partId;
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
    this.maxFacetWidth = maxFacetWidth;
    this.faceId = faceId;
    this.precomputedLevelOfDetail = precomputedLevelOfDetail;
    this.outputFaceAppearances = outputFaceAppearances;
    this.outputSeparateFaceNodes = outputSeparateFaceNodes;
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
     * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     */
    private String partId;

    /**
     * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     */
    private Number chordTolerance;

    /**
     * Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     */
    private Number maxFacetWidth;

    /**
     * IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     */
    private String faceId;

    /**
     * medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
     */
    private String precomputedLevelOfDetail;

    /**
     * Determines if face appearance data will be included in the output
     */
    private Boolean outputFaceAppearances;

    /**
     * Determines if separate nodes will be created for each face or per part.
     */
    private Boolean outputSeparateFaceNodes;

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
     * Get IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @return IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @param value IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @return Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     */
    public final Number angleTolerance() {
      return this.angleTolerance;
    }

    /**
     * Set Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @param value Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @return the Builder object.
     */
    public final Builder angleTolerance(Number value) {
      this.angleTolerance = value;
      return this;
    }

    /**
     * Get Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @param value Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
      return this;
    }

    /**
     * Get Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @return Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     */
    public final Number maxFacetWidth() {
      return this.maxFacetWidth;
    }

    /**
     * Set Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @param value Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @return the Builder object.
     */
    public final Builder maxFacetWidth(Number value) {
      this.maxFacetWidth = value;
      return this;
    }

    /**
     * Get IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @return IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     */
    public final String faceId() {
      return this.faceId;
    }

    /**
     * Set IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @param value IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @return the Builder object.
     */
    public final Builder faceId(String value) {
      this.faceId = value;
      return this;
    }

    /**
     * Get medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
     *
     * @return medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
     *
     */
    public final String precomputedLevelOfDetail() {
      return this.precomputedLevelOfDetail;
    }

    /**
     * Set medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
     *
     * @param value medium, fine] If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored.
     *
     * @return the Builder object.
     */
    public final Builder precomputedLevelOfDetail(String value) {
      this.precomputedLevelOfDetail = value;
      return this;
    }

    /**
     * Get Determines if face appearance data will be included in the output
     *
     * @return Determines if face appearance data will be included in the output
     *
     */
    public final Boolean outputFaceAppearances() {
      return this.outputFaceAppearances;
    }

    /**
     * Set Determines if face appearance data will be included in the output
     *
     * @param value Determines if face appearance data will be included in the output
     *
     * @return the Builder object.
     */
    public final Builder outputFaceAppearances(Boolean value) {
      this.outputFaceAppearances = value;
      return this;
    }

    /**
     * Get Determines if separate nodes will be created for each face or per part.
     *
     * @return Determines if separate nodes will be created for each face or per part.
     *
     */
    public final Boolean outputSeparateFaceNodes() {
      return this.outputSeparateFaceNodes;
    }

    /**
     * Set Determines if separate nodes will be created for each face or per part.
     *
     * @param value Determines if separate nodes will be created for each face or per part.
     *
     * @return the Builder object.
     */
    public final Builder outputSeparateFaceNodes(Boolean value) {
      this.outputSeparateFaceNodes = value;
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

    private PartStudiosExportGltfRequest build() {
      return new com.onshape.api.requests.PartStudiosExportGltfRequest(partId,angleTolerance,chordTolerance,maxFacetWidth,faceId,precomputedLevelOfDetail,outputFaceAppearances,outputSeparateFaceNodes,linkDocumentId,configuration);
    }

    /**
     * Calls exportGltf method, Export glTF representation of parts in a Part Studio. The accuracy of the tessellation
     *                 approximation to exact geometry is controlled by the angleTolerance, chordTolerance and
     *                 maxFacetWidth parameters. The tessellation points are computed close enough so that none of these
     *                 parameters are exceeded. All coordinates are in meters. The glTF output from this endpoint will
     *                 differ from that exported from the UI. For output that matches that please use the
     *                 PartStudios-createTranslation API.
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
    public final PartStudiosExportGltfResponse call(String did, WVM wvmType, String wvm, String eid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/gltf", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partId", partId, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "faceId", faceId, "precomputedLevelOfDetail", precomputedLevelOfDetail, "outputFaceAppearances", outputFaceAppearances, "outputSeparateFaceNodes", outputSeparateFaceNodes, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportGltfResponse.class);
    }

    /**
     * Calls exportGltf method, Export glTF representation of parts in a Part Studio. The accuracy of the tessellation
     *                 approximation to exact geometry is controlled by the angleTolerance, chordTolerance and
     *                 maxFacetWidth parameters. The tessellation points are computed close enough so that none of these
     *                 parameters are exceeded. All coordinates are in meters. The glTF output from this endpoint will
     *                 differ from that exported from the UI. For output that matches that please use the
     *                 PartStudios-createTranslation API.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosExportGltfResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/gltf", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("partId", partId, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "faceId", faceId, "precomputedLevelOfDetail", precomputedLevelOfDetail, "outputFaceAppearances", outputFaceAppearances, "outputSeparateFaceNodes", outputSeparateFaceNodes, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportGltfResponse.class);
    }
  }
}
