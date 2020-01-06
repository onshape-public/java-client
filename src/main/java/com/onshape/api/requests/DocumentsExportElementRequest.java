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
import com.onshape.api.responses.DocumentsExportElementResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for exportElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsExportElementRequest {
  /**
   * whether the output should be stored as a new element
   */
  @JsonProperty("storeInDocument")
  Boolean storeInDocument;

  /**
   * The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
   */
  @JsonProperty("linkDocumentWorkspaceId")
  String linkDocumentWorkspaceId;

  /**
   * Comma-separated list of part IDs to export
   */
  @JsonProperty("partIds")
  String partIds;

  /**
   * Specified microversion for operation
   */
  @JsonProperty("microversion")
  String microversion;

  /**
   * Whether parts should be exported as a group or individually in a .zip file (STL)
   */
  @JsonProperty("grouping")
  Boolean grouping;

  /**
   * Whether single file output should be returned as a .zip file (STL, grouping==true)
   */
  @JsonProperty("zipSingleFileOutput")
  Boolean zipSingleFileOutput;

  /**
   * Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
   */
  @JsonProperty("units")
  String units;

  /**
   * Angle tolerance (must be &lt; pi/2) (STL)
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (STL)
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

  /**
   * Maximum facet width (STL)
   */
  @JsonProperty("maxFacetWidth")
  Number maxFacetWidth;

  /**
   * Minimum facet width (must be &lt; maximumFacetWidth) (STL)
   */
  @JsonProperty("minFacetWidth")
  Number minFacetWidth;

  /**
   * Parasolid version (PS)
   */
  @JsonProperty("version")
  Number version;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  DocumentsExportElementRequest(Boolean storeInDocument, String linkDocumentWorkspaceId,
      String partIds, String microversion, Boolean grouping, Boolean zipSingleFileOutput,
      String units, Number angleTolerance, Number chordTolerance, Number maxFacetWidth,
      Number minFacetWidth, Number version, String linkDocumentId) {
    this.storeInDocument = storeInDocument;
    this.linkDocumentWorkspaceId = linkDocumentWorkspaceId;
    this.partIds = partIds;
    this.microversion = microversion;
    this.grouping = grouping;
    this.zipSingleFileOutput = zipSingleFileOutput;
    this.units = units;
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
    this.maxFacetWidth = maxFacetWidth;
    this.minFacetWidth = minFacetWidth;
    this.version = version;
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
     * whether the output should be stored as a new element
     */
    private Boolean storeInDocument;

    /**
     * The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
     */
    private String linkDocumentWorkspaceId;

    /**
     * Comma-separated list of part IDs to export
     */
    private String partIds;

    /**
     * Specified microversion for operation
     */
    private String microversion;

    /**
     * Whether parts should be exported as a group or individually in a .zip file (STL)
     */
    private Boolean grouping;

    /**
     * Whether single file output should be returned as a .zip file (STL, grouping==true)
     */
    private Boolean zipSingleFileOutput;

    /**
     * Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
     */
    private String units;

    /**
     * Angle tolerance (must be &lt; pi/2) (STL)
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (STL)
     */
    private Number chordTolerance;

    /**
     * Maximum facet width (STL)
     */
    private Number maxFacetWidth;

    /**
     * Minimum facet width (must be &lt; maximumFacetWidth) (STL)
     */
    private Number minFacetWidth;

    /**
     * Parasolid version (PS)
     */
    private Number version;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get whether the output should be stored as a new element
     *
     * @return whether the output should be stored as a new element
     *
     */
    public final Boolean storeInDocument() {
      return this.storeInDocument;
    }

    /**
     * Set whether the output should be stored as a new element
     *
     * @param value whether the output should be stored as a new element
     *
     * @return the Builder object.
     */
    public final Builder storeInDocument(Boolean value) {
      this.storeInDocument = value;
      return this;
    }

    /**
     * Get The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
     *
     * @return The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
     *
     */
    public final String linkDocumentWorkspaceId() {
      return this.linkDocumentWorkspaceId;
    }

    /**
     * Set The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
     *
     * @param value The id of the workspace in which the result should be stored if storeInDocument is true and linkDocumentId is set.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentWorkspaceId(String value) {
      this.linkDocumentWorkspaceId = value;
      return this;
    }

    /**
     * Get Comma-separated list of part IDs to export
     *
     * @return Comma-separated list of part IDs to export
     *
     */
    public final String partIds() {
      return this.partIds;
    }

    /**
     * Set Comma-separated list of part IDs to export
     *
     * @param value Comma-separated list of part IDs to export
     *
     * @return the Builder object.
     */
    public final Builder partIds(String value) {
      this.partIds = value;
      return this;
    }

    /**
     * Get Specified microversion for operation
     *
     * @return Specified microversion for operation
     *
     */
    public final String microversion() {
      return this.microversion;
    }

    /**
     * Set Specified microversion for operation
     *
     * @param value Specified microversion for operation
     *
     * @return the Builder object.
     */
    public final Builder microversion(String value) {
      this.microversion = value;
      return this;
    }

    /**
     * Get Whether parts should be exported as a group or individually in a .zip file (STL)
     *
     * @return Whether parts should be exported as a group or individually in a .zip file (STL)
     *
     */
    public final Boolean grouping() {
      return this.grouping;
    }

    /**
     * Set Whether parts should be exported as a group or individually in a .zip file (STL)
     *
     * @param value Whether parts should be exported as a group or individually in a .zip file (STL)
     *
     * @return the Builder object.
     */
    public final Builder grouping(Boolean value) {
      this.grouping = value;
      return this;
    }

    /**
     * Get Whether single file output should be returned as a .zip file (STL, grouping==true)
     *
     * @return Whether single file output should be returned as a .zip file (STL, grouping==true)
     *
     */
    public final Boolean zipSingleFileOutput() {
      return this.zipSingleFileOutput;
    }

    /**
     * Set Whether single file output should be returned as a .zip file (STL, grouping==true)
     *
     * @param value Whether single file output should be returned as a .zip file (STL, grouping==true)
     *
     * @return the Builder object.
     */
    public final Builder zipSingleFileOutput(Boolean value) {
      this.zipSingleFileOutput = value;
      return this;
    }

    /**
     * Get Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
     *
     * @return Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
     *
     */
    public final String units() {
      return this.units;
    }

    /**
     * Set Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
     *
     * @param value Name of base unit: meter, centimeter, millimeter, inch, foot, yard (STL)
     *
     * @return the Builder object.
     */
    public final Builder units(String value) {
      this.units = value;
      return this;
    }

    /**
     * Get Angle tolerance (must be &lt; pi/2) (STL)
     *
     * @return Angle tolerance (must be &lt; pi/2) (STL)
     *
     */
    public final Number angleTolerance() {
      return this.angleTolerance;
    }

    /**
     * Set Angle tolerance (must be &lt; pi/2) (STL)
     *
     * @param value Angle tolerance (must be &lt; pi/2) (STL)
     *
     * @return the Builder object.
     */
    public final Builder angleTolerance(Number value) {
      this.angleTolerance = value;
      return this;
    }

    /**
     * Get Chord tolerance (STL)
     *
     * @return Chord tolerance (STL)
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (STL)
     *
     * @param value Chord tolerance (STL)
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
      return this;
    }

    /**
     * Get Maximum facet width (STL)
     *
     * @return Maximum facet width (STL)
     *
     */
    public final Number maxFacetWidth() {
      return this.maxFacetWidth;
    }

    /**
     * Set Maximum facet width (STL)
     *
     * @param value Maximum facet width (STL)
     *
     * @return the Builder object.
     */
    public final Builder maxFacetWidth(Number value) {
      this.maxFacetWidth = value;
      return this;
    }

    /**
     * Get Minimum facet width (must be &lt; maximumFacetWidth) (STL)
     *
     * @return Minimum facet width (must be &lt; maximumFacetWidth) (STL)
     *
     */
    public final Number minFacetWidth() {
      return this.minFacetWidth;
    }

    /**
     * Set Minimum facet width (must be &lt; maximumFacetWidth) (STL)
     *
     * @param value Minimum facet width (must be &lt; maximumFacetWidth) (STL)
     *
     * @return the Builder object.
     */
    public final Builder minFacetWidth(Number value) {
      this.minFacetWidth = value;
      return this;
    }

    /**
     * Get Parasolid version (PS)
     *
     * @return Parasolid version (PS)
     *
     */
    public final Number version() {
      return this.version;
    }

    /**
     * Set Parasolid version (PS)
     *
     * @param value Parasolid version (PS)
     *
     * @return the Builder object.
     */
    public final Builder version(Number value) {
      this.version = value;
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

    private DocumentsExportElementRequest build() {
      return new com.onshape.api.requests.DocumentsExportElementRequest(storeInDocument,linkDocumentWorkspaceId,partIds,microversion,grouping,zipSingleFileOutput,units,angleTolerance,chordTolerance,maxFacetWidth,minFacetWidth,version,linkDocumentId);
    }

    /**
     * Calls exportElement method, Export the given element in STL or Parasolid (PS) formats; returns a 307 redirect.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     *
     * @param eid Element ID
     *
     * @param format Export format: STL, PS (Default: null)
     * @param scale Scale for measurements (STL) (Default: null)
     * @param mode Type of file: text, binary (STL) (Default: null) */
    public final DocumentsExportElementResponse call(String did, WV wvType, String wv, String eid,
        String format, Number scale, String mode) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/[wv]/:wv/e/:eid/export", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap("format", format, "storeInDocument", storeInDocument, "linkDocumentWorkspaceId", linkDocumentWorkspaceId, "partIds", partIds, "microversion", microversion, "grouping", grouping, "zipSingleFileOutput", zipSingleFileOutput, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "version", version, "linkDocumentId", linkDocumentId), com.onshape.api.responses.DocumentsExportElementResponse.class);
    }

    /**
     * Calls exportElement method, Export the given element in STL or Parasolid (PS) formats; returns a 307 redirect.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param format Export format: STL, PS (Default: null)
     * @param scale Scale for measurements (STL) (Default: null)
     * @param mode Type of file: text, binary (STL) (Default: null) */
    public final DocumentsExportElementResponse call(OnshapeDocument document, String format,
        Number scale, String mode) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/[wv]/:wv/e/:eid/export", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId(), "eid", document.getElementId()), onshape.buildMap("format", format, "storeInDocument", storeInDocument, "linkDocumentWorkspaceId", linkDocumentWorkspaceId, "partIds", partIds, "microversion", microversion, "grouping", grouping, "zipSingleFileOutput", zipSingleFileOutput, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "version", version, "linkDocumentId", linkDocumentId), com.onshape.api.responses.DocumentsExportElementResponse.class);
    }

    /**
     * Calls exportElement method, Export the given element in STL or Parasolid (PS) formats; returns a 307 redirect.
     * @return InputStreamWithHeaders stream with headers
     * @throws OnshapeException On HTTP error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     *
     * @param eid Element ID
     *
     * @param format Export format: STL, PS (Default: null)
     * @param scale Scale for measurements (STL) (Default: null)
     * @param mode Type of file: text, binary (STL) (Default: null) */
    public final InputStreamWithHeaders callToStream(String did, WV wvType, String wv, String eid,
        String format, Number scale, String mode) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/[wv]/:wv/e/:eid/export", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap("format", format, "storeInDocument", storeInDocument, "linkDocumentWorkspaceId", linkDocumentWorkspaceId, "partIds", partIds, "microversion", microversion, "grouping", grouping, "zipSingleFileOutput", zipSingleFileOutput, "scale", scale, "units", units, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "minFacetWidth", minFacetWidth, "mode", mode, "version", version, "linkDocumentId", linkDocumentId), InputStreamWithHeaders.class);
    }
  }
}
