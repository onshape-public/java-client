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
 * Object used in calls to createCategory API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryCreateCategoryResponseMemberCategories extends AbstractResponseObject {
  /**
   * Member category id
   */
  @JsonProperty("id")
  public String id;

  /**
   * Member category name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Member category description
   */
  @JsonProperty("description")
  public String description;

  /**
   * CompanyId that owns the member category
   */
  @JsonProperty("ownerId")
  public String ownerId;

  /**
   * Owner type, which will be: 1:company, 2: onshape
   */
  @JsonProperty("ownerType")
  public Number ownerType;

  /**
   * Member category publish state, which will be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  public Number publishState;

  /**
   * Get Member category id
   *
   * @return Member category id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Member category name
   *
   * @return Member category name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Member category description
   *
   * @return Member category description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get CompanyId that owns the member category
   *
   * @return CompanyId that owns the member category
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Owner type, which will be: 1:company, 2: onshape
   *
   * @return Owner type, which will be: 1:company, 2: onshape
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
  }

  /**
   * Get Member category publish state, which will be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   * @return Member category publish state, which will be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   */
  public final Number getPublishState() {
    return this.publishState;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
