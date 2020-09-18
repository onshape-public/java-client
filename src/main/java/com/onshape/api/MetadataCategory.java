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

import com.onshape.api.requests.MetadataCategoryCreateCategoryRequest;
import com.onshape.api.requests.MetadataCategoryCreatePropertyRequest;
import com.onshape.api.requests.MetadataCategoryDeleteCategoryRequest;
import com.onshape.api.requests.MetadataCategoryGetCategoryRequest;
import com.onshape.api.requests.MetadataCategoryGetMetadataCategoryPropertiesRequest;
import com.onshape.api.requests.MetadataCategoryGetMetadataPropertyRequest;
import com.onshape.api.requests.MetadataCategoryGetPropertiesRequest;
import com.onshape.api.requests.MetadataCategorySearchRequest;
import com.onshape.api.requests.MetadataCategoryUpdateCategoryRequest;
import com.onshape.api.requests.MetadataCategoryUpdatePropertyRequest;

/**
 * MetadataCategory: API endpoints for MetadataCategory group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategory {
  final Onshape onshape;

  MetadataCategory(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for createCategory
   *  @return Request builder object
   */
  public final MetadataCategoryCreateCategoryRequest.Builder createCategory() {
    return MetadataCategoryCreateCategoryRequest.builder(onshape);
  }

  /**
   * Create request for createProperty
   *  @return Request builder object
   */
  public final MetadataCategoryCreatePropertyRequest.Builder createProperty() {
    return MetadataCategoryCreatePropertyRequest.builder(onshape);
  }

  /**
   * Create request for deleteCategory
   *  @return Request builder object
   */
  public final MetadataCategoryDeleteCategoryRequest.Builder deleteCategory() {
    return MetadataCategoryDeleteCategoryRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataCategoryProperties
   *  @return Request builder object
   */
  public final MetadataCategoryGetMetadataCategoryPropertiesRequest.Builder getMetadataCategoryProperties() {
    return MetadataCategoryGetMetadataCategoryPropertiesRequest.builder(onshape);
  }

  /**
   * Create request for getCategory
   *  @return Request builder object
   */
  public final MetadataCategoryGetCategoryRequest.Builder getCategory() {
    return MetadataCategoryGetCategoryRequest.builder(onshape);
  }

  /**
   * Create request for getProperties
   *  @return Request builder object
   */
  public final MetadataCategoryGetPropertiesRequest.Builder getProperties() {
    return MetadataCategoryGetPropertiesRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataProperty
   *  @return Request builder object
   */
  public final MetadataCategoryGetMetadataPropertyRequest.Builder getMetadataProperty() {
    return MetadataCategoryGetMetadataPropertyRequest.builder(onshape);
  }

  /**
   * Create request for search
   *  @return Request builder object
   */
  public final MetadataCategorySearchRequest.Builder search() {
    return MetadataCategorySearchRequest.builder(onshape);
  }

  /**
   * Create request for updateCategory
   *  @return Request builder object
   */
  public final MetadataCategoryUpdateCategoryRequest.Builder updateCategory() {
    return MetadataCategoryUpdateCategoryRequest.builder(onshape);
  }

  /**
   * Create request for updateProperty
   *  @return Request builder object
   */
  public final MetadataCategoryUpdatePropertyRequest.Builder updateProperty() {
    return MetadataCategoryUpdatePropertyRequest.builder(onshape);
  }
}
