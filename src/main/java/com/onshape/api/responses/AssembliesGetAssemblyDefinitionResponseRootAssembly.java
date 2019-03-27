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
public final class AssembliesGetAssemblyDefinitionResponseRootAssembly {
  /**
   * Document ID
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Document microversion ID
   */
  @JsonProperty("documentMicroversion")
  public String documentMicroversion;

  /**
   * Element ID
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Assembly occurrences
   */
  @JsonProperty("occurrences")
  public AssembliesGetAssemblyDefinitionResponseRootAssemblyOccurrences[] occurrences;

  /**
   * Direct child parts and sub-assemblies of the assembly.
   */
  @JsonProperty("instances")
  public AssembliesGetAssemblyDefinitionResponseRootAssemblyInstances[] instances;

  /**
   * Array of mate features
   */
  @JsonProperty("features")
  public AssembliesGetAssemblyDefinitionResponseRootAssemblyFeatures[] features;

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
   * Get Document microversion ID
   *
   * @return Document microversion ID
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
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
   * Get Assembly occurrences
   *
   * @return Assembly occurrences
   *
   */
  public final AssembliesGetAssemblyDefinitionResponseRootAssemblyOccurrences[] getOccurrences() {
    return this.occurrences;
  }

  /**
   * Get Direct child parts and sub-assemblies of the assembly.
   *
   * @return Direct child parts and sub-assemblies of the assembly.
   *
   */
  public final AssembliesGetAssemblyDefinitionResponseRootAssemblyInstances[] getInstances() {
    return this.instances;
  }

  /**
   * Get Array of mate features
   *
   * @return Array of mate features
   *
   */
  public final AssembliesGetAssemblyDefinitionResponseRootAssemblyFeatures[] getFeatures() {
    return this.features;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, documentMicroversion, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
