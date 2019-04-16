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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for transitionWorkflowableTestObject API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class TestCustomWorkflowsTransitionWorkflowableTestObjectResponse {
  /**
   * ID of the workflowable object.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Whether the object has reached its terminal transition. Frozen object cannot be modified.
   */
  @JsonProperty("isFrozen")
  @NotNull
  Boolean isFrozen;

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
  TestCustomWorkflowsTransitionWorkflowableTestObjectResponseProperties[] properties;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  TestCustomWorkflowsTransitionWorkflowableTestObjectResponseWorkflow workflow;

  /**
   * Get ID of the workflowable object.
   *
   * @return ID of the workflowable object.
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Whether the object has reached its terminal transition. Frozen object cannot be modified.
   *
   * @return Whether the object has reached its terminal transition. Frozen object cannot be modified.
   *
   */
  public final Boolean getIsFrozen() {
    return this.isFrozen;
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
  public final TestCustomWorkflowsTransitionWorkflowableTestObjectResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final TestCustomWorkflowsTransitionWorkflowableTestObjectResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
