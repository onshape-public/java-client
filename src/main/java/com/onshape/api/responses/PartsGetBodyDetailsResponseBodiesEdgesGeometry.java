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
 * Object used in calls to getBodyDetails API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartsGetBodyDetailsResponseBodiesEdgesGeometry extends AbstractResponseObject {
  /**
   * Start point
   */
  @JsonProperty("startPoint")
  public Number[] startPoint;

  /**
   * End point
   */
  @JsonProperty("endPoint")
  public Number[] endPoint;

  /**
   * Midpoint
   */
  @JsonProperty("midPoint")
  public Number[] midPoint;

  /**
   * Quarter point
   */
  @JsonProperty("quarterPoint")
  public Number[] quarterPoint;

  /**
   * Start vector
   */
  @JsonProperty("startVector")
  public Number[] startVector;

  /**
   * End vector
   */
  @JsonProperty("endVector")
  public Number[] endVector;

  /**
   * Edge length
   */
  @JsonProperty("length")
  public Number length;

  /**
   * Get Start point
   *
   * @return Start point
   *
   */
  public final Number[] getStartPoint() {
    return this.startPoint;
  }

  /**
   * Get End point
   *
   * @return End point
   *
   */
  public final Number[] getEndPoint() {
    return this.endPoint;
  }

  /**
   * Get Midpoint
   *
   * @return Midpoint
   *
   */
  public final Number[] getMidPoint() {
    return this.midPoint;
  }

  /**
   * Get Quarter point
   *
   * @return Quarter point
   *
   */
  public final Number[] getQuarterPoint() {
    return this.quarterPoint;
  }

  /**
   * Get Start vector
   *
   * @return Start vector
   *
   */
  public final Number[] getStartVector() {
    return this.startVector;
  }

  /**
   * Get End vector
   *
   * @return End vector
   *
   */
  public final Number[] getEndVector() {
    return this.endVector;
  }

  /**
   * Get Edge length
   *
   * @return Edge length
   *
   */
  public final Number getLength() {
    return this.length;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
