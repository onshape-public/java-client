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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getTranslations API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class TranslationsGetTranslationsResponseItems {
  /**
   * The id of this translation
   */
  @JsonProperty("id")
  public String id;

  /**
   * The URI for accessing this translation
   */
  @JsonProperty("href")
  public String href;

  /**
   * The id of the document that contains the translation
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * The id of the document workspace that contains the translation
   */
  @JsonProperty("workspaceId")
  public String workspaceId;

  /**
   * The id of the element being translated
   */
  @JsonProperty("requestElementId")
  public String requestElementId;

  /**
   * The state if of this translation request. (ACTIVE|DONE|FAILED)
   */
  @JsonProperty("requestState")
  public String requestState;

  /**
   * The ids of the elements containing the translation results, if stored in the document
   */
  @JsonProperty("resultElementIds")
  public String[] resultElementIds;

  /**
   * The ids of the external data containing the translation results, if not stored in the document
   */
  @JsonProperty("resultExternalDataIds")
  public String[] resultExternalDataIds;

  /**
   * A string indicating the reason for the failure, if known.
   */
  @JsonProperty("failureReason")
  public String failureReason;

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
   * Get The id of the document that contains the translation
   *
   * @return The id of the document that contains the translation
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The id of the document workspace that contains the translation
   *
   * @return The id of the document workspace that contains the translation
   *
   */
  public final String getWorkspaceId() {
    return this.workspaceId;
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
   * Get The state if of this translation request. (ACTIVE|DONE|FAILED)
   *
   * @return The state if of this translation request. (ACTIVE|DONE|FAILED)
   *
   */
  public final String getRequestState() {
    return this.requestState;
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

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, workspaceId, null, null, null);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
