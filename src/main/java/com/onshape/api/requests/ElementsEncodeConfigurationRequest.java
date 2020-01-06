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
import com.onshape.api.responses.ElementsEncodeConfigurationResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for encodeConfiguration API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ElementsEncodeConfigurationRequest {
  /**
   * Array of configuration parameters to be encoded
   */
  @JsonProperty("parameters")
  @NotNull
  ElementsEncodeConfigurationRequestParameters[] parameters;

  /**
   * The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
   */
  @JsonProperty("versionId")
  String versionId;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  ElementsEncodeConfigurationRequest(ElementsEncodeConfigurationRequestParameters[] parameters,
      String versionId, String linkDocumentId) {
    this.parameters = parameters;
    this.versionId = versionId;
    this.linkDocumentId = linkDocumentId;
  }

  /**
   * Get Array of configuration parameters to be encoded
   *
   * @return Array of configuration parameters to be encoded
   *
   */
  public final ElementsEncodeConfigurationRequestParameters[] getParameters() {
    return this.parameters;
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
     * Array of configuration parameters to be encoded
     */
    private ElementsEncodeConfigurationRequestParameters[] parameters;

    /**
     * The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
     */
    private String versionId;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Array of configuration parameters to be encoded
     *
     * @return Array of configuration parameters to be encoded
     *
     */
    public final ElementsEncodeConfigurationRequestParameters[] parameters() {
      return this.parameters;
    }

    /**
     * Set Array of configuration parameters to be encoded
     *
     * @param value Array of configuration parameters to be encoded
     *
     * @return the Builder object.
     */
    public final Builder parameters(ElementsEncodeConfigurationRequestParameters[] value) {
      this.parameters = value;
      return this;
    }

    /**
     * Get The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
     *
     * @return The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
     *
     * @param value The version of the referenced document. Meaningful only if specified together with the linkDocumentId query parameter.
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
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

    private ElementsEncodeConfigurationRequest build() {
      return new com.onshape.api.requests.ElementsEncodeConfigurationRequest(parameters,versionId,linkDocumentId);
    }

    /**
     * Calls encodeConfiguration method, Encodes a configuration into a string for use in API calls to the target element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param eid Element ID
     */
    public final ElementsEncodeConfigurationResponse call(String did, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/d/:did/e/:eid/configurationencodings", build(), onshape.buildMap("did", did, "eid", eid), onshape.buildMap("versionId", versionId, "linkDocumentId", linkDocumentId), com.onshape.api.responses.ElementsEncodeConfigurationResponse.class);
    }

    /**
     * Calls encodeConfiguration method, Encodes a configuration into a string for use in API calls to the target element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ElementsEncodeConfigurationResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/d/:did/e/:eid/configurationencodings", build(), onshape.buildMap("did", document.getDocumentId(), "eid", document.getElementId()), onshape.buildMap("versionId", versionId, "linkDocumentId", linkDocumentId), com.onshape.api.responses.ElementsEncodeConfigurationResponse.class);
    }
  }
}
