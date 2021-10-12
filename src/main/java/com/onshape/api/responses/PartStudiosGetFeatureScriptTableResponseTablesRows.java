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
 * Object used in calls to getFeatureScriptTable API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetFeatureScriptTableResponseTablesRows extends AbstractResponseObject {
  /**
   * A map from column ids to cell values for the row
   */
  @JsonProperty("columnIdToValue")
  public Map columnIdToValue;

  /**
   * Topology ids of entities associated with the row
   */
  @JsonProperty("entityIds")
  public String[] entityIds;

  /**
   * A callout that could be attached to the associated entities
   */
  @JsonProperty("callout")
  public String callout;

  /**
   * Get A map from column ids to cell values for the row
   *
   * @return A map from column ids to cell values for the row
   *
   */
  public final Map getColumnIdToValue() {
    return this.columnIdToValue;
  }

  /**
   * Get Topology ids of entities associated with the row
   *
   * @return Topology ids of entities associated with the row
   *
   */
  public final String[] getEntityIds() {
    return this.entityIds;
  }

  /**
   * Get A callout that could be attached to the associated entities
   *
   * @return A callout that could be attached to the associated entities
   *
   */
  public final String getCallout() {
    return this.callout;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
