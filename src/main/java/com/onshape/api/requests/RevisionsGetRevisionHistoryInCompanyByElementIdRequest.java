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
import com.onshape.api.responses.RevisionsGetRevisionHistoryInCompanyByElementIdResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getRevisionHistoryInCompanyByElementId API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetRevisionHistoryInCompanyByElementIdRequest {
  RevisionsGetRevisionHistoryInCompanyByElementIdRequest() {
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

    private RevisionsGetRevisionHistoryInCompanyByElementIdRequest build() {
      return new com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyByElementIdRequest();
    }

    /**
     * Calls getRevisionHistoryInCompanyByElementId method, Get a list of all revisions for a part of specified D/W/V/E ids in a company, ordered newest first.
     *                 Returns empty list if no revisions are found, 404 if company isn't found.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Company Id
     *
     * @param did Document Id
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace or version id depending on &quot;wv&quot; param
     *
     * @param eid Element id
     *
     * @param elementType Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob (Default: null)
     * @param configuration the encoded configuration of the part (Default: null)
     * @param linkDocumentId if part is in doc1 but originated in a linked doc2, this is the id of doc1, the current document containing the reference (Default: null)
     * @param fillApprovers Include approvers of each revision (Default: null) */
    public final RevisionsGetRevisionHistoryInCompanyByElementIdResponse call(String cid,
        String did, WV wvType, String wv, String eid, Number elementType, String configuration,
        String linkDocumentId, Boolean fillApprovers) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/revisions/companies/:cid/d/:did/[wv]/:wv/e/:eid", build(), onshape.buildMap("cid", cid, "did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap("elementType", elementType, "configuration", configuration, "linkDocumentId", linkDocumentId, "fillApprovers", fillApprovers), com.onshape.api.responses.RevisionsGetRevisionHistoryInCompanyByElementIdResponse.class);
    }

    /**
     * Calls getRevisionHistoryInCompanyByElementId method, Get a list of all revisions for a part of specified D/W/V/E ids in a company, ordered newest first.
     *                 Returns empty list if no revisions are found, 404 if company isn't found.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Company Id
     *
     * @param elementType Type of element, which can be 0: Part Studio, 1: Assembly, 2: Drawing. 4: Blob (Default: null)
     * @param configuration the encoded configuration of the part (Default: null)
     * @param linkDocumentId if part is in doc1 but originated in a linked doc2, this is the id of doc1, the current document containing the reference (Default: null)
     * @param fillApprovers Include approvers of each revision (Default: null) */
    public final RevisionsGetRevisionHistoryInCompanyByElementIdResponse call(OnshapeDocument document,
        String cid, Number elementType, String configuration, String linkDocumentId,
        Boolean fillApprovers) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/revisions/companies/:cid/d/:did/[wv]/:wv/e/:eid", build(), onshape.buildMap("cid", cid, "did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId(), "eid", document.getElementId()), onshape.buildMap("elementType", elementType, "configuration", configuration, "linkDocumentId", linkDocumentId, "fillApprovers", fillApprovers), com.onshape.api.responses.RevisionsGetRevisionHistoryInCompanyByElementIdResponse.class);
    }
  }
}
