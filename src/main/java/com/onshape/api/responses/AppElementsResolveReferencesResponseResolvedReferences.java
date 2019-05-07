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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to resolveReferences API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AppElementsResolveReferencesResponseResolvedReferences {
  /**
   * The changeId of the creation operation
   */
  @JsonProperty("changeId")
  public String changeId;

  /**
   * The id of the retrieved reference
   */
  @JsonProperty("referenceId")
  public String referenceId;

  /**
   * The Id of the document contained in the reference
   */
  @JsonProperty("targetDocumentId")
  public String targetDocumentId;

  /**
   * The Id of the version of the document contained in the reference
   */
  @JsonProperty("targetVersionId")
  public String targetVersionId;

  /**
   * The id of the referenced element
   */
  @JsonProperty("targetElementId")
  public String targetElementId;

  /**
   * The document microversion contained in the reference, if set
   */
  @JsonProperty("targetDocumentMicroversionId")
  public String targetDocumentMicroversionId;

  /**
   * The document microversion contained in the reference, or the current document microversion if not set in the reference
   */
  @JsonProperty("resolvedDocumentMicroversionId")
  public String resolvedDocumentMicroversionId;

  /**
   * The idTag of a target within the target element
   */
  @JsonProperty("idTag")
  public String idTag;

  /**
   * Set to true if the idTag value is valid
   */
  @JsonProperty("idTagIsValid")
  public String idTagIsValid;

  /**
   * for internal use
   */
  @JsonProperty("trackNewVersions")
  public Boolean trackNewVersions;

  /**
   * The configuration string for the target element
   */
  @JsonProperty("targetConfiguration")
  public String targetConfiguration;

  /**
   * True if the element configuration can be changed to a non-default value
   */
  @JsonProperty("isConfigurable")
  public Boolean isConfigurable;

  /**
   * Get The changeId of the creation operation
   *
   * @return The changeId of the creation operation
   *
   */
  public final String getChangeId() {
    return this.changeId;
  }

  /**
   * Get The id of the retrieved reference
   *
   * @return The id of the retrieved reference
   *
   */
  public final String getReferenceId() {
    return this.referenceId;
  }

  /**
   * Get The Id of the document contained in the reference
   *
   * @return The Id of the document contained in the reference
   *
   */
  public final String getTargetDocumentId() {
    return this.targetDocumentId;
  }

  /**
   * Get The Id of the version of the document contained in the reference
   *
   * @return The Id of the version of the document contained in the reference
   *
   */
  public final String getTargetVersionId() {
    return this.targetVersionId;
  }

  /**
   * Get The id of the referenced element
   *
   * @return The id of the referenced element
   *
   */
  public final String getTargetElementId() {
    return this.targetElementId;
  }

  /**
   * Get The document microversion contained in the reference, if set
   *
   * @return The document microversion contained in the reference, if set
   *
   */
  public final String getTargetDocumentMicroversionId() {
    return this.targetDocumentMicroversionId;
  }

  /**
   * Get The document microversion contained in the reference, or the current document microversion if not set in the reference
   *
   * @return The document microversion contained in the reference, or the current document microversion if not set in the reference
   *
   */
  public final String getResolvedDocumentMicroversionId() {
    return this.resolvedDocumentMicroversionId;
  }

  /**
   * Get The idTag of a target within the target element
   *
   * @return The idTag of a target within the target element
   *
   */
  public final String getIdTag() {
    return this.idTag;
  }

  /**
   * Get Set to true if the idTag value is valid
   *
   * @return Set to true if the idTag value is valid
   *
   */
  public final String getIdTagIsValid() {
    return this.idTagIsValid;
  }

  /**
   * Get for internal use
   *
   * @return for internal use
   *
   */
  public final Boolean getTrackNewVersions() {
    return this.trackNewVersions;
  }

  /**
   * Get The configuration string for the target element
   *
   * @return The configuration string for the target element
   *
   */
  public final String getTargetConfiguration() {
    return this.targetConfiguration;
  }

  /**
   * Get True if the element configuration can be changed to a non-default value
   *
   * @return True if the element configuration can be changed to a non-default value
   *
   */
  public final Boolean getIsConfigurable() {
    return this.isConfigurable;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
