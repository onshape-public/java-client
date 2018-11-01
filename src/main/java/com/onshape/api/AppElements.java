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

import com.onshape.api.requests.AppElementsCommitTransactionRequest;
import com.onshape.api.requests.AppElementsCreateElementRequest;
import com.onshape.api.requests.AppElementsCreateReferenceRequest;
import com.onshape.api.requests.AppElementsDeleteContentRequest;
import com.onshape.api.requests.AppElementsDeleteReferenceRequest;
import com.onshape.api.requests.AppElementsGetHistoryByWorkspaceRequest;
import com.onshape.api.requests.AppElementsGetSubElementContentRequest;
import com.onshape.api.requests.AppElementsGetSubElementIdsRequest;
import com.onshape.api.requests.AppElementsResolveReferenceRequest;
import com.onshape.api.requests.AppElementsStartTransactionRequest;
import com.onshape.api.requests.AppElementsUpdateElementRequest;
import com.onshape.api.requests.AppElementsUpdateReferenceRequest;

/**
 * AppElements: API endpoints for AppElements group.
 * &copy; 2018 Onshape Inc.
 */
public final class AppElements {
  Onshape onshape;

  AppElements(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for commitTransaction
   *  @return Request builder object
   */
  public final AppElementsCommitTransactionRequest.Builder commitTransaction() {
    return AppElementsCommitTransactionRequest.builder(onshape);
  }

  /**
   * Create request for createElement
   *  @return Request builder object
   */
  public final AppElementsCreateElementRequest.Builder createElement() {
    return AppElementsCreateElementRequest.builder(onshape);
  }

  /**
   * Create request for createReference
   *  @return Request builder object
   */
  public final AppElementsCreateReferenceRequest.Builder createReference() {
    return AppElementsCreateReferenceRequest.builder(onshape);
  }

  /**
   * Create request for deleteReference
   *  @return Request builder object
   */
  public final AppElementsDeleteReferenceRequest.Builder deleteReference() {
    return AppElementsDeleteReferenceRequest.builder(onshape);
  }

  /**
   * Create request for deleteContent
   *  @return Request builder object
   */
  public final AppElementsDeleteContentRequest.Builder deleteContent() {
    return AppElementsDeleteContentRequest.builder(onshape);
  }

  /**
   * Create request for getSubElementContent
   *  @return Request builder object
   */
  public final AppElementsGetSubElementContentRequest.Builder getSubElementContent() {
    return AppElementsGetSubElementContentRequest.builder(onshape);
  }

  /**
   * Create request for getHistoryByWorkspace
   *  @return Request builder object
   */
  public final AppElementsGetHistoryByWorkspaceRequest.Builder getHistoryByWorkspace() {
    return AppElementsGetHistoryByWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for getSubElementIds
   *  @return Request builder object
   */
  public final AppElementsGetSubElementIdsRequest.Builder getSubElementIds() {
    return AppElementsGetSubElementIdsRequest.builder(onshape);
  }

  /**
   * Create request for resolveReference
   *  @return Request builder object
   */
  public final AppElementsResolveReferenceRequest.Builder resolveReference() {
    return AppElementsResolveReferenceRequest.builder(onshape);
  }

  /**
   * Create request for startTransaction
   *  @return Request builder object
   */
  public final AppElementsStartTransactionRequest.Builder startTransaction() {
    return AppElementsStartTransactionRequest.builder(onshape);
  }

  /**
   * Create request for updateElement
   *  @return Request builder object
   */
  public final AppElementsUpdateElementRequest.Builder updateElement() {
    return AppElementsUpdateElementRequest.builder(onshape);
  }

  /**
   * Create request for updateReference
   *  @return Request builder object
   */
  public final AppElementsUpdateReferenceRequest.Builder updateReference() {
    return AppElementsUpdateReferenceRequest.builder(onshape);
  }
}
