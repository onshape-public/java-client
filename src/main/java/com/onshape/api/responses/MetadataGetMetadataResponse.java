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
 * Response object for getMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataResponse extends AbstractResponseObject {
  /**
   * List of elements
   */
  @JsonProperty("elements")
  MetadataGetMetadataResponseElements elements;

  /**
   * URL of current object of the response
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Metadata properties defined in the schema
   */
  @JsonProperty("properties")
  @NotNull
  MetadataGetMetadataResponseProperties[] properties;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final MetadataGetMetadataResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, MetadataGetMetadataResponse.class);
  }

  /**
   * Get List of elements
   *
   * @return List of elements
   *
   */
  public final MetadataGetMetadataResponseElements getElements() {
    return this.elements;
  }

  /**
   * Get URL of current object of the response
   *
   * @return URL of current object of the response
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Metadata properties defined in the schema
   *
   * @return Metadata properties defined in the schema
   *
   */
  public final MetadataGetMetadataResponseProperties[] getProperties() {
    return this.properties;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
