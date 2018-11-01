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
import com.onshape.api.responses.FoldersShareFolderResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for shareFolder API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class FoldersShareFolderRequest {
  /**
   * The ID of the folder to be shared. Must match the folder ID specified in the URL.
   */
  @JsonProperty("folderId")
  @NotNull
  String folderId;

  /**
   * List of target entities to share with. Must not be empty.
   */
  @JsonProperty("entries")
  @NotNull
  FoldersShareFolderRequestEntries[] entries;

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

  FoldersShareFolderRequest(String folderId, FoldersShareFolderRequestEntries[] entries,
      String[] permissionSet, Boolean update, String message) {
    this.folderId = folderId;
    this.entries = entries;
    this.permissionSet = permissionSet;
    this.update = update;
    this.message = message;
  }

  /**
   * Get The ID of the folder to be shared. Must match the folder ID specified in the URL.
   *
   * @return The ID of the folder to be shared. Must match the folder ID specified in the URL.
   *
   */
  public final String getFolderId() {
    return this.folderId;
  }

  /**
   * Get List of target entities to share with. Must not be empty.
   *
   * @return List of target entities to share with. Must not be empty.
   *
   */
  public final FoldersShareFolderRequestEntries[] getEntries() {
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
     * The ID of the folder to be shared. Must match the folder ID specified in the URL.
     */
    private String folderId;

    /**
     * List of target entities to share with. Must not be empty.
     */
    private FoldersShareFolderRequestEntries[] entries;

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
     * Get The ID of the folder to be shared. Must match the folder ID specified in the URL.
     *
     * @return The ID of the folder to be shared. Must match the folder ID specified in the URL.
     *
     */
    public final String folderId() {
      return this.folderId;
    }

    /**
     * Set The ID of the folder to be shared. Must match the folder ID specified in the URL.
     *
     * @param value The ID of the folder to be shared. Must match the folder ID specified in the URL.
     *
     * @return the Builder object.
     */
    public final Builder folderId(String value) {
      this.folderId = value;
      return this;
    }

    /**
     * Get List of target entities to share with. Must not be empty.
     *
     * @return List of target entities to share with. Must not be empty.
     *
     */
    public final FoldersShareFolderRequestEntries[] entries() {
      return this.entries;
    }

    /**
     * Set List of target entities to share with. Must not be empty.
     *
     * @param value List of target entities to share with. Must not be empty.
     *
     * @return the Builder object.
     */
    public final Builder entries(FoldersShareFolderRequestEntries[] value) {
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

    private FoldersShareFolderRequest build() {
      return new com.onshape.api.requests.FoldersShareFolderRequest(folderId,entries,permissionSet,update,message);
    }

    /**
     * Calls shareFolder method, Share folder with one or more entities, which may be users, companies, teams or applications.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid Folder ID
     */
    public final FoldersShareFolderResponse call(String fid) throws OnshapeException {
      return onshape.call("post", "/folders/:fid/share", build(), onshape.buildMap("fid", fid), onshape.buildMap(), com.onshape.api.responses.FoldersShareFolderResponse.class);
    }

    /**
     * Calls shareFolder method, Share folder with one or more entities, which may be users, companies, teams or applications.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid Folder ID
     */
    public final FoldersShareFolderResponse call(OnshapeDocument document, String fid) throws
        OnshapeException {
      return onshape.call("post", "/folders/:fid/share", build(), onshape.buildMap("fid", fid), onshape.buildMap(), com.onshape.api.responses.FoldersShareFolderResponse.class);
    }
  }
}
