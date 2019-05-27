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
import com.onshape.api.responses.PartsGetPartsResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getParts API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsGetPartsRequest {
  /**
   * Whether or not to include thumbnails (not supported for microversion)
   */
  @JsonProperty("withThumbnails")
  Boolean withThumbnails;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * If true, include metadata schema property defaults in response
   */
  @JsonProperty("includePropertyDefaults")
  Boolean includePropertyDefaults;

  PartsGetPartsRequest(Boolean withThumbnails, String linkDocumentId,
      Boolean includePropertyDefaults) {
    this.withThumbnails = withThumbnails;
    this.linkDocumentId = linkDocumentId;
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
     * Whether or not to include thumbnails (not supported for microversion)
     */
    private Boolean withThumbnails;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * If true, include metadata schema property defaults in response
     */
    private Boolean includePropertyDefaults;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether or not to include thumbnails (not supported for microversion)
     *
     * @return Whether or not to include thumbnails (not supported for microversion)
     *
     */
    public final Boolean withThumbnails() {
      return this.withThumbnails;
    }

    /**
     * Set Whether or not to include thumbnails (not supported for microversion)
     *
     * @param value Whether or not to include thumbnails (not supported for microversion)
     *
     * @return the Builder object.
     */
    public final Builder withThumbnails(Boolean value) {
      this.withThumbnails = value;
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

    private PartsGetPartsRequest build() {
      return new com.onshape.api.requests.PartsGetPartsRequest(withThumbnails,linkDocumentId,includePropertyDefaults);
    }

    /**
     * Calls getParts method, Get list of parts
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     */
    public final PartsGetPartsResponse call(String did, WVM wvmType, String wvm) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm), onshape.buildMap("withThumbnails", withThumbnails, "linkDocumentId", linkDocumentId, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetPartsResponse.class);
    }

    /**
     * Calls getParts method, Get list of parts
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartsGetPartsResponse call(OnshapeDocument document) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId()), onshape.buildMap("withThumbnails", withThumbnails, "linkDocumentId", linkDocumentId, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetPartsResponse.class);
    }
  }
}
