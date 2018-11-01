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
 * Object used in calls to encodeConfiguration API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ElementsEncodeConfigurationRequestParameters {
  /**
   * The ID of this configuration parameter
   */
  @JsonProperty("parameterId")
  public String parameterId;

  /**
   * The value of this configuration parameter
   */
  @JsonProperty("parameterValue")
  public String parameterValue;

  ElementsEncodeConfigurationRequestParameters(String parameterId, String parameterValue) {
    this.parameterId = parameterId;
    this.parameterValue = parameterValue;
  }

  /**
   * Get The ID of this configuration parameter
   *
   * @return The ID of this configuration parameter
   *
   */
  public final String getParameterId() {
    return this.parameterId;
  }

  /**
   * Get The value of this configuration parameter
   *
   * @return The value of this configuration parameter
   *
   */
  public final String getParameterValue() {
    return this.parameterValue;
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
     * The ID of this configuration parameter
     */
    private String parameterId;

    /**
     * The value of this configuration parameter
     */
    private String parameterValue;

    Builder() {
    }

    /**
     * Get The ID of this configuration parameter
     *
     * @return The ID of this configuration parameter
     *
     */
    public final String parameterId() {
      return this.parameterId;
    }

    /**
     * Set The ID of this configuration parameter
     *
     * @param value The ID of this configuration parameter
     *
     * @return the Builder object.
     */
    public final Builder parameterId(String value) {
      this.parameterId = value;
      return this;
    }

    /**
     * Get The value of this configuration parameter
     *
     * @return The value of this configuration parameter
     *
     */
    public final String parameterValue() {
      return this.parameterValue;
    }

    /**
     * Set The value of this configuration parameter
     *
     * @param value The value of this configuration parameter
     *
     * @return the Builder object.
     */
    public final Builder parameterValue(String value) {
      this.parameterValue = value;
      return this;
    }

    public final ElementsEncodeConfigurationRequestParameters build() {
      return new com.onshape.api.requests.ElementsEncodeConfigurationRequestParameters(parameterId,parameterValue);
    }
  }
}
