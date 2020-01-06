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
import com.onshape.api.responses.BlobElementsUpdateMeshUnitsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for updateMeshUnits API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class BlobElementsUpdateMeshUnitsRequest {
  /**
   * the unit that the Mesh file should be retranslated to
   */
  @JsonProperty("unit")
  String unit;

  /**
   * notification id that corresponds with the beginning of the operation.
   */
  @JsonProperty("uploadId")
  String uploadId;

  BlobElementsUpdateMeshUnitsRequest(String unit, String uploadId) {
    this.unit = unit;
    this.uploadId = uploadId;
  }

  /**
   * Get the unit that the Mesh file should be retranslated to
   *
   * @return the unit that the Mesh file should be retranslated to
   *
   */
  public final String getUnit() {
    return this.unit;
  }

  /**
   * Get notification id that corresponds with the beginning of the operation.
   *
   * @return notification id that corresponds with the beginning of the operation.
   *
   */
  public final String getUploadId() {
    return this.uploadId;
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
     * the unit that the Mesh file should be retranslated to
     */
    private String unit;

    /**
     * notification id that corresponds with the beginning of the operation.
     */
    private String uploadId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get the unit that the Mesh file should be retranslated to
     *
     * @return the unit that the Mesh file should be retranslated to
     *
     */
    public final String unit() {
      return this.unit;
    }

    /**
     * Set the unit that the Mesh file should be retranslated to
     *
     * @param value the unit that the Mesh file should be retranslated to
     *
     * @return the Builder object.
     */
    public final Builder unit(String value) {
      this.unit = value;
      return this;
    }

    /**
     * Get notification id that corresponds with the beginning of the operation.
     *
     * @return notification id that corresponds with the beginning of the operation.
     *
     */
    public final String uploadId() {
      return this.uploadId;
    }

    /**
     * Set notification id that corresponds with the beginning of the operation.
     *
     * @param value notification id that corresponds with the beginning of the operation.
     *
     * @return the Builder object.
     */
    public final Builder uploadId(String value) {
      this.uploadId = value;
      return this;
    }

    private BlobElementsUpdateMeshUnitsRequest build() {
      return new com.onshape.api.requests.BlobElementsUpdateMeshUnitsRequest(unit,uploadId);
    }

    /**
     * Calls updateMeshUnits method, Updates the units of a previously imported mesh (STL or OBJ) file.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final BlobElementsUpdateMeshUnitsResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/blobelements/d/:did/w/:wid/e/:eid/units", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.BlobElementsUpdateMeshUnitsResponse.class);
    }

    /**
     * Calls updateMeshUnits method, Updates the units of a previously imported mesh (STL or OBJ) file.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final BlobElementsUpdateMeshUnitsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/blobelements/d/:did/w/:wid/e/:eid/units", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.BlobElementsUpdateMeshUnitsResponse.class);
    }
  }
}
