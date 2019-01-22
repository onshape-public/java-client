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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getPropertyInfo API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class MetadataGetPropertyInfoResponsePropertyConfigInfoList {
  /**
   * Schema ID associated with this property config object
   */
  @JsonProperty("schemaId")
  public String schemaId;

  /**
   * Property ID associated with this property config object
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   */
  @JsonProperty("objectType")
  public Number objectType;

  /**
   * Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  public Number publishState;

  /**
   * Set of enum values if valueType == ENUM (5)
   */
  @JsonProperty("enumValues")
  public Map[] enumValues;

  /**
   * True if property is required to have a non-empty value
   */
  @JsonProperty("required")
  public Boolean required;

  /**
   * Default value, must be set if required == true
   */
  @JsonProperty("defaultValue")
  public String defaultValue;

  /**
   * Regular expression pattern validation for properties whose valueType == STRING (0)
   */
  @JsonProperty("pattern")
  public String pattern;

  /**
   * Min length validation for properties whose valueType == STRING
   */
  @JsonProperty("minLength")
  public Number minLength;

  /**
   * Max length validation for properties whose valueType == STRING
   */
  @JsonProperty("maxLength")
  public Number maxLength;

  /**
   * Min value validation for properties whose valueType == DOUBLE or INT
   */
  @JsonProperty("minValue")
  public Number minValue;

  /**
   * Max value validation for properties whose valueType == DOUBLE or INT
   */
  @JsonProperty("maxValue")
  public Number maxValue;

  /**
   * True if string input should be multiline. Only used if valueType == STRING
   */
  @JsonProperty("multiline")
  public Boolean multiline;

  /**
   * Get Schema ID associated with this property config object
   *
   * @return Schema ID associated with this property config object
   *
   */
  public final String getSchemaId() {
    return this.schemaId;
  }

  /**
   * Get Property ID associated with this property config object
   *
   * @return Property ID associated with this property config object
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  /**
   * Get Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   *
   * @return Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   *
   */
  public final Number getObjectType() {
    return this.objectType;
  }

  /**
   * Get Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   * @return Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   */
  public final Number getPublishState() {
    return this.publishState;
  }

  /**
   * Get Set of enum values if valueType == ENUM (5)
   *
   * @return Set of enum values if valueType == ENUM (5)
   *
   */
  public final Map[] getEnumValues() {
    return this.enumValues;
  }

  /**
   * Get True if property is required to have a non-empty value
   *
   * @return True if property is required to have a non-empty value
   *
   */
  public final Boolean getRequired() {
    return this.required;
  }

  /**
   * Get Default value, must be set if required == true
   *
   * @return Default value, must be set if required == true
   *
   */
  public final String getDefaultValue() {
    return this.defaultValue;
  }

  /**
   * Get Regular expression pattern validation for properties whose valueType == STRING (0)
   *
   * @return Regular expression pattern validation for properties whose valueType == STRING (0)
   *
   */
  public final String getPattern() {
    return this.pattern;
  }

  /**
   * Get Min length validation for properties whose valueType == STRING
   *
   * @return Min length validation for properties whose valueType == STRING
   *
   */
  public final Number getMinLength() {
    return this.minLength;
  }

  /**
   * Get Max length validation for properties whose valueType == STRING
   *
   * @return Max length validation for properties whose valueType == STRING
   *
   */
  public final Number getMaxLength() {
    return this.maxLength;
  }

  /**
   * Get Min value validation for properties whose valueType == DOUBLE or INT
   *
   * @return Min value validation for properties whose valueType == DOUBLE or INT
   *
   */
  public final Number getMinValue() {
    return this.minValue;
  }

  /**
   * Get Max value validation for properties whose valueType == DOUBLE or INT
   *
   * @return Max value validation for properties whose valueType == DOUBLE or INT
   *
   */
  public final Number getMaxValue() {
    return this.maxValue;
  }

  /**
   * Get True if string input should be multiline. Only used if valueType == STRING
   *
   * @return True if string input should be multiline. Only used if valueType == STRING
   *
   */
  public final Boolean getMultiline() {
    return this.multiline;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
