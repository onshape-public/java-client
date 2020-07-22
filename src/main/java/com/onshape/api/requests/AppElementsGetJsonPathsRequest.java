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
import com.onshape.api.responses.AppElementsGetJsonPathsResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for getJsonPaths API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsGetJsonPathsRequest {
  /**
   * lists of path in the JsonPath format
   */
  @JsonProperty("paths")
  @NotNull
  String[] paths;

  /**
   * Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
   */
  @JsonProperty("changeId")
  String changeId;

  AppElementsGetJsonPathsRequest(String[] paths, String transactionId, String changeId) {
    this.paths = paths;
    this.transactionId = transactionId;
    this.changeId = changeId;
  }

  /**
   * Get lists of path in the JsonPath format
   *
   * @return lists of path in the JsonPath format
   *
   */
  public final String[] getPaths() {
    return this.paths;
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
     * lists of path in the JsonPath format
     */
    private String[] paths;

    /**
     * Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
     */
    private String transactionId;

    /**
     * Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
     */
    private String changeId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get lists of path in the JsonPath format
     *
     * @return lists of path in the JsonPath format
     *
     */
    public final String[] paths() {
      return this.paths;
    }

    /**
     * Set lists of path in the JsonPath format
     *
     * @param value lists of path in the JsonPath format
     *
     * @return the Builder object.
     */
    public final Builder paths(String[] value) {
      this.paths = value;
      return this;
    }

    /**
     * Get Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @return Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @param value Id of the transaction in which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @return Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
     *
     */
    public final String changeId() {
      return this.changeId;
    }

    /**
     * Set Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @param value Id of the change at which the JSON should be retrieved Valid only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder changeId(String value) {
      this.changeId = value;
      return this;
    }

    private AppElementsGetJsonPathsRequest build() {
      return new com.onshape.api.requests.AppElementsGetJsonPathsRequest(paths,transactionId,changeId);
    }

    /**
     * Calls getJsonPaths method, Gets the portions of a JSON tree at a workspace/microversion/version, as specified by JsonPaths
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
     */
    public final AppElementsGetJsonPathsResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/[wvm]/:wvm/e/:eid/content/jsonpaths", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("transactionId", transactionId, "changeId", changeId), com.onshape.api.responses.AppElementsGetJsonPathsResponse.class);
    }

    /**
     * Calls getJsonPaths method, Gets the portions of a JSON tree at a workspace/microversion/version, as specified by JsonPaths
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsGetJsonPathsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/[wvm]/:wvm/e/:eid/content/jsonpaths", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("transactionId", transactionId, "changeId", changeId), com.onshape.api.responses.AppElementsGetJsonPathsResponse.class);
    }
  }
}
