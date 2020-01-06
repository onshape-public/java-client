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
import com.onshape.api.responses.BlobElementsDownloadFileFromElementResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for downloadFileFromElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class BlobElementsDownloadFileFromElementRequest {
  /**
   * If &quot;attachment&quot;, includes a Content-Disposition return header with the filename
   */
  @JsonProperty("contentDisposition")
  String contentDisposition;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  BlobElementsDownloadFileFromElementRequest(String contentDisposition, String linkDocumentId) {
    this.contentDisposition = contentDisposition;
    this.linkDocumentId = linkDocumentId;
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

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

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

    private BlobElementsDownloadFileFromElementRequest build() {
      return new com.onshape.api.requests.BlobElementsDownloadFileFromElementRequest(contentDisposition,linkDocumentId);
    }

    /**
     * Calls downloadFileFromElement method, Download a file from a blob element
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
    public final BlobElementsDownloadFileFromElementResponse call(String did, WVM wvmType,
        String wvm, String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/blobelements/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("contentDisposition", contentDisposition, "linkDocumentId", linkDocumentId), com.onshape.api.responses.BlobElementsDownloadFileFromElementResponse.class);
    }

    /**
     * Calls downloadFileFromElement method, Download a file from a blob element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final BlobElementsDownloadFileFromElementResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/blobelements/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("contentDisposition", contentDisposition, "linkDocumentId", linkDocumentId), com.onshape.api.responses.BlobElementsDownloadFileFromElementResponse.class);
    }

    /**
     * Calls downloadFileFromElement method, Download a file from a blob element
     * @return InputStreamWithHeaders stream with headers
     * @throws OnshapeException On HTTP error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final InputStreamWithHeaders callToStream(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/blobelements/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("contentDisposition", contentDisposition, "linkDocumentId", linkDocumentId), InputStreamWithHeaders.class);
    }
  }
}
