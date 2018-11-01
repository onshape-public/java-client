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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for get API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class TeamsGetResponse {
  /**
   * Team description
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Whether current user is administrator of team
   */
  @JsonProperty("admin")
  @NotNull
  Boolean admin;

  /**
   * Team name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Team ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * URL of this team information
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
  public final TeamsGetResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, TeamsGetResponse.class);
  }

  /**
   * Get Team description
   *
   * @return Team description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Whether current user is administrator of team
   *
   * @return Whether current user is administrator of team
   *
   */
  public final Boolean getAdmin() {
    return this.admin;
  }

  /**
   * Get Team name
   *
   * @return Team name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Team ID
   *
   * @return Team ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get URL of this team information
   *
   * @return URL of this team information
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
