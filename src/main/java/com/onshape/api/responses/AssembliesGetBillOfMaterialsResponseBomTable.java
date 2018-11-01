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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getBillOfMaterials API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetBillOfMaterialsResponseBomTable {
  /**
   * The version of the Onshape BOM JSON Standard that this response complies with
   */
  @JsonProperty("formatVersion")
  public String formatVersion;

  /**
   * The id of the BOM
   */
  @JsonProperty("id")
  public String id;

  /**
   * The name of the BOM
   */
  @JsonProperty("name")
  public String name;

  /**
   * The description of the BOM. Currently empty.
   */
  @JsonProperty("description")
  public String description;

  /**
   * The partNumber of the BOM. Currently empty.
   */
  @JsonProperty("partNumber")
  public String partNumber;

  /**
   * The UTC date and time the BOM data was exported.
   */
  @JsonProperty("createdAt")
  public String createdAt;

  /**
   * Describes the document, version/workspace, and element that the BOM was created from
   */
  @JsonProperty("bomSource")
  public AssembliesGetBillOfMaterialsResponseBomTableBomSource bomSource;

  /**
   * BOM table column headers
   */
  @JsonProperty("headers")
  public AssembliesGetBillOfMaterialsResponseBomTableHeaders[] headers;

  /**
   * The non-header rows of the BOM table.
   */
  @JsonProperty("items")
  public AssembliesGetBillOfMaterialsResponseBomTableItems[] items;

  /**
   * Get The version of the Onshape BOM JSON Standard that this response complies with
   *
   * @return The version of the Onshape BOM JSON Standard that this response complies with
   *
   */
  public final String getFormatVersion() {
    return this.formatVersion;
  }

  /**
   * Get The id of the BOM
   *
   * @return The id of the BOM
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get The name of the BOM
   *
   * @return The name of the BOM
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get The description of the BOM. Currently empty.
   *
   * @return The description of the BOM. Currently empty.
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get The partNumber of the BOM. Currently empty.
   *
   * @return The partNumber of the BOM. Currently empty.
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get The UTC date and time the BOM data was exported.
   *
   * @return The UTC date and time the BOM data was exported.
   *
   */
  public final String getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Get Describes the document, version/workspace, and element that the BOM was created from
   *
   * @return Describes the document, version/workspace, and element that the BOM was created from
   *
   */
  public final AssembliesGetBillOfMaterialsResponseBomTableBomSource getBomSource() {
    return this.bomSource;
  }

  /**
   * Get BOM table column headers
   *
   * @return BOM table column headers
   *
   */
  public final AssembliesGetBillOfMaterialsResponseBomTableHeaders[] getHeaders() {
    return this.headers;
  }

  /**
   * Get The non-header rows of the BOM table.
   *
   * @return The non-header rows of the BOM table.
   *
   */
  public final AssembliesGetBillOfMaterialsResponseBomTableItems[] getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
