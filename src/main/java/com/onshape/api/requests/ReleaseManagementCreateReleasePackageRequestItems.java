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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to createReleasePackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ReleaseManagementCreateReleasePackageRequestItems {
  /**
   * Document ID in which the item exists. All items must be from the same document.
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Workspace ID in which the item exists. All items must be from either the same workspace or version
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * Version ID in which the item exists. All items must be from the same version or workspace
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Element ID of the item
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Part deterministic ID if item is a revisionable part
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Configuration of the element if item is configured.
   */
  @JsonProperty("configuration")
  public String configuration;

  ReleaseManagementCreateReleasePackageRequestItems(String documentId, String workspaceId,
      String versionId, String elementId, String partId, String configuration) {
    this.documentId = documentId;
    this.workspaceId = workspaceId;
    this.versionId = versionId;
    this.elementId = elementId;
    this.partId = partId;
    this.configuration = configuration;
  }

  /**
   * Get Document ID in which the item exists. All items must be from the same document.
   *
   * @return Document ID in which the item exists. All items must be from the same document.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Workspace ID in which the item exists. All items must be from either the same workspace or version
   *
   * @return Workspace ID in which the item exists. All items must be from either the same workspace or version
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get Version ID in which the item exists. All items must be from the same version or workspace
   *
   * @return Version ID in which the item exists. All items must be from the same version or workspace
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Element ID of the item
   *
   * @return Element ID of the item
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Part deterministic ID if item is a revisionable part
   *
   * @return Part deterministic ID if item is a revisionable part
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Configuration of the element if item is configured.
   *
   * @return Configuration of the element if item is configured.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
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
     * Document ID in which the item exists. All items must be from the same document.
     */
    private String documentId;

    /**
     * Workspace ID in which the item exists. All items must be from either the same workspace or version
     */
    private String workspaceId;

    /**
     * Version ID in which the item exists. All items must be from the same version or workspace
     */
    private String versionId;

    /**
     * Element ID of the item
     */
    private String elementId;

    /**
     * Part deterministic ID if item is a revisionable part
     */
    private String partId;

    /**
     * Configuration of the element if item is configured.
     */
    private String configuration;

    Builder() {
    }

    /**
     * Get Document ID in which the item exists. All items must be from the same document.
     *
     * @return Document ID in which the item exists. All items must be from the same document.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set Document ID in which the item exists. All items must be from the same document.
     *
     * @param value Document ID in which the item exists. All items must be from the same document.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Workspace ID in which the item exists. All items must be from either the same workspace or version
     *
     * @return Workspace ID in which the item exists. All items must be from either the same workspace or version
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Workspace ID in which the item exists. All items must be from either the same workspace or version
     *
     * @param value Workspace ID in which the item exists. All items must be from either the same workspace or version
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get Version ID in which the item exists. All items must be from the same version or workspace
     *
     * @return Version ID in which the item exists. All items must be from the same version or workspace
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Version ID in which the item exists. All items must be from the same version or workspace
     *
     * @param value Version ID in which the item exists. All items must be from the same version or workspace
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Element ID of the item
     *
     * @return Element ID of the item
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set Element ID of the item
     *
     * @param value Element ID of the item
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get Part deterministic ID if item is a revisionable part
     *
     * @return Part deterministic ID if item is a revisionable part
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set Part deterministic ID if item is a revisionable part
     *
     * @param value Part deterministic ID if item is a revisionable part
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get Configuration of the element if item is configured.
     *
     * @return Configuration of the element if item is configured.
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration of the element if item is configured.
     *
     * @param value Configuration of the element if item is configured.
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    public final ReleaseManagementCreateReleasePackageRequestItems build() {
      return new com.onshape.api.requests.ReleaseManagementCreateReleasePackageRequestItems(documentId,workspaceId,versionId,elementId,partId,configuration);
    }
  }
}
