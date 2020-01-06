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
import com.onshape.api.responses.MetadataGetMetadataSchemaResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getMetadataSchema API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataSchemaRequest {
  /**
   * Schema owner type, which can be: 1:company 2:onshape (default: 1)
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * ID of the document the schema is associated with.
   */
  @JsonProperty("documentId")
  String documentId;

  MetadataGetMetadataSchemaRequest(Number ownerType, String documentId) {
    this.ownerType = ownerType;
    this.documentId = documentId;
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
     * Schema owner type, which can be: 1:company 2:onshape (default: 1)
     */
    private Number ownerType;

    /**
     * ID of the document the schema is associated with.
     */
    private String documentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Schema owner type, which can be: 1:company 2:onshape (default: 1)
     *
     * @return Schema owner type, which can be: 1:company 2:onshape (default: 1)
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Schema owner type, which can be: 1:company 2:onshape (default: 1)
     *
     * @param value Schema owner type, which can be: 1:company 2:onshape (default: 1)
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
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

    private MetadataGetMetadataSchemaRequest build() {
      return new com.onshape.api.requests.MetadataGetMetadataSchemaRequest(ownerType,documentId);
    }

    /**
     * Calls getMetadataSchema method, Get metadata schema, or Onshape schema if user/company has no schema for the given object type
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ownerId Schema owner ID (Default: null)
     * @param objectType Metadata object type, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE (Default: null) */
    public final MetadataGetMetadataSchemaResponse call(String ownerId, Number objectType) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadataschema", build(), onshape.buildMap(), onshape.buildMap("ownerId", ownerId, "ownerType", ownerType, "objectType", objectType, "documentId", documentId), com.onshape.api.responses.MetadataGetMetadataSchemaResponse.class);
    }
  }
}
