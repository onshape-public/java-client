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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getBodyDetails API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetBodyDetailsResponseBodiesFaces extends AbstractResponseObject {
  /**
   * Face ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * Orientation of a face
   */
  @JsonProperty("orientation")
  public Boolean orientation;

  /**
   * Area of a face
   */
  @JsonProperty("area")
  public Number area;

  /**
   * Loops of a face
   */
  @JsonProperty("loops")
  public PartStudiosGetBodyDetailsResponseBodiesFacesLoops[] loops;

  /**
   * Bounding box of a face
   */
  @JsonProperty("box")
  public PartStudiosGetBodyDetailsResponseBodiesFacesBox box;

  /**
   * Face surface info
   */
  @JsonProperty("surface")
  public PartStudiosGetBodyDetailsResponseBodiesFacesSurface surface;

  /**
   * Get Face ID
   *
   * @return Face ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Orientation of a face
   *
   * @return Orientation of a face
   *
   */
  public final Boolean getOrientation() {
    return this.orientation;
  }

  /**
   * Get Area of a face
   *
   * @return Area of a face
   *
   */
  public final Number getArea() {
    return this.area;
  }

  /**
   * Get Loops of a face
   *
   * @return Loops of a face
   *
   */
  public final PartStudiosGetBodyDetailsResponseBodiesFacesLoops[] getLoops() {
    return this.loops;
  }

  /**
   * Get Bounding box of a face
   *
   * @return Bounding box of a face
   *
   */
  public final PartStudiosGetBodyDetailsResponseBodiesFacesBox getBox() {
    return this.box;
  }

  /**
   * Get Face surface info
   *
   * @return Face surface info
   *
   */
  public final PartStudiosGetBodyDetailsResponseBodiesFacesSurface getSurface() {
    return this.surface;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
