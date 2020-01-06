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
import com.onshape.api.responses.ElementsCopyElementFromSourceDocumentResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for copyElementFromSourceDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ElementsCopyElementFromSourceDocumentRequest {
  /**
   * The source document ID.
   */
  @JsonProperty("documentIdSource")
  @NotNull
  String documentIdSource;

  /**
   * The source workspace ID.
   */
  @JsonProperty("workspaceIdSource")
  @NotNull
  String workspaceIdSource;

  /**
   * The source element ID.
   */
  @JsonProperty("elementIdSource")
  @NotNull
  String elementIdSource;

  /**
   * If this has an anchor or not.
   */
  @JsonProperty("isGroupAnchor")
  @NotNull
  Boolean isGroupAnchor;

  /**
   * If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
   */
  @JsonProperty("anchorElementId")
  @NotNull
  String anchorElementId;

  ElementsCopyElementFromSourceDocumentRequest(String documentIdSource, String workspaceIdSource,
      String elementIdSource, Boolean isGroupAnchor, String anchorElementId) {
    this.documentIdSource = documentIdSource;
    this.workspaceIdSource = workspaceIdSource;
    this.elementIdSource = elementIdSource;
    this.isGroupAnchor = isGroupAnchor;
    this.anchorElementId = anchorElementId;
  }

  /**
   * Get The source document ID.
   *
   * @return The source document ID.
   *
   */
  public final String getDocumentIdSource() {
    return this.documentIdSource;
  }

  /**
   * Get The source workspace ID.
   *
   * @return The source workspace ID.
   *
   */
  public final String getWorkspaceIdSource() {
    return this.workspaceIdSource;
  }

  /**
   * Get The source element ID.
   *
   * @return The source element ID.
   *
   */
  public final String getElementIdSource() {
    return this.elementIdSource;
  }

  /**
   * Get If this has an anchor or not.
   *
   * @return If this has an anchor or not.
   *
   */
  public final Boolean getIsGroupAnchor() {
    return this.isGroupAnchor;
  }

  /**
   * Get If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
   *
   * @return If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
   *
   */
  public final String getAnchorElementId() {
    return this.anchorElementId;
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
     * The source document ID.
     */
    private String documentIdSource;

    /**
     * The source workspace ID.
     */
    private String workspaceIdSource;

    /**
     * The source element ID.
     */
    private String elementIdSource;

    /**
     * If this has an anchor or not.
     */
    private Boolean isGroupAnchor;

    /**
     * If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
     */
    private String anchorElementId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The source document ID.
     *
     * @return The source document ID.
     *
     */
    public final String documentIdSource() {
      return this.documentIdSource;
    }

    /**
     * Set The source document ID.
     *
     * @param value The source document ID.
     *
     * @return the Builder object.
     */
    public final Builder documentIdSource(String value) {
      this.documentIdSource = value;
      return this;
    }

    /**
     * Get The source workspace ID.
     *
     * @return The source workspace ID.
     *
     */
    public final String workspaceIdSource() {
      return this.workspaceIdSource;
    }

    /**
     * Set The source workspace ID.
     *
     * @param value The source workspace ID.
     *
     * @return the Builder object.
     */
    public final Builder workspaceIdSource(String value) {
      this.workspaceIdSource = value;
      return this;
    }

    /**
     * Get The source element ID.
     *
     * @return The source element ID.
     *
     */
    public final String elementIdSource() {
      return this.elementIdSource;
    }

    /**
     * Set The source element ID.
     *
     * @param value The source element ID.
     *
     * @return the Builder object.
     */
    public final Builder elementIdSource(String value) {
      this.elementIdSource = value;
      return this;
    }

    /**
     * Get If this has an anchor or not.
     *
     * @return If this has an anchor or not.
     *
     */
    public final Boolean isGroupAnchor() {
      return this.isGroupAnchor;
    }

    /**
     * Set If this has an anchor or not.
     *
     * @param value If this has an anchor or not.
     *
     * @return the Builder object.
     */
    public final Builder isGroupAnchor(Boolean value) {
      this.isGroupAnchor = value;
      return this;
    }

    /**
     * Get If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
     *
     * @return If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
     *
     */
    public final String anchorElementId() {
      return this.anchorElementId;
    }

    /**
     * Set If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
     *
     * @param value If specified, the copied element will be inserted after the anchor element, otherwise at the end of the tab list.
     *
     * @return the Builder object.
     */
    public final Builder anchorElementId(String value) {
      this.anchorElementId = value;
      return this;
    }

    private ElementsCopyElementFromSourceDocumentRequest build() {
      return new com.onshape.api.requests.ElementsCopyElementFromSourceDocumentRequest(documentIdSource,workspaceIdSource,elementIdSource,isGroupAnchor,anchorElementId);
    }

    /**
     * Calls copyElementFromSourceDocument method, Copy an element from a source document to a destination document or within the same document.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final ElementsCopyElementFromSourceDocumentResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/copyelement/:did/workspace/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.ElementsCopyElementFromSourceDocumentResponse.class);
    }

    /**
     * Calls copyElementFromSourceDocument method, Copy an element from a source document to a destination document or within the same document.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ElementsCopyElementFromSourceDocumentResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/copyelement/:did/workspace/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.ElementsCopyElementFromSourceDocumentResponse.class);
    }
  }
}
