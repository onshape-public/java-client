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
 * Object used in calls to createElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCreateElementRequestLocation {
  /**
   * For internal use.
   */
  @JsonProperty("groupId")
  public String groupId;

  /**
   * Id of an element to place the new element near.
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
   */
  @JsonProperty("position")
  public Number position;

  AppElementsCreateElementRequestLocation(String groupId, String elementId, Number position) {
    this.groupId = groupId;
    this.elementId = elementId;
    this.position = position;
  }

  /**
   * Get For internal use.
   *
   * @return For internal use.
   *
   */
  public final String getGroupId() {
    return this.groupId;
  }

  /**
   * Get Id of an element to place the new element near.
   *
   * @return Id of an element to place the new element near.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
   *
   * @return An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
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
     * For internal use.
     */
    private String groupId;

    /**
     * Id of an element to place the new element near.
     */
    private String elementId;

    /**
     * An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     */
    private Number position;

    Builder() {
    }

    /**
     * Get For internal use.
     *
     * @return For internal use.
     *
     */
    public final String groupId() {
      return this.groupId;
    }

    /**
     * Set For internal use.
     *
     * @param value For internal use.
     *
     * @return the Builder object.
     */
    public final Builder groupId(String value) {
      this.groupId = value;
      return this;
    }

    /**
     * Get Id of an element to place the new element near.
     *
     * @return Id of an element to place the new element near.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set Id of an element to place the new element near.
     *
     * @param value Id of an element to place the new element near.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @return An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     */
    public final Number position() {
      return this.position;
    }

    /**
     * Set An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @param value An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @return the Builder object.
     */
    public final Builder position(Number value) {
      this.position = value;
      return this;
    }

    public final AppElementsCreateElementRequestLocation build() {
      return new com.onshape.api.requests.AppElementsCreateElementRequestLocation(groupId,elementId,position);
    }
  }
}
