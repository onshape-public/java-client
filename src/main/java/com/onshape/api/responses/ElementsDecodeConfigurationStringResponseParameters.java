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
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to decodeConfigurationString API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ElementsDecodeConfigurationStringResponseParameters extends AbstractResponseObject {
  /**
   * The id of the parameter
   */
  @JsonProperty("parameterId")
  public String parameterId;

  /**
   * The parameter value
   */
  @JsonProperty("parameterValue")
  public String parameterValue;

  /**
   * The display name of the parameter
   */
  @JsonProperty("parameterName")
  public String parameterName;

  /**
   * The display value of the parameter
   */
  @JsonProperty("parameterDisplayValue")
  public String parameterDisplayValue;

  /**
   * True if the parameter is explicit in the configuration string rather than being defaulted from the element configuration
   */
  @JsonProperty("explicit")
  public Boolean explicit;

  /**
   * Get The id of the parameter
   *
   * @return The id of the parameter
   *
   */
  public final String getParameterId() {
    return this.parameterId;
  }

  /**
   * Get The parameter value
   *
   * @return The parameter value
   *
   */
  public final String getParameterValue() {
    return this.parameterValue;
  }

  /**
   * Get The display name of the parameter
   *
   * @return The display name of the parameter
   *
   */
  public final String getParameterName() {
    return this.parameterName;
  }

  /**
   * Get The display value of the parameter
   *
   * @return The display value of the parameter
   *
   */
  public final String getParameterDisplayValue() {
    return this.parameterDisplayValue;
  }

  /**
   * Get True if the parameter is explicit in the configuration string rather than being defaulted from the element configuration
   *
   * @return True if the parameter is explicit in the configuration string rather than being defaulted from the element configuration
   *
   */
  public final Boolean getExplicit() {
    return this.explicit;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
