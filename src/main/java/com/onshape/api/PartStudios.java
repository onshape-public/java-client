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

import com.onshape.api.requests.PartStudiosAddPartStudioFeatureRequest;
import com.onshape.api.requests.PartStudiosComparePartStudioRequest;
import com.onshape.api.requests.PartStudiosCreatePartStudioRequest;
import com.onshape.api.requests.PartStudiosCreateTranslationRequest;
import com.onshape.api.requests.PartStudiosDeleteFeatureRequest;
import com.onshape.api.requests.PartStudiosEvalFeatureScriptRequest;
import com.onshape.api.requests.PartStudiosExportGltfRequest;
import com.onshape.api.requests.PartStudiosExportParasolidRequest;
import com.onshape.api.requests.PartStudiosExportStlRequest;
import com.onshape.api.requests.PartStudiosGetBodyDetailsRequest;
import com.onshape.api.requests.PartStudiosGetBoundingBoxesForSketchRequest;
import com.onshape.api.requests.PartStudiosGetBoundingBoxesRequest;
import com.onshape.api.requests.PartStudiosGetEdgesRequest;
import com.onshape.api.requests.PartStudiosGetFacesRequest;
import com.onshape.api.requests.PartStudiosGetFeatureSpecsRequest;
import com.onshape.api.requests.PartStudiosGetFeaturesRequest;
import com.onshape.api.requests.PartStudiosGetMassPropertiesRequest;
import com.onshape.api.requests.PartStudiosGetNamedViewsRequest;
import com.onshape.api.requests.PartStudiosGetShadedViewsRequest;
import com.onshape.api.requests.PartStudiosGetSketchInfoRequest;
import com.onshape.api.requests.PartStudiosGetTessellatedEntitiesRequest;
import com.onshape.api.requests.PartStudiosIdTranslationsRequest;
import com.onshape.api.requests.PartStudiosUpdateFeatureRequest;
import com.onshape.api.requests.PartStudiosUpdateFeaturesRequest;
import com.onshape.api.requests.PartStudiosUpdateRollbackRequest;

/**
 * PartStudios: API endpoints for PartStudios group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudios {
  final Onshape onshape;

  PartStudios(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for addPartStudioFeature
   *  @return Request builder object
   */
  public final PartStudiosAddPartStudioFeatureRequest.Builder addPartStudioFeature() {
    return PartStudiosAddPartStudioFeatureRequest.builder(onshape);
  }

  /**
   * Create request for getBodyDetails
   *  @return Request builder object
   */
  public final PartStudiosGetBodyDetailsRequest.Builder getBodyDetails() {
    return PartStudiosGetBodyDetailsRequest.builder(onshape);
  }

  /**
   * Create request for getBoundingBoxes
   *  @return Request builder object
   */
  public final PartStudiosGetBoundingBoxesRequest.Builder getBoundingBoxes() {
    return PartStudiosGetBoundingBoxesRequest.builder(onshape);
  }

  /**
   * Create request for comparePartStudio
   *  @return Request builder object
   */
  public final PartStudiosComparePartStudioRequest.Builder comparePartStudio() {
    return PartStudiosComparePartStudioRequest.builder(onshape);
  }

  /**
   * Create request for createPartStudio
   *  @return Request builder object
   */
  public final PartStudiosCreatePartStudioRequest.Builder createPartStudio() {
    return PartStudiosCreatePartStudioRequest.builder(onshape);
  }

  /**
   * Create request for createTranslation
   *  @return Request builder object
   */
  public final PartStudiosCreateTranslationRequest.Builder createTranslation() {
    return PartStudiosCreateTranslationRequest.builder(onshape);
  }

  /**
   * Create request for deleteFeature
   *  @return Request builder object
   */
  public final PartStudiosDeleteFeatureRequest.Builder deleteFeature() {
    return PartStudiosDeleteFeatureRequest.builder(onshape);
  }

  /**
   * Create request for evalFeatureScript
   *  @return Request builder object
   */
  public final PartStudiosEvalFeatureScriptRequest.Builder evalFeatureScript() {
    return PartStudiosEvalFeatureScriptRequest.builder(onshape);
  }

  /**
   * Create request for exportParasolid
   *  @return Request builder object
   */
  public final PartStudiosExportParasolidRequest.Builder exportParasolid() {
    return PartStudiosExportParasolidRequest.builder(onshape);
  }

  /**
   * Create request for exportStl
   *  @return Request builder object
   */
  public final PartStudiosExportStlRequest.Builder exportStl() {
    return PartStudiosExportStlRequest.builder(onshape);
  }

  /**
   * Create request for exportGltf
   *  @return Request builder object
   */
  public final PartStudiosExportGltfRequest.Builder exportGltf() {
    return PartStudiosExportGltfRequest.builder(onshape);
  }

  /**
   * Create request for getFeatures
   *  @return Request builder object
   */
  public final PartStudiosGetFeaturesRequest.Builder getFeatures() {
    return PartStudiosGetFeaturesRequest.builder(onshape);
  }

  /**
   * Create request for getFeatureSpecs
   *  @return Request builder object
   */
  public final PartStudiosGetFeatureSpecsRequest.Builder getFeatureSpecs() {
    return PartStudiosGetFeatureSpecsRequest.builder(onshape);
  }

  /**
   * Create request for getNamedViews
   *  @return Request builder object
   */
  public final PartStudiosGetNamedViewsRequest.Builder getNamedViews() {
    return PartStudiosGetNamedViewsRequest.builder(onshape);
  }

  /**
   * Create request for idTranslations
   *  @return Request builder object
   */
  public final PartStudiosIdTranslationsRequest.Builder idTranslations() {
    return PartStudiosIdTranslationsRequest.builder(onshape);
  }

  /**
   * Create request for getMassProperties
   *  @return Request builder object
   */
  public final PartStudiosGetMassPropertiesRequest.Builder getMassProperties() {
    return PartStudiosGetMassPropertiesRequest.builder(onshape);
  }

  /**
   * Create request for getShadedViews
   *  @return Request builder object
   */
  public final PartStudiosGetShadedViewsRequest.Builder getShadedViews() {
    return PartStudiosGetShadedViewsRequest.builder(onshape);
  }

  /**
   * Create request for getBoundingBoxesForSketch
   *  @return Request builder object
   */
  public final PartStudiosGetBoundingBoxesForSketchRequest.Builder getBoundingBoxesForSketch() {
    return PartStudiosGetBoundingBoxesForSketchRequest.builder(onshape);
  }

  /**
   * Create request for getSketchInfo
   *  @return Request builder object
   */
  public final PartStudiosGetSketchInfoRequest.Builder getSketchInfo() {
    return PartStudiosGetSketchInfoRequest.builder(onshape);
  }

  /**
   * Create request for getEdges
   *  @return Request builder object
   */
  public final PartStudiosGetEdgesRequest.Builder getEdges() {
    return PartStudiosGetEdgesRequest.builder(onshape);
  }

  /**
   * Create request for getFaces
   *  @return Request builder object
   */
  public final PartStudiosGetFacesRequest.Builder getFaces() {
    return PartStudiosGetFacesRequest.builder(onshape);
  }

  /**
   * Create request for getTessellatedEntities
   *  @return Request builder object
   */
  public final PartStudiosGetTessellatedEntitiesRequest.Builder getTessellatedEntities() {
    return PartStudiosGetTessellatedEntitiesRequest.builder(onshape);
  }

  /**
   * Create request for updateFeature
   *  @return Request builder object
   */
  public final PartStudiosUpdateFeatureRequest.Builder updateFeature() {
    return PartStudiosUpdateFeatureRequest.builder(onshape);
  }

  /**
   * Create request for updateRollback
   *  @return Request builder object
   */
  public final PartStudiosUpdateRollbackRequest.Builder updateRollback() {
    return PartStudiosUpdateRollbackRequest.builder(onshape);
  }

  /**
   * Create request for updateFeatures
   *  @return Request builder object
   */
  public final PartStudiosUpdateFeaturesRequest.Builder updateFeatures() {
    return PartStudiosUpdateFeaturesRequest.builder(onshape);
  }
}
