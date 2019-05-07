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
import javax.validation.constraints.NotNull;

/**
 * Response object for getPropertyInfo API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class MetadataGetPropertyInfoResponse {
  /**
   * Property ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Property name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Property description
   */
  @JsonProperty("description")
  String description;

  /**
   * Property owner ID
   */
  @JsonProperty("ownerId")
  @NotNull
  String ownerId;

  /**
   * Property owner type, which can be: 1: company 2:onshape
   */
  @JsonProperty("ownerType")
  @NotNull
  Number ownerType;

  /**
   * Property namespace (use to disambiguate properties with same name)
   */
  @JsonProperty("namespace")
  String namespace;

  /**
   * Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   */
  @JsonProperty("valueType")
  @NotNull
  Number valueType;

  /**
   * True if property is an array type
   */
  @JsonProperty("array")
  @NotNull
  Boolean array;

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
  @NotNull
  Boolean editableInVersion;

  /**
   * True if this property can be edited in a Microversion
   */
  @JsonProperty("editableInMicroversion")
  @NotNull
  Boolean editableInMicroversion;

  /**
   * Safe name
   */
  @JsonProperty("safeName")
  String safeName;

  /**
   * Relative ordering of search importance. Baseline is 1.0
   */
  @JsonProperty("searchBoost")
  Number searchBoost;

  /**
   * Additional information about property only returned if schemaId is included in request
   */
  @JsonProperty("propertyConfigInfoList")
  @NotNull
  MetadataGetPropertyInfoResponsePropertyConfigInfoList[] propertyConfigInfoList;

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
   * Get Property owner type, which can be: 1: company 2:onshape
   *
   * @return Property owner type, which can be: 1: company 2:onshape
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
   * Get True if property is an array type
   *
   * @return True if property is an array type
   *
   */
  public final Boolean getArray() {
    return this.array;
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
   * Get Safe name
   *
   * @return Safe name
   *
   */
  public final String getSafeName() {
    return this.safeName;
  }

  /**
   * Get Relative ordering of search importance. Baseline is 1.0
   *
   * @return Relative ordering of search importance. Baseline is 1.0
   *
   */
  public final Number getSearchBoost() {
    return this.searchBoost;
  }

  /**
   * Get Additional information about property only returned if schemaId is included in request
   *
   * @return Additional information about property only returned if schemaId is included in request
   *
   */
  public final MetadataGetPropertyInfoResponsePropertyConfigInfoList[] getPropertyConfigInfoList() {
    return this.propertyConfigInfoList;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
