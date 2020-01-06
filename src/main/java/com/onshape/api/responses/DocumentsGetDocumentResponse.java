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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * Response object for getDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsGetDocumentResponse extends AbstractResponseObject {
  /**
   * Information about the default workspace
   */
  @JsonProperty("defaultWorkspace")
  @NotNull
  DocumentsGetDocumentResponseDefaultWorkspace defaultWorkspace;

  /**
   * Onshape internal use
   */
  @JsonProperty("betaCapabilityIds")
  @NotNull
  String[] betaCapabilityIds;

  /**
   * Whether document is public
   */
  @JsonProperty("public")
  @NotNull
  Boolean isPublic;

  /**
   * Information about document owner
   */
  @JsonProperty("owner")
  @NotNull
  DocumentsGetDocumentResponseOwner owner;

  /**
   * User&#39;s level of access to the document. Possible values: OWNER, DELETE, RESHARE, WRITE, READ, COPY, EXPORT, COMMENT
   */
  @JsonProperty("permissionSet")
  @NotNull
  String[] permissionSet;

  /**
   * User&#39;s level of access to the document; can be ANONYMOUS_ACCESS, READ, READ_COPY_EXPORT, COMMENT, WRITE, RESHARE, FULL, or OWNER (Deprecated)
   */
  @JsonProperty("permission")
  @NotNull
  String permission;

  /**
   * When document has been trashed
   */
  @JsonProperty("trashedAt")
  @NotNull
  Date trashedAt;

  /**
   * Whether document has been trashed
   */
  @JsonProperty("trash")
  @NotNull
  Boolean trash;

  /**
   * Whether document has been starred (Deprecated)
   */
  @JsonProperty("starred")
  @NotNull
  String starred;

  /**
   * Whether a shared document is active
   */
  @JsonProperty("active")
  @NotNull
  String active;

  /**
   * Creation date
   */
  @JsonProperty("createdAt")
  @NotNull
  Date createdAt;

  /**
   * The element which the Document Thumbnail should mirror
   */
  @JsonProperty("documentThumbnailElementId")
  @NotNull
  String documentThumbnailElementId;

  /**
   * Thumbnail information
   */
  @JsonProperty("thumbnail")
  @NotNull
  DocumentsGetDocumentResponseThumbnail thumbnail;

  /**
   * User information for the creator of the document
   */
  @JsonProperty("createdBy")
  @NotNull
  DocumentsGetDocumentResponseCreatedBy createdBy;

  /**
   * Date of last modification
   */
  @JsonProperty("modifiedAt")
  @NotNull
  Date modifiedAt;

  /**
   * User information for the last modifier of the document
   */
  @JsonProperty("modifiedBy")
  @NotNull
  DocumentsGetDocumentResponseModifiedBy modifiedBy;

  /**
   * Reserved for future use
   */
  @JsonProperty("tags")
  @NotNull
  String[] tags;

  /**
   * Size of document in bytes
   */
  @JsonProperty("sizeBytes")
  @NotNull
  Number sizeBytes;

  /**
   * Name of document
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Document ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Document URL
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Number of workspaces that are updating
   */
  @JsonProperty("totalWorkspacesUpdating")
  @NotNull
  Number totalWorkspacesUpdating;

  /**
   * Number of workspaces that are scheduled for updating
   */
  @JsonProperty("totalWorkspacesScheduledForUpdate")
  @NotNull
  Number totalWorkspacesScheduledForUpdate;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final DocumentsGetDocumentResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, DocumentsGetDocumentResponse.class);
  }

  /**
   * Get Information about the default workspace
   *
   * @return Information about the default workspace
   *
   */
  public final DocumentsGetDocumentResponseDefaultWorkspace getDefaultWorkspace() {
    return this.defaultWorkspace;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String[] getBetaCapabilityIds() {
    return this.betaCapabilityIds;
  }

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
  public final DocumentsGetDocumentResponseOwner getOwner() {
    return this.owner;
  }

  /**
   * Get User&#39;s level of access to the document. Possible values: OWNER, DELETE, RESHARE, WRITE, READ, COPY, EXPORT, COMMENT
   *
   * @return User&#39;s level of access to the document. Possible values: OWNER, DELETE, RESHARE, WRITE, READ, COPY, EXPORT, COMMENT
   *
   */
  public final String[] getPermissionSet() {
    return this.permissionSet;
  }

  /**
   * Get User&#39;s level of access to the document; can be ANONYMOUS_ACCESS, READ, READ_COPY_EXPORT, COMMENT, WRITE, RESHARE, FULL, or OWNER (Deprecated)
   *
   * @return User&#39;s level of access to the document; can be ANONYMOUS_ACCESS, READ, READ_COPY_EXPORT, COMMENT, WRITE, RESHARE, FULL, or OWNER (Deprecated)
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
   * Get Whether document has been starred (Deprecated)
   *
   * @return Whether document has been starred (Deprecated)
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
  public final String getActive() {
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
   * Get The element which the Document Thumbnail should mirror
   *
   * @return The element which the Document Thumbnail should mirror
   *
   */
  public final String getDocumentThumbnailElementId() {
    return this.documentThumbnailElementId;
  }

  /**
   * Get Thumbnail information
   *
   * @return Thumbnail information
   *
   */
  public final DocumentsGetDocumentResponseThumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Get User information for the creator of the document
   *
   * @return User information for the creator of the document
   *
   */
  public final DocumentsGetDocumentResponseCreatedBy getCreatedBy() {
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
  public final DocumentsGetDocumentResponseModifiedBy getModifiedBy() {
    return this.modifiedBy;
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
