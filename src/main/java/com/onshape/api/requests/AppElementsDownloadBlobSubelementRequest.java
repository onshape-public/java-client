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
import com.onshape.api.responses.AppElementsDownloadBlobSubelementResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for downloadBlobSubelement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsDownloadBlobSubelementRequest {
  /**
   * If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
   */
  @JsonProperty("contentDisposition")
  String contentDisposition;

  AppElementsDownloadBlobSubelementRequest(String contentDisposition) {
    this.contentDisposition = contentDisposition;
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
     * If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
     */
    private String contentDisposition;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
     *
     * @return If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
     *
     */
    public final String contentDisposition() {
      return this.contentDisposition;
    }

    /**
     * Set If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
     *
     * @param value If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
     *
     * @return the Builder object.
     */
    public final Builder contentDisposition(String value) {
      this.contentDisposition = value;
      return this;
    }

    private AppElementsDownloadBlobSubelementRequest build() {
      return new com.onshape.api.requests.AppElementsDownloadBlobSubelementRequest(contentDisposition);
    }

    /**
     * Calls downloadBlobSubelement method, Download a blob subelement from an app element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param bid Blob subelement ID
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final AppElementsDownloadBlobSubelementResponse call(String bid, String did, WVM wvmType,
        String wvm, String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/blob/:bid", build(), onshape.buildMap("bid", bid, "did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("contentDisposition", contentDisposition), com.onshape.api.responses.AppElementsDownloadBlobSubelementResponse.class);
    }

    /**
     * Calls downloadBlobSubelement method, Download a blob subelement from an app element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param bid Blob subelement ID
     */
    public final AppElementsDownloadBlobSubelementResponse call(OnshapeDocument document,
        String bid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/blob/:bid", build(), onshape.buildMap("bid", bid, "did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("contentDisposition", contentDisposition), com.onshape.api.responses.AppElementsDownloadBlobSubelementResponse.class);
    }

    /**
     * Calls downloadBlobSubelement method, Download a blob subelement from an app element
     * @return InputStreamWithHeaders stream with headers
     * @throws OnshapeException On HTTP error
     *
     * @param bid Blob subelement ID
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final InputStreamWithHeaders callToStream(String bid, String did, WVM wvmType,
        String wvm, String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/blob/:bid", build(), onshape.buildMap("bid", bid, "did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("contentDisposition", contentDisposition), InputStreamWithHeaders.class);
    }
  }
}