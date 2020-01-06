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
import com.onshape.api.responses.DocumentsCopyWorkspaceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for copyWorkspace API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCopyWorkspaceRequest {
  /**
   * New document name
   */
  @JsonProperty("newName")
  @NotNull
  String newName;

  /**
   * Owner&#39;s user ID (default: current user)
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
   */
  @JsonProperty("ownerTypeIndex")
  Number ownerTypeIndex;

  /**
   * Onshape internal use
   */
  @JsonProperty("betaCapabilityIds")
  String[] betaCapabilityIds;

  /**
   * Whether new document is public (default: false)
   */
  @JsonProperty("isPublic")
  Boolean isPublic;

  DocumentsCopyWorkspaceRequest(String newName, String ownerId, Number ownerTypeIndex,
      String[] betaCapabilityIds, Boolean isPublic) {
    this.newName = newName;
    this.ownerId = ownerId;
    this.ownerTypeIndex = ownerTypeIndex;
    this.betaCapabilityIds = betaCapabilityIds;
    this.isPublic = isPublic;
  }

  /**
   * Get New document name
   *
   * @return New document name
   *
   */
  public final String getNewName() {
    return this.newName;
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
   * Get Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
   *
   * @return Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
   *
   */
  public final Number getOwnerTypeIndex() {
    return this.ownerTypeIndex;
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
   * Get Whether new document is public (default: false)
   *
   * @return Whether new document is public (default: false)
   *
   */
  public final Boolean getIsPublic() {
    return this.isPublic;
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
     * New document name
     */
    private String newName;

    /**
     * Owner&#39;s user ID (default: current user)
     */
    private String ownerId;

    /**
     * Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
     */
    private Number ownerTypeIndex;

    /**
     * Onshape internal use
     */
    private String[] betaCapabilityIds;

    /**
     * Whether new document is public (default: false)
     */
    private Boolean isPublic;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get New document name
     *
     * @return New document name
     *
     */
    public final String newName() {
      return this.newName;
    }

    /**
     * Set New document name
     *
     * @param value New document name
     *
     * @return the Builder object.
     */
    public final Builder newName(String value) {
      this.newName = value;
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
     * Get Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
     *
     * @return Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
     *
     */
    public final Number ownerTypeIndex() {
      return this.ownerTypeIndex;
    }

    /**
     * Set Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
     *
     * @param value Owner&#39;s user type, which can be: 0: user 1: company 2: Team (default: 0)
     *
     * @return the Builder object.
     */
    public final Builder ownerTypeIndex(Number value) {
      this.ownerTypeIndex = value;
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
     * Get Whether new document is public (default: false)
     *
     * @return Whether new document is public (default: false)
     *
     */
    public final Boolean isPublic() {
      return this.isPublic;
    }

    /**
     * Set Whether new document is public (default: false)
     *
     * @param value Whether new document is public (default: false)
     *
     * @return the Builder object.
     */
    public final Builder isPublic(Boolean value) {
      this.isPublic = value;
      return this;
    }

    private DocumentsCopyWorkspaceRequest build() {
      return new com.onshape.api.requests.DocumentsCopyWorkspaceRequest(newName,ownerId,ownerTypeIndex,betaCapabilityIds,isPublic);
    }

    /**
     * Calls copyWorkspace method, Copy a workspace
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final DocumentsCopyWorkspaceResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did/workspaces/:wid/copy", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsCopyWorkspaceResponse.class);
    }

    /**
     * Calls copyWorkspace method, Copy a workspace
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsCopyWorkspaceResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/:did/workspaces/:wid/copy", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.DocumentsCopyWorkspaceResponse.class);
    }
  }
}
