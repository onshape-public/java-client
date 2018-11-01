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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to comparePartStudio API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosComparePartStudioResponseChangesParts {
  /**
   * Type of the differences in Part collection in the Part Studio (see API description for values)
   */
  @JsonProperty("type")
  public String type;

  /**
   * List of changes in Part Studio Parts collection
   */
  @JsonProperty("collectionChanges")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChanges[] collectionChanges;

  /**
   * Get Type of the differences in Part collection in the Part Studio (see API description for values)
   *
   * @return Type of the differences in Part collection in the Part Studio (see API description for values)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get List of changes in Part Studio Parts collection
   *
   * @return List of changes in Part Studio Parts collection
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChanges[] getCollectionChanges() {
    return this.collectionChanges;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
