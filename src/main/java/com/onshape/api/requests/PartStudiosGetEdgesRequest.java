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
import com.onshape.api.responses.PartStudiosGetEdgesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getEdges API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetEdgesRequest {
  /**
   * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

  /**
   * IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
   */
  @JsonProperty("edgeId")
  String edgeId;

  /**
   * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
   */
  @JsonProperty("partId")
  String partId;

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

  PartStudiosGetEdgesRequest(Number angleTolerance, Number chordTolerance, String edgeId,
      String partId, String linkDocumentId, String configuration) {
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
    this.edgeId = edgeId;
    this.partId = partId;
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
     * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     */
    private Number chordTolerance;

    /**
     * IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
     */
    private String edgeId;

    /**
     * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
     */
    private String partId;

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
     * Get Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @param value Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
      return this;
    }

    /**
     * Get IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
     *
     * @return IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
     *
     */
    public final String edgeId() {
      return this.edgeId;
    }

    /**
     * Set IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
     *
     * @param value IDs of edges to tessellate (repeat query param to add more than one, i.e. edgeId=JHK&amp;edgeId=JHD)
     *
     * @return the Builder object.
     */
    public final Builder edgeId(String value) {
      this.edgeId = value;
      return this;
    }

    /**
     * Get IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
     *
     * @return IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
     *
     * @param value IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with edgeId
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
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

    private PartStudiosGetEdgesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetEdgesRequest(angleTolerance,chordTolerance,edgeId,partId,linkDocumentId,configuration);
    }

    /**
     * Calls getEdges method, Get the tessellated edges of the parts in a Part Studio. The accuracy of the tessellation
     *     approximation to exact geometry is controlled by the angleTolerance and chordTolerance parameters. The
     *     tessellation points are computed close enough so that neither the angle tolerance nor the chord tolerance are
     *     exceeded.
     *     All coordinates are in meters.
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
    public final PartStudiosGetEdgesResponse call(String did, WVM wvmType, String wvm, String eid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/tessellatededges", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "edgeId", edgeId, "partId", partId, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetEdgesResponse.class);
    }

    /**
     * Calls getEdges method, Get the tessellated edges of the parts in a Part Studio. The accuracy of the tessellation
     *     approximation to exact geometry is controlled by the angleTolerance and chordTolerance parameters. The
     *     tessellation points are computed close enough so that neither the angle tolerance nor the chord tolerance are
     *     exceeded.
     *     All coordinates are in meters.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetEdgesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/tessellatededges", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "edgeId", edgeId, "partId", partId, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetEdgesResponse.class);
    }
  }
}
