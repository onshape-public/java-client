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
import com.onshape.api.responses.ReleaseManagementUpdateReleasePackageResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateReleasePackage API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementUpdateReleasePackageRequest {
  /**
   * Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   */
  @JsonProperty("properties")
  @NotNull
  ReleaseManagementUpdateReleasePackageRequestProperties[] properties;

  /**
   * Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
   */
  @JsonProperty("items")
  @NotNull
  ReleaseManagementUpdateReleasePackageRequestItems[] items;

  ReleaseManagementUpdateReleasePackageRequest(
      ReleaseManagementUpdateReleasePackageRequestProperties[] properties,
      ReleaseManagementUpdateReleasePackageRequestItems[] items) {
    this.properties = properties;
    this.items = items;
  }

  /**
   * Get Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   * @return Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
   *
   */
  public final ReleaseManagementUpdateReleasePackageRequestProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
   *
   * @return Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
   *
   */
  public final ReleaseManagementUpdateReleasePackageRequestItems[] getItems() {
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
     * Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     */
    private ReleaseManagementUpdateReleasePackageRequestProperties[] properties;

    /**
     * Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
     */
    private ReleaseManagementUpdateReleasePackageRequestItems[] items;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     */
    public final ReleaseManagementUpdateReleasePackageRequestProperties[] properties() {
      return this.properties;
    }

    /**
     * Set Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @param value Array of properties to update before doing the transition. All properties with required=true which do not have a value must be specified. No properties with editable=false should be specified.
     *
     * @return the Builder object.
     */
    public final Builder properties(
        ReleaseManagementUpdateReleasePackageRequestProperties[] value) {
      this.properties = value;
      return this;
    }

    /**
     * Get Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
     *
     * @return Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
     *
     */
    public final ReleaseManagementUpdateReleasePackageRequestItems[] items() {
      return this.items;
    }

    /**
     * Set Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
     *
     * @param value Array of items to be updated along with their desired new properties. Only the items for which properties need to be updated to be included in this list
     *
     * @return the Builder object.
     */
    public final Builder items(ReleaseManagementUpdateReleasePackageRequestItems[] value) {
      this.items = value;
      return this;
    }

    private ReleaseManagementUpdateReleasePackageRequest build() {
      return new com.onshape.api.requests.ReleaseManagementUpdateReleasePackageRequest(properties,items);
    }

    /**
     * Calls updateReleasePackage method, Update the release/obsoletion package properties and/or item properties and transition it to
     *                 desired state
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param rpid ID of package to transition
     *
     * @param wfaction Workflow action to perform on the package. Allowed values are SUBMIT, CREATE_AND_RELEASE, RELEASE, REJECT, OBSOLETE, DISCARD or CREATE_AND_OBSOLETE. DISCARD can only be performed by the creator of the package and is the only transition that can be performed even if items have errors. CREATE_AND_RELEASE and CREATE_AND_OBSOLETE can only be performed by creator if the Release management settings for the company allow release without approvers. If Release management settings restrict the approver list to a subset of company users, Only those users can perform transitions. (Default: null) */
    public final ReleaseManagementUpdateReleasePackageResponse call(String rpid, String wfaction)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/releasepackages/:rpid", build(), onshape.buildMap("rpid", rpid), onshape.buildMap("wfaction", wfaction), com.onshape.api.responses.ReleaseManagementUpdateReleasePackageResponse.class);
    }
  }
}
