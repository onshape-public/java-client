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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for moveElementsToDocument API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsMoveElementsToDocumentResponse {
  /**
   * ID of new document
   */
  @JsonProperty("newDocumentId")
  @NotNull
  String newDocumentId;

  /**
   * Name of new document
   */
  @JsonProperty("newDocumentName")
  @NotNull
  String newDocumentName;

  /**
   * ID of new workspace
   */
  @JsonProperty("newWorkspaceId")
  @NotNull
  String newWorkspaceId;

  /**
   * the new version created in the target document, can be null
   */
  @JsonProperty("newDocumentVersionId")
  @NotNull
  String newDocumentVersionId;

  /**
   * Error message if the call fails
   */
  @JsonProperty("errorMessage")
  @NotNull
  String errorMessage;

  /**
   * true if elements have been moved to a new document
   */
  @JsonProperty("isNewDocument")
  @NotNull
  Boolean isNewDocument;

  /**
   * Get ID of new document
   *
   * @return ID of new document
   *
   */
  public final String getNewDocumentId() {
    return this.newDocumentId;
  }

  /**
   * Get Name of new document
   *
   * @return Name of new document
   *
   */
  public final String getNewDocumentName() {
    return this.newDocumentName;
  }

  /**
   * Get ID of new workspace
   *
   * @return ID of new workspace
   *
   */
  public final String getNewWorkspaceId() {
    return this.newWorkspaceId;
  }

  /**
   * Get the new version created in the target document, can be null
   *
   * @return the new version created in the target document, can be null
   *
   */
  public final String getNewDocumentVersionId() {
    return this.newDocumentVersionId;
  }

  /**
   * Get Error message if the call fails
   *
   * @return Error message if the call fails
   *
   */
  public final String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * Get true if elements have been moved to a new document
   *
   * @return true if elements have been moved to a new document
   *
   */
  public final Boolean getIsNewDocument() {
    return this.isNewDocument;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
