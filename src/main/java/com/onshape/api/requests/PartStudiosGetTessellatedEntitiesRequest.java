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
import com.onshape.api.responses.PartStudiosGetTessellatedEntitiesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getTessellatedEntities API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetTessellatedEntitiesRequest {
  /**
   * Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
   */
  @JsonProperty("entityId")
  String entityId;

  /**
   * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

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

  PartStudiosGetTessellatedEntitiesRequest(String entityId, Number angleTolerance,
      Number chordTolerance, String linkDocumentId, String configuration) {
    this.entityId = entityId;
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
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
     * Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
     */
    private String entityId;

    /**
     * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
     */
    private Number chordTolerance;

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
     * Get Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
     *
     * @return Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
     *
     */
    public final String entityId() {
      return this.entityId;
    }

    /**
     * Set Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
     *
     * @param value Sketch entity id to be tessellated. All entities in the sketch are tessellated if none are provided.
     *
     * @return the Builder object.
     */
    public final Builder entityId(String value) {
      this.entityId = value;
      return this;
    }

    /**
     * Get Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
     *
     * @return Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
     *
     */
    public final Number angleTolerance() {
      return this.angleTolerance;
    }

    /**
     * Set Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
     *
     * @param value Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value of 0.087267 radians, but is subject to change.
     *
     * @return the Builder object.
     */
    public final Builder angleTolerance(Number value) {
      this.angleTolerance = value;
      return this;
    }

    /**
     * Get Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
     *
     * @return Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
     *
     * @param value Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true curve. This parameter currently has a default value of 0.02 meters, but is subject to change.
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
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

    private PartStudiosGetTessellatedEntitiesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetTessellatedEntitiesRequest(entityId,angleTolerance,chordTolerance,linkDocumentId,configuration);
    }

    /**
     * Calls getTessellatedEntities method, Get the tessellations of the sketch entities of a sketch in a part studio. The accuracy of the
     *                 tessellation to exact geometry is controlled by the angleTolerance and chordTolerance parameters.
     *                 The tessellation points are computed close enough so that neither the angle tolerance nor the
     *                 chord tolerance are exceeded. For most parts, the angular tolerance is the most restrictive of
     *                 the two default tolerances.
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
     *
     * @param sid Sketch feature ID
     */
    public final PartStudiosGetTessellatedEntitiesResponse call(String did, WVM wvmType, String wvm,
        String eid, String sid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/sketches/:sid/tessellatedentities", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid, "sid", sid), onshape.buildMap("entityId", entityId, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetTessellatedEntitiesResponse.class);
    }

    /**
     * Calls getTessellatedEntities method, Get the tessellations of the sketch entities of a sketch in a part studio. The accuracy of the
     *                 tessellation to exact geometry is controlled by the angleTolerance and chordTolerance parameters.
     *                 The tessellation points are computed close enough so that neither the angle tolerance nor the
     *                 chord tolerance are exceeded. For most parts, the angular tolerance is the most restrictive of
     *                 the two default tolerances.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param sid Sketch feature ID
     */
    public final PartStudiosGetTessellatedEntitiesResponse call(OnshapeDocument document,
        String sid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/sketches/:sid/tessellatedentities", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId(), "sid", sid), onshape.buildMap("entityId", entityId, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetTessellatedEntitiesResponse.class);
    }
  }
}
