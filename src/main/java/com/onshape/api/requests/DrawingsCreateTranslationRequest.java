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
import com.onshape.api.responses.DrawingsCreateTranslationResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createTranslation API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DrawingsCreateTranslationRequest {
  /**
   * Name of format into which this element should be translated.
   */
  @JsonProperty("formatName")
  @NotNull
  String formatName;

  /**
   * Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
   */
  @JsonProperty("destinationName")
  @NotNull
  String destinationName;

  /**
   * (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
   */
  @JsonProperty("versionString")
  String versionString;

  /**
   * Whether a user notification should be generated on completion
   */
  @JsonProperty("notifyUser")
  Boolean notifyUser;

  /**
   * Whether text should be exploded into polylines
   */
  @JsonProperty("textAsGeometry")
  Boolean textAsGeometry;

  /**
   * (DWG only) Whether overridden dimensions should be underlined
   */
  @JsonProperty("showOveriddenDimensions")
  Boolean showOveriddenDimensions;

  /**
   * (DWG only) Whether to only export the last active sheet or all sheets
   */
  @JsonProperty("currentSheetOnly")
  Boolean currentSheetOnly;

  /**
   * Whether splines should be converted to polylines on the export
   */
  @JsonProperty("splinesAsPolylines")
  Boolean splinesAsPolylines;

  /**
   * Whether to set z-height to zero and normals to positive
   */
  @JsonProperty("flatten")
  Boolean flatten;

  /**
   * (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
   */
  @JsonProperty("colorMethod")
  String colorMethod;

  /**
   * (PDF only) Controls if text on the drawing should be selectable on the output PDF.
   */
  @JsonProperty("selectablePdfText")
  Boolean selectablePdfText;

  /**
   * controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   */
  @JsonProperty("storeInDocument")
  @NotNull
  Boolean storeInDocument;

  /**
   * If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
   */
  @JsonProperty("linkDocumentWorkspaceId")
  @NotNull
  String linkDocumentWorkspaceId;

  DrawingsCreateTranslationRequest(String formatName, String destinationName, String versionString,
      Boolean notifyUser, Boolean textAsGeometry, Boolean showOveriddenDimensions,
      Boolean currentSheetOnly, Boolean splinesAsPolylines, Boolean flatten, String colorMethod,
      Boolean selectablePdfText, Boolean storeInDocument, String linkDocumentWorkspaceId) {
    this.formatName = formatName;
    this.destinationName = destinationName;
    this.versionString = versionString;
    this.notifyUser = notifyUser;
    this.textAsGeometry = textAsGeometry;
    this.showOveriddenDimensions = showOveriddenDimensions;
    this.currentSheetOnly = currentSheetOnly;
    this.splinesAsPolylines = splinesAsPolylines;
    this.flatten = flatten;
    this.colorMethod = colorMethod;
    this.selectablePdfText = selectablePdfText;
    this.storeInDocument = storeInDocument;
    this.linkDocumentWorkspaceId = linkDocumentWorkspaceId;
  }

  /**
   * Get Name of format into which this element should be translated.
   *
   * @return Name of format into which this element should be translated.
   *
   */
  public final String getFormatName() {
    return this.formatName;
  }

  /**
   * Get Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
   *
   * @return Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
   *
   */
  public final String getDestinationName() {
    return this.destinationName;
  }

  /**
   * Get (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
   *
   * @return (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
   *
   */
  public final String getVersionString() {
    return this.versionString;
  }

  /**
   * Get Whether a user notification should be generated on completion
   *
   * @return Whether a user notification should be generated on completion
   *
   */
  public final Boolean getNotifyUser() {
    return this.notifyUser;
  }

  /**
   * Get Whether text should be exploded into polylines
   *
   * @return Whether text should be exploded into polylines
   *
   */
  public final Boolean getTextAsGeometry() {
    return this.textAsGeometry;
  }

  /**
   * Get (DWG only) Whether overridden dimensions should be underlined
   *
   * @return (DWG only) Whether overridden dimensions should be underlined
   *
   */
  public final Boolean getShowOveriddenDimensions() {
    return this.showOveriddenDimensions;
  }

  /**
   * Get (DWG only) Whether to only export the last active sheet or all sheets
   *
   * @return (DWG only) Whether to only export the last active sheet or all sheets
   *
   */
  public final Boolean getCurrentSheetOnly() {
    return this.currentSheetOnly;
  }

  /**
   * Get Whether splines should be converted to polylines on the export
   *
   * @return Whether splines should be converted to polylines on the export
   *
   */
  public final Boolean getSplinesAsPolylines() {
    return this.splinesAsPolylines;
  }

  /**
   * Get Whether to set z-height to zero and normals to positive
   *
   * @return Whether to set z-height to zero and normals to positive
   *
   */
  public final Boolean getFlatten() {
    return this.flatten;
  }

  /**
   * Get (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
   *
   * @return (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
   *
   */
  public final String getColorMethod() {
    return this.colorMethod;
  }

  /**
   * Get (PDF only) Controls if text on the drawing should be selectable on the output PDF.
   *
   * @return (PDF only) Controls if text on the drawing should be selectable on the output PDF.
   *
   */
  public final Boolean getSelectablePdfText() {
    return this.selectablePdfText;
  }

  /**
   * Get controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   *
   * @return controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   *
   */
  public final Boolean getStoreInDocument() {
    return this.storeInDocument;
  }

  /**
   * Get If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
   *
   * @return If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
   *
   */
  public final String getLinkDocumentWorkspaceId() {
    return this.linkDocumentWorkspaceId;
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
     * Name of format into which this element should be translated.
     */
    private String formatName;

    /**
     * Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
     */
    private String destinationName;

    /**
     * (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
     */
    private String versionString;

    /**
     * Whether a user notification should be generated on completion
     */
    private Boolean notifyUser;

    /**
     * Whether text should be exploded into polylines
     */
    private Boolean textAsGeometry;

    /**
     * (DWG only) Whether overridden dimensions should be underlined
     */
    private Boolean showOveriddenDimensions;

    /**
     * (DWG only) Whether to only export the last active sheet or all sheets
     */
    private Boolean currentSheetOnly;

    /**
     * Whether splines should be converted to polylines on the export
     */
    private Boolean splinesAsPolylines;

    /**
     * Whether to set z-height to zero and normals to positive
     */
    private Boolean flatten;

    /**
     * (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
     */
    private String colorMethod;

    /**
     * (PDF only) Controls if text on the drawing should be selectable on the output PDF.
     */
    private Boolean selectablePdfText;

    /**
     * controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     */
    private Boolean storeInDocument;

    /**
     * If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
     */
    private String linkDocumentWorkspaceId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Name of format into which this element should be translated.
     *
     * @return Name of format into which this element should be translated.
     *
     */
    public final String formatName() {
      return this.formatName;
    }

    /**
     * Set Name of format into which this element should be translated.
     *
     * @param value Name of format into which this element should be translated.
     *
     * @return the Builder object.
     */
    public final Builder formatName(String value) {
      this.formatName = value;
      return this;
    }

    /**
     * Get Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
     *
     * @return Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
     *
     */
    public final String destinationName() {
      return this.destinationName;
    }

    /**
     * Set Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
     *
     * @param value Name of the output file or new element. If the name does not include a file extension the extension will be derived from the formatName parameter
     *
     * @return the Builder object.
     */
    public final Builder destinationName(String value) {
      this.destinationName = value;
      return this;
    }

    /**
     * Get (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
     *
     * @return (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
     *
     */
    public final String versionString() {
      return this.versionString;
    }

    /**
     * Set (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
     *
     * @param value (DWG only) Version of output format to use (format-dependent). Currently supported formats are: 2013, 2010, 2007, 2004, 2000, R14, R13, R12
     *
     * @return the Builder object.
     */
    public final Builder versionString(String value) {
      this.versionString = value;
      return this;
    }

    /**
     * Get Whether a user notification should be generated on completion
     *
     * @return Whether a user notification should be generated on completion
     *
     */
    public final Boolean notifyUser() {
      return this.notifyUser;
    }

    /**
     * Set Whether a user notification should be generated on completion
     *
     * @param value Whether a user notification should be generated on completion
     *
     * @return the Builder object.
     */
    public final Builder notifyUser(Boolean value) {
      this.notifyUser = value;
      return this;
    }

    /**
     * Get Whether text should be exploded into polylines
     *
     * @return Whether text should be exploded into polylines
     *
     */
    public final Boolean textAsGeometry() {
      return this.textAsGeometry;
    }

    /**
     * Set Whether text should be exploded into polylines
     *
     * @param value Whether text should be exploded into polylines
     *
     * @return the Builder object.
     */
    public final Builder textAsGeometry(Boolean value) {
      this.textAsGeometry = value;
      return this;
    }

    /**
     * Get (DWG only) Whether overridden dimensions should be underlined
     *
     * @return (DWG only) Whether overridden dimensions should be underlined
     *
     */
    public final Boolean showOveriddenDimensions() {
      return this.showOveriddenDimensions;
    }

    /**
     * Set (DWG only) Whether overridden dimensions should be underlined
     *
     * @param value (DWG only) Whether overridden dimensions should be underlined
     *
     * @return the Builder object.
     */
    public final Builder showOveriddenDimensions(Boolean value) {
      this.showOveriddenDimensions = value;
      return this;
    }

    /**
     * Get (DWG only) Whether to only export the last active sheet or all sheets
     *
     * @return (DWG only) Whether to only export the last active sheet or all sheets
     *
     */
    public final Boolean currentSheetOnly() {
      return this.currentSheetOnly;
    }

    /**
     * Set (DWG only) Whether to only export the last active sheet or all sheets
     *
     * @param value (DWG only) Whether to only export the last active sheet or all sheets
     *
     * @return the Builder object.
     */
    public final Builder currentSheetOnly(Boolean value) {
      this.currentSheetOnly = value;
      return this;
    }

    /**
     * Get Whether splines should be converted to polylines on the export
     *
     * @return Whether splines should be converted to polylines on the export
     *
     */
    public final Boolean splinesAsPolylines() {
      return this.splinesAsPolylines;
    }

    /**
     * Set Whether splines should be converted to polylines on the export
     *
     * @param value Whether splines should be converted to polylines on the export
     *
     * @return the Builder object.
     */
    public final Builder splinesAsPolylines(Boolean value) {
      this.splinesAsPolylines = value;
      return this;
    }

    /**
     * Get Whether to set z-height to zero and normals to positive
     *
     * @return Whether to set z-height to zero and normals to positive
     *
     */
    public final Boolean flatten() {
      return this.flatten;
    }

    /**
     * Set Whether to set z-height to zero and normals to positive
     *
     * @param value Whether to set z-height to zero and normals to positive
     *
     * @return the Builder object.
     */
    public final Builder flatten(Boolean value) {
      this.flatten = value;
      return this;
    }

    /**
     * Get (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
     *
     * @return (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
     *
     */
    public final String colorMethod() {
      return this.colorMethod;
    }

    /**
     * Set (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
     *
     * @param value (PDF only) The color transformation that should be applied to the drawing on export. Supported options are: color, blackandwhite and grayscale
     *
     * @return the Builder object.
     */
    public final Builder colorMethod(String value) {
      this.colorMethod = value;
      return this;
    }

    /**
     * Get (PDF only) Controls if text on the drawing should be selectable on the output PDF.
     *
     * @return (PDF only) Controls if text on the drawing should be selectable on the output PDF.
     *
     */
    public final Boolean selectablePdfText() {
      return this.selectablePdfText;
    }

    /**
     * Set (PDF only) Controls if text on the drawing should be selectable on the output PDF.
     *
     * @param value (PDF only) Controls if text on the drawing should be selectable on the output PDF.
     *
     * @return the Builder object.
     */
    public final Builder selectablePdfText(Boolean value) {
      this.selectablePdfText = value;
      return this;
    }

    /**
     * Get controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @return controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     */
    public final Boolean storeInDocument() {
      return this.storeInDocument;
    }

    /**
     * Set controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @param value controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @return the Builder object.
     */
    public final Builder storeInDocument(Boolean value) {
      this.storeInDocument = value;
      return this;
    }

    /**
     * Get If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
     *
     * @return If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
     *
     */
    public final String linkDocumentWorkspaceId() {
      return this.linkDocumentWorkspaceId;
    }

    /**
     * Set If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
     *
     * @param value If storeInDocument is true and linkDocumentId is specified, this specifies a workspace to be used for result storage within the linkDocument.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentWorkspaceId(String value) {
      this.linkDocumentWorkspaceId = value;
      return this;
    }

    private DrawingsCreateTranslationRequest build() {
      return new com.onshape.api.requests.DrawingsCreateTranslationRequest(formatName,destinationName,versionString,notifyUser,textAsGeometry,showOveriddenDimensions,currentSheetOnly,splinesAsPolylines,flatten,colorMethod,selectablePdfText,storeInDocument,linkDocumentWorkspaceId);
    }

    /**
     * Calls createTranslation method, Create an element translation. The translation may be incomplete at the time that the call
     *                 completes. If the requestState is ACTIVE, the translation can be polled until the state becomes
     *                 either DONE or FAILED. Alternatively, a webhook callback can be registered for notification of
     *                 translation completion. (Requires Write scope if storeInDocument is true)
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
     */
    public final DrawingsCreateTranslationResponse call(String did, WV wvType, String wv,
        String eid) throws OnshapeException {
      return onshape.call("post", "/drawings/d/:did/[wv]/:wv/e/:eid/translations", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap(), com.onshape.api.responses.DrawingsCreateTranslationResponse.class);
    }

    /**
     * Calls createTranslation method, Create an element translation. The translation may be incomplete at the time that the call
     *                 completes. If the requestState is ACTIVE, the translation can be polled until the state becomes
     *                 either DONE or FAILED. Alternatively, a webhook callback can be registered for notification of
     *                 translation completion. (Requires Write scope if storeInDocument is true)
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DrawingsCreateTranslationResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/drawings/d/:did/[wv]/:wv/e/:eid/translations", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", WV.Workspace, "wv", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.DrawingsCreateTranslationResponse.class);
    }
  }
}
