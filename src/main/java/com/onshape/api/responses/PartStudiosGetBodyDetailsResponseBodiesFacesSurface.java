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

/**
 * Object used in calls to getBodyDetails API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosGetBodyDetailsResponseBodiesFacesSurface {
  /**
   * Surface type - this can be one of &quot;cone&quot;, &quot;cylinder&quot;, &quot;plane&quot;, &quot;sphere&quot;, &quot;revolved&quot;, &quot;extruded&quot;, &quot;torus&quot;, &quot;other&quot;
   */
  @JsonProperty("type")
  public String type;

  /**
   * Surface origin
   */
  @JsonProperty("origin")
  public Number[] origin;

  /**
   * Normalized surface info
   */
  @JsonProperty("normal")
  public Number[] normal;

  /**
   * Get Surface type - this can be one of &quot;cone&quot;, &quot;cylinder&quot;, &quot;plane&quot;, &quot;sphere&quot;, &quot;revolved&quot;, &quot;extruded&quot;, &quot;torus&quot;, &quot;other&quot;
   *
   * @return Surface type - this can be one of &quot;cone&quot;, &quot;cylinder&quot;, &quot;plane&quot;, &quot;sphere&quot;, &quot;revolved&quot;, &quot;extruded&quot;, &quot;torus&quot;, &quot;other&quot;
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Surface origin
   *
   * @return Surface origin
   *
   */
  public final Number[] getOrigin() {
    return this.origin;
  }

  /**
   * Get Normalized surface info
   *
   * @return Normalized surface info
   *
   */
  public final Number[] getNormal() {
    return this.normal;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
