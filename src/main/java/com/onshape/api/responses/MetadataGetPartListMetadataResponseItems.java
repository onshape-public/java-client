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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getPartListMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class MetadataGetPartListMetadataResponseItems {
  /**
   * Part properties
   */
  @JsonProperty("properties")
  public Map[] properties;

  /**
   * Part id
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Part type
   */
  @JsonProperty("partType")
  public String partType;

  /**
   * True if part is a mesh
   */
  @JsonProperty("isMesh")
  public Boolean isMesh;

  /**
   * Part&#39;s thumbnail
   */
  @JsonProperty("thumbnail")
  public Map thumbnail;

  /**
   * URI of Part metadata
   */
  @JsonProperty("href")
  public String href;

  /**
   * Get Part properties
   *
   * @return Part properties
   *
   */
  public final Map[] getProperties() {
    return this.properties;
  }

  /**
   * Get Part id
   *
   * @return Part id
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Part type
   *
   * @return Part type
   *
   */
  public final String getPartType() {
    return this.partType;
  }

  /**
   * Get True if part is a mesh
   *
   * @return True if part is a mesh
   *
   */
  public final Boolean getIsMesh() {
    return this.isMesh;
  }

  /**
   * Get Part&#39;s thumbnail
   *
   * @return Part&#39;s thumbnail
   *
   */
  public final Map getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Get URI of Part metadata
   *
   * @return URI of Part metadata
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
