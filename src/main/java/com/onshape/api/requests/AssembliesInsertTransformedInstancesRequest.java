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
import com.onshape.api.responses.AssembliesInsertTransformedInstancesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for insertTransformedInstances API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesInsertTransformedInstancesRequest {
  /**
   * A list of instances grouped by transform.
   */
  @JsonProperty("transformGroups")
  @NotNull
  AssembliesInsertTransformedInstancesRequestTransformGroups[] transformGroups;

  AssembliesInsertTransformedInstancesRequest(AssembliesInsertTransformedInstancesRequestTransformGroups[] transformGroups) {
    this.transformGroups = transformGroups;
  }

  /**
   * Get A list of instances grouped by transform.
   *
   * @return A list of instances grouped by transform.
   *
   */
  public final AssembliesInsertTransformedInstancesRequestTransformGroups[] getTransformGroups() {
    return this.transformGroups;
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
     * A list of instances grouped by transform.
     */
    private AssembliesInsertTransformedInstancesRequestTransformGroups[] transformGroups;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get A list of instances grouped by transform.
     *
     * @return A list of instances grouped by transform.
     *
     */
    public final AssembliesInsertTransformedInstancesRequestTransformGroups[] transformGroups() {
      return this.transformGroups;
    }

    /**
     * Set A list of instances grouped by transform.
     *
     * @param value A list of instances grouped by transform.
     *
     * @return the Builder object.
     */
    public final Builder transformGroups(AssembliesInsertTransformedInstancesRequestTransformGroups[] value) {
      this.transformGroups = value;
      return this;
    }

    private AssembliesInsertTransformedInstancesRequest build() {
      return new com.onshape.api.requests.AssembliesInsertTransformedInstancesRequest(transformGroups);
    }

    /**
     * Calls insertTransformedInstances method, Insert a list of instances, each with a transform.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AssembliesInsertTransformedInstancesResponse call(String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/transformedinstances", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AssembliesInsertTransformedInstancesResponse.class);
    }

    /**
     * Calls insertTransformedInstances method, Insert a list of instances, each with a transform.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesInsertTransformedInstancesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/transformedinstances", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesInsertTransformedInstancesResponse.class);
    }
  }
}
