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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getTranslations API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class TranslationsGetTranslationsResponse extends AbstractResponseObject {
  /**
   * URI to retrieve next batch
   */
  @JsonProperty("next")
  @NotNull
  String next;

  /**
   * URI to retrieve previous batch
   */
  @JsonProperty("previous")
  @NotNull
  String previous;

  /**
   * Whether there are more entries to retrieve
   */
  @JsonProperty("hasNext")
  @NotNull
  Boolean hasNext;

  /**
   * List of items
   */
  @JsonProperty("items")
  @NotNull
  TranslationsGetTranslationsResponseItems[] items;

  /**
   * Fetch next page of results
   * @param onshape The Onshape client object.
   * @return Next page of results or null if this is last page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final TranslationsGetTranslationsResponse next(Onshape onshape) throws OnshapeException {
    return (next==null ? null : onshape.get(next, TranslationsGetTranslationsResponse.class));
  }

  /**
   * Fetch previous page of results
   * @param onshape The Onshape client object.
   * @return Previous page of results or null if this is first page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final TranslationsGetTranslationsResponse previous(Onshape onshape) throws
      OnshapeException {
    return (previous==null ? null : onshape.get(previous, TranslationsGetTranslationsResponse.class));
  }

  /**
   * Get URI to retrieve next batch
   *
   * @return URI to retrieve next batch
   *
   */
  public final String getNext() {
    return this.next;
  }

  /**
   * Get URI to retrieve previous batch
   *
   * @return URI to retrieve previous batch
   *
   */
  public final String getPrevious() {
    return this.previous;
  }

  /**
   * Get Whether there are more entries to retrieve
   *
   * @return Whether there are more entries to retrieve
   *
   */
  public final Boolean getHasNext() {
    return this.hasNext;
  }

  /**
   * Get List of items
   *
   * @return List of items
   *
   */
  public final TranslationsGetTranslationsResponseItems[] getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
