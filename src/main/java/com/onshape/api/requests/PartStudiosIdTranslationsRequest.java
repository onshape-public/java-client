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
import com.onshape.api.responses.PartStudiosIdTranslationsResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for idTranslations API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosIdTranslationsRequest {
  /**
   * document microversion of the source ids.
   */
  @JsonProperty("sourceDocumentMicroversion")
  @NotNull
  String sourceDocumentMicroversion;

  /**
   * Array of topology ID strings
   */
  @JsonProperty("ids")
  @NotNull
  String[] ids;

  /**
   * The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
   */
  @JsonProperty("linkDocumentId")
  @NotNull
  String linkDocumentId;

  PartStudiosIdTranslationsRequest(String sourceDocumentMicroversion, String[] ids,
      String linkDocumentId) {
    this.sourceDocumentMicroversion = sourceDocumentMicroversion;
    this.ids = ids;
    this.linkDocumentId = linkDocumentId;
  }

  /**
   * Get document microversion of the source ids.
   *
   * @return document microversion of the source ids.
   *
   */
  public final String getSourceDocumentMicroversion() {
    return this.sourceDocumentMicroversion;
  }

  /**
   * Get Array of topology ID strings
   *
   * @return Array of topology ID strings
   *
   */
  public final String[] getIds() {
    return this.ids;
  }

  /**
   * Get The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
   *
   * @return The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
   *
   */
  public final String getLinkDocumentId() {
    return this.linkDocumentId;
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
     * document microversion of the source ids.
     */
    private String sourceDocumentMicroversion;

    /**
     * Array of topology ID strings
     */
    private String[] ids;

    /**
     * The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get document microversion of the source ids.
     *
     * @return document microversion of the source ids.
     *
     */
    public final String sourceDocumentMicroversion() {
      return this.sourceDocumentMicroversion;
    }

    /**
     * Set document microversion of the source ids.
     *
     * @param value document microversion of the source ids.
     *
     * @return the Builder object.
     */
    public final Builder sourceDocumentMicroversion(String value) {
      this.sourceDocumentMicroversion = value;
      return this;
    }

    /**
     * Get Array of topology ID strings
     *
     * @return Array of topology ID strings
     *
     */
    public final String[] ids() {
      return this.ids;
    }

    /**
     * Set Array of topology ID strings
     *
     * @param value Array of topology ID strings
     *
     * @return the Builder object.
     */
    public final Builder ids(String[] value) {
      this.ids = value;
      return this;
    }

    /**
     * Get The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
     *
     * @return The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
     *
     * @param value The id from which this request originated, in the case that it is different than :did and :wvm is not a workspace.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private PartStudiosIdTranslationsRequest build() {
      return new com.onshape.api.requests.PartStudiosIdTranslationsRequest(sourceDocumentMicroversion,ids,linkDocumentId);
    }

    /**
     * Calls idTranslations method, Translate a list of part, face, etc ids defined in a specific microversion of a document to a
     *                 corresponding list of ids in the current microversion of a workspace of the document or other
     *                 specific version/microversion. This will also allow converting between configurations, although a
     *                 particular ID might not have an equivalent in another configuration.
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
    public final PartStudiosIdTranslationsResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/idtranslations", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap(), com.onshape.api.responses.PartStudiosIdTranslationsResponse.class);
    }

    /**
     * Calls idTranslations method, Translate a list of part, face, etc ids defined in a specific microversion of a document to a
     *                 corresponding list of ids in the current microversion of a workspace of the document or other
     *                 specific version/microversion. This will also allow converting between configurations, although a
     *                 particular ID might not have an equivalent in another configuration.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosIdTranslationsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/idtranslations", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.PartStudiosIdTranslationsResponse.class);
    }
  }
}
