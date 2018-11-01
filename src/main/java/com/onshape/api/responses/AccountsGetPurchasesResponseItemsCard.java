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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getPurchases API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AccountsGetPurchasesResponseItemsCard {
  /**
   * Card type
   */
  @JsonProperty("type")
  public String type;

  /**
   * Card last four digits
   */
  @JsonProperty("last4")
  public String last4;

  /**
   * Card expiration year
   */
  @JsonProperty("expYear")
  public Number expYear;

  /**
   * Card expiration month
   */
  @JsonProperty("expMonth")
  public Number expMonth;

  /**
   * Get Card type
   *
   * @return Card type
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Card last four digits
   *
   * @return Card last four digits
   *
   */
  public final String getLast4() {
    return this.last4;
  }

  /**
   * Get Card expiration year
   *
   * @return Card expiration year
   *
   */
  public final Number getExpYear() {
    return this.expYear;
  }

  /**
   * Get Card expiration month
   *
   * @return Card expiration month
   *
   */
  public final Number getExpMonth() {
    return this.expMonth;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
