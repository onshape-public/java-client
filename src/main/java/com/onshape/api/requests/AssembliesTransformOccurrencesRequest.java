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
import com.onshape.api.responses.AssembliesTransformOccurrencesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for transformOccurrences API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesTransformOccurrencesRequest {
  /**
   * A list of occurrences to transform.
   */
  @JsonProperty("occurrences")
  @NotNull
  AssembliesTransformOccurrencesRequestOccurrences[] occurrences;

  /**
   * The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   */
  @JsonProperty("transform")
  @NotNull
  Number[] transform;

  /**
   * Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
   */
  @JsonProperty("isRelative")
  @NotNull
  Boolean isRelative;

  AssembliesTransformOccurrencesRequest(AssembliesTransformOccurrencesRequestOccurrences[] occurrences,
      Number[] transform, Boolean isRelative) {
    this.occurrences = occurrences;
    this.transform = transform;
    this.isRelative = isRelative;
  }

  /**
   * Get A list of occurrences to transform.
   *
   * @return A list of occurrences to transform.
   *
   */
  public final AssembliesTransformOccurrencesRequestOccurrences[] getOccurrences() {
    return this.occurrences;
  }

  /**
   * Get The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   *
   * @return The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
   *
   */
  public final Number[] getTransform() {
    return this.transform;
  }

  /**
   * Get Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
   *
   * @return Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
   *
   */
  public final Boolean getIsRelative() {
    return this.isRelative;
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
     * A list of occurrences to transform.
     */
    private AssembliesTransformOccurrencesRequestOccurrences[] occurrences;

    /**
     * The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     */
    private Number[] transform;

    /**
     * Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
     */
    private Boolean isRelative;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get A list of occurrences to transform.
     *
     * @return A list of occurrences to transform.
     *
     */
    public final AssembliesTransformOccurrencesRequestOccurrences[] occurrences() {
      return this.occurrences;
    }

    /**
     * Set A list of occurrences to transform.
     *
     * @param value A list of occurrences to transform.
     *
     * @return the Builder object.
     */
    public final Builder occurrences(AssembliesTransformOccurrencesRequestOccurrences[] value) {
      this.occurrences = value;
      return this;
    }

    /**
     * Get The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @return The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     */
    public final Number[] transform() {
      return this.transform;
    }

    /**
     * Set The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @param value The transform to apply to the occurrences. Must be 9, 12, or 16 elements in length, representing a 3x3, 4x3 or 4x4 matrix, respectively. All translation matrix components are in meters.
     *
     * @return the Builder object.
     */
    public final Builder transform(Number[] value) {
      this.transform = value;
      return this;
    }

    /**
     * Get Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
     *
     * @return Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
     *
     */
    public final Boolean isRelative() {
      return this.isRelative;
    }

    /**
     * Set Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
     *
     * @param value Whether the transform is relative or absolute. Each occurrence in an assembly has a transform that positions it relative to the top-most assembly. An absolute transform operation sets the transform of the occurrence and each child occurrence to the specified transform. A relative transform operation combines the specified transform with the existing transform of the occurrence and with each child occurrence transform.
     *
     * @return the Builder object.
     */
    public final Builder isRelative(Boolean value) {
      this.isRelative = value;
      return this;
    }

    private AssembliesTransformOccurrencesRequest build() {
      return new com.onshape.api.requests.AssembliesTransformOccurrencesRequest(occurrences,transform,isRelative);
    }

    /**
     * Calls transformOccurrences method, Transform a list of assembly occurrences.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AssembliesTransformOccurrencesResponse call(String did, String wid, String eid)
        throws OnshapeException {
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/occurrencetransforms", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AssembliesTransformOccurrencesResponse.class);
    }

    /**
     * Calls transformOccurrences method, Transform a list of assembly occurrences.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final AssembliesTransformOccurrencesResponse call(OnshapeDocument document, String wid)
        throws OnshapeException {
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/occurrencetransforms", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid, "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesTransformOccurrencesResponse.class);
    }
  }
}
