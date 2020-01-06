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
 * Object used in calls to getMassProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartsGetMassPropertiesResponseBodiesValue extends AbstractResponseObject {
  /**
   * Whether part has mass
   */
  @JsonProperty("hasMass")
  public Boolean hasMass;

  /**
   * Number of parts without mass
   */
  @JsonProperty("massMissingCount")
  public Number massMissingCount;

  /**
   * Mass in kilograms, along with minimum and maximum
   */
  @JsonProperty("mass")
  public Number[] mass;

  /**
   * Volume in cubic meters, along with minimum and maximum
   */
  @JsonProperty("volume")
  public Number[] volume;

  /**
   * Periphery in metric units which depend on context, along with minimum and maximum; for a solid part, the periphery is the surface area in square meters; for a surface, the periphery is the perimeter in meters
   */
  @JsonProperty("periphery")
  public Number[] periphery;

  /**
   * Coordinates of the centroid (center of mass) in metric units (3 numbers), along with minimum (3 numbers) and maximum (3 numbers)
   */
  @JsonProperty("centroid")
  public Number[] centroid;

  /**
   * Moment of inertia tensor about the centroid in metric units with respect to the coordinate axes (9 numbers), along with minimum (9 numbers) and maximum (9 numbers)
   */
  @JsonProperty("inertia")
  public Number[] inertia;

  /**
   * Moment of inertia around the principal axes in metric units (3 numbers)
   */
  @JsonProperty("principalInertia")
  public Number[] principalInertia;

  /**
   * Principal axes as unit vectors
   */
  @JsonProperty("principalAxes")
  public PartsGetMassPropertiesResponseBodiesValuePrincipalAxes[] principalAxes;

  /**
   * Get Whether part has mass
   *
   * @return Whether part has mass
   *
   */
  public final Boolean getHasMass() {
    return this.hasMass;
  }

  /**
   * Get Number of parts without mass
   *
   * @return Number of parts without mass
   *
   */
  public final Number getMassMissingCount() {
    return this.massMissingCount;
  }

  /**
   * Get Mass in kilograms, along with minimum and maximum
   *
   * @return Mass in kilograms, along with minimum and maximum
   *
   */
  public final Number[] getMass() {
    return this.mass;
  }

  /**
   * Get Volume in cubic meters, along with minimum and maximum
   *
   * @return Volume in cubic meters, along with minimum and maximum
   *
   */
  public final Number[] getVolume() {
    return this.volume;
  }

  /**
   * Get Periphery in metric units which depend on context, along with minimum and maximum; for a solid part, the periphery is the surface area in square meters; for a surface, the periphery is the perimeter in meters
   *
   * @return Periphery in metric units which depend on context, along with minimum and maximum; for a solid part, the periphery is the surface area in square meters; for a surface, the periphery is the perimeter in meters
   *
   */
  public final Number[] getPeriphery() {
    return this.periphery;
  }

  /**
   * Get Coordinates of the centroid (center of mass) in metric units (3 numbers), along with minimum (3 numbers) and maximum (3 numbers)
   *
   * @return Coordinates of the centroid (center of mass) in metric units (3 numbers), along with minimum (3 numbers) and maximum (3 numbers)
   *
   */
  public final Number[] getCentroid() {
    return this.centroid;
  }

  /**
   * Get Moment of inertia tensor about the centroid in metric units with respect to the coordinate axes (9 numbers), along with minimum (9 numbers) and maximum (9 numbers)
   *
   * @return Moment of inertia tensor about the centroid in metric units with respect to the coordinate axes (9 numbers), along with minimum (9 numbers) and maximum (9 numbers)
   *
   */
  public final Number[] getInertia() {
    return this.inertia;
  }

  /**
   * Get Moment of inertia around the principal axes in metric units (3 numbers)
   *
   * @return Moment of inertia around the principal axes in metric units (3 numbers)
   *
   */
  public final Number[] getPrincipalInertia() {
    return this.principalInertia;
  }

  /**
   * Get Principal axes as unit vectors
   *
   * @return Principal axes as unit vectors
   *
   */
  public final PartsGetMassPropertiesResponseBodiesValuePrincipalAxes[] getPrincipalAxes() {
    return this.principalAxes;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
