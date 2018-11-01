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

import com.onshape.api.requests.ThumbnailsDeleteApplicationThumbnailsRequest;
import com.onshape.api.requests.ThumbnailsGetConfiguredElementThumbnailWithSizeRequest;
import com.onshape.api.requests.ThumbnailsGetDocumentThumbnailRequest;
import com.onshape.api.requests.ThumbnailsGetDocumentThumbnailWithSizeRequest;
import com.onshape.api.requests.ThumbnailsGetElementThumbnailRequest;
import com.onshape.api.requests.ThumbnailsGetElementThumbnailWithSizeRequest;
import com.onshape.api.requests.ThumbnailsGetThumbnailForDocumentAndVersionOldRequest;
import com.onshape.api.requests.ThumbnailsGetThumbnailForDocumentAndVersionRequest;
import com.onshape.api.requests.ThumbnailsGetThumbnailForDocumentOldRequest;
import com.onshape.api.requests.ThumbnailsGetThumbnailForDocumentRequest;
import com.onshape.api.requests.ThumbnailsSetApplicationElementThumbnailRequest;

/**
 * Thumbnails: API endpoints for Thumbnails group.
 * &copy; 2018 Onshape Inc.
 */
public final class Thumbnails {
  Onshape onshape;

  Thumbnails(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for deleteApplicationThumbnails
   *  @return Request builder object
   */
  public final ThumbnailsDeleteApplicationThumbnailsRequest.Builder deleteApplicationThumbnails() {
    return ThumbnailsDeleteApplicationThumbnailsRequest.builder(onshape);
  }

  /**
   * Create request for getConfiguredElementThumbnailWithSize
   *  @return Request builder object
   */
  public final ThumbnailsGetConfiguredElementThumbnailWithSizeRequest.Builder getConfiguredElementThumbnailWithSize() {
    return ThumbnailsGetConfiguredElementThumbnailWithSizeRequest.builder(onshape);
  }

  /**
   * Create request for getThumbnailForDocument
   *  @return Request builder object
   */
  public final ThumbnailsGetThumbnailForDocumentRequest.Builder getThumbnailForDocument() {
    return ThumbnailsGetThumbnailForDocumentRequest.builder(onshape);
  }

  /**
   * Create request for getThumbnailForDocumentOld
   *  @return Request builder object
   */
  public final ThumbnailsGetThumbnailForDocumentOldRequest.Builder getThumbnailForDocumentOld() {
    return ThumbnailsGetThumbnailForDocumentOldRequest.builder(onshape);
  }

  /**
   * Create request for getDocumentThumbnail
   *  @return Request builder object
   */
  public final ThumbnailsGetDocumentThumbnailRequest.Builder getDocumentThumbnail() {
    return ThumbnailsGetDocumentThumbnailRequest.builder(onshape);
  }

  /**
   * Create request for getElementThumbnail
   *  @return Request builder object
   */
  public final ThumbnailsGetElementThumbnailRequest.Builder getElementThumbnail() {
    return ThumbnailsGetElementThumbnailRequest.builder(onshape);
  }

  /**
   * Create request for getElementThumbnailWithSize
   *  @return Request builder object
   */
  public final ThumbnailsGetElementThumbnailWithSizeRequest.Builder getElementThumbnailWithSize() {
    return ThumbnailsGetElementThumbnailWithSizeRequest.builder(onshape);
  }

  /**
   * Create request for getThumbnailForDocumentAndVersion
   *  @return Request builder object
   */
  public final ThumbnailsGetThumbnailForDocumentAndVersionRequest.Builder getThumbnailForDocumentAndVersion() {
    return ThumbnailsGetThumbnailForDocumentAndVersionRequest.builder(onshape);
  }

  /**
   * Create request for getThumbnailForDocumentAndVersionOld
   *  @return Request builder object
   */
  public final ThumbnailsGetThumbnailForDocumentAndVersionOldRequest.Builder getThumbnailForDocumentAndVersionOld() {
    return ThumbnailsGetThumbnailForDocumentAndVersionOldRequest.builder(onshape);
  }

  /**
   * Create request for getDocumentThumbnailWithSize
   *  @return Request builder object
   */
  public final ThumbnailsGetDocumentThumbnailWithSizeRequest.Builder getDocumentThumbnailWithSize() {
    return ThumbnailsGetDocumentThumbnailWithSizeRequest.builder(onshape);
  }

  /**
   * Create request for setApplicationElementThumbnail
   *  @return Request builder object
   */
  public final ThumbnailsSetApplicationElementThumbnailRequest.Builder setApplicationElementThumbnail() {
    return ThumbnailsSetApplicationElementThumbnailRequest.builder(onshape);
  }
}
