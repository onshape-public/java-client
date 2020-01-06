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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for createWebhook API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WebhooksCreateWebhookResponse extends AbstractResponseObject {
  /**
   * ID of webhook
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Number of dropped events
   */
  @JsonProperty("droppedEventCount")
  @NotNull
  Number droppedEventCount;

  /**
   * Options for the webhook
   */
  @JsonProperty("options")
  @NotNull
  WebhooksCreateWebhookResponseOptions options;

  /**
   * URL to which notifications are sent
   */
  @JsonProperty("url")
  @NotNull
  String url;

  /**
   * Array of events to which webhook is registered
   */
  @JsonProperty("events")
  @NotNull
  String[] events;

  /**
   * Data returned from webhook
   */
  @JsonProperty("data")
  @NotNull
  String data;

  /**
   * Context for webhook
   */
  @JsonProperty("filter")
  @NotNull
  String filter;

  /**
   * Get ID of webhook
   *
   * @return ID of webhook
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Number of dropped events
   *
   * @return Number of dropped events
   *
   */
  public final Number getDroppedEventCount() {
    return this.droppedEventCount;
  }

  /**
   * Get Options for the webhook
   *
   * @return Options for the webhook
   *
   */
  public final WebhooksCreateWebhookResponseOptions getOptions() {
    return this.options;
  }

  /**
   * Get URL to which notifications are sent
   *
   * @return URL to which notifications are sent
   *
   */
  public final String getUrl() {
    return this.url;
  }

  /**
   * Get Array of events to which webhook is registered
   *
   * @return Array of events to which webhook is registered
   *
   */
  public final String[] getEvents() {
    return this.events;
  }

  /**
   * Get Data returned from webhook
   *
   * @return Data returned from webhook
   *
   */
  public final String getData() {
    return this.data;
  }

  /**
   * Get Context for webhook
   *
   * @return Context for webhook
   *
   */
  public final String getFilter() {
    return this.filter;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
