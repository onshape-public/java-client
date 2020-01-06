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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for get API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class CompaniesGetResponse extends AbstractResponseObject {
  /**
   * Company address
   */
  @JsonProperty("address")
  @NotNull
  CompaniesGetResponseAddress address;

  /**
   * Company description
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * URL for company image
   */
  @JsonProperty("image")
  @NotNull
  String image;

  /**
   * Whether current user is administrator of company
   */
  @JsonProperty("admin")
  @NotNull
  Boolean admin;

  /**
   * Company name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Company ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * URL of this company information
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final CompaniesGetResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, CompaniesGetResponse.class);
  }

  /**
   * Get Company address
   *
   * @return Company address
   *
   */
  public final CompaniesGetResponseAddress getAddress() {
    return this.address;
  }

  /**
   * Get Company description
   *
   * @return Company description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get URL for company image
   *
   * @return URL for company image
   *
   */
  public final String getImage() {
    return this.image;
  }

  /**
   * Get Whether current user is administrator of company
   *
   * @return Whether current user is administrator of company
   *
   */
  public final Boolean getAdmin() {
    return this.admin;
  }

  /**
   * Get Company name
   *
   * @return Company name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Company ID
   *
   * @return Company ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get URL of this company information
   *
   * @return URL of this company information
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
