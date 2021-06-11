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
 * Object used in calls to get API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CommentsGetResponseItemsViewData extends AbstractResponseObject {
  /**
   * The view matrix to use.
   */
  @JsonProperty("viewMatrix")
  public Number[] viewMatrix;

  /**
   * is perspective turned on.
   */
  @JsonProperty("isPerspective")
  public Boolean isPerspective;

  /**
   * camera viewport data associated with this comment.
   */
  @JsonProperty("cameraViewport")
  public Number[] cameraViewport;

  /**
   * camera angle.
   */
  @JsonProperty("angle")
  public Number angle;

  /**
   * Get The view matrix to use.
   *
   * @return The view matrix to use.
   *
   */
  public final Number[] getViewMatrix() {
    return this.viewMatrix;
  }

  /**
   * Get is perspective turned on.
   *
   * @return is perspective turned on.
   *
   */
  public final Boolean getIsPerspective() {
    return this.isPerspective;
  }

  /**
   * Get camera viewport data associated with this comment.
   *
   * @return camera viewport data associated with this comment.
   *
   */
  public final Number[] getCameraViewport() {
    return this.cameraViewport;
  }

  /**
   * Get camera angle.
   *
   * @return camera angle.
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
