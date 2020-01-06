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
import java.util.Map;

/**
 * Object used in calls to idTranslations API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosIdTranslationsResponseIds extends AbstractResponseObject {
  /**
   * The id in source microversion
   */
  @JsonProperty("source")
  public String source;

  /**
   * [] Set of ids which corresponds to the source id. Can have 0, 1, or more id-s.
   */
  @JsonProperty("target")
  public String[] target;

  /**
   * Translation status (OK|SPLIT|FAILED_TO_RESOLVE|TRANSLATION_ERROR)
   */
  @JsonProperty("status")
  public Map status;

  /**
   * Get The id in source microversion
   *
   * @return The id in source microversion
   *
   */
  public final String getSource() {
    return this.source;
  }

  /**
   * Get [] Set of ids which corresponds to the source id. Can have 0, 1, or more id-s.
   *
   * @return [] Set of ids which corresponds to the source id. Can have 0, 1, or more id-s.
   *
   */
  public final String[] getTarget() {
    return this.target;
  }

  /**
   * Get Translation status (OK|SPLIT|FAILED_TO_RESOLVE|TRANSLATION_ERROR)
   *
   * @return Translation status (OK|SPLIT|FAILED_TO_RESOLVE|TRANSLATION_ERROR)
   *
   */
  public final Map getStatus() {
    return this.status;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
