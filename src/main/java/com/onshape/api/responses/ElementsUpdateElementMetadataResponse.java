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
import com.onshape.api.exceptions.OnshapeException;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for updateElementMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ElementsUpdateElementMetadataResponse {
  /**
   * Element name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Onshape internal use
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   */
  @JsonProperty("state")
  @NotNull
  String state;

  /**
   * Element type (PARTSTUDIO, ASSEMBLY, BLOB, etc.)
   */
  @JsonProperty("type")
  @NotNull
  String type;

  /**
   * Onshape internal use
   */
  @JsonProperty("dataType")
  @NotNull
  String dataType;

  /**
   * Onshape internal use
   */
  @JsonProperty("safeToShow")
  @NotNull
  Boolean safeToShow;

  /**
   * Element description (user-specified)
   */
  @JsonProperty("description")
  String description;

  /**
   * Onshape internal use
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Onshape internal use
   */
  @JsonProperty("supportsCollaboration")
  @NotNull
  Boolean supportsCollaboration;

  /**
   * Element part number (user-specified)
   */
  @JsonProperty("partNumber")
  String partNumber;

  /**
   * Element revision (user-specified)
   */
  @JsonProperty("revision")
  String revision;

  /**
   * Element vendor (user-specified)
   */
  @JsonProperty("vendor")
  String vendor;

  /**
   * Element project (user-specified)
   */
  @JsonProperty("project")
  String project;

  /**
   * Element product line (user-specified)
   */
  @JsonProperty("productLine")
  String productLine;

  /**
   * Element title 1 (user-specified)
   */
  @JsonProperty("title1")
  String title1;

  /**
   * Element title 2 (user-specified)
   */
  @JsonProperty("title2")
  String title2;

  /**
   * Element title 3 (user-specified)
   */
  @JsonProperty("title3")
  String title3;

  /**
   * Element ID
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * Custom element properties, if any
   */
  @JsonProperty("customProperties")
  ElementsUpdateElementMetadataResponseCustomProperties customProperties;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final ElementsUpdateElementMetadataResponse refresh(Onshape onshape) throws
      OnshapeException {
    return onshape.get(href, ElementsUpdateElementMetadataResponse.class);
  }

  /**
   * Get Element name
   *
   * @return Element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   *
   * @return Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   *
   */
  public final String getState() {
    return this.state;
  }

  /**
   * Get Element type (PARTSTUDIO, ASSEMBLY, BLOB, etc.)
   *
   * @return Element type (PARTSTUDIO, ASSEMBLY, BLOB, etc.)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getDataType() {
    return this.dataType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Boolean getSafeToShow() {
    return this.safeToShow;
  }

  /**
   * Get Element description (user-specified)
   *
   * @return Element description (user-specified)
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Boolean getSupportsCollaboration() {
    return this.supportsCollaboration;
  }

  /**
   * Get Element part number (user-specified)
   *
   * @return Element part number (user-specified)
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Element revision (user-specified)
   *
   * @return Element revision (user-specified)
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Element vendor (user-specified)
   *
   * @return Element vendor (user-specified)
   *
   */
  public final String getVendor() {
    return this.vendor;
  }

  /**
   * Get Element project (user-specified)
   *
   * @return Element project (user-specified)
   *
   */
  public final String getProject() {
    return this.project;
  }

  /**
   * Get Element product line (user-specified)
   *
   * @return Element product line (user-specified)
   *
   */
  public final String getProductLine() {
    return this.productLine;
  }

  /**
   * Get Element title 1 (user-specified)
   *
   * @return Element title 1 (user-specified)
   *
   */
  public final String getTitle1() {
    return this.title1;
  }

  /**
   * Get Element title 2 (user-specified)
   *
   * @return Element title 2 (user-specified)
   *
   */
  public final String getTitle2() {
    return this.title2;
  }

  /**
   * Get Element title 3 (user-specified)
   *
   * @return Element title 3 (user-specified)
   *
   */
  public final String getTitle3() {
    return this.title3;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Custom element properties, if any
   *
   * @return Custom element properties, if any
   *
   */
  public final ElementsUpdateElementMetadataResponseCustomProperties getCustomProperties() {
    return this.customProperties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
