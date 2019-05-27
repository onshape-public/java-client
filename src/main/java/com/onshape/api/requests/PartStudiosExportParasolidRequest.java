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
import com.onshape.api.responses.PartStudiosExportParasolidResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for exportParasolid API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosExportParasolidRequest {
  /**
   * Comma-separated list of part IDs to export (omit to export entire part studio)
   */
  @JsonProperty("partIds")
  String partIds;

  /**
   * Parasolid version
   */
  @JsonProperty("version")
  Number version;

  /**
   * Whether topolgy ids should be exported as parasolid attributes
   */
  @JsonProperty("includeExportIds")
  Boolean includeExportIds;

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

  PartStudiosExportParasolidRequest(String partIds, Number version, Boolean includeExportIds,
      String linkDocumentId, String configuration) {
    this.partIds = partIds;
    this.version = version;
    this.includeExportIds = includeExportIds;
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
     * Parasolid version
     */
    private Number version;

    /**
     * Whether topolgy ids should be exported as parasolid attributes
     */
    private Boolean includeExportIds;

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
     * Get Parasolid version
     *
     * @return Parasolid version
     *
     */
    public final Number version() {
      return this.version;
    }

    /**
     * Set Parasolid version
     *
     * @param value Parasolid version
     *
     * @return the Builder object.
     */
    public final Builder version(Number value) {
      this.version = value;
      return this;
    }

    /**
     * Get Whether topolgy ids should be exported as parasolid attributes
     *
     * @return Whether topolgy ids should be exported as parasolid attributes
     *
     */
    public final Boolean includeExportIds() {
      return this.includeExportIds;
    }

    /**
     * Set Whether topolgy ids should be exported as parasolid attributes
     *
     * @param value Whether topolgy ids should be exported as parasolid attributes
     *
     * @return the Builder object.
     */
    public final Builder includeExportIds(Boolean value) {
      this.includeExportIds = value;
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

    private PartStudiosExportParasolidRequest build() {
      return new com.onshape.api.requests.PartStudiosExportParasolidRequest(partIds,version,includeExportIds,linkDocumentId,configuration);
    }

    /**
     * Calls exportParasolid method, Export the part studio in text Parasolid format; returns a 307 redirect.
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
    public final PartStudiosExportParasolidResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/parasolid", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partIds", partIds, "version", version, "includeExportIds", includeExportIds, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportParasolidResponse.class);
    }

    /**
     * Calls exportParasolid method, Export the part studio in text Parasolid format; returns a 307 redirect.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosExportParasolidResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/parasolid", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("partIds", partIds, "version", version, "includeExportIds", includeExportIds, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosExportParasolidResponse.class);
    }
  }
}
