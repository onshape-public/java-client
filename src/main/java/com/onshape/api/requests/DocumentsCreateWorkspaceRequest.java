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
import com.onshape.api.responses.DocumentsCreateWorkspaceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createWorkspace API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCreateWorkspaceRequest {
  /**
   * Version ID of parent version
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Microversion ID of parent document microversion
   */
  @JsonProperty("microversionId")
  String microversionId;

  /**
   * Workspace ID of parent workspace
   */
  @JsonProperty("workspaceId")
  String workspaceId;

  /**
   * Workspace name (not required if readOnly=true)
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Workspace description
   */
  @JsonProperty("description")
  String description;

  /**
   * Reserved for internal use
   */
  @JsonProperty("readOnly")
  Boolean readOnly;

  /**
   * Reserved for internal use
   */
  @JsonProperty("clientInteractionMode")
  Number clientInteractionMode;

  DocumentsCreateWorkspaceRequest(String versionId, String microversionId, String workspaceId,
      String name, String description, Boolean readOnly, Number clientInteractionMode) {
    this.versionId = versionId;
    this.microversionId = microversionId;
    this.workspaceId = workspaceId;
    this.name = name;
    this.description = description;
    this.readOnly = readOnly;
    this.clientInteractionMode = clientInteractionMode;
  }

  /**
   * Get Version ID of parent version
   *
   * @return Version ID of parent version
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Microversion ID of parent document microversion
   *
   * @return Microversion ID of parent document microversion
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Workspace ID of parent workspace
   *
   * @return Workspace ID of parent workspace
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get Workspace name (not required if readOnly=true)
   *
   * @return Workspace name (not required if readOnly=true)
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Workspace description
   *
   * @return Workspace description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Reserved for internal use
   *
   * @return Reserved for internal use
   *
   */
  public final Boolean getReadOnly() {
    return this.readOnly;
  }

  /**
   * Get Reserved for internal use
   *
   * @return Reserved for internal use
   *
   */
  public final Number getClientInteractionMode() {
    return this.clientInteractionMode;
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
     * Version ID of parent version
     */
    private String versionId;

    /**
     * Microversion ID of parent document microversion
     */
    private String microversionId;

    /**
     * Workspace ID of parent workspace
     */
    private String workspaceId;

    /**
     * Workspace name (not required if readOnly=true)
     */
    private String name;

    /**
     * Workspace description
     */
    private String description;

    /**
     * Reserved for internal use
     */
    private Boolean readOnly;

    /**
     * Reserved for internal use
     */
    private Number clientInteractionMode;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Version ID of parent version
     *
     * @return Version ID of parent version
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Version ID of parent version
     *
     * @param value Version ID of parent version
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Microversion ID of parent document microversion
     *
     * @return Microversion ID of parent document microversion
     *
     */
    public final String microversionId() {
      return this.microversionId;
    }

    /**
     * Set Microversion ID of parent document microversion
     *
     * @param value Microversion ID of parent document microversion
     *
     * @return the Builder object.
     */
    public final Builder microversionId(String value) {
      this.microversionId = value;
      return this;
    }

    /**
     * Get Workspace ID of parent workspace
     *
     * @return Workspace ID of parent workspace
     *
     */
    public final String workspaceId() {
      return this.workspaceId;
    }

    /**
     * Set Workspace ID of parent workspace
     *
     * @param value Workspace ID of parent workspace
     *
     * @return the Builder object.
     */
    public final Builder workspaceId(String value) {
      this.workspaceId = value;
      return this;
    }

    /**
     * Get Workspace name (not required if readOnly=true)
     *
     * @return Workspace name (not required if readOnly=true)
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Workspace name (not required if readOnly=true)
     *
     * @param value Workspace name (not required if readOnly=true)
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Workspace description
     *
     * @return Workspace description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Workspace description
     *
     * @param value Workspace description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Reserved for internal use
     *
     * @return Reserved for internal use
     *
     */
    public final Boolean readOnly() {
      return this.readOnly;
    }

    /**
     * Set Reserved for internal use
     *
     * @param value Reserved for internal use
     *
     * @return the Builder object.
     */
    public final Builder readOnly(Boolean value) {
      this.readOnly = value;
      return this;
    }

    /**
     * Get Reserved for internal use
     *
     * @return Reserved for internal use
     *
     */
    public final Number clientInteractionMode() {
      return this.clientInteractionMode;
    }

    /**
     * Set Reserved for internal use
     *
     * @param value Reserved for internal use
     *
     * @return the Builder object.
     */
    public final Builder clientInteractionMode(Number value) {
      this.clientInteractionMode = value;
      return this;
    }

    private DocumentsCreateWorkspaceRequest build() {
      return new com.onshape.api.requests.DocumentsCreateWorkspaceRequest(versionId,microversionId,workspaceId,name,description,readOnly,clientInteractionMode);
    }

    /**
     * Calls createWorkspace method, Creates a new workspace. The starting point for the workspace can be specified using one of
     *                 microversionId, workspaceId, versionId in that precedence order. A workspace also has a parent
     *                 that may be specified or implied. If the starting point is taken from workspaceId or versionId,
     *                 the parent version is implied to be the workspace parent or the version, respectively. If the
     *                 starting point used is microversionId then the parent version is chosen based on workspaceId,
     *                 versionId and default workspace, in that precedence order. If chosen based on a workspaceId, the
     *                 version is the parent of the chosen workspace. If the effective version parentId is not a true
     *                 parent of the starting microversion, an error is returned.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     */
    public final DocumentsCreateWorkspaceResponse call(String did) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/workspaces", build(), onshape.buildMap("did", did), onshape.buildMap(), com.onshape.api.responses.DocumentsCreateWorkspaceResponse.class);
    }

    /**
     * Calls createWorkspace method, Creates a new workspace. The starting point for the workspace can be specified using one of
     *                 microversionId, workspaceId, versionId in that precedence order. A workspace also has a parent
     *                 that may be specified or implied. If the starting point is taken from workspaceId or versionId,
     *                 the parent version is implied to be the workspace parent or the version, respectively. If the
     *                 starting point used is microversionId then the parent version is chosen based on workspaceId,
     *                 versionId and default workspace, in that precedence order. If chosen based on a workspaceId, the
     *                 version is the parent of the chosen workspace. If the effective version parentId is not a true
     *                 parent of the starting microversion, an error is returned.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsCreateWorkspaceResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/workspaces", build(), onshape.buildMap("did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsCreateWorkspaceResponse.class);
    }
  }
}
