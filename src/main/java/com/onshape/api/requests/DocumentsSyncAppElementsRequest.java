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
import com.onshape.api.responses.DocumentsSyncAppElementsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for syncAppElements API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsSyncAppElementsRequest {
  /**
   * Application elements to sync
   */
  @JsonProperty("elements")
  String[] elements;

  /**
   * Description for the sync command
   */
  @JsonProperty("description")
  @NotNull
  String description;

  DocumentsSyncAppElementsRequest(String[] elements, String description) {
    this.elements = elements;
    this.description = description;
  }

  /**
   * Get Application elements to sync
   *
   * @return Application elements to sync
   *
   */
  public final String[] getElements() {
    return this.elements;
  }

  /**
   * Get Description for the sync command
   *
   * @return Description for the sync command
   *
   */
  public final String getDescription() {
    return this.description;
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
     * Application elements to sync
     */
    private String[] elements;

    /**
     * Description for the sync command
     */
    private String description;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Application elements to sync
     *
     * @return Application elements to sync
     *
     */
    public final String[] elements() {
      return this.elements;
    }

    /**
     * Set Application elements to sync
     *
     * @param value Application elements to sync
     *
     * @return the Builder object.
     */
    public final Builder elements(String[] value) {
      this.elements = value;
      return this;
    }

    /**
     * Get Description for the sync command
     *
     * @return Description for the sync command
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description for the sync command
     *
     * @param value Description for the sync command
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    private DocumentsSyncAppElementsRequest build() {
      return new com.onshape.api.requests.DocumentsSyncAppElementsRequest(elements,description);
    }

    /**
     * Calls syncAppElements method, Sync application elements to the latest microversions
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final DocumentsSyncAppElementsResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/syncAppElements", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsSyncAppElementsResponse.class);
    }

    /**
     * Calls syncAppElements method, Sync application elements to the latest microversions
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsSyncAppElementsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/syncAppElements", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.DocumentsSyncAppElementsResponse.class);
    }
  }
}
