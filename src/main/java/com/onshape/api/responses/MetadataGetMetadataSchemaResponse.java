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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getMetadataSchema API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetMetadataSchemaResponse extends AbstractResponseObject {
  /**
   * Metadata schema ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Schema owner ID
   */
  @JsonProperty("ownerId")
  @NotNull
  String ownerId;

  /**
   * Schema owner type, which can be: 0: user, 1: company
   */
  @JsonProperty("ownerType")
  @NotNull
  Number ownerType;

  /**
   * Object type of the property, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   */
  @JsonProperty("objectType")
  @NotNull
  Number objectType;

  /**
   * URL to the schema
   */
  @JsonProperty("href")
  @NotNull
  String href;

  /**
   * Refresh this page of results
   * @param onshape The Onshape client object.
   * @return Updated response.
   * @throws OnshapeException On HTTP or serialization error.
   */
  public final MetadataGetMetadataSchemaResponse refresh(Onshape onshape) throws OnshapeException {
    return onshape.get(href, MetadataGetMetadataSchemaResponse.class);
  }

  /**
   * Get Metadata schema ID
   *
   * @return Metadata schema ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Schema owner ID
   *
   * @return Schema owner ID
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Schema owner type, which can be: 0: user, 1: company
   *
   * @return Schema owner type, which can be: 0: user, 1: company
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
  }

  /**
   * Get Object type of the property, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   *
   * @return Object type of the property, which can be: 0:GLOBAL, 1:DOCUMENT, 2:PART, 3:ASSEMBLY, 4:DRAWING, 5:PART_STUDIO, 6: BLOB_ELEMENT, 7:APP_ELEMENT, 8:VERSION, 9:WORKSPACE
   *
   */
  public final Number getObjectType() {
    return this.objectType;
  }

  /**
   * Get URL to the schema
   *
   * @return URL to the schema
   *
   */
  public final String getHref() {
    return this.href;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
