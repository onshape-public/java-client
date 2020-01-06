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
import com.onshape.api.responses.DocumentsUpdateDocumentAttributesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for updateDocumentAttributes API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsUpdateDocumentAttributesRequest {
  /**
   * New document name
   */
  @JsonProperty("name")
  String name;

  /**
   * New document description
   */
  @JsonProperty("description")
  String description;

  /**
   * Whether document is not revision managed
   */
  @JsonProperty("notRevisionManaged")
  Boolean notRevisionManaged;

  DocumentsUpdateDocumentAttributesRequest(String name, String description,
      Boolean notRevisionManaged) {
    this.name = name;
    this.description = description;
    this.notRevisionManaged = notRevisionManaged;
  }

  /**
   * Get New document name
   *
   * @return New document name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get New document description
   *
   * @return New document description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Whether document is not revision managed
   *
   * @return Whether document is not revision managed
   *
   */
  public final Boolean getNotRevisionManaged() {
    return this.notRevisionManaged;
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
     * New document name
     */
    private String name;

    /**
     * New document description
     */
    private String description;

    /**
     * Whether document is not revision managed
     */
    private Boolean notRevisionManaged;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get New document name
     *
     * @return New document name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set New document name
     *
     * @param value New document name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get New document description
     *
     * @return New document description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set New document description
     *
     * @param value New document description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Whether document is not revision managed
     *
     * @return Whether document is not revision managed
     *
     */
    public final Boolean notRevisionManaged() {
      return this.notRevisionManaged;
    }

    /**
     * Set Whether document is not revision managed
     *
     * @param value Whether document is not revision managed
     *
     * @return the Builder object.
     */
    public final Builder notRevisionManaged(Boolean value) {
      this.notRevisionManaged = value;
      return this;
    }

    private DocumentsUpdateDocumentAttributesRequest build() {
      return new com.onshape.api.requests.DocumentsUpdateDocumentAttributesRequest(name,description,notRevisionManaged);
    }

    /**
     * Calls updateDocumentAttributes method, Update document attributes name, description
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     */
    public final DocumentsUpdateDocumentAttributesResponse call(String did) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did", build(), onshape.buildMap("did", did), onshape.buildMap(), com.onshape.api.responses.DocumentsUpdateDocumentAttributesResponse.class);
    }

    /**
     * Calls updateDocumentAttributes method, Update document attributes name, description
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsUpdateDocumentAttributesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did", build(), onshape.buildMap("did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsUpdateDocumentAttributesResponse.class);
    }
  }
}
