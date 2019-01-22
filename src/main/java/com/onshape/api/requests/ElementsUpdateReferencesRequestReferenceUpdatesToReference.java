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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to updateReferences API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class ElementsUpdateReferencesRequestReferenceUpdatesToReference {
  /**
   * The Document ID of the destination reference.
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * The destination revision.
   */
  @JsonProperty("revision")
  public Map revision;

  /**
   * The part number identifying the item in the destination revision.
   */
  @JsonProperty("partNumber")
  public Map partNumber;

  /**
   * The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
   */
  @JsonProperty("elementType")
  public Map elementType;

  ElementsUpdateReferencesRequestReferenceUpdatesToReference(String documentId, String versionId,
      String elementId, Map revision, Map partNumber, Map elementType) {
    this.documentId = documentId;
    this.versionId = versionId;
    this.elementId = elementId;
    this.revision = revision;
    this.partNumber = partNumber;
    this.elementType = elementType;
  }

  /**
   * Get The Document ID of the destination reference.
   *
   * @return The Document ID of the destination reference.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
   *
   * @return The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
   *
   * @return The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The destination revision.
   *
   * @return The destination revision.
   *
   */
  public final Map getRevision() {
    return this.revision;
  }

  /**
   * Get The part number identifying the item in the destination revision.
   *
   * @return The part number identifying the item in the destination revision.
   *
   */
  public final Map getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
   *
   * @return The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
   *
   */
  public final Map getElementType() {
    return this.elementType;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * The Document ID of the destination reference.
     */
    private String documentId;

    /**
     * The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
     */
    private String versionId;

    /**
     * The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
     */
    private String elementId;

    /**
     * The destination revision.
     */
    private Map revision;

    /**
     * The part number identifying the item in the destination revision.
     */
    private Map partNumber;

    /**
     * The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
     */
    private Map elementType;

    Builder() {
    }

    /**
     * Get The Document ID of the destination reference.
     *
     * @return The Document ID of the destination reference.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set The Document ID of the destination reference.
     *
     * @param value The Document ID of the destination reference.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
     *
     * @return The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
     *
     * @param value The Version ID of the destination reference. If unspecified, the workspaceId in the queryParams will be used.
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
     *
     * @return The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
     *
     * @param value The Element ID of the destination reference. If unspecified, all items will be updated to their respective elements in the specified document/version or document/workspace.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get The destination revision.
     *
     * @return The destination revision.
     *
     */
    public final Map revision() {
      return this.revision;
    }

    /**
     * Set The destination revision.
     *
     * @param value The destination revision.
     *
     * @return the Builder object.
     */
    public final Builder revision(Map value) {
      this.revision = value;
      return this;
    }

    /**
     * Get The part number identifying the item in the destination revision.
     *
     * @return The part number identifying the item in the destination revision.
     *
     */
    public final Map partNumber() {
      return this.partNumber;
    }

    /**
     * Set The part number identifying the item in the destination revision.
     *
     * @param value The part number identifying the item in the destination revision.
     *
     * @return the Builder object.
     */
    public final Builder partNumber(Map value) {
      this.partNumber = value;
      return this;
    }

    /**
     * Get The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
     *
     * @return The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
     *
     */
    public final Map elementType() {
      return this.elementType;
    }

    /**
     * Set The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
     *
     * @param value The elementType of the item in the destination revision. This can be: ASSEMBLY or PARTSTUDIO (for parts).
     *
     * @return the Builder object.
     */
    public final Builder elementType(Map value) {
      this.elementType = value;
      return this;
    }

    public final ElementsUpdateReferencesRequestReferenceUpdatesToReference build() {
      return new com.onshape.api.requests.ElementsUpdateReferencesRequestReferenceUpdatesToReference(documentId,versionId,elementId,revision,partNumber,elementType);
    }
  }
}
