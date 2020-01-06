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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getSubElementContent API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsGetSubElementContentResponseData extends AbstractResponseObject {
  /**
   * Id of the subelement for which the data applies
   */
  @JsonProperty("subelementId")
  public String subelementId;

  /**
   * The base content of the subelement, if it exists. Base-64 encoded
   */
  @JsonProperty("baseContent")
  public String baseContent;

  /**
   * Delta content for the subelement. Deltas are returned in the order that they apply
   */
  @JsonProperty("deltas")
  public AppElementsGetSubElementContentResponseDataDeltas[] deltas;

  /**
   * Get Id of the subelement for which the data applies
   *
   * @return Id of the subelement for which the data applies
   *
   */
  public final String getSubelementId() {
    return this.subelementId;
  }

  /**
   * Get The base content of the subelement, if it exists. Base-64 encoded
   *
   * @return The base content of the subelement, if it exists. Base-64 encoded
   *
   */
  public final String getBaseContent() {
    return this.baseContent;
  }

  /**
   * Get Delta content for the subelement. Deltas are returned in the order that they apply
   *
   * @return Delta content for the subelement. Deltas are returned in the order that they apply
   *
   */
  public final AppElementsGetSubElementContentResponseDataDeltas[] getDeltas() {
    return this.deltas;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
