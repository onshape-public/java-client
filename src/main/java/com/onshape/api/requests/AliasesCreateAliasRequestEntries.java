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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to createAlias API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AliasesCreateAliasRequestEntries {
  /**
   * User email
   */
  @JsonProperty("email")
  public String email;

  /**
   * User id
   */
  @JsonProperty("userId")
  public String userId;

  /**
   * Team id
   */
  @JsonProperty("teamId")
  public String teamId;

  AliasesCreateAliasRequestEntries(String email, String userId, String teamId) {
    this.email = email;
    this.userId = userId;
    this.teamId = teamId;
  }

  /**
   * Get User email
   *
   * @return User email
   *
   */
  public final String getEmail() {
    return this.email;
  }

  /**
   * Get User id
   *
   * @return User id
   *
   */
  public final String getUserId() {
    return this.userId;
  }

  /**
   * Get Team id
   *
   * @return Team id
   *
   */
  public final String getTeamId() {
    return this.teamId;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * User email
     */
    private String email;

    /**
     * User id
     */
    private String userId;

    /**
     * Team id
     */
    private String teamId;

    Builder() {
    }

    /**
     * Get User email
     *
     * @return User email
     *
     */
    public final String email() {
      return this.email;
    }

    /**
     * Set User email
     *
     * @param value User email
     *
     * @return the Builder object.
     */
    public final Builder email(String value) {
      this.email = value;
      return this;
    }

    /**
     * Get User id
     *
     * @return User id
     *
     */
    public final String userId() {
      return this.userId;
    }

    /**
     * Set User id
     *
     * @param value User id
     *
     * @return the Builder object.
     */
    public final Builder userId(String value) {
      this.userId = value;
      return this;
    }

    /**
     * Get Team id
     *
     * @return Team id
     *
     */
    public final String teamId() {
      return this.teamId;
    }

    /**
     * Set Team id
     *
     * @param value Team id
     *
     * @return the Builder object.
     */
    public final Builder teamId(String value) {
      this.teamId = value;
      return this;
    }

    public final AliasesCreateAliasRequestEntries build() {
      return new com.onshape.api.requests.AliasesCreateAliasRequestEntries(email,userId,teamId);
    }
  }
}
