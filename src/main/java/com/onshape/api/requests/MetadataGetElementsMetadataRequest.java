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
import com.onshape.api.responses.MetadataGetElementsMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getElementsMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class MetadataGetElementsMetadataRequest {
  /**
   * Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
   */
  @JsonProperty("depth")
  Number depth;

  /**
   * Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
   */
  @JsonProperty("detailLevel")
  Number detailLevel;

  /**
   * Filter out empty metadata properties if True.
   */
  @JsonProperty("noNull")
  Boolean noNull;

  /**
   * Thumbnails information will be returned if true
   */
  @JsonProperty("thumbnail")
  Boolean thumbnail;

  /**
   * Part page offset
   */
  @JsonProperty("p-offset")
  Number p_offset;

  /**
   * Part page size, number of the items returned will not exceed this value
   */
  @JsonProperty("p-limit")
  Number p_limit;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  MetadataGetElementsMetadataRequest(Number depth, Number detailLevel, Boolean noNull,
      Boolean thumbnail, Number p_offset, Number p_limit, String linkDocumentId) {
    this.depth = depth;
    this.detailLevel = detailLevel;
    this.noNull = noNull;
    this.thumbnail = thumbnail;
    this.p_offset = p_offset;
    this.p_limit = p_limit;
    this.linkDocumentId = linkDocumentId;
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
     * Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
     */
    private Number depth;

    /**
     * Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
     */
    private Number detailLevel;

    /**
     * Filter out empty metadata properties if True.
     */
    private Boolean noNull;

    /**
     * Thumbnails information will be returned if true
     */
    private Boolean thumbnail;

    /**
     * Part page offset
     */
    private Number p_offset;

    /**
     * Part page size, number of the items returned will not exceed this value
     */
    private Number p_limit;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
     *
     * @return Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
     *
     */
    public final Number depth() {
      return this.depth;
    }

    /**
     * Set Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
     *
     * @param value Number of levels of hierarchy to populate in metadata REST API response, 1 - simple fields of top level object, 2 - collection and object fields in the top level object, etc.
     *
     * @return the Builder object.
     */
    public final Builder depth(Number value) {
      this.depth = value;
      return this;
    }

    /**
     * Get Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
     *
     * @return Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
     *
     */
    public final Number detailLevel() {
      return this.detailLevel;
    }

    /**
     * Set Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
     *
     * @param value Filter out metadata properties by detail level, 1 - fewer fields, ..., 5 - all fields.
     *
     * @return the Builder object.
     */
    public final Builder detailLevel(Number value) {
      this.detailLevel = value;
      return this;
    }

    /**
     * Get Filter out empty metadata properties if True.
     *
     * @return Filter out empty metadata properties if True.
     *
     */
    public final Boolean noNull() {
      return this.noNull;
    }

    /**
     * Set Filter out empty metadata properties if True.
     *
     * @param value Filter out empty metadata properties if True.
     *
     * @return the Builder object.
     */
    public final Builder noNull(Boolean value) {
      this.noNull = value;
      return this;
    }

    /**
     * Get Thumbnails information will be returned if true
     *
     * @return Thumbnails information will be returned if true
     *
     */
    public final Boolean thumbnail() {
      return this.thumbnail;
    }

    /**
     * Set Thumbnails information will be returned if true
     *
     * @param value Thumbnails information will be returned if true
     *
     * @return the Builder object.
     */
    public final Builder thumbnail(Boolean value) {
      this.thumbnail = value;
      return this;
    }

    /**
     * Get Part page offset
     *
     * @return Part page offset
     *
     */
    public final Number p_offset() {
      return this.p_offset;
    }

    /**
     * Set Part page offset
     *
     * @param value Part page offset
     *
     * @return the Builder object.
     */
    public final Builder p_offset(Number value) {
      this.p_offset = value;
      return this;
    }

    /**
     * Get Part page size, number of the items returned will not exceed this value
     *
     * @return Part page size, number of the items returned will not exceed this value
     *
     */
    public final Number p_limit() {
      return this.p_limit;
    }

    /**
     * Set Part page size, number of the items returned will not exceed this value
     *
     * @param value Part page size, number of the items returned will not exceed this value
     *
     * @return the Builder object.
     */
    public final Builder p_limit(Number value) {
      this.p_limit = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private MetadataGetElementsMetadataRequest build() {
      return new com.onshape.api.requests.MetadataGetElementsMetadataRequest(depth,detailLevel,noNull,thumbnail,p_offset,p_limit,linkDocumentId);
    }

    /**
     * Calls getElementsMetadata method, Get metadata of elements in a workspace / version
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     */
    public final MetadataGetElementsMetadataResponse call(String did, WV wvType, String wv) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/d/:did/[wv]/:wv/e", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "p-offset", p_offset, "p-limit", p_limit, "linkDocumentId", linkDocumentId), com.onshape.api.responses.MetadataGetElementsMetadataResponse.class);
    }

    /**
     * Calls getElementsMetadata method, Get metadata of elements in a workspace / version
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final MetadataGetElementsMetadataResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/d/:did/[wv]/:wv/e", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId()), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "p-offset", p_offset, "p-limit", p_limit, "linkDocumentId", linkDocumentId), com.onshape.api.responses.MetadataGetElementsMetadataResponse.class);
    }
  }
}
