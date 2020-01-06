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
import com.onshape.api.responses.MetadataGetPropertyInfoResponse;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getPropertyInfo API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetPropertyInfoRequest {
  /**
   * ID of the document the schema is associated with.
   */
  @JsonProperty("documentId")
  String documentId;

  MetadataGetPropertyInfoRequest(String documentId) {
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
     * ID of the document the schema is associated with.
     */
    private String documentId;

    Onshape onshape;

    Builder() {
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

    private MetadataGetPropertyInfoRequest build() {
      return new com.onshape.api.requests.MetadataGetPropertyInfoRequest(documentId);
    }

    /**
     * Calls getPropertyInfo method, Get metadata property info
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Property ID
     *
     * @param schemaId Metadata schema ID (Default: null) */
    public final MetadataGetPropertyInfoResponse call(String pid, String schemaId) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadataschema/propertyinfo/:pid", build(), onshape.buildMap("pid", pid), onshape.buildMap("schemaId", schemaId, "documentId", documentId), com.onshape.api.responses.MetadataGetPropertyInfoResponse.class);
    }
  }
}
