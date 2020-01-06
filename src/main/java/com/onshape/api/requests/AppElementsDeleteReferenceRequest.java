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
import com.onshape.api.responses.AppElementsDeleteReferenceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for deleteReference API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsDeleteReferenceRequest {
  /**
   * Id of the last change made by this application to this element
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  /**
   * Id of the transaction to commit
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * Description of the deletion operation for history
   */
  @JsonProperty("description")
  String description;

  AppElementsDeleteReferenceRequest(String parentChangeId, String transactionId,
      String description) {
    this.parentChangeId = parentChangeId;
    this.transactionId = transactionId;
    this.description = description;
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
     * Id of the transaction to commit
     */
    private String transactionId;

    /**
     * Description of the deletion operation for history
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
     * Get Id of the transaction to commit
     *
     * @return Id of the transaction to commit
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of the transaction to commit
     *
     * @param value Id of the transaction to commit
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Description of the deletion operation for history
     *
     * @return Description of the deletion operation for history
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the deletion operation for history
     *
     * @param value Description of the deletion operation for history
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    private AppElementsDeleteReferenceRequest build() {
      return new com.onshape.api.requests.AppElementsDeleteReferenceRequest(parentChangeId,transactionId,description);
    }

    /**
     * Calls deleteReference method, Delete an app element reference
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param rid The id of the reference to be deleted
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppElementsDeleteReferenceResponse call(String rid, String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/appelements/d/:did/w/:wid/e/:eid/references/:rid", build(), onshape.buildMap("rid", rid, "did", did, "wid", wid, "eid", eid), onshape.buildMap("parentChangeId", parentChangeId, "transactionId", transactionId, "description", description), com.onshape.api.responses.AppElementsDeleteReferenceResponse.class);
    }

    /**
     * Calls deleteReference method, Delete an app element reference
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param rid The id of the reference to be deleted
     */
    public final AppElementsDeleteReferenceResponse call(OnshapeDocument document, String rid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/appelements/d/:did/w/:wid/e/:eid/references/:rid", build(), onshape.buildMap("rid", rid, "did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap("parentChangeId", parentChangeId, "transactionId", transactionId, "description", description), com.onshape.api.responses.AppElementsDeleteReferenceResponse.class);
    }
  }
}
