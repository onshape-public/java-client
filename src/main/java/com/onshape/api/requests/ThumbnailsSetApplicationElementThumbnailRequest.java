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
import com.onshape.api.responses.ThumbnailsSetApplicationElementThumbnailResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for setApplicationElementThumbnail API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class ThumbnailsSetApplicationElementThumbnailRequest {
  /**
   * List of thumbnails corresponding to an element
   */
  @JsonProperty("thumbnails")
  @NotNull
  ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] thumbnails;

  /**
   * Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
   */
  @JsonProperty("overwrite")
  Boolean overwrite;

  ThumbnailsSetApplicationElementThumbnailRequest(ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] thumbnails,
      Boolean overwrite) {
    this.thumbnails = thumbnails;
    this.overwrite = overwrite;
  }

  /**
   * Get List of thumbnails corresponding to an element
   *
   * @return List of thumbnails corresponding to an element
   *
   */
  public final ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] getThumbnails() {
    return this.thumbnails;
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
     * List of thumbnails corresponding to an element
     */
    private ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] thumbnails;

    /**
     * Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
     */
    private Boolean overwrite;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get List of thumbnails corresponding to an element
     *
     * @return List of thumbnails corresponding to an element
     *
     */
    public final ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] thumbnails() {
      return this.thumbnails;
    }

    /**
     * Set List of thumbnails corresponding to an element
     *
     * @param value List of thumbnails corresponding to an element
     *
     * @return the Builder object.
     */
    public final Builder thumbnails(ThumbnailsSetApplicationElementThumbnailRequestThumbnails[] value) {
      this.thumbnails = value;
      return this;
    }

    /**
     * Get Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
     *
     * @return Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
     *
     */
    public final Boolean overwrite() {
      return this.overwrite;
    }

    /**
     * Set Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
     *
     * @param value Set to true when a different thumbnail needs to be made the primary thumbnail or secondary thumbnails need to be updated. This deletes all associated thumbnails and then sets the new thumbnails. Ensure that the primary and all non-primary thumbnails information are specified.
     *
     * @return the Builder object.
     */
    public final Builder overwrite(Boolean value) {
      this.overwrite = value;
      return this;
    }

    private ThumbnailsSetApplicationElementThumbnailRequest build() {
      return new com.onshape.api.requests.ThumbnailsSetApplicationElementThumbnailRequest(thumbnails,overwrite);
    }

    /**
     * Calls setApplicationElementThumbnail method, Set element thumbnails for an application element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     *
     * @param eid Element ID
     */
    public final ThumbnailsSetApplicationElementThumbnailResponse call(String did, WV wvType,
        String wv, String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/thumbnails/d/:did/[wv]/:wv/e/:eid", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap("overwrite", overwrite), com.onshape.api.responses.ThumbnailsSetApplicationElementThumbnailResponse.class);
    }

    /**
     * Calls setApplicationElementThumbnail method, Set element thumbnails for an application element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ThumbnailsSetApplicationElementThumbnailResponse call(OnshapeDocument document)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/thumbnails/d/:did/[wv]/:wv/e/:eid", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.ThumbnailsSetApplicationElementThumbnailResponse.class);
    }
  }
}
