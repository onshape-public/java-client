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
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for createWorkflowableTestObject API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class TestCustomWorkflowsCreateWorkflowableTestObjectResponse {
  /**
   * ID of the object.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Company ID to which the object belongs.
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Array of properties for the object
   */
  @JsonProperty("properties")
  @NotNull
  TestCustomWorkflowsCreateWorkflowableTestObjectResponseProperties[] properties;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  TestCustomWorkflowsCreateWorkflowableTestObjectResponseWorkflow workflow;

  /**
   * Get ID of the object.
   *
   * @return ID of the object.
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Company ID to which the object belongs.
   *
   * @return Company ID to which the object belongs.
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Array of properties for the object
   *
   * @return Array of properties for the object
   *
   */
  public final TestCustomWorkflowsCreateWorkflowableTestObjectResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final TestCustomWorkflowsCreateWorkflowableTestObjectResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
