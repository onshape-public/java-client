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
import com.onshape.api.responses.CompaniesAddUserResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for addUser API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CompaniesAddUserRequest {
  /**
   * The company ID - should match the path.
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * The email.
   */
  @JsonProperty("email")
  @NotNull
  String email;

  /**
   * If the new user is an admin.
   */
  @JsonProperty("admin")
  @NotNull
  Boolean admin;

  /**
   * If the new user is a guest.
   */
  @JsonProperty("guest")
  @NotNull
  Boolean guest;

  /**
   * If the new user is a light user.
   */
  @JsonProperty("light")
  @NotNull
  Boolean light;

  /**
   * If the new user should get an email.
   */
  @JsonProperty("sendEmail")
  @NotNull
  Boolean sendEmail;

  /**
   * List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
   */
  @JsonProperty("globalPermissions")
  @NotNull
  Number[] globalPermissions;

  CompaniesAddUserRequest(String companyId, String email, Boolean admin, Boolean guest,
      Boolean light, Boolean sendEmail, Number[] globalPermissions) {
    this.companyId = companyId;
    this.email = email;
    this.admin = admin;
    this.guest = guest;
    this.light = light;
    this.sendEmail = sendEmail;
    this.globalPermissions = globalPermissions;
  }

  /**
   * Get The company ID - should match the path.
   *
   * @return The company ID - should match the path.
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get The email.
   *
   * @return The email.
   *
   */
  public final String getEmail() {
    return this.email;
  }

  /**
   * Get If the new user is an admin.
   *
   * @return If the new user is an admin.
   *
   */
  public final Boolean getAdmin() {
    return this.admin;
  }

  /**
   * Get If the new user is a guest.
   *
   * @return If the new user is a guest.
   *
   */
  public final Boolean getGuest() {
    return this.guest;
  }

  /**
   * Get If the new user is a light user.
   *
   * @return If the new user is a light user.
   *
   */
  public final Boolean getLight() {
    return this.light;
  }

  /**
   * Get If the new user should get an email.
   *
   * @return If the new user should get an email.
   *
   */
  public final Boolean getSendEmail() {
    return this.sendEmail;
  }

  /**
   * Get List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
   *
   * @return List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
   *
   */
  public final Number[] getGlobalPermissions() {
    return this.globalPermissions;
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
     * The company ID - should match the path.
     */
    private String companyId;

    /**
     * The email.
     */
    private String email;

    /**
     * If the new user is an admin.
     */
    private Boolean admin;

    /**
     * If the new user is a guest.
     */
    private Boolean guest;

    /**
     * If the new user is a light user.
     */
    private Boolean light;

    /**
     * If the new user should get an email.
     */
    private Boolean sendEmail;

    /**
     * List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
     */
    private Number[] globalPermissions;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The company ID - should match the path.
     *
     * @return The company ID - should match the path.
     *
     */
    public final String companyId() {
      return this.companyId;
    }

    /**
     * Set The company ID - should match the path.
     *
     * @param value The company ID - should match the path.
     *
     * @return the Builder object.
     */
    public final Builder companyId(String value) {
      this.companyId = value;
      return this;
    }

    /**
     * Get The email.
     *
     * @return The email.
     *
     */
    public final String email() {
      return this.email;
    }

    /**
     * Set The email.
     *
     * @param value The email.
     *
     * @return the Builder object.
     */
    public final Builder email(String value) {
      this.email = value;
      return this;
    }

    /**
     * Get If the new user is an admin.
     *
     * @return If the new user is an admin.
     *
     */
    public final Boolean admin() {
      return this.admin;
    }

    /**
     * Set If the new user is an admin.
     *
     * @param value If the new user is an admin.
     *
     * @return the Builder object.
     */
    public final Builder admin(Boolean value) {
      this.admin = value;
      return this;
    }

    /**
     * Get If the new user is a guest.
     *
     * @return If the new user is a guest.
     *
     */
    public final Boolean guest() {
      return this.guest;
    }

    /**
     * Set If the new user is a guest.
     *
     * @param value If the new user is a guest.
     *
     * @return the Builder object.
     */
    public final Builder guest(Boolean value) {
      this.guest = value;
      return this;
    }

    /**
     * Get If the new user is a light user.
     *
     * @return If the new user is a light user.
     *
     */
    public final Boolean light() {
      return this.light;
    }

    /**
     * Set If the new user is a light user.
     *
     * @param value If the new user is a light user.
     *
     * @return the Builder object.
     */
    public final Builder light(Boolean value) {
      this.light = value;
      return this;
    }

    /**
     * Get If the new user should get an email.
     *
     * @return If the new user should get an email.
     *
     */
    public final Boolean sendEmail() {
      return this.sendEmail;
    }

    /**
     * Set If the new user should get an email.
     *
     * @param value If the new user should get an email.
     *
     * @return the Builder object.
     */
    public final Builder sendEmail(Boolean value) {
      this.sendEmail = value;
      return this;
    }

    /**
     * Get List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
     *
     * @return List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
     *
     */
    public final Number[] globalPermissions() {
      return this.globalPermissions;
    }

    /**
     * Set List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
     *
     * @param value List of global permissions for the new user. OWNER=100, DELETE=90, RESHARE=80, WRITE=70, READ=60, LINK=50, COPY=30, EXPORT=20, COMMENT=10, ANONYMOUS_ACCESS=5.
     *
     * @return the Builder object.
     */
    public final Builder globalPermissions(Number[] value) {
      this.globalPermissions = value;
      return this;
    }

    private CompaniesAddUserRequest build() {
      return new com.onshape.api.requests.CompaniesAddUserRequest(companyId,email,admin,guest,light,sendEmail,globalPermissions);
    }

    /**
     * Calls addUser method, Adds user to company. Must have Company Admin level privileges to call.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Company id
     */
    public final CompaniesAddUserResponse call(String cid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/companies/:cid/users", build(), onshape.buildMap("cid", cid), onshape.buildMap(), com.onshape.api.responses.CompaniesAddUserResponse.class);
    }
  }
}
