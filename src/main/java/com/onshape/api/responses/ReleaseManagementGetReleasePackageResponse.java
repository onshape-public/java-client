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
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getReleasePackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ReleaseManagementGetReleasePackageResponse {
  /**
   * ID of the release package.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Whether the release package has reached its terminal tranistion. Frozen packages cannot be modified.
   */
  @JsonProperty("isFrozen")
  @NotNull
  Boolean isFrozen;

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
   * Primary Version ID of items in the release package
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Primary Workspace ID of items in the release package
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Array of properties for the package
   */
  @JsonProperty("properties")
  @NotNull
  ReleaseManagementGetReleasePackageResponseProperties[] properties;

  /**
   * Full item list in the package determined by the input items
   */
  @JsonProperty("items")
  @NotNull
  ReleaseManagementGetReleasePackageResponseItems[] items;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  ReleaseManagementGetReleasePackageResponseWorkflow workflow;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
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
   * Get Whether the release package has reached its terminal tranistion. Frozen packages cannot be modified.
   *
   * @return Whether the release package has reached its terminal tranistion. Frozen packages cannot be modified.
   *
   */
  public final Boolean getIsFrozen() {
    return this.isFrozen;
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
   * Get Primary Version ID of items in the release package
   *
   * @return Primary Version ID of items in the release package
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Primary Workspace ID of items in the release package
   *
   * @return Primary Workspace ID of items in the release package
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
  public final ReleaseManagementGetReleasePackageResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get Full item list in the package determined by the input items
   *
   * @return Full item list in the package determined by the input items
   *
   */
  public final ReleaseManagementGetReleasePackageResponseItems[] getItems() {
    return this.items;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final ReleaseManagementGetReleasePackageResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
