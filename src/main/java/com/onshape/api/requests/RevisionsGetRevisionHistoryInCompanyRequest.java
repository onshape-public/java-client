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
import com.onshape.api.responses.RevisionsGetRevisionHistoryInCompanyResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getRevisionHistoryInCompany API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetRevisionHistoryInCompanyRequest {
  RevisionsGetRevisionHistoryInCompanyRequest() {
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

    private RevisionsGetRevisionHistoryInCompanyRequest build() {
      return new com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyRequest();
    }

    /**
     * Calls getRevisionHistoryInCompany method, Get a list of all revisions for a part number in a company, ordered newest first. Returns empty
     *                 list if no revisions are found, 404 if company isn't found.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Company Id
     *
     * @param pnum Part number
     *
     * @param elementType Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob (Default: null)
     * @param fillApprovers Include approvers of each revision (Default: null) */
    public final RevisionsGetRevisionHistoryInCompanyResponse call(String cid, String pnum,
        Number elementType, Boolean fillApprovers) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/revisions/companies/:cid/partnumber/:pnum", build(), onshape.buildMap("cid", cid, "pnum", pnum), onshape.buildMap("elementType", elementType, "fillApprovers", fillApprovers), com.onshape.api.responses.RevisionsGetRevisionHistoryInCompanyResponse.class);
    }
  }
}
