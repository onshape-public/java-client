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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.MetadataCategoryUpdatePropertyResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for updateProperty API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryUpdatePropertyRequest {
  /**
   * Property name
   */
  @JsonProperty("name")
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
  String ownerId;

  /**
   * Property owner type, which can be: 1:company
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
   */
  @JsonProperty("valueType")
  Number valueType;

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
  @JsonProperty("categoryPropertyConfigParams")
  MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams categoryPropertyConfigParams;

  /**
   * List of IDs of the categories to associate this property with
   */
  @JsonProperty("addToCategoryIds")
  String[] addToCategoryIds;

  /**
   * List of IDs of the categories to dis-associate this property from
   */
  @JsonProperty("removeFromCategoryIds")
  String[] removeFromCategoryIds;

  MetadataCategoryUpdatePropertyRequest(String name, String description, String ownerId,
      Number ownerType, Number valueType, Boolean isArray, String objectDefName,
      String blobMimeType, Boolean editableInVersion, Boolean editableInMicroversion,
      MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams categoryPropertyConfigParams,
      String[] addToCategoryIds, String[] removeFromCategoryIds) {
    this.name = name;
    this.description = description;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.valueType = valueType;
    this.isArray = isArray;
    this.objectDefName = objectDefName;
    this.blobMimeType = blobMimeType;
    this.editableInVersion = editableInVersion;
    this.editableInMicroversion = editableInMicroversion;
    this.categoryPropertyConfigParams = categoryPropertyConfigParams;
    this.addToCategoryIds = addToCategoryIds;
    this.removeFromCategoryIds = removeFromCategoryIds;
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
   * Get Property owner type, which can be: 1:company
   *
   * @return Property owner type, which can be: 1:company
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
  public final MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams getCategoryPropertyConfigParams() {
    return this.categoryPropertyConfigParams;
  }

  /**
   * Get List of IDs of the categories to associate this property with
   *
   * @return List of IDs of the categories to associate this property with
   *
   */
  public final String[] getAddToCategoryIds() {
    return this.addToCategoryIds;
  }

  /**
   * Get List of IDs of the categories to dis-associate this property from
   *
   * @return List of IDs of the categories to dis-associate this property from
   *
   */
  public final String[] getRemoveFromCategoryIds() {
    return this.removeFromCategoryIds;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Property name
     */
    private String name;

    /**
     * Property description
     */
    private String description;

    /**
     * Property owner ID
     */
    private String ownerId;

    /**
     * Property owner type, which can be: 1:company
     */
    private Number ownerType;

    /**
     * Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
     */
    private Number valueType;

    /**
     * True if property is an array type
     */
    private Boolean isArray;

    /**
     * Object type name if valueType == OBJECT (6)
     */
    private String objectDefName;

    /**
     * Blob mime type if valueType == BLOB (7)
     */
    private String blobMimeType;

    /**
     * True if this property can be edited in a Version
     */
    private Boolean editableInVersion;

    /**
     * True if this property can be edited in a Microversion
     */
    private Boolean editableInMicroversion;

    /**
     * Additional information about property
     */
    private MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams categoryPropertyConfigParams;

    /**
     * List of IDs of the categories to associate this property with
     */
    private String[] addToCategoryIds;

    /**
     * List of IDs of the categories to dis-associate this property from
     */
    private String[] removeFromCategoryIds;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Property name
     *
     * @return Property name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Property name
     *
     * @param value Property name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Property description
     *
     * @return Property description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Property description
     *
     * @param value Property description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Property owner ID
     *
     * @return Property owner ID
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set Property owner ID
     *
     * @param value Property owner ID
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get Property owner type, which can be: 1:company
     *
     * @return Property owner type, which can be: 1:company
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Property owner type, which can be: 1:company
     *
     * @param value Property owner type, which can be: 1:company
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
     *
     * @return Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
     *
     */
    public final Number valueType() {
      return this.valueType;
    }

    /**
     * Set Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
     *
     * @param value Value type of property, which can be: 0:STRING, 1:BOOL, 2:INT, 3:DOUBLE, 4:DATE, 5:ENUM, 6:OBJECT, 7:BLOB, 8:USER
     *
     * @return the Builder object.
     */
    public final Builder valueType(Number value) {
      this.valueType = value;
      return this;
    }

    /**
     * Get True if property is an array type
     *
     * @return True if property is an array type
     *
     */
    public final Boolean isArray() {
      return this.isArray;
    }

    /**
     * Set True if property is an array type
     *
     * @param value True if property is an array type
     *
     * @return the Builder object.
     */
    public final Builder isArray(Boolean value) {
      this.isArray = value;
      return this;
    }

    /**
     * Get Object type name if valueType == OBJECT (6)
     *
     * @return Object type name if valueType == OBJECT (6)
     *
     */
    public final String objectDefName() {
      return this.objectDefName;
    }

    /**
     * Set Object type name if valueType == OBJECT (6)
     *
     * @param value Object type name if valueType == OBJECT (6)
     *
     * @return the Builder object.
     */
    public final Builder objectDefName(String value) {
      this.objectDefName = value;
      return this;
    }

    /**
     * Get Blob mime type if valueType == BLOB (7)
     *
     * @return Blob mime type if valueType == BLOB (7)
     *
     */
    public final String blobMimeType() {
      return this.blobMimeType;
    }

    /**
     * Set Blob mime type if valueType == BLOB (7)
     *
     * @param value Blob mime type if valueType == BLOB (7)
     *
     * @return the Builder object.
     */
    public final Builder blobMimeType(String value) {
      this.blobMimeType = value;
      return this;
    }

    /**
     * Get True if this property can be edited in a Version
     *
     * @return True if this property can be edited in a Version
     *
     */
    public final Boolean editableInVersion() {
      return this.editableInVersion;
    }

    /**
     * Set True if this property can be edited in a Version
     *
     * @param value True if this property can be edited in a Version
     *
     * @return the Builder object.
     */
    public final Builder editableInVersion(Boolean value) {
      this.editableInVersion = value;
      return this;
    }

    /**
     * Get True if this property can be edited in a Microversion
     *
     * @return True if this property can be edited in a Microversion
     *
     */
    public final Boolean editableInMicroversion() {
      return this.editableInMicroversion;
    }

    /**
     * Set True if this property can be edited in a Microversion
     *
     * @param value True if this property can be edited in a Microversion
     *
     * @return the Builder object.
     */
    public final Builder editableInMicroversion(Boolean value) {
      this.editableInMicroversion = value;
      return this;
    }

    /**
     * Get Additional information about property
     *
     * @return Additional information about property
     *
     */
    public final MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams categoryPropertyConfigParams() {
      return this.categoryPropertyConfigParams;
    }

    /**
     * Set Additional information about property
     *
     * @param value Additional information about property
     *
     * @return the Builder object.
     */
    public final Builder categoryPropertyConfigParams(MetadataCategoryUpdatePropertyRequestCategoryPropertyConfigParams value) {
      this.categoryPropertyConfigParams = value;
      return this;
    }

    /**
     * Get List of IDs of the categories to associate this property with
     *
     * @return List of IDs of the categories to associate this property with
     *
     */
    public final String[] addToCategoryIds() {
      return this.addToCategoryIds;
    }

    /**
     * Set List of IDs of the categories to associate this property with
     *
     * @param value List of IDs of the categories to associate this property with
     *
     * @return the Builder object.
     */
    public final Builder addToCategoryIds(String[] value) {
      this.addToCategoryIds = value;
      return this;
    }

    /**
     * Get List of IDs of the categories to dis-associate this property from
     *
     * @return List of IDs of the categories to dis-associate this property from
     *
     */
    public final String[] removeFromCategoryIds() {
      return this.removeFromCategoryIds;
    }

    /**
     * Set List of IDs of the categories to dis-associate this property from
     *
     * @param value List of IDs of the categories to dis-associate this property from
     *
     * @return the Builder object.
     */
    public final Builder removeFromCategoryIds(String[] value) {
      this.removeFromCategoryIds = value;
      return this;
    }

    private MetadataCategoryUpdatePropertyRequest build() {
      return new com.onshape.api.requests.MetadataCategoryUpdatePropertyRequest(name,description,ownerId,ownerType,valueType,isArray,objectDefName,blobMimeType,editableInVersion,editableInMicroversion,categoryPropertyConfigParams,addToCategoryIds,removeFromCategoryIds);
    }

    /**
     * Calls updateProperty method, Update metadata property and associate or disassociate with/from categories
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Property ID
     *
     * @param Requesting owner id, required (Default: null) */
    public final MetadataCategoryUpdatePropertyResponse call(String pid, String Requesting) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/metadatacategory/property/:pid", build(), onshape.buildMap("pid", pid), onshape.buildMap("Requesting", Requesting), com.onshape.api.responses.MetadataCategoryUpdatePropertyResponse.class);
    }
  }
}
