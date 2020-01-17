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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updateReleasePackage API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementUpdateReleasePackageRequestItems {
  /**
   * Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
   */
  @JsonProperty("id")
  public String id;

  /**
   * href href of the item
   */
  @JsonProperty("href")
  public String href;

  /**
   * Document ID of the item
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Version ID of the item
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Workspace ID of the item
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * Element ID of the item
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   */
  @JsonProperty("properties")
  public ReleaseManagementUpdateReleasePackageRequestItemsProperties[] properties;

  ReleaseManagementUpdateReleasePackageRequestItems(String id, String href, String documentId,
      String versionId, String workspaceId, String elementId,
      ReleaseManagementUpdateReleasePackageRequestItemsProperties[] properties) {
    this.id = id;
    this.href = href;
    this.documentId = documentId;
    this.versionId = versionId;
    this.workspaceId = workspaceId;
    this.elementId = elementId;
    this.properties = properties;
  }

  /**
   * Get Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
   *
   * @return Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get href href of the item
   *
   * @return href href of the item
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Document ID of the item
   *
   * @return Document ID of the item
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Version ID of the item
   *
   * @return Version ID of the item
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Workspace ID of the item
   *
   * @return Workspace ID of the item
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
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
   * Get Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   * @return Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   */
  public final ReleaseManagementUpdateReleasePackageRequestItemsProperties[] getProperties() {
    return this.properties;
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
     * Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
     */
    private String id;

    /**
     * href href of the item
     */
    private String href;

    /**
     * Document ID of the item
     */
    private String documentId;

    /**
     * Version ID of the item
     */
    private String versionId;

    /**
     * Workspace ID of the item
     */
    private String workspaceId;

    /**
     * Element ID of the item
     */
    private String elementId;

    /**
     * Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     */
    private ReleaseManagementUpdateReleasePackageRequestItemsProperties[] properties;

    Builder() {
    }

    /**
     * Get Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
     *
     * @return Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
     *
     */
    public final String id() {
      return this.id;
    }

    /**
     * Set Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
     *
     * @param value Id of the item as returned by createObsoletionPackage, createReleasePackage or getReleasePackage
     *
     * @return the Builder object.
     */
    public final Builder id(String value) {
      this.id = value;
      return this;
    }

    /**
     * Get href href of the item
     *
     * @return href href of the item
     *
     */
    public final String href() {
      return this.href;
    }

    /**
     * Set href href of the item
     *
     * @param value href href of the item
     *
     * @return the Builder object.
     */
    public final Builder href(String value) {
      this.href = value;
      return this;
    }

    /**
     * Get Document ID of the item
     *
     * @return Document ID of the item
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set Document ID of the item
     *
     * @param value Document ID of the item
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Version ID of the item
     *
     * @return Version ID of the item
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Version ID of the item
     *
     * @param value Version ID of the item
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Workspace ID of the item
     *
     * @return Workspace ID of the item
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Workspace ID of the item
     *
     * @param value Workspace ID of the item
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
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
     * Get Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     */
    public final ReleaseManagementUpdateReleasePackageRequestItemsProperties[] properties() {
      return this.properties;
    }

    /**
     * Set Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @param value Array of item properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return the Builder object.
     */
    public final Builder properties(ReleaseManagementUpdateReleasePackageRequestItemsProperties[] value) {
      this.properties = value;
      return this;
    }

    public final ReleaseManagementUpdateReleasePackageRequestItems build() {
      return new com.onshape.api.requests.ReleaseManagementUpdateReleasePackageRequestItems(id,href,documentId,versionId,workspaceId,elementId,properties);
    }
  }
}
