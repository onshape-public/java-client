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
 * Object used in calls to copyAssociativeData API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppAssociativeDataCopyAssociativeDataResponseItems extends AbstractResponseObject {
  /**
   * association type (MODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY|MODEL_DEFINITION_TOPOLOGY)
   */
  @JsonProperty("type")
  public String type;

  /**
   * the id of the association
   */
  @JsonProperty("associativeDataId")
  public String associativeDataId;

  /**
   * element id of the association target
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * occurrence id in the assembly context
   */
  @JsonProperty("occurrenceId")
  public String occurrenceId;

  /**
   * deterministicId, featureId, or entityId depending on association type
   */
  @JsonProperty("idTag")
  public String idTag;

  /**
   * array of name value pairs data
   */
  @JsonProperty("data")
  public AppAssociativeDataCopyAssociativeDataResponseItemsData[] data;

  /**
   * Get association type (MODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY|MODEL_DEFINITION_TOPOLOGY)
   *
   * @return association type (MODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY|MODEL_DEFINITION_TOPOLOGY)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get the id of the association
   *
   * @return the id of the association
   *
   */
  public final String getAssociativeDataId() {
    return this.associativeDataId;
  }

  /**
   * Get element id of the association target
   *
   * @return element id of the association target
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get occurrence id in the assembly context
   *
   * @return occurrence id in the assembly context
   *
   */
  public final String getOccurrenceId() {
    return this.occurrenceId;
  }

  /**
   * Get deterministicId, featureId, or entityId depending on association type
   *
   * @return deterministicId, featureId, or entityId depending on association type
   *
   */
  public final String getIdTag() {
    return this.idTag;
  }

  /**
   * Get array of name value pairs data
   *
   * @return array of name value pairs data
   *
   */
  public final AppAssociativeDataCopyAssociativeDataResponseItemsData[] getData() {
    return this.data;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
