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
public final class MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams {
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

  MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams(String displayName,
      Number publishState, Boolean required, String defaultValue, String pattern, Number minLength,
      Number maxLength, Number minValue, Number maxValue, Date minDate, Number maxDate,
      Number minCount, Number maxCount, Boolean multiline, Map[] enumValues) {
    this.displayName = displayName;
    this.publishState = publishState;
    this.required = required;
    this.defaultValue = defaultValue;
    this.pattern = pattern;
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.minValue = minValue;
    this.maxValue = maxValue;
    this.minDate = minDate;
    this.maxDate = maxDate;
    this.minCount = minCount;
    this.maxCount = maxCount;
    this.multiline = multiline;
    this.enumValues = enumValues;
  }

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
     * Display name of the property
     */
    private String displayName;

    /**
     * Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     */
    private Number publishState;

    /**
     * True if property is required to have a non-empty value
     */
    private Boolean required;

    /**
     * Default value, must be set if required == true
     */
    private String defaultValue;

    /**
     * Regular expression pattern validation for properties whose valueType == STRING (0)
     */
    private String pattern;

    /**
     * Min length validation for properties whose valueType == STRING (0)
     */
    private Number minLength;

    /**
     * Max length validation for properties whose valueType == STRING (0)
     */
    private Number maxLength;

    /**
     * Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
     */
    private Number minValue;

    /**
     * Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
     */
    private Number maxValue;

    /**
     * Min date validation for properties whose valueType == DATE (4)
     */
    private Date minDate;

    /**
     * Max date validation for properties whose valueType == DATE (4)
     */
    private Number maxDate;

    /**
     * Min count validation for properties whose valueType == USER (8)
     */
    private Number minCount;

    /**
     * Max count validation for properties whose valueType == USER (8)
     */
    private Number maxCount;

    /**
     * True if string input should be multiline. Only used if valueType == STRING (0)
     */
    private Boolean multiline;

    /**
     * Set of enum values if valueType == ENUM (5)
     */
    private Map[] enumValues;

    Builder() {
    }

    /**
     * Get Display name of the property
     *
     * @return Display name of the property
     *
     */
    public final String displayName() {
      return this.displayName;
    }

    /**
     * Set Display name of the property
     *
     * @param value Display name of the property
     *
     * @return the Builder object.
     */
    public final Builder displayName(String value) {
      this.displayName = value;
      return this;
    }

    /**
     * Get Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @return Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     */
    public final Number publishState() {
      return this.publishState;
    }

    /**
     * Set Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @param value Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @return the Builder object.
     */
    public final Builder publishState(Number value) {
      this.publishState = value;
      return this;
    }

    /**
     * Get True if property is required to have a non-empty value
     *
     * @return True if property is required to have a non-empty value
     *
     */
    public final Boolean required() {
      return this.required;
    }

    /**
     * Set True if property is required to have a non-empty value
     *
     * @param value True if property is required to have a non-empty value
     *
     * @return the Builder object.
     */
    public final Builder required(Boolean value) {
      this.required = value;
      return this;
    }

    /**
     * Get Default value, must be set if required == true
     *
     * @return Default value, must be set if required == true
     *
     */
    public final String defaultValue() {
      return this.defaultValue;
    }

    /**
     * Set Default value, must be set if required == true
     *
     * @param value Default value, must be set if required == true
     *
     * @return the Builder object.
     */
    public final Builder defaultValue(String value) {
      this.defaultValue = value;
      return this;
    }

    /**
     * Get Regular expression pattern validation for properties whose valueType == STRING (0)
     *
     * @return Regular expression pattern validation for properties whose valueType == STRING (0)
     *
     */
    public final String pattern() {
      return this.pattern;
    }

    /**
     * Set Regular expression pattern validation for properties whose valueType == STRING (0)
     *
     * @param value Regular expression pattern validation for properties whose valueType == STRING (0)
     *
     * @return the Builder object.
     */
    public final Builder pattern(String value) {
      this.pattern = value;
      return this;
    }

    /**
     * Get Min length validation for properties whose valueType == STRING (0)
     *
     * @return Min length validation for properties whose valueType == STRING (0)
     *
     */
    public final Number minLength() {
      return this.minLength;
    }

    /**
     * Set Min length validation for properties whose valueType == STRING (0)
     *
     * @param value Min length validation for properties whose valueType == STRING (0)
     *
     * @return the Builder object.
     */
    public final Builder minLength(Number value) {
      this.minLength = value;
      return this;
    }

    /**
     * Get Max length validation for properties whose valueType == STRING (0)
     *
     * @return Max length validation for properties whose valueType == STRING (0)
     *
     */
    public final Number maxLength() {
      return this.maxLength;
    }

    /**
     * Set Max length validation for properties whose valueType == STRING (0)
     *
     * @param value Max length validation for properties whose valueType == STRING (0)
     *
     * @return the Builder object.
     */
    public final Builder maxLength(Number value) {
      this.maxLength = value;
      return this;
    }

    /**
     * Get Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @return Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     */
    public final Number minValue() {
      return this.minValue;
    }

    /**
     * Set Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @param value Min value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @return the Builder object.
     */
    public final Builder minValue(Number value) {
      this.minValue = value;
      return this;
    }

    /**
     * Get Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @return Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     */
    public final Number maxValue() {
      return this.maxValue;
    }

    /**
     * Set Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @param value Max value validation for properties whose valueType == DOUBLE (3) or INT (2)
     *
     * @return the Builder object.
     */
    public final Builder maxValue(Number value) {
      this.maxValue = value;
      return this;
    }

    /**
     * Get Min date validation for properties whose valueType == DATE (4)
     *
     * @return Min date validation for properties whose valueType == DATE (4)
     *
     */
    public final Date minDate() {
      return this.minDate;
    }

    /**
     * Set Min date validation for properties whose valueType == DATE (4)
     *
     * @param value Min date validation for properties whose valueType == DATE (4)
     *
     * @return the Builder object.
     */
    public final Builder minDate(Date value) {
      this.minDate = value;
      return this;
    }

    /**
     * Get Max date validation for properties whose valueType == DATE (4)
     *
     * @return Max date validation for properties whose valueType == DATE (4)
     *
     */
    public final Number maxDate() {
      return this.maxDate;
    }

    /**
     * Set Max date validation for properties whose valueType == DATE (4)
     *
     * @param value Max date validation for properties whose valueType == DATE (4)
     *
     * @return the Builder object.
     */
    public final Builder maxDate(Number value) {
      this.maxDate = value;
      return this;
    }

    /**
     * Get Min count validation for properties whose valueType == USER (8)
     *
     * @return Min count validation for properties whose valueType == USER (8)
     *
     */
    public final Number minCount() {
      return this.minCount;
    }

    /**
     * Set Min count validation for properties whose valueType == USER (8)
     *
     * @param value Min count validation for properties whose valueType == USER (8)
     *
     * @return the Builder object.
     */
    public final Builder minCount(Number value) {
      this.minCount = value;
      return this;
    }

    /**
     * Get Max count validation for properties whose valueType == USER (8)
     *
     * @return Max count validation for properties whose valueType == USER (8)
     *
     */
    public final Number maxCount() {
      return this.maxCount;
    }

    /**
     * Set Max count validation for properties whose valueType == USER (8)
     *
     * @param value Max count validation for properties whose valueType == USER (8)
     *
     * @return the Builder object.
     */
    public final Builder maxCount(Number value) {
      this.maxCount = value;
      return this;
    }

    /**
     * Get True if string input should be multiline. Only used if valueType == STRING (0)
     *
     * @return True if string input should be multiline. Only used if valueType == STRING (0)
     *
     */
    public final Boolean multiline() {
      return this.multiline;
    }

    /**
     * Set True if string input should be multiline. Only used if valueType == STRING (0)
     *
     * @param value True if string input should be multiline. Only used if valueType == STRING (0)
     *
     * @return the Builder object.
     */
    public final Builder multiline(Boolean value) {
      this.multiline = value;
      return this;
    }

    /**
     * Get Set of enum values if valueType == ENUM (5)
     *
     * @return Set of enum values if valueType == ENUM (5)
     *
     */
    public final Map[] enumValues() {
      return this.enumValues;
    }

    /**
     * Set Set of enum values if valueType == ENUM (5)
     *
     * @param value Set of enum values if valueType == ENUM (5)
     *
     * @return the Builder object.
     */
    public final Builder enumValues(Map[] value) {
      this.enumValues = value;
      return this;
    }

    public final MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams build() {
      return new com.onshape.api.requests.MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams(displayName,publishState,required,defaultValue,pattern,minLength,maxLength,minValue,maxValue,minDate,maxDate,minCount,maxCount,multiline,enumValues);
    }
  }
}
