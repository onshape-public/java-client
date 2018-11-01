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
import com.onshape.api.responses.AppAssociativeDataGetAssociativeDataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getAssociativeData API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppAssociativeDataGetAssociativeDataRequest {
  /**
   * the transactionId in which the lookup should take place
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * the specific changeId at which the lookup should take place
   */
  @JsonProperty("changeId")
  String changeId;

  /**
   * filter by id of a specific association
   */
  @JsonProperty("associativeDataId")
  String associativeDataId;

  /**
   * filter by id of the model element
   */
  @JsonProperty("elementId")
  String elementId;

  /**
   * the id of an occurrence in assembly context
   */
  @JsonProperty("occurrenceId")
  String occurrenceId;

  /**
   * filter by model definition featureId
   */
  @JsonProperty("featureId")
  String featureId;

  /**
   * filter by model definition entity id
   */
  @JsonProperty("entityId")
  String entityId;

  /**
   * filter by the deterministicId of the model entity
   */
  @JsonProperty("deterministicId")
  String deterministicId;

  /**
   * the documentMicroversion of the deterministicId
   */
  @JsonProperty("documentMicroversion")
  String documentMicroversion;

  /**
   * idTags will be generated if true
   */
  @JsonProperty("returnIdTags")
  Boolean returnIdTags;

  AppAssociativeDataGetAssociativeDataRequest(String transactionId, String changeId,
      String associativeDataId, String elementId, String occurrenceId, String featureId,
      String entityId, String deterministicId, String documentMicroversion, Boolean returnIdTags) {
    this.transactionId = transactionId;
    this.changeId = changeId;
    this.associativeDataId = associativeDataId;
    this.elementId = elementId;
    this.occurrenceId = occurrenceId;
    this.featureId = featureId;
    this.entityId = entityId;
    this.deterministicId = deterministicId;
    this.documentMicroversion = documentMicroversion;
    this.returnIdTags = returnIdTags;
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
     * the transactionId in which the lookup should take place
     */
    private String transactionId;

    /**
     * the specific changeId at which the lookup should take place
     */
    private String changeId;

    /**
     * filter by id of a specific association
     */
    private String associativeDataId;

    /**
     * filter by id of the model element
     */
    private String elementId;

    /**
     * the id of an occurrence in assembly context
     */
    private String occurrenceId;

    /**
     * filter by model definition featureId
     */
    private String featureId;

    /**
     * filter by model definition entity id
     */
    private String entityId;

    /**
     * filter by the deterministicId of the model entity
     */
    private String deterministicId;

    /**
     * the documentMicroversion of the deterministicId
     */
    private String documentMicroversion;

    /**
     * idTags will be generated if true
     */
    private Boolean returnIdTags;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get the transactionId in which the lookup should take place
     *
     * @return the transactionId in which the lookup should take place
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set the transactionId in which the lookup should take place
     *
     * @param value the transactionId in which the lookup should take place
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get the specific changeId at which the lookup should take place
     *
     * @return the specific changeId at which the lookup should take place
     *
     */
    public final String changeId() {
      return this.changeId;
    }

    /**
     * Set the specific changeId at which the lookup should take place
     *
     * @param value the specific changeId at which the lookup should take place
     *
     * @return the Builder object.
     */
    public final Builder changeId(String value) {
      this.changeId = value;
      return this;
    }

    /**
     * Get filter by id of a specific association
     *
     * @return filter by id of a specific association
     *
     */
    public final String associativeDataId() {
      return this.associativeDataId;
    }

    /**
     * Set filter by id of a specific association
     *
     * @param value filter by id of a specific association
     *
     * @return the Builder object.
     */
    public final Builder associativeDataId(String value) {
      this.associativeDataId = value;
      return this;
    }

    /**
     * Get filter by id of the model element
     *
     * @return filter by id of the model element
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set filter by id of the model element
     *
     * @param value filter by id of the model element
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get the id of an occurrence in assembly context
     *
     * @return the id of an occurrence in assembly context
     *
     */
    public final String occurrenceId() {
      return this.occurrenceId;
    }

    /**
     * Set the id of an occurrence in assembly context
     *
     * @param value the id of an occurrence in assembly context
     *
     * @return the Builder object.
     */
    public final Builder occurrenceId(String value) {
      this.occurrenceId = value;
      return this;
    }

    /**
     * Get filter by model definition featureId
     *
     * @return filter by model definition featureId
     *
     */
    public final String featureId() {
      return this.featureId;
    }

    /**
     * Set filter by model definition featureId
     *
     * @param value filter by model definition featureId
     *
     * @return the Builder object.
     */
    public final Builder featureId(String value) {
      this.featureId = value;
      return this;
    }

    /**
     * Get filter by model definition entity id
     *
     * @return filter by model definition entity id
     *
     */
    public final String entityId() {
      return this.entityId;
    }

    /**
     * Set filter by model definition entity id
     *
     * @param value filter by model definition entity id
     *
     * @return the Builder object.
     */
    public final Builder entityId(String value) {
      this.entityId = value;
      return this;
    }

    /**
     * Get filter by the deterministicId of the model entity
     *
     * @return filter by the deterministicId of the model entity
     *
     */
    public final String deterministicId() {
      return this.deterministicId;
    }

    /**
     * Set filter by the deterministicId of the model entity
     *
     * @param value filter by the deterministicId of the model entity
     *
     * @return the Builder object.
     */
    public final Builder deterministicId(String value) {
      this.deterministicId = value;
      return this;
    }

    /**
     * Get the documentMicroversion of the deterministicId
     *
     * @return the documentMicroversion of the deterministicId
     *
     */
    public final String documentMicroversion() {
      return this.documentMicroversion;
    }

    /**
     * Set the documentMicroversion of the deterministicId
     *
     * @param value the documentMicroversion of the deterministicId
     *
     * @return the Builder object.
     */
    public final Builder documentMicroversion(String value) {
      this.documentMicroversion = value;
      return this;
    }

    /**
     * Get idTags will be generated if true
     *
     * @return idTags will be generated if true
     *
     */
    public final Boolean returnIdTags() {
      return this.returnIdTags;
    }

    /**
     * Set idTags will be generated if true
     *
     * @param value idTags will be generated if true
     *
     * @return the Builder object.
     */
    public final Builder returnIdTags(Boolean value) {
      this.returnIdTags = value;
      return this;
    }

    private AppAssociativeDataGetAssociativeDataRequest build() {
      return new com.onshape.api.requests.AppAssociativeDataGetAssociativeDataRequest(transactionId,changeId,associativeDataId,elementId,occurrenceId,featureId,entityId,deterministicId,documentMicroversion,returnIdTags);
    }

    /**
     * Calls getAssociativeData method, Get associative data for an app element (Manage associativity with
     *                 /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
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
    public final AppAssociativeDataGetAssociativeDataResponse call(String did, WVM wvmType,
        String wvm, String eid) throws OnshapeException {
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/associativedata", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("transactionId", transactionId, "changeId", changeId, "associativeDataId", associativeDataId, "elementId", elementId, "occurrenceId", occurrenceId, "featureId", featureId, "entityId", entityId, "deterministicId", deterministicId, "documentMicroversion", documentMicroversion, "returnIdTags", returnIdTags), com.onshape.api.responses.AppAssociativeDataGetAssociativeDataResponse.class);
    }

    /**
     * Calls getAssociativeData method, Get associative data for an app element (Manage associativity with
     *                 /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppAssociativeDataGetAssociativeDataResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/associativedata", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataGetAssociativeDataResponse.class);
    }
  }
}
