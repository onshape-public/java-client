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
 * Response object for getOrCreateBillOfMaterialsElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesGetOrCreateBillOfMaterialsElementResponse extends AbstractResponseObject {
  /**
   * object containing information about the retrieved Bill Of Materials element
   */
  @JsonProperty("An")
  @NotNull
  Map An;

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
   * Element type (will always be &quot;BILLOFMATERIALS&quot;)
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
   * The current element microversion id
   */
  @JsonProperty("microversionId")
  @NotNull
  String microversionId;

  /**
   * Get object containing information about the retrieved Bill Of Materials element
   *
   * @return object containing information about the retrieved Bill Of Materials element
   *
   */
  public final Map getAn() {
    return this.An;
  }

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
   * Get Element type (will always be &quot;BILLOFMATERIALS&quot;)
   *
   * @return Element type (will always be &quot;BILLOFMATERIALS&quot;)
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
   * Get The current element microversion id
   *
   * @return The current element microversion id
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
