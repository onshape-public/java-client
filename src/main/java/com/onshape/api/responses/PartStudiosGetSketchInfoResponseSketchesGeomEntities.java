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
import java.util.Map;

/**
 * Object used in calls to getSketchInfo API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetSketchInfoResponseSketchesGeomEntities extends AbstractResponseObject {
  /**
   * The type of the entity. Can be one of: &quot;point&quot;, &quot;line&quot;, &quot;lineSegment&quot;, &quot;circle&quot;, &quot;arc&quot;, &quot;ellipse&quot;, &quot;ellipticArc&quot;, &quot;spline&quot;, &quot;splineSegment&quot;, &quot;interpolatedSpline&quot;, &quot;interpolatedSplineSegment&quot;, &quot;unknownGeometry&quot;.
   */
  @JsonProperty("entityType")
  public String entityType;

  /**
   * A 2-dimensional array of endpoint ids, if the curve is a bounded curve.
   */
  @JsonProperty("endPointIds")
  public String[] endPointIds;

  /**
   * (line) An arbitrary point on the line
   */
  @JsonProperty("point")
  public Number[] point;

  /**
   * (line, ellipse, ellipticArc) For line, this is the line direction. For elliptic entities, this is the direction of the major axis.
   */
  @JsonProperty("direction")
  public Number[] direction;

  /**
   * (lineSegment, arc, ellipticArc, curvePoints=true) The start point of the segment
   */
  @JsonProperty("startPoint")
  public Number[] startPoint;

  /**
   * (lineSegment, arc, ellipticArc, curvePoints=true) The end point of the segment
   */
  @JsonProperty("endPoint")
  public Number[] endPoint;

  /**
   * (circle, arc, ellipse, ellipticArc) The center point
   */
  @JsonProperty("center")
  public Number[] center;

  /**
   * (circle, arc). The circular radius
   */
  @JsonProperty("radius")
  public Number radius;

  /**
   * (ellipse, ellipticArc) The major radius of the elliptic entity
   */
  @JsonProperty("majorRadius")
  public Number majorRadius;

  /**
   * (ellipse, ellipticArc) The minor radius of the elliptic entity
   */
  @JsonProperty("minorRadius")
  public Number minorRadius;

  /**
   * (arc, ellipticArc) If true, the segment is oriented clockwise from the startPoint to the endPoint around the center.
   */
  @JsonProperty("clockwise")
  public Boolean clockwise;

  /**
   * (spline[Segment], interpolatedSpline[Segment]) If true, the spline entity is periodic
   */
  @JsonProperty("periodic")
  public Boolean periodic;

  /**
   * (spline[Segment]) If true, the spline is in rational form
   */
  @JsonProperty("rational")
  public Boolean rational;

  /**
   * (spline[Segment]) The degree of the spline
   */
  @JsonProperty("degree")
  public Number degree;

  /**
   * (spline[Segment]) The number of control points in the spline
   */
  @JsonProperty("numberControlPoints")
  public Number numberControlPoints;

  /**
   * (spline[Segment]) The spline control points
   */
  @JsonProperty("controlPoints")
  public Map[] controlPoints;

  /**
   * (spline[Segment]) The spline knot vector
   */
  @JsonProperty("knots")
  public Number[] knots;

  /**
   * (splineSegment, interpolatedSplineSegment) The start parameter of the spline segment
   */
  @JsonProperty("startParam")
  public Number startParam;

  /**
   * (splineSegment, interpolatedSplineSegment) The end parameter of the spline segment
   */
  @JsonProperty("endParam")
  public Number endParam;

  /**
   * (interpolatedSpline[Segment]) For a non-periodic spline, the start handle point use to determine the start derivative.
   */
  @JsonProperty("startHandle")
  public Number[] startHandle;

  /**
   * (interpolatedSpline[Segment]) For a non-periodic spline, the end handle point use to determine the end derivative.
   */
  @JsonProperty("endHandle")
  public Number[] endHandle;

  /**
   * (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the start of the spline
   */
  @JsonProperty("startDerivative")
  public Number[] startDerivative;

  /**
   * (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the end of the spline
   */
  @JsonProperty("endDerivative")
  public Number[] endDerivative;

  /**
   * (interpolatedSpline[Segment]) The interpolation points for the spline
   */
  @JsonProperty("interpolationPoints")
  public Number[] interpolationPoints;

  /**
   * Set to true if this is a construction entity
   */
  @JsonProperty("isConstruction")
  public Boolean isConstruction;

  /**
   * (curvePoints=true) The length of the curve
   */
  @JsonProperty("curveLength")
  public Number curveLength;

  /**
   * (curvePoints=true) The point that is half way between the start and end of the curve
   */
  @JsonProperty("midPoint")
  public Number[] midPoint;

  /**
   * (curvePoints=true) The point that is one quarter way between the start and end of the curve
   */
  @JsonProperty("quarterPoint")
  public Number[] quarterPoint;

  /**
   * (curvePoints=true) The tangent vector at the start of the curve
   */
  @JsonProperty("startVector")
  public Number[] startVector;

  /**
   * (curvePoints=true) The tangent vector at the end of the curve
   */
  @JsonProperty("endVector")
  public Number[] endVector;

  /**
   * Get The type of the entity. Can be one of: &quot;point&quot;, &quot;line&quot;, &quot;lineSegment&quot;, &quot;circle&quot;, &quot;arc&quot;, &quot;ellipse&quot;, &quot;ellipticArc&quot;, &quot;spline&quot;, &quot;splineSegment&quot;, &quot;interpolatedSpline&quot;, &quot;interpolatedSplineSegment&quot;, &quot;unknownGeometry&quot;.
   *
   * @return The type of the entity. Can be one of: &quot;point&quot;, &quot;line&quot;, &quot;lineSegment&quot;, &quot;circle&quot;, &quot;arc&quot;, &quot;ellipse&quot;, &quot;ellipticArc&quot;, &quot;spline&quot;, &quot;splineSegment&quot;, &quot;interpolatedSpline&quot;, &quot;interpolatedSplineSegment&quot;, &quot;unknownGeometry&quot;.
   *
   */
  public final String getEntityType() {
    return this.entityType;
  }

  /**
   * Get A 2-dimensional array of endpoint ids, if the curve is a bounded curve.
   *
   * @return A 2-dimensional array of endpoint ids, if the curve is a bounded curve.
   *
   */
  public final String[] getEndPointIds() {
    return this.endPointIds;
  }

  /**
   * Get (line) An arbitrary point on the line
   *
   * @return (line) An arbitrary point on the line
   *
   */
  public final Number[] getPoint() {
    return this.point;
  }

  /**
   * Get (line, ellipse, ellipticArc) For line, this is the line direction. For elliptic entities, this is the direction of the major axis.
   *
   * @return (line, ellipse, ellipticArc) For line, this is the line direction. For elliptic entities, this is the direction of the major axis.
   *
   */
  public final Number[] getDirection() {
    return this.direction;
  }

  /**
   * Get (lineSegment, arc, ellipticArc, curvePoints=true) The start point of the segment
   *
   * @return (lineSegment, arc, ellipticArc, curvePoints=true) The start point of the segment
   *
   */
  public final Number[] getStartPoint() {
    return this.startPoint;
  }

  /**
   * Get (lineSegment, arc, ellipticArc, curvePoints=true) The end point of the segment
   *
   * @return (lineSegment, arc, ellipticArc, curvePoints=true) The end point of the segment
   *
   */
  public final Number[] getEndPoint() {
    return this.endPoint;
  }

  /**
   * Get (circle, arc, ellipse, ellipticArc) The center point
   *
   * @return (circle, arc, ellipse, ellipticArc) The center point
   *
   */
  public final Number[] getCenter() {
    return this.center;
  }

  /**
   * Get (circle, arc). The circular radius
   *
   * @return (circle, arc). The circular radius
   *
   */
  public final Number getRadius() {
    return this.radius;
  }

  /**
   * Get (ellipse, ellipticArc) The major radius of the elliptic entity
   *
   * @return (ellipse, ellipticArc) The major radius of the elliptic entity
   *
   */
  public final Number getMajorRadius() {
    return this.majorRadius;
  }

  /**
   * Get (ellipse, ellipticArc) The minor radius of the elliptic entity
   *
   * @return (ellipse, ellipticArc) The minor radius of the elliptic entity
   *
   */
  public final Number getMinorRadius() {
    return this.minorRadius;
  }

  /**
   * Get (arc, ellipticArc) If true, the segment is oriented clockwise from the startPoint to the endPoint around the center.
   *
   * @return (arc, ellipticArc) If true, the segment is oriented clockwise from the startPoint to the endPoint around the center.
   *
   */
  public final Boolean getClockwise() {
    return this.clockwise;
  }

  /**
   * Get (spline[Segment], interpolatedSpline[Segment]) If true, the spline entity is periodic
   *
   * @return (spline[Segment], interpolatedSpline[Segment]) If true, the spline entity is periodic
   *
   */
  public final Boolean getPeriodic() {
    return this.periodic;
  }

  /**
   * Get (spline[Segment]) If true, the spline is in rational form
   *
   * @return (spline[Segment]) If true, the spline is in rational form
   *
   */
  public final Boolean getRational() {
    return this.rational;
  }

  /**
   * Get (spline[Segment]) The degree of the spline
   *
   * @return (spline[Segment]) The degree of the spline
   *
   */
  public final Number getDegree() {
    return this.degree;
  }

  /**
   * Get (spline[Segment]) The number of control points in the spline
   *
   * @return (spline[Segment]) The number of control points in the spline
   *
   */
  public final Number getNumberControlPoints() {
    return this.numberControlPoints;
  }

  /**
   * Get (spline[Segment]) The spline control points
   *
   * @return (spline[Segment]) The spline control points
   *
   */
  public final Map[] getControlPoints() {
    return this.controlPoints;
  }

  /**
   * Get (spline[Segment]) The spline knot vector
   *
   * @return (spline[Segment]) The spline knot vector
   *
   */
  public final Number[] getKnots() {
    return this.knots;
  }

  /**
   * Get (splineSegment, interpolatedSplineSegment) The start parameter of the spline segment
   *
   * @return (splineSegment, interpolatedSplineSegment) The start parameter of the spline segment
   *
   */
  public final Number getStartParam() {
    return this.startParam;
  }

  /**
   * Get (splineSegment, interpolatedSplineSegment) The end parameter of the spline segment
   *
   * @return (splineSegment, interpolatedSplineSegment) The end parameter of the spline segment
   *
   */
  public final Number getEndParam() {
    return this.endParam;
  }

  /**
   * Get (interpolatedSpline[Segment]) For a non-periodic spline, the start handle point use to determine the start derivative.
   *
   * @return (interpolatedSpline[Segment]) For a non-periodic spline, the start handle point use to determine the start derivative.
   *
   */
  public final Number[] getStartHandle() {
    return this.startHandle;
  }

  /**
   * Get (interpolatedSpline[Segment]) For a non-periodic spline, the end handle point use to determine the end derivative.
   *
   * @return (interpolatedSpline[Segment]) For a non-periodic spline, the end handle point use to determine the end derivative.
   *
   */
  public final Number[] getEndHandle() {
    return this.endHandle;
  }

  /**
   * Get (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the start of the spline
   *
   * @return (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the start of the spline
   *
   */
  public final Number[] getStartDerivative() {
    return this.startDerivative;
  }

  /**
   * Get (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the end of the spline
   *
   * @return (interpolatedSpline[Segment]) For a non-periodic spline the derivative at the end of the spline
   *
   */
  public final Number[] getEndDerivative() {
    return this.endDerivative;
  }

  /**
   * Get (interpolatedSpline[Segment]) The interpolation points for the spline
   *
   * @return (interpolatedSpline[Segment]) The interpolation points for the spline
   *
   */
  public final Number[] getInterpolationPoints() {
    return this.interpolationPoints;
  }

  /**
   * Get Set to true if this is a construction entity
   *
   * @return Set to true if this is a construction entity
   *
   */
  public final Boolean getIsConstruction() {
    return this.isConstruction;
  }

  /**
   * Get (curvePoints=true) The length of the curve
   *
   * @return (curvePoints=true) The length of the curve
   *
   */
  public final Number getCurveLength() {
    return this.curveLength;
  }

  /**
   * Get (curvePoints=true) The point that is half way between the start and end of the curve
   *
   * @return (curvePoints=true) The point that is half way between the start and end of the curve
   *
   */
  public final Number[] getMidPoint() {
    return this.midPoint;
  }

  /**
   * Get (curvePoints=true) The point that is one quarter way between the start and end of the curve
   *
   * @return (curvePoints=true) The point that is one quarter way between the start and end of the curve
   *
   */
  public final Number[] getQuarterPoint() {
    return this.quarterPoint;
  }

  /**
   * Get (curvePoints=true) The tangent vector at the start of the curve
   *
   * @return (curvePoints=true) The tangent vector at the start of the curve
   *
   */
  public final Number[] getStartVector() {
    return this.startVector;
  }

  /**
   * Get (curvePoints=true) The tangent vector at the end of the curve
   *
   * @return (curvePoints=true) The tangent vector at the end of the curve
   *
   */
  public final Number[] getEndVector() {
    return this.endVector;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
