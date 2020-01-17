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

/**
 * Object used in calls to getMetadataSchemaProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataSchemaPropertiesResponseItems extends AbstractResponseObject {
  /**
   * Property ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * Property name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Property description
   */
  @JsonProperty("description")
  public String description;

  /**
   * Property owner ID
   */
  @JsonProperty("ownerId")
  public String ownerId;

  /**
   * Property owner type, which can be: 1: company, 2: onshape
   */
  @JsonProperty("ownerType")
  public Number ownerType;

  /**
   * Property namespace (use to disambiguate properties with same name)
   */
  @JsonProperty("namespace")
  public String namespace;

  /**
   * Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   */
  @JsonProperty("valueType")
  public Number valueType;

  /**
   * True if this property can be edited in a version.
   */
  @JsonProperty("editableInVersion")
  public Boolean editableInVersion;

  /**
   * True if this property can be edited in a workspace.
   */
  @JsonProperty("editableInMicroversion")
  public Boolean editableInMicroversion;

  /**
   * Additional information about property.
   */
  @JsonProperty("propertyConfigSummaryInfoList")
  public MetadataGetMetadataSchemaPropertiesResponseItemsPropertyConfigSummaryInfoList[] propertyConfigSummaryInfoList;

  /**
   * Get Property ID
   *
   * @return Property ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Property name
   *
   * @return Property name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Property description
   *
   * @return Property description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Property owner ID
   *
   * @return Property owner ID
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Property owner type, which can be: 1: company, 2: onshape
   *
   * @return Property owner type, which can be: 1: company, 2: onshape
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
  }

  /**
   * Get Property namespace (use to disambiguate properties with same name)
   *
   * @return Property namespace (use to disambiguate properties with same name)
   *
   */
  public final String getNamespace() {
    return this.namespace;
  }

  /**
   * Get Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   *
   * @return Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   *
   */
  public final Number getValueType() {
    return this.valueType;
  }

  /**
   * Get True if this property can be edited in a version.
   *
   * @return True if this property can be edited in a version.
   *
   */
  public final Boolean getEditableInVersion() {
    return this.editableInVersion;
  }

  /**
   * Get True if this property can be edited in a workspace.
   *
   * @return True if this property can be edited in a workspace.
   *
   */
  public final Boolean getEditableInMicroversion() {
    return this.editableInMicroversion;
  }

  /**
   * Get Additional information about property.
   *
   * @return Additional information about property.
   *
   */
  public final MetadataGetMetadataSchemaPropertiesResponseItemsPropertyConfigSummaryInfoList[] getPropertyConfigSummaryInfoList() {
    return this.propertyConfigSummaryInfoList;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
