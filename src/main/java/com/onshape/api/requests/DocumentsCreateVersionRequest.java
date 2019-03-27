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
import com.onshape.api.responses.DocumentsCreateVersionResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createVersion API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsCreateVersionRequest {
  /**
   * Document ID (must match path parameter)
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Version name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Version description
   */
  @JsonProperty("description")
  String description;

  /**
   * Microversion ID at which to create the version if fromHistory is true
   */
  @JsonProperty("microversionId")
  String microversionId;

  /**
   * Specifies whether to create a version at a specific microversion (specified by microversionId)
   */
  @JsonProperty("fromHistory")
  Boolean fromHistory;

  DocumentsCreateVersionRequest(String documentId, String workspaceId, String name,
      String description, String microversionId, Boolean fromHistory) {
    this.documentId = documentId;
    this.workspaceId = workspaceId;
    this.name = name;
    this.description = description;
    this.microversionId = microversionId;
    this.fromHistory = fromHistory;
  }

  /**
   * Get Document ID (must match path parameter)
   *
   * @return Document ID (must match path parameter)
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
   *
   * @return Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get Version name
   *
   * @return Version name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Version description
   *
   * @return Version description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Microversion ID at which to create the version if fromHistory is true
   *
   * @return Microversion ID at which to create the version if fromHistory is true
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Specifies whether to create a version at a specific microversion (specified by microversionId)
   *
   * @return Specifies whether to create a version at a specific microversion (specified by microversionId)
   *
   */
  public final Boolean getFromHistory() {
    return this.fromHistory;
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
     * Document ID (must match path parameter)
     */
    private String documentId;

    /**
     * Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
     */
    private String workspaceId;

    /**
     * Version name
     */
    private String name;

    /**
     * Version description
     */
    private String description;

    /**
     * Microversion ID at which to create the version if fromHistory is true
     */
    private String microversionId;

    /**
     * Specifies whether to create a version at a specific microversion (specified by microversionId)
     */
    private Boolean fromHistory;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Document ID (must match path parameter)
     *
     * @return Document ID (must match path parameter)
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set Document ID (must match path parameter)
     *
     * @param value Document ID (must match path parameter)
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
     *
     * @return Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
     *
     * @param value Workspace ID of a workspace where the version will be created if fromHistory is false. If fromHistory is false and workspaceId is not set, the default workspace is used.
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get Version name
     *
     * @return Version name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Version name
     *
     * @param value Version name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Version description
     *
     * @return Version description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Version description
     *
     * @param value Version description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Microversion ID at which to create the version if fromHistory is true
     *
     * @return Microversion ID at which to create the version if fromHistory is true
     *
     */
    public final String microversionId() {
      return this.microversionId;
    }

    /**
     * Set Microversion ID at which to create the version if fromHistory is true
     *
     * @param value Microversion ID at which to create the version if fromHistory is true
     *
     * @return the Builder object.
     */
    public final Builder microversionId(String value) {
      this.microversionId = value;
      return this;
    }

    /**
     * Get Specifies whether to create a version at a specific microversion (specified by microversionId)
     *
     * @return Specifies whether to create a version at a specific microversion (specified by microversionId)
     *
     */
    public final Boolean fromHistory() {
      return this.fromHistory;
    }

    /**
     * Set Specifies whether to create a version at a specific microversion (specified by microversionId)
     *
     * @param value Specifies whether to create a version at a specific microversion (specified by microversionId)
     *
     * @return the Builder object.
     */
    public final Builder fromHistory(Boolean value) {
      this.fromHistory = value;
      return this;
    }

    private DocumentsCreateVersionRequest build() {
      return new com.onshape.api.requests.DocumentsCreateVersionRequest(documentId,workspaceId,name,description,microversionId,fromHistory);
    }

    /**
     * Calls createVersion method, Create version at the current microversion of the specified workspace or a target microversion.
     *                 Versions should be created only for tracking the state of a document that will need to be
     *                 referenced by the user in the future. An application should not use versions as a convenience
     *                 mechanism for an application to remember document states.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     */
    public final DocumentsCreateVersionResponse call(String did) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/versions", build(), onshape.buildMap("did", did), onshape.buildMap(), com.onshape.api.responses.DocumentsCreateVersionResponse.class);
    }

    /**
     * Calls createVersion method, Create version at the current microversion of the specified workspace or a target microversion.
     *                 Versions should be created only for tracking the state of a document that will need to be
     *                 referenced by the user in the future. An application should not use versions as a convenience
     *                 mechanism for an application to remember document states.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsCreateVersionResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/versions", build(), onshape.buildMap("did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsCreateVersionResponse.class);
    }
  }
}
