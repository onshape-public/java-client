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
import javax.validation.constraints.NotNull;

/**
 * Response object for compareAppElementJson API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCompareAppElementJsonResponse extends AbstractResponseObject {
  /**
   * Source element microversion id
   */
  @JsonProperty("sourceChangeId")
  @NotNull
  String sourceChangeId;

  /**
   * Target element microversion id
   */
  @JsonProperty("targetChangeId")
  @NotNull
  String targetChangeId;

  /**
   * Differences between source and target versions, encoded according to value of jsonDifferenceFormat: as a BTJEdit (see updateElement for a description) by default, as a BJEdit with full paths (jsonDifferenceFormat=full_path), as JSON patch (see RFC 6902; jsonDifferenceFormat=json_patch)
   */
  @JsonProperty("change")
  @NotNull
  Map change;

  /**
   * Get Source element microversion id
   *
   * @return Source element microversion id
   *
   */
  public final String getSourceChangeId() {
    return this.sourceChangeId;
  }

  /**
   * Get Target element microversion id
   *
   * @return Target element microversion id
   *
   */
  public final String getTargetChangeId() {
    return this.targetChangeId;
  }

  /**
   * Get Differences between source and target versions, encoded according to value of jsonDifferenceFormat: as a BTJEdit (see updateElement for a description) by default, as a BJEdit with full paths (jsonDifferenceFormat=full_path), as JSON patch (see RFC 6902; jsonDifferenceFormat=json_patch)
   *
   * @return Differences between source and target versions, encoded according to value of jsonDifferenceFormat: as a BTJEdit (see updateElement for a description) by default, as a BJEdit with full paths (jsonDifferenceFormat=full_path), as JSON patch (see RFC 6902; jsonDifferenceFormat=json_patch)
   *
   */
  public final Map getChange() {
    return this.change;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
