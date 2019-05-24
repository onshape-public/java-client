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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getAssemblyDefinition API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetAssemblyDefinitionResponsePartStudioFeatures {
  /**
   * Document ID of the document containing the referenced feature
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Document microversion ID of the document containing the referenced feature
   */
  @JsonProperty("documentMicroversion")
  public String documentMicroversion;

  /**
   * Version ID of document containing the referenced feature, if reached through one or more version references
   */
  @JsonProperty("documentVersion")
  public String documentVersion;

  /**
   * Element ID of part studio containing the feature
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * The ID of the feature
   */
  @JsonProperty("featureId")
  public String featureId;

  /**
   * The type of the feature (e.g. sketch)
   */
  @JsonProperty("featureType")
  public String featureType;

  /**
   * Get Document ID of the document containing the referenced feature
   *
   * @return Document ID of the document containing the referenced feature
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Document microversion ID of the document containing the referenced feature
   *
   * @return Document microversion ID of the document containing the referenced feature
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
  }

  /**
   * Get Version ID of document containing the referenced feature, if reached through one or more version references
   *
   * @return Version ID of document containing the referenced feature, if reached through one or more version references
   *
   */
  public final String getDocumentVersion() {
    return this.documentVersion;
  }

  /**
   * Get Element ID of part studio containing the feature
   *
   * @return Element ID of part studio containing the feature
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The ID of the feature
   *
   * @return The ID of the feature
   *
   */
  public final String getFeatureId() {
    return this.featureId;
  }

  /**
   * Get The type of the feature (e.g. sketch)
   *
   * @return The type of the feature (e.g. sketch)
   *
   */
  public final String getFeatureType() {
    return this.featureType;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, documentVersion, documentMicroversion, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
