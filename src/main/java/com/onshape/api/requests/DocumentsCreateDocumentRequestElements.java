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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to createDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCreateDocumentRequestElements {
  /**
   * Element Type ordinal
   */
  @JsonProperty("elementType")
  public Number elementType;

  /**
   * App Element Params definition
   */
  @JsonProperty("elementParams")
  public DocumentsCreateDocumentRequestElementsElementParams elementParams;

  DocumentsCreateDocumentRequestElements(Number elementType,
      DocumentsCreateDocumentRequestElementsElementParams elementParams) {
    this.elementType = elementType;
    this.elementParams = elementParams;
  }

  /**
   * Get Element Type ordinal
   *
   * @return Element Type ordinal
   *
   */
  public final Number getElementType() {
    return this.elementType;
  }

  /**
   * Get App Element Params definition
   *
   * @return App Element Params definition
   *
   */
  public final DocumentsCreateDocumentRequestElementsElementParams getElementParams() {
    return this.elementParams;
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
     * Element Type ordinal
     */
    private Number elementType;

    /**
     * App Element Params definition
     */
    private DocumentsCreateDocumentRequestElementsElementParams elementParams;

    Builder() {
    }

    /**
     * Get Element Type ordinal
     *
     * @return Element Type ordinal
     *
     */
    public final Number elementType() {
      return this.elementType;
    }

    /**
     * Set Element Type ordinal
     *
     * @param value Element Type ordinal
     *
     * @return the Builder object.
     */
    public final Builder elementType(Number value) {
      this.elementType = value;
      return this;
    }

    /**
     * Get App Element Params definition
     *
     * @return App Element Params definition
     *
     */
    public final DocumentsCreateDocumentRequestElementsElementParams elementParams() {
      return this.elementParams;
    }

    /**
     * Set App Element Params definition
     *
     * @param value App Element Params definition
     *
     * @return the Builder object.
     */
    public final Builder elementParams(DocumentsCreateDocumentRequestElementsElementParams value) {
      this.elementParams = value;
      return this;
    }

    public final DocumentsCreateDocumentRequestElements build() {
      return new com.onshape.api.requests.DocumentsCreateDocumentRequestElements(elementType,elementParams);
    }
  }
}
