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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getDocuments API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsGetDocumentsResponse extends AbstractResponseObject {
  /**
   * URL of previous page of results
   */
  @JsonProperty("previous")
  @NotNull
  String previous;

  /**
   * URL of current page of results
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * URL of next page of results
   */
  @JsonProperty("next")
  @NotNull
  String next;

  /**
   * Array of documents
   */
  @JsonProperty("items")
  @NotNull
  DocumentsGetDocumentsResponseItems[] items;

  /**
   * Fetch next page of results
   * @param onshape The Onshape client object.
   * @return Next page of results or null if this is last page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final DocumentsGetDocumentsResponse next(Onshape onshape) throws OnshapeException {
    return (next==null ? null : onshape.get(next, DocumentsGetDocumentsResponse.class));
  }

  /**
   * Fetch previous page of results
   * @param onshape The Onshape client object.
   * @return Previous page of results or null if this is first page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final DocumentsGetDocumentsResponse previous(Onshape onshape) throws OnshapeException {
    return (previous==null ? null : onshape.get(previous, DocumentsGetDocumentsResponse.class));
  }

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final DocumentsGetDocumentsResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, DocumentsGetDocumentsResponse.class);
  }

  /**
   * Get URL of previous page of results
   *
   * @return URL of previous page of results
   *
   */
  public final String getPrevious() {
    return this.previous;
  }

  /**
   * Get URL of current page of results
   *
   * @return URL of current page of results
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get URL of next page of results
   *
   * @return URL of next page of results
   *
   */
  public final String getNext() {
    return this.next;
  }

  /**
   * Get Array of documents
   *
   * @return Array of documents
   *
   */
  public final DocumentsGetDocumentsResponseItems[] getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
