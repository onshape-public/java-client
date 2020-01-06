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
 * Object used in calls to updateElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsUpdateElementRequestChanges {
  /**
   * The subelement that should be modified
   */
  @JsonProperty("subelementId")
  public String subelementId;

  /**
   * The initial content for a subelement (Base-64 encoded)
   */
  @JsonProperty("baseContent")
  public String baseContent;

  /**
   * A delta for a sub-element (Base-64 encoded)
   */
  @JsonProperty("delta")
  public String delta;

  AppElementsUpdateElementRequestChanges(String subelementId, String baseContent, String delta) {
    this.subelementId = subelementId;
    this.baseContent = baseContent;
    this.delta = delta;
  }

  /**
   * Get The subelement that should be modified
   *
   * @return The subelement that should be modified
   *
   */
  public final String getSubelementId() {
    return this.subelementId;
  }

  /**
   * Get The initial content for a subelement (Base-64 encoded)
   *
   * @return The initial content for a subelement (Base-64 encoded)
   *
   */
  public final String getBaseContent() {
    return this.baseContent;
  }

  /**
   * Get A delta for a sub-element (Base-64 encoded)
   *
   * @return A delta for a sub-element (Base-64 encoded)
   *
   */
  public final String getDelta() {
    return this.delta;
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
     * The subelement that should be modified
     */
    private String subelementId;

    /**
     * The initial content for a subelement (Base-64 encoded)
     */
    private String baseContent;

    /**
     * A delta for a sub-element (Base-64 encoded)
     */
    private String delta;

    Builder() {
    }

    /**
     * Get The subelement that should be modified
     *
     * @return The subelement that should be modified
     *
     */
    public final String subelementId() {
      return this.subelementId;
    }

    /**
     * Set The subelement that should be modified
     *
     * @param value The subelement that should be modified
     *
     * @return the Builder object.
     */
    public final Builder subelementId(String value) {
      this.subelementId = value;
      return this;
    }

    /**
     * Get The initial content for a subelement (Base-64 encoded)
     *
     * @return The initial content for a subelement (Base-64 encoded)
     *
     */
    public final String baseContent() {
      return this.baseContent;
    }

    /**
     * Set The initial content for a subelement (Base-64 encoded)
     *
     * @param value The initial content for a subelement (Base-64 encoded)
     *
     * @return the Builder object.
     */
    public final Builder baseContent(String value) {
      this.baseContent = value;
      return this;
    }

    /**
     * Get A delta for a sub-element (Base-64 encoded)
     *
     * @return A delta for a sub-element (Base-64 encoded)
     *
     */
    public final String delta() {
      return this.delta;
    }

    /**
     * Set A delta for a sub-element (Base-64 encoded)
     *
     * @param value A delta for a sub-element (Base-64 encoded)
     *
     * @return the Builder object.
     */
    public final Builder delta(String value) {
      this.delta = value;
      return this;
    }

    public final AppElementsUpdateElementRequestChanges build() {
      return new com.onshape.api.requests.AppElementsUpdateElementRequestChanges(subelementId,baseContent,delta);
    }
  }
}
