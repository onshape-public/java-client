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
import com.onshape.api.responses.AssembliesGetNamedViewsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getNamedViews API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesGetNamedViewsRequest {
  /**
   * Whether views with a perspective projection should be omitted.
   */
  @JsonProperty("skipPerspective")
  Boolean skipPerspective;

  AssembliesGetNamedViewsRequest(Boolean skipPerspective) {
    this.skipPerspective = skipPerspective;
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
     * Whether views with a perspective projection should be omitted.
     */
    private Boolean skipPerspective;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether views with a perspective projection should be omitted.
     *
     * @return Whether views with a perspective projection should be omitted.
     *
     */
    public final Boolean skipPerspective() {
      return this.skipPerspective;
    }

    /**
     * Set Whether views with a perspective projection should be omitted.
     *
     * @param value Whether views with a perspective projection should be omitted.
     *
     * @return the Builder object.
     */
    public final Builder skipPerspective(Boolean value) {
      this.skipPerspective = value;
      return this;
    }

    private AssembliesGetNamedViewsRequest build() {
      return new com.onshape.api.requests.AssembliesGetNamedViewsRequest(skipPerspective);
    }

    /**
     * Calls getNamedViews method, Returns a map from view name to view data for the given element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param eid Element ID
     */
    public final AssembliesGetNamedViewsResponse call(String did, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/e/:eid/namedViews", build(), onshape.buildMap("did", did, "eid", eid), onshape.buildMap("skipPerspective", skipPerspective), com.onshape.api.responses.AssembliesGetNamedViewsResponse.class);
    }

    /**
     * Calls getNamedViews method, Returns a map from view name to view data for the given element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesGetNamedViewsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/assemblies/d/:did/e/:eid/namedViews", build(), onshape.buildMap("did", document.getDocumentId(), "eid", document.getElementId()), onshape.buildMap("skipPerspective", skipPerspective), com.onshape.api.responses.AssembliesGetNamedViewsResponse.class);
    }
  }
}
