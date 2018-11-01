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
 * Object used in calls to updateStandardContentPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsUpdateStandardContentPartMetadataRequestCustomProperties {
  /**
   * Name of custom property
   */
  @JsonProperty("name")
  public String name;

  /**
   * Value of custom property (a null value will delete the property)
   */
  @JsonProperty("value")
  public String value;

  PartsUpdateStandardContentPartMetadataRequestCustomProperties(String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Get Name of custom property
   *
   * @return Name of custom property
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Value of custom property (a null value will delete the property)
   *
   * @return Value of custom property (a null value will delete the property)
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
     * Name of custom property
     */
    private String name;

    /**
     * Value of custom property (a null value will delete the property)
     */
    private String value;

    Builder() {
    }

    /**
     * Get Name of custom property
     *
     * @return Name of custom property
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Name of custom property
     *
     * @param value Name of custom property
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Value of custom property (a null value will delete the property)
     *
     * @return Value of custom property (a null value will delete the property)
     *
     */
    public final String value() {
      return this.value;
    }

    /**
     * Set Value of custom property (a null value will delete the property)
     *
     * @param value Value of custom property (a null value will delete the property)
     *
     * @return the Builder object.
     */
    public final Builder value(String value) {
      this.value = value;
      return this;
    }

    public final PartsUpdateStandardContentPartMetadataRequestCustomProperties build() {
      return new com.onshape.api.requests.PartsUpdateStandardContentPartMetadataRequestCustomProperties(name,value);
    }
  }
}
