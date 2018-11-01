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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * Object used in calls to getDocuments API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetDocumentsResponseItems {
  /**
   * Whether document is public
   */
  @JsonProperty("public")
  public Boolean isPublic;

  /**
   * Information about document owner
   */
  @JsonProperty("owner")
  public DocumentsGetDocumentsResponseItemsOwner owner;

  /**
   * Onshape internal use
   */
  @JsonProperty("permission")
  public String permission;

  /**
   * When document has been trashed
   */
  @JsonProperty("trashedAt")
  public Date trashedAt;

  /**
   * Whether document has been trashed
   */
  @JsonProperty("trash")
  public Boolean trash;

  /**
   * Whether document has been starred
   */
  @JsonProperty("starred")
  public String starred;

  /**
   * Whether a shared document is active
   */
  @JsonProperty("active")
  public Boolean active;

  /**
   * Creation date
   */
  @JsonProperty("createdAt")
  public Date createdAt;

  /**
   * Thumbnail information
   */
  @JsonProperty("thumbnail")
  public DocumentsGetDocumentsResponseItemsThumbnail thumbnail;

  /**
   * User information for the creator of the document
   */
  @JsonProperty("createdBy")
  public DocumentsGetDocumentsResponseItemsCreatedBy createdBy;

  /**
   * Date of last modification
   */
  @JsonProperty("modifiedAt")
  public Date modifiedAt;

  /**
   * User information for the last modifier of the document
   */
  @JsonProperty("modifiedBy")
  public DocumentsGetDocumentsResponseItemsModifiedBy modifiedBy;

  /**
   * Information about the default workspace
   */
  @JsonProperty("defaultWorkspace")
  public DocumentsGetDocumentsResponseItemsDefaultWorkspace defaultWorkspace;

  /**
   * Reserved for future use
   */
  @JsonProperty("tags")
  public String[] tags;

  /**
   * Size of document in bytes
   */
  @JsonProperty("sizeBytes")
  public Number sizeBytes;

  /**
   * Whether document can be unshared
   */
  @JsonProperty("canUnshare")
  public Boolean canUnshare;

  /**
   * Name of document
   */
  @JsonProperty("name")
  public String name;

  /**
   * Document ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * Document URL
   */
  @JsonProperty("href")
  public String href;

  /**
   * Number of workspaces that are updating
   */
  @JsonProperty("totalWorkspacesUpdating")
  public Number totalWorkspacesUpdating;

  /**
   * Number of workspaces that are scheduled for updating
   */
  @JsonProperty("totalWorkspacesScheduledForUpdate")
  public Number totalWorkspacesScheduledForUpdate;

  /**
   * Get Whether document is public
   *
   * @return Whether document is public
   *
   */
  public final Boolean getIsPublic() {
    return this.isPublic;
  }

  /**
   * Get Information about document owner
   *
   * @return Information about document owner
   *
   */
  public final DocumentsGetDocumentsResponseItemsOwner getOwner() {
    return this.owner;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getPermission() {
    return this.permission;
  }

  /**
   * Get When document has been trashed
   *
   * @return When document has been trashed
   *
   */
  public final Date getTrashedAt() {
    return this.trashedAt;
  }

  /**
   * Get Whether document has been trashed
   *
   * @return Whether document has been trashed
   *
   */
  public final Boolean getTrash() {
    return this.trash;
  }

  /**
   * Get Whether document has been starred
   *
   * @return Whether document has been starred
   *
   */
  public final String getStarred() {
    return this.starred;
  }

  /**
   * Get Whether a shared document is active
   *
   * @return Whether a shared document is active
   *
   */
  public final Boolean getActive() {
    return this.active;
  }

  /**
   * Get Creation date
   *
   * @return Creation date
   *
   */
  public final Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Get Thumbnail information
   *
   * @return Thumbnail information
   *
   */
  public final DocumentsGetDocumentsResponseItemsThumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Get User information for the creator of the document
   *
   * @return User information for the creator of the document
   *
   */
  public final DocumentsGetDocumentsResponseItemsCreatedBy getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Get Date of last modification
   *
   * @return Date of last modification
   *
   */
  public final Date getModifiedAt() {
    return this.modifiedAt;
  }

  /**
   * Get User information for the last modifier of the document
   *
   * @return User information for the last modifier of the document
   *
   */
  public final DocumentsGetDocumentsResponseItemsModifiedBy getModifiedBy() {
    return this.modifiedBy;
  }

  /**
   * Get Information about the default workspace
   *
   * @return Information about the default workspace
   *
   */
  public final DocumentsGetDocumentsResponseItemsDefaultWorkspace getDefaultWorkspace() {
    return this.defaultWorkspace;
  }

  /**
   * Get Reserved for future use
   *
   * @return Reserved for future use
   *
   */
  public final String[] getTags() {
    return this.tags;
  }

  /**
   * Get Size of document in bytes
   *
   * @return Size of document in bytes
   *
   */
  public final Number getSizeBytes() {
    return this.sizeBytes;
  }

  /**
   * Get Whether document can be unshared
   *
   * @return Whether document can be unshared
   *
   */
  public final Boolean getCanUnshare() {
    return this.canUnshare;
  }

  /**
   * Get Name of document
   *
   * @return Name of document
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Document ID
   *
   * @return Document ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Document URL
   *
   * @return Document URL
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Number of workspaces that are updating
   *
   * @return Number of workspaces that are updating
   *
   */
  public final Number getTotalWorkspacesUpdating() {
    return this.totalWorkspacesUpdating;
  }

  /**
   * Get Number of workspaces that are scheduled for updating
   *
   * @return Number of workspaces that are scheduled for updating
   *
   */
  public final Number getTotalWorkspacesScheduledForUpdate() {
    return this.totalWorkspacesScheduledForUpdate;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
