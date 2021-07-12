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
import com.onshape.api.responses.MetadataCategorySearchResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for search API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategorySearchRequest {
  /**
   * category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * ID of the document the categories are associated with.
   */
  @JsonProperty("documentId")
  String documentId;

  /**
   * Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
   */
  @JsonProperty("objectType")
  Number objectType;

  /**
   * Query string, in null or empty all categories will be returned
   */
  @JsonProperty("q")
  String q;

  /**
   * If true, only active categories will be returned. If false, all categories will be returned.
   */
  @JsonProperty("activeOnly")
  Boolean activeOnly;

  /**
   * Flag whether to include or exclude Onshape default categories
   */
  @JsonProperty("includeOnshape")
  Boolean includeOnshape;

  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (max is 50)
   */
  @JsonProperty("limit")
  Number limit;

  MetadataCategorySearchRequest(Number ownerType, String documentId, Number objectType, String q,
      Boolean activeOnly, Boolean includeOnshape, Number offset, Number limit) {
    this.ownerType = ownerType;
    this.documentId = documentId;
    this.objectType = objectType;
    this.q = q;
    this.activeOnly = activeOnly;
    this.includeOnshape = includeOnshape;
    this.offset = offset;
    this.limit = limit;
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
     * category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
     */
    private Number ownerType;

    /**
     * ID of the document the categories are associated with.
     */
    private String documentId;

    /**
     * Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
     */
    private Number objectType;

    /**
     * Query string, in null or empty all categories will be returned
     */
    private String q;

    /**
     * If true, only active categories will be returned. If false, all categories will be returned.
     */
    private Boolean activeOnly;

    /**
     * Flag whether to include or exclude Onshape default categories
     */
    private Boolean includeOnshape;

    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (max is 50)
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
     *
     * @return category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
     *
     * @param value category owner type, optional that can be: 1:company 2:onshape (default: 1, ONSHAPE categories will be included)
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get ID of the document the categories are associated with.
     *
     * @return ID of the document the categories are associated with.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set ID of the document the categories are associated with.
     *
     * @param value ID of the document the categories are associated with.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @return Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
     *
     */
    public final Number objectType() {
      return this.objectType;
    }

    /**
     * Set Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @param value Metadata object type. Optional but if specified, it must be BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @return the Builder object.
     */
    public final Builder objectType(Number value) {
      this.objectType = value;
      return this;
    }

    /**
     * Get Query string, in null or empty all categories will be returned
     *
     * @return Query string, in null or empty all categories will be returned
     *
     */
    public final String q() {
      return this.q;
    }

    /**
     * Set Query string, in null or empty all categories will be returned
     *
     * @param value Query string, in null or empty all categories will be returned
     *
     * @return the Builder object.
     */
    public final Builder q(String value) {
      this.q = value;
      return this;
    }

    /**
     * Get If true, only active categories will be returned. If false, all categories will be returned.
     *
     * @return If true, only active categories will be returned. If false, all categories will be returned.
     *
     */
    public final Boolean activeOnly() {
      return this.activeOnly;
    }

    /**
     * Set If true, only active categories will be returned. If false, all categories will be returned.
     *
     * @param value If true, only active categories will be returned. If false, all categories will be returned.
     *
     * @return the Builder object.
     */
    public final Builder activeOnly(Boolean value) {
      this.activeOnly = value;
      return this;
    }

    /**
     * Get Flag whether to include or exclude Onshape default categories
     *
     * @return Flag whether to include or exclude Onshape default categories
     *
     */
    public final Boolean includeOnshape() {
      return this.includeOnshape;
    }

    /**
     * Set Flag whether to include or exclude Onshape default categories
     *
     * @param value Flag whether to include or exclude Onshape default categories
     *
     * @return the Builder object.
     */
    public final Builder includeOnshape(Boolean value) {
      this.includeOnshape = value;
      return this;
    }

    /**
     * Get Where to begin search results
     *
     * @return Where to begin search results
     *
     */
    public final Number offset() {
      return this.offset;
    }

    /**
     * Set Where to begin search results
     *
     * @param value Where to begin search results
     *
     * @return the Builder object.
     */
    public final Builder offset(Number value) {
      this.offset = value;
      return this;
    }

    /**
     * Get Number of results to return per page (max is 50)
     *
     * @return Number of results to return per page (max is 50)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 50)
     *
     * @param value Number of results to return per page (max is 50)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private MetadataCategorySearchRequest build() {
      return new com.onshape.api.requests.MetadataCategorySearchRequest(ownerType,documentId,objectType,q,activeOnly,includeOnshape,offset,limit);
    }

    /**
     * Calls search method, Search metadata categories
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ownerId category owner id (Default: null) */
    public final MetadataCategorySearchResponse call(String ownerId) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadatacategory", build(), onshape.buildMap(), onshape.buildMap("ownerId", ownerId, "ownerType", ownerType, "documentId", documentId, "objectType", objectType, "q", q, "activeOnly", activeOnly, "includeOnshape", includeOnshape, "offset", offset, "limit", limit), com.onshape.api.responses.MetadataCategorySearchResponse.class);
    }
  }
}
