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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.AbstractResponseObject;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.ResponseWithDocument;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.CompletableFuture;
import javax.validation.constraints.NotNull;

/**
 * Response object for createTranslation API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesCreateTranslationResponse extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * The id of this translation
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * The URI for accessing this translation
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * The id of the document that contains the translation source
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * The id of the document workspace that contains the translation source
   */
  @JsonProperty("workspaceId")
  @NotNull
  String workspaceId;

  /**
   * The id of the document version that contains the translation source
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * The id of the element being translated
   */
  @JsonProperty("requestElementId")
  @NotNull
  String requestElementId;

  /**
   * The state of this translation request. (ACTIVE|DONE|FAILED)
   */
  @JsonProperty("requestState")
  @NotNull
  String requestState;

  /**
   * The id of the document containing the translation results, if stored in the document, or with which the externalDataIds are associated
   */
  @JsonProperty("resultDocumentId")
  @NotNull
  String resultDocumentId;

  /**
   * The id of the workspace containing the translation results, if stored in the document
   */
  @JsonProperty("resultWorkspaceId")
  @NotNull
  String resultWorkspaceId;

  /**
   * The ids of the elements containing the translation results, if stored in the document
   */
  @JsonProperty("resultElementIds")
  @NotNull
  String[] resultElementIds;

  /**
   * The ids of the external data containing the translation results, if not stored in the document
   */
  @JsonProperty("resultExternalDataIds")
  @NotNull
  String[] resultExternalDataIds;

  /**
   * A string indicating the reason for the failure, if known.
   */
  @JsonProperty("failureReason")
  @NotNull
  String failureReason;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final AssembliesCreateTranslationResponse refresh(Onshape onshape) throws
      OnshapeException {
    return onshape.get(href, AssembliesCreateTranslationResponse.class);
  }

  /**
   * Returns a CompletableFuture that will be complete when this process is no longer in an "ACTIVE" state
   * @param onshape The Onshape client object.
   * @return Future for this response.
   */
  public final CompletableFuture<AssembliesCreateTranslationResponse> asFuture(Onshape onshape) {
    if (!"ACTIVE".equals(getRequestState())) {
      CompletableFuture<AssembliesCreateTranslationResponse> completableFuture = new CompletableFuture<>();
      completableFuture.complete(this);
      return completableFuture;
    }
    return onshape.getPollingHandler().poll(href, AssembliesCreateTranslationResponse.class, (response) -> !"ACTIVE".equals(response.getRequestState()));
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, workspaceId, null, null, null);
  }

  /**
   * Get The id of this translation
   *
   * @return The id of this translation
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get The URI for accessing this translation
   *
   * @return The URI for accessing this translation
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get The id of the document that contains the translation source
   *
   * @return The id of the document that contains the translation source
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The id of the document workspace that contains the translation source
   *
   * @return The id of the document workspace that contains the translation source
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Get The id of the document version that contains the translation source
   *
   * @return The id of the document version that contains the translation source
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get The id of the element being translated
   *
   * @return The id of the element being translated
   *
   */
  public final String getRequestElementId() {
    return this.requestElementId;
  }

  /**
   * Get The state of this translation request. (ACTIVE|DONE|FAILED)
   *
   * @return The state of this translation request. (ACTIVE|DONE|FAILED)
   *
   */
  public final String getRequestState() {
    return this.requestState;
  }

  /**
   * Get The id of the document containing the translation results, if stored in the document, or with which the externalDataIds are associated
   *
   * @return The id of the document containing the translation results, if stored in the document, or with which the externalDataIds are associated
   *
   */
  public final String getResultDocumentId() {
    return this.resultDocumentId;
  }

  /**
   * Get The id of the workspace containing the translation results, if stored in the document
   *
   * @return The id of the workspace containing the translation results, if stored in the document
   *
   */
  public final String getResultWorkspaceId() {
    return this.resultWorkspaceId;
  }

  /**
   * Get The ids of the elements containing the translation results, if stored in the document
   *
   * @return The ids of the elements containing the translation results, if stored in the document
   *
   */
  public final String[] getResultElementIds() {
    return this.resultElementIds;
  }

  /**
   * Get The ids of the external data containing the translation results, if not stored in the document
   *
   * @return The ids of the external data containing the translation results, if not stored in the document
   *
   */
  public final String[] getResultExternalDataIds() {
    return this.resultExternalDataIds;
  }

  /**
   * Get A string indicating the reason for the failure, if known.
   *
   * @return A string indicating the reason for the failure, if known.
   *
   */
  public final String getFailureReason() {
    return this.failureReason;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
