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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.TestCustomWorkflowsUpdateWorkflowableTestObjectResponse;
import com.onshape.api.types.CU;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateWorkflowableTestObject API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class TestCustomWorkflowsUpdateWorkflowableTestObjectRequest {
  /**
   * Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   */
  @JsonProperty("properties")
  @NotNull
  TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] properties;

  TestCustomWorkflowsUpdateWorkflowableTestObjectRequest(TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] properties) {
    this.properties = properties;
  }

  /**
   * Get Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   * @return Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   */
  public final TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] getProperties() {
    return this.properties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     */
    private TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] properties;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     */
    public final TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] properties() {
      return this.properties;
    }

    /**
     * Set Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @param value Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return the Builder object.
     */
    public final Builder properties(TestCustomWorkflowsUpdateWorkflowableTestObjectRequestProperties[] value) {
      this.properties = value;
      return this;
    }

    private TestCustomWorkflowsUpdateWorkflowableTestObjectRequest build() {
      return new com.onshape.api.requests.TestCustomWorkflowsUpdateWorkflowableTestObjectRequest(properties);
    }

    /**
     * Calls updateWorkflowableTestObject method, Update the workflowable object properties
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cuType Type of Company or User
     *
     * @param oid ID of workflowable object to update
     */
    public final TestCustomWorkflowsUpdateWorkflowableTestObjectResponse call(CU cuType, String oid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/workflowabletestobject/:oid", build(), onshape.buildMap("cuType", cuType, "oid", oid), onshape.buildMap(), com.onshape.api.responses.TestCustomWorkflowsUpdateWorkflowableTestObjectResponse.class);
    }
  }
}
