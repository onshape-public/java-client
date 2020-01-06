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
 * Object used in calls to updateFeature API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosUpdateFeatureRequestFeature {
  /**
   * The type number for the feature structure
   */
  @JsonProperty("type")
  public String type;

  /**
   * The type name for the feature structure
   */
  @JsonProperty("typeName")
  public String typeName;

  /**
   * The serialized feature definition
   */
  @JsonProperty("message")
  public Map message;

  PartStudiosUpdateFeatureRequestFeature(String type, String typeName, Map message) {
    this.type = type;
    this.typeName = typeName;
    this.message = message;
  }

  /**
   * Get The type number for the feature structure
   *
   * @return The type number for the feature structure
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get The type name for the feature structure
   *
   * @return The type name for the feature structure
   *
   */
  public final String getTypeName() {
    return this.typeName;
  }

  /**
   * Get The serialized feature definition
   *
   * @return The serialized feature definition
   *
   */
  public final Map getMessage() {
    return this.message;
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
     * The type number for the feature structure
     */
    private String type;

    /**
     * The type name for the feature structure
     */
    private String typeName;

    /**
     * The serialized feature definition
     */
    private Map message;

    Builder() {
    }

    /**
     * Get The type number for the feature structure
     *
     * @return The type number for the feature structure
     *
     */
    public final String type() {
      return this.type;
    }

    /**
     * Set The type number for the feature structure
     *
     * @param value The type number for the feature structure
     *
     * @return the Builder object.
     */
    public final Builder type(String value) {
      this.type = value;
      return this;
    }

    /**
     * Get The type name for the feature structure
     *
     * @return The type name for the feature structure
     *
     */
    public final String typeName() {
      return this.typeName;
    }

    /**
     * Set The type name for the feature structure
     *
     * @param value The type name for the feature structure
     *
     * @return the Builder object.
     */
    public final Builder typeName(String value) {
      this.typeName = value;
      return this;
    }

    /**
     * Get The serialized feature definition
     *
     * @return The serialized feature definition
     *
     */
    public final Map message() {
      return this.message;
    }

    /**
     * Set The serialized feature definition
     *
     * @param value The serialized feature definition
     *
     * @return the Builder object.
     */
    public final Builder message(Map value) {
      this.message = value;
      return this;
    }

    public final PartStudiosUpdateFeatureRequestFeature build() {
      return new com.onshape.api.requests.PartStudiosUpdateFeatureRequestFeature(type,typeName,message);
    }
  }
}
