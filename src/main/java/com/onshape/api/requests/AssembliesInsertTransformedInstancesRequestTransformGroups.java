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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to insertTransformedInstances API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesInsertTransformedInstancesRequestTransformGroups {
  /**
   * The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   */
  @JsonProperty("transform")
  public Number[] transform;

  /**
   * The instances to insert with the transform.
   */
  @JsonProperty("instances")
  public AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] instances;

  AssembliesInsertTransformedInstancesRequestTransformGroups(Number[] transform,
      AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] instances) {
    this.transform = transform;
    this.instances = instances;
  }

  /**
   * Get The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   *
   * @return The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   *
   */
  public final Number[] getTransform() {
    return this.transform;
  }

  /**
   * Get The instances to insert with the transform.
   *
   * @return The instances to insert with the transform.
   *
   */
  public final AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] getInstances() {
    return this.instances;
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
     * The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     */
    private Number[] transform;

    /**
     * The instances to insert with the transform.
     */
    private AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] instances;

    Builder() {
    }

    /**
     * Get The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @return The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     */
    public final Number[] transform() {
      return this.transform;
    }

    /**
     * Set The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @param value The transform to apply to the instances. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @return the Builder object.
     */
    public final Builder transform(Number[] value) {
      this.transform = value;
      return this;
    }

    /**
     * Get The instances to insert with the transform.
     *
     * @return The instances to insert with the transform.
     *
     */
    public final AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] instances() {
      return this.instances;
    }

    /**
     * Set The instances to insert with the transform.
     *
     * @param value The instances to insert with the transform.
     *
     * @return the Builder object.
     */
    public final Builder instances(AssembliesInsertTransformedInstancesRequestTransformGroupsInstances[] value) {
      this.instances = value;
      return this;
    }

    public final AssembliesInsertTransformedInstancesRequestTransformGroups build() {
      return new com.onshape.api.requests.AssembliesInsertTransformedInstancesRequestTransformGroups(transform,instances);
    }
  }
}
