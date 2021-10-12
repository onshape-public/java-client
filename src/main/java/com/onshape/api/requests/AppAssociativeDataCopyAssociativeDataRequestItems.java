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
 * Object used in calls to copyAssociativeData API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppAssociativeDataCopyAssociativeDataRequestItems {
  /**
   * the viewId associative data should be copied from
   */
  @JsonProperty("sourceViewId")
  public String sourceViewId;

  /**
   * the viewId associative data should be copied to
   */
  @JsonProperty("destinationViewId")
  public String destinationViewId;

  /**
   * the ids of the associative data to copy, or all if empty
   */
  @JsonProperty("associativeDataIds")
  public String associativeDataIds;

  AppAssociativeDataCopyAssociativeDataRequestItems(String sourceViewId, String destinationViewId,
      String associativeDataIds) {
    this.sourceViewId = sourceViewId;
    this.destinationViewId = destinationViewId;
    this.associativeDataIds = associativeDataIds;
  }

  /**
   * Get the viewId associative data should be copied from
   *
   * @return the viewId associative data should be copied from
   *
   */
  public final String getSourceViewId() {
    return this.sourceViewId;
  }

  /**
   * Get the viewId associative data should be copied to
   *
   * @return the viewId associative data should be copied to
   *
   */
  public final String getDestinationViewId() {
    return this.destinationViewId;
  }

  /**
   * Get the ids of the associative data to copy, or all if empty
   *
   * @return the ids of the associative data to copy, or all if empty
   *
   */
  public final String getAssociativeDataIds() {
    return this.associativeDataIds;
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
     * the viewId associative data should be copied from
     */
    private String sourceViewId;

    /**
     * the viewId associative data should be copied to
     */
    private String destinationViewId;

    /**
     * the ids of the associative data to copy, or all if empty
     */
    private String associativeDataIds;

    Builder() {
    }

    /**
     * Get the viewId associative data should be copied from
     *
     * @return the viewId associative data should be copied from
     *
     */
    public final String sourceViewId() {
      return this.sourceViewId;
    }

    /**
     * Set the viewId associative data should be copied from
     *
     * @param value the viewId associative data should be copied from
     *
     * @return the Builder object.
     */
    public final Builder sourceViewId(String value) {
      this.sourceViewId = value;
      return this;
    }

    /**
     * Get the viewId associative data should be copied to
     *
     * @return the viewId associative data should be copied to
     *
     */
    public final String destinationViewId() {
      return this.destinationViewId;
    }

    /**
     * Set the viewId associative data should be copied to
     *
     * @param value the viewId associative data should be copied to
     *
     * @return the Builder object.
     */
    public final Builder destinationViewId(String value) {
      this.destinationViewId = value;
      return this;
    }

    /**
     * Get the ids of the associative data to copy, or all if empty
     *
     * @return the ids of the associative data to copy, or all if empty
     *
     */
    public final String associativeDataIds() {
      return this.associativeDataIds;
    }

    /**
     * Set the ids of the associative data to copy, or all if empty
     *
     * @param value the ids of the associative data to copy, or all if empty
     *
     * @return the Builder object.
     */
    public final Builder associativeDataIds(String value) {
      this.associativeDataIds = value;
      return this;
    }

    public final AppAssociativeDataCopyAssociativeDataRequestItems build() {
      return new com.onshape.api.requests.AppAssociativeDataCopyAssociativeDataRequestItems(sourceViewId,destinationViewId,associativeDataIds);
    }
  }
}
