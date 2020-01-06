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
import com.onshape.api.responses.AccountsGetPlanPurchasesResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getPlanPurchases API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AccountsGetPlanPurchasesRequest {
  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (max is 20)
   */
  @JsonProperty("limit")
  Number limit;

  AccountsGetPlanPurchasesRequest(Number offset, Number limit) {
    this.offset = offset;
    this.limit = limit;
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
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (max is 20)
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Where to begin search results
     *
     * @return Where to begin search results
     *
     */
    public final Number offset() {
      return this.offset;
    }

    /**
     * Set Where to begin search results
     *
     * @param value Where to begin search results
     *
     * @return the Builder object.
     */
    public final Builder offset(Number value) {
      this.offset = value;
      return this;
    }

    /**
     * Get Number of results to return per page (max is 20)
     *
     * @return Number of results to return per page (max is 20)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 20)
     *
     * @param value Number of results to return per page (max is 20)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private AccountsGetPlanPurchasesRequest build() {
      return new com.onshape.api.requests.AccountsGetPlanPurchasesRequest(offset,limit);
    }

    /**
     * Calls getPlanPurchases method, Return a list of purchases associated with a plan, along with user information for the
     *                 subscribers involved. Information returned depends on whether the app associated with the plan
     *                 has the OAuth2ReadPII scope. This API can only be called by an admin of the app associated with
     *                 the plan.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param planId Plan Id
     */
    public final AccountsGetPlanPurchasesResponse call(String planId) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/accounts/plans/:planId/purchases", build(), onshape.buildMap("planId", planId), onshape.buildMap("offset", offset, "limit", limit), com.onshape.api.responses.AccountsGetPlanPurchasesResponse.class);
    }
  }
}
