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
import com.onshape.api.responses.ThumbnailsGetElementThumbnailWithSizeResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getElementThumbnailWithSize API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class ThumbnailsGetElementThumbnailWithSizeRequest {
  ThumbnailsGetElementThumbnailWithSizeRequest() {
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

    private ThumbnailsGetElementThumbnailWithSizeRequest build() {
      return new com.onshape.api.requests.ThumbnailsGetElementThumbnailWithSizeRequest();
    }

    /**
     * Calls getElementThumbnailWithSize method, Return thumbnail for element, with specified size in pixels
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param sz Requested thumbnail size, such as 300x300
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     *
     * @param rejectEmpty If true, a 404 will be returned for thumbnails that are made for empty elements. Clients can use this parameter to skip the display of empty thumbnails and display a default icon instead. Defaults to false. (Default: null) */
    public final ThumbnailsGetElementThumbnailWithSizeResponse call(String sz, String did,
        String wid, String eid, Boolean rejectEmpty) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/thumbnails/d/:did/w/:wid/e/:eid/s/:sz", build(), onshape.buildMap("sz", sz, "did", did, "wid", wid, "eid", eid), onshape.buildMap("rejectEmpty", rejectEmpty), com.onshape.api.responses.ThumbnailsGetElementThumbnailWithSizeResponse.class);
    }

    /**
     * Calls getElementThumbnailWithSize method, Return thumbnail for element, with specified size in pixels
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param sz Requested thumbnail size, such as 300x300
     */
    public final ThumbnailsGetElementThumbnailWithSizeResponse call(OnshapeDocument document,
        String sz) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/thumbnails/d/:did/w/:wid/e/:eid/s/:sz", build(), onshape.buildMap("sz", sz, "did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.ThumbnailsGetElementThumbnailWithSizeResponse.class);
    }
  }
}
