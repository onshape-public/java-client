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

import com.onshape.api.requests.ApplicationElementsCommitTransaction__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsCreateElement__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsCreateReference__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsDeleteContent__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsDeleteReference__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsGetContentByWorkspace__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsGetHistoryByWorkspace__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsGetIdsByWorkspace__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsResolveReference__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsStartTransaction__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsUpdateElement__Deprecated_Request;
import com.onshape.api.requests.ApplicationElementsUpdateReference__Deprecated_Request;

/**
 * ApplicationElements: API endpoints for ApplicationElements group.
 * &copy; 2018 Onshape Inc.
 */
public final class ApplicationElements {
  Onshape onshape;

  ApplicationElements(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for commitTransaction__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsCommitTransaction__Deprecated_Request.Builder commitTransaction__Deprecated_() {
    return ApplicationElementsCommitTransaction__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for createElement__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsCreateElement__Deprecated_Request.Builder createElement__Deprecated_() {
    return ApplicationElementsCreateElement__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for createReference__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsCreateReference__Deprecated_Request.Builder createReference__Deprecated_() {
    return ApplicationElementsCreateReference__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for deleteContent__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsDeleteContent__Deprecated_Request.Builder deleteContent__Deprecated_() {
    return ApplicationElementsDeleteContent__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for deleteReference__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsDeleteReference__Deprecated_Request.Builder deleteReference__Deprecated_() {
    return ApplicationElementsDeleteReference__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for getContentByWorkspace__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsGetContentByWorkspace__Deprecated_Request.Builder getContentByWorkspace__Deprecated_() {
    return ApplicationElementsGetContentByWorkspace__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for getHistoryByWorkspace__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsGetHistoryByWorkspace__Deprecated_Request.Builder getHistoryByWorkspace__Deprecated_() {
    return ApplicationElementsGetHistoryByWorkspace__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for getIdsByWorkspace__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsGetIdsByWorkspace__Deprecated_Request.Builder getIdsByWorkspace__Deprecated_() {
    return ApplicationElementsGetIdsByWorkspace__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for resolveReference__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsResolveReference__Deprecated_Request.Builder resolveReference__Deprecated_() {
    return ApplicationElementsResolveReference__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for startTransaction__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsStartTransaction__Deprecated_Request.Builder startTransaction__Deprecated_() {
    return ApplicationElementsStartTransaction__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for updateElement__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsUpdateElement__Deprecated_Request.Builder updateElement__Deprecated_() {
    return ApplicationElementsUpdateElement__Deprecated_Request.builder(onshape);
  }

  /**
   * Create request for updateReference__Deprecated_
   *  @return Request builder object
   */
  public final ApplicationElementsUpdateReference__Deprecated_Request.Builder updateReference__Deprecated_() {
    return ApplicationElementsUpdateReference__Deprecated_Request.builder(onshape);
  }
}
