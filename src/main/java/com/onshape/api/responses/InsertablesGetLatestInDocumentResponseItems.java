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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getLatestInDocument API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class InsertablesGetLatestInDocumentResponseItems {
  /**
   * class type.
   */
  @JsonProperty("classType")
  public Number classType;

  /**
   * document id.
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * version id.
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * version name.
   */
  @JsonProperty("versionName")
  public String versionName;

  /**
   * parent id.
   */
  @JsonProperty("parentId")
  public String parentId;

  /**
   * element id.
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * microversion id.
   */
  @JsonProperty("microversionId")
  public String microversionId;

  /**
   * element name.
   */
  @JsonProperty("elementName")
  public String elementName;

  /**
   * element type.
   */
  @JsonProperty("elementType")
  public String elementType;

  /**
   * data type.
   */
  @JsonProperty("dataType")
  public String dataType;

  /**
   * insertable query.
   */
  @JsonProperty("insertableQuery")
  public String insertableQuery;

  /**
   * feature id.
   */
  @JsonProperty("featureId")
  public String featureId;

  /**
   * feature name.
   */
  @JsonProperty("featureName")
  public String featureName;

  /**
   * feature type.
   */
  @JsonProperty("featureType")
  public String featureType;

  /**
   * part name.
   */
  @JsonProperty("partName")
  public String partName;

  /**
   * deterministic id.
   */
  @JsonProperty("deterministicId")
  public String deterministicId;

  /**
   * body type.
   */
  @JsonProperty("bodyType")
  public String bodyType;

  /**
   * feature spec.
   */
  @JsonProperty("featureSpec")
  public String featureSpec;

  /**
   * configuration parameters.
   */
  @JsonProperty("configurationParameters")
  public String configurationParameters;

  /**
   * configuration.
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * is mesh.
   */
  @JsonProperty("isMesh")
  public Boolean isMesh;

  /**
   * is flattened body.
   */
  @JsonProperty("isFlattenedBody")
  public Boolean isFlattenedBody;

  /**
   * unflattened part deterministic id.
   */
  @JsonProperty("unflattenedPartDeterministicId")
  public String unflattenedPartDeterministicId;

  /**
   * has faults.
   */
  @JsonProperty("hasFaults")
  public Boolean hasFaults;

  /**
   * configuration parameter values.
   */
  @JsonProperty("configurationParameterValues")
  public String configurationParameterValues;

  /**
   * Get class type.
   *
   * @return class type.
   *
   */
  public final Number getClassType() {
    return this.classType;
  }

  /**
   * Get document id.
   *
   * @return document id.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get version id.
   *
   * @return version id.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get version name.
   *
   * @return version name.
   *
   */
  public final String getVersionName() {
    return this.versionName;
  }

  /**
   * Get parent id.
   *
   * @return parent id.
   *
   */
  public final String getParentId() {
    return this.parentId;
  }

  /**
   * Get element id.
   *
   * @return element id.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get microversion id.
   *
   * @return microversion id.
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get element name.
   *
   * @return element name.
   *
   */
  public final String getElementName() {
    return this.elementName;
  }

  /**
   * Get element type.
   *
   * @return element type.
   *
   */
  public final String getElementType() {
    return this.elementType;
  }

  /**
   * Get data type.
   *
   * @return data type.
   *
   */
  public final String getDataType() {
    return this.dataType;
  }

  /**
   * Get insertable query.
   *
   * @return insertable query.
   *
   */
  public final String getInsertableQuery() {
    return this.insertableQuery;
  }

  /**
   * Get feature id.
   *
   * @return feature id.
   *
   */
  public final String getFeatureId() {
    return this.featureId;
  }

  /**
   * Get feature name.
   *
   * @return feature name.
   *
   */
  public final String getFeatureName() {
    return this.featureName;
  }

  /**
   * Get feature type.
   *
   * @return feature type.
   *
   */
  public final String getFeatureType() {
    return this.featureType;
  }

  /**
   * Get part name.
   *
   * @return part name.
   *
   */
  public final String getPartName() {
    return this.partName;
  }

  /**
   * Get deterministic id.
   *
   * @return deterministic id.
   *
   */
  public final String getDeterministicId() {
    return this.deterministicId;
  }

  /**
   * Get body type.
   *
   * @return body type.
   *
   */
  public final String getBodyType() {
    return this.bodyType;
  }

  /**
   * Get feature spec.
   *
   * @return feature spec.
   *
   */
  public final String getFeatureSpec() {
    return this.featureSpec;
  }

  /**
   * Get configuration parameters.
   *
   * @return configuration parameters.
   *
   */
  public final String getConfigurationParameters() {
    return this.configurationParameters;
  }

  /**
   * Get configuration.
   *
   * @return configuration.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get is mesh.
   *
   * @return is mesh.
   *
   */
  public final Boolean getIsMesh() {
    return this.isMesh;
  }

  /**
   * Get is flattened body.
   *
   * @return is flattened body.
   *
   */
  public final Boolean getIsFlattenedBody() {
    return this.isFlattenedBody;
  }

  /**
   * Get unflattened part deterministic id.
   *
   * @return unflattened part deterministic id.
   *
   */
  public final String getUnflattenedPartDeterministicId() {
    return this.unflattenedPartDeterministicId;
  }

  /**
   * Get has faults.
   *
   * @return has faults.
   *
   */
  public final Boolean getHasFaults() {
    return this.hasFaults;
  }

  /**
   * Get configuration parameter values.
   *
   * @return configuration parameter values.
   *
   */
  public final String getConfigurationParameterValues() {
    return this.configurationParameterValues;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
