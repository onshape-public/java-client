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
package com.onshape.api;

import com.onshape.api.requests.RevisionsDeleteRevisionHistoryRequest;
import com.onshape.api.requests.RevisionsEnumerateRevisionsRequest;
import com.onshape.api.requests.RevisionsGetLatestInDocumentOrCompanyRequest;
import com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyRequest;

/**
 * Revisions: API endpoints for Revisions group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Revisions {
  final Onshape onshape;

  Revisions(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for deleteRevisionHistory
   *  @return Request builder object
   */
  public final RevisionsDeleteRevisionHistoryRequest.Builder deleteRevisionHistory() {
    return RevisionsDeleteRevisionHistoryRequest.builder(onshape);
  }

  /**
   * Create request for enumerateRevisions
   *  @return Request builder object
   */
  public final RevisionsEnumerateRevisionsRequest.Builder enumerateRevisions() {
    return RevisionsEnumerateRevisionsRequest.builder(onshape);
  }

  /**
   * Create request for getLatestInDocumentOrCompany
   *  @return Request builder object
   */
  public final RevisionsGetLatestInDocumentOrCompanyRequest.Builder getLatestInDocumentOrCompany() {
    return RevisionsGetLatestInDocumentOrCompanyRequest.builder(onshape);
  }

  /**
   * Create request for getRevisionHistoryInCompany
   *  @return Request builder object
   */
  public final RevisionsGetRevisionHistoryInCompanyRequest.Builder getRevisionHistoryInCompany() {
    return RevisionsGetRevisionHistoryInCompanyRequest.builder(onshape);
  }
}
