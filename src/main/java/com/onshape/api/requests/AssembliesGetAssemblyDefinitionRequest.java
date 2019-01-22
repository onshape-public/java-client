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
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.AssembliesGetAssemblyDefinitionResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getAssemblyDefinition API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesGetAssemblyDefinitionRequest {
  /**
   * Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
   */
  @JsonProperty("includeMateFeatures")
  Boolean includeMateFeatures;

  /**
   * Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
   */
  @JsonProperty("includeNonSolids")
  Boolean includeNonSolids;

  /**
   * Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
   */
  @JsonProperty("includeMateConnectors")
  Boolean includeMateConnectors;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AssembliesGetAssemblyDefinitionRequest(Boolean includeMateFeatures, Boolean includeNonSolids,
      Boolean includeMateConnectors, String configuration, String linkDocumentId) {
    this.includeMateFeatures = includeMateFeatures;
    this.includeNonSolids = includeNonSolids;
    this.includeMateConnectors = includeMateConnectors;
    this.configuration = configuration;
    this.linkDocumentId = linkDocumentId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
     */
    private Boolean includeMateFeatures;

    /**
     * Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
     */
    private Boolean includeNonSolids;

    /**
     * Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
     */
    private Boolean includeMateConnectors;

    /**
     * Configuration string
     */
    private String configuration;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
     *
     * @return Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
     *
     */
    public final Boolean includeMateFeatures() {
      return this.includeMateFeatures;
    }

    /**
     * Set Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
     *
     * @param value Whether or not to include mate features in response (adds a &quot;features&quot; array to response)
     *
     * @return the Builder object.
     */
    public final Builder includeMateFeatures(Boolean value) {
      this.includeMateFeatures = value;
      return this;
    }

    /**
     * Get Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
     *
     * @return Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
     *
     */
    public final Boolean includeNonSolids() {
      return this.includeNonSolids;
    }

    /**
     * Set Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
     *
     * @param value Whether or not to include non-assembly occurrences/instances that are not parts, such as surfaces and sketches. When omitted or set to false, surfaces and sketches are omitted from the output, as though they are not part of the assembly definition.
     *
     * @return the Builder object.
     */
    public final Builder includeNonSolids(Boolean value) {
      this.includeNonSolids = value;
      return this;
    }

    /**
     * Get Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
     *
     * @return Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
     *
     */
    public final Boolean includeMateConnectors() {
      return this.includeMateConnectors;
    }

    /**
     * Set Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
     *
     * @param value Whether or not to include mate connectors of assembly and parts when includeMateFeatures is also true (adds a &quot;mateConnectors&quot; array in each part and includes mate connectors in assembly &quot;features&quot; array).
     *
     * @return the Builder object.
     */
    public final Builder includeMateConnectors(Boolean value) {
      this.includeMateConnectors = value;
      return this;
    }

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private AssembliesGetAssemblyDefinitionRequest build() {
      return new com.onshape.api.requests.AssembliesGetAssemblyDefinitionRequest(includeMateFeatures,includeNonSolids,includeMateConnectors,configuration,linkDocumentId);
    }

    /**
     * Calls getAssemblyDefinition method, Get information about an Assembly. All coordinates and translation matrix components are in
     *                 meters.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final AssembliesGetAssemblyDefinitionResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("includeMateFeatures", includeMateFeatures, "includeNonSolids", includeNonSolids, "includeMateConnectors", includeMateConnectors, "configuration", configuration, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AssembliesGetAssemblyDefinitionResponse.class);
    }

    /**
     * Calls getAssemblyDefinition method, Get information about an Assembly. All coordinates and translation matrix components are in
     *                 meters.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesGetAssemblyDefinitionResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesGetAssemblyDefinitionResponse.class);
    }
  }
}
