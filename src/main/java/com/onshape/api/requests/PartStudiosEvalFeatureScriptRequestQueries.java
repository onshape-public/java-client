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

/**
 * Object used in calls to evalFeatureScript API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosEvalFeatureScriptRequestQueries {
  /**
   * Feature Script identifier for a query entry
   */
  @JsonProperty("key")
  public String key;

  /**
   * A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
   */
  @JsonProperty("value")
  public String[] value;

  PartStudiosEvalFeatureScriptRequestQueries(String key, String[] value) {
    this.key = key;
    this.value = value;
  }

  /**
   * Get Feature Script identifier for a query entry
   *
   * @return Feature Script identifier for a query entry
   *
   */
  public final String getKey() {
    return this.key;
  }

  /**
   * Get A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
   *
   * @return A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
   *
   */
  public final String[] getValue() {
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
     * Feature Script identifier for a query entry
     */
    private String key;

    /**
     * A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
     */
    private String[] value;

    Builder() {
    }

    /**
     * Get Feature Script identifier for a query entry
     *
     * @return Feature Script identifier for a query entry
     *
     */
    public final String key() {
      return this.key;
    }

    /**
     * Set Feature Script identifier for a query entry
     *
     * @param value Feature Script identifier for a query entry
     *
     * @return the Builder object.
     */
    public final Builder key(String value) {
      this.key = value;
      return this;
    }

    /**
     * Get A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
     *
     * @return A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
     *
     */
    public final String[] value() {
      return this.value;
    }

    /**
     * Set A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
     *
     * @param value A list of geometryId values which will be converted to internal query form within the FeatureScript function evaluation.
     *
     * @return the Builder object.
     */
    public final Builder value(String[] value) {
      this.value = value;
      return this;
    }

    public final PartStudiosEvalFeatureScriptRequestQueries build() {
      return new com.onshape.api.requests.PartStudiosEvalFeatureScriptRequestQueries(key,value);
    }
  }
}
