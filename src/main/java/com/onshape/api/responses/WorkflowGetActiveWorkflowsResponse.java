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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.ResponseWithDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getActiveWorkflows API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WorkflowGetActiveWorkflowsResponse extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * Company ID for which workflow info is retrieved, resolved from documentId
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Document ID for which workflow info is retrieved
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Whether Sequential part number generation is being used
   */
  @JsonProperty("usingAutoPartNumbering")
  @NotNull
  Boolean usingAutoPartNumbering;

  /**
   * Whether managed workflow is in use for this document or company
   */
  @JsonProperty("usingManagedWorkflow")
  @NotNull
  Boolean usingManagedWorkflow;

  /**
   * Whether company policy allows drawings to use the same part number as another Release item
   */
  @JsonProperty("drawingCanDuplicatePartNumber")
  @NotNull
  Boolean drawingCanDuplicatePartNumber;

  /**
   * Whether the logged-in user is allowed to create Release candidates in the document or company
   */
  @JsonProperty("canCurrentUserCreateReleases")
  @NotNull
  Boolean canCurrentUserCreateReleases;

  /**
   * The release workflow currently in use by this document or company
   */
  @JsonProperty("releaseWorkflow")
  @NotNull
  WorkflowGetActiveWorkflowsResponseReleaseWorkflow releaseWorkflow;

  /**
   * The obsoletion workflow currently in use by this document or company
   */
  @JsonProperty("obsoletionWorkflow")
  @NotNull
  WorkflowGetActiveWorkflowsResponseObsoletionWorkflow obsoletionWorkflow;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, null);
  }

  /**
   * Get Company ID for which workflow info is retrieved, resolved from documentId
   *
   * @return Company ID for which workflow info is retrieved, resolved from documentId
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Document ID for which workflow info is retrieved
   *
   * @return Document ID for which workflow info is retrieved
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Whether Sequential part number generation is being used
   *
   * @return Whether Sequential part number generation is being used
   *
   */
  public final Boolean getUsingAutoPartNumbering() {
    return this.usingAutoPartNumbering;
  }

  /**
   * Get Whether managed workflow is in use for this document or company
   *
   * @return Whether managed workflow is in use for this document or company
   *
   */
  public final Boolean getUsingManagedWorkflow() {
    return this.usingManagedWorkflow;
  }

  /**
   * Get Whether company policy allows drawings to use the same part number as another Release item
   *
   * @return Whether company policy allows drawings to use the same part number as another Release item
   *
   */
  public final Boolean getDrawingCanDuplicatePartNumber() {
    return this.drawingCanDuplicatePartNumber;
  }

  /**
   * Get Whether the logged-in user is allowed to create Release candidates in the document or company
   *
   * @return Whether the logged-in user is allowed to create Release candidates in the document or company
   *
   */
  public final Boolean getCanCurrentUserCreateReleases() {
    return this.canCurrentUserCreateReleases;
  }

  /**
   * Get The release workflow currently in use by this document or company
   *
   * @return The release workflow currently in use by this document or company
   *
   */
  public final WorkflowGetActiveWorkflowsResponseReleaseWorkflow getReleaseWorkflow() {
    return this.releaseWorkflow;
  }

  /**
   * Get The obsoletion workflow currently in use by this document or company
   *
   * @return The obsoletion workflow currently in use by this document or company
   *
   */
  public final WorkflowGetActiveWorkflowsResponseObsoletionWorkflow getObsoletionWorkflow() {
    return this.obsoletionWorkflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
