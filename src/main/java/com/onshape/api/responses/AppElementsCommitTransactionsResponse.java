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
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for commitTransactions API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCommitTransactionsResponse extends AbstractResponseObject {
  /**
   * The elementId of the element. This is deprecated - use elementIds instead.
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * The elementIds of the affected elements
   */
  @JsonProperty("elementIds")
  @NotNull
  String[] elementIds;

  /**
   * The changeId representing the element state after the commit
   */
  @JsonProperty("changeId")
  @NotNull
  String changeId;

  /**
   * The changeId of the operation on which the transactions were based
   */
  @JsonProperty("parentChangeId")
  @NotNull
  String parentChangeId;

  /**
   * The id of the transaction that should be committed. This is deprecated because this endpoint accepts multiple transactions.
   */
  @JsonProperty("transactionId")
  @NotNull
  String transactionId;

  /**
   * Get The elementId of the element. This is deprecated - use elementIds instead.
   *
   * @return The elementId of the element. This is deprecated - use elementIds instead.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The elementIds of the affected elements
   *
   * @return The elementIds of the affected elements
   *
   */
  public final String[] getElementIds() {
    return this.elementIds;
  }

  /**
   * Get The changeId representing the element state after the commit
   *
   * @return The changeId representing the element state after the commit
   *
   */
  public final String getChangeId() {
    return this.changeId;
  }

  /**
   * Get The changeId of the operation on which the transactions were based
   *
   * @return The changeId of the operation on which the transactions were based
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get The id of the transaction that should be committed. This is deprecated because this endpoint accepts multiple transactions.
   *
   * @return The id of the transaction that should be committed. This is deprecated because this endpoint accepts multiple transactions.
   *
   */
  public final String getTransactionId() {
    return this.transactionId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
