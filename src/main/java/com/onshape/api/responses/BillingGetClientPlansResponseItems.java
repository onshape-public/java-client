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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getClientPlans API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class BillingGetClientPlansResponseItems {
  /**
   * plan Id
   */
  @JsonProperty("id")
  public String id;

  /**
   * Amount in cents
   */
  @JsonProperty("amountCents")
  public Number amountCents;

  /**
   * charge interval month or year
   */
  @JsonProperty("interval")
  public String interval;

  /**
   * Plan description
   */
  @JsonProperty("description")
  public String description;

  /**
   * Plan group
   */
  @JsonProperty("group")
  public String group;

  /**
   * Information about discount
   */
  @JsonProperty("discountInfo")
  public Map discountInfo;

  /**
   * is hidden
   */
  @JsonProperty("hidden")
  public Boolean hidden;

  /**
   * application id
   */
  @JsonProperty("applicationId")
  public String applicationId;

  /**
   * plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   */
  @JsonProperty("planType")
  public Number planType;

  /**
   * trial period days
   */
  @JsonProperty("trialPeriodDays")
  public Number trialPeriodDays;

  /**
   * Get plan Id
   *
   * @return plan Id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Amount in cents
   *
   * @return Amount in cents
   *
   */
  public final Number getAmountCents() {
    return this.amountCents;
  }

  /**
   * Get charge interval month or year
   *
   * @return charge interval month or year
   *
   */
  public final String getInterval() {
    return this.interval;
  }

  /**
   * Get Plan description
   *
   * @return Plan description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Plan group
   *
   * @return Plan group
   *
   */
  public final String getGroup() {
    return this.group;
  }

  /**
   * Get Information about discount
   *
   * @return Information about discount
   *
   */
  public final Map getDiscountInfo() {
    return this.discountInfo;
  }

  /**
   * Get is hidden
   *
   * @return is hidden
   *
   */
  public final Boolean getHidden() {
    return this.hidden;
  }

  /**
   * Get application id
   *
   * @return application id
   *
   */
  public final String getApplicationId() {
    return this.applicationId;
  }

  /**
   * Get plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   * @return plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   */
  public final Number getPlanType() {
    return this.planType;
  }

  /**
   * Get trial period days
   *
   * @return trial period days
   *
   */
  public final Number getTrialPeriodDays() {
    return this.trialPeriodDays;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
