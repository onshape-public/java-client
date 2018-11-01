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
import com.onshape.api.responses.PartsGetPartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsGetPartMetadataRequest {
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

  /**
   * If true, include metadata schema property defaults in response
   */
  @JsonProperty("includePropertyDefaults")
  Boolean includePropertyDefaults;

  PartsGetPartMetadataRequest(String linkDocumentId, String configuration,
      Boolean inferMetadataOwner, Boolean includePropertyDefaults) {
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
    this.inferMetadataOwner = inferMetadataOwner;
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
     * If the URL references a Standard Content part, specifying a value of true causes the API to use the owner of the referencing linkDocument as the metadata scope and the href of the returned part is modified to reflect this metadata scope. If not explictly set or if set to false, the part metadata returned is the metadata defined internal to the Standard Content document.
     */
    private Boolean inferMetadataOwner;

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

    private PartsGetPartMetadataRequest build() {
      return new com.onshape.api.requests.PartsGetPartMetadataRequest(linkDocumentId,configuration,inferMetadataOwner,includePropertyDefaults);
    }

    /**
     * Calls getPartMetadata method, Get a part's metadata
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     *
     * @param partid Part ID
     */
    public final PartsGetPartMetadataResponse call(String did, WVM wvmType, String wvm, String eid,
        String partid) throws OnshapeException {
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/metadata", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid, "partid", partid), onshape.buildMap("linkDocumentId", linkDocumentId, "configuration", configuration, "inferMetadataOwner", inferMetadataOwner, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetPartMetadataResponse.class);
    }

    /**
     * Calls getPartMetadata method, Get a part's metadata
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     */
    public final PartsGetPartMetadataResponse call(OnshapeDocument document, String partid) throws
        OnshapeException {
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/metadata", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId(), "partid", partid), onshape.buildMap(), com.onshape.api.responses.PartsGetPartMetadataResponse.class);
    }
  }
}
