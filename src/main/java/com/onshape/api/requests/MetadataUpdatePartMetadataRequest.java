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
import com.onshape.api.responses.MetadataUpdatePartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updatePartMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataUpdatePartMetadataRequest {
  /**
   * Collection of metadata object updates
   */
  @JsonProperty("items")
  @NotNull
  MetadataUpdatePartMetadataRequestItems[] items;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  MetadataUpdatePartMetadataRequest(MetadataUpdatePartMetadataRequestItems[] items,
      String configuration) {
    this.items = items;
    this.configuration = configuration;
  }

  /**
   * Get Collection of metadata object updates
   *
   * @return Collection of metadata object updates
   *
   */
  public final MetadataUpdatePartMetadataRequestItems[] getItems() {
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
    private MetadataUpdatePartMetadataRequestItems[] items;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Collection of metadata object updates
     *
     * @return Collection of metadata object updates
     *
     */
    public final MetadataUpdatePartMetadataRequestItems[] items() {
      return this.items;
    }

    /**
     * Set Collection of metadata object updates
     *
     * @param value Collection of metadata object updates
     *
     * @return the Builder object.
     */
    public final Builder items(MetadataUpdatePartMetadataRequestItems[] value) {
      this.items = value;
      return this;
    }

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    private MetadataUpdatePartMetadataRequest build() {
      return new com.onshape.api.requests.MetadataUpdatePartMetadataRequest(items,configuration);
    }

    /**
     * Calls updatePartMetadata method, Update Part metadata
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     *
     * @param eid Element ID
     *
     * @param pid URL encoded Part ID (p) or Part identity (pi)
     */
    public final MetadataUpdatePartMetadataResponse call(String did, WV wvType, String wv,
        String eid, String pid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/metadata/d/:did/[wv]/:wv/e/:eid/p|pi/:pid", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid, "pid", pid), onshape.buildMap("configuration", configuration), com.onshape.api.responses.MetadataUpdatePartMetadataResponse.class);
    }

    /**
     * Calls updatePartMetadata method, Update Part metadata
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid URL encoded Part ID (p) or Part identity (pi)
     */
    public final MetadataUpdatePartMetadataResponse call(OnshapeDocument document, String pid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/metadata/d/:did/[wv]/:wv/e/:eid/p|pi/:pid", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId(), "eid", document.getElementId(), "pid", pid), onshape.buildMap("configuration", configuration), com.onshape.api.responses.MetadataUpdatePartMetadataResponse.class);
    }
  }
}
