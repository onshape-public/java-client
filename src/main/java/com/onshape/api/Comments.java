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

import com.onshape.api.requests.CommentsAddAttachmentRequest;
import com.onshape.api.requests.CommentsCreateRequest;
import com.onshape.api.requests.CommentsDeleteAttachmentsRequest;
import com.onshape.api.requests.CommentsDeleteRequest;
import com.onshape.api.requests.CommentsGetAttachmentRequest;
import com.onshape.api.requests.CommentsGetCommentRequest;
import com.onshape.api.requests.CommentsGetRequest;
import com.onshape.api.requests.CommentsReopenRequest;
import com.onshape.api.requests.CommentsResolveRequest;
import com.onshape.api.requests.CommentsUpdateRequest;

/**
 * Comments: API endpoints for Comments group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Comments {
  final Onshape onshape;

  Comments(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for addAttachment
   *  @return Request builder object
   */
  public final CommentsAddAttachmentRequest.Builder addAttachment() {
    return CommentsAddAttachmentRequest.builder(onshape);
  }

  /**
   * Create request for create
   *  @return Request builder object
   */
  public final CommentsCreateRequest.Builder create() {
    return CommentsCreateRequest.builder(onshape);
  }

  /**
   * Create request for delete
   *  @return Request builder object
   */
  public final CommentsDeleteRequest.Builder delete() {
    return CommentsDeleteRequest.builder(onshape);
  }

  /**
   * Create request for deleteAttachments
   *  @return Request builder object
   */
  public final CommentsDeleteAttachmentsRequest.Builder deleteAttachments() {
    return CommentsDeleteAttachmentsRequest.builder(onshape);
  }

  /**
   * Create request for getAttachment
   *  @return Request builder object
   */
  public final CommentsGetAttachmentRequest.Builder getAttachment() {
    return CommentsGetAttachmentRequest.builder(onshape);
  }

  /**
   * Create request for getComment
   *  @return Request builder object
   */
  public final CommentsGetCommentRequest.Builder getComment() {
    return CommentsGetCommentRequest.builder(onshape);
  }

  /**
   * Create request for get
   *  @return Request builder object
   */
  public final CommentsGetRequest.Builder get() {
    return CommentsGetRequest.builder(onshape);
  }

  /**
   * Create request for reopen
   *  @return Request builder object
   */
  public final CommentsReopenRequest.Builder reopen() {
    return CommentsReopenRequest.builder(onshape);
  }

  /**
   * Create request for resolve
   *  @return Request builder object
   */
  public final CommentsResolveRequest.Builder resolve() {
    return CommentsResolveRequest.builder(onshape);
  }

  /**
   * Create request for update
   *  @return Request builder object
   */
  public final CommentsUpdateRequest.Builder update() {
    return CommentsUpdateRequest.builder(onshape);
  }
}
