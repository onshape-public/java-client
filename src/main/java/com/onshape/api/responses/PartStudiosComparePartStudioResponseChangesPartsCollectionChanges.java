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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to comparePartStudio API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosComparePartStudioResponseChangesPartsCollectionChanges extends AbstractResponseObject {
  /**
   * Part Id of the Part in the source microversion, can be null for new Parts
   */
  @JsonProperty("sourceId")
  public String sourceId;

  /**
   * Part Id of the Part in the target microversion, can be null for deleted Parts
   */
  @JsonProperty("targetId")
  public String targetId;

  /**
   * Type of the change (see API description for values)
   */
  @JsonProperty("type")
  public String type;

  /**
   * Map of changes in a specific MODIFIED part
   */
  @JsonProperty("changes")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChanges changes;

  /**
   * Get Part Id of the Part in the source microversion, can be null for new Parts
   *
   * @return Part Id of the Part in the source microversion, can be null for new Parts
   *
   */
  public final String getSourceId() {
    return this.sourceId;
  }

  /**
   * Get Part Id of the Part in the target microversion, can be null for deleted Parts
   *
   * @return Part Id of the Part in the target microversion, can be null for deleted Parts
   *
   */
  public final String getTargetId() {
    return this.targetId;
  }

  /**
   * Get Type of the change (see API description for values)
   *
   * @return Type of the change (see API description for values)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Map of changes in a specific MODIFIED part
   *
   * @return Map of changes in a specific MODIFIED part
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChanges getChanges() {
    return this.changes;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
