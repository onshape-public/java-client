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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getMembers API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class TeamsGetMembersResponseItems extends AbstractResponseObject {
  /**
   * Whether member is administrator of team
   */
  @JsonProperty("admin")
  public Boolean admin;

  /**
   * Team member name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Team member details
   */
  @JsonProperty("member")
  public Map member;

  /**
   * Datetime when member was added
   */
  @JsonProperty("dateAdded")
  public String dateAdded;

  /**
   * URL of this member information
   */
  @JsonProperty("href")
  public String href;

  /**
   * Get Whether member is administrator of team
   *
   * @return Whether member is administrator of team
   *
   */
  public final Boolean getAdmin() {
    return this.admin;
  }

  /**
   * Get Team member name
   *
   * @return Team member name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Team member details
   *
   * @return Team member details
   *
   */
  public final Map getMember() {
    return this.member;
  }

  /**
   * Get Datetime when member was added
   *
   * @return Datetime when member was added
   *
   */
  public final String getDateAdded() {
    return this.dateAdded;
  }

  /**
   * Get URL of this member information
   *
   * @return URL of this member information
   *
   */
  public final String getHref() {
    return this.href;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
