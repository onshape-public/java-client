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
public final class DocumentsCreateDocumentRequestElementsElementParamsLocation {
  /**
   * app element location groupid
   */
  @JsonProperty("groupId")
  public String groupId;

  /**
   * app element location elementId
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * app element location position
   */
  @JsonProperty("position")
  public Number position;

  DocumentsCreateDocumentRequestElementsElementParamsLocation(String groupId, String elementId,
      Number position) {
    this.groupId = groupId;
    this.elementId = elementId;
    this.position = position;
  }

  /**
   * Get app element location groupid
   *
   * @return app element location groupid
   *
   */
  public final String getGroupId() {
    return this.groupId;
  }

  /**
   * Get app element location elementId
   *
   * @return app element location elementId
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get app element location position
   *
   * @return app element location position
   *
   */
  public final Number getPosition() {
    return this.position;
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
     * app element location groupid
     */
    private String groupId;

    /**
     * app element location elementId
     */
    private String elementId;

    /**
     * app element location position
     */
    private Number position;

    Builder() {
    }

    /**
     * Get app element location groupid
     *
     * @return app element location groupid
     *
     */
    public final String groupId() {
      return this.groupId;
    }

    /**
     * Set app element location groupid
     *
     * @param value app element location groupid
     *
     * @return the Builder object.
     */
    public final Builder groupId(String value) {
      this.groupId = value;
      return this;
    }

    /**
     * Get app element location elementId
     *
     * @return app element location elementId
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set app element location elementId
     *
     * @param value app element location elementId
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get app element location position
     *
     * @return app element location position
     *
     */
    public final Number position() {
      return this.position;
    }

    /**
     * Set app element location position
     *
     * @param value app element location position
     *
     * @return the Builder object.
     */
    public final Builder position(Number value) {
      this.position = value;
      return this;
    }

    public final DocumentsCreateDocumentRequestElementsElementParamsLocation build() {
      return new com.onshape.api.requests.DocumentsCreateDocumentRequestElementsElementParamsLocation(groupId,elementId,position);
    }
  }
}
