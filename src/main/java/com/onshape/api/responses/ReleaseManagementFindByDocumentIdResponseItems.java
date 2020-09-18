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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to findByDocumentId API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementFindByDocumentIdResponseItems extends AbstractResponseObject {
  /**
   * The version id of the release package
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * The workspace id of the release package
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * The revisionRule id of the release package
   */
  @JsonProperty("revisionRuleId")
  public String revisionRuleId;

  /**
   * The linkedVersion ids of the release package
   */
  @JsonProperty("linkedVersionIds")
  public String[] linkedVersionIds;

  /**
   * The parentPackages of the release package
   */
  @JsonProperty("parentPackages")
  public String[] parentPackages;

  /**
   * Get The version id of the release package
   *
   * @return The version id of the release package
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get The workspace id of the release package
   *
   * @return The workspace id of the release package
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get The revisionRule id of the release package
   *
   * @return The revisionRule id of the release package
   *
   */
  public final String getRevisionRuleId() {
    return this.revisionRuleId;
  }

  /**
   * Get The linkedVersion ids of the release package
   *
   * @return The linkedVersion ids of the release package
   *
   */
  public final String[] getLinkedVersionIds() {
    return this.linkedVersionIds;
  }

  /**
   * Get The parentPackages of the release package
   *
   * @return The parentPackages of the release package
   *
   */
  public final String[] getParentPackages() {
    return this.parentPackages;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
