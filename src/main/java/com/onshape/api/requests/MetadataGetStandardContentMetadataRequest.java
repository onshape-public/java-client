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
import com.onshape.api.responses.MetadataGetStandardContentMetadataResponse;
import com.onshape.api.types.CU;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getStandardContentMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetStandardContentMetadataRequest {
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
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  MetadataGetStandardContentMetadataRequest(Number depth, Number detailLevel, Boolean noNull,
      Boolean thumbnail, String linkDocumentId, String configuration) {
    this.depth = depth;
    this.detailLevel = detailLevel;
    this.noNull = noNull;
    this.thumbnail = thumbnail;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
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
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

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

    private MetadataGetStandardContentMetadataRequest build() {
      return new com.onshape.api.requests.MetadataGetStandardContentMetadataRequest(depth,detailLevel,noNull,thumbnail,linkDocumentId,configuration);
    }

    /**
     * Calls getStandardContentMetadata method, Get metadata of a standard content part in a version
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Part ID
     *
     * @param did Document ID
     *
     * @param vid Version ID
     *
     * @param eid Element ID
     *
     * @param cuType Type of Company or User
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final MetadataGetStandardContentMetadataResponse call(String pid, String did, String vid,
        String eid, CU cuType, String oid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/p/:pid", build(), onshape.buildMap("pid", pid, "did", did, "vid", vid, "eid", eid, "cuType", cuType, "oid", oid), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.MetadataGetStandardContentMetadataResponse.class);
    }

    /**
     * Calls getStandardContentMetadata method, Get metadata of a standard content part in a version
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Part ID
     *
     * @param vid Version ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final MetadataGetStandardContentMetadataResponse call(OnshapeDocument document,
        String pid, String vid, String oid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadata/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/p/:pid", build(), onshape.buildMap("pid", pid, "did", document.getDocumentId(), "vid", vid, "eid", document.getElementId(), "cuType", CU.Company, "oid", oid), onshape.buildMap("depth", depth, "detailLevel", detailLevel, "noNull", noNull, "thumbnail", thumbnail, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.MetadataGetStandardContentMetadataResponse.class);
    }
  }
}
