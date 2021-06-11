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
import com.onshape.api.responses.RevisionsGetLatestInDocumentOrCompanyResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getLatestInDocumentOrCompany API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetLatestInDocumentOrCompanyRequest {
  /**
   * Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
   */
  @JsonProperty("et")
  Number et;

  RevisionsGetLatestInDocumentOrCompanyRequest(Number et) {
    this.et = et;
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
     * Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
     */
    private Number et;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
     *
     * @return Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
     *
     */
    public final Number et() {
      return this.et;
    }

    /**
     * Set Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
     *
     * @param value Element type integer... 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob
     *
     * @return the Builder object.
     */
    public final Builder et(Number value) {
      this.et = value;
      return this;
    }

    private RevisionsGetLatestInDocumentOrCompanyRequest build() {
      return new com.onshape.api.requests.RevisionsGetLatestInDocumentOrCompanyRequest(et);
    }

    /**
     * Calls getLatestInDocumentOrCompany method, Get the latest revision for a part number in a document or company. 204 if no revisions are
     *                 found, 404 if company isn't found.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cd Company (c) id or document (d) id
     *
     * @param pnum Part number
     */
    public final RevisionsGetLatestInDocumentOrCompanyResponse call(String cd, String pnum) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/revisions/[cd]/:cd/p/:pnum/latest", build(), onshape.buildMap("cd", cd, "pnum", pnum), onshape.buildMap("et", et), com.onshape.api.responses.RevisionsGetLatestInDocumentOrCompanyResponse.class);
    }
  }
}
