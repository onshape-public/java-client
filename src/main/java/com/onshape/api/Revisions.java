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

import com.onshape.api.requests.RevisionsCreateRuleRequest;
import com.onshape.api.requests.RevisionsDeleteRevisionHistoryRequest;
import com.onshape.api.requests.RevisionsEnumerateRevisionsRequest;
import com.onshape.api.requests.RevisionsGetAllRulesRequest;
import com.onshape.api.requests.RevisionsGetBulkNextRevisionNamesRequest;
import com.onshape.api.requests.RevisionsGetLatestInDocumentOrCompanyRequest;
import com.onshape.api.requests.RevisionsGetNextRevisionNamesRequest;
import com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyByElementIdRequest;
import com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyByPartIdRequest;
import com.onshape.api.requests.RevisionsGetRevisionHistoryInCompanyByPartNumberRequest;
import com.onshape.api.requests.RevisionsGetRuleByIdRequest;
import com.onshape.api.requests.RevisionsUpdateRuleRequest;

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
   * Create request for createRule
   *  @return Request builder object
   */
  public final RevisionsCreateRuleRequest.Builder createRule() {
    return RevisionsCreateRuleRequest.builder(onshape);
  }

  /**
   * Create request for getRuleById
   *  @return Request builder object
   */
  public final RevisionsGetRuleByIdRequest.Builder getRuleById() {
    return RevisionsGetRuleByIdRequest.builder(onshape);
  }

  /**
   * Create request for getAllRules
   *  @return Request builder object
   */
  public final RevisionsGetAllRulesRequest.Builder getAllRules() {
    return RevisionsGetAllRulesRequest.builder(onshape);
  }

  /**
   * Create request for getNextRevisionNames
   *  @return Request builder object
   */
  public final RevisionsGetNextRevisionNamesRequest.Builder getNextRevisionNames() {
    return RevisionsGetNextRevisionNamesRequest.builder(onshape);
  }

  /**
   * Create request for getRevisionHistoryInCompanyByPartId
   *  @return Request builder object
   */
  public final RevisionsGetRevisionHistoryInCompanyByPartIdRequest.Builder getRevisionHistoryInCompanyByPartId() {
    return RevisionsGetRevisionHistoryInCompanyByPartIdRequest.builder(onshape);
  }

  /**
   * Create request for getRevisionHistoryInCompanyByPartNumber
   *  @return Request builder object
   */
  public final RevisionsGetRevisionHistoryInCompanyByPartNumberRequest.Builder getRevisionHistoryInCompanyByPartNumber() {
    return RevisionsGetRevisionHistoryInCompanyByPartNumberRequest.builder(onshape);
  }

  /**
   * Create request for getRevisionHistoryInCompanyByElementId
   *  @return Request builder object
   */
  public final RevisionsGetRevisionHistoryInCompanyByElementIdRequest.Builder getRevisionHistoryInCompanyByElementId() {
    return RevisionsGetRevisionHistoryInCompanyByElementIdRequest.builder(onshape);
  }

  /**
   * Create request for getBulkNextRevisionNames
   *  @return Request builder object
   */
  public final RevisionsGetBulkNextRevisionNamesRequest.Builder getBulkNextRevisionNames() {
    return RevisionsGetBulkNextRevisionNamesRequest.builder(onshape);
  }

  /**
   * Create request for updateRule
   *  @return Request builder object
   */
  public final RevisionsUpdateRuleRequest.Builder updateRule() {
    return RevisionsUpdateRuleRequest.builder(onshape);
  }
}
