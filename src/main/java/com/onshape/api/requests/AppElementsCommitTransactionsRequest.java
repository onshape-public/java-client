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
import com.onshape.api.responses.AppElementsCommitTransactionsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for commitTransactions API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCommitTransactionsRequest {
  /**
   * Description of the change being made, for history tracking
   */
  @JsonProperty("description")
  String description;

  /**
   * If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
   */
  @JsonProperty("allowMerge")
  Boolean allowMerge;

  /**
   * Ids of all transactions to commit.
   */
  @JsonProperty("transactionIds")
  @NotNull
  String[] transactionIds;

  AppElementsCommitTransactionsRequest(String description, Boolean allowMerge,
      String[] transactionIds) {
    this.description = description;
    this.allowMerge = allowMerge;
    this.transactionIds = transactionIds;
  }

  /**
   * Get Description of the change being made, for history tracking
   *
   * @return Description of the change being made, for history tracking
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
   *
   * @return If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
   *
   */
  public final Boolean getAllowMerge() {
    return this.allowMerge;
  }

  /**
   * Get Ids of all transactions to commit.
   *
   * @return Ids of all transactions to commit.
   *
   */
  public final String[] getTransactionIds() {
    return this.transactionIds;
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
     * Description of the change being made, for history tracking
     */
    private String description;

    /**
     * If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
     */
    private Boolean allowMerge;

    /**
     * Ids of all transactions to commit.
     */
    private String[] transactionIds;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Description of the change being made, for history tracking
     *
     * @return Description of the change being made, for history tracking
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the change being made, for history tracking
     *
     * @param value Description of the change being made, for history tracking
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
     *
     * @return If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
     *
     */
    public final Boolean allowMerge() {
      return this.allowMerge;
    }

    /**
     * Set If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
     *
     * @param value If false, return an error in the case of concurrency, even if changes could be merged. Default is true.
     *
     * @return the Builder object.
     */
    public final Builder allowMerge(Boolean value) {
      this.allowMerge = value;
      return this;
    }

    /**
     * Get Ids of all transactions to commit.
     *
     * @return Ids of all transactions to commit.
     *
     */
    public final String[] transactionIds() {
      return this.transactionIds;
    }

    /**
     * Set Ids of all transactions to commit.
     *
     * @param value Ids of all transactions to commit.
     *
     * @return the Builder object.
     */
    public final Builder transactionIds(String[] value) {
      this.transactionIds = value;
      return this;
    }

    private AppElementsCommitTransactionsRequest build() {
      return new com.onshape.api.requests.AppElementsCommitTransactionsRequest(description,allowMerge,transactionIds);
    }

    /**
     * Calls commitTransactions method, Commits transactions (Merges multiple transactions into one microversion.) Either all of the
     *                 transactions will be committed in a single microversion or none will be committed if the call
     *                 raises an error.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final AppElementsCommitTransactionsResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/transactions", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.AppElementsCommitTransactionsResponse.class);
    }

    /**
     * Calls commitTransactions method, Commits transactions (Merges multiple transactions into one microversion.) Either all of the
     *                 transactions will be committed in a single microversion or none will be committed if the call
     *                 raises an error.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsCommitTransactionsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/transactions", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.AppElementsCommitTransactionsResponse.class);
    }
  }
}
