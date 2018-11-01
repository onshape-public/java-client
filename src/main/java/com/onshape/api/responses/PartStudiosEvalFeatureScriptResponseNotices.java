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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to evalFeatureScript API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosEvalFeatureScriptResponseNotices {
  /**
   * The severity level of a notice entry
   */
  @JsonProperty("level")
  public String level;

  /**
   * The type of notice indicating the phase of analysis where found
   */
  @JsonProperty("type")
  public String type;

  /**
   * A readable message
   */
  @JsonProperty("message")
  public String message;

  /**
   * A stack trace indicating the execution location for the notice
   */
  @JsonProperty("stackTrace")
  public Map[] stackTrace;

  /**
   * Undocumented
   */
  @JsonProperty("tryNode")
  public Map tryNode;

  /**
   * The id of the parameter to which the notice applies, where applicable
   */
  @JsonProperty("parameterId")
  public String[] parameterId;

  /**
   * Get The severity level of a notice entry
   *
   * @return The severity level of a notice entry
   *
   */
  public final String getLevel() {
    return this.level;
  }

  /**
   * Get The type of notice indicating the phase of analysis where found
   *
   * @return The type of notice indicating the phase of analysis where found
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get A readable message
   *
   * @return A readable message
   *
   */
  public final String getMessage() {
    return this.message;
  }

  /**
   * Get A stack trace indicating the execution location for the notice
   *
   * @return A stack trace indicating the execution location for the notice
   *
   */
  public final Map[] getStackTrace() {
    return this.stackTrace;
  }

  /**
   * Get Undocumented
   *
   * @return Undocumented
   *
   */
  public final Map getTryNode() {
    return this.tryNode;
  }

  /**
   * Get The id of the parameter to which the notice applies, where applicable
   *
   * @return The id of the parameter to which the notice applies, where applicable
   *
   */
  public final String[] getParameterId() {
    return this.parameterId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
