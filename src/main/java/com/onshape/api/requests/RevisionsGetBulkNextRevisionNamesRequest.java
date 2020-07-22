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
import com.onshape.api.responses.RevisionsGetBulkNextRevisionNamesResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for getBulkNextRevisionNames API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetBulkNextRevisionNamesRequest {
  /**
   * Revisions to get the next for
   */
  @JsonProperty("revisionNames")
  @NotNull
  String[] revisionNames;

  RevisionsGetBulkNextRevisionNamesRequest(String[] revisionNames) {
    this.revisionNames = revisionNames;
  }

  /**
   * Get Revisions to get the next for
   *
   * @return Revisions to get the next for
   *
   */
  public final String[] getRevisionNames() {
    return this.revisionNames;
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
     * Revisions to get the next for
     */
    private String[] revisionNames;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Revisions to get the next for
     *
     * @return Revisions to get the next for
     *
     */
    public final String[] revisionNames() {
      return this.revisionNames;
    }

    /**
     * Set Revisions to get the next for
     *
     * @param value Revisions to get the next for
     *
     * @return the Builder object.
     */
    public final Builder revisionNames(String[] value) {
      this.revisionNames = value;
      return this;
    }

    private RevisionsGetBulkNextRevisionNamesRequest build() {
      return new com.onshape.api.requests.RevisionsGetBulkNextRevisionNamesRequest(revisionNames);
    }

    /**
     * Calls getBulkNextRevisionNames method, Get multiple next revision names from different points in the rule.  Returns a map from each given revision to its next.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ruleid ID of revision rule
     */
    public final RevisionsGetBulkNextRevisionNamesResponse call(String ruleid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/revisionrules/:ruleid/bulknext", build(), onshape.buildMap("ruleid", ruleid), onshape.buildMap(), com.onshape.api.responses.RevisionsGetBulkNextRevisionNamesResponse.class);
    }
  }
}
