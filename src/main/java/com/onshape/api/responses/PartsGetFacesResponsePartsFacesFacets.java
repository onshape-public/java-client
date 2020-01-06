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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getFaces API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartsGetFacesResponsePartsFacesFacets extends AbstractResponseObject {
  /**
   * Unit normal vector for the facet
   */
  @JsonProperty("normal")
  public Number[] normal;

  /**
   * Normal vectors to face surface at the corresponding facet vertices (Only output if query param &quot;outputVertexNormals&quot; is true).
   */
  @JsonProperty("vertexNormals")
  public Number[][] vertexNormals;

  /**
   * Texture coordinates of a facet (Only output if query param &quot;outputTextureCoordinates&quot; is true)
   */
  @JsonProperty("textureCoordinates")
  public Number[] textureCoordinates;

  /**
   * Vertices of a facet
   */
  @JsonProperty("vertices")
  public Number[][] vertices;

  /**
   * 3-element array of facet point indices. Each is an index into the top-level facetPoints array
   */
  @JsonProperty("indices")
  public Number[] indices;

  /**
   * Get Unit normal vector for the facet
   *
   * @return Unit normal vector for the facet
   *
   */
  public final Number[] getNormal() {
    return this.normal;
  }

  /**
   * Get Normal vectors to face surface at the corresponding facet vertices (Only output if query param &quot;outputVertexNormals&quot; is true).
   *
   * @return Normal vectors to face surface at the corresponding facet vertices (Only output if query param &quot;outputVertexNormals&quot; is true).
   *
   */
  public final Number[][] getVertexNormals() {
    return this.vertexNormals;
  }

  /**
   * Get Texture coordinates of a facet (Only output if query param &quot;outputTextureCoordinates&quot; is true)
   *
   * @return Texture coordinates of a facet (Only output if query param &quot;outputTextureCoordinates&quot; is true)
   *
   */
  public final Number[] getTextureCoordinates() {
    return this.textureCoordinates;
  }

  /**
   * Get Vertices of a facet
   *
   * @return Vertices of a facet
   *
   */
  public final Number[][] getVertices() {
    return this.vertices;
  }

  /**
   * Get 3-element array of facet point indices. Each is an index into the top-level facetPoints array
   *
   * @return 3-element array of facet point indices. Each is an index into the top-level facetPoints array
   *
   */
  public final Number[] getIndices() {
    return this.indices;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
