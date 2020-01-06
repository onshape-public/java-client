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
import com.onshape.api.responses.DocumentsMoveElementsToDocumentResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for moveElementsToDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsMoveElementsToDocumentRequest {
  /**
   * Document name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Owner&#39;s user ID (default: current user)
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Owner&#39;s user type, which can be: 0: user 1: company 2: Team
   */
  @JsonProperty("ownerType")
  @NotNull
  Number ownerType;

  /**
   * Onshape internal use
   */
  @JsonProperty("betaCapabilityIds")
  String[] betaCapabilityIds;

  /**
   * Whether document is public
   */
  @JsonProperty("isPublic")
  @NotNull
  Boolean isPublic;

  /**
   * Onshape internal use
   */
  @JsonProperty("isGenerateUnknownMessages")
  Boolean isGenerateUnknownMessages;

  /**
   * Onshape internal use
   */
  @JsonProperty("tags")
  String[] tags;

  /**
   * elements to move
   */
  @JsonProperty("elements")
  String[] elements;

  /**
   * source document Id
   */
  @JsonProperty("sourceDocumentId")
  String sourceDocumentId;

  /**
   * source workspace Id
   */
  @JsonProperty("sourceWorkspaceId")
  String sourceWorkspaceId;

  /**
   * target document Id
   */
  @JsonProperty("targetDocumentId")
  String targetDocumentId;

  /**
   * target workspace Id
   */
  @JsonProperty("targetWorkspaceId")
  String targetWorkspaceId;

  DocumentsMoveElementsToDocumentRequest(String name, String ownerId, Number ownerType,
      String[] betaCapabilityIds, Boolean isPublic, Boolean isGenerateUnknownMessages,
      String[] tags, String[] elements, String sourceDocumentId, String sourceWorkspaceId,
      String targetDocumentId, String targetWorkspaceId) {
    this.name = name;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.betaCapabilityIds = betaCapabilityIds;
    this.isPublic = isPublic;
    this.isGenerateUnknownMessages = isGenerateUnknownMessages;
    this.tags = tags;
    this.elements = elements;
    this.sourceDocumentId = sourceDocumentId;
    this.sourceWorkspaceId = sourceWorkspaceId;
    this.targetDocumentId = targetDocumentId;
    this.targetWorkspaceId = targetWorkspaceId;
  }

  /**
   * Get Document name
   *
   * @return Document name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Owner&#39;s user ID (default: current user)
   *
   * @return Owner&#39;s user ID (default: current user)
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Owner&#39;s user type, which can be: 0: user 1: company 2: Team
   *
   * @return Owner&#39;s user type, which can be: 0: user 1: company 2: Team
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String[] getBetaCapabilityIds() {
    return this.betaCapabilityIds;
  }

  /**
   * Get Whether document is public
   *
   * @return Whether document is public
   *
   */
  public final Boolean getIsPublic() {
    return this.isPublic;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Boolean getIsGenerateUnknownMessages() {
    return this.isGenerateUnknownMessages;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String[] getTags() {
    return this.tags;
  }

  /**
   * Get elements to move
   *
   * @return elements to move
   *
   */
  public final String[] getElements() {
    return this.elements;
  }

  /**
   * Get source document Id
   *
   * @return source document Id
   *
   */
  public final String getSourceDocumentId() {
    return this.sourceDocumentId;
  }

  /**
   * Get source workspace Id
   *
   * @return source workspace Id
   *
   */
  public final String getSourceWorkspaceId() {
    return this.sourceWorkspaceId;
  }

  /**
   * Get target document Id
   *
   * @return target document Id
   *
   */
  public final String getTargetDocumentId() {
    return this.targetDocumentId;
  }

  /**
   * Get target workspace Id
   *
   * @return target workspace Id
   *
   */
  public final String getTargetWorkspaceId() {
    return this.targetWorkspaceId;
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
     * Document name
     */
    private String name;

    /**
     * Owner&#39;s user ID (default: current user)
     */
    private String ownerId;

    /**
     * Owner&#39;s user type, which can be: 0: user 1: company 2: Team
     */
    private Number ownerType;

    /**
     * Onshape internal use
     */
    private String[] betaCapabilityIds;

    /**
     * Whether document is public
     */
    private Boolean isPublic;

    /**
     * Onshape internal use
     */
    private Boolean isGenerateUnknownMessages;

    /**
     * Onshape internal use
     */
    private String[] tags;

    /**
     * elements to move
     */
    private String[] elements;

    /**
     * source document Id
     */
    private String sourceDocumentId;

    /**
     * source workspace Id
     */
    private String sourceWorkspaceId;

    /**
     * target document Id
     */
    private String targetDocumentId;

    /**
     * target workspace Id
     */
    private String targetWorkspaceId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Document name
     *
     * @return Document name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Document name
     *
     * @param value Document name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Owner&#39;s user ID (default: current user)
     *
     * @return Owner&#39;s user ID (default: current user)
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set Owner&#39;s user ID (default: current user)
     *
     * @param value Owner&#39;s user ID (default: current user)
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get Owner&#39;s user type, which can be: 0: user 1: company 2: Team
     *
     * @return Owner&#39;s user type, which can be: 0: user 1: company 2: Team
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Owner&#39;s user type, which can be: 0: user 1: company 2: Team
     *
     * @param value Owner&#39;s user type, which can be: 0: user 1: company 2: Team
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final String[] betaCapabilityIds() {
      return this.betaCapabilityIds;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder betaCapabilityIds(String[] value) {
      this.betaCapabilityIds = value;
      return this;
    }

    /**
     * Get Whether document is public
     *
     * @return Whether document is public
     *
     */
    public final Boolean isPublic() {
      return this.isPublic;
    }

    /**
     * Set Whether document is public
     *
     * @param value Whether document is public
     *
     * @return the Builder object.
     */
    public final Builder isPublic(Boolean value) {
      this.isPublic = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final Boolean isGenerateUnknownMessages() {
      return this.isGenerateUnknownMessages;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder isGenerateUnknownMessages(Boolean value) {
      this.isGenerateUnknownMessages = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final String[] tags() {
      return this.tags;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder tags(String[] value) {
      this.tags = value;
      return this;
    }

    /**
     * Get elements to move
     *
     * @return elements to move
     *
     */
    public final String[] elements() {
      return this.elements;
    }

    /**
     * Set elements to move
     *
     * @param value elements to move
     *
     * @return the Builder object.
     */
    public final Builder elements(String[] value) {
      this.elements = value;
      return this;
    }

    /**
     * Get source document Id
     *
     * @return source document Id
     *
     */
    public final String sourceDocumentId() {
      return this.sourceDocumentId;
    }

    /**
     * Set source document Id
     *
     * @param value source document Id
     *
     * @return the Builder object.
     */
    public final Builder sourceDocumentId(String value) {
      this.sourceDocumentId = value;
      return this;
    }

    /**
     * Get source workspace Id
     *
     * @return source workspace Id
     *
     */
    public final String sourceWorkspaceId() {
      return this.sourceWorkspaceId;
    }

    /**
     * Set source workspace Id
     *
     * @param value source workspace Id
     *
     * @return the Builder object.
     */
    public final Builder sourceWorkspaceId(String value) {
      this.sourceWorkspaceId = value;
      return this;
    }

    /**
     * Get target document Id
     *
     * @return target document Id
     *
     */
    public final String targetDocumentId() {
      return this.targetDocumentId;
    }

    /**
     * Set target document Id
     *
     * @param value target document Id
     *
     * @return the Builder object.
     */
    public final Builder targetDocumentId(String value) {
      this.targetDocumentId = value;
      return this;
    }

    /**
     * Get target workspace Id
     *
     * @return target workspace Id
     *
     */
    public final String targetWorkspaceId() {
      return this.targetWorkspaceId;
    }

    /**
     * Set target workspace Id
     *
     * @param value target workspace Id
     *
     * @return the Builder object.
     */
    public final Builder targetWorkspaceId(String value) {
      this.targetWorkspaceId = value;
      return this;
    }

    private DocumentsMoveElementsToDocumentRequest build() {
      return new com.onshape.api.requests.DocumentsMoveElementsToDocumentRequest(name,ownerId,ownerType,betaCapabilityIds,isPublic,isGenerateUnknownMessages,tags,elements,sourceDocumentId,sourceWorkspaceId,targetDocumentId,targetWorkspaceId);
    }

    /**
     * Calls moveElementsToDocument method, Move elements from a source document to a destination document
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final DocumentsMoveElementsToDocumentResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/moveelement", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsMoveElementsToDocumentResponse.class);
    }

    /**
     * Calls moveElementsToDocument method, Move elements from a source document to a destination document
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsMoveElementsToDocumentResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/moveelement", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.DocumentsMoveElementsToDocumentResponse.class);
    }
  }
}
