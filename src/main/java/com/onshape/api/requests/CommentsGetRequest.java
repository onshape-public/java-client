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
import com.onshape.api.responses.CommentsGetResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for get API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CommentsGetRequest {
  CommentsGetRequest() {
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

    private CommentsGetRequest build() {
      return new com.onshape.api.requests.CommentsGetRequest();
    }

    /**
     * Calls get method, Get list of comments for a document.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID (Default: null)
     * @param objectType object type ordinal - 1=DOCUMENT, 6=UNKNOWN, 7=CHANGE_REQUEST, 8=CHANGE_ORDER, 9=CHANGE_TASK (Default: null)
     * @param pid Parent ID (Default: null)
     * @param eid Element ID (Default: null)
     * @param filter Filter ordinal - 0=TOP_LEVEL, 1=REPLIES, 2=BY_ELEMENT (Default: null)
     * @param resolved Is resolved (Default: null)
     * @param offset Pagination offset (Default: null)
     * @param limit Number of results (Default: null) */
    public final CommentsGetResponse call(String did, Number objectType, String pid, String eid,
        Number filter, Boolean resolved, Number offset, Number limit) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/comments", build(), onshape.buildMap(), onshape.buildMap("did", did, "objectType", objectType, "pid", pid, "eid", eid, "filter", filter, "resolved", resolved, "offset", offset, "limit", limit), com.onshape.api.responses.CommentsGetResponse.class);
    }
  }
}
