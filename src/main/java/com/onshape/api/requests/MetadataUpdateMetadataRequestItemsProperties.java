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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to updateMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataUpdateMetadataRequestItemsProperties {
  /**
   * Metadata schema property id
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
   */
  @JsonProperty("value")
  public Map value;

  MetadataUpdateMetadataRequestItemsProperties(String propertyId, Map value) {
    this.propertyId = propertyId;
    this.value = value;
  }

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
   * Get Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
   *
   * @return Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
   *
   */
  public final Map getValue() {
    return this.value;
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
     * Metadata schema property id
     */
    private String propertyId;

    /**
     * Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
     */
    private Map value;

    Builder() {
    }

    /**
     * Get Metadata schema property id
     *
     * @return Metadata schema property id
     *
     */
    public final String propertyId() {
      return this.propertyId;
    }

    /**
     * Set Metadata schema property id
     *
     * @param value Metadata schema property id
     *
     * @return the Builder object.
     */
    public final Builder propertyId(String value) {
      this.propertyId = value;
      return this;
    }

    /**
     * Get Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
     *
     * @return Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
     *
     */
    public final Map value() {
      return this.value;
    }

    /**
     * Set Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
     *
     * @param value Metadata property value, (JSON type of the field needs to be compatible with the type of the property as defined in the Metadata Schema, it can be Number, String, Boolean, etc)
     *
     * @return the Builder object.
     */
    public final Builder value(Map value) {
      this.value = value;
      return this;
    }

    public final MetadataUpdateMetadataRequestItemsProperties build() {
      return new com.onshape.api.requests.MetadataUpdateMetadataRequestItemsProperties(propertyId,value);
    }
  }
}
