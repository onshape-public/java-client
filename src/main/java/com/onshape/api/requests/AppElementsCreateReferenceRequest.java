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
import com.onshape.api.responses.AppElementsCreateReferenceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createReference API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCreateReferenceRequest {
  /**
   * Id of the transaction in which the reference creation should occur
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * Id of the prior change to the application element
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  /**
   * The Id of the document of the element that is or contains the target of the reference
   */
  @JsonProperty("targetDocumentId")
  String targetDocumentId;

  /**
   * The Id of the version the document that contains the target of the reference
   */
  @JsonProperty("targetVersionId")
  String targetVersionId;

  /**
   * The element Id of the element that is or contains the target of the reference
   */
  @JsonProperty("targetElementId")
  @NotNull
  String targetElementId;

  /**
   * An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
   */
  @JsonProperty("targetMicroversionId")
  @NotNull
  String targetMicroversionId;

  /**
   * An optional deterministic id within the target element that should be tracked
   */
  @JsonProperty("idTag")
  String idTag;

  /**
   * If idTag is specified, the document microversion associated with the idTag
   */
  @JsonProperty("idTagMicroversionId")
  String idTagMicroversionId;

  /**
   * If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
   */
  @JsonProperty("targetConfiguration")
  String targetConfiguration;

  /**
   * An optional sketch feature id within the target element that should be tracked
   */
  @JsonProperty("sketchId")
  String sketchId;

  AppElementsCreateReferenceRequest(String transactionId, String parentChangeId,
      String targetDocumentId, String targetVersionId, String targetElementId,
      String targetMicroversionId, String idTag, String idTagMicroversionId,
      String targetConfiguration, String sketchId) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.targetDocumentId = targetDocumentId;
    this.targetVersionId = targetVersionId;
    this.targetElementId = targetElementId;
    this.targetMicroversionId = targetMicroversionId;
    this.idTag = idTag;
    this.idTagMicroversionId = idTagMicroversionId;
    this.targetConfiguration = targetConfiguration;
    this.sketchId = sketchId;
  }

  /**
   * Get Id of the transaction in which the reference creation should occur
   *
   * @return Id of the transaction in which the reference creation should occur
   *
   */
  public final String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Get Id of the prior change to the application element
   *
   * @return Id of the prior change to the application element
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get The Id of the document of the element that is or contains the target of the reference
   *
   * @return The Id of the document of the element that is or contains the target of the reference
   *
   */
  public final String getTargetDocumentId() {
    return this.targetDocumentId;
  }

  /**
   * Get The Id of the version the document that contains the target of the reference
   *
   * @return The Id of the version the document that contains the target of the reference
   *
   */
  public final String getTargetVersionId() {
    return this.targetVersionId;
  }

  /**
   * Get The element Id of the element that is or contains the target of the reference
   *
   * @return The element Id of the element that is or contains the target of the reference
   *
   */
  public final String getTargetElementId() {
    return this.targetElementId;
  }

  /**
   * Get An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
   *
   * @return An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
   *
   */
  public final String getTargetMicroversionId() {
    return this.targetMicroversionId;
  }

  /**
   * Get An optional deterministic id within the target element that should be tracked
   *
   * @return An optional deterministic id within the target element that should be tracked
   *
   */
  public final String getIdTag() {
    return this.idTag;
  }

  /**
   * Get If idTag is specified, the document microversion associated with the idTag
   *
   * @return If idTag is specified, the document microversion associated with the idTag
   *
   */
  public final String getIdTagMicroversionId() {
    return this.idTagMicroversionId;
  }

  /**
   * Get If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
   *
   * @return If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
   *
   */
  public final String getTargetConfiguration() {
    return this.targetConfiguration;
  }

  /**
   * Get An optional sketch feature id within the target element that should be tracked
   *
   * @return An optional sketch feature id within the target element that should be tracked
   *
   */
  public final String getSketchId() {
    return this.sketchId;
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
     * Id of the transaction in which the reference creation should occur
     */
    private String transactionId;

    /**
     * Id of the prior change to the application element
     */
    private String parentChangeId;

    /**
     * The Id of the document of the element that is or contains the target of the reference
     */
    private String targetDocumentId;

    /**
     * The Id of the version the document that contains the target of the reference
     */
    private String targetVersionId;

    /**
     * The element Id of the element that is or contains the target of the reference
     */
    private String targetElementId;

    /**
     * An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
     */
    private String targetMicroversionId;

    /**
     * An optional deterministic id within the target element that should be tracked
     */
    private String idTag;

    /**
     * If idTag is specified, the document microversion associated with the idTag
     */
    private String idTagMicroversionId;

    /**
     * If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
     */
    private String targetConfiguration;

    /**
     * An optional sketch feature id within the target element that should be tracked
     */
    private String sketchId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the transaction in which the reference creation should occur
     *
     * @return Id of the transaction in which the reference creation should occur
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of the transaction in which the reference creation should occur
     *
     * @param value Id of the transaction in which the reference creation should occur
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Id of the prior change to the application element
     *
     * @return Id of the prior change to the application element
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set Id of the prior change to the application element
     *
     * @param value Id of the prior change to the application element
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get The Id of the document of the element that is or contains the target of the reference
     *
     * @return The Id of the document of the element that is or contains the target of the reference
     *
     */
    public final String targetDocumentId() {
      return this.targetDocumentId;
    }

    /**
     * Set The Id of the document of the element that is or contains the target of the reference
     *
     * @param value The Id of the document of the element that is or contains the target of the reference
     *
     * @return the Builder object.
     */
    public final Builder targetDocumentId(String value) {
      this.targetDocumentId = value;
      return this;
    }

    /**
     * Get The Id of the version the document that contains the target of the reference
     *
     * @return The Id of the version the document that contains the target of the reference
     *
     */
    public final String targetVersionId() {
      return this.targetVersionId;
    }

    /**
     * Set The Id of the version the document that contains the target of the reference
     *
     * @param value The Id of the version the document that contains the target of the reference
     *
     * @return the Builder object.
     */
    public final Builder targetVersionId(String value) {
      this.targetVersionId = value;
      return this;
    }

    /**
     * Get The element Id of the element that is or contains the target of the reference
     *
     * @return The element Id of the element that is or contains the target of the reference
     *
     */
    public final String targetElementId() {
      return this.targetElementId;
    }

    /**
     * Set The element Id of the element that is or contains the target of the reference
     *
     * @param value The element Id of the element that is or contains the target of the reference
     *
     * @return the Builder object.
     */
    public final Builder targetElementId(String value) {
      this.targetElementId = value;
      return this;
    }

    /**
     * Get An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
     *
     * @return An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
     *
     */
    public final String targetMicroversionId() {
      return this.targetMicroversionId;
    }

    /**
     * Set An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
     *
     * @param value An optional document microversionId that should be tracked, in case a specific point in history should be tracked by the reference
     *
     * @return the Builder object.
     */
    public final Builder targetMicroversionId(String value) {
      this.targetMicroversionId = value;
      return this;
    }

    /**
     * Get An optional deterministic id within the target element that should be tracked
     *
     * @return An optional deterministic id within the target element that should be tracked
     *
     */
    public final String idTag() {
      return this.idTag;
    }

    /**
     * Set An optional deterministic id within the target element that should be tracked
     *
     * @param value An optional deterministic id within the target element that should be tracked
     *
     * @return the Builder object.
     */
    public final Builder idTag(String value) {
      this.idTag = value;
      return this;
    }

    /**
     * Get If idTag is specified, the document microversion associated with the idTag
     *
     * @return If idTag is specified, the document microversion associated with the idTag
     *
     */
    public final String idTagMicroversionId() {
      return this.idTagMicroversionId;
    }

    /**
     * Set If idTag is specified, the document microversion associated with the idTag
     *
     * @param value If idTag is specified, the document microversion associated with the idTag
     *
     * @return the Builder object.
     */
    public final Builder idTagMicroversionId(String value) {
      this.idTagMicroversionId = value;
      return this;
    }

    /**
     * Get If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
     *
     * @return If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
     *
     */
    public final String targetConfiguration() {
      return this.targetConfiguration;
    }

    /**
     * Set If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
     *
     * @param value If not blank, specifies the configuration of the element. Otherwise, the configuration is the default configuration for the element.
     *
     * @return the Builder object.
     */
    public final Builder targetConfiguration(String value) {
      this.targetConfiguration = value;
      return this;
    }

    /**
     * Get An optional sketch feature id within the target element that should be tracked
     *
     * @return An optional sketch feature id within the target element that should be tracked
     *
     */
    public final String sketchId() {
      return this.sketchId;
    }

    /**
     * Set An optional sketch feature id within the target element that should be tracked
     *
     * @param value An optional sketch feature id within the target element that should be tracked
     *
     * @return the Builder object.
     */
    public final Builder sketchId(String value) {
      this.sketchId = value;
      return this;
    }

    private AppElementsCreateReferenceRequest build() {
      return new com.onshape.api.requests.AppElementsCreateReferenceRequest(transactionId,parentChangeId,targetDocumentId,targetVersionId,targetElementId,targetMicroversionId,idTag,idTagMicroversionId,targetConfiguration,sketchId);
    }

    /**
     * Calls createReference method, Create an app element reference
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppElementsCreateReferenceResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/references", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateReferenceResponse.class);
    }

    /**
     * Calls createReference method, Create an app element reference
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsCreateReferenceResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/references", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateReferenceResponse.class);
    }
  }
}
