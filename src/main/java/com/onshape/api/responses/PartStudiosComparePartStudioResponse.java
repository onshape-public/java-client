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
import javax.validation.constraints.NotNull;

/**
 * Response object for comparePartStudio API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosComparePartStudioResponse extends AbstractResponseObject {
  /**
   * Source workspace id, can be null
   */
  @JsonProperty("sourceWorkspaceId")
  String sourceWorkspaceId;

  /**
   * Source version id, can be null
   */
  @JsonProperty("sourceVersionId")
  String sourceVersionId;

  /**
   * Source document microversion id
   */
  @JsonProperty("sourceMicroversionId")
  @NotNull
  String sourceMicroversionId;

  /**
   * Target workspace id, can be null
   */
  @JsonProperty("targetWorkspaceId")
  String targetWorkspaceId;

  /**
   * Target version id, can be null
   */
  @JsonProperty("targetVersionId")
  String targetVersionId;

  /**
   * Target document microversion id
   */
  @JsonProperty("targetMicroversionId")
  @NotNull
  String targetMicroversionId;

  /**
   * Part Studio change type (see API description)
   */
  @JsonProperty("type")
  @NotNull
  String type;

  /**
   * Map of the differences between source and target versions of Part Studio
   */
  @JsonProperty("changes")
  @NotNull
  PartStudiosComparePartStudioResponseChanges changes;

  /**
   * Get Source workspace id, can be null
   *
   * @return Source workspace id, can be null
   *
   */
  public final String getSourceWorkspaceId() {
    return this.sourceWorkspaceId;
  }

  /**
   * Get Source version id, can be null
   *
   * @return Source version id, can be null
   *
   */
  public final String getSourceVersionId() {
    return this.sourceVersionId;
  }

  /**
   * Get Source document microversion id
   *
   * @return Source document microversion id
   *
   */
  public final String getSourceMicroversionId() {
    return this.sourceMicroversionId;
  }

  /**
   * Get Target workspace id, can be null
   *
   * @return Target workspace id, can be null
   *
   */
  public final String getTargetWorkspaceId() {
    return this.targetWorkspaceId;
  }

  /**
   * Get Target version id, can be null
   *
   * @return Target version id, can be null
   *
   */
  public final String getTargetVersionId() {
    return this.targetVersionId;
  }

  /**
   * Get Target document microversion id
   *
   * @return Target document microversion id
   *
   */
  public final String getTargetMicroversionId() {
    return this.targetMicroversionId;
  }

  /**
   * Get Part Studio change type (see API description)
   *
   * @return Part Studio change type (see API description)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Map of the differences between source and target versions of Part Studio
   *
   * @return Map of the differences between source and target versions of Part Studio
   *
   */
  public final PartStudiosComparePartStudioResponseChanges getChanges() {
    return this.changes;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
