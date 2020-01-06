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
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updatePartMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataUpdatePartMetadataResponseProperties extends AbstractResponseObject {
  /**
   * Metadata schema property id
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Status of the property update, one of &quot;SUCCEEDED&quot;, &quot;PARTIALLY_SUCCEEDED&quot;, &quot;UNAUTHORIZED&quot;, &quot;NOT_FOUND&quot;, &quot;NOTHING_TO_UPDATE&quot;, &quot;INVALID_PARAMS&quot;, &quot;CONFLICT&quot;, &quot;FAILED&quot;
   */
  @JsonProperty("status")
  public String status;

  /**
   * Error message if update failed
   */
  @JsonProperty("errorMessage")
  public String errorMessage;

  /**
   * Get Metadata schema property id
   *
   * @return Metadata schema property id
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  /**
   * Get Status of the property update, one of &quot;SUCCEEDED&quot;, &quot;PARTIALLY_SUCCEEDED&quot;, &quot;UNAUTHORIZED&quot;, &quot;NOT_FOUND&quot;, &quot;NOTHING_TO_UPDATE&quot;, &quot;INVALID_PARAMS&quot;, &quot;CONFLICT&quot;, &quot;FAILED&quot;
   *
   * @return Status of the property update, one of &quot;SUCCEEDED&quot;, &quot;PARTIALLY_SUCCEEDED&quot;, &quot;UNAUTHORIZED&quot;, &quot;NOT_FOUND&quot;, &quot;NOTHING_TO_UPDATE&quot;, &quot;INVALID_PARAMS&quot;, &quot;CONFLICT&quot;, &quot;FAILED&quot;
   *
   */
  public final String getStatus() {
    return this.status;
  }

  /**
   * Get Error message if update failed
   *
   * @return Error message if update failed
   *
   */
  public final String getErrorMessage() {
    return this.errorMessage;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
