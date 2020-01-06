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
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to setApplicationElementThumbnail API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ThumbnailsSetApplicationElementThumbnailRequestThumbnails {
  /**
   * A per element unique identifier, which is consistent across document versions and microversions.
   */
  @JsonProperty("uniqueId")
  public String uniqueId;

  /**
   * The width of the image being supplied. Suggested minimum is 600 pixels.
   */
  @JsonProperty("imageWidth")
  public Number imageWidth;

  /**
   * The height of the image being supplied. Suggested minimum is 600 pixels.
   */
  @JsonProperty("imageHeight")
  public Number imageHeight;

  /**
   * If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
   */
  @JsonProperty("isPrimary")
  public Boolean isPrimary;

  /**
   * Base-64 encoded image string.
   */
  @JsonProperty("base64EncodedImage")
  public String base64EncodedImage;

  /**
   * An optional description of the image.
   */
  @JsonProperty("description")
  public String description;

  ThumbnailsSetApplicationElementThumbnailRequestThumbnails(String uniqueId, Number imageWidth,
      Number imageHeight, Boolean isPrimary, String base64EncodedImage, String description) {
    this.uniqueId = uniqueId;
    this.imageWidth = imageWidth;
    this.imageHeight = imageHeight;
    this.isPrimary = isPrimary;
    this.base64EncodedImage = base64EncodedImage;
    this.description = description;
  }

  /**
   * Get A per element unique identifier, which is consistent across document versions and microversions.
   *
   * @return A per element unique identifier, which is consistent across document versions and microversions.
   *
   */
  public final String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Get The width of the image being supplied. Suggested minimum is 600 pixels.
   *
   * @return The width of the image being supplied. Suggested minimum is 600 pixels.
   *
   */
  public final Number getImageWidth() {
    return this.imageWidth;
  }

  /**
   * Get The height of the image being supplied. Suggested minimum is 600 pixels.
   *
   * @return The height of the image being supplied. Suggested minimum is 600 pixels.
   *
   */
  public final Number getImageHeight() {
    return this.imageHeight;
  }

  /**
   * Get If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
   *
   * @return If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
   *
   */
  public final Boolean getIsPrimary() {
    return this.isPrimary;
  }

  /**
   * Get Base-64 encoded image string.
   *
   * @return Base-64 encoded image string.
   *
   */
  public final String getBase64EncodedImage() {
    return this.base64EncodedImage;
  }

  /**
   * Get An optional description of the image.
   *
   * @return An optional description of the image.
   *
   */
  public final String getDescription() {
    return this.description;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * A per element unique identifier, which is consistent across document versions and microversions.
     */
    private String uniqueId;

    /**
     * The width of the image being supplied. Suggested minimum is 600 pixels.
     */
    private Number imageWidth;

    /**
     * The height of the image being supplied. Suggested minimum is 600 pixels.
     */
    private Number imageHeight;

    /**
     * If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
     */
    private Boolean isPrimary;

    /**
     * Base-64 encoded image string.
     */
    private String base64EncodedImage;

    /**
     * An optional description of the image.
     */
    private String description;

    Builder() {
    }

    /**
     * Get A per element unique identifier, which is consistent across document versions and microversions.
     *
     * @return A per element unique identifier, which is consistent across document versions and microversions.
     *
     */
    public final String uniqueId() {
      return this.uniqueId;
    }

    /**
     * Set A per element unique identifier, which is consistent across document versions and microversions.
     *
     * @param value A per element unique identifier, which is consistent across document versions and microversions.
     *
     * @return the Builder object.
     */
    public final Builder uniqueId(String value) {
      this.uniqueId = value;
      return this;
    }

    /**
     * Get The width of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @return The width of the image being supplied. Suggested minimum is 600 pixels.
     *
     */
    public final Number imageWidth() {
      return this.imageWidth;
    }

    /**
     * Set The width of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @param value The width of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @return the Builder object.
     */
    public final Builder imageWidth(Number value) {
      this.imageWidth = value;
      return this;
    }

    /**
     * Get The height of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @return The height of the image being supplied. Suggested minimum is 600 pixels.
     *
     */
    public final Number imageHeight() {
      return this.imageHeight;
    }

    /**
     * Set The height of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @param value The height of the image being supplied. Suggested minimum is 600 pixels.
     *
     * @return the Builder object.
     */
    public final Builder imageHeight(Number value) {
      this.imageHeight = value;
      return this;
    }

    /**
     * Get If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
     *
     * @return If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
     *
     */
    public final Boolean isPrimary() {
      return this.isPrimary;
    }

    /**
     * Set If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
     *
     * @param value If true, this image is used as the element image. Only one thumbnail can be designated as the primary thumbnail.
     *
     * @return the Builder object.
     */
    public final Builder isPrimary(Boolean value) {
      this.isPrimary = value;
      return this;
    }

    /**
     * Get Base-64 encoded image string.
     *
     * @return Base-64 encoded image string.
     *
     */
    public final String base64EncodedImage() {
      return this.base64EncodedImage;
    }

    /**
     * Set Base-64 encoded image string.
     *
     * @param value Base-64 encoded image string.
     *
     * @return the Builder object.
     */
    public final Builder base64EncodedImage(String value) {
      this.base64EncodedImage = value;
      return this;
    }

    /**
     * Get An optional description of the image.
     *
     * @return An optional description of the image.
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set An optional description of the image.
     *
     * @param value An optional description of the image.
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    public final ThumbnailsSetApplicationElementThumbnailRequestThumbnails build() {
      return new com.onshape.api.requests.ThumbnailsSetApplicationElementThumbnailRequestThumbnails(uniqueId,imageWidth,imageHeight,isPrimary,base64EncodedImage,description);
    }
  }
}
