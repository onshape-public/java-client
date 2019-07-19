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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Response object for getLatestInDocumentOrCompany API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class RevisionsGetLatestInDocumentOrCompanyResponse {
  /**
   * Document id.
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Document name.
   */
  @JsonProperty("documentName")
  @NotNull
  String documentName;

  /**
   * Element id.
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * Part number.
   */
  @JsonProperty("partNumber")
  @NotNull
  String partNumber;

  /**
   * Element type.
   */
  @JsonProperty("elementType")
  @NotNull
  Number elementType;

  /**
   * Version id.
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * Version name.
   */
  @JsonProperty("versionName")
  @NotNull
  String versionName;

  /**
   * Revision.
   */
  @JsonProperty("revision")
  @NotNull
  String revision;

  /**
   * Previous revision id.
   */
  @JsonProperty("previousRevisionId")
  @NotNull
  String previousRevisionId;

  /**
   * Next revision id.
   */
  @JsonProperty("nextRevisionId")
  @NotNull
  String nextRevisionId;

  /**
   * Is obsolete.
   */
  @JsonProperty("isObsolete")
  @NotNull
  Boolean isObsolete;

  /**
   * Can current user obsolete.
   */
  @JsonProperty("canCurrentUserObsolete")
  @NotNull
  Boolean canCurrentUserObsolete;

  /**
   * Company id.
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Release id.
   */
  @JsonProperty("releaseId")
  @NotNull
  String releaseId;

  /**
   * Obsoletion package id.
   */
  @JsonProperty("obsoletionPackageId")
  @NotNull
  String obsoletionPackageId;

  /**
   * Auto obsoletion release id.
   */
  @JsonProperty("autoObsoletionReleaseId")
  @NotNull
  String autoObsoletionReleaseId;

  /**
   * Auto obsoletion release name.
   */
  @JsonProperty("autoObsoletionReleaseName")
  @NotNull
  String autoObsoletionReleaseName;

  /**
   * Release name.
   */
  @JsonProperty("releaseName")
  @NotNull
  String releaseName;

  /**
   * Release created date.
   */
  @JsonProperty("releaseCreatedDate")
  @NotNull
  String releaseCreatedDate;

  /**
   * Released by (user object).
   */
  @JsonProperty("releasedBy")
  @NotNull
  Map releasedBy;

  /**
   * Insertable id.
   */
  @JsonProperty("insertableId")
  @NotNull
  String insertableId;

  /**
   * Revision rule id.
   */
  @JsonProperty("revisionRuleId")
  @NotNull
  String revisionRuleId;

  /**
   * Mimetype.
   */
  @JsonProperty("mimeType")
  @NotNull
  String mimeType;

  /**
   * Configuration.
   */
  @JsonProperty("configuration")
  @NotNull
  String configuration;

  /**
   * Error message.
   */
  @JsonProperty("errorMessage")
  @NotNull
  String errorMessage;

  /**
   * Part id.
   */
  @JsonProperty("partId")
  @NotNull
  String partId;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, elementId);
  }

  /**
   * Get Document id.
   *
   * @return Document id.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Document name.
   *
   * @return Document name.
   *
   */
  public final String getDocumentName() {
    return this.documentName;
  }

  /**
   * Get Element id.
   *
   * @return Element id.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Part number.
   *
   * @return Part number.
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Element type.
   *
   * @return Element type.
   *
   */
  public final Number getElementType() {
    return this.elementType;
  }

  /**
   * Get Version id.
   *
   * @return Version id.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Version name.
   *
   * @return Version name.
   *
   */
  public final String getVersionName() {
    return this.versionName;
  }

  /**
   * Get Revision.
   *
   * @return Revision.
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Previous revision id.
   *
   * @return Previous revision id.
   *
   */
  public final String getPreviousRevisionId() {
    return this.previousRevisionId;
  }

  /**
   * Get Next revision id.
   *
   * @return Next revision id.
   *
   */
  public final String getNextRevisionId() {
    return this.nextRevisionId;
  }

  /**
   * Get Is obsolete.
   *
   * @return Is obsolete.
   *
   */
  public final Boolean getIsObsolete() {
    return this.isObsolete;
  }

  /**
   * Get Can current user obsolete.
   *
   * @return Can current user obsolete.
   *
   */
  public final Boolean getCanCurrentUserObsolete() {
    return this.canCurrentUserObsolete;
  }

  /**
   * Get Company id.
   *
   * @return Company id.
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Release id.
   *
   * @return Release id.
   *
   */
  public final String getReleaseId() {
    return this.releaseId;
  }

  /**
   * Get Obsoletion package id.
   *
   * @return Obsoletion package id.
   *
   */
  public final String getObsoletionPackageId() {
    return this.obsoletionPackageId;
  }

  /**
   * Get Auto obsoletion release id.
   *
   * @return Auto obsoletion release id.
   *
   */
  public final String getAutoObsoletionReleaseId() {
    return this.autoObsoletionReleaseId;
  }

  /**
   * Get Auto obsoletion release name.
   *
   * @return Auto obsoletion release name.
   *
   */
  public final String getAutoObsoletionReleaseName() {
    return this.autoObsoletionReleaseName;
  }

  /**
   * Get Release name.
   *
   * @return Release name.
   *
   */
  public final String getReleaseName() {
    return this.releaseName;
  }

  /**
   * Get Release created date.
   *
   * @return Release created date.
   *
   */
  public final String getReleaseCreatedDate() {
    return this.releaseCreatedDate;
  }

  /**
   * Get Released by (user object).
   *
   * @return Released by (user object).
   *
   */
  public final Map getReleasedBy() {
    return this.releasedBy;
  }

  /**
   * Get Insertable id.
   *
   * @return Insertable id.
   *
   */
  public final String getInsertableId() {
    return this.insertableId;
  }

  /**
   * Get Revision rule id.
   *
   * @return Revision rule id.
   *
   */
  public final String getRevisionRuleId() {
    return this.revisionRuleId;
  }

  /**
   * Get Mimetype.
   *
   * @return Mimetype.
   *
   */
  public final String getMimeType() {
    return this.mimeType;
  }

  /**
   * Get Configuration.
   *
   * @return Configuration.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Error message.
   *
   * @return Error message.
   *
   */
  public final String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * Get Part id.
   *
   * @return Part id.
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
