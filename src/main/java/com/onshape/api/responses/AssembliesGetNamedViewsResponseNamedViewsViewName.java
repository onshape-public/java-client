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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getNamedViews API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetNamedViewsResponseNamedViewsViewName {
  /**
   * the view matrix
   */
  @JsonProperty("viewMatrix")
  public Number[] viewMatrix;

  /**
   * true if this is a perspective projection
   */
  @JsonProperty("isPerspective")
  public Boolean isPerspective;

  /**
   * the viewport used by the camera for this view
   */
  @JsonProperty("cameraViewport")
  public Number[] cameraViewport;

  /**
   * the angle used for the perspective projection if applicable
   */
  @JsonProperty("angle")
  public Number angle;

  /**
   * Get the view matrix
   *
   * @return the view matrix
   *
   */
  public final Number[] getViewMatrix() {
    return this.viewMatrix;
  }

  /**
   * Get true if this is a perspective projection
   *
   * @return true if this is a perspective projection
   *
   */
  public final Boolean getIsPerspective() {
    return this.isPerspective;
  }

  /**
   * Get the viewport used by the camera for this view
   *
   * @return the viewport used by the camera for this view
   *
   */
  public final Number[] getCameraViewport() {
    return this.cameraViewport;
  }

  /**
   * Get the angle used for the perspective projection if applicable
   *
   * @return the angle used for the perspective projection if applicable
   *
   */
  public final Number getAngle() {
    return this.angle;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
