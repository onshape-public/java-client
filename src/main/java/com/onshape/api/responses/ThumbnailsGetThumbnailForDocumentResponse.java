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
 * Response object for getThumbnailForDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ThumbnailsGetThumbnailForDocumentResponse extends AbstractResponseObject {
  /**
   * Thumbnail Id
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * The base URI for accessing these thumbnails
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * List of thumbnails in available sizes
   */
  @JsonProperty("sizes")
  @NotNull
  ThumbnailsGetThumbnailForDocumentResponseSizes[] sizes;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final ThumbnailsGetThumbnailForDocumentResponse refresh(Onshape onshape) throws
      OnshapeException {
    return onshape.get(href, ThumbnailsGetThumbnailForDocumentResponse.class);
  }

  /**
   * Get Thumbnail Id
   *
   * @return Thumbnail Id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get The base URI for accessing these thumbnails
   *
   * @return The base URI for accessing these thumbnails
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get List of thumbnails in available sizes
   *
   * @return List of thumbnails in available sizes
   *
   */
  public final ThumbnailsGetThumbnailForDocumentResponseSizes[] getSizes() {
    return this.sizes;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
