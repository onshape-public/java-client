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

import com.onshape.api.requests.WebhooksCreateWebhookRequest;
import com.onshape.api.requests.WebhooksGetRequest;
import com.onshape.api.requests.WebhooksGetWebhookRequest;
import com.onshape.api.requests.WebhooksPingWebhookRequest;
import com.onshape.api.requests.WebhooksUnregisterWebhookRequest;
import com.onshape.api.requests.WebhooksUpdateWebhookRequest;

/**
 * Webhooks: API endpoints for Webhooks group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Webhooks {
  final Onshape onshape;

  Webhooks(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for createWebhook
   *  @return Request builder object
   */
  public final WebhooksCreateWebhookRequest.Builder createWebhook() {
    return WebhooksCreateWebhookRequest.builder(onshape);
  }

  /**
   * Create request for getWebhook
   *  @return Request builder object
   */
  public final WebhooksGetWebhookRequest.Builder getWebhook() {
    return WebhooksGetWebhookRequest.builder(onshape);
  }

  /**
   * Create request for get
   *  @return Request builder object
   */
  public final WebhooksGetRequest.Builder get() {
    return WebhooksGetRequest.builder(onshape);
  }

  /**
   * Create request for pingWebhook
   *  @return Request builder object
   */
  public final WebhooksPingWebhookRequest.Builder pingWebhook() {
    return WebhooksPingWebhookRequest.builder(onshape);
  }

  /**
   * Create request for unregisterWebhook
   *  @return Request builder object
   */
  public final WebhooksUnregisterWebhookRequest.Builder unregisterWebhook() {
    return WebhooksUnregisterWebhookRequest.builder(onshape);
  }

  /**
   * Create request for updateWebhook
   *  @return Request builder object
   */
  public final WebhooksUpdateWebhookRequest.Builder updateWebhook() {
    return WebhooksUpdateWebhookRequest.builder(onshape);
  }
}
