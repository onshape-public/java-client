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
 * Response object for getPartListMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetPartListMetadataResponse extends AbstractResponseObject {
  /**
   * URL of the previous page of the collection, can be null
   */
  @JsonProperty("prev")
  @NotNull
  String prev;

  /**
   * URL of current page of the response
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * URL of the next page of the collection, can be null
   */
  @JsonProperty("next")
  @NotNull
  String next;

  /**
   * Collection items
   */
  @JsonProperty("items")
  @NotNull
  MetadataGetPartListMetadataResponseItems[] items;

  /**
   * Fetch next page of results
   * @param onshape The Onshape client object.
   * @return Next page of results or null if this is last page.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final MetadataGetPartListMetadataResponse next(Onshape onshape) throws OnshapeException {
    return (next==null ? null : onshape.get(next, MetadataGetPartListMetadataResponse.class));
  }

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final MetadataGetPartListMetadataResponse refresh(Onshape onshape) throws
      OnshapeException {
    return onshape.get(href, MetadataGetPartListMetadataResponse.class);
  }

  /**
   * Get URL of the previous page of the collection, can be null
   *
   * @return URL of the previous page of the collection, can be null
   *
   */
  public final String getPrev() {
    return this.prev;
  }

  /**
   * Get URL of current page of the response
   *
   * @return URL of current page of the response
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get URL of the next page of the collection, can be null
   *
   * @return URL of the next page of the collection, can be null
   *
   */
  public final String getNext() {
    return this.next;
  }

  /**
   * Get Collection items
   *
   * @return Collection items
   *
   */
  public final MetadataGetPartListMetadataResponseItems[] getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
