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
import com.onshape.api.responses.DocumentsShareDocumentResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for shareDocument API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsShareDocumentRequest {
  /**
   * The ID of the document to be shared. Must match the document ID specified in the URL.
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
   */
  @JsonProperty("elementId")
  String elementId;

  /**
   * List of target entities to share with. Must not be empty.
   */
  @JsonProperty("entries")
  @NotNull
  DocumentsShareDocumentRequestEntries[] entries;

  /**
   * The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
   */
  @JsonProperty("permissionSet")
  @NotNull
  String[] permissionSet;

  /**
   * If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
   */
  @JsonProperty("update")
  Boolean update;

  /**
   * An optional message to include in the share email. This message has a maximum allowed size.
   */
  @JsonProperty("message")
  String message;

  DocumentsShareDocumentRequest(String documentId, String workspaceId, String elementId,
      DocumentsShareDocumentRequestEntries[] entries, String[] permissionSet, Boolean update,
      String message) {
    this.documentId = documentId;
    this.workspaceId = workspaceId;
    this.elementId = elementId;
    this.entries = entries;
    this.permissionSet = permissionSet;
    this.update = update;
    this.message = message;
  }

  /**
   * Get The ID of the document to be shared. Must match the document ID specified in the URL.
   *
   * @return The ID of the document to be shared. Must match the document ID specified in the URL.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
   *
   * @return The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
   *
   * @return The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get List of target entities to share with. Must not be empty.
   *
   * @return List of target entities to share with. Must not be empty.
   *
   */
  public final DocumentsShareDocumentRequestEntries[] getEntries() {
    return this.entries;
  }

  /**
   * Get The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
   *
   * @return The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
   *
   */
  public final String[] getPermissionSet() {
    return this.permissionSet;
  }

  /**
   * Get If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
   *
   * @return If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
   *
   */
  public final Boolean getUpdate() {
    return this.update;
  }

  /**
   * Get An optional message to include in the share email. This message has a maximum allowed size.
   *
   * @return An optional message to include in the share email. This message has a maximum allowed size.
   *
   */
  public final String getMessage() {
    return this.message;
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
     * The ID of the document to be shared. Must match the document ID specified in the URL.
     */
    private String documentId;

    /**
     * The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
     */
    private String workspaceId;

    /**
     * The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
     */
    private String elementId;

    /**
     * List of target entities to share with. Must not be empty.
     */
    private DocumentsShareDocumentRequestEntries[] entries;

    /**
     * The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
     */
    private String[] permissionSet;

    /**
     * If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
     */
    private Boolean update;

    /**
     * An optional message to include in the share email. This message has a maximum allowed size.
     */
    private String message;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The ID of the document to be shared. Must match the document ID specified in the URL.
     *
     * @return The ID of the document to be shared. Must match the document ID specified in the URL.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set The ID of the document to be shared. Must match the document ID specified in the URL.
     *
     * @param value The ID of the document to be shared. Must match the document ID specified in the URL.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
     *
     * @return The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
     *
     * @param value The ID of a workspace for use as the scope of sharing. Used only to form URLs in a share email to the share recipient.
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
     *
     * @return The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
     *
     * @param value The ID of an element within the document to share. Used only to form URLs in a share email to the share recipient.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get List of target entities to share with. Must not be empty.
     *
     * @return List of target entities to share with. Must not be empty.
     *
     */
    public final DocumentsShareDocumentRequestEntries[] entries() {
      return this.entries;
    }

    /**
     * Set List of target entities to share with. Must not be empty.
     *
     * @param value List of target entities to share with. Must not be empty.
     *
     * @return the Builder object.
     */
    public final Builder entries(DocumentsShareDocumentRequestEntries[] value) {
      this.entries = value;
      return this;
    }

    /**
     * Get The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
     *
     * @return The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
     *
     */
    public final String[] permissionSet() {
      return this.permissionSet;
    }

    /**
     * Set The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
     *
     * @param value The permissions to grant to the entities. Must not be empty. The valid permissions are READ, WRITE, DELETE, RESHARE, COMMENT, LINK, COPY, OWNER. It is an error for a permission set to be specified that is identical to the current permissions for an entity in the entries list.
     *
     * @return the Builder object.
     */
    public final Builder permissionSet(String[] value) {
      this.permissionSet = value;
      return this;
    }

    /**
     * Get If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
     *
     * @return If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
     *
     */
    public final Boolean update() {
      return this.update;
    }

    /**
     * Set If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
     *
     * @param value If true, indicates that the request is intended to be an update of existing share permissions for the entities in the entries list.
     *
     * @return the Builder object.
     */
    public final Builder update(Boolean value) {
      this.update = value;
      return this;
    }

    /**
     * Get An optional message to include in the share email. This message has a maximum allowed size.
     *
     * @return An optional message to include in the share email. This message has a maximum allowed size.
     *
     */
    public final String message() {
      return this.message;
    }

    /**
     * Set An optional message to include in the share email. This message has a maximum allowed size.
     *
     * @param value An optional message to include in the share email. This message has a maximum allowed size.
     *
     * @return the Builder object.
     */
    public final Builder message(String value) {
      this.message = value;
      return this;
    }

    private DocumentsShareDocumentRequest build() {
      return new com.onshape.api.requests.DocumentsShareDocumentRequest(documentId,workspaceId,elementId,entries,permissionSet,update,message);
    }

    /**
     * Calls shareDocument method, Share document with one or more entities, which may be users, companies, teams or applications.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     */
    public final DocumentsShareDocumentResponse call(String did) throws OnshapeException {
      return onshape.call("post", "/documents/:did/share", build(), onshape.buildMap("did", did), onshape.buildMap(), com.onshape.api.responses.DocumentsShareDocumentResponse.class);
    }

    /**
     * Calls shareDocument method, Share document with one or more entities, which may be users, companies, teams or applications.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsShareDocumentResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/documents/:did/share", build(), onshape.buildMap("did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsShareDocumentResponse.class);
    }
  }
}
