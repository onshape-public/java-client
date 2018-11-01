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
import com.onshape.api.responses.AppAssociativeDataDeleteAssociativeDataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for deleteAssociativeData API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppAssociativeDataDeleteAssociativeDataRequest {
  /**
   * the transactionId in which the lookup should take place
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * the specific changeId at which the deletion should take place
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  AppAssociativeDataDeleteAssociativeDataRequest(String transactionId, String parentChangeId) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
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
     * the transactionId in which the lookup should take place
     */
    private String transactionId;

    /**
     * the specific changeId at which the deletion should take place
     */
    private String parentChangeId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get the transactionId in which the lookup should take place
     *
     * @return the transactionId in which the lookup should take place
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set the transactionId in which the lookup should take place
     *
     * @param value the transactionId in which the lookup should take place
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get the specific changeId at which the deletion should take place
     *
     * @return the specific changeId at which the deletion should take place
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set the specific changeId at which the deletion should take place
     *
     * @param value the specific changeId at which the deletion should take place
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    private AppAssociativeDataDeleteAssociativeDataRequest build() {
      return new com.onshape.api.requests.AppAssociativeDataDeleteAssociativeDataRequest(transactionId,parentChangeId);
    }

    /**
     * Calls deleteAssociativeData method, Delete associative data for an app element
     *                 (Manage associativity with /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     *
     * @param associativeDataId the id of a specific association (Default: null) */
    public final AppAssociativeDataDeleteAssociativeDataResponse call(String did, String wid,
        String eid, String associativeDataId) throws OnshapeException {
      return onshape.call("delete", "/appelements/d/:did/w/:wid/e/:eid/associativedata", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap("transactionId", transactionId, "parentChangeId", parentChangeId, "associativeDataId", associativeDataId), com.onshape.api.responses.AppAssociativeDataDeleteAssociativeDataResponse.class);
    }

    /**
     * Calls deleteAssociativeData method, Delete associative data for an app element
     *                 (Manage associativity with /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final AppAssociativeDataDeleteAssociativeDataResponse call(OnshapeDocument document,
        String wid) throws OnshapeException {
      return onshape.call("delete", "/appelements/d/:did/w/:wid/e/:eid/associativedata", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid, "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataDeleteAssociativeDataResponse.class);
    }
  }
}
