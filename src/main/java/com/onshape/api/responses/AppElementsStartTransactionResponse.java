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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for startTransaction API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AppElementsStartTransactionResponse {
  /**
   * The elementId of the element
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * The changeId upon which the transaction is based
   */
  @JsonProperty("changeId")
  @NotNull
  String changeId;

  /**
   * The changeId of the preceding operation, which is the same as changeId
   */
  @JsonProperty("parentChangeId")
  @NotNull
  String parentChangeId;

  /**
   * The id of the transaction that was created
   */
  @JsonProperty("transactionId")
  @NotNull
  String transactionId;

  /**
   * Get The elementId of the element
   *
   * @return The elementId of the element
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The changeId upon which the transaction is based
   *
   * @return The changeId upon which the transaction is based
   *
   */
  public final String getChangeId() {
    return this.changeId;
  }

  /**
   * Get The changeId of the preceding operation, which is the same as changeId
   *
   * @return The changeId of the preceding operation, which is the same as changeId
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get The id of the transaction that was created
   *
   * @return The id of the transaction that was created
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
