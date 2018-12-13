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

import com.onshape.api.requests.MetadataGetElementMetadataRequest;
import com.onshape.api.requests.MetadataGetElementsMetadataRequest;
import com.onshape.api.requests.MetadataGetMetadataPropertyRequest;
import com.onshape.api.requests.MetadataGetMetadataRequest;
import com.onshape.api.requests.MetadataGetMetadataSchemaByIDRequest;
import com.onshape.api.requests.MetadataGetMetadataSchemaPropertiesRequest;
import com.onshape.api.requests.MetadataGetMetadataSchemaRequest;
import com.onshape.api.requests.MetadataGetPartListMetadataRequest;
import com.onshape.api.requests.MetadataGetPartMetadataRequest;
import com.onshape.api.requests.MetadataGetStandardContentMetadataRequest;
import com.onshape.api.requests.MetadataUpdateElementMetadataRequest;
import com.onshape.api.requests.MetadataUpdateMetadataRequest;
import com.onshape.api.requests.MetadataUpdatePartMetadataRequest;
import com.onshape.api.requests.MetadataUpdateStandardContentMetadataRequest;

/**
 * Metadata: API endpoints for Metadata group.
 * &copy; 2018 Onshape Inc.
 */
public final class Metadata {
  final Onshape onshape;

  Metadata(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for getElementMetadata
   *  @return Request builder object
   */
  public final MetadataGetElementMetadataRequest.Builder getElementMetadata() {
    return MetadataGetElementMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getElementsMetadata
   *  @return Request builder object
   */
  public final MetadataGetElementsMetadataRequest.Builder getElementsMetadata() {
    return MetadataGetElementsMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getPartMetadata
   *  @return Request builder object
   */
  public final MetadataGetPartMetadataRequest.Builder getPartMetadata() {
    return MetadataGetPartMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getPartListMetadata
   *  @return Request builder object
   */
  public final MetadataGetPartListMetadataRequest.Builder getPartListMetadata() {
    return MetadataGetPartListMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getStandardContentMetadata
   *  @return Request builder object
   */
  public final MetadataGetStandardContentMetadataRequest.Builder getStandardContentMetadata() {
    return MetadataGetStandardContentMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getMetadata
   *  @return Request builder object
   */
  public final MetadataGetMetadataRequest.Builder getMetadata() {
    return MetadataGetMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataSchemaProperties
   *  @return Request builder object
   */
  public final MetadataGetMetadataSchemaPropertiesRequest.Builder getMetadataSchemaProperties() {
    return MetadataGetMetadataSchemaPropertiesRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataProperty
   *  @return Request builder object
   */
  public final MetadataGetMetadataPropertyRequest.Builder getMetadataProperty() {
    return MetadataGetMetadataPropertyRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataSchemaByID
   *  @return Request builder object
   */
  public final MetadataGetMetadataSchemaByIDRequest.Builder getMetadataSchemaByID() {
    return MetadataGetMetadataSchemaByIDRequest.builder(onshape);
  }

  /**
   * Create request for getMetadataSchema
   *  @return Request builder object
   */
  public final MetadataGetMetadataSchemaRequest.Builder getMetadataSchema() {
    return MetadataGetMetadataSchemaRequest.builder(onshape);
  }

  /**
   * Create request for updateMetadata
   *  @return Request builder object
   */
  public final MetadataUpdateMetadataRequest.Builder updateMetadata() {
    return MetadataUpdateMetadataRequest.builder(onshape);
  }

  /**
   * Create request for updateStandardContentMetadata
   *  @return Request builder object
   */
  public final MetadataUpdateStandardContentMetadataRequest.Builder updateStandardContentMetadata() {
    return MetadataUpdateStandardContentMetadataRequest.builder(onshape);
  }

  /**
   * Create request for updateElementMetadata
   *  @return Request builder object
   */
  public final MetadataUpdateElementMetadataRequest.Builder updateElementMetadata() {
    return MetadataUpdateElementMetadataRequest.builder(onshape);
  }

  /**
   * Create request for updatePartMetadata
   *  @return Request builder object
   */
  public final MetadataUpdatePartMetadataRequest.Builder updatePartMetadata() {
    return MetadataUpdatePartMetadataRequest.builder(onshape);
  }
}
