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
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for createReleasePackage API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementCreateReleasePackageResponse extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * ID of the release package.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Company ID to which the release package belongs.
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Primary Document ID of items in the release package
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Primary Version ID of items in the release package if releasing from a version
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Primary Workspace ID of items in the release package if releasing from a workspace
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Array of properties for the package
   */
  @JsonProperty("properties")
  @NotNull
  ReleaseManagementCreateReleasePackageResponseProperties[] properties;

  /**
   * Full item list in the package determined by the input items
   */
  @JsonProperty("items")
  @NotNull
  ReleaseManagementCreateReleasePackageResponseItems[] items;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  ReleaseManagementCreateReleasePackageResponseWorkflow workflow;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, workspaceId, null, null, null);
  }

  /**
   * Get ID of the release package.
   *
   * @return ID of the release package.
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Company ID to which the release package belongs.
   *
   * @return Company ID to which the release package belongs.
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Primary Document ID of items in the release package
   *
   * @return Primary Document ID of items in the release package
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Primary Version ID of items in the release package if releasing from a version
   *
   * @return Primary Version ID of items in the release package if releasing from a version
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Primary Workspace ID of items in the release package if releasing from a workspace
   *
   * @return Primary Workspace ID of items in the release package if releasing from a workspace
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get Array of properties for the package
   *
   * @return Array of properties for the package
   *
   */
  public final ReleaseManagementCreateReleasePackageResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get Full item list in the package determined by the input items
   *
   * @return Full item list in the package determined by the input items
   *
   */
  public final ReleaseManagementCreateReleasePackageResponseItems[] getItems() {
    return this.items;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final ReleaseManagementCreateReleasePackageResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
