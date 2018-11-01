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

/**
 * Object used in calls to shareDocument API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsShareDocumentResponseInheritedAcls {
  /**
   * The ID of the parent folder that contributes access rights
   */
  @JsonProperty("objectId")
  public String objectId;

  /**
   * Set to the value 4, indicating the the objectId identifies a folder
   */
  @JsonProperty("objectType")
  public Number objectType;

  /**
   * The name of the parent object
   */
  @JsonProperty("objectName")
  public Number objectName;

  /**
   * A description string indicating whether the folder is public or private. Currently always private
   */
  @JsonProperty("visibility")
  public String visibility;

  /**
   * The current share entries for the parent folder. Each share entry indicates an entity that the folder and contained objects are shared with and the permissions granted to the entity
   */
  @JsonProperty("entries")
  public DocumentsShareDocumentResponseInheritedAclsEntries[] entries;

  /**
   * Information about the document owner
   */
  @JsonProperty("owner")
  public DocumentsShareDocumentResponseInheritedAclsOwner owner;

  /**
   * Not used
   */
  @JsonProperty("id")
  public String id;

  /**
   * Not used
   */
  @JsonProperty("name")
  public String name;

  /**
   * A URL referencing the API to get this structure
   */
  @JsonProperty("href")
  public String href;

  /**
   * Get The ID of the parent folder that contributes access rights
   *
   * @return The ID of the parent folder that contributes access rights
   *
   */
  public final String getObjectId() {
    return this.objectId;
  }

  /**
   * Get Set to the value 4, indicating the the objectId identifies a folder
   *
   * @return Set to the value 4, indicating the the objectId identifies a folder
   *
   */
  public final Number getObjectType() {
    return this.objectType;
  }

  /**
   * Get The name of the parent object
   *
   * @return The name of the parent object
   *
   */
  public final Number getObjectName() {
    return this.objectName;
  }

  /**
   * Get A description string indicating whether the folder is public or private. Currently always private
   *
   * @return A description string indicating whether the folder is public or private. Currently always private
   *
   */
  public final String getVisibility() {
    return this.visibility;
  }

  /**
   * Get The current share entries for the parent folder. Each share entry indicates an entity that the folder and contained objects are shared with and the permissions granted to the entity
   *
   * @return The current share entries for the parent folder. Each share entry indicates an entity that the folder and contained objects are shared with and the permissions granted to the entity
   *
   */
  public final DocumentsShareDocumentResponseInheritedAclsEntries[] getEntries() {
    return this.entries;
  }

  /**
   * Get Information about the document owner
   *
   * @return Information about the document owner
   *
   */
  public final DocumentsShareDocumentResponseInheritedAclsOwner getOwner() {
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

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
