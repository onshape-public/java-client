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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updateReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ElementsUpdateReferencesRequestReferenceUpdates {
  /**
   * The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
   */
  @JsonProperty("idsToUpdate")
  public String[] idsToUpdate;

  /**
   * All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
   */
  @JsonProperty("fromReference")
  public ElementsUpdateReferencesRequestReferenceUpdatesFromReference fromReference;

  /**
   * Identifies the destination reference for the items.
   */
  @JsonProperty("toReference")
  public ElementsUpdateReferencesRequestReferenceUpdatesToReference toReference;

  ElementsUpdateReferencesRequestReferenceUpdates(String[] idsToUpdate,
      ElementsUpdateReferencesRequestReferenceUpdatesFromReference fromReference,
      ElementsUpdateReferencesRequestReferenceUpdatesToReference toReference) {
    this.idsToUpdate = idsToUpdate;
    this.fromReference = fromReference;
    this.toReference = toReference;
  }

  /**
   * Get The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
   *
   * @return The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
   *
   */
  public final String[] getIdsToUpdate() {
    return this.idsToUpdate;
  }

  /**
   * Get All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
   *
   * @return All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
   *
   */
  public final ElementsUpdateReferencesRequestReferenceUpdatesFromReference getFromReference() {
    return this.fromReference;
  }

  /**
   * Get Identifies the destination reference for the items.
   *
   * @return Identifies the destination reference for the items.
   *
   */
  public final ElementsUpdateReferencesRequestReferenceUpdatesToReference getToReference() {
    return this.toReference;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
     */
    private String[] idsToUpdate;

    /**
     * All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
     */
    private ElementsUpdateReferencesRequestReferenceUpdatesFromReference fromReference;

    /**
     * Identifies the destination reference for the items.
     */
    private ElementsUpdateReferencesRequestReferenceUpdatesToReference toReference;

    Builder() {
    }

    /**
     * Get The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
     *
     * @return The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
     *
     */
    public final String[] idsToUpdate() {
      return this.idsToUpdate;
    }

    /**
     * Set The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
     *
     * @param value The ids of items in the element that should be updated. For an assembly element these are the ids of the instances. For a part studio element these are the nodeIds of the features. Should not be specified with fromReference.
     *
     * @return the Builder object.
     */
    public final Builder idsToUpdate(String[] value) {
      this.idsToUpdate = value;
      return this;
    }

    /**
     * Get All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
     *
     * @return All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
     *
     */
    public final ElementsUpdateReferencesRequestReferenceUpdatesFromReference fromReference() {
      return this.fromReference;
    }

    /**
     * Set All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
     *
     * @param value All instances or features in the element that match this reference will be updated. Should not be specified with idsToUpdate.
     *
     * @return the Builder object.
     */
    public final Builder fromReference(
        ElementsUpdateReferencesRequestReferenceUpdatesFromReference value) {
      this.fromReference = value;
      return this;
    }

    /**
     * Get Identifies the destination reference for the items.
     *
     * @return Identifies the destination reference for the items.
     *
     */
    public final ElementsUpdateReferencesRequestReferenceUpdatesToReference toReference() {
      return this.toReference;
    }

    /**
     * Set Identifies the destination reference for the items.
     *
     * @param value Identifies the destination reference for the items.
     *
     * @return the Builder object.
     */
    public final Builder toReference(
        ElementsUpdateReferencesRequestReferenceUpdatesToReference value) {
      this.toReference = value;
      return this;
    }

    public final ElementsUpdateReferencesRequestReferenceUpdates build() {
      return new com.onshape.api.requests.ElementsUpdateReferencesRequestReferenceUpdates(idsToUpdate,fromReference,toReference);
    }
  }
}
