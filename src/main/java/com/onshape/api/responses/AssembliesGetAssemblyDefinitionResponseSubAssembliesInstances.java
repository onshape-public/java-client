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
 * Object used in calls to getAssemblyDefinition API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetAssemblyDefinitionResponseSubAssembliesInstances {
  /**
   * Instance ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * Part/feature/assembly name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Instance type. Current valid values are Part, Assembly, Feature. Other values may be added in the future. Note that &quot;Part&quot; may mean a reference to a surface or a solid and that &quot;Feature&quot; currently means a reference to a Sketch, but support for other feature types may be added in the future. For Part, a specific bodyType is included in the parts information and for Feature, a specific featureType is included in the partStudioFeatures information.
   */
  @JsonProperty("type")
  public String type;

  /**
   * Instance suppressed or not
   */
  @JsonProperty("suppressed")
  public Boolean suppressed;

  /**
   * Document ID for the document containing the included instance
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Microversion ID of document containing the included instance
   */
  @JsonProperty("documentMicroversion")
  public String documentMicroversion;

  /**
   * Version ID of document containing the included instance, if reached through one or more version references
   */
  @JsonProperty("documentVersion")
  public String documentVersion;

  /**
   * Element ID of the part/assembly instance
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Deterministic part ID if type is Part. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * If type is Part this field indicates whether the part is Standard Content.
   */
  @JsonProperty("isStandardContent")
  public Boolean isStandardContent;

  /**
   * Configuration of the Part studio element if the instance references a Part studio.
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Get Instance ID
   *
   * @return Instance ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Part/feature/assembly name
   *
   * @return Part/feature/assembly name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Instance type. Current valid values are Part, Assembly, Feature. Other values may be added in the future. Note that &quot;Part&quot; may mean a reference to a surface or a solid and that &quot;Feature&quot; currently means a reference to a Sketch, but support for other feature types may be added in the future. For Part, a specific bodyType is included in the parts information and for Feature, a specific featureType is included in the partStudioFeatures information.
   *
   * @return Instance type. Current valid values are Part, Assembly, Feature. Other values may be added in the future. Note that &quot;Part&quot; may mean a reference to a surface or a solid and that &quot;Feature&quot; currently means a reference to a Sketch, but support for other feature types may be added in the future. For Part, a specific bodyType is included in the parts information and for Feature, a specific featureType is included in the partStudioFeatures information.
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Instance suppressed or not
   *
   * @return Instance suppressed or not
   *
   */
  public final Boolean getSuppressed() {
    return this.suppressed;
  }

  /**
   * Get Document ID for the document containing the included instance
   *
   * @return Document ID for the document containing the included instance
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Microversion ID of document containing the included instance
   *
   * @return Microversion ID of document containing the included instance
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
  }

  /**
   * Get Version ID of document containing the included instance, if reached through one or more version references
   *
   * @return Version ID of document containing the included instance, if reached through one or more version references
   *
   */
  public final String getDocumentVersion() {
    return this.documentVersion;
  }

  /**
   * Get Element ID of the part/assembly instance
   *
   * @return Element ID of the part/assembly instance
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Deterministic part ID if type is Part. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   *
   * @return Deterministic part ID if type is Part. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get If type is Part this field indicates whether the part is Standard Content.
   *
   * @return If type is Part this field indicates whether the part is Standard Content.
   *
   */
  public final Boolean getIsStandardContent() {
    return this.isStandardContent;
  }

  /**
   * Get Configuration of the Part studio element if the instance references a Part studio.
   *
   * @return Configuration of the Part studio element if the instance references a Part studio.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
