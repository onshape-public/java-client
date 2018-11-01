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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getTranslationFormats API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DrawingsGetTranslationFormatsResponseItems {
  /**
   * For internal use
   */
  @JsonProperty("translatorName")
  public String translatorName;

  /**
   * Name of translation format
   */
  @JsonProperty("name")
  public String name;

  /**
   * True if the format can contain an assembly
   */
  @JsonProperty("couldBeAssembly")
  public Boolean couldBeAssembly;

  /**
   * Get For internal use
   *
   * @return For internal use
   *
   */
  public final String getTranslatorName() {
    return this.translatorName;
  }

  /**
   * Get Name of translation format
   *
   * @return Name of translation format
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get True if the format can contain an assembly
   *
   * @return True if the format can contain an assembly
   *
   */
  public final Boolean getCouldBeAssembly() {
    return this.couldBeAssembly;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
