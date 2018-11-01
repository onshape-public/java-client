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
import com.onshape.api.exceptions.OnshapeException;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getSessionInfo API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class UsersGetSessionInfoResponse {
  /**
   * Onshape internal use
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * User&#39;s name (OAuth2ReadPII)
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Onshape internal use
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * User&#39;s first name (OAuth2ReadPII)
   */
  @JsonProperty("firstName")
  @NotNull
  String firstName;

  /**
   * User&#39;s last name (OAuth2ReadPII)
   */
  @JsonProperty("lastName")
  @NotNull
  String lastName;

  /**
   * User&#39;s email (OAuth2ReadPII)
   */
  @JsonProperty("email")
  @NotNull
  String email;

  /**
   * User&#39;s image (OAuth2ReadPII)
   */
  @JsonProperty("image")
  @NotNull
  String image;

  /**
   * Onshape internal use
   */
  @JsonProperty("state")
  @NotNull
  Number state;

  /**
   * Onshape internal use
   */
  @JsonProperty("oauth2Scopes")
  @NotNull
  Number oauth2Scopes;

  /**
   * application&#39;s client ID
   */
  @JsonProperty("clientId")
  @NotNull
  String clientId;

  /**
   * Onshape internal use
   */
  @JsonProperty("role")
  @NotNull
  Number role;

  /**
   * User&#39;s roles (OAuth2ReadPII)
   */
  @JsonProperty("roles")
  @NotNull
  String[] roles;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final UsersGetSessionInfoResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, UsersGetSessionInfoResponse.class);
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get User&#39;s name (OAuth2ReadPII)
   *
   * @return User&#39;s name (OAuth2ReadPII)
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get User&#39;s first name (OAuth2ReadPII)
   *
   * @return User&#39;s first name (OAuth2ReadPII)
   *
   */
  public final String getFirstName() {
    return this.firstName;
  }

  /**
   * Get User&#39;s last name (OAuth2ReadPII)
   *
   * @return User&#39;s last name (OAuth2ReadPII)
   *
   */
  public final String getLastName() {
    return this.lastName;
  }

  /**
   * Get User&#39;s email (OAuth2ReadPII)
   *
   * @return User&#39;s email (OAuth2ReadPII)
   *
   */
  public final String getEmail() {
    return this.email;
  }

  /**
   * Get User&#39;s image (OAuth2ReadPII)
   *
   * @return User&#39;s image (OAuth2ReadPII)
   *
   */
  public final String getImage() {
    return this.image;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Number getState() {
    return this.state;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Number getOauth2Scopes() {
    return this.oauth2Scopes;
  }

  /**
   * Get application&#39;s client ID
   *
   * @return application&#39;s client ID
   *
   */
  public final String getClientId() {
    return this.clientId;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Number getRole() {
    return this.role;
  }

  /**
   * Get User&#39;s roles (OAuth2ReadPII)
   *
   * @return User&#39;s roles (OAuth2ReadPII)
   *
   */
  public final String[] getRoles() {
    return this.roles;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
