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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to get API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CommentsGetResponseItems extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * Date created.
   */
  @JsonProperty("createdAt")
  public String createdAt;

  /**
   * Release package id.
   */
  @JsonProperty("releasePackageId")
  public String releasePackageId;

  /**
   * is this document at the top level.
   */
  @JsonProperty("topLevel")
  public Boolean topLevel;

  /**
   * user who created this comment.
   */
  @JsonProperty("user")
  public Map user;

  /**
   * user who resolved this comment.
   */
  @JsonProperty("resolvedBy")
  public Map resolvedBy;

  /**
   * user who reopened this comment.
   */
  @JsonProperty("reopenedBy")
  public Map reopenedBy;

  /**
   * Date resolved.
   */
  @JsonProperty("resolvedAt")
  public String resolvedAt;

  /**
   * Date reopened.
   */
  @JsonProperty("reopenedAt")
  public String reopenedAt;

  /**
   * Date assigned.
   */
  @JsonProperty("assignedAt")
  public String assignedAt;

  /**
   * Can resolve or reopen
   */
  @JsonProperty("canResolveOrReopen")
  public Boolean canResolveOrReopen;

  /**
   * Can delete.
   */
  @JsonProperty("canDelete")
  public Boolean canDelete;

  /**
   * attachment details.
   */
  @JsonProperty("attachment")
  public Map attachment;

  /**
   * thumbnail url.
   */
  @JsonProperty("thumbnail")
  public Map thumbnail;

  /**
   * number of replies.
   */
  @JsonProperty("replyCount")
  public Number replyCount;

  /**
   * 0=open, 1=resolved, 2=reopened.
   */
  @JsonProperty("state")
  public Number state;

  /**
   * id of the document to comment on.
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * id of the document workspace to comment on. Optional field.
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * id of the version to comment on. Optional field.
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * id of the parent comment in case this is a reply.
   */
  @JsonProperty("parentId")
  public String parentId;

  /**
   * Raw text for the comment.
   */
  @JsonProperty("message")
  public String message;

  /**
   * id of the element.
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * query to get element parts like face.
   */
  @JsonProperty("elementQuery")
  public String elementQuery;

  /**
   * id of an element feature.
   */
  @JsonProperty("elementFeature")
  public String elementFeature;

  /**
   * The list of occurrences on which this comment has lived. The list of occurrences is updated after restructure.
   */
  @JsonProperty("elementOccurrences")
  public String[] elementOccurrences;

  /**
   * The list of assembly features on which this comment has lived. The list of features is updated after restructure.
   */
  @JsonProperty("assemblyFeatures")
  public String[] assemblyFeatures;

  /**
   * camera view data associated with this comment.
   */
  @JsonProperty("viewData")
  public CommentsGetResponseItemsViewData viewData;

  /**
   * the user this comment is assigned to.
   */
  @JsonProperty("assignee")
  public Map assignee;

  /**
   * Get Date created.
   *
   * @return Date created.
   *
   */
  public final String getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Get Release package id.
   *
   * @return Release package id.
   *
   */
  public final String getReleasePackageId() {
    return this.releasePackageId;
  }

  /**
   * Get is this document at the top level.
   *
   * @return is this document at the top level.
   *
   */
  public final Boolean getTopLevel() {
    return this.topLevel;
  }

  /**
   * Get user who created this comment.
   *
   * @return user who created this comment.
   *
   */
  public final Map getUser() {
    return this.user;
  }

  /**
   * Get user who resolved this comment.
   *
   * @return user who resolved this comment.
   *
   */
  public final Map getResolvedBy() {
    return this.resolvedBy;
  }

  /**
   * Get user who reopened this comment.
   *
   * @return user who reopened this comment.
   *
   */
  public final Map getReopenedBy() {
    return this.reopenedBy;
  }

  /**
   * Get Date resolved.
   *
   * @return Date resolved.
   *
   */
  public final String getResolvedAt() {
    return this.resolvedAt;
  }

  /**
   * Get Date reopened.
   *
   * @return Date reopened.
   *
   */
  public final String getReopenedAt() {
    return this.reopenedAt;
  }

  /**
   * Get Date assigned.
   *
   * @return Date assigned.
   *
   */
  public final String getAssignedAt() {
    return this.assignedAt;
  }

  /**
   * Get Can resolve or reopen
   *
   * @return Can resolve or reopen
   *
   */
  public final Boolean getCanResolveOrReopen() {
    return this.canResolveOrReopen;
  }

  /**
   * Get Can delete.
   *
   * @return Can delete.
   *
   */
  public final Boolean getCanDelete() {
    return this.canDelete;
  }

  /**
   * Get attachment details.
   *
   * @return attachment details.
   *
   */
  public final Map getAttachment() {
    return this.attachment;
  }

  /**
   * Get thumbnail url.
   *
   * @return thumbnail url.
   *
   */
  public final Map getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Get number of replies.
   *
   * @return number of replies.
   *
   */
  public final Number getReplyCount() {
    return this.replyCount;
  }

  /**
   * Get 0=open, 1=resolved, 2=reopened.
   *
   * @return 0=open, 1=resolved, 2=reopened.
   *
   */
  public final Number getState() {
    return this.state;
  }

  /**
   * Get id of the document to comment on.
   *
   * @return id of the document to comment on.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get id of the document workspace to comment on. Optional field.
   *
   * @return id of the document workspace to comment on. Optional field.
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get id of the version to comment on. Optional field.
   *
   * @return id of the version to comment on. Optional field.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get id of the parent comment in case this is a reply.
   *
   * @return id of the parent comment in case this is a reply.
   *
   */
  public final String getParentId() {
    return this.parentId;
  }

  /**
   * Get Raw text for the comment.
   *
   * @return Raw text for the comment.
   *
   */
  public final String getMessage() {
    return this.message;
  }

  /**
   * Get id of the element.
   *
   * @return id of the element.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get query to get element parts like face.
   *
   * @return query to get element parts like face.
   *
   */
  public final String getElementQuery() {
    return this.elementQuery;
  }

  /**
   * Get id of an element feature.
   *
   * @return id of an element feature.
   *
   */
  public final String getElementFeature() {
    return this.elementFeature;
  }

  /**
   * Get The list of occurrences on which this comment has lived. The list of occurrences is updated after restructure.
   *
   * @return The list of occurrences on which this comment has lived. The list of occurrences is updated after restructure.
   *
   */
  public final String[] getElementOccurrences() {
    return this.elementOccurrences;
  }

  /**
   * Get The list of assembly features on which this comment has lived. The list of features is updated after restructure.
   *
   * @return The list of assembly features on which this comment has lived. The list of features is updated after restructure.
   *
   */
  public final String[] getAssemblyFeatures() {
    return this.assemblyFeatures;
  }

  /**
   * Get camera view data associated with this comment.
   *
   * @return camera view data associated with this comment.
   *
   */
  public final CommentsGetResponseItemsViewData getViewData() {
    return this.viewData;
  }

  /**
   * Get the user this comment is assigned to.
   *
   * @return the user this comment is assigned to.
   *
   */
  public final Map getAssignee() {
    return this.assignee;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, workspaceId, null, null, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
