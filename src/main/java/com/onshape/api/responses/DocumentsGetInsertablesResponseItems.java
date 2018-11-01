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
import java.util.Map;

/**
 * Object used in calls to getInsertables API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetInsertablesResponseItems {
  /**
   * Insertable ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * The type of insertable
   */
  @JsonProperty("classType")
  public Number classType;

  /**
   * Document ID
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Version ID
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Version name
   */
  @JsonProperty("versionName")
  public String versionName;

  /**
   * Insertable parent
   */
  @JsonProperty("parentId")
  public String parentId;

  /**
   * Element ID
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Element name
   */
  @JsonProperty("elementName")
  public String elementName;

  /**
   * Element type
   */
  @JsonProperty("elementType")
  public String elementType;

  /**
   * Data type
   */
  @JsonProperty("dataType")
  public String dataType;

  /**
   * Insertable query
   */
  @JsonProperty("insertableQuery")
  public String insertableQuery;

  /**
   * Feature ID
   */
  @JsonProperty("featureId")
  public String featureId;

  /**
   * Feature name
   */
  @JsonProperty("featureName")
  public String featureName;

  /**
   * Feature type
   */
  @JsonProperty("featureType")
  public String featureType;

  /**
   * Part name
   */
  @JsonProperty("partName")
  public String partName;

  /**
   * Part deteministic ID
   */
  @JsonProperty("deterministicId")
  public String deterministicId;

  /**
   * Body type
   */
  @JsonProperty("bodyType")
  public String bodyType;

  /**
   * Thumbnail URI
   */
  @JsonProperty("thumbnailUri")
  public String thumbnailUri;

  /**
   * Feature spec (for internal use)
   */
  @JsonProperty("featureSpec")
  public Map featureSpec;

  /**
   * Get Insertable ID
   *
   * @return Insertable ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get The type of insertable
   *
   * @return The type of insertable
   *
   */
  public final Number getClassType() {
    return this.classType;
  }

  /**
   * Get Document ID
   *
   * @return Document ID
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Version ID
   *
   * @return Version ID
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Version name
   *
   * @return Version name
   *
   */
  public final String getVersionName() {
    return this.versionName;
  }

  /**
   * Get Insertable parent
   *
   * @return Insertable parent
   *
   */
  public final String getParentId() {
    return this.parentId;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Element name
   *
   * @return Element name
   *
   */
  public final String getElementName() {
    return this.elementName;
  }

  /**
   * Get Element type
   *
   * @return Element type
   *
   */
  public final String getElementType() {
    return this.elementType;
  }

  /**
   * Get Data type
   *
   * @return Data type
   *
   */
  public final String getDataType() {
    return this.dataType;
  }

  /**
   * Get Insertable query
   *
   * @return Insertable query
   *
   */
  public final String getInsertableQuery() {
    return this.insertableQuery;
  }

  /**
   * Get Feature ID
   *
   * @return Feature ID
   *
   */
  public final String getFeatureId() {
    return this.featureId;
  }

  /**
   * Get Feature name
   *
   * @return Feature name
   *
   */
  public final String getFeatureName() {
    return this.featureName;
  }

  /**
   * Get Feature type
   *
   * @return Feature type
   *
   */
  public final String getFeatureType() {
    return this.featureType;
  }

  /**
   * Get Part name
   *
   * @return Part name
   *
   */
  public final String getPartName() {
    return this.partName;
  }

  /**
   * Get Part deteministic ID
   *
   * @return Part deteministic ID
   *
   */
  public final String getDeterministicId() {
    return this.deterministicId;
  }

  /**
   * Get Body type
   *
   * @return Body type
   *
   */
  public final String getBodyType() {
    return this.bodyType;
  }

  /**
   * Get Thumbnail URI
   *
   * @return Thumbnail URI
   *
   */
  public final String getThumbnailUri() {
    return this.thumbnailUri;
  }

  /**
   * Get Feature spec (for internal use)
   *
   * @return Feature spec (for internal use)
   *
   */
  public final Map getFeatureSpec() {
    return this.featureSpec;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
