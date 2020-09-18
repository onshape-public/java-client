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
 * Object used in calls to getProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryGetPropertiesResponseItemsPropertyConfigSummaryInfoList extends AbstractResponseObject {
  /**
   * Property ID associated with this property config object
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   */
  @JsonProperty("objectType")
  public Number objectType;

  /**
   * Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   */
  @JsonProperty("publishState")
  public Number publishState;

  /**
   * Get Property ID associated with this property config object
   *
   * @return Property ID associated with this property config object
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
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
   * Get Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
   *
   * @return Property publish state, which can be: 0: PENDING, 1: ACTIVE, 2: INACTIVE
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
