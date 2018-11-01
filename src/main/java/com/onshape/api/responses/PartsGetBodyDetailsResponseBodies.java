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
 * Object used in calls to getBodyDetails API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsGetBodyDetailsResponseBodies {
  /**
   * ID of a part
   */
  @JsonProperty("id")
  public String id;

  /**
   * Type of a part
   */
  @JsonProperty("type")
  public String type;

  /**
   * Array of info for each face of a part
   */
  @JsonProperty("faces")
  public PartsGetBodyDetailsResponseBodiesFaces[] faces;

  /**
   * Edges of a part
   */
  @JsonProperty("edges")
  public PartsGetBodyDetailsResponseBodiesEdges[] edges;

  /**
   * Vertices of part
   */
  @JsonProperty("vertices")
  public PartsGetBodyDetailsResponseBodiesVertices[] vertices;

  /**
   * Get ID of a part
   *
   * @return ID of a part
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Type of a part
   *
   * @return Type of a part
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Array of info for each face of a part
   *
   * @return Array of info for each face of a part
   *
   */
  public final PartsGetBodyDetailsResponseBodiesFaces[] getFaces() {
    return this.faces;
  }

  /**
   * Get Edges of a part
   *
   * @return Edges of a part
   *
   */
  public final PartsGetBodyDetailsResponseBodiesEdges[] getEdges() {
    return this.edges;
  }

  /**
   * Get Vertices of part
   *
   * @return Vertices of part
   *
   */
  public final PartsGetBodyDetailsResponseBodiesVertices[] getVertices() {
    return this.vertices;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
