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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getBoundingBoxes API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosGetBoundingBoxesResponse {
  /**
   * lowest X point
   */
  @JsonProperty("lowX")
  @NotNull
  Number lowX;

  /**
   * lowest Y point
   */
  @JsonProperty("lowY")
  @NotNull
  Number lowY;

  /**
   * lowest Z point
   */
  @JsonProperty("lowZ")
  @NotNull
  Number lowZ;

  /**
   * highest X point
   */
  @JsonProperty("highX")
  @NotNull
  Number highX;

  /**
   * highest Y point
   */
  @JsonProperty("highY")
  @NotNull
  Number highY;

  /**
   * highest Z point
   */
  @JsonProperty("highZ")
  @NotNull
  Number highZ;

  /**
   * Get lowest X point
   *
   * @return lowest X point
   *
   */
  public final Number getLowX() {
    return this.lowX;
  }

  /**
   * Get lowest Y point
   *
   * @return lowest Y point
   *
   */
  public final Number getLowY() {
    return this.lowY;
  }

  /**
   * Get lowest Z point
   *
   * @return lowest Z point
   *
   */
  public final Number getLowZ() {
    return this.lowZ;
  }

  /**
   * Get highest X point
   *
   * @return highest X point
   *
   */
  public final Number getHighX() {
    return this.highX;
  }

  /**
   * Get highest Y point
   *
   * @return highest Y point
   *
   */
  public final Number getHighY() {
    return this.highY;
  }

  /**
   * Get highest Z point
   *
   * @return highest Z point
   *
   */
  public final Number getHighZ() {
    return this.highZ;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
