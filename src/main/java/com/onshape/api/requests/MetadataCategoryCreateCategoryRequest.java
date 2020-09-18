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
import com.onshape.api.responses.MetadataCategoryCreateCategoryResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createCategory API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryCreateCategoryRequest {
  /**
   * Category name
   */
  @JsonProperty("name")
  String name;

  /**
   * Category description
   */
  @JsonProperty("description")
  String description;

  /**
   * CompanyId that will own the category
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Owner type, which can be: 1:company
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   */
  @JsonProperty("objectType")
  @NotNull
  Number objectType;

  /**
   * List of metadata object types this category will be applicable for picking
   */
  @JsonProperty("objectTypes")
  Number[] objectTypes;

  /**
   * List of ids of the categories this category will be member of
   */
  @JsonProperty("memberCategoryIds")
  String[] memberCategoryIds;

  /**
   * Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  Number publishState;

  MetadataCategoryCreateCategoryRequest(String name, String description, String ownerId,
      Number ownerType, Number objectType, Number[] objectTypes, String[] memberCategoryIds,
      Number publishState) {
    this.name = name;
    this.description = description;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.objectType = objectType;
    this.objectTypes = objectTypes;
    this.memberCategoryIds = memberCategoryIds;
    this.publishState = publishState;
  }

  /**
   * Get Category name
   *
   * @return Category name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Category description
   *
   * @return Category description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get CompanyId that will own the category
   *
   * @return CompanyId that will own the category
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Owner type, which can be: 1:company
   *
   * @return Owner type, which can be: 1:company
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
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
   * Get List of metadata object types this category will be applicable for picking
   *
   * @return List of metadata object types this category will be applicable for picking
   *
   */
  public final Number[] getObjectTypes() {
    return this.objectTypes;
  }

  /**
   * Get List of ids of the categories this category will be member of
   *
   * @return List of ids of the categories this category will be member of
   *
   */
  public final String[] getMemberCategoryIds() {
    return this.memberCategoryIds;
  }

  /**
   * Get Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   * @return Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   */
  public final Number getPublishState() {
    return this.publishState;
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
     * Category name
     */
    private String name;

    /**
     * Category description
     */
    private String description;

    /**
     * CompanyId that will own the category
     */
    private String ownerId;

    /**
     * Owner type, which can be: 1:company
     */
    private Number ownerType;

    /**
     * Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
     */
    private Number objectType;

    /**
     * List of metadata object types this category will be applicable for picking
     */
    private Number[] objectTypes;

    /**
     * List of ids of the categories this category will be member of
     */
    private String[] memberCategoryIds;

    /**
     * Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     */
    private Number publishState;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Category name
     *
     * @return Category name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Category name
     *
     * @param value Category name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Category description
     *
     * @return Category description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Category description
     *
     * @param value Category description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get CompanyId that will own the category
     *
     * @return CompanyId that will own the category
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set CompanyId that will own the category
     *
     * @param value CompanyId that will own the category
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get Owner type, which can be: 1:company
     *
     * @return Owner type, which can be: 1:company
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Owner type, which can be: 1:company
     *
     * @param value Owner type, which can be: 1:company
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
     *
     * @return Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
     *
     */
    public final Number objectType() {
      return this.objectType;
    }

    /**
     * Set Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
     *
     * @param value Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
     *
     * @return the Builder object.
     */
    public final Builder objectType(Number value) {
      this.objectType = value;
      return this;
    }

    /**
     * Get List of metadata object types this category will be applicable for picking
     *
     * @return List of metadata object types this category will be applicable for picking
     *
     */
    public final Number[] objectTypes() {
      return this.objectTypes;
    }

    /**
     * Set List of metadata object types this category will be applicable for picking
     *
     * @param value List of metadata object types this category will be applicable for picking
     *
     * @return the Builder object.
     */
    public final Builder objectTypes(Number[] value) {
      this.objectTypes = value;
      return this;
    }

    /**
     * Get List of ids of the categories this category will be member of
     *
     * @return List of ids of the categories this category will be member of
     *
     */
    public final String[] memberCategoryIds() {
      return this.memberCategoryIds;
    }

    /**
     * Set List of ids of the categories this category will be member of
     *
     * @param value List of ids of the categories this category will be member of
     *
     * @return the Builder object.
     */
    public final Builder memberCategoryIds(String[] value) {
      this.memberCategoryIds = value;
      return this;
    }

    /**
     * Get Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @return Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     */
    public final Number publishState() {
      return this.publishState;
    }

    /**
     * Set Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @param value Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
     *
     * @return the Builder object.
     */
    public final Builder publishState(Number value) {
      this.publishState = value;
      return this;
    }

    private MetadataCategoryCreateCategoryRequest build() {
      return new com.onshape.api.requests.MetadataCategoryCreateCategoryRequest(name,description,ownerId,ownerType,objectType,objectTypes,memberCategoryIds,publishState);
    }

    /**
     * Calls createCategory method, Create metadata category
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final MetadataCategoryCreateCategoryResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/metadatacategory", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.MetadataCategoryCreateCategoryResponse.class);
    }
  }
}
