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

/**
 * Object used in calls to createObsoletionPackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ReleaseManagementCreateObsoletionPackageResponseProperties {
  /**
   * User friendly name of the property
   */
  @JsonProperty("name")
  public String name;

  /**
   * Whether the property is editable
   */
  @JsonProperty("editable")
  public Boolean editable;

  /**
   * Whether the property is required
   */
  @JsonProperty("required")
  public Boolean required;

  /**
   * ID of the property to be used when updating
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * The current value of the property
   */
  @JsonProperty("value")
  public String value;

  /**
   * The value type of the property STRING BOOLEAN etc
   */
  @JsonProperty("valueType")
  public String valueType;

  /**
   * Get User friendly name of the property
   *
   * @return User friendly name of the property
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Whether the property is editable
   *
   * @return Whether the property is editable
   *
   */
  public final Boolean getEditable() {
    return this.editable;
  }

  /**
   * Get Whether the property is required
   *
   * @return Whether the property is required
   *
   */
  public final Boolean getRequired() {
    return this.required;
  }

  /**
   * Get ID of the property to be used when updating
   *
   * @return ID of the property to be used when updating
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  /**
   * Get The current value of the property
   *
   * @return The current value of the property
   *
   */
  public final String getValue() {
    return this.value;
  }

  /**
   * Get The value type of the property STRING BOOLEAN etc
   *
   * @return The value type of the property STRING BOOLEAN etc
   *
   */
  public final String getValueType() {
    return this.valueType;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
