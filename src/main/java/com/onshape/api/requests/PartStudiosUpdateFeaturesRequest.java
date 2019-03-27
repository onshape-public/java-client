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
import com.onshape.api.responses.PartStudiosUpdateFeaturesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateFeatures API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosUpdateFeaturesRequest {
  /**
   * If true, suppression attributes of the feature (suppress, suppressionState) will be updated
   */
  @JsonProperty("updateSuppressionAttributes")
  @NotNull
  Boolean updateSuppressionAttributes;

  /**
   * A list of features containing updates to apply
   */
  @JsonProperty("features")
  @NotNull
  Map[] features;

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

  PartStudiosUpdateFeaturesRequest(Boolean updateSuppressionAttributes, Map[] features,
      String serializationVersion, String sourceMicroversion, Boolean rejectMicroversionSkew) {
    this.updateSuppressionAttributes = updateSuppressionAttributes;
    this.features = features;
    this.serializationVersion = serializationVersion;
    this.sourceMicroversion = sourceMicroversion;
    this.rejectMicroversionSkew = rejectMicroversionSkew;
  }

  /**
   * Get If true, suppression attributes of the feature (suppress, suppressionState) will be updated
   *
   * @return If true, suppression attributes of the feature (suppress, suppressionState) will be updated
   *
   */
  public final Boolean getUpdateSuppressionAttributes() {
    return this.updateSuppressionAttributes;
  }

  /**
   * Get A list of features containing updates to apply
   *
   * @return A list of features containing updates to apply
   *
   */
  public final Map[] getFeatures() {
    return this.features;
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
     * If true, suppression attributes of the feature (suppress, suppressionState) will be updated
     */
    private Boolean updateSuppressionAttributes;

    /**
     * A list of features containing updates to apply
     */
    private Map[] features;

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
     * Get If true, suppression attributes of the feature (suppress, suppressionState) will be updated
     *
     * @return If true, suppression attributes of the feature (suppress, suppressionState) will be updated
     *
     */
    public final Boolean updateSuppressionAttributes() {
      return this.updateSuppressionAttributes;
    }

    /**
     * Set If true, suppression attributes of the feature (suppress, suppressionState) will be updated
     *
     * @param value If true, suppression attributes of the feature (suppress, suppressionState) will be updated
     *
     * @return the Builder object.
     */
    public final Builder updateSuppressionAttributes(Boolean value) {
      this.updateSuppressionAttributes = value;
      return this;
    }

    /**
     * Get A list of features containing updates to apply
     *
     * @return A list of features containing updates to apply
     *
     */
    public final Map[] features() {
      return this.features;
    }

    /**
     * Set A list of features containing updates to apply
     *
     * @param value A list of features containing updates to apply
     *
     * @return the Builder object.
     */
    public final Builder features(Map[] value) {
      this.features = value;
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

    private PartStudiosUpdateFeaturesRequest build() {
      return new com.onshape.api.requests.PartStudiosUpdateFeaturesRequest(updateSuppressionAttributes,features,serializationVersion,sourceMicroversion,rejectMicroversionSkew);
    }

    /**
     * Calls updateFeatures method, Update parameters of existing features in the feature list for a part studio. Multiple features
     *                 may be updated simultaneously with a single call, allowing for faster regeneration. Only the
     *                 parameters that are present in the passed features are updated. Existing parameters that are
     *                 not included in the passed feature are left untouched. In addition, if the field
     *                 updateSuppressionAttributes is set to true, the suppress and suppressionState values for the
     *                 updated features are set from the passed feature objects. See the developer portal feature list
     *                 help topic for additional information
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final PartStudiosUpdateFeaturesResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/w/:wid/e/:eid/features/updates", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.PartStudiosUpdateFeaturesResponse.class);
    }

    /**
     * Calls updateFeatures method, Update parameters of existing features in the feature list for a part studio. Multiple features
     *                 may be updated simultaneously with a single call, allowing for faster regeneration. Only the
     *                 parameters that are present in the passed features are updated. Existing parameters that are
     *                 not included in the passed feature are left untouched. In addition, if the field
     *                 updateSuppressionAttributes is set to true, the suppress and suppressionState values for the
     *                 updated features are set from the passed feature objects. See the developer portal feature list
     *                 help topic for additional information
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosUpdateFeaturesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/w/:wid/e/:eid/features/updates", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.PartStudiosUpdateFeaturesResponse.class);
    }
  }
}
