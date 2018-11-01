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

/**
 * Object used in calls to getMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartStudiosGetMetadataResponseParts {
  /**
   * Part name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Part description (user-specified)
   */
  @JsonProperty("description")
  public String description;

  /**
   * Part number (user-specified)
   */
  @JsonProperty("partNumber")
  public String partNumber;

  /**
   * Part revision (user-specified)
   */
  @JsonProperty("revision")
  public String revision;

  /**
   * Deterministic part ID
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Document microversion ID
   */
  @JsonProperty("microversionId")
  public String microversionId;

  /**
   * Part appearance info
   */
  @JsonProperty("appearance")
  public PartStudiosGetMetadataResponsePartsAppearance appearance;

  /**
   * Custom part properties, if any
   */
  @JsonProperty("customProperties")
  public PartStudiosGetMetadataResponsePartsCustomProperties customProperties;

  /**
   * Get Part name
   *
   * @return Part name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Part description (user-specified)
   *
   * @return Part description (user-specified)
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Part number (user-specified)
   *
   * @return Part number (user-specified)
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Part revision (user-specified)
   *
   * @return Part revision (user-specified)
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Deterministic part ID
   *
   * @return Deterministic part ID
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Document microversion ID
   *
   * @return Document microversion ID
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Part appearance info
   *
   * @return Part appearance info
   *
   */
  public final PartStudiosGetMetadataResponsePartsAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Custom part properties, if any
   *
   * @return Custom part properties, if any
   *
   */
  public final PartStudiosGetMetadataResponsePartsCustomProperties getCustomProperties() {
    return this.customProperties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
