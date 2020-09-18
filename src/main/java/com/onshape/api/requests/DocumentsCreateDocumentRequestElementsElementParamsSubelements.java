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
 * Object used in calls to createDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCreateDocumentRequestElementsElementParamsSubelements {
  /**
   * app element subelement id
   */
  @JsonProperty("subelementId")
  public String subelementId;

  /**
   * app element subelement base content
   */
  @JsonProperty("baseContent")
  public String baseContent;

  /**
   * app element subelement delta
   */
  @JsonProperty("delta")
  public String delta;

  DocumentsCreateDocumentRequestElementsElementParamsSubelements(String subelementId,
      String baseContent, String delta) {
    this.subelementId = subelementId;
    this.baseContent = baseContent;
    this.delta = delta;
  }

  /**
   * Get app element subelement id
   *
   * @return app element subelement id
   *
   */
  public final String getSubelementId() {
    return this.subelementId;
  }

  /**
   * Get app element subelement base content
   *
   * @return app element subelement base content
   *
   */
  public final String getBaseContent() {
    return this.baseContent;
  }

  /**
   * Get app element subelement delta
   *
   * @return app element subelement delta
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
     * app element subelement id
     */
    private String subelementId;

    /**
     * app element subelement base content
     */
    private String baseContent;

    /**
     * app element subelement delta
     */
    private String delta;

    Builder() {
    }

    /**
     * Get app element subelement id
     *
     * @return app element subelement id
     *
     */
    public final String subelementId() {
      return this.subelementId;
    }

    /**
     * Set app element subelement id
     *
     * @param value app element subelement id
     *
     * @return the Builder object.
     */
    public final Builder subelementId(String value) {
      this.subelementId = value;
      return this;
    }

    /**
     * Get app element subelement base content
     *
     * @return app element subelement base content
     *
     */
    public final String baseContent() {
      return this.baseContent;
    }

    /**
     * Set app element subelement base content
     *
     * @param value app element subelement base content
     *
     * @return the Builder object.
     */
    public final Builder baseContent(String value) {
      this.baseContent = value;
      return this;
    }

    /**
     * Get app element subelement delta
     *
     * @return app element subelement delta
     *
     */
    public final String delta() {
      return this.delta;
    }

    /**
     * Set app element subelement delta
     *
     * @param value app element subelement delta
     *
     * @return the Builder object.
     */
    public final Builder delta(String value) {
      this.delta = value;
      return this;
    }

    public final DocumentsCreateDocumentRequestElementsElementParamsSubelements build() {
      return new com.onshape.api.requests.DocumentsCreateDocumentRequestElementsElementParamsSubelements(subelementId,baseContent,delta);
    }
  }
}
