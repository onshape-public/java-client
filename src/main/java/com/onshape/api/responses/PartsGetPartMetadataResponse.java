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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsGetPartMetadataResponse {
  /**
   * Part name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Part description (user-specified)
   */
  @JsonProperty("description")
  String description;

  /**
   * Part number (user-specified)
   */
  @JsonProperty("partNumber")
  String partNumber;

  /**
   * Part revision (user-specified)
   */
  @JsonProperty("revision")
  String revision;

  /**
   * Part vendor (user-specified)
   */
  @JsonProperty("vendor")
  String vendor;

  /**
   * Part project (user-specified)
   */
  @JsonProperty("project")
  String project;

  /**
   * Part product line (user-specified)
   */
  @JsonProperty("productLine")
  String productLine;

  /**
   * Part title 1 (user-specified)
   */
  @JsonProperty("title1")
  String title1;

  /**
   * Part title 2 (user-specified)
   */
  @JsonProperty("title2")
  String title2;

  /**
   * Part title 3 (user-specified)
   */
  @JsonProperty("title3")
  String title3;

  /**
   * Deterministic part ID
   */
  @JsonProperty("partId")
  @NotNull
  String partId;

  /**
   * Document microversion ID
   */
  @JsonProperty("microversionId")
  @NotNull
  String microversionId;

  /**
   * Part visibility
   */
  @JsonProperty("isHidden")
  @NotNull
  Boolean isHidden;

  /**
   * Part appearance info
   */
  @JsonProperty("appearance")
  @NotNull
  PartsGetPartMetadataResponseAppearance appearance;

  /**
   * Part material, if assigned
   */
  @JsonProperty("material")
  PartsGetPartMetadataResponseMaterial material;

  /**
   * Custom part properties, if any
   */
  @JsonProperty("customProperties")
  PartsGetPartMetadataResponseCustomProperties customProperties;

  /**
   * Get Part name
   *
   * @return Part name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Part description (user-specified)
   *
   * @return Part description (user-specified)
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Part number (user-specified)
   *
   * @return Part number (user-specified)
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Part revision (user-specified)
   *
   * @return Part revision (user-specified)
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Part vendor (user-specified)
   *
   * @return Part vendor (user-specified)
   *
   */
  public final String getVendor() {
    return this.vendor;
  }

  /**
   * Get Part project (user-specified)
   *
   * @return Part project (user-specified)
   *
   */
  public final String getProject() {
    return this.project;
  }

  /**
   * Get Part product line (user-specified)
   *
   * @return Part product line (user-specified)
   *
   */
  public final String getProductLine() {
    return this.productLine;
  }

  /**
   * Get Part title 1 (user-specified)
   *
   * @return Part title 1 (user-specified)
   *
   */
  public final String getTitle1() {
    return this.title1;
  }

  /**
   * Get Part title 2 (user-specified)
   *
   * @return Part title 2 (user-specified)
   *
   */
  public final String getTitle2() {
    return this.title2;
  }

  /**
   * Get Part title 3 (user-specified)
   *
   * @return Part title 3 (user-specified)
   *
   */
  public final String getTitle3() {
    return this.title3;
  }

  /**
   * Get Deterministic part ID
   *
   * @return Deterministic part ID
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Document microversion ID
   *
   * @return Document microversion ID
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Part visibility
   *
   * @return Part visibility
   *
   */
  public final Boolean getIsHidden() {
    return this.isHidden;
  }

  /**
   * Get Part appearance info
   *
   * @return Part appearance info
   *
   */
  public final PartsGetPartMetadataResponseAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Part material, if assigned
   *
   * @return Part material, if assigned
   *
   */
  public final PartsGetPartMetadataResponseMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Custom part properties, if any
   *
   * @return Custom part properties, if any
   *
   */
  public final PartsGetPartMetadataResponseCustomProperties getCustomProperties() {
    return this.customProperties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
