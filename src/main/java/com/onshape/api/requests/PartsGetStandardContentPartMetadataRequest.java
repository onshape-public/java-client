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
import com.onshape.api.responses.PartsGetStandardContentPartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getStandardContentPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsGetStandardContentPartMetadataRequest {
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
   * If true, include metadata schema property defaults in response
   */
  @JsonProperty("includePropertyDefaults")
  Boolean includePropertyDefaults;

  PartsGetStandardContentPartMetadataRequest(String linkDocumentId, String configuration,
      Boolean includePropertyDefaults) {
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
    this.includePropertyDefaults = includePropertyDefaults;
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
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    /**
     * If true, include metadata schema property defaults in response
     */
    private Boolean includePropertyDefaults;

    Onshape onshape;

    Builder() {
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
     * Get If true, include metadata schema property defaults in response
     *
     * @return If true, include metadata schema property defaults in response
     *
     */
    public final Boolean includePropertyDefaults() {
      return this.includePropertyDefaults;
    }

    /**
     * Set If true, include metadata schema property defaults in response
     *
     * @param value If true, include metadata schema property defaults in response
     *
     * @return the Builder object.
     */
    public final Builder includePropertyDefaults(Boolean value) {
      this.includePropertyDefaults = value;
      return this;
    }

    private PartsGetStandardContentPartMetadataRequest build() {
      return new com.onshape.api.requests.PartsGetStandardContentPartMetadataRequest(linkDocumentId,configuration,includePropertyDefaults);
    }

    /**
     * Calls getStandardContentPartMetadata method, Get metadata for a standard content part in the context of a user or company
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     *
     * @param did Document ID
     *
     * @param vid Version ID
     *
     * @param eid Element ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final PartsGetStandardContentPartMetadataResponse call(String partid, String did,
        String vid, String eid, String oid) throws OnshapeException {
      return onshape.call("get", "/parts/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/partid/:partid/metadata", build(), onshape.buildMap("partid", partid, "did", did, "vid", vid, "eid", eid, "oid", oid), onshape.buildMap("linkDocumentId", linkDocumentId, "configuration", configuration, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetStandardContentPartMetadataResponse.class);
    }

    /**
     * Calls getStandardContentPartMetadata method, Get metadata for a standard content part in the context of a user or company
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     *
     * @param vid Version ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final PartsGetStandardContentPartMetadataResponse call(OnshapeDocument document,
        String partid, String vid, String oid) throws OnshapeException {
      return onshape.call("get", "/parts/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/partid/:partid/metadata", build(), onshape.buildMap("partid", partid, "did", document.getDocumentId(), "vid", vid, "eid", document.getElementId(), "oid", oid), onshape.buildMap(), com.onshape.api.responses.PartsGetStandardContentPartMetadataResponse.class);
    }
  }
}
