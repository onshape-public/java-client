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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Response object for createCategory API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryCreateCategoryResponse extends AbstractResponseObject {
  /**
   * Category id
   */
  @JsonProperty("id")
  String id;

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
   * CompanyId that owns the category
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Category owner type, which will be: 1:company, 2: onshape
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Category publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  Number publishState;

  /**
   * List of metadata object types this category is applicable for picking
   */
  @JsonProperty("objectTypes")
  Number[] objectTypes;

  /**
   * List of ids of the categories this category is member of
   */
  @JsonProperty("memberCategoryIds")
  String[] memberCategoryIds;

  /**
   * Array of member category info objects
   */
  @JsonProperty("memberCategories")
  MetadataCategoryCreateCategoryResponseMemberCategories[] memberCategories;

  /**
   * Get Category id
   *
   * @return Category id
   *
   */
  public final String getId() {
    return this.id;
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
   * Get CompanyId that owns the category
   *
   * @return CompanyId that owns the category
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Category owner type, which will be: 1:company, 2: onshape
   *
   * @return Category owner type, which will be: 1:company, 2: onshape
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
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

  /**
   * Get List of metadata object types this category is applicable for picking
   *
   * @return List of metadata object types this category is applicable for picking
   *
   */
  public final Number[] getObjectTypes() {
    return this.objectTypes;
  }

  /**
   * Get List of ids of the categories this category is member of
   *
   * @return List of ids of the categories this category is member of
   *
   */
  public final String[] getMemberCategoryIds() {
    return this.memberCategoryIds;
  }

  /**
   * Get Array of member category info objects
   *
   * @return Array of member category info objects
   *
   */
  public final MetadataCategoryCreateCategoryResponseMemberCategories[] getMemberCategories() {
    return this.memberCategories;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
