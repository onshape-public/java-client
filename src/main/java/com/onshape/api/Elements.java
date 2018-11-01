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

import com.onshape.api.requests.ElementsDecodeConfigurationStringRequest;
import com.onshape.api.requests.ElementsDeleteElementRequest;
import com.onshape.api.requests.ElementsEncodeConfigurationRequest;
import com.onshape.api.requests.ElementsGetByVersionRequest;
import com.onshape.api.requests.ElementsGetByWorkspaceRequest;
import com.onshape.api.requests.ElementsGetElementMetadataRequest;
import com.onshape.api.requests.ElementsGetElementRequest;
import com.onshape.api.requests.ElementsGetElementTranslatorFormatsRequest;
import com.onshape.api.requests.ElementsGetTranslatorFormatsRequest;
import com.onshape.api.requests.ElementsUpdateElementMetadataRequest;
import com.onshape.api.requests.ElementsUpdateRequest;
import com.onshape.api.requests.ElementsUploadFileRequest;

/**
 * Elements: API endpoints for Elements group.
 * &copy; 2018 Onshape Inc.
 */
public final class Elements {
  Onshape onshape;

  Elements(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for decodeConfigurationString
   *  @return Request builder object
   */
  public final ElementsDecodeConfigurationStringRequest.Builder decodeConfigurationString() {
    return ElementsDecodeConfigurationStringRequest.builder(onshape);
  }

  /**
   * Create request for deleteElement
   *  @return Request builder object
   */
  public final ElementsDeleteElementRequest.Builder deleteElement() {
    return ElementsDeleteElementRequest.builder(onshape);
  }

  /**
   * Create request for encodeConfiguration
   *  @return Request builder object
   */
  public final ElementsEncodeConfigurationRequest.Builder encodeConfiguration() {
    return ElementsEncodeConfigurationRequest.builder(onshape);
  }

  /**
   * Create request for getByVersion
   *  @return Request builder object
   */
  public final ElementsGetByVersionRequest.Builder getByVersion() {
    return ElementsGetByVersionRequest.builder(onshape);
  }

  /**
   * Create request for getByWorkspace
   *  @return Request builder object
   */
  public final ElementsGetByWorkspaceRequest.Builder getByWorkspace() {
    return ElementsGetByWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for getElement
   *  @return Request builder object
   */
  public final ElementsGetElementRequest.Builder getElement() {
    return ElementsGetElementRequest.builder(onshape);
  }

  /**
   * Create request for getElementTranslatorFormats
   *  @return Request builder object
   */
  public final ElementsGetElementTranslatorFormatsRequest.Builder getElementTranslatorFormats() {
    return ElementsGetElementTranslatorFormatsRequest.builder(onshape);
  }

  /**
   * Create request for getElementMetadata
   *  @return Request builder object
   */
  public final ElementsGetElementMetadataRequest.Builder getElementMetadata() {
    return ElementsGetElementMetadataRequest.builder(onshape);
  }

  /**
   * Create request for getTranslatorFormats
   *  @return Request builder object
   */
  public final ElementsGetTranslatorFormatsRequest.Builder getTranslatorFormats() {
    return ElementsGetTranslatorFormatsRequest.builder(onshape);
  }

  /**
   * Create request for updateElementMetadata
   *  @return Request builder object
   */
  public final ElementsUpdateElementMetadataRequest.Builder updateElementMetadata() {
    return ElementsUpdateElementMetadataRequest.builder(onshape);
  }

  /**
   * Create request for update
   *  @return Request builder object
   */
  public final ElementsUpdateRequest.Builder update() {
    return ElementsUpdateRequest.builder(onshape);
  }

  /**
   * Create request for uploadFile
   *  @return Request builder object
   */
  public final ElementsUploadFileRequest.Builder uploadFile() {
    return ElementsUploadFileRequest.builder(onshape);
  }
}
