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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.WebhooksUpdateWebhookResponse;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateWebhook API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class WebhooksUpdateWebhookRequest {
  /**
   * ID of webhook to update (must match webhookid in path parameter)
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * URL to which to send notifications
   */
  @JsonProperty("url")
  @NotNull
  String url;

  /**
   * Array of event names for which to register webhook
   */
  @JsonProperty("events")
  @NotNull
  String[] events;

  /**
   * Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
   */
  @JsonProperty("filter")
  @NotNull
  String filter;

  /**
   * Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
   */
  @JsonProperty("options")
  @NotNull
  Map options;

  /**
   * Data to encapsulate in webhook
   */
  @JsonProperty("data")
  String data;

  WebhooksUpdateWebhookRequest(String id, String url, String[] events, String filter, Map options,
      String data) {
    this.id = id;
    this.url = url;
    this.events = events;
    this.filter = filter;
    this.options = options;
    this.data = data;
  }

  /**
   * Get ID of webhook to update (must match webhookid in path parameter)
   *
   * @return ID of webhook to update (must match webhookid in path parameter)
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get URL to which to send notifications
   *
   * @return URL to which to send notifications
   *
   */
  public final String getUrl() {
    return this.url;
  }

  /**
   * Get Array of event names for which to register webhook
   *
   * @return Array of event names for which to register webhook
   *
   */
  public final String[] getEvents() {
    return this.events;
  }

  /**
   * Get Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
   *
   * @return Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
   *
   */
  public final String getFilter() {
    return this.filter;
  }

  /**
   * Get Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
   *
   * @return Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
   *
   */
  public final Map getOptions() {
    return this.options;
  }

  /**
   * Get Data to encapsulate in webhook
   *
   * @return Data to encapsulate in webhook
   *
   */
  public final String getData() {
    return this.data;
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
    /**
     * ID of webhook to update (must match webhookid in path parameter)
     */
    private String id;

    /**
     * URL to which to send notifications
     */
    private String url;

    /**
     * Array of event names for which to register webhook
     */
    private String[] events;

    /**
     * Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
     */
    private String filter;

    /**
     * Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
     */
    private Map options;

    /**
     * Data to encapsulate in webhook
     */
    private String data;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get ID of webhook to update (must match webhookid in path parameter)
     *
     * @return ID of webhook to update (must match webhookid in path parameter)
     *
     */
    public final String id() {
      return this.id;
    }

    /**
     * Set ID of webhook to update (must match webhookid in path parameter)
     *
     * @param value ID of webhook to update (must match webhookid in path parameter)
     *
     * @return the Builder object.
     */
    public final Builder id(String value) {
      this.id = value;
      return this;
    }

    /**
     * Get URL to which to send notifications
     *
     * @return URL to which to send notifications
     *
     */
    public final String url() {
      return this.url;
    }

    /**
     * Set URL to which to send notifications
     *
     * @param value URL to which to send notifications
     *
     * @return the Builder object.
     */
    public final Builder url(String value) {
      this.url = value;
      return this;
    }

    /**
     * Get Array of event names for which to register webhook
     *
     * @return Array of event names for which to register webhook
     *
     */
    public final String[] events() {
      return this.events;
    }

    /**
     * Set Array of event names for which to register webhook
     *
     * @param value Array of event names for which to register webhook
     *
     * @return the Builder object.
     */
    public final Builder events(String[] value) {
      this.events = value;
      return this;
    }

    /**
     * Get Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
     *
     * @return Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
     *
     */
    public final String filter() {
      return this.filter;
    }

    /**
     * Set Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
     *
     * @param value Context for webhook, in one of two forms: &quot;{DocumentId} = &#39;[did]&#39; &amp;&amp; {WorkspaceId} = &#39;[wid]&#39; &amp;&amp; {ElementId} = &#39;[eid]&#39;&quot; or &quot;{UserId} = &#39;[uid]&#39; &amp;&amp; {ClientId} = &#39;cid&#39;&quot; [did] is a document ID, etc., but the components in brackets and the quotes must remain exactly as written, in the same order
     *
     * @return the Builder object.
     */
    public final Builder filter(String value) {
      this.filter = value;
      return this;
    }

    /**
     * Get Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
     *
     * @return Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
     *
     */
    public final Map options() {
      return this.options;
    }

    /**
     * Set Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
     *
     * @param value Options object, with one optional field: collapseEvents, which is set to true/false and says whether similar events should be collapsed into one notification
     *
     * @return the Builder object.
     */
    public final Builder options(Map value) {
      this.options = value;
      return this;
    }

    /**
     * Get Data to encapsulate in webhook
     *
     * @return Data to encapsulate in webhook
     *
     */
    public final String data() {
      return this.data;
    }

    /**
     * Set Data to encapsulate in webhook
     *
     * @param value Data to encapsulate in webhook
     *
     * @return the Builder object.
     */
    public final Builder data(String value) {
      this.data = value;
      return this;
    }

    private WebhooksUpdateWebhookRequest build() {
      return new com.onshape.api.requests.WebhooksUpdateWebhookRequest(id,url,events,filter,options,data);
    }

    /**
     * Calls updateWebhook method, Update a webhook
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param webhookid ID of webhook to update
     */
    public final WebhooksUpdateWebhookResponse call(String webhookid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/webhooks/:webhookid", build(), onshape.buildMap("webhookid", webhookid), onshape.buildMap(), com.onshape.api.responses.WebhooksUpdateWebhookResponse.class);
    }
  }
}
