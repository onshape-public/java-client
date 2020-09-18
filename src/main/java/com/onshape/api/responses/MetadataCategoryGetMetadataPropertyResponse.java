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
 * Response object for getMetadataProperty API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryGetMetadataPropertyResponse extends AbstractResponseObject {
  /**
   * Property ID
   */
  @JsonProperty("id")
  String id;

  /**
   * Property name
   */
  @JsonProperty("name")
  String name;

  /**
   * Property owner ID
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Property owner type, which can be: 1:company, 2: onshape
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   */
  @JsonProperty("valueType")
  Number valueType;

  /**
   * Property description
   */
  @JsonProperty("description")
  String description;

  /**
   * True if property is an array type
   */
  @JsonProperty("isArray")
  Boolean isArray;

  /**
   * Object type name if valueType == OBJECT (6)
   */
  @JsonProperty("objectDefName")
  String objectDefName;

  /**
   * Blob mime type if valueType == BLOB (7)
   */
  @JsonProperty("blobMimeType")
  String blobMimeType;

  /**
   * True if this property can be edited in a Version
   */
  @JsonProperty("editableInVersion")
  Boolean editableInVersion;

  /**
   * True if this property can be edited in a Microversion
   */
  @JsonProperty("editableInMicroversion")
  Boolean editableInMicroversion;

  /**
   * Additional information about property
   */
  @JsonProperty("categoryPropertyConfigInfo")
  MetadataCategoryGetMetadataPropertyResponseCategoryPropertyConfigInfo categoryPropertyConfigInfo;

  /**
   * List of member category summary info objects
   */
  @JsonProperty("categorySummaryInfoList")
  MetadataCategoryGetMetadataPropertyResponseCategorySummaryInfoList[] categorySummaryInfoList;

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
   * Get Property owner ID
   *
   * @return Property owner ID
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Property owner type, which can be: 1:company, 2: onshape
   *
   * @return Property owner type, which can be: 1:company, 2: onshape
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
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
   * Get Property description
   *
   * @return Property description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get True if property is an array type
   *
   * @return True if property is an array type
   *
   */
  public final Boolean getIsArray() {
    return this.isArray;
  }

  /**
   * Get Object type name if valueType == OBJECT (6)
   *
   * @return Object type name if valueType == OBJECT (6)
   *
   */
  public final String getObjectDefName() {
    return this.objectDefName;
  }

  /**
   * Get Blob mime type if valueType == BLOB (7)
   *
   * @return Blob mime type if valueType == BLOB (7)
   *
   */
  public final String getBlobMimeType() {
    return this.blobMimeType;
  }

  /**
   * Get True if this property can be edited in a Version
   *
   * @return True if this property can be edited in a Version
   *
   */
  public final Boolean getEditableInVersion() {
    return this.editableInVersion;
  }

  /**
   * Get True if this property can be edited in a Microversion
   *
   * @return True if this property can be edited in a Microversion
   *
   */
  public final Boolean getEditableInMicroversion() {
    return this.editableInMicroversion;
  }

  /**
   * Get Additional information about property
   *
   * @return Additional information about property
   *
   */
  public final MetadataCategoryGetMetadataPropertyResponseCategoryPropertyConfigInfo getCategoryPropertyConfigInfo() {
    return this.categoryPropertyConfigInfo;
  }

  /**
   * Get List of member category summary info objects
   *
   * @return List of member category summary info objects
   *
   */
  public final MetadataCategoryGetMetadataPropertyResponseCategorySummaryInfoList[] getCategorySummaryInfoList() {
    return this.categorySummaryInfoList;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
