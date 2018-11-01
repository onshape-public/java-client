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
public final class PartStudiosGetBodyDetailsResponseBodiesEdgesCurve {
  /**
   * Curve type - this can be one of &quot;bcurve&quot; (b-spline), &quot;circle&quot;, &quot;ellipse&quot;, &quot;icurve&quot; (surface intersection), &quot;line&quot;, &quot;other&quot;.
   */
  @JsonProperty("type")
  public String type;

  /**
   * (circle, ellipse) The center of the circle or ellipse
   */
  @JsonProperty("origin")
  public Number[] origin;

  /**
   * (circle, ellipse) A normal to the plane of the circle or ellipse
   */
  @JsonProperty("normal")
  public Number[] normal;

  /**
   * (circle) The circle radius
   */
  @JsonProperty("radius")
  public Number radius;

  /**
   * (ellipse) The ellipse major radius
   */
  @JsonProperty("majorRadius")
  public Number majorRadius;

  /**
   * (ellipse) The ellipse minor radius
   */
  @JsonProperty("minorRadius")
  public Number minorRadius;

  /**
   * (ellipse) The direction of the major radius
   */
  @JsonProperty("majorAxis")
  public Number[] majorAxis;

  /**
   * Get Curve type - this can be one of &quot;bcurve&quot; (b-spline), &quot;circle&quot;, &quot;ellipse&quot;, &quot;icurve&quot; (surface intersection), &quot;line&quot;, &quot;other&quot;.
   *
   * @return Curve type - this can be one of &quot;bcurve&quot; (b-spline), &quot;circle&quot;, &quot;ellipse&quot;, &quot;icurve&quot; (surface intersection), &quot;line&quot;, &quot;other&quot;.
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get (circle, ellipse) The center of the circle or ellipse
   *
   * @return (circle, ellipse) The center of the circle or ellipse
   *
   */
  public final Number[] getOrigin() {
    return this.origin;
  }

  /**
   * Get (circle, ellipse) A normal to the plane of the circle or ellipse
   *
   * @return (circle, ellipse) A normal to the plane of the circle or ellipse
   *
   */
  public final Number[] getNormal() {
    return this.normal;
  }

  /**
   * Get (circle) The circle radius
   *
   * @return (circle) The circle radius
   *
   */
  public final Number getRadius() {
    return this.radius;
  }

  /**
   * Get (ellipse) The ellipse major radius
   *
   * @return (ellipse) The ellipse major radius
   *
   */
  public final Number getMajorRadius() {
    return this.majorRadius;
  }

  /**
   * Get (ellipse) The ellipse minor radius
   *
   * @return (ellipse) The ellipse minor radius
   *
   */
  public final Number getMinorRadius() {
    return this.minorRadius;
  }

  /**
   * Get (ellipse) The direction of the major radius
   *
   * @return (ellipse) The direction of the major radius
   *
   */
  public final Number[] getMajorAxis() {
    return this.majorAxis;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
