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
package com.onshape.api;

import com.onshape.api.requests.ModelsGetAssemblyDefinitionRequest;
import com.onshape.api.requests.ModelsGetBodyDetailsRequest;
import com.onshape.api.requests.ModelsGetBoundingBoxRequest;
import com.onshape.api.requests.ModelsGetEdgesRequest;
import com.onshape.api.requests.ModelsGetFacesRequest;

/**
 * Models: API endpoints for Models group.
 * &copy; 2018 Onshape Inc.
 */
public final class Models {
  Onshape onshape;

  Models(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for getAssemblyDefinition
   *  @return Request builder object
   */
  public final ModelsGetAssemblyDefinitionRequest.Builder getAssemblyDefinition() {
    return ModelsGetAssemblyDefinitionRequest.builder(onshape);
  }

  /**
   * Create request for getBodyDetails
   *  @return Request builder object
   */
  public final ModelsGetBodyDetailsRequest.Builder getBodyDetails() {
    return ModelsGetBodyDetailsRequest.builder(onshape);
  }

  /**
   * Create request for getBoundingBox
   *  @return Request builder object
   */
  public final ModelsGetBoundingBoxRequest.Builder getBoundingBox() {
    return ModelsGetBoundingBoxRequest.builder(onshape);
  }

  /**
   * Create request for getEdges
   *  @return Request builder object
   */
  public final ModelsGetEdgesRequest.Builder getEdges() {
    return ModelsGetEdgesRequest.builder(onshape);
  }

  /**
   * Create request for getFaces
   *  @return Request builder object
   */
  public final ModelsGetFacesRequest.Builder getFaces() {
    return ModelsGetFacesRequest.builder(onshape);
  }
}
