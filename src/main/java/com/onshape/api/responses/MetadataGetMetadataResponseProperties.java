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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataResponseProperties extends AbstractResponseObject {
  /**
   * Name
   */
  @JsonProperty("Name")
  public String Name;

  /**
   * Metadata schema object Id
   */
  @JsonProperty("schemaId")
  public String schemaId;

  /**
   * Metadata schema propertyId
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Schema property type, one of STRING, BOOL, INT, DOUBLE, DATE, ENUM, OBJECT
   */
  @JsonProperty("valueType")
  public String valueType;

  /**
   * True if the property is editable in current context
   */
  @JsonProperty("editable")
  public Boolean editable;

  /**
   * True if property value is required
   */
  @JsonProperty("required")
  public Boolean required;

  /**
   * Default value of the property as defined in the schema, JSON type of the field corresponds to the type of the property type in the schema
   */
  @JsonProperty("defaultValue")
  public Map defaultValue;

  /**
   * Property value, JSON type of the field corresponds to the type of the property type in the schema
   */
  @JsonProperty("value")
  public Map value;

  /**
   * Property validation information as defined in the schema
   */
  @JsonProperty("validator")
  public Map validator;

  /**
   * Get Name
   *
   * @return Name
   *
   */
  public final String getName() {
    return this.Name;
  }

  /**
   * Get Metadata schema object Id
   *
   * @return Metadata schema object Id
   *
   */
  public final String getSchemaId() {
    return this.schemaId;
  }

  /**
   * Get Metadata schema propertyId
   *
   * @return Metadata schema propertyId
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  /**
   * Get Schema property type, one of STRING, BOOL, INT, DOUBLE, DATE, ENUM, OBJECT
   *
   * @return Schema property type, one of STRING, BOOL, INT, DOUBLE, DATE, ENUM, OBJECT
   *
   */
  public final String getValueType() {
    return this.valueType;
  }

  /**
   * Get True if the property is editable in current context
   *
   * @return True if the property is editable in current context
   *
   */
  public final Boolean getEditable() {
    return this.editable;
  }

  /**
   * Get True if property value is required
   *
   * @return True if property value is required
   *
   */
  public final Boolean getRequired() {
    return this.required;
  }

  /**
   * Get Default value of the property as defined in the schema, JSON type of the field corresponds to the type of the property type in the schema
   *
   * @return Default value of the property as defined in the schema, JSON type of the field corresponds to the type of the property type in the schema
   *
   */
  public final Map getDefaultValue() {
    return this.defaultValue;
  }

  /**
   * Get Property value, JSON type of the field corresponds to the type of the property type in the schema
   *
   * @return Property value, JSON type of the field corresponds to the type of the property type in the schema
   *
   */
  public final Map getValue() {
    return this.value;
  }

  /**
   * Get Property validation information as defined in the schema
   *
   * @return Property validation information as defined in the schema
   *
   */
  public final Map getValidator() {
    return this.validator;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
