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
 * Object used in calls to transformOccurrences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesTransformOccurrencesRequestOccurrences {
  /**
   * The path describing an occurrence to transform.
   */
  @JsonProperty("path")
  public String[] path;

  AssembliesTransformOccurrencesRequestOccurrences(String[] path) {
    this.path = path;
  }

  /**
   * Get The path describing an occurrence to transform.
   *
   * @return The path describing an occurrence to transform.
   *
   */
  public final String[] getPath() {
    return this.path;
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
     * The path describing an occurrence to transform.
     */
    private String[] path;

    Builder() {
    }

    /**
     * Get The path describing an occurrence to transform.
     *
     * @return The path describing an occurrence to transform.
     *
     */
    public final String[] path() {
      return this.path;
    }

    /**
     * Set The path describing an occurrence to transform.
     *
     * @param value The path describing an occurrence to transform.
     *
     * @return the Builder object.
     */
    public final Builder path(String[] value) {
      this.path = value;
      return this;
    }

    public final AssembliesTransformOccurrencesRequestOccurrences build() {
      return new com.onshape.api.requests.AssembliesTransformOccurrencesRequestOccurrences(path);
    }
  }
}
