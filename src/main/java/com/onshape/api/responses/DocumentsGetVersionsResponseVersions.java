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
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * Object used in calls to getVersions API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetVersionsResponseVersions {
  /**
   * ID of parent version, or empty string for root version
   */
  @JsonProperty("parent")
  public String parent;

  /**
   * User information for the creator of the version
   */
  @JsonProperty("creator")
  public DocumentsGetVersionsResponseVersionsCreator creator;

  /**
   * User-provided description of version
   */
  @JsonProperty("description")
  public String description;

  /**
   * Document microversion ID for version
   */
  @JsonProperty("microversion")
  public String microversion;

  /**
   * Creation date
   */
  @JsonProperty("createdAt")
  public Date createdAt;

  /**
   * Last modification date
   */
  @JsonProperty("modifiedAt")
  public Date modifiedAt;

  /**
   * ID of version
   */
  @JsonProperty("id")
  public String id;

  /**
   * Get ID of parent version, or empty string for root version
   *
   * @return ID of parent version, or empty string for root version
   *
   */
  public final String getParent() {
    return this.parent;
  }

  /**
   * Get User information for the creator of the version
   *
   * @return User information for the creator of the version
   *
   */
  public final DocumentsGetVersionsResponseVersionsCreator getCreator() {
    return this.creator;
  }

  /**
   * Get User-provided description of version
   *
   * @return User-provided description of version
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Document microversion ID for version
   *
   * @return Document microversion ID for version
   *
   */
  public final String getMicroversion() {
    return this.microversion;
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
   * Get Last modification date
   *
   * @return Last modification date
   *
   */
  public final Date getModifiedAt() {
    return this.modifiedAt;
  }

  /**
   * Get ID of version
   *
   * @return ID of version
   *
   */
  public final String getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
