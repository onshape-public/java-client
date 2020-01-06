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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.ResponseWithDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getRevisionHistoryInCompany API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetRevisionHistoryInCompanyResponseItems extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * Revision Id
   */
  @JsonProperty("id")
  public String id;

  /**
   * Part number of the revision
   */
  @JsonProperty("partNumber")
  public String partNumber;

  /**
   * revision name of the revision
   */
  @JsonProperty("revision")
  public String revision;

  /**
   * Configuration of the Part studio or Assembly element
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Whether the revision is obsolete
   */
  @JsonProperty("isObsolete")
  public Boolean isObsolete;

  /**
   * Document ID that contains the revision
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Name of the document that contains the revision
   */
  @JsonProperty("documentName")
  public String documentName;

  /**
   * Version ID that contains the revision
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Name of the Version that contains the revision
   */
  @JsonProperty("versionName")
  public String versionName;

  /**
   * Element ID that contains the revision
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * An URI to view the revision
   */
  @JsonProperty("viewRef")
  public String viewRef;

  /**
   * Type of element
   */
  @JsonProperty("elementType")
  public Number elementType;

  /**
   * Any error message if not revision is not accessible
   */
  @JsonProperty("errorMessage")
  public String errorMessage;

  /**
   * Revision Id of the previous revision if any
   */
  @JsonProperty("previousRevisionId")
  public String previousRevisionId;

  /**
   * Revision Id of the next revision if any
   */
  @JsonProperty("nextRevisionId")
  public String nextRevisionId;

  /**
   * Deterministic part ID if revision is of a part
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Release package ID that created this revision
   */
  @JsonProperty("releaseId")
  public String releaseId;

  /**
   * Get Revision Id
   *
   * @return Revision Id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Part number of the revision
   *
   * @return Part number of the revision
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get revision name of the revision
   *
   * @return revision name of the revision
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Configuration of the Part studio or Assembly element
   *
   * @return Configuration of the Part studio or Assembly element
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Whether the revision is obsolete
   *
   * @return Whether the revision is obsolete
   *
   */
  public final Boolean getIsObsolete() {
    return this.isObsolete;
  }

  /**
   * Get Document ID that contains the revision
   *
   * @return Document ID that contains the revision
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Name of the document that contains the revision
   *
   * @return Name of the document that contains the revision
   *
   */
  public final String getDocumentName() {
    return this.documentName;
  }

  /**
   * Get Version ID that contains the revision
   *
   * @return Version ID that contains the revision
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Name of the Version that contains the revision
   *
   * @return Name of the Version that contains the revision
   *
   */
  public final String getVersionName() {
    return this.versionName;
  }

  /**
   * Get Element ID that contains the revision
   *
   * @return Element ID that contains the revision
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get An URI to view the revision
   *
   * @return An URI to view the revision
   *
   */
  public final String getViewRef() {
    return this.viewRef;
  }

  /**
   * Get Type of element
   *
   * @return Type of element
   *
   */
  public final Number getElementType() {
    return this.elementType;
  }

  /**
   * Get Any error message if not revision is not accessible
   *
   * @return Any error message if not revision is not accessible
   *
   */
  public final String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * Get Revision Id of the previous revision if any
   *
   * @return Revision Id of the previous revision if any
   *
   */
  public final String getPreviousRevisionId() {
    return this.previousRevisionId;
  }

  /**
   * Get Revision Id of the next revision if any
   *
   * @return Revision Id of the next revision if any
   *
   */
  public final String getNextRevisionId() {
    return this.nextRevisionId;
  }

  /**
   * Get Deterministic part ID if revision is of a part
   *
   * @return Deterministic part ID if revision is of a part
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Release package ID that created this revision
   *
   * @return Release package ID that created this revision
   *
   */
  public final String getReleaseId() {
    return this.releaseId;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
