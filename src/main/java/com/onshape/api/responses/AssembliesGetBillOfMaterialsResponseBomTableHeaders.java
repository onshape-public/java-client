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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getBillOfMaterials API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesGetBillOfMaterialsResponseBomTableHeaders extends AbstractResponseObject {
  /**
   * The name to be displayed for this column
   */
  @JsonProperty("name")
  public String name;

  /**
   * The field that this column will contain. The item objects below will contain the appropriate values for this field.
   */
  @JsonProperty("propertyName")
  public String propertyName;

  /**
   * Whether or not the header is visible in the Assembly BOM at this time
   */
  @JsonProperty("visible")
  public String visible;

  /**
   * The id of the metadata property that this column represents. Note that Item No. and Quantity are not true metadata properties.
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Get The name to be displayed for this column
   *
   * @return The name to be displayed for this column
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get The field that this column will contain. The item objects below will contain the appropriate values for this field.
   *
   * @return The field that this column will contain. The item objects below will contain the appropriate values for this field.
   *
   */
  public final String getPropertyName() {
    return this.propertyName;
  }

  /**
   * Get Whether or not the header is visible in the Assembly BOM at this time
   *
   * @return Whether or not the header is visible in the Assembly BOM at this time
   *
   */
  public final String getVisible() {
    return this.visible;
  }

  /**
   * Get The id of the metadata property that this column represents. Note that Item No. and Quantity are not true metadata properties.
   *
   * @return The id of the metadata property that this column represents. Note that Item No. and Quantity are not true metadata properties.
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
