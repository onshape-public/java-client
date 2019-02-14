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
import com.onshape.api.responses.ReleaseManagementCreateReleasePackageResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createReleasePackage API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class ReleaseManagementCreateReleasePackageRequest {
  /**
   * Array of items to be released
   */
  @JsonProperty("items")
  @NotNull
  ReleaseManagementCreateReleasePackageRequestItems[] items;

  ReleaseManagementCreateReleasePackageRequest(ReleaseManagementCreateReleasePackageRequestItems[] items) {
    this.items = items;
  }

  /**
   * Get Array of items to be released
   *
   * @return Array of items to be released
   *
   */
  public final ReleaseManagementCreateReleasePackageRequestItems[] getItems() {
    return this.items;
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
     * Array of items to be released
     */
    private ReleaseManagementCreateReleasePackageRequestItems[] items;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Array of items to be released
     *
     * @return Array of items to be released
     *
     */
    public final ReleaseManagementCreateReleasePackageRequestItems[] items() {
      return this.items;
    }

    /**
     * Set Array of items to be released
     *
     * @param value Array of items to be released
     *
     * @return the Builder object.
     */
    public final Builder items(ReleaseManagementCreateReleasePackageRequestItems[] value) {
      this.items = value;
      return this;
    }

    private ReleaseManagementCreateReleasePackageRequest build() {
      return new com.onshape.api.requests.ReleaseManagementCreateReleasePackageRequest(items);
    }

    /**
     * Calls createReleasePackage method, Create a new release package to release one or more items. All revisionable items must be from
     *                 the same document. Once a release package has been successfully created use the
     *                 updateReleasePackage to update all desired item/package properties and transition it to desired
     *                 state.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wfid ID of release workflow as returned by getActiveWorkflows
     */
    public final ReleaseManagementCreateReleasePackageResponse call(String wfid) throws
        OnshapeException {
      return onshape.call("post", "/releasepackages/release/:wfid", build(), onshape.buildMap("wfid", wfid), onshape.buildMap(), com.onshape.api.responses.ReleaseManagementCreateReleasePackageResponse.class);
    }
  }
}
