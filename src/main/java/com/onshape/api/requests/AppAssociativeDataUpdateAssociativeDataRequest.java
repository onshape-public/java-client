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
import com.onshape.api.responses.AppAssociativeDataUpdateAssociativeDataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateAssociativeData API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppAssociativeDataUpdateAssociativeDataRequest {
  /**
   * the transactionId in which the lookup should take place
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * the specific changeId at which the deletion should take place
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  /**
   * description of the update
   */
  @JsonProperty("description")
  String description;

  /**
   * the id of a specific association
   */
  @JsonProperty("associativeDataId")
  String associativeDataId;

  /**
   * the id of the model document
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * the id of the model element
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * the id of the model workspace
   */
  @JsonProperty("workspaceId")
  @NotNull
  String workspaceId;

  /**
   * the id of an occurrence in assembly context (required for assembly associations)
   */
  @JsonProperty("occurrenceId")
  String occurrenceId;

  /**
   * association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
   */
  @JsonProperty("type")
  @NotNull
  String type;

  /**
   * associative data operation (ADD|UPDATE|REMOVE)
   */
  @JsonProperty("operation")
  @NotNull
  String operation;

  /**
   * document microversion of idTag, (required for MODEL_TOPOLOGY)
   */
  @JsonProperty("documentMicroversion")
  String documentMicroversion;

  /**
   * deterministicId, featureId, or entityId depending on association type
   */
  @JsonProperty("idTag")
  @NotNull
  String idTag;

  /**
   * array of name value pairs
   */
  @JsonProperty("data")
  @NotNull
  AppAssociativeDataUpdateAssociativeDataRequestData[] data;

  AppAssociativeDataUpdateAssociativeDataRequest(String transactionId, String parentChangeId,
      String description, String associativeDataId, String documentId, String elementId,
      String workspaceId, String occurrenceId, String type, String operation,
      String documentMicroversion, String idTag,
      AppAssociativeDataUpdateAssociativeDataRequestData[] data) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.description = description;
    this.associativeDataId = associativeDataId;
    this.documentId = documentId;
    this.elementId = elementId;
    this.workspaceId = workspaceId;
    this.occurrenceId = occurrenceId;
    this.type = type;
    this.operation = operation;
    this.documentMicroversion = documentMicroversion;
    this.idTag = idTag;
    this.data = data;
  }

  /**
   * Get the transactionId in which the lookup should take place
   *
   * @return the transactionId in which the lookup should take place
   *
   */
  public final String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Get the specific changeId at which the deletion should take place
   *
   * @return the specific changeId at which the deletion should take place
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get description of the update
   *
   * @return description of the update
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get the id of a specific association
   *
   * @return the id of a specific association
   *
   */
  public final String getAssociativeDataId() {
    return this.associativeDataId;
  }

  /**
   * Get the id of the model document
   *
   * @return the id of the model document
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get the id of the model element
   *
   * @return the id of the model element
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get the id of the model workspace
   *
   * @return the id of the model workspace
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get the id of an occurrence in assembly context (required for assembly associations)
   *
   * @return the id of an occurrence in assembly context (required for assembly associations)
   *
   */
  public final String getOccurrenceId() {
    return this.occurrenceId;
  }

  /**
   * Get association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
   *
   * @return association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get associative data operation (ADD|UPDATE|REMOVE)
   *
   * @return associative data operation (ADD|UPDATE|REMOVE)
   *
   */
  public final String getOperation() {
    return this.operation;
  }

  /**
   * Get document microversion of idTag, (required for MODEL_TOPOLOGY)
   *
   * @return document microversion of idTag, (required for MODEL_TOPOLOGY)
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
  }

  /**
   * Get deterministicId, featureId, or entityId depending on association type
   *
   * @return deterministicId, featureId, or entityId depending on association type
   *
   */
  public final String getIdTag() {
    return this.idTag;
  }

  /**
   * Get array of name value pairs
   *
   * @return array of name value pairs
   *
   */
  public final AppAssociativeDataUpdateAssociativeDataRequestData[] getData() {
    return this.data;
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
     * the specific changeId at which the deletion should take place
     */
    private String parentChangeId;

    /**
     * description of the update
     */
    private String description;

    /**
     * the id of a specific association
     */
    private String associativeDataId;

    /**
     * the id of the model document
     */
    private String documentId;

    /**
     * the id of the model element
     */
    private String elementId;

    /**
     * the id of the model workspace
     */
    private String workspaceId;

    /**
     * the id of an occurrence in assembly context (required for assembly associations)
     */
    private String occurrenceId;

    /**
     * association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
     */
    private String type;

    /**
     * associative data operation (ADD|UPDATE|REMOVE)
     */
    private String operation;

    /**
     * document microversion of idTag, (required for MODEL_TOPOLOGY)
     */
    private String documentMicroversion;

    /**
     * deterministicId, featureId, or entityId depending on association type
     */
    private String idTag;

    /**
     * array of name value pairs
     */
    private AppAssociativeDataUpdateAssociativeDataRequestData[] data;

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
     * Get the specific changeId at which the deletion should take place
     *
     * @return the specific changeId at which the deletion should take place
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set the specific changeId at which the deletion should take place
     *
     * @param value the specific changeId at which the deletion should take place
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get description of the update
     *
     * @return description of the update
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set description of the update
     *
     * @param value description of the update
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get the id of a specific association
     *
     * @return the id of a specific association
     *
     */
    public final String associativeDataId() {
      return this.associativeDataId;
    }

    /**
     * Set the id of a specific association
     *
     * @param value the id of a specific association
     *
     * @return the Builder object.
     */
    public final Builder associativeDataId(String value) {
      this.associativeDataId = value;
      return this;
    }

    /**
     * Get the id of the model document
     *
     * @return the id of the model document
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set the id of the model document
     *
     * @param value the id of the model document
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get the id of the model element
     *
     * @return the id of the model element
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set the id of the model element
     *
     * @param value the id of the model element
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get the id of the model workspace
     *
     * @return the id of the model workspace
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set the id of the model workspace
     *
     * @param value the id of the model workspace
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get the id of an occurrence in assembly context (required for assembly associations)
     *
     * @return the id of an occurrence in assembly context (required for assembly associations)
     *
     */
    public final String occurrenceId() {
      return this.occurrenceId;
    }

    /**
     * Set the id of an occurrence in assembly context (required for assembly associations)
     *
     * @param value the id of an occurrence in assembly context (required for assembly associations)
     *
     * @return the Builder object.
     */
    public final Builder occurrenceId(String value) {
      this.occurrenceId = value;
      return this;
    }

    /**
     * Get association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
     *
     * @return association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
     *
     */
    public final String type() {
      return this.type;
    }

    /**
     * Set association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
     *
     * @param value association type (MODEL_TOPOLOGY|MOODEL_DEFINITION_FEATURE|MODEL_DEFINITION_ENTITY)
     *
     * @return the Builder object.
     */
    public final Builder type(String value) {
      this.type = value;
      return this;
    }

    /**
     * Get associative data operation (ADD|UPDATE|REMOVE)
     *
     * @return associative data operation (ADD|UPDATE|REMOVE)
     *
     */
    public final String operation() {
      return this.operation;
    }

    /**
     * Set associative data operation (ADD|UPDATE|REMOVE)
     *
     * @param value associative data operation (ADD|UPDATE|REMOVE)
     *
     * @return the Builder object.
     */
    public final Builder operation(String value) {
      this.operation = value;
      return this;
    }

    /**
     * Get document microversion of idTag, (required for MODEL_TOPOLOGY)
     *
     * @return document microversion of idTag, (required for MODEL_TOPOLOGY)
     *
     */
    public final String documentMicroversion() {
      return this.documentMicroversion;
    }

    /**
     * Set document microversion of idTag, (required for MODEL_TOPOLOGY)
     *
     * @param value document microversion of idTag, (required for MODEL_TOPOLOGY)
     *
     * @return the Builder object.
     */
    public final Builder documentMicroversion(String value) {
      this.documentMicroversion = value;
      return this;
    }

    /**
     * Get deterministicId, featureId, or entityId depending on association type
     *
     * @return deterministicId, featureId, or entityId depending on association type
     *
     */
    public final String idTag() {
      return this.idTag;
    }

    /**
     * Set deterministicId, featureId, or entityId depending on association type
     *
     * @param value deterministicId, featureId, or entityId depending on association type
     *
     * @return the Builder object.
     */
    public final Builder idTag(String value) {
      this.idTag = value;
      return this;
    }

    /**
     * Get array of name value pairs
     *
     * @return array of name value pairs
     *
     */
    public final AppAssociativeDataUpdateAssociativeDataRequestData[] data() {
      return this.data;
    }

    /**
     * Set array of name value pairs
     *
     * @param value array of name value pairs
     *
     * @return the Builder object.
     */
    public final Builder data(AppAssociativeDataUpdateAssociativeDataRequestData[] value) {
      this.data = value;
      return this;
    }

    private AppAssociativeDataUpdateAssociativeDataRequest build() {
      return new com.onshape.api.requests.AppAssociativeDataUpdateAssociativeDataRequest(transactionId,parentChangeId,description,associativeDataId,documentId,elementId,workspaceId,occurrenceId,type,operation,documentMicroversion,idTag,data);
    }

    /**
     * Calls updateAssociativeData method, Update associative data for an app element
     *                 (Manage associativity with /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppAssociativeDataUpdateAssociativeDataResponse call(String did, String wid,
        String eid) throws OnshapeException {
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/associativedata", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataUpdateAssociativeDataResponse.class);
    }

    /**
     * Calls updateAssociativeData method, Update associative data for an app element
     *                 (Manage associativity with /partstudios/d/:did/w/:wid/e/:eid/idtranslations)
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final AppAssociativeDataUpdateAssociativeDataResponse call(OnshapeDocument document,
        String wid) throws OnshapeException {
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/associativedata", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid, "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppAssociativeDataUpdateAssociativeDataResponse.class);
    }
  }
}
