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
import com.onshape.api.responses.PartStudiosEvalFeatureScriptResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for evalFeatureScript API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosEvalFeatureScriptRequest {
  /**
   * A Feature Script function to execute.
   */
  @JsonProperty("script")
  @NotNull
  String script;

  /**
   * Array of Feature Script identifier to geometry id list
   */
  @JsonProperty("queries")
  @NotNull
  PartStudiosEvalFeatureScriptRequestQueries[] queries;

  /**
   * The version of the serialization protocol for features
   */
  @JsonProperty("serializationVersion")
  @NotNull
  String serializationVersion;

  /**
   * The document microversion from which the features were extracted
   */
  @JsonProperty("sourceMicroversion")
  @NotNull
  String sourceMicroversion;

  /**
   * If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
   */
  @JsonProperty("rejectMicroversionSkew")
  Boolean rejectMicroversionSkew;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  PartStudiosEvalFeatureScriptRequest(String script,
      PartStudiosEvalFeatureScriptRequestQueries[] queries, String serializationVersion,
      String sourceMicroversion, Boolean rejectMicroversionSkew, String configuration) {
    this.script = script;
    this.queries = queries;
    this.serializationVersion = serializationVersion;
    this.sourceMicroversion = sourceMicroversion;
    this.rejectMicroversionSkew = rejectMicroversionSkew;
    this.configuration = configuration;
  }

  /**
   * Get A Feature Script function to execute.
   *
   * @return A Feature Script function to execute.
   *
   */
  public final String getScript() {
    return this.script;
  }

  /**
   * Get Array of Feature Script identifier to geometry id list
   *
   * @return Array of Feature Script identifier to geometry id list
   *
   */
  public final PartStudiosEvalFeatureScriptRequestQueries[] getQueries() {
    return this.queries;
  }

  /**
   * Get The version of the serialization protocol for features
   *
   * @return The version of the serialization protocol for features
   *
   */
  public final String getSerializationVersion() {
    return this.serializationVersion;
  }

  /**
   * Get The document microversion from which the features were extracted
   *
   * @return The document microversion from which the features were extracted
   *
   */
  public final String getSourceMicroversion() {
    return this.sourceMicroversion;
  }

  /**
   * Get If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
   *
   * @return If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
   *
   */
  public final Boolean getRejectMicroversionSkew() {
    return this.rejectMicroversionSkew;
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
     * A Feature Script function to execute.
     */
    private String script;

    /**
     * Array of Feature Script identifier to geometry id list
     */
    private PartStudiosEvalFeatureScriptRequestQueries[] queries;

    /**
     * The version of the serialization protocol for features
     */
    private String serializationVersion;

    /**
     * The document microversion from which the features were extracted
     */
    private String sourceMicroversion;

    /**
     * If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
     */
    private Boolean rejectMicroversionSkew;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get A Feature Script function to execute.
     *
     * @return A Feature Script function to execute.
     *
     */
    public final String script() {
      return this.script;
    }

    /**
     * Set A Feature Script function to execute.
     *
     * @param value A Feature Script function to execute.
     *
     * @return the Builder object.
     */
    public final Builder script(String value) {
      this.script = value;
      return this;
    }

    /**
     * Get Array of Feature Script identifier to geometry id list
     *
     * @return Array of Feature Script identifier to geometry id list
     *
     */
    public final PartStudiosEvalFeatureScriptRequestQueries[] queries() {
      return this.queries;
    }

    /**
     * Set Array of Feature Script identifier to geometry id list
     *
     * @param value Array of Feature Script identifier to geometry id list
     *
     * @return the Builder object.
     */
    public final Builder queries(PartStudiosEvalFeatureScriptRequestQueries[] value) {
      this.queries = value;
      return this;
    }

    /**
     * Get The version of the serialization protocol for features
     *
     * @return The version of the serialization protocol for features
     *
     */
    public final String serializationVersion() {
      return this.serializationVersion;
    }

    /**
     * Set The version of the serialization protocol for features
     *
     * @param value The version of the serialization protocol for features
     *
     * @return the Builder object.
     */
    public final Builder serializationVersion(String value) {
      this.serializationVersion = value;
      return this;
    }

    /**
     * Get The document microversion from which the features were extracted
     *
     * @return The document microversion from which the features were extracted
     *
     */
    public final String sourceMicroversion() {
      return this.sourceMicroversion;
    }

    /**
     * Set The document microversion from which the features were extracted
     *
     * @param value The document microversion from which the features were extracted
     *
     * @return the Builder object.
     */
    public final Builder sourceMicroversion(String value) {
      this.sourceMicroversion = value;
      return this;
    }

    /**
     * Get If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
     *
     * @return If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
     *
     */
    public final Boolean rejectMicroversionSkew() {
      return this.rejectMicroversionSkew;
    }

    /**
     * Set If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
     *
     * @param value If set to true and the element has changed since sourceMicroversion, return an HTTP Conflict status.
     *
     * @return the Builder object.
     */
    public final Builder rejectMicroversionSkew(Boolean value) {
      this.rejectMicroversionSkew = value;
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

    private PartStudiosEvalFeatureScriptRequest build() {
      return new com.onshape.api.requests.PartStudiosEvalFeatureScriptRequest(script,queries,serializationVersion,sourceMicroversion,rejectMicroversionSkew,configuration);
    }

    /**
     * Calls evalFeatureScript method, Evaluate featurescript in the context of a part studio. See the developer portal feature list
     *                 help topic for additional information
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
    public final PartStudiosEvalFeatureScriptResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/featurescript", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("configuration", configuration), com.onshape.api.responses.PartStudiosEvalFeatureScriptResponse.class);
    }

    /**
     * Calls evalFeatureScript method, Evaluate featurescript in the context of a part studio. See the developer portal feature list
     *                 help topic for additional information
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosEvalFeatureScriptResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/featurescript", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("configuration", configuration), com.onshape.api.responses.PartStudiosEvalFeatureScriptResponse.class);
    }
  }
}
