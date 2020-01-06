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
 * Object used in calls to getNamedViews API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetNamedViewsResponseNamedViewsValueSectionPlanes extends AbstractResponseObject {
  /**
   * A 3-element array storing the center vector of a section plane
   */
  @JsonProperty("center")
  public Number center;

  /**
   * A 3-element array storing the tangent vector of a section plane
   */
  @JsonProperty("tangent")
  public Number tangent;

  /**
   * A 3-element array storing the normal vector of a section plane
   */
  @JsonProperty("normal")
  public Number normal;

  /**
   * Get A 3-element array storing the center vector of a section plane
   *
   * @return A 3-element array storing the center vector of a section plane
   *
   */
  public final Number getCenter() {
    return this.center;
  }

  /**
   * Get A 3-element array storing the tangent vector of a section plane
   *
   * @return A 3-element array storing the tangent vector of a section plane
   *
   */
  public final Number getTangent() {
    return this.tangent;
  }

  /**
   * Get A 3-element array storing the normal vector of a section plane
   *
   * @return A 3-element array storing the normal vector of a section plane
   *
   */
  public final Number getNormal() {
    return this.normal;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
