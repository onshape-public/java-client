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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getReleasePackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ReleaseManagementGetReleasePackageResponseItems {
  /**
   * ID of the item
   */
  @JsonProperty("id")
  public String id;

  /**
   * Name of the revisionable object
   */
  @JsonProperty("name")
  public String name;

  /**
   * Document ID of the revisionable object
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Version ID of the revisionable object
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Workspace ID of the revisionable object
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * Element ID of the revisionable object
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
   */
  @JsonProperty("elmentType")
  public Number elmentType;

  /**
   * Deterministic part ID if item is a part
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Configuration of the Part studio or Assembly element
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * An URI to get complete metadata for the item
   */
  @JsonProperty("href")
  public String href;

  /**
   * An URI that can be opened in the browser to view the item
   */
  @JsonProperty("viewRef")
  public String viewRef;

  /**
   * Errors or warnings if any associated with items.
   */
  @JsonProperty("errors")
  public ReleaseManagementGetReleasePackageResponseItemsErrors[] errors;

  /**
   * Dependent child items as determined by Onshape. Assemblies and Drawings will contain all their references recursively unless they have been explicitly marked as non revision managed.
   */
  @JsonProperty("children")
  public Map[] children;

  /**
   * Properties of the item
   */
  @JsonProperty("properties")
  public ReleaseManagementGetReleasePackageResponseItemsProperties[] properties;

  /**
   * Get ID of the item
   *
   * @return ID of the item
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Name of the revisionable object
   *
   * @return Name of the revisionable object
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Document ID of the revisionable object
   *
   * @return Document ID of the revisionable object
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Version ID of the revisionable object
   *
   * @return Version ID of the revisionable object
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Workspace ID of the revisionable object
   *
   * @return Workspace ID of the revisionable object
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get Element ID of the revisionable object
   *
   * @return Element ID of the revisionable object
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
   *
   * @return Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
   *
   */
  public final Number getElmentType() {
    return this.elmentType;
  }

  /**
   * Get Deterministic part ID if item is a part
   *
   * @return Deterministic part ID if item is a part
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Configuration of the Part studio or Assembly element
   *
   * @return Configuration of the Part studio or Assembly element
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get An URI to get complete metadata for the item
   *
   * @return An URI to get complete metadata for the item
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get An URI that can be opened in the browser to view the item
   *
   * @return An URI that can be opened in the browser to view the item
   *
   */
  public final String getViewRef() {
    return this.viewRef;
  }

  /**
   * Get Errors or warnings if any associated with items.
   *
   * @return Errors or warnings if any associated with items.
   *
   */
  public final ReleaseManagementGetReleasePackageResponseItemsErrors[] getErrors() {
    return this.errors;
  }

  /**
   * Get Dependent child items as determined by Onshape. Assemblies and Drawings will contain all their references recursively unless they have been explicitly marked as non revision managed.
   *
   * @return Dependent child items as determined by Onshape. Assemblies and Drawings will contain all their references recursively unless they have been explicitly marked as non revision managed.
   *
   */
  public final Map[] getChildren() {
    return this.children;
  }

  /**
   * Get Properties of the item
   *
   * @return Properties of the item
   *
   */
  public final ReleaseManagementGetReleasePackageResponseItemsProperties[] getProperties() {
    return this.properties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
