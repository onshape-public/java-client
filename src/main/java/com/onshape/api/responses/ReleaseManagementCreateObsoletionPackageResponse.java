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
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Response object for createObsoletionPackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ReleaseManagementCreateObsoletionPackageResponse {
  /**
   * ID of the obsoletion package.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Company ID for the obsoletion package
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Document ID of the revision
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Version ID of the revision
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * Array of properties for the package
   */
  @JsonProperty("properties")
  @NotNull
  ReleaseManagementCreateObsoletionPackageResponseProperties[] properties;

  /**
   * in the package as determined by the revision. Always just one item
   */
  @JsonProperty("Items")
  @NotNull
  Map[] Items;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  ReleaseManagementCreateObsoletionPackageResponseWorkflow workflow;

  /**
   * Get ID of the obsoletion package.
   *
   * @return ID of the obsoletion package.
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Company ID for the obsoletion package
   *
   * @return Company ID for the obsoletion package
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Document ID of the revision
   *
   * @return Document ID of the revision
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Version ID of the revision
   *
   * @return Version ID of the revision
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Array of properties for the package
   *
   * @return Array of properties for the package
   *
   */
  public final ReleaseManagementCreateObsoletionPackageResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get in the package as determined by the revision. Always just one item
   *
   * @return in the package as determined by the revision. Always just one item
   *
   */
  public final Map[] getItems() {
    return this.Items;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final ReleaseManagementCreateObsoletionPackageResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
