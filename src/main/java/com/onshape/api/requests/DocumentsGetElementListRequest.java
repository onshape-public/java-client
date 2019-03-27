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
import com.onshape.api.responses.DocumentsGetElementListResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getElementList API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsGetElementListRequest {
  /**
   * Return only elements of this elementType
   */
  @JsonProperty("elementType")
  String elementType;

  /**
   * Return only element with this ID
   */
  @JsonProperty("elementId")
  String elementId;

  /**
   * If true, include element thumbnail information
   */
  @JsonProperty("withThumbnails")
  Boolean withThumbnails;

  DocumentsGetElementListRequest(String elementType, String elementId, Boolean withThumbnails) {
    this.elementType = elementType;
    this.elementId = elementId;
    this.withThumbnails = withThumbnails;
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
     * Return only elements of this elementType
     */
    private String elementType;

    /**
     * Return only element with this ID
     */
    private String elementId;

    /**
     * If true, include element thumbnail information
     */
    private Boolean withThumbnails;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Return only elements of this elementType
     *
     * @return Return only elements of this elementType
     *
     */
    public final String elementType() {
      return this.elementType;
    }

    /**
     * Set Return only elements of this elementType
     *
     * @param value Return only elements of this elementType
     *
     * @return the Builder object.
     */
    public final Builder elementType(String value) {
      this.elementType = value;
      return this;
    }

    /**
     * Get Return only element with this ID
     *
     * @return Return only element with this ID
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set Return only element with this ID
     *
     * @param value Return only element with this ID
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get If true, include element thumbnail information
     *
     * @return If true, include element thumbnail information
     *
     */
    public final Boolean withThumbnails() {
      return this.withThumbnails;
    }

    /**
     * Set If true, include element thumbnail information
     *
     * @param value If true, include element thumbnail information
     *
     * @return the Builder object.
     */
    public final Builder withThumbnails(Boolean value) {
      this.withThumbnails = value;
      return this;
    }

    private DocumentsGetElementListRequest build() {
      return new com.onshape.api.requests.DocumentsGetElementListRequest(elementType,elementId,withThumbnails);
    }

    /**
     * Calls getElementList method, Get a list of elements in the workspace, version, or microversion of the document.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     */
    public final DocumentsGetElementListResponse call(String did, WVM wvmType, String wvm) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/[wvm]/:wvm/elements", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm), onshape.buildMap("elementType", elementType, "elementId", elementId, "withThumbnails", withThumbnails), com.onshape.api.responses.DocumentsGetElementListResponse.class);
    }

    /**
     * Calls getElementList method, Get a list of elements in the workspace, version, or microversion of the document.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsGetElementListResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/[wvm]/:wvm/elements", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId()), onshape.buildMap(), com.onshape.api.responses.DocumentsGetElementListResponse.class);
    }
  }
}
