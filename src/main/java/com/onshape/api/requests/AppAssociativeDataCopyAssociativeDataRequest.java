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
import com.onshape.api.responses.AppAssociativeDataCopyAssociativeDataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for copyAssociativeData API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppAssociativeDataCopyAssociativeDataRequest {
  /**
   * the transactionId in which the copy should take place
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * the specific changeId at which the copy should take place
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  /**
   * description of the copy
   */
  @JsonProperty("description")
  String description;

  /**
   * array of viewId pairs
   */
  @JsonProperty("items")
  @NotNull
  AppAssociativeDataCopyAssociativeDataRequestItems[] items;

  AppAssociativeDataCopyAssociativeDataRequest(String transactionId, String parentChangeId,
      String description, AppAssociativeDataCopyAssociativeDataRequestItems[] items) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.description = description;
    this.items = items;
  }

  /**
   * Get the transactionId in which the copy should take place
   *
   * @return the transactionId in which the copy should take place
   *
   */
  public final String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Get the specific changeId at which the copy should take place
   *
   * @return the specific changeId at which the copy should take place
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get description of the copy
   *
   * @return description of the copy
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get array of viewId pairs
   *
   * @return array of viewId pairs
   *
   */
  public final AppAssociativeDataCopyAssociativeDataRequestItems[] getItems() {
    return this.items;
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
     * the transactionId in which the copy should take place
     */
    private String transactionId;

    /**
     * the specific changeId at which the copy should take place
     */
    private String parentChangeId;

    /**
     * description of the copy
     */
    private String description;

    /**
     * array of viewId pairs
     */
    private AppAssociativeDataCopyAssociativeDataRequestItems[] items;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get the transactionId in which the copy should take place
     *
     * @return the transactionId in which the copy should take place
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set the transactionId in which the copy should take place
     *
     * @param value the transactionId in which the copy should take place
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get the specific changeId at which the copy should take place
     *
     * @return the specific changeId at which the copy should take place
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set the specific changeId at which the copy should take place
     *
     * @param value the specific changeId at which the copy should take place
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get description of the copy
     *
     * @return description of the copy
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set description of the copy
     *
     * @param value description of the copy
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get array of viewId pairs
     *
     * @return array of viewId pairs
     *
     */
    public final AppAssociativeDataCopyAssociativeDataRequestItems[] items() {
      return this.items;
    }

    /**
     * Set array of viewId pairs
     *
     * @param value array of viewId pairs
     *
     * @return the Builder object.
     */
    public final Builder items(AppAssociativeDataCopyAssociativeDataRequestItems[] value) {
      this.items = value;
      return this;
    }

    private AppAssociativeDataCopyAssociativeDataRequest build() {
      return new com.onshape.api.requests.AppAssociativeDataCopyAssociativeDataRequest(transactionId,parentChangeId,description,items);
    }

    /**
     * Calls copyAssociativeData method, Copy associative data between views
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppAssociativeDataCopyAssociativeDataResponse call(String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/copyassociativedata", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataCopyAssociativeDataResponse.class);
    }

    /**
     * Calls copyAssociativeData method, Copy associative data between views
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppAssociativeDataCopyAssociativeDataResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/copyassociativedata", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataCopyAssociativeDataResponse.class);
    }
  }
}
