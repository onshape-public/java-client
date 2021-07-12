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

import com.onshape.api.requests.PartsExportGltfRequest;
import com.onshape.api.requests.PartsExportParasolidRequest;
import com.onshape.api.requests.PartsExportStlRequest;
import com.onshape.api.requests.PartsGetBendTableRequest;
import com.onshape.api.requests.PartsGetBodyDetailsRequest;
import com.onshape.api.requests.PartsGetBoundingBoxesRequest;
import com.onshape.api.requests.PartsGetEdgesRequest;
import com.onshape.api.requests.PartsGetFacesRequest;
import com.onshape.api.requests.PartsGetMassPropertiesRequest;
import com.onshape.api.requests.PartsGetPartsInPartstudioRequest;
import com.onshape.api.requests.PartsGetPartsRequest;
import com.onshape.api.requests.PartsGetShadedViewsRequest;

/**
 * Parts: API endpoints for Parts group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Parts {
  final Onshape onshape;

  Parts(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for getBodyDetails
   *  @return Request builder object
   */
  public final PartsGetBodyDetailsRequest.Builder getBodyDetails() {
    return PartsGetBodyDetailsRequest.builder(onshape);
  }

  /**
   * Create request for getBoundingBoxes
   *  @return Request builder object
   */
  public final PartsGetBoundingBoxesRequest.Builder getBoundingBoxes() {
    return PartsGetBoundingBoxesRequest.builder(onshape);
  }

  /**
   * Create request for exportParasolid
   *  @return Request builder object
   */
  public final PartsExportParasolidRequest.Builder exportParasolid() {
    return PartsExportParasolidRequest.builder(onshape);
  }

  /**
   * Create request for exportStl
   *  @return Request builder object
   */
  public final PartsExportStlRequest.Builder exportStl() {
    return PartsExportStlRequest.builder(onshape);
  }

  /**
   * Create request for exportGltf
   *  @return Request builder object
   */
  public final PartsExportGltfRequest.Builder exportGltf() {
    return PartsExportGltfRequest.builder(onshape);
  }

  /**
   * Create request for getParts
   *  @return Request builder object
   */
  public final PartsGetPartsRequest.Builder getParts() {
    return PartsGetPartsRequest.builder(onshape);
  }

  /**
   * Create request for getPartsInPartstudio
   *  @return Request builder object
   */
  public final PartsGetPartsInPartstudioRequest.Builder getPartsInPartstudio() {
    return PartsGetPartsInPartstudioRequest.builder(onshape);
  }

  /**
   * Create request for getBendTable
   *  @return Request builder object
   */
  public final PartsGetBendTableRequest.Builder getBendTable() {
    return PartsGetBendTableRequest.builder(onshape);
  }

  /**
   * Create request for getMassProperties
   *  @return Request builder object
   */
  public final PartsGetMassPropertiesRequest.Builder getMassProperties() {
    return PartsGetMassPropertiesRequest.builder(onshape);
  }

  /**
   * Create request for getShadedViews
   *  @return Request builder object
   */
  public final PartsGetShadedViewsRequest.Builder getShadedViews() {
    return PartsGetShadedViewsRequest.builder(onshape);
  }

  /**
   * Create request for getEdges
   *  @return Request builder object
   */
  public final PartsGetEdgesRequest.Builder getEdges() {
    return PartsGetEdgesRequest.builder(onshape);
  }

  /**
   * Create request for getFaces
   *  @return Request builder object
   */
  public final PartsGetFacesRequest.Builder getFaces() {
    return PartsGetFacesRequest.builder(onshape);
  }
}
