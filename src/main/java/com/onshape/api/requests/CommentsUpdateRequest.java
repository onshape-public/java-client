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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.CommentsUpdateResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for update API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CommentsUpdateRequest {
  /**
   * id of the document to comment on.
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * id of the document workspace to comment on. Optional field.
   */
  @JsonProperty("workspaceId")
  @NotNull
  String workspaceId;

  /**
   * id of the version to comment on. Optional field.
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * id of the parent comment in case this is a reply.
   */
  @JsonProperty("parentId")
  @NotNull
  String parentId;

  /**
   * Raw text for the comment.
   */
  @JsonProperty("message")
  @NotNull
  String message;

  /**
   * id of the element.
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * query to get element parts like face.
   */
  @JsonProperty("elementQuery")
  @NotNull
  String elementQuery;

  /**
   * id of an element feature.
   */
  @JsonProperty("elementFeature")
  @NotNull
  String elementFeature;

  /**
   * id of an assembly occurrence.
   */
  @JsonProperty("elementOccurrence")
  @NotNull
  String elementOccurrence;

  /**
   * id of an assembly feature, with the owner occurrence path id prepended.
   */
  @JsonProperty("assemblyFeature")
  @NotNull
  String assemblyFeature;

  /**
   * camera view data associated with this comment.
   */
  @JsonProperty("viewData")
  @NotNull
  CommentsUpdateRequestViewData viewData;

  /**
   * the user this comment is assigned to.
   */
  @JsonProperty("assignee")
  @NotNull
  String assignee;

  CommentsUpdateRequest(String documentId, String workspaceId, String versionId, String parentId,
      String message, String elementId, String elementQuery, String elementFeature,
      String elementOccurrence, String assemblyFeature, CommentsUpdateRequestViewData viewData,
      String assignee) {
    this.documentId = documentId;
    this.workspaceId = workspaceId;
    this.versionId = versionId;
    this.parentId = parentId;
    this.message = message;
    this.elementId = elementId;
    this.elementQuery = elementQuery;
    this.elementFeature = elementFeature;
    this.elementOccurrence = elementOccurrence;
    this.assemblyFeature = assemblyFeature;
    this.viewData = viewData;
    this.assignee = assignee;
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
   * Get id of an assembly occurrence.
   *
   * @return id of an assembly occurrence.
   *
   */
  public final String getElementOccurrence() {
    return this.elementOccurrence;
  }

  /**
   * Get id of an assembly feature, with the owner occurrence path id prepended.
   *
   * @return id of an assembly feature, with the owner occurrence path id prepended.
   *
   */
  public final String getAssemblyFeature() {
    return this.assemblyFeature;
  }

  /**
   * Get camera view data associated with this comment.
   *
   * @return camera view data associated with this comment.
   *
   */
  public final CommentsUpdateRequestViewData getViewData() {
    return this.viewData;
  }

  /**
   * Get the user this comment is assigned to.
   *
   * @return the user this comment is assigned to.
   *
   */
  public final String getAssignee() {
    return this.assignee;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * id of the document to comment on.
     */
    private String documentId;

    /**
     * id of the document workspace to comment on. Optional field.
     */
    private String workspaceId;

    /**
     * id of the version to comment on. Optional field.
     */
    private String versionId;

    /**
     * id of the parent comment in case this is a reply.
     */
    private String parentId;

    /**
     * Raw text for the comment.
     */
    private String message;

    /**
     * id of the element.
     */
    private String elementId;

    /**
     * query to get element parts like face.
     */
    private String elementQuery;

    /**
     * id of an element feature.
     */
    private String elementFeature;

    /**
     * id of an assembly occurrence.
     */
    private String elementOccurrence;

    /**
     * id of an assembly feature, with the owner occurrence path id prepended.
     */
    private String assemblyFeature;

    /**
     * camera view data associated with this comment.
     */
    private CommentsUpdateRequestViewData viewData;

    /**
     * the user this comment is assigned to.
     */
    private String assignee;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get id of the document to comment on.
     *
     * @return id of the document to comment on.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set id of the document to comment on.
     *
     * @param value id of the document to comment on.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get id of the document workspace to comment on. Optional field.
     *
     * @return id of the document workspace to comment on. Optional field.
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set id of the document workspace to comment on. Optional field.
     *
     * @param value id of the document workspace to comment on. Optional field.
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get id of the version to comment on. Optional field.
     *
     * @return id of the version to comment on. Optional field.
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set id of the version to comment on. Optional field.
     *
     * @param value id of the version to comment on. Optional field.
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get id of the parent comment in case this is a reply.
     *
     * @return id of the parent comment in case this is a reply.
     *
     */
    public final String parentId() {
      return this.parentId;
    }

    /**
     * Set id of the parent comment in case this is a reply.
     *
     * @param value id of the parent comment in case this is a reply.
     *
     * @return the Builder object.
     */
    public final Builder parentId(String value) {
      this.parentId = value;
      return this;
    }

    /**
     * Get Raw text for the comment.
     *
     * @return Raw text for the comment.
     *
     */
    public final String message() {
      return this.message;
    }

    /**
     * Set Raw text for the comment.
     *
     * @param value Raw text for the comment.
     *
     * @return the Builder object.
     */
    public final Builder message(String value) {
      this.message = value;
      return this;
    }

    /**
     * Get id of the element.
     *
     * @return id of the element.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set id of the element.
     *
     * @param value id of the element.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get query to get element parts like face.
     *
     * @return query to get element parts like face.
     *
     */
    public final String elementQuery() {
      return this.elementQuery;
    }

    /**
     * Set query to get element parts like face.
     *
     * @param value query to get element parts like face.
     *
     * @return the Builder object.
     */
    public final Builder elementQuery(String value) {
      this.elementQuery = value;
      return this;
    }

    /**
     * Get id of an element feature.
     *
     * @return id of an element feature.
     *
     */
    public final String elementFeature() {
      return this.elementFeature;
    }

    /**
     * Set id of an element feature.
     *
     * @param value id of an element feature.
     *
     * @return the Builder object.
     */
    public final Builder elementFeature(String value) {
      this.elementFeature = value;
      return this;
    }

    /**
     * Get id of an assembly occurrence.
     *
     * @return id of an assembly occurrence.
     *
     */
    public final String elementOccurrence() {
      return this.elementOccurrence;
    }

    /**
     * Set id of an assembly occurrence.
     *
     * @param value id of an assembly occurrence.
     *
     * @return the Builder object.
     */
    public final Builder elementOccurrence(String value) {
      this.elementOccurrence = value;
      return this;
    }

    /**
     * Get id of an assembly feature, with the owner occurrence path id prepended.
     *
     * @return id of an assembly feature, with the owner occurrence path id prepended.
     *
     */
    public final String assemblyFeature() {
      return this.assemblyFeature;
    }

    /**
     * Set id of an assembly feature, with the owner occurrence path id prepended.
     *
     * @param value id of an assembly feature, with the owner occurrence path id prepended.
     *
     * @return the Builder object.
     */
    public final Builder assemblyFeature(String value) {
      this.assemblyFeature = value;
      return this;
    }

    /**
     * Get camera view data associated with this comment.
     *
     * @return camera view data associated with this comment.
     *
     */
    public final CommentsUpdateRequestViewData viewData() {
      return this.viewData;
    }

    /**
     * Set camera view data associated with this comment.
     *
     * @param value camera view data associated with this comment.
     *
     * @return the Builder object.
     */
    public final Builder viewData(CommentsUpdateRequestViewData value) {
      this.viewData = value;
      return this;
    }

    /**
     * Get the user this comment is assigned to.
     *
     * @return the user this comment is assigned to.
     *
     */
    public final String assignee() {
      return this.assignee;
    }

    /**
     * Set the user this comment is assigned to.
     *
     * @param value the user this comment is assigned to.
     *
     * @return the Builder object.
     */
    public final Builder assignee(String value) {
      this.assignee = value;
      return this;
    }

    private CommentsUpdateRequest build() {
      return new com.onshape.api.requests.CommentsUpdateRequest(documentId,workspaceId,versionId,parentId,message,elementId,elementQuery,elementFeature,elementOccurrence,assemblyFeature,viewData,assignee);
    }

    /**
     * Calls update method, Update a user's comment
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Comment ID
     */
    public final CommentsUpdateResponse call(String cid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/comments/:cid", build(), onshape.buildMap("cid", cid), onshape.buildMap(), com.onshape.api.responses.CommentsUpdateResponse.class);
    }
  }
}
