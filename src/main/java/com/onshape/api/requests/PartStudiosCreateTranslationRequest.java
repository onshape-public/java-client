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
import com.onshape.api.responses.PartStudiosCreateTranslationResponse;
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
public final class PartStudiosCreateTranslationRequest {
  /**
   * A configuration string indicating the particular configuration that should be translated
   */
  @JsonProperty("configuration")
  @NotNull
  String configuration;

  /**
   * A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
   */
  @JsonProperty("partIds")
  @NotNull
  String partIds;

  /**
   * Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
   */
  @JsonProperty("formatName")
  @NotNull
  String formatName;

  /**
   * Whether to include topology id strings in parasolid output format.
   */
  @JsonProperty("includeExportIds")
  @NotNull
  Boolean includeExportIds;

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

  PartStudiosCreateTranslationRequest(String configuration, String partIds, String formatName,
      Boolean includeExportIds, Boolean storeInDocument, String linkDocumentWorkspaceId) {
    this.configuration = configuration;
    this.partIds = partIds;
    this.formatName = formatName;
    this.includeExportIds = includeExportIds;
    this.storeInDocument = storeInDocument;
    this.linkDocumentWorkspaceId = linkDocumentWorkspaceId;
  }

  /**
   * Get A configuration string indicating the particular configuration that should be translated
   *
   * @return A configuration string indicating the particular configuration that should be translated
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
   *
   * @return A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
   *
   */
  public final String getPartIds() {
    return this.partIds;
  }

  /**
   * Get Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
   *
   * @return Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
   *
   */
  public final String getFormatName() {
    return this.formatName;
  }

  /**
   * Get Whether to include topology id strings in parasolid output format.
   *
   * @return Whether to include topology id strings in parasolid output format.
   *
   */
  public final Boolean getIncludeExportIds() {
    return this.includeExportIds;
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
     * A configuration string indicating the particular configuration that should be translated
     */
    private String configuration;

    /**
     * A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
     */
    private String partIds;

    /**
     * Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
     */
    private String formatName;

    /**
     * Whether to include topology id strings in parasolid output format.
     */
    private Boolean includeExportIds;

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
     * Get A configuration string indicating the particular configuration that should be translated
     *
     * @return A configuration string indicating the particular configuration that should be translated
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set A configuration string indicating the particular configuration that should be translated
     *
     * @param value A configuration string indicating the particular configuration that should be translated
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
     *
     * @return A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
     *
     */
    public final String partIds() {
      return this.partIds;
    }

    /**
     * Set A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
     *
     * @param value A comma-separated list of part ids that should be translated. If not specified, all parts are translated.
     *
     * @return the Builder object.
     */
    public final Builder partIds(String value) {
      this.partIds = value;
      return this;
    }

    /**
     * Get Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
     *
     * @return Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
     *
     */
    public final String formatName() {
      return this.formatName;
    }

    /**
     * Set Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
     *
     * @param value Name of format into which this element should be translated. ONSHAPE indicates that the model file should be translated into a Part Studio or Assembly.
     *
     * @return the Builder object.
     */
    public final Builder formatName(String value) {
      this.formatName = value;
      return this;
    }

    /**
     * Get Whether to include topology id strings in parasolid output format.
     *
     * @return Whether to include topology id strings in parasolid output format.
     *
     */
    public final Boolean includeExportIds() {
      return this.includeExportIds;
    }

    /**
     * Set Whether to include topology id strings in parasolid output format.
     *
     * @param value Whether to include topology id strings in parasolid output format.
     *
     * @return the Builder object.
     */
    public final Builder includeExportIds(Boolean value) {
      this.includeExportIds = value;
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

    private PartStudiosCreateTranslationRequest build() {
      return new com.onshape.api.requests.PartStudiosCreateTranslationRequest(configuration,partIds,formatName,includeExportIds,storeInDocument,linkDocumentWorkspaceId);
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
    public final PartStudiosCreateTranslationResponse call(String did, WV wvType, String wv,
        String eid) throws OnshapeException {
      return onshape.call("post", "/partstudios/d/:did/[wv]/:wv/e/:eid/translations", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap(), com.onshape.api.responses.PartStudiosCreateTranslationResponse.class);
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
    public final PartStudiosCreateTranslationResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/partstudios/d/:did/[wv]/:wv/e/:eid/translations", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", WV.Workspace, "wv", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.PartStudiosCreateTranslationResponse.class);
    }
  }
}
