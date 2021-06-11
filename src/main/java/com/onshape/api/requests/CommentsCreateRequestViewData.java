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
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to create API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CommentsCreateRequestViewData {
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

  CommentsCreateRequestViewData(Number[] viewMatrix, Boolean isPerspective, Number[] cameraViewport,
      Number angle) {
    this.viewMatrix = viewMatrix;
    this.isPerspective = isPerspective;
    this.cameraViewport = cameraViewport;
    this.angle = angle;
  }

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

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * The view matrix to use.
     */
    private Number[] viewMatrix;

    /**
     * is perspective turned on.
     */
    private Boolean isPerspective;

    /**
     * camera viewport data associated with this comment.
     */
    private Number[] cameraViewport;

    /**
     * camera angle.
     */
    private Number angle;

    Builder() {
    }

    /**
     * Get The view matrix to use.
     *
     * @return The view matrix to use.
     *
     */
    public final Number[] viewMatrix() {
      return this.viewMatrix;
    }

    /**
     * Set The view matrix to use.
     *
     * @param value The view matrix to use.
     *
     * @return the Builder object.
     */
    public final Builder viewMatrix(Number[] value) {
      this.viewMatrix = value;
      return this;
    }

    /**
     * Get is perspective turned on.
     *
     * @return is perspective turned on.
     *
     */
    public final Boolean isPerspective() {
      return this.isPerspective;
    }

    /**
     * Set is perspective turned on.
     *
     * @param value is perspective turned on.
     *
     * @return the Builder object.
     */
    public final Builder isPerspective(Boolean value) {
      this.isPerspective = value;
      return this;
    }

    /**
     * Get camera viewport data associated with this comment.
     *
     * @return camera viewport data associated with this comment.
     *
     */
    public final Number[] cameraViewport() {
      return this.cameraViewport;
    }

    /**
     * Set camera viewport data associated with this comment.
     *
     * @param value camera viewport data associated with this comment.
     *
     * @return the Builder object.
     */
    public final Builder cameraViewport(Number[] value) {
      this.cameraViewport = value;
      return this;
    }

    /**
     * Get camera angle.
     *
     * @return camera angle.
     *
     */
    public final Number angle() {
      return this.angle;
    }

    /**
     * Set camera angle.
     *
     * @param value camera angle.
     *
     * @return the Builder object.
     */
    public final Builder angle(Number value) {
      this.angle = value;
      return this;
    }

    public final CommentsCreateRequestViewData build() {
      return new com.onshape.api.requests.CommentsCreateRequestViewData(viewMatrix,isPerspective,cameraViewport,angle);
    }
  }
}
