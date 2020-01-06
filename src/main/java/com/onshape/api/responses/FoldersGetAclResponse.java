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
import javax.validation.constraints.NotNull;

/**
 * Response object for getAcl API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class FoldersGetAclResponse extends AbstractResponseObject {
  /**
   * True if the object is public
   */
  @JsonProperty("isPublic")
  @NotNull
  Boolean isPublic;

  /**
   * True if the requesting user has RESHARE privileges on the object. If set to false, entries that do not relate to the caller are removed from the output.
   */
  @JsonProperty("isAdmin")
  @NotNull
  Boolean isAdmin;

  /**
   * True if the object is shared with support
   */
  @JsonProperty("sharedWithSupport")
  @NotNull
  Boolean sharedWithSupport;

  /**
   * A description string indicating whether the object is public or private
   */
  @JsonProperty("visibility")
  @NotNull
  String visibility;

  /**
   * The current share entries for the object. Each share entry indicates an entity that the object is shared with and the permissions granted to the entity
   */
  @JsonProperty("entries")
  @NotNull
  FoldersGetAclResponseEntries[] entries;

  /**
   * The ID of the object
   */
  @JsonProperty("objectId")
  @NotNull
  String objectId;

  /**
   * Set to the value 1, indicating the the objectId indicates a document, or 4, indicating that the objectId indicates a folder
   */
  @JsonProperty("objectType")
  @NotNull
  Number objectType;

  /**
   * Information about the object owner
   */
  @JsonProperty("owner")
  @NotNull
  FoldersGetAclResponseOwner owner;

  /**
   * Not used
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Not used
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * A URL referencing the API to get this structure
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * A list of parent objects from which this object inherits access rights. Parent objects are currently always folders
   */
  @JsonProperty("inheritedAcls")
  @NotNull
  FoldersGetAclResponseInheritedAcls[] inheritedAcls;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final FoldersGetAclResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, FoldersGetAclResponse.class);
  }

  /**
   * Get True if the object is public
   *
   * @return True if the object is public
   *
   */
  public final Boolean getIsPublic() {
    return this.isPublic;
  }

  /**
   * Get True if the requesting user has RESHARE privileges on the object. If set to false, entries that do not relate to the caller are removed from the output.
   *
   * @return True if the requesting user has RESHARE privileges on the object. If set to false, entries that do not relate to the caller are removed from the output.
   *
   */
  public final Boolean getIsAdmin() {
    return this.isAdmin;
  }

  /**
   * Get True if the object is shared with support
   *
   * @return True if the object is shared with support
   *
   */
  public final Boolean getSharedWithSupport() {
    return this.sharedWithSupport;
  }

  /**
   * Get A description string indicating whether the object is public or private
   *
   * @return A description string indicating whether the object is public or private
   *
   */
  public final String getVisibility() {
    return this.visibility;
  }

  /**
   * Get The current share entries for the object. Each share entry indicates an entity that the object is shared with and the permissions granted to the entity
   *
   * @return The current share entries for the object. Each share entry indicates an entity that the object is shared with and the permissions granted to the entity
   *
   */
  public final FoldersGetAclResponseEntries[] getEntries() {
    return this.entries;
  }

  /**
   * Get The ID of the object
   *
   * @return The ID of the object
   *
   */
  public final String getObjectId() {
    return this.objectId;
  }

  /**
   * Get Set to the value 1, indicating the the objectId indicates a document, or 4, indicating that the objectId indicates a folder
   *
   * @return Set to the value 1, indicating the the objectId indicates a document, or 4, indicating that the objectId indicates a folder
   *
   */
  public final Number getObjectType() {
    return this.objectType;
  }

  /**
   * Get Information about the object owner
   *
   * @return Information about the object owner
   *
   */
  public final FoldersGetAclResponseOwner getOwner() {
    return this.owner;
  }

  /**
   * Get Not used
   *
   * @return Not used
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Not used
   *
   * @return Not used
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get A URL referencing the API to get this structure
   *
   * @return A URL referencing the API to get this structure
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get A list of parent objects from which this object inherits access rights. Parent objects are currently always folders
   *
   * @return A list of parent objects from which this object inherits access rights. Parent objects are currently always folders
   *
   */
  public final FoldersGetAclResponseInheritedAcls[] getInheritedAcls() {
    return this.inheritedAcls;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
