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

import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.DocumentsSyncApplicationElementsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for syncApplicationElements API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsSyncApplicationElementsRequest {
  DocumentsSyncApplicationElementsRequest() {
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
    Onshape onshape;

    Builder() {
    }

    private DocumentsSyncApplicationElementsRequest build() {
      return new com.onshape.api.requests.DocumentsSyncApplicationElementsRequest();
    }

    /**
     * Calls syncApplicationElements method, Sync application elements to the latest microversions
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param applicationElementIds Application elements to sync (Default: null)
     * @param description Description for the sync command (Default: null) */
    public final DocumentsSyncApplicationElementsResponse call(String did, String wid,
        String[] applicationElementIds, String description) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/syncApplicationElements", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap("applicationElementIds", applicationElementIds, "description", description), com.onshape.api.responses.DocumentsSyncApplicationElementsResponse.class);
    }

    /**
     * Calls syncApplicationElements method, Sync application elements to the latest microversions
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param applicationElementIds Application elements to sync (Default: null)
     * @param description Description for the sync command (Default: null) */
    public final DocumentsSyncApplicationElementsResponse call(OnshapeDocument document,
        String[] applicationElementIds, String description) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/syncApplicationElements", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap("applicationElementIds", applicationElementIds, "description", description), com.onshape.api.responses.DocumentsSyncApplicationElementsResponse.class);
    }
  }
}
