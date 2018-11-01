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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updateAssociativeData API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AppAssociativeDataUpdateAssociativeDataRequestData {
  /**
   * the name
   */
  @JsonProperty("name")
  public String name;

  /**
   * the value
   */
  @JsonProperty("value")
  public String value;

  AppAssociativeDataUpdateAssociativeDataRequestData(String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Get the name
   *
   * @return the name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get the value
   *
   * @return the value
   *
   */
  public final String getValue() {
    return this.value;
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
     * the name
     */
    private String name;

    /**
     * the value
     */
    private String value;

    Builder() {
    }

    /**
     * Get the name
     *
     * @return the name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set the name
     *
     * @param value the name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get the value
     *
     * @return the value
     *
     */
    public final String value() {
      return this.value;
    }

    /**
     * Set the value
     *
     * @param value the value
     *
     * @return the Builder object.
     */
    public final Builder value(String value) {
      this.value = value;
      return this;
    }

    public final AppAssociativeDataUpdateAssociativeDataRequestData build() {
      return new com.onshape.api.requests.AppAssociativeDataUpdateAssociativeDataRequestData(name,value);
    }
  }
}
