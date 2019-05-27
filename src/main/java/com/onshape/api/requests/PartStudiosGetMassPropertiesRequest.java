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
import com.onshape.api.responses.PartStudiosGetMassPropertiesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getMassProperties API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosGetMassPropertiesRequest {
  /**
   * IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
   */
  @JsonProperty("partId")
  String partId;

  /**
   * If true, specified parts will be evaluated as a single object instead of individually
   */
  @JsonProperty("massAsGroup")
  Boolean massAsGroup;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  PartStudiosGetMassPropertiesRequest(String partId, Boolean massAsGroup, String linkDocumentId,
      String configuration) {
    this.partId = partId;
    this.massAsGroup = massAsGroup;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
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
     * IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
     */
    private String partId;

    /**
     * If true, specified parts will be evaluated as a single object instead of individually
     */
    private Boolean massAsGroup;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
     *
     * @return IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
     *
     * @param value IDs of the parts for which to retrieve mass properties (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD)
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get If true, specified parts will be evaluated as a single object instead of individually
     *
     * @return If true, specified parts will be evaluated as a single object instead of individually
     *
     */
    public final Boolean massAsGroup() {
      return this.massAsGroup;
    }

    /**
     * Set If true, specified parts will be evaluated as a single object instead of individually
     *
     * @param value If true, specified parts will be evaluated as a single object instead of individually
     *
     * @return the Builder object.
     */
    public final Builder massAsGroup(Boolean value) {
      this.massAsGroup = value;
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

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    private PartStudiosGetMassPropertiesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetMassPropertiesRequest(partId,massAsGroup,linkDocumentId,configuration);
    }

    /**
     * Calls getMassProperties method, Get the mass properties of a part studio or parts; parts must have density in order to have mass.
     *                 For properties that come in sets of three, the first set is the calculated value, and the second
     *                 and third are minimum and maximum possible values considering tolerance.
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
    public final PartStudiosGetMassPropertiesResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/massproperties", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partId", partId, "massAsGroup", massAsGroup, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetMassPropertiesResponse.class);
    }

    /**
     * Calls getMassProperties method, Get the mass properties of a part studio or parts; parts must have density in order to have mass.
     *                 For properties that come in sets of three, the first set is the calculated value, and the second
     *                 and third are minimum and maximum possible values considering tolerance.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetMassPropertiesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/massproperties", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("partId", partId, "massAsGroup", massAsGroup, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetMassPropertiesResponse.class);
    }
  }
}
