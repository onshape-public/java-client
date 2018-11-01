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
import com.onshape.api.responses.MetadataUpdateStandardContentMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateStandardContentMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class MetadataUpdateStandardContentMetadataRequest {
  /**
   * Collection of metadata object updates
   */
  @JsonProperty("items")
  @NotNull
  MetadataUpdateStandardContentMetadataRequestItems[] items;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  MetadataUpdateStandardContentMetadataRequest(MetadataUpdateStandardContentMetadataRequestItems[] items,
      String linkDocumentId) {
    this.items = items;
    this.linkDocumentId = linkDocumentId;
  }

  /**
   * Get Collection of metadata object updates
   *
   * @return Collection of metadata object updates
   *
   */
  public final MetadataUpdateStandardContentMetadataRequestItems[] getItems() {
    return this.items;
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
     * Collection of metadata object updates
     */
    private MetadataUpdateStandardContentMetadataRequestItems[] items;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Collection of metadata object updates
     *
     * @return Collection of metadata object updates
     *
     */
    public final MetadataUpdateStandardContentMetadataRequestItems[] items() {
      return this.items;
    }

    /**
     * Set Collection of metadata object updates
     *
     * @param value Collection of metadata object updates
     *
     * @return the Builder object.
     */
    public final Builder items(MetadataUpdateStandardContentMetadataRequestItems[] value) {
      this.items = value;
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

    private MetadataUpdateStandardContentMetadataRequest build() {
      return new com.onshape.api.requests.MetadataUpdateStandardContentMetadataRequest(items,linkDocumentId);
    }

    /**
     * Calls updateStandardContentMetadata method, Update metadata of a standard content part in a version for a specific user or company.
     *     Configuration information must be included within the items.*.href fields. The response format varies depending
     *     on whether there are multiple items to update.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Part ID
     *
     * @param did Document ID
     *
     * @param vid Version ID
     *
     * @param eid Element ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final MetadataUpdateStandardContentMetadataResponse call(String pid, String did,
        String vid, String eid, String oid) throws OnshapeException {
      return onshape.call("post", "/metadata/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/p/:pid", build(), onshape.buildMap("pid", pid, "did", did, "vid", vid, "eid", eid, "oid", oid), onshape.buildMap("linkDocumentId", linkDocumentId), com.onshape.api.responses.MetadataUpdateStandardContentMetadataResponse.class);
    }

    /**
     * Calls updateStandardContentMetadata method, Update metadata of a standard content part in a version for a specific user or company.
     *     Configuration information must be included within the items.*.href fields. The response format varies depending
     *     on whether there are multiple items to update.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Part ID
     *
     * @param vid Version ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final MetadataUpdateStandardContentMetadataResponse call(OnshapeDocument document,
        String pid, String vid, String oid) throws OnshapeException {
      return onshape.call("post", "/metadata/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/p/:pid", build(), onshape.buildMap("pid", pid, "did", document.getDocumentId(), "vid", vid, "eid", document.getElementId(), "oid", oid), onshape.buildMap(), com.onshape.api.responses.MetadataUpdateStandardContentMetadataResponse.class);
    }
  }
}
