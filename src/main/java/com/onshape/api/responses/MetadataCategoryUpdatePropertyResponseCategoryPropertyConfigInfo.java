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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.Map;

/**
 * Object used in calls to updateProperty API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryUpdatePropertyResponseCategoryPropertyConfigInfo extends AbstractResponseObject {
  /**
   * Display name of the property
   */
  @JsonProperty("displayName")
  public String displayName;

  /**
   * Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  public Number publishState;

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
   * Min length validation for properties whose valueType == STRING (0)
   */
  @JsonProperty("minLength")
  public Number minLength;

  /**
   * Max length validation for properties whose valueType == STRING (0)
   */
  @JsonProperty("maxLength")
  public Number maxLength;

  /**
   * Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
   */
  @JsonProperty("minValue")
  public Number minValue;

  /**
   * Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
   */
  @JsonProperty("maxValue")
  public Number maxValue;

  /**
   * Min date validation for properties whose valueType == DATE (4)
   */
  @JsonProperty("minDate")
  public Date minDate;

  /**
   * Max date validation for properties whose valueType == DATE (4)
   */
  @JsonProperty("maxDate")
  public Number maxDate;

  /**
   * Min count validation for properties whose valueType == USER (8)
   */
  @JsonProperty("minCount")
  public Number minCount;

  /**
   * Max count validation for properties whose valueType == USER (8)
   */
  @JsonProperty("maxCount")
  public Number maxCount;

  /**
   * True if string input should be multiline. Only used if valueType == STRING (0)
   */
  @JsonProperty("multiline")
  public Boolean multiline;

  /**
   * Set of enum values if valueType == ENUM (5)
   */
  @JsonProperty("enumValues")
  public Map[] enumValues;

  /**
   * Get Display name of the property
   *
   * @return Display name of the property
   *
   */
  public final String getDisplayName() {
    return this.displayName;
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
   * Get Min length validation for properties whose valueType == STRING (0)
   *
   * @return Min length validation for properties whose valueType == STRING (0)
   *
   */
  public final Number getMinLength() {
    return this.minLength;
  }

  /**
   * Get Max length validation for properties whose valueType == STRING (0)
   *
   * @return Max length validation for properties whose valueType == STRING (0)
   *
   */
  public final Number getMaxLength() {
    return this.maxLength;
  }

  /**
   * Get Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
   *
   * @return Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
   *
   */
  public final Number getMinValue() {
    return this.minValue;
  }

  /**
   * Get Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
   *
   * @return Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
   *
   */
  public final Number getMaxValue() {
    return this.maxValue;
  }

  /**
   * Get Min date validation for properties whose valueType == DATE (4)
   *
   * @return Min date validation for properties whose valueType == DATE (4)
   *
   */
  public final Date getMinDate() {
    return this.minDate;
  }

  /**
   * Get Max date validation for properties whose valueType == DATE (4)
   *
   * @return Max date validation for properties whose valueType == DATE (4)
   *
   */
  public final Number getMaxDate() {
    return this.maxDate;
  }

  /**
   * Get Min count validation for properties whose valueType == USER (8)
   *
   * @return Min count validation for properties whose valueType == USER (8)
   *
   */
  public final Number getMinCount() {
    return this.minCount;
  }

  /**
   * Get Max count validation for properties whose valueType == USER (8)
   *
   * @return Max count validation for properties whose valueType == USER (8)
   *
   */
  public final Number getMaxCount() {
    return this.maxCount;
  }

  /**
   * Get True if string input should be multiline. Only used if valueType == STRING (0)
   *
   * @return True if string input should be multiline. Only used if valueType == STRING (0)
   *
   */
  public final Boolean getMultiline() {
    return this.multiline;
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

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
