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
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.AssembliesGetBoundingBoxesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getBoundingBoxes API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesGetBoundingBoxesRequest {
  /**
   * Element microversion ID
   */
  @JsonProperty("elementMicroversionId")
  String elementMicroversionId;

  /**
   * Include hidden instances in bounding box computation
   */
  @JsonProperty("includeHidden")
  String includeHidden;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AssembliesGetBoundingBoxesRequest(String elementMicroversionId, String includeHidden,
      String linkDocumentId) {
    this.elementMicroversionId = elementMicroversionId;
    this.includeHidden = includeHidden;
    this.linkDocumentId = linkDocumentId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Element microversion ID
     */
    private String elementMicroversionId;

    /**
     * Include hidden instances in bounding box computation
     */
    private String includeHidden;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Element microversion ID
     *
     * @return Element microversion ID
     *
     */
    public final String elementMicroversionId() {
      return this.elementMicroversionId;
    }

    /**
     * Set Element microversion ID
     *
     * @param value Element microversion ID
     *
     * @return the Builder object.
     */
    public final Builder elementMicroversionId(String value) {
      this.elementMicroversionId = value;
      return this;
    }

    /**
     * Get Include hidden instances in bounding box computation
     *
     * @return Include hidden instances in bounding box computation
     *
     */
    public final String includeHidden() {
      return this.includeHidden;
    }

    /**
     * Set Include hidden instances in bounding box computation
     *
     * @param value Include hidden instances in bounding box computation
     *
     * @return the Builder object.
     */
    public final Builder includeHidden(String value) {
      this.includeHidden = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private AssembliesGetBoundingBoxesRequest build() {
      return new com.onshape.api.requests.AssembliesGetBoundingBoxesRequest(elementMicroversionId,includeHidden,linkDocumentId);
    }

    /**
     * Calls getBoundingBoxes method, Get the bounding box of an Assembly, or an empty object if the Assembly is empty. All coordinates
     *                 are in meters.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final AssembliesGetBoundingBoxesResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/boundingboxes", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("elementMicroversionId", elementMicroversionId, "includeHidden", includeHidden, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AssembliesGetBoundingBoxesResponse.class);
    }

    /**
     * Calls getBoundingBoxes method, Get the bounding box of an Assembly, or an empty object if the Assembly is empty. All coordinates
     *                 are in meters.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesGetBoundingBoxesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/boundingboxes", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesGetBoundingBoxesResponse.class);
    }
  }
}
