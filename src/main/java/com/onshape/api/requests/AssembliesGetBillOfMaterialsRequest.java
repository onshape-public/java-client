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
import com.onshape.api.responses.AssembliesGetBillOfMaterialsResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getBillOfMaterials API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesGetBillOfMaterialsRequest {
  /**
   * if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
   */
  @JsonProperty("metadataWorkspaceId")
  String metadataWorkspaceId;

  /**
   * Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
   */
  @JsonProperty("bomColumnIds")
  String bomColumnIds;

  /**
   * If true will return an indented bom, otherwise a parts list will be returned
   */
  @JsonProperty("indented")
  Boolean indented;

  /**
   * Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
   */
  @JsonProperty("multiLevel")
  Boolean multiLevel;

  /**
   * If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
   */
  @JsonProperty("generateIfAbsent")
  Boolean generateIfAbsent;

  AssembliesGetBillOfMaterialsRequest(String metadataWorkspaceId, String bomColumnIds,
      Boolean indented, Boolean multiLevel, Boolean generateIfAbsent) {
    this.metadataWorkspaceId = metadataWorkspaceId;
    this.bomColumnIds = bomColumnIds;
    this.indented = indented;
    this.multiLevel = multiLevel;
    this.generateIfAbsent = generateIfAbsent;
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
     * if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
     */
    private String metadataWorkspaceId;

    /**
     * Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
     */
    private String bomColumnIds;

    /**
     * If true will return an indented bom, otherwise a parts list will be returned
     */
    private Boolean indented;

    /**
     * Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
     */
    private Boolean multiLevel;

    /**
     * If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
     */
    private Boolean generateIfAbsent;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
     *
     * @return if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
     *
     */
    public final String metadataWorkspaceId() {
      return this.metadataWorkspaceId;
    }

    /**
     * Set if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
     *
     * @param value if m is specified for [wvm] this workspaceId is required and is used to retrieve metadata, otherwise it is ignored.
     *
     * @return the Builder object.
     */
    public final Builder metadataWorkspaceId(String value) {
      this.metadataWorkspaceId = value;
      return this;
    }

    /**
     * Get Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
     *
     * @return Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
     *
     */
    public final String bomColumnIds() {
      return this.bomColumnIds;
    }

    /**
     * Set Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
     *
     * @param value Ids of the columns to include, or empty if all. BOM column ids correspond to the ids of metadata properties retrieved from BTRestMetadataSchema, with the exception of billOfMaterialsItemNo and billOfMaterialsQuantity which identify the Item Number and Quantity columns respectively
     *
     * @return the Builder object.
     */
    public final Builder bomColumnIds(String value) {
      this.bomColumnIds = value;
      return this;
    }

    /**
     * Get If true will return an indented bom, otherwise a parts list will be returned
     *
     * @return If true will return an indented bom, otherwise a parts list will be returned
     *
     */
    public final Boolean indented() {
      return this.indented;
    }

    /**
     * Set If true will return an indented bom, otherwise a parts list will be returned
     *
     * @param value If true will return an indented bom, otherwise a parts list will be returned
     *
     * @return the Builder object.
     */
    public final Builder indented(Boolean value) {
      this.indented = value;
      return this;
    }

    /**
     * Get Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
     *
     * @return Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
     *
     */
    public final Boolean multiLevel() {
      return this.multiLevel;
    }

    /**
     * Set Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
     *
     * @param value Will return a multilevel bom if true, otherwise returns a top level bom. Ignored if indented is false.
     *
     * @return the Builder object.
     */
    public final Builder multiLevel(Boolean value) {
      this.multiLevel = value;
      return this;
    }

    /**
     * Get If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
     *
     * @return If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
     *
     */
    public final Boolean generateIfAbsent() {
      return this.generateIfAbsent;
    }

    /**
     * Set If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
     *
     * @param value If this is false and the BOM does not exist for the Assembly a 404 status code will be returned. Otherwise, the contents will be generated and returned, without creating the BOM element.
     *
     * @return the Builder object.
     */
    public final Builder generateIfAbsent(Boolean value) {
      this.generateIfAbsent = value;
      return this;
    }

    private AssembliesGetBillOfMaterialsRequest build() {
      return new com.onshape.api.requests.AssembliesGetBillOfMaterialsRequest(metadataWorkspaceId,bomColumnIds,indented,multiLevel,generateIfAbsent);
    }

    /**
     * Calls getBillOfMaterials method, Get content of the bill of materials in json format matching the Onshape BOM Standard for the
     *                 specified assembly
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
    public final AssembliesGetBillOfMaterialsResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/bom", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("metadataWorkspaceId", metadataWorkspaceId, "bomColumnIds", bomColumnIds, "indented", indented, "multiLevel", multiLevel, "generateIfAbsent", generateIfAbsent), com.onshape.api.responses.AssembliesGetBillOfMaterialsResponse.class);
    }

    /**
     * Calls getBillOfMaterials method, Get content of the bill of materials in json format matching the Onshape BOM Standard for the
     *                 specified assembly
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesGetBillOfMaterialsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/bom", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesGetBillOfMaterialsResponse.class);
    }
  }
}
