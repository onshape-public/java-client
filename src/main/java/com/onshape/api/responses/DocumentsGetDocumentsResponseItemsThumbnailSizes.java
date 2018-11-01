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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getDocuments API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetDocumentsResponseItemsThumbnailSizes {
  /**
   * A size description string (e.g. 300x300)
   */
  @JsonProperty("size")
  public String size;

  /**
   * The image mediaType
   */
  @JsonProperty("mediaType")
  public String mediaType;

  /**
   * A URI to the thumbnail
   */
  @JsonProperty("href")
  public String href;

  /**
   * Reserved for future use
   */
  @JsonProperty("viewOrientation")
  public String viewOrientation;

  /**
   * Reserved for future use
   */
  @JsonProperty("renderMode")
  public String renderMode;

  /**
   * Get A size description string (e.g. 300x300)
   *
   * @return A size description string (e.g. 300x300)
   *
   */
  public final String getSize() {
    return this.size;
  }

  /**
   * Get The image mediaType
   *
   * @return The image mediaType
   *
   */
  public final String getMediaType() {
    return this.mediaType;
  }

  /**
   * Get A URI to the thumbnail
   *
   * @return A URI to the thumbnail
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Reserved for future use
   *
   * @return Reserved for future use
   *
   */
  public final String getViewOrientation() {
    return this.viewOrientation;
  }

  /**
   * Get Reserved for future use
   *
   * @return Reserved for future use
   *
   */
  public final String getRenderMode() {
    return this.renderMode;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
