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

import com.onshape.api.requests.AssembliesAddFeatureRequest;
import com.onshape.api.requests.AssembliesCreateAssemblyRequest;
import com.onshape.api.requests.AssembliesCreateInstanceRequest;
import com.onshape.api.requests.AssembliesCreateTranslationRequest;
import com.onshape.api.requests.AssembliesDeleteFeatureRequest;
import com.onshape.api.requests.AssembliesDeleteInstanceRequest;
import com.onshape.api.requests.AssembliesGetAssemblyDefinitionRequest;
import com.onshape.api.requests.AssembliesGetBillOfMaterialsRequest;
import com.onshape.api.requests.AssembliesGetBoundingBoxesRequest;
import com.onshape.api.requests.AssembliesGetFeatureSpecsRequest;
import com.onshape.api.requests.AssembliesGetFeaturesRequest;
import com.onshape.api.requests.AssembliesGetNamedViewsRequest;
import com.onshape.api.requests.AssembliesGetOrCreateBillOfMaterialsElementRequest;
import com.onshape.api.requests.AssembliesGetShadedViewsRequest;
import com.onshape.api.requests.AssembliesGetTranslationFormatsRequest;
import com.onshape.api.requests.AssembliesInsertTransformedInstancesRequest;
import com.onshape.api.requests.AssembliesTransformOccurrencesRequest;
import com.onshape.api.requests.AssembliesUpdateFeatureRequest;

/**
 * Assemblies: API endpoints for Assemblies group.
 * &copy; 2018 Onshape Inc.
 */
public final class Assemblies {
  Onshape onshape;

  Assemblies(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for addFeature
   *  @return Request builder object
   */
  public final AssembliesAddFeatureRequest.Builder addFeature() {
    return AssembliesAddFeatureRequest.builder(onshape);
  }

  /**
   * Create request for getAssemblyDefinition
   *  @return Request builder object
   */
  public final AssembliesGetAssemblyDefinitionRequest.Builder getAssemblyDefinition() {
    return AssembliesGetAssemblyDefinitionRequest.builder(onshape);
  }

  /**
   * Create request for getBoundingBoxes
   *  @return Request builder object
   */
  public final AssembliesGetBoundingBoxesRequest.Builder getBoundingBoxes() {
    return AssembliesGetBoundingBoxesRequest.builder(onshape);
  }

  /**
   * Create request for createAssembly
   *  @return Request builder object
   */
  public final AssembliesCreateAssemblyRequest.Builder createAssembly() {
    return AssembliesCreateAssemblyRequest.builder(onshape);
  }

  /**
   * Create request for createTranslation
   *  @return Request builder object
   */
  public final AssembliesCreateTranslationRequest.Builder createTranslation() {
    return AssembliesCreateTranslationRequest.builder(onshape);
  }

  /**
   * Create request for insertTransformedInstances
   *  @return Request builder object
   */
  public final AssembliesInsertTransformedInstancesRequest.Builder insertTransformedInstances() {
    return AssembliesInsertTransformedInstancesRequest.builder(onshape);
  }

  /**
   * Create request for createInstance
   *  @return Request builder object
   */
  public final AssembliesCreateInstanceRequest.Builder createInstance() {
    return AssembliesCreateInstanceRequest.builder(onshape);
  }

  /**
   * Create request for deleteFeature
   *  @return Request builder object
   */
  public final AssembliesDeleteFeatureRequest.Builder deleteFeature() {
    return AssembliesDeleteFeatureRequest.builder(onshape);
  }

  /**
   * Create request for deleteInstance
   *  @return Request builder object
   */
  public final AssembliesDeleteInstanceRequest.Builder deleteInstance() {
    return AssembliesDeleteInstanceRequest.builder(onshape);
  }

  /**
   * Create request for getBillOfMaterials
   *  @return Request builder object
   */
  public final AssembliesGetBillOfMaterialsRequest.Builder getBillOfMaterials() {
    return AssembliesGetBillOfMaterialsRequest.builder(onshape);
  }

  /**
   * Create request for getFeatures
   *  @return Request builder object
   */
  public final AssembliesGetFeaturesRequest.Builder getFeatures() {
    return AssembliesGetFeaturesRequest.builder(onshape);
  }

  /**
   * Create request for getFeatureSpecs
   *  @return Request builder object
   */
  public final AssembliesGetFeatureSpecsRequest.Builder getFeatureSpecs() {
    return AssembliesGetFeatureSpecsRequest.builder(onshape);
  }

  /**
   * Create request for getNamedViews
   *  @return Request builder object
   */
  public final AssembliesGetNamedViewsRequest.Builder getNamedViews() {
    return AssembliesGetNamedViewsRequest.builder(onshape);
  }

  /**
   * Create request for getTranslationFormats
   *  @return Request builder object
   */
  public final AssembliesGetTranslationFormatsRequest.Builder getTranslationFormats() {
    return AssembliesGetTranslationFormatsRequest.builder(onshape);
  }

  /**
   * Create request for getOrCreateBillOfMaterialsElement
   *  @return Request builder object
   */
  public final AssembliesGetOrCreateBillOfMaterialsElementRequest.Builder getOrCreateBillOfMaterialsElement() {
    return AssembliesGetOrCreateBillOfMaterialsElementRequest.builder(onshape);
  }

  /**
   * Create request for getShadedViews
   *  @return Request builder object
   */
  public final AssembliesGetShadedViewsRequest.Builder getShadedViews() {
    return AssembliesGetShadedViewsRequest.builder(onshape);
  }

  /**
   * Create request for transformOccurrences
   *  @return Request builder object
   */
  public final AssembliesTransformOccurrencesRequest.Builder transformOccurrences() {
    return AssembliesTransformOccurrencesRequest.builder(onshape);
  }

  /**
   * Create request for updateFeature
   *  @return Request builder object
   */
  public final AssembliesUpdateFeatureRequest.Builder updateFeature() {
    return AssembliesUpdateFeatureRequest.builder(onshape);
  }
}
