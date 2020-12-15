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

/**
 * Object used in calls to getCompanyOneTimeAppPurchases API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CompaniesGetCompanyOneTimeAppPurchasesResponseItemsSubscribers extends AbstractResponseObject {
  /**
   * User id
   */
  @JsonProperty("id")
  public String id;

  /**
   * User&#39;s name (requires OAuth2ReadPII scope)
   */
  @JsonProperty("name")
  public String name;

  /**
   * User&#39;s first name (requires OAuth2ReadPII scope)
   */
  @JsonProperty("firstName")
  public String firstName;

  /**
   * User&#39;s last name (requires OAuth2ReadPII scope)
   */
  @JsonProperty("lastName")
  public String lastName;

  /**
   * User&#39;s email (requires OAuth2ReadPII scope)
   */
  @JsonProperty("email")
  public String email;

  /**
   * Get User id
   *
   * @return User id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get User&#39;s name (requires OAuth2ReadPII scope)
   *
   * @return User&#39;s name (requires OAuth2ReadPII scope)
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get User&#39;s first name (requires OAuth2ReadPII scope)
   *
   * @return User&#39;s first name (requires OAuth2ReadPII scope)
   *
   */
  public final String getFirstName() {
    return this.firstName;
  }

  /**
   * Get User&#39;s last name (requires OAuth2ReadPII scope)
   *
   * @return User&#39;s last name (requires OAuth2ReadPII scope)
   *
   */
  public final String getLastName() {
    return this.lastName;
  }

  /**
   * Get User&#39;s email (requires OAuth2ReadPII scope)
   *
   * @return User&#39;s email (requires OAuth2ReadPII scope)
   *
   */
  public final String getEmail() {
    return this.email;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
