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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getBillOfMaterials API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetBillOfMaterialsResponseBomTableItemsItemSource {
  /**
   * The id of the onshape document containing this item
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * &quot;v&quot; if the item is from a version or &quot;w&quot; if it is from a workspace
   */
  @JsonProperty("wvmType")
  public String wvmType;

  /**
   * The id of the version or workspace containing the item
   */
  @JsonProperty("wvmId")
  public String wvmId;

  /**
   * The id of the element in the workspace or version of the document containing the item
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * The id of the part for this item. Will be blank if the item is not a part
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Get The id of the onshape document containing this item
   *
   * @return The id of the onshape document containing this item
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get &quot;v&quot; if the item is from a version or &quot;w&quot; if it is from a workspace
   *
   * @return &quot;v&quot; if the item is from a version or &quot;w&quot; if it is from a workspace
   *
   */
  public final String getWvmType() {
    return this.wvmType;
  }

  /**
   * Get The id of the version or workspace containing the item
   *
   * @return The id of the version or workspace containing the item
   *
   */
  public final String getWvmId() {
    return this.wvmId;
  }

  /**
   * Get The id of the element in the workspace or version of the document containing the item
   *
   * @return The id of the element in the workspace or version of the document containing the item
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The id of the part for this item. Will be blank if the item is not a part
   *
   * @return The id of the part for this item. Will be blank if the item is not a part
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
