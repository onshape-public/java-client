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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to batchUpdatePartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsBatchUpdatePartMetadataRequestParts {
  /**
   * The element ID of the Part Studio containing the part to update
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Configuration in which to apply updates
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Deterministic part ID of the part to update
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Part name (Name can only be modified in workspace)
   */
  @JsonProperty("name")
  public String name;

  /**
   * Part description
   */
  @JsonProperty("description")
  public String description;

  /**
   * Part number
   */
  @JsonProperty("partNumber")
  public String partNumber;

  /**
   * Part revision
   */
  @JsonProperty("revision")
  public String revision;

  /**
   * Part vendor
   */
  @JsonProperty("vendor")
  public String vendor;

  /**
   * Part project
   */
  @JsonProperty("project")
  public String project;

  /**
   * Part product line
   */
  @JsonProperty("productLine")
  public String productLine;

  /**
   * Part title 1
   */
  @JsonProperty("title1")
  public String title1;

  /**
   * Part title 2
   */
  @JsonProperty("title2")
  public String title2;

  /**
   * Part title 3
   */
  @JsonProperty("title3")
  public String title3;

  /**
   * Part appearance (Appearance can only be modified in workspace)
   */
  @JsonProperty("appearance")
  public PartsBatchUpdatePartMetadataRequestPartsAppearance appearance;

  /**
   * Part material (Material can only be modified in workspace)
   */
  @JsonProperty("material")
  public PartsBatchUpdatePartMetadataRequestPartsMaterial material;

  /**
   * Custom properties
   */
  @JsonProperty("customProperties")
  public PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] customProperties;

  PartsBatchUpdatePartMetadataRequestParts(String elementId, String configuration, String partId,
      String name, String description, String partNumber, String revision, String vendor,
      String project, String productLine, String title1, String title2, String title3,
      PartsBatchUpdatePartMetadataRequestPartsAppearance appearance,
      PartsBatchUpdatePartMetadataRequestPartsMaterial material,
      PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] customProperties) {
    this.elementId = elementId;
    this.configuration = configuration;
    this.partId = partId;
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
   * Get The element ID of the Part Studio containing the part to update
   *
   * @return The element ID of the Part Studio containing the part to update
   *
   */
  public final String getElementId() {
    return this.elementId;
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
   * Get Deterministic part ID of the part to update
   *
   * @return Deterministic part ID of the part to update
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Part name (Name can only be modified in workspace)
   *
   * @return Part name (Name can only be modified in workspace)
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
   * Get Part appearance (Appearance can only be modified in workspace)
   *
   * @return Part appearance (Appearance can only be modified in workspace)
   *
   */
  public final PartsBatchUpdatePartMetadataRequestPartsAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Part material (Material can only be modified in workspace)
   *
   * @return Part material (Material can only be modified in workspace)
   *
   */
  public final PartsBatchUpdatePartMetadataRequestPartsMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Custom properties
   *
   * @return Custom properties
   *
   */
  public final PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] getCustomProperties() {
    return this.customProperties;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * The element ID of the Part Studio containing the part to update
     */
    private String elementId;

    /**
     * Configuration in which to apply updates
     */
    private String configuration;

    /**
     * Deterministic part ID of the part to update
     */
    private String partId;

    /**
     * Part name (Name can only be modified in workspace)
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
     * Part appearance (Appearance can only be modified in workspace)
     */
    private PartsBatchUpdatePartMetadataRequestPartsAppearance appearance;

    /**
     * Part material (Material can only be modified in workspace)
     */
    private PartsBatchUpdatePartMetadataRequestPartsMaterial material;

    /**
     * Custom properties
     */
    private PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] customProperties;

    Builder() {
    }

    /**
     * Get The element ID of the Part Studio containing the part to update
     *
     * @return The element ID of the Part Studio containing the part to update
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set The element ID of the Part Studio containing the part to update
     *
     * @param value The element ID of the Part Studio containing the part to update
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
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
     * Get Deterministic part ID of the part to update
     *
     * @return Deterministic part ID of the part to update
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set Deterministic part ID of the part to update
     *
     * @param value Deterministic part ID of the part to update
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get Part name (Name can only be modified in workspace)
     *
     * @return Part name (Name can only be modified in workspace)
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Part name (Name can only be modified in workspace)
     *
     * @param value Part name (Name can only be modified in workspace)
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
     * Get Part appearance (Appearance can only be modified in workspace)
     *
     * @return Part appearance (Appearance can only be modified in workspace)
     *
     */
    public final PartsBatchUpdatePartMetadataRequestPartsAppearance appearance() {
      return this.appearance;
    }

    /**
     * Set Part appearance (Appearance can only be modified in workspace)
     *
     * @param value Part appearance (Appearance can only be modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder appearance(PartsBatchUpdatePartMetadataRequestPartsAppearance value) {
      this.appearance = value;
      return this;
    }

    /**
     * Get Part material (Material can only be modified in workspace)
     *
     * @return Part material (Material can only be modified in workspace)
     *
     */
    public final PartsBatchUpdatePartMetadataRequestPartsMaterial material() {
      return this.material;
    }

    /**
     * Set Part material (Material can only be modified in workspace)
     *
     * @param value Part material (Material can only be modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder material(PartsBatchUpdatePartMetadataRequestPartsMaterial value) {
      this.material = value;
      return this;
    }

    /**
     * Get Custom properties
     *
     * @return Custom properties
     *
     */
    public final PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] customProperties() {
      return this.customProperties;
    }

    /**
     * Set Custom properties
     *
     * @param value Custom properties
     *
     * @return the Builder object.
     */
    public final Builder customProperties(PartsBatchUpdatePartMetadataRequestPartsCustomProperties[] value) {
      this.customProperties = value;
      return this;
    }

    public final PartsBatchUpdatePartMetadataRequestParts build() {
      return new com.onshape.api.requests.PartsBatchUpdatePartMetadataRequestParts(elementId,configuration,partId,name,description,partNumber,revision,vendor,project,productLine,title1,title2,title3,appearance,material,customProperties);
    }
  }
}
