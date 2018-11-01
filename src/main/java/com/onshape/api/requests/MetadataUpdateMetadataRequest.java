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
import com.onshape.api.responses.MetadataUpdateMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class MetadataUpdateMetadataRequest {
  /**
   * Collection of metadata object updates
   */
  @JsonProperty("items")
  @NotNull
  MetadataUpdateMetadataRequestItems[] items;

  MetadataUpdateMetadataRequest(MetadataUpdateMetadataRequestItems[] items) {
    this.items = items;
  }

  /**
   * Get Collection of metadata object updates
   *
   * @return Collection of metadata object updates
   *
   */
  public final MetadataUpdateMetadataRequestItems[] getItems() {
    return this.items;
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
     * Collection of metadata object updates
     */
    private MetadataUpdateMetadataRequestItems[] items;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Collection of metadata object updates
     *
     * @return Collection of metadata object updates
     *
     */
    public final MetadataUpdateMetadataRequestItems[] items() {
      return this.items;
    }

    /**
     * Set Collection of metadata object updates
     *
     * @param value Collection of metadata object updates
     *
     * @return the Builder object.
     */
    public final Builder items(MetadataUpdateMetadataRequestItems[] value) {
      this.items = value;
      return this;
    }

    private MetadataUpdateMetadataRequest build() {
      return new com.onshape.api.requests.MetadataUpdateMetadataRequest(items);
    }

    /**
     * Calls updateMetadata method, Update metadata. Updates of parts in configurable Par Studios require configuration information
     *     be included within the items.*.href fields for a specific part. The response format varies depending
     *     on whether there are multiple items to update.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     */
    public final MetadataUpdateMetadataResponse call(String did, WV wvType, String wv) throws
        OnshapeException {
      return onshape.call("post", "/metadata/d/:did/[wv]/:wv", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv), onshape.buildMap(), com.onshape.api.responses.MetadataUpdateMetadataResponse.class);
    }

    /**
     * Calls updateMetadata method, Update metadata. Updates of parts in configurable Par Studios require configuration information
     *     be included within the items.*.href fields for a specific part. The response format varies depending
     *     on whether there are multiple items to update.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final MetadataUpdateMetadataResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/metadata/d/:did/[wv]/:wv", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", WV.Workspace, "wv", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.MetadataUpdateMetadataResponse.class);
    }
  }
}
