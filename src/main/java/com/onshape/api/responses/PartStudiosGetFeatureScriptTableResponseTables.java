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
 * Object used in calls to getFeatureScriptTable API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetFeatureScriptTableResponseTables extends AbstractResponseObject {
  /**
   * The id of the table
   */
  @JsonProperty("id")
  public String id;

  /**
   * The title of the table
   */
  @JsonProperty("title")
  public String title;

  /**
   * Topology ids of entities associated with the table
   */
  @JsonProperty("entityIds")
  public String[] entityIds;

  /**
   * Column definitions for the table
   */
  @JsonProperty("columns")
  public PartStudiosGetFeatureScriptTableResponseTablesColumns[] columns;

  /**
   * The rows of the table
   */
  @JsonProperty("rows")
  public PartStudiosGetFeatureScriptTableResponseTablesRows[] rows;

  /**
   * Get The id of the table
   *
   * @return The id of the table
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get The title of the table
   *
   * @return The title of the table
   *
   */
  public final String getTitle() {
    return this.title;
  }

  /**
   * Get Topology ids of entities associated with the table
   *
   * @return Topology ids of entities associated with the table
   *
   */
  public final String[] getEntityIds() {
    return this.entityIds;
  }

  /**
   * Get Column definitions for the table
   *
   * @return Column definitions for the table
   *
   */
  public final PartStudiosGetFeatureScriptTableResponseTablesColumns[] getColumns() {
    return this.columns;
  }

  /**
   * Get The rows of the table
   *
   * @return The rows of the table
   *
   */
  public final PartStudiosGetFeatureScriptTableResponseTablesRows[] getRows() {
    return this.rows;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
