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
import com.onshape.api.responses.MetadataGetMetadataSchemaPropertiesResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getMetadataSchemaProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataSchemaPropertiesRequest {
  /**
   * Metadata schema ID. Must be specified if ownerId is blank.
   */
  @JsonProperty("schemaId")
  String schemaId;

  /**
   * Schema owner ID. Must be specified if schemaId is blank.
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Schema owner type must be 1 company. Should only be specified if ownerId is specified.
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
   */
  @JsonProperty("objectType")
  Number objectType;

  /**
   * If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
   */
  @JsonProperty("strict")
  Boolean strict;

  /**
   * If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
   */
  @JsonProperty("activeOnly")
  Boolean activeOnly;

  /**
   * ID of the document the schema is associated with.
   */
  @JsonProperty("documentId")
  String documentId;

  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (max is 20)
   */
  @JsonProperty("limit")
  Number limit;

  MetadataGetMetadataSchemaPropertiesRequest(String schemaId, String ownerId, Number ownerType,
      Number objectType, Boolean strict, Boolean activeOnly, String documentId, Number offset,
      Number limit) {
    this.schemaId = schemaId;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.objectType = objectType;
    this.strict = strict;
    this.activeOnly = activeOnly;
    this.documentId = documentId;
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
     * Metadata schema ID. Must be specified if ownerId is blank.
     */
    private String schemaId;

    /**
     * Schema owner ID. Must be specified if schemaId is blank.
     */
    private String ownerId;

    /**
     * Schema owner type must be 1 company. Should only be specified if ownerId is specified.
     */
    private Number ownerType;

    /**
     * Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
     */
    private Number objectType;

    /**
     * If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
     */
    private Boolean strict;

    /**
     * If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
     */
    private Boolean activeOnly;

    /**
     * ID of the document the schema is associated with.
     */
    private String documentId;

    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (max is 20)
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Metadata schema ID. Must be specified if ownerId is blank.
     *
     * @return Metadata schema ID. Must be specified if ownerId is blank.
     *
     */
    public final String schemaId() {
      return this.schemaId;
    }

    /**
     * Set Metadata schema ID. Must be specified if ownerId is blank.
     *
     * @param value Metadata schema ID. Must be specified if ownerId is blank.
     *
     * @return the Builder object.
     */
    public final Builder schemaId(String value) {
      this.schemaId = value;
      return this;
    }

    /**
     * Get Schema owner ID. Must be specified if schemaId is blank.
     *
     * @return Schema owner ID. Must be specified if schemaId is blank.
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set Schema owner ID. Must be specified if schemaId is blank.
     *
     * @param value Schema owner ID. Must be specified if schemaId is blank.
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get Schema owner type must be 1 company. Should only be specified if ownerId is specified.
     *
     * @return Schema owner type must be 1 company. Should only be specified if ownerId is specified.
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Schema owner type must be 1 company. Should only be specified if ownerId is specified.
     *
     * @param value Schema owner type must be 1 company. Should only be specified if ownerId is specified.
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
     *
     * @return Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
     *
     */
    public final Number objectType() {
      return this.objectType;
    }

    /**
     * Set Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
     *
     * @param value Metadata object type. Should only be specified if ownerId is specified. If schemaId is specified, this parameter is ignored. If null, properties for all types will be returned. If specified, must be one of the following: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE If false, properties will be returned with full detail, including property configs.
     *
     * @return the Builder object.
     */
    public final Builder objectType(Number value) {
      this.objectType = value;
      return this;
    }

    /**
     * Get If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
     *
     * @return If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
     *
     */
    public final Boolean strict() {
      return this.strict;
    }

    /**
     * Set If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
     *
     * @param value If true, only properties for this particular schema or ownerId will be returned. If false, all inherited properties will be returned.
     *
     * @return the Builder object.
     */
    public final Builder strict(Boolean value) {
      this.strict = value;
      return this;
    }

    /**
     * Get If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
     *
     * @return If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
     *
     */
    public final Boolean activeOnly() {
      return this.activeOnly;
    }

    /**
     * Set If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
     *
     * @param value If true, only active properties for this particular schema or ownerId will be returned. If false, all properties will be returned.
     *
     * @return the Builder object.
     */
    public final Builder activeOnly(Boolean value) {
      this.activeOnly = value;
      return this;
    }

    /**
     * Get ID of the document the schema is associated with.
     *
     * @return ID of the document the schema is associated with.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set ID of the document the schema is associated with.
     *
     * @param value ID of the document the schema is associated with.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
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
     * Get Number of results to return per page (max is 20)
     *
     * @return Number of results to return per page (max is 20)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 20)
     *
     * @param value Number of results to return per page (max is 20)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private MetadataGetMetadataSchemaPropertiesRequest build() {
      return new com.onshape.api.requests.MetadataGetMetadataSchemaPropertiesRequest(schemaId,ownerId,ownerType,objectType,strict,activeOnly,documentId,offset,limit);
    }

    /**
     * Calls getMetadataSchemaProperties method, Get metadata properties
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final MetadataGetMetadataSchemaPropertiesResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadataschema/properties", build(), onshape.buildMap(), onshape.buildMap("schemaId", schemaId, "ownerId", ownerId, "ownerType", ownerType, "objectType", objectType, "strict", strict, "activeOnly", activeOnly, "documentId", documentId, "offset", offset, "limit", limit), com.onshape.api.responses.MetadataGetMetadataSchemaPropertiesResponse.class);
    }
  }
}
