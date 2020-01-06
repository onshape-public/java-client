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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Response object for createAssembly API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesCreateAssemblyResponse extends AbstractResponseObject {
  /**
   * Element name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Element ID
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Element type (for example, &quot;PARTSTUDIO&quot;)
   */
  @JsonProperty("elementType")
  @NotNull
  String elementType;

  /**
   * Onshape internal use
   */
  @JsonProperty("type")
  @NotNull
  String type;

  /**
   * Length units, for Part Studio elements only
   */
  @JsonProperty("lengthUnits")
  @NotNull
  String lengthUnits;

  /**
   * Angle units, for Part Studio elements only
   */
  @JsonProperty("angleUnits")
  @NotNull
  String angleUnits;

  /**
   * Thumbnail information
   */
  @JsonProperty("thumbnailInfo")
  @NotNull
  Map thumbnailInfo;

  /**
   * Onshape internal use
   */
  @JsonProperty("thumbnails")
  @NotNull
  Map thumbnails;

  /**
   * Get Element name
   *
   * @return Element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Element type (for example, &quot;PARTSTUDIO&quot;)
   *
   * @return Element type (for example, &quot;PARTSTUDIO&quot;)
   *
   */
  public final String getElementType() {
    return this.elementType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Length units, for Part Studio elements only
   *
   * @return Length units, for Part Studio elements only
   *
   */
  public final String getLengthUnits() {
    return this.lengthUnits;
  }

  /**
   * Get Angle units, for Part Studio elements only
   *
   * @return Angle units, for Part Studio elements only
   *
   */
  public final String getAngleUnits() {
    return this.angleUnits;
  }

  /**
   * Get Thumbnail information
   *
   * @return Thumbnail information
   *
   */
  public final Map getThumbnailInfo() {
    return this.thumbnailInfo;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Map getThumbnails() {
    return this.thumbnails;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
