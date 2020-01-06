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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updatePartMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataUpdatePartMetadataRequestItems {
  /**
   * URL of the object to update
   */
  @JsonProperty("href")
  public String href;

  /**
   * Collection of metadata property updates
   */
  @JsonProperty("properties")
  public MetadataUpdatePartMetadataRequestItemsProperties[] properties;

  MetadataUpdatePartMetadataRequestItems(String href,
      MetadataUpdatePartMetadataRequestItemsProperties[] properties) {
    this.href = href;
    this.properties = properties;
  }

  /**
   * Get URL of the object to update
   *
   * @return URL of the object to update
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Collection of metadata property updates
   *
   * @return Collection of metadata property updates
   *
   */
  public final MetadataUpdatePartMetadataRequestItemsProperties[] getProperties() {
    return this.properties;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * URL of the object to update
     */
    private String href;

    /**
     * Collection of metadata property updates
     */
    private MetadataUpdatePartMetadataRequestItemsProperties[] properties;

    Builder() {
    }

    /**
     * Get URL of the object to update
     *
     * @return URL of the object to update
     *
     */
    public final String href() {
      return this.href;
    }

    /**
     * Set URL of the object to update
     *
     * @param value URL of the object to update
     *
     * @return the Builder object.
     */
    public final Builder href(String value) {
      this.href = value;
      return this;
    }

    /**
     * Get Collection of metadata property updates
     *
     * @return Collection of metadata property updates
     *
     */
    public final MetadataUpdatePartMetadataRequestItemsProperties[] properties() {
      return this.properties;
    }

    /**
     * Set Collection of metadata property updates
     *
     * @param value Collection of metadata property updates
     *
     * @return the Builder object.
     */
    public final Builder properties(MetadataUpdatePartMetadataRequestItemsProperties[] value) {
      this.properties = value;
      return this;
    }

    public final MetadataUpdatePartMetadataRequestItems build() {
      return new com.onshape.api.requests.MetadataUpdatePartMetadataRequestItems(href,properties);
    }
  }
}
