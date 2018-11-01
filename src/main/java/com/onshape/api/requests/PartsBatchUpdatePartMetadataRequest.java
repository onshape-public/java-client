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
import com.onshape.api.responses.PartsBatchUpdatePartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for batchUpdatePartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsBatchUpdatePartMetadataRequest {
  /**
   * Array of parts to be updated
   */
  @JsonProperty("parts")
  @NotNull
  PartsBatchUpdatePartMetadataRequestParts[] parts;

  /**
   * Description of the update (as appear in document history)
   */
  @JsonProperty("editDescription")
  String editDescription;

  PartsBatchUpdatePartMetadataRequest(PartsBatchUpdatePartMetadataRequestParts[] parts,
      String editDescription) {
    this.parts = parts;
    this.editDescription = editDescription;
  }

  /**
   * Get Array of parts to be updated
   *
   * @return Array of parts to be updated
   *
   */
  public final PartsBatchUpdatePartMetadataRequestParts[] getParts() {
    return this.parts;
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
     * Array of parts to be updated
     */
    private PartsBatchUpdatePartMetadataRequestParts[] parts;

    /**
     * Description of the update (as appear in document history)
     */
    private String editDescription;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Array of parts to be updated
     *
     * @return Array of parts to be updated
     *
     */
    public final PartsBatchUpdatePartMetadataRequestParts[] parts() {
      return this.parts;
    }

    /**
     * Set Array of parts to be updated
     *
     * @param value Array of parts to be updated
     *
     * @return the Builder object.
     */
    public final Builder parts(PartsBatchUpdatePartMetadataRequestParts[] value) {
      this.parts = value;
      return this;
    }

    /**
     * Get Description of the update (as appear in document history)
     *
     * @return Description of the update (as appear in document history)
     *
     */
    public final String editDescription() {
      return this.editDescription;
    }

    /**
     * Set Description of the update (as appear in document history)
     *
     * @param value Description of the update (as appear in document history)
     *
     * @return the Builder object.
     */
    public final Builder editDescription(String value) {
      this.editDescription = value;
      return this;
    }

    private PartsBatchUpdatePartMetadataRequest build() {
      return new com.onshape.api.requests.PartsBatchUpdatePartMetadataRequest(parts,editDescription);
    }

    /**
     * Calls batchUpdatePartMetadata method, Part metadata batch update
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     */
    public final PartsBatchUpdatePartMetadataResponse call(String did, WVM wvmType, String wvm)
        throws OnshapeException {
      return onshape.call("post", "/parts/d/:did/[wvm]/:wvm", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm), onshape.buildMap("editDescription", editDescription), com.onshape.api.responses.PartsBatchUpdatePartMetadataResponse.class);
    }

    /**
     * Calls batchUpdatePartMetadata method, Part metadata batch update
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartsBatchUpdatePartMetadataResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/parts/d/:did/[wvm]/:wvm", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.PartsBatchUpdatePartMetadataResponse.class);
    }
  }
}
