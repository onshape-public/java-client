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
import com.onshape.api.responses.ElementsUpdateReferencesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ElementsUpdateReferencesRequest {
  /**
   * A list of reference updates to apply.
   */
  @JsonProperty("referenceUpdates")
  @NotNull
  ElementsUpdateReferencesRequestReferenceUpdates[] referenceUpdates;

  ElementsUpdateReferencesRequest(ElementsUpdateReferencesRequestReferenceUpdates[] referenceUpdates) {
    this.referenceUpdates = referenceUpdates;
  }

  /**
   * Get A list of reference updates to apply.
   *
   * @return A list of reference updates to apply.
   *
   */
  public final ElementsUpdateReferencesRequestReferenceUpdates[] getReferenceUpdates() {
    return this.referenceUpdates;
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
     * A list of reference updates to apply.
     */
    private ElementsUpdateReferencesRequestReferenceUpdates[] referenceUpdates;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get A list of reference updates to apply.
     *
     * @return A list of reference updates to apply.
     *
     */
    public final ElementsUpdateReferencesRequestReferenceUpdates[] referenceUpdates() {
      return this.referenceUpdates;
    }

    /**
     * Set A list of reference updates to apply.
     *
     * @param value A list of reference updates to apply.
     *
     * @return the Builder object.
     */
    public final Builder referenceUpdates(ElementsUpdateReferencesRequestReferenceUpdates[] value) {
      this.referenceUpdates = value;
      return this;
    }

    private ElementsUpdateReferencesRequest build() {
      return new com.onshape.api.requests.ElementsUpdateReferencesRequest(referenceUpdates);
    }

    /**
     * Calls updateReferences method, Update or replace references in an element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final ElementsUpdateReferencesResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/d/:did/w/:wid/e/:eid/updatereferences", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.ElementsUpdateReferencesResponse.class);
    }

    /**
     * Calls updateReferences method, Update or replace references in an element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ElementsUpdateReferencesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/elements/d/:did/w/:wid/e/:eid/updatereferences", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.ElementsUpdateReferencesResponse.class);
    }
  }
}
