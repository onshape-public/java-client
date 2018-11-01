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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for updateAssociativeData API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AppAssociativeDataUpdateAssociativeDataResponse {
  /**
   * appElement change id
   */
  @JsonProperty("changeId")
  @NotNull
  String changeId;

  /**
   * error code
   */
  @JsonProperty("errorCode")
  @NotNull
  Number errorCode;

  /**
   * description of the error
   */
  @JsonProperty("errorDescription")
  @NotNull
  String errorDescription;

  /**
   * list of associations
   */
  @JsonProperty("items")
  @NotNull
  AppAssociativeDataUpdateAssociativeDataResponseItems[] items;

  /**
   * Get appElement change id
   *
   * @return appElement change id
   *
   */
  public final String getChangeId() {
    return this.changeId;
  }

  /**
   * Get error code
   *
   * @return error code
   *
   */
  public final Number getErrorCode() {
    return this.errorCode;
  }

  /**
   * Get description of the error
   *
   * @return description of the error
   *
   */
  public final String getErrorDescription() {
    return this.errorDescription;
  }

  /**
   * Get list of associations
   *
   * @return list of associations
   *
   */
  public final AppAssociativeDataUpdateAssociativeDataResponseItems[] getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
