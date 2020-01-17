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
public final class PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChanges extends AbstractResponseObject {
  /**
   * Part name difference
   */
  @JsonProperty("name")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesName name;

  /**
   * Part appearance difference
   */
  @JsonProperty("appearance")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesAppearance appearance;

  /**
   * Part material difference
   */
  @JsonProperty("material")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesMaterial material;

  /**
   * Part visibility difference
   */
  @JsonProperty("visibility")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesVisibility visibility;

  /**
   * Part metadata difference
   */
  @JsonProperty("metadata")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesMetadata metadata;

  /**
   * Part geometry difference
   */
  @JsonProperty("geometry")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesGeometry geometry;

  /**
   * Part other data difference
   */
  @JsonProperty("other")
  public PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesOther other;

  /**
   * Get Part name difference
   *
   * @return Part name difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesName getName() {
    return this.name;
  }

  /**
   * Get Part appearance difference
   *
   * @return Part appearance difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Part material difference
   *
   * @return Part material difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Part visibility difference
   *
   * @return Part visibility difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesVisibility getVisibility() {
    return this.visibility;
  }

  /**
   * Get Part metadata difference
   *
   * @return Part metadata difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Get Part geometry difference
   *
   * @return Part geometry difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesGeometry getGeometry() {
    return this.geometry;
  }

  /**
   * Get Part other data difference
   *
   * @return Part other data difference
   *
   */
  public final PartStudiosComparePartStudioResponseChangesPartsCollectionChangesChangesOther getOther() {
    return this.other;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
