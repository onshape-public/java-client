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
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getMembers API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class TeamsGetMembersResponse extends AbstractResponseObject {
  /**
   * Paginated list of 20 team members
   */
  @JsonProperty("items")
  @NotNull
  TeamsGetMembersResponseItems[] items;

  /**
   * URL for previous page of 20 teams
   */
  @JsonProperty("previous")
  @NotNull
  String previous;

  /**
   * URL for next page of 20 teams
   */
  @JsonProperty("next")
  @NotNull
  String next;

  /**
   * URL for current page of 20 teams
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Fetch next page of results
   * @param onshape The Onshape client object.
   * @return Next page of results or null if this is last page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final TeamsGetMembersResponse next(Onshape onshape) throws OnshapeException {
    return (next==null ? null : onshape.get(next, TeamsGetMembersResponse.class));
  }

  /**
   * Fetch previous page of results
   * @param onshape The Onshape client object.
   * @return Previous page of results or null if this is first page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final TeamsGetMembersResponse previous(Onshape onshape) throws OnshapeException {
    return (previous==null ? null : onshape.get(previous, TeamsGetMembersResponse.class));
  }

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final TeamsGetMembersResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, TeamsGetMembersResponse.class);
  }

  /**
   * Get Paginated list of 20 team members
   *
   * @return Paginated list of 20 team members
   *
   */
  public final TeamsGetMembersResponseItems[] getItems() {
    return this.items;
  }

  /**
   * Get URL for previous page of 20 teams
   *
   * @return URL for previous page of 20 teams
   *
   */
  public final String getPrevious() {
    return this.previous;
  }

  /**
   * Get URL for next page of 20 teams
   *
   * @return URL for next page of 20 teams
   *
   */
  public final String getNext() {
    return this.next;
  }

  /**
   * Get URL for current page of 20 teams
   *
   * @return URL for current page of 20 teams
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
