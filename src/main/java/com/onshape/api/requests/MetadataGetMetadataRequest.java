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
import com.onshape.api.responses.MetadataGetMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataRequest {
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
   * Element page offset
   */
  @JsonProperty("e-offset")
  Number e_offset;

  /**
   * Element page size, number of the items returned will not exceed this value
   */
  @JsonProperty("e-limit")
  Number e_limit;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  /**
   * If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
   */
  @JsonProperty("inferMetadataOwner")
  Boolean inferMetadataOwner;

  MetadataGetMetadataRequest(Number depth, Number detailLevel, Boolean noNull, Boolean thumbnail,
      Number e_offset, Number e_limit, String linkDocumentId, String configuration,
      Boolean inferMetadataOwner) {
    this.depth = depth;
    this.detailLevel = detailLevel;
    this.noNull = noNull;
    this.thumbnail = thumbnail;
    this.e_offset = e_offset;
    this.e_limit = e_limit;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
    this.inferMetadataOwner = inferMetadataOwner;
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
     * Element page offset
     */
    private Number e_offset;

    /**
     * Element page size, number of the items returned will not exceed this value
     */
    private Number e_limit;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    /**
     * If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     */
    private Boolean inferMetadataOwner;

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
     * Get Element page offset
     *
     * @return Element page offset
     *
     */
    public final Number e_offset() {
      return this.e_offset;
    }

    /**
     * Set Element page offset
     *
     * @param value Element page offset
     *
     * @return the Builder object.
     */
    public final Builder e_offset(Number value) {
      this.e_offset = value;
      return this;
    }

    /**
     * Get Element page size, number of the items returned will not exceed this value
     *
     * @return Element page size, number of the items returned will not exceed this value
     *
     */
    public final Number e_limit() {
      return this.e_limit;
    }

    /**
     * Set Element page size, number of the items returned will not exceed this value
     *
     * @param value Element page size, number of the items returned will not exceed this value
     *
     * @return the Builder object.
     */
    public final Builder e_limit(Number value) {
      this.e_limit = value;
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

    /**
     * Get If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     *
     * @return If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     *
     */
    public final Boolean inferMetadataOwner() {
      return this.inferMetadataOwner;
    }

    /**
     * Set If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     *
     * @param value If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     *
     * @return the Builder object.
     */
    public final Builder inferMetadataOwner(Boolean value) {
      this.inferMetadataOwner = value;
      return this;
    }

    private MetadataGetMetadataRequest build() {
      return new com.onshape.api.requests.MetadataGetMetadataRequest(depth,detailLevel,noNull,thumbnail,e_offset,e_limit,linkDocumentId,configuration,inferMetadataOwner);
    }

    /**
     * Calls getMetadata method, Get workspace / version metadata
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     */
    public final MetadataGetMetadataResponse call(String did, WV wvType, String wv) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/d/:did/[wv]/:wv", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "e-offset", e_offset, "e-limit", e_limit, "linkDocumentId", linkDocumentId, "configuration", configuration, "inferMetadataOwner", inferMetadataOwner), com.onshape.api.responses.MetadataGetMetadataResponse.class);
    }

    /**
     * Calls getMetadata method, Get workspace / version metadata
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final MetadataGetMetadataResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/d/:did/[wv]/:wv", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId()), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "e-offset", e_offset, "e-limit", e_limit, "linkDocumentId", linkDocumentId, "configuration", configuration, "inferMetadataOwner", inferMetadataOwner), com.onshape.api.responses.MetadataGetMetadataResponse.class);
    }
  }
}
