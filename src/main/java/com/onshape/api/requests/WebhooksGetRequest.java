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
import com.onshape.api.responses.WebhooksGetResponse;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for get API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class WebhooksGetRequest {
  /**
   * Id of the company to get list of hooks by a company.
   */
  @JsonProperty("company")
  String company;

  /**
   * Id of the user to get list of hooks by by user.
   */
  @JsonProperty("user")
  String user;

  WebhooksGetRequest(String company, String user) {
    this.company = company;
    this.user = user;
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
     * Id of the company to get list of hooks by a company.
     */
    private String company;

    /**
     * Id of the user to get list of hooks by by user.
     */
    private String user;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the company to get list of hooks by a company.
     *
     * @return Id of the company to get list of hooks by a company.
     *
     */
    public final String company() {
      return this.company;
    }

    /**
     * Set Id of the company to get list of hooks by a company.
     *
     * @param value Id of the company to get list of hooks by a company.
     *
     * @return the Builder object.
     */
    public final Builder company(String value) {
      this.company = value;
      return this;
    }

    /**
     * Get Id of the user to get list of hooks by by user.
     *
     * @return Id of the user to get list of hooks by by user.
     *
     */
    public final String user() {
      return this.user;
    }

    /**
     * Set Id of the user to get list of hooks by by user.
     *
     * @param value Id of the user to get list of hooks by by user.
     *
     * @return the Builder object.
     */
    public final Builder user(String value) {
      this.user = value;
      return this;
    }

    private WebhooksGetRequest build() {
      return new com.onshape.api.requests.WebhooksGetRequest(company,user);
    }

    /**
     * Calls get method, Get list of webhooks registered for a company or user
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final WebhooksGetResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/webhooks", build(), onshape.buildMap(), onshape.buildMap("company", company, "user", user), com.onshape.api.responses.WebhooksGetResponse.class);
    }
  }
}
