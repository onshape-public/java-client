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
import javax.validation.constraints.NotNull;

/**
 * Response object for evalFeatureScript API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosEvalFeatureScriptResponse {
  /**
   * An informational message
   */
  @JsonProperty("console")
  @NotNull
  String console;

  /**
   * A list of notices regarding the execution
   */
  @JsonProperty("notices")
  @NotNull
  PartStudiosEvalFeatureScriptResponseNotices[] notices;

  /**
   * the result of the function execution
   */
  @JsonProperty("result")
  @NotNull
  Map result;

  /**
   * The version of the serialization protocol for the response
   */
  @JsonProperty("serializationVersion")
  @NotNull
  String serializationVersion;

  /**
   * The document microversion from which the feature was extracted
   */
  @JsonProperty("sourceMicroversion")
  @NotNull
  String sourceMicroversion;

  /**
   * Get An informational message
   *
   * @return An informational message
   *
   */
  public final String getConsole() {
    return this.console;
  }

  /**
   * Get A list of notices regarding the execution
   *
   * @return A list of notices regarding the execution
   *
   */
  public final PartStudiosEvalFeatureScriptResponseNotices[] getNotices() {
    return this.notices;
  }

  /**
   * Get the result of the function execution
   *
   * @return the result of the function execution
   *
   */
  public final Map getResult() {
    return this.result;
  }

  /**
   * Get The version of the serialization protocol for the response
   *
   * @return The version of the serialization protocol for the response
   *
   */
  public final String getSerializationVersion() {
    return this.serializationVersion;
  }

  /**
   * Get The document microversion from which the feature was extracted
   *
   * @return The document microversion from which the feature was extracted
   *
   */
  public final String getSourceMicroversion() {
    return this.sourceMicroversion;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
