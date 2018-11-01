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
import com.onshape.api.responses.PartsUpdatePartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updatePartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsUpdatePartMetadataRequest {
  /**
   * Configuration in which to apply updates
   */
  @JsonProperty("configuration")
  String configuration;

  /**
   * Part name (Can be only modified in workspace)
   */
  @JsonProperty("name")
  String name;

  /**
   * Part description
   */
  @JsonProperty("description")
  String description;

  /**
   * Part number
   */
  @JsonProperty("partNumber")
  String partNumber;

  /**
   * Part revision
   */
  @JsonProperty("revision")
  String revision;

  /**
   * Part vendor
   */
  @JsonProperty("vendor")
  String vendor;

  /**
   * Part project
   */
  @JsonProperty("project")
  String project;

  /**
   * Part product line
   */
  @JsonProperty("productLine")
  String productLine;

  /**
   * Part title 1
   */
  @JsonProperty("title1")
  String title1;

  /**
   * Part title 2
   */
  @JsonProperty("title2")
  String title2;

  /**
   * Part title 3
   */
  @JsonProperty("title3")
  String title3;

  /**
   * Part appearance (Can only be modified in workspace)
   */
  @JsonProperty("appearance")
  PartsUpdatePartMetadataRequestAppearance appearance;

  /**
   * Part material (Can only be modified in workspace)
   */
  @JsonProperty("material")
  PartsUpdatePartMetadataRequestMaterial material;

  /**
   * Custom properties
   */
  @JsonProperty("customProperties")
  @NotNull
  PartsUpdatePartMetadataRequestCustomProperties[] customProperties;

  PartsUpdatePartMetadataRequest(String configuration, String name, String description,
      String partNumber, String revision, String vendor, String project, String productLine,
      String title1, String title2, String title3,
      PartsUpdatePartMetadataRequestAppearance appearance,
      PartsUpdatePartMetadataRequestMaterial material,
      PartsUpdatePartMetadataRequestCustomProperties[] customProperties) {
    this.configuration = configuration;
    this.name = name;
    this.description = description;
    this.partNumber = partNumber;
    this.revision = revision;
    this.vendor = vendor;
    this.project = project;
    this.productLine = productLine;
    this.title1 = title1;
    this.title2 = title2;
    this.title3 = title3;
    this.appearance = appearance;
    this.material = material;
    this.customProperties = customProperties;
  }

  /**
   * Get Configuration in which to apply updates
   *
   * @return Configuration in which to apply updates
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Part name (Can be only modified in workspace)
   *
   * @return Part name (Can be only modified in workspace)
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Part description
   *
   * @return Part description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Part number
   *
   * @return Part number
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Part revision
   *
   * @return Part revision
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Part vendor
   *
   * @return Part vendor
   *
   */
  public final String getVendor() {
    return this.vendor;
  }

  /**
   * Get Part project
   *
   * @return Part project
   *
   */
  public final String getProject() {
    return this.project;
  }

  /**
   * Get Part product line
   *
   * @return Part product line
   *
   */
  public final String getProductLine() {
    return this.productLine;
  }

  /**
   * Get Part title 1
   *
   * @return Part title 1
   *
   */
  public final String getTitle1() {
    return this.title1;
  }

  /**
   * Get Part title 2
   *
   * @return Part title 2
   *
   */
  public final String getTitle2() {
    return this.title2;
  }

  /**
   * Get Part title 3
   *
   * @return Part title 3
   *
   */
  public final String getTitle3() {
    return this.title3;
  }

  /**
   * Get Part appearance (Can only be modified in workspace)
   *
   * @return Part appearance (Can only be modified in workspace)
   *
   */
  public final PartsUpdatePartMetadataRequestAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Part material (Can only be modified in workspace)
   *
   * @return Part material (Can only be modified in workspace)
   *
   */
  public final PartsUpdatePartMetadataRequestMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Custom properties
   *
   * @return Custom properties
   *
   */
  public final PartsUpdatePartMetadataRequestCustomProperties[] getCustomProperties() {
    return this.customProperties;
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
     * Configuration in which to apply updates
     */
    private String configuration;

    /**
     * Part name (Can be only modified in workspace)
     */
    private String name;

    /**
     * Part description
     */
    private String description;

    /**
     * Part number
     */
    private String partNumber;

    /**
     * Part revision
     */
    private String revision;

    /**
     * Part vendor
     */
    private String vendor;

    /**
     * Part project
     */
    private String project;

    /**
     * Part product line
     */
    private String productLine;

    /**
     * Part title 1
     */
    private String title1;

    /**
     * Part title 2
     */
    private String title2;

    /**
     * Part title 3
     */
    private String title3;

    /**
     * Part appearance (Can only be modified in workspace)
     */
    private PartsUpdatePartMetadataRequestAppearance appearance;

    /**
     * Part material (Can only be modified in workspace)
     */
    private PartsUpdatePartMetadataRequestMaterial material;

    /**
     * Custom properties
     */
    private PartsUpdatePartMetadataRequestCustomProperties[] customProperties;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Configuration in which to apply updates
     *
     * @return Configuration in which to apply updates
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration in which to apply updates
     *
     * @param value Configuration in which to apply updates
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get Part name (Can be only modified in workspace)
     *
     * @return Part name (Can be only modified in workspace)
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Part name (Can be only modified in workspace)
     *
     * @param value Part name (Can be only modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Part description
     *
     * @return Part description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Part description
     *
     * @param value Part description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Part number
     *
     * @return Part number
     *
     */
    public final String partNumber() {
      return this.partNumber;
    }

    /**
     * Set Part number
     *
     * @param value Part number
     *
     * @return the Builder object.
     */
    public final Builder partNumber(String value) {
      this.partNumber = value;
      return this;
    }

    /**
     * Get Part revision
     *
     * @return Part revision
     *
     */
    public final String revision() {
      return this.revision;
    }

    /**
     * Set Part revision
     *
     * @param value Part revision
     *
     * @return the Builder object.
     */
    public final Builder revision(String value) {
      this.revision = value;
      return this;
    }

    /**
     * Get Part vendor
     *
     * @return Part vendor
     *
     */
    public final String vendor() {
      return this.vendor;
    }

    /**
     * Set Part vendor
     *
     * @param value Part vendor
     *
     * @return the Builder object.
     */
    public final Builder vendor(String value) {
      this.vendor = value;
      return this;
    }

    /**
     * Get Part project
     *
     * @return Part project
     *
     */
    public final String project() {
      return this.project;
    }

    /**
     * Set Part project
     *
     * @param value Part project
     *
     * @return the Builder object.
     */
    public final Builder project(String value) {
      this.project = value;
      return this;
    }

    /**
     * Get Part product line
     *
     * @return Part product line
     *
     */
    public final String productLine() {
      return this.productLine;
    }

    /**
     * Set Part product line
     *
     * @param value Part product line
     *
     * @return the Builder object.
     */
    public final Builder productLine(String value) {
      this.productLine = value;
      return this;
    }

    /**
     * Get Part title 1
     *
     * @return Part title 1
     *
     */
    public final String title1() {
      return this.title1;
    }

    /**
     * Set Part title 1
     *
     * @param value Part title 1
     *
     * @return the Builder object.
     */
    public final Builder title1(String value) {
      this.title1 = value;
      return this;
    }

    /**
     * Get Part title 2
     *
     * @return Part title 2
     *
     */
    public final String title2() {
      return this.title2;
    }

    /**
     * Set Part title 2
     *
     * @param value Part title 2
     *
     * @return the Builder object.
     */
    public final Builder title2(String value) {
      this.title2 = value;
      return this;
    }

    /**
     * Get Part title 3
     *
     * @return Part title 3
     *
     */
    public final String title3() {
      return this.title3;
    }

    /**
     * Set Part title 3
     *
     * @param value Part title 3
     *
     * @return the Builder object.
     */
    public final Builder title3(String value) {
      this.title3 = value;
      return this;
    }

    /**
     * Get Part appearance (Can only be modified in workspace)
     *
     * @return Part appearance (Can only be modified in workspace)
     *
     */
    public final PartsUpdatePartMetadataRequestAppearance appearance() {
      return this.appearance;
    }

    /**
     * Set Part appearance (Can only be modified in workspace)
     *
     * @param value Part appearance (Can only be modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder appearance(PartsUpdatePartMetadataRequestAppearance value) {
      this.appearance = value;
      return this;
    }

    /**
     * Get Part material (Can only be modified in workspace)
     *
     * @return Part material (Can only be modified in workspace)
     *
     */
    public final PartsUpdatePartMetadataRequestMaterial material() {
      return this.material;
    }

    /**
     * Set Part material (Can only be modified in workspace)
     *
     * @param value Part material (Can only be modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder material(PartsUpdatePartMetadataRequestMaterial value) {
      this.material = value;
      return this;
    }

    /**
     * Get Custom properties
     *
     * @return Custom properties
     *
     */
    public final PartsUpdatePartMetadataRequestCustomProperties[] customProperties() {
      return this.customProperties;
    }

    /**
     * Set Custom properties
     *
     * @param value Custom properties
     *
     * @return the Builder object.
     */
    public final Builder customProperties(PartsUpdatePartMetadataRequestCustomProperties[] value) {
      this.customProperties = value;
      return this;
    }

    private PartsUpdatePartMetadataRequest build() {
      return new com.onshape.api.requests.PartsUpdatePartMetadataRequest(configuration,name,description,partNumber,revision,vendor,project,productLine,title1,title2,title3,appearance,material,customProperties);
    }

    /**
     * Calls updatePartMetadata method, Update a part's metadata
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
     * @param partid Part ID
     */
    public final PartsUpdatePartMetadataResponse call(String did, WVM wvmType, String wvm,
        String eid, String partid) throws OnshapeException {
      return onshape.call("post", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/metadata", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid, "partid", partid), onshape.buildMap(), com.onshape.api.responses.PartsUpdatePartMetadataResponse.class);
    }

    /**
     * Calls updatePartMetadata method, Update a part's metadata
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     */
    public final PartsUpdatePartMetadataResponse call(OnshapeDocument document, String partid)
        throws OnshapeException {
      return onshape.call("post", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/metadata", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId(), "partid", partid), onshape.buildMap(), com.onshape.api.responses.PartsUpdatePartMetadataResponse.class);
    }
  }
}
