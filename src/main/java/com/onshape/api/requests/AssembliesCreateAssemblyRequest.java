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
import com.onshape.api.responses.AssembliesCreateAssemblyResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createAssembly API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesCreateAssemblyRequest {
  /**
   * An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
   */
  @JsonProperty("name")
  @NotNull
  String name;

  AssembliesCreateAssemblyRequest(String name) {
    this.name = name;
  }

  /**
   * Get An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
   *
   * @return An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
   *
   */
  public final String getName() {
    return this.name;
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
     * An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
     */
    private String name;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
     *
     * @return An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
     *
     * @param value An optional name for the assembly. If not specified, it is named Assembly &lt;n&gt;
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    private AssembliesCreateAssemblyRequest build() {
      return new com.onshape.api.requests.AssembliesCreateAssemblyRequest(name);
    }

    /**
     * Calls createAssembly method, Create an new assembly tab in the document.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final AssembliesCreateAssemblyResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.AssembliesCreateAssemblyResponse.class);
    }

    /**
     * Calls createAssembly method, Create an new assembly tab in the document.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesCreateAssemblyResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.AssembliesCreateAssemblyResponse.class);
    }
  }
}
