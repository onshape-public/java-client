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
import com.onshape.api.responses.AppElementsStartTransactionResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for startTransaction API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppElementsStartTransactionRequest {
  /**
   * Id of the last change made by this application to this element
   */
  @JsonProperty("parentChangeId")
  @NotNull
  String parentChangeId;

  /**
   * Description of the change being made, for history tracking
   */
  @JsonProperty("description")
  @NotNull
  String description;

  AppElementsStartTransactionRequest(String parentChangeId, String description) {
    this.parentChangeId = parentChangeId;
    this.description = description;
  }

  /**
   * Get Id of the last change made by this application to this element
   *
   * @return Id of the last change made by this application to this element
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get Description of the change being made, for history tracking
   *
   * @return Description of the change being made, for history tracking
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
     * Id of the last change made by this application to this element
     */
    private String parentChangeId;

    /**
     * Description of the change being made, for history tracking
     */
    private String description;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the last change made by this application to this element
     *
     * @return Id of the last change made by this application to this element
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set Id of the last change made by this application to this element
     *
     * @param value Id of the last change made by this application to this element
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get Description of the change being made, for history tracking
     *
     * @return Description of the change being made, for history tracking
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the change being made, for history tracking
     *
     * @param value Description of the change being made, for history tracking
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    private AppElementsStartTransactionRequest build() {
      return new com.onshape.api.requests.AppElementsStartTransactionRequest(parentChangeId,description);
    }

    /**
     * Calls startTransaction method, Start a transaction (creates a microbranch)
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppElementsStartTransactionResponse call(String did, String wid, String eid) throws
        OnshapeException {
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/transactions/", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppElementsStartTransactionResponse.class);
    }

    /**
     * Calls startTransaction method, Start a transaction (creates a microbranch)
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final AppElementsStartTransactionResponse call(OnshapeDocument document, String wid)
        throws OnshapeException {
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/transactions/", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid, "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppElementsStartTransactionResponse.class);
    }
  }
}
