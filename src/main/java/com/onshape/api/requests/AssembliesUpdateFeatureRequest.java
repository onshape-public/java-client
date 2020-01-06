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
import com.onshape.api.responses.AssembliesUpdateFeatureResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateFeature API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesUpdateFeatureRequest {
  /**
   * The feature to add
   */
  @JsonProperty("feature")
  @NotNull
  AssembliesUpdateFeatureRequestFeature feature;

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

  AssembliesUpdateFeatureRequest(AssembliesUpdateFeatureRequestFeature feature,
      String serializationVersion, String sourceMicroversion, Boolean rejectMicroversionSkew) {
    this.feature = feature;
    this.serializationVersion = serializationVersion;
    this.sourceMicroversion = sourceMicroversion;
    this.rejectMicroversionSkew = rejectMicroversionSkew;
  }

  /**
   * Get The feature to add
   *
   * @return The feature to add
   *
   */
  public final AssembliesUpdateFeatureRequestFeature getFeature() {
    return this.feature;
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
     * The feature to add
     */
    private AssembliesUpdateFeatureRequestFeature feature;

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

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The feature to add
     *
     * @return The feature to add
     *
     */
    public final AssembliesUpdateFeatureRequestFeature feature() {
      return this.feature;
    }

    /**
     * Set The feature to add
     *
     * @param value The feature to add
     *
     * @return the Builder object.
     */
    public final Builder feature(AssembliesUpdateFeatureRequestFeature value) {
      this.feature = value;
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

    private AssembliesUpdateFeatureRequest build() {
      return new com.onshape.api.requests.AssembliesUpdateFeatureRequest(feature,serializationVersion,sourceMicroversion,rejectMicroversionSkew);
    }

    /**
     * Calls updateFeature method, Update an existing feature in the feature list for an assembly
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid The id of the feature being updated. This id should be URL encoded and must match the featureId found in the serialized structure
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AssembliesUpdateFeatureResponse call(String fid, String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/features/featureid/:fid", build(), onshape.buildMap("fid", fid, "did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AssembliesUpdateFeatureResponse.class);
    }

    /**
     * Calls updateFeature method, Update an existing feature in the feature list for an assembly
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid The id of the feature being updated. This id should be URL encoded and must match the featureId found in the serialized structure
     */
    public final AssembliesUpdateFeatureResponse call(OnshapeDocument document, String fid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/features/featureid/:fid", build(), onshape.buildMap("fid", fid, "did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesUpdateFeatureResponse.class);
    }
  }
}
