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
import com.onshape.api.responses.MetadataCategoryGetPropertiesResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryGetPropertiesRequest {
  /**
   * ID of the document in context to validate permissions.
   */
  @JsonProperty("documentId")
  String documentId;

  /**
   * If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
   */
  @JsonProperty("activeOnly")
  Boolean activeOnly;

  /**
   * Flag whether to include or exclude Onshape properties
   */
  @JsonProperty("includeOnshape")
  Boolean includeOnshape;

  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (max is 200)
   */
  @JsonProperty("limit")
  Number limit;

  MetadataCategoryGetPropertiesRequest(String documentId, Boolean activeOnly,
      Boolean includeOnshape, Number offset, Number limit) {
    this.documentId = documentId;
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
     * ID of the document in context to validate permissions.
     */
    private String documentId;

    /**
     * If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
     */
    private Boolean activeOnly;

    /**
     * Flag whether to include or exclude Onshape properties
     */
    private Boolean includeOnshape;

    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (max is 200)
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get ID of the document in context to validate permissions.
     *
     * @return ID of the document in context to validate permissions.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set ID of the document in context to validate permissions.
     *
     * @param value ID of the document in context to validate permissions.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
     *
     * @return If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
     *
     */
    public final Boolean activeOnly() {
      return this.activeOnly;
    }

    /**
     * Set If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
     *
     * @param value If true, only active properties for the specified categories will be returned. If false, all properties will be returned.
     *
     * @return the Builder object.
     */
    public final Builder activeOnly(Boolean value) {
      this.activeOnly = value;
      return this;
    }

    /**
     * Get Flag whether to include or exclude Onshape properties
     *
     * @return Flag whether to include or exclude Onshape properties
     *
     */
    public final Boolean includeOnshape() {
      return this.includeOnshape;
    }

    /**
     * Set Flag whether to include or exclude Onshape properties
     *
     * @param value Flag whether to include or exclude Onshape properties
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
     * Get Number of results to return per page (max is 200)
     *
     * @return Number of results to return per page (max is 200)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 200)
     *
     * @param value Number of results to return per page (max is 200)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private MetadataCategoryGetPropertiesRequest build() {
      return new com.onshape.api.requests.MetadataCategoryGetPropertiesRequest(documentId,activeOnly,includeOnshape,offset,limit);
    }

    /**
     * Calls getProperties method, Get metadata properties
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ownerId Owner ID. Must be specified. (Default: null)
     * @param ownerType Schema owner type must be 1 company which is the default. (Default: null) */
    public final MetadataCategoryGetPropertiesResponse call(String ownerId, Number ownerType) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadatacategory/properties", build(), onshape.buildMap(), onshape.buildMap("ownerId", ownerId, "ownerType", ownerType, "documentId", documentId, "activeOnly", activeOnly, "includeOnshape", includeOnshape, "offset", offset, "limit", limit), com.onshape.api.responses.MetadataCategoryGetPropertiesResponse.class);
    }
  }
}
