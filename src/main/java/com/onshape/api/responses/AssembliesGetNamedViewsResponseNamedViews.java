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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getNamedViews API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetNamedViewsResponseNamedViews {
  /**
   * An object representing a view
   */
  @JsonProperty("key")
  public AssembliesGetNamedViewsResponseNamedViewsKey key;

  /**
   * a named view entry. the viewName key is the name of the view
   */
  @JsonProperty("viewName")
  public AssembliesGetNamedViewsResponseNamedViewsViewName viewName;

  /**
   * Get An object representing a view
   *
   * @return An object representing a view
   *
   */
  public final AssembliesGetNamedViewsResponseNamedViewsKey getKey() {
    return this.key;
  }

  /**
   * Get a named view entry. the viewName key is the name of the view
   *
   * @return a named view entry. the viewName key is the name of the view
   *
   */
  public final AssembliesGetNamedViewsResponseNamedViewsViewName getViewName() {
    return this.viewName;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
