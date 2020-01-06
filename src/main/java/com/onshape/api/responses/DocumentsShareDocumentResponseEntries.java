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
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to shareDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsShareDocumentResponseEntries extends AbstractResponseObject {
  /**
   * The ID of the object
   */
  @JsonProperty("objectId")
  public String objectId;

  /**
   * The ID of the entity to which this entry corresponds
   */
  @JsonProperty("entryId")
  public String entryId;

  /**
   * The type of entity to which the share entry applies. Possible values include 0=User, 1=Company, 2=Team, 3=&lt;Reserved&gt;, 4=Application
   */
  @JsonProperty("entryType")
  public Number entryType;

  /**
   * The state of user to which the share entry applies, if a user. Possible states include ACTIVE, INACTIVE, REQUESTED, APPROVED, DELETED, REQUEST_EXPIRED.
   */
  @JsonProperty("entryState")
  public String entryState;

  /**
   * The email of the user, if the entryType is USER.
   */
  @JsonProperty("email")
  public String email;

  /**
   * The name of the entity that the object is shared with
   */
  @JsonProperty("name")
  public String name;

  /**
   * The permissions for the object that have been granted to the entity.
   */
  @JsonProperty("permissionSet")
  public String[] permissionSet;

  /**
   * Obsolete
   */
  @JsonProperty("permission")
  public Number permission;

  /**
   * For internal use
   */
  @JsonProperty("image")
  public String image;

  /**
   * For internal use
   */
  @JsonProperty("pendingOwnerTransfer")
  public Boolean pendingOwnerTransfer;

  /**
   * For internal use
   */
  @JsonProperty("acceptOwnerTransfer")
  public Boolean acceptOwnerTransfer;

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
   * Get The ID of the entity to which this entry corresponds
   *
   * @return The ID of the entity to which this entry corresponds
   *
   */
  public final String getEntryId() {
    return this.entryId;
  }

  /**
   * Get The type of entity to which the share entry applies. Possible values include 0=User, 1=Company, 2=Team, 3=&lt;Reserved&gt;, 4=Application
   *
   * @return The type of entity to which the share entry applies. Possible values include 0=User, 1=Company, 2=Team, 3=&lt;Reserved&gt;, 4=Application
   *
   */
  public final Number getEntryType() {
    return this.entryType;
  }

  /**
   * Get The state of user to which the share entry applies, if a user. Possible states include ACTIVE, INACTIVE, REQUESTED, APPROVED, DELETED, REQUEST_EXPIRED.
   *
   * @return The state of user to which the share entry applies, if a user. Possible states include ACTIVE, INACTIVE, REQUESTED, APPROVED, DELETED, REQUEST_EXPIRED.
   *
   */
  public final String getEntryState() {
    return this.entryState;
  }

  /**
   * Get The email of the user, if the entryType is USER.
   *
   * @return The email of the user, if the entryType is USER.
   *
   */
  public final String getEmail() {
    return this.email;
  }

  /**
   * Get The name of the entity that the object is shared with
   *
   * @return The name of the entity that the object is shared with
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get The permissions for the object that have been granted to the entity.
   *
   * @return The permissions for the object that have been granted to the entity.
   *
   */
  public final String[] getPermissionSet() {
    return this.permissionSet;
  }

  /**
   * Get Obsolete
   *
   * @return Obsolete
   *
   */
  public final Number getPermission() {
    return this.permission;
  }

  /**
   * Get For internal use
   *
   * @return For internal use
   *
   */
  public final String getImage() {
    return this.image;
  }

  /**
   * Get For internal use
   *
   * @return For internal use
   *
   */
  public final Boolean getPendingOwnerTransfer() {
    return this.pendingOwnerTransfer;
  }

  /**
   * Get For internal use
   *
   * @return For internal use
   *
   */
  public final Boolean getAcceptOwnerTransfer() {
    return this.acceptOwnerTransfer;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
