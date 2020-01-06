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
import com.onshape.api.responses.PartStudiosExportStlResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for exportStl API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosExportStlRequest {
  /**
   * Comma-separated list of part IDs to export (omit to export entire part studio)
   */
  @JsonProperty("partIds")
  String partIds;

  /**
   * Whether parts should be exported as a group or individually in a .zip file
   */
  @JsonProperty("grouping")
  Boolean grouping;

  /**
   * Scale for measurements
   */
  @JsonProperty("scale")
  Number scale;

  /**
   * Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
   */
  @JsonProperty("units")
  String units;

  /**
   * Angle tolerance (in radians; must be &lt; pi/2)
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (in selected units)
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

  /**
   * Maximum facet width (in selected units)
   */
  @JsonProperty("maxFacetWidth")
  Number maxFacetWidth;

  /**
   * Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
   */
  @JsonProperty("minFacetWidth")
  Number minFacetWidth;

  /**
   * Type of file: text, binary
   */
  @JsonProperty("mode")
  String mode;

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

  PartStudiosExportStlRequest(String partIds, Boolean grouping, Number scale, String units,
      Number angleTolerance, Number chordTolerance, Number maxFacetWidth, Number minFacetWidth,
      String mode, String linkDocumentId, String configuration) {
    this.partIds = partIds;
    this.grouping = grouping;
    this.scale = scale;
    this.units = units;
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
    this.maxFacetWidth = maxFacetWidth;
    this.minFacetWidth = minFacetWidth;
    this.mode = mode;
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
     * Comma-separated list of part IDs to export (omit to export entire part studio)
     */
    private String partIds;

    /**
     * Whether parts should be exported as a group or individually in a .zip file
     */
    private Boolean grouping;

    /**
     * Scale for measurements
     */
    private Number scale;

    /**
     * Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
     */
    private String units;

    /**
     * Angle tolerance (in radians; must be &lt; pi/2)
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (in selected units)
     */
    private Number chordTolerance;

    /**
     * Maximum facet width (in selected units)
     */
    private Number maxFacetWidth;

    /**
     * Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
     */
    private Number minFacetWidth;

    /**
     * Type of file: text, binary
     */
    private String mode;

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
     * Get Comma-separated list of part IDs to export (omit to export entire part studio)
     *
     * @return Comma-separated list of part IDs to export (omit to export entire part studio)
     *
     */
    public final String partIds() {
      return this.partIds;
    }

    /**
     * Set Comma-separated list of part IDs to export (omit to export entire part studio)
     *
     * @param value Comma-separated list of part IDs to export (omit to export entire part studio)
     *
     * @return the Builder object.
     */
    public final Builder partIds(String value) {
      this.partIds = value;
      return this;
    }

    /**
     * Get Whether parts should be exported as a group or individually in a .zip file
     *
     * @return Whether parts should be exported as a group or individually in a .zip file
     *
     */
    public final Boolean grouping() {
      return this.grouping;
    }

    /**
     * Set Whether parts should be exported as a group or individually in a .zip file
     *
     * @param value Whether parts should be exported as a group or individually in a .zip file
     *
     * @return the Builder object.
     */
    public final Builder grouping(Boolean value) {
      this.grouping = value;
      return this;
    }

    /**
     * Get Scale for measurements
     *
     * @return Scale for measurements
     *
     */
    public final Number scale() {
      return this.scale;
    }

    /**
     * Set Scale for measurements
     *
     * @param value Scale for measurements
     *
     * @return the Builder object.
     */
    public final Builder scale(Number value) {
      this.scale = value;
      return this;
    }

    /**
     * Get Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
     *
     * @return Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
     *
     */
    public final String units() {
      return this.units;
    }

    /**
     * Set Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
     *
     * @param value Name of base unit (meter, centimeter, millimeter, inch, foot, or yard)
     *
     * @return the Builder object.
     */
    public final Builder units(String value) {
      this.units = value;
      return this;
    }

    /**
     * Get Angle tolerance (in radians; must be &lt; pi/2)
     *
     * @return Angle tolerance (in radians; must be &lt; pi/2)
     *
     */
    public final Number angleTolerance() {
      return this.angleTolerance;
    }

    /**
     * Set Angle tolerance (in radians; must be &lt; pi/2)
     *
     * @param value Angle tolerance (in radians; must be &lt; pi/2)
     *
     * @return the Builder object.
     */
    public final Builder angleTolerance(Number value) {
      this.angleTolerance = value;
      return this;
    }

    /**
     * Get Chord tolerance (in selected units)
     *
     * @return Chord tolerance (in selected units)
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (in selected units)
     *
     * @param value Chord tolerance (in selected units)
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
      return this;
    }

    /**
     * Get Maximum facet width (in selected units)
     *
     * @return Maximum facet width (in selected units)
     *
     */
    public final Number maxFacetWidth() {
      return this.maxFacetWidth;
    }

    /**
     * Set Maximum facet width (in selected units)
     *
     * @param value Maximum facet width (in selected units)
     *
     * @return the Builder object.
     */
    public final Builder maxFacetWidth(Number value) {
      this.maxFacetWidth = value;
      return this;
    }

    /**
     * Get Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
     *
     * @return Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
     *
     */
    public final Number minFacetWidth() {
      return this.minFacetWidth;
    }

    /**
     * Set Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
     *
     * @param value Minimum facet width (in selected units - must be &lt; maximumFacetWidth)
     *
     * @return the Builder object.
     */
    public final Builder minFacetWidth(Number value) {
      this.minFacetWidth = value;
      return this;
    }

    /**
     * Get Type of file: text, binary
     *
     * @return Type of file: text, binary
     *
     */
    public final String mode() {
      return this.mode;
    }

    /**
     * Set Type of file: text, binary
     *
     * @param value Type of file: text, binary
     *
     * @return the Builder object.
     */
    public final Builder mode(String value) {
      this.mode = value;
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

    private PartStudiosExportStlRequest build() {
      return new com.onshape.api.requests.PartStudiosExportStlRequest(partIds,grouping,scale,units,angleTolerance,chordTolerance,maxFacetWidth,minFacetWidth,mode,linkDocumentId,configuration);
    }

    /**
     * Calls exportStl method, Export the part studio in text or binary STL format; returns a 307 redirect.
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
    public final PartStudiosExportStlResponse call(String did, WVM wvmType, String wvm, String eid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/stl", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partIds", partIds, "grouping", grouping, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportStlResponse.class);
    }

    /**
     * Calls exportStl method, Export the part studio in text or binary STL format; returns a 307 redirect.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosExportStlResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/stl", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("partIds", partIds, "grouping", grouping, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportStlResponse.class);
    }

    /**
     * Calls exportStl method, Export the part studio in text or binary STL format; returns a 307 redirect.
     * @return InputStreamWithHeaders stream with headers
     * @throws OnshapeException On HTTP error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final InputStreamWithHeaders callToStream(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/stl", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partIds", partIds, "grouping", grouping, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "linkDocumentId", linkDocumentId, "configuration", configuration), InputStreamWithHeaders.class);
    }
  }
}
