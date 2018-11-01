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
import com.onshape.api.responses.ElementsUpdateElementMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for updateElementMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class ElementsUpdateElementMetadataRequest {
  /**
   * Element name
   */
  @JsonProperty("name")
  String name;

  /**
   * Element description
   */
  @JsonProperty("description")
  String description;

  /**
   * Element part number (arbitrary string)
   */
  @JsonProperty("partNumber")
  String partNumber;

  /**
   * Element revision (arbitrary string)
   */
  @JsonProperty("revision")
  String revision;

  /**
   * Element vendor (Assembly only)
   */
  @JsonProperty("vendor")
  String vendor;

  /**
   * Element project (Assembly only)
   */
  @JsonProperty("project")
  String project;

  /**
   * Element product line (Assembly only)
   */
  @JsonProperty("productLine")
  String productLine;

  /**
   * Element title 1
   */
  @JsonProperty("title1")
  String title1;

  /**
   * Element title 2
   */
  @JsonProperty("title2")
  String title2;

  /**
   * Element title 3
   */
  @JsonProperty("title3")
  String title3;

  /**
   * Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   */
  @JsonProperty("state")
  String state;

  /**
   * Custom properties
   */
  @JsonProperty("customProperties")
  ElementsUpdateElementMetadataRequestCustomProperties[] customProperties;

  ElementsUpdateElementMetadataRequest(String name, String description, String partNumber,
      String revision, String vendor, String project, String productLine, String title1,
      String title2, String title3, String state,
      ElementsUpdateElementMetadataRequestCustomProperties[] customProperties) {
    this.name = name;
    this.description = description;
    this.partNumber = partNumber;
    this.revision = revision;
    this.vendor = vendor;
    this.project = project;
    this.productLine = productLine;
    this.title1 = title1;
    this.title2 = title2;
    this.title3 = title3;
    this.state = state;
    this.customProperties = customProperties;
  }

  /**
   * Get Element name
   *
   * @return Element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Element description
   *
   * @return Element description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Element part number (arbitrary string)
   *
   * @return Element part number (arbitrary string)
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Element revision (arbitrary string)
   *
   * @return Element revision (arbitrary string)
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Element vendor (Assembly only)
   *
   * @return Element vendor (Assembly only)
   *
   */
  public final String getVendor() {
    return this.vendor;
  }

  /**
   * Get Element project (Assembly only)
   *
   * @return Element project (Assembly only)
   *
   */
  public final String getProject() {
    return this.project;
  }

  /**
   * Get Element product line (Assembly only)
   *
   * @return Element product line (Assembly only)
   *
   */
  public final String getProductLine() {
    return this.productLine;
  }

  /**
   * Get Element title 1
   *
   * @return Element title 1
   *
   */
  public final String getTitle1() {
    return this.title1;
  }

  /**
   * Get Element title 2
   *
   * @return Element title 2
   *
   */
  public final String getTitle2() {
    return this.title2;
  }

  /**
   * Get Element title 3
   *
   * @return Element title 3
   *
   */
  public final String getTitle3() {
    return this.title3;
  }

  /**
   * Get Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   *
   * @return Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
   *
   */
  public final String getState() {
    return this.state;
  }

  /**
   * Get Custom properties
   *
   * @return Custom properties
   *
   */
  public final ElementsUpdateElementMetadataRequestCustomProperties[] getCustomProperties() {
    return this.customProperties;
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
     * Element name
     */
    private String name;

    /**
     * Element description
     */
    private String description;

    /**
     * Element part number (arbitrary string)
     */
    private String partNumber;

    /**
     * Element revision (arbitrary string)
     */
    private String revision;

    /**
     * Element vendor (Assembly only)
     */
    private String vendor;

    /**
     * Element project (Assembly only)
     */
    private String project;

    /**
     * Element product line (Assembly only)
     */
    private String productLine;

    /**
     * Element title 1
     */
    private String title1;

    /**
     * Element title 2
     */
    private String title2;

    /**
     * Element title 3
     */
    private String title3;

    /**
     * Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
     */
    private String state;

    /**
     * Custom properties
     */
    private ElementsUpdateElementMetadataRequestCustomProperties[] customProperties;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Element name
     *
     * @return Element name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Element name
     *
     * @param value Element name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Element description
     *
     * @return Element description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Element description
     *
     * @param value Element description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Element part number (arbitrary string)
     *
     * @return Element part number (arbitrary string)
     *
     */
    public final String partNumber() {
      return this.partNumber;
    }

    /**
     * Set Element part number (arbitrary string)
     *
     * @param value Element part number (arbitrary string)
     *
     * @return the Builder object.
     */
    public final Builder partNumber(String value) {
      this.partNumber = value;
      return this;
    }

    /**
     * Get Element revision (arbitrary string)
     *
     * @return Element revision (arbitrary string)
     *
     */
    public final String revision() {
      return this.revision;
    }

    /**
     * Set Element revision (arbitrary string)
     *
     * @param value Element revision (arbitrary string)
     *
     * @return the Builder object.
     */
    public final Builder revision(String value) {
      this.revision = value;
      return this;
    }

    /**
     * Get Element vendor (Assembly only)
     *
     * @return Element vendor (Assembly only)
     *
     */
    public final String vendor() {
      return this.vendor;
    }

    /**
     * Set Element vendor (Assembly only)
     *
     * @param value Element vendor (Assembly only)
     *
     * @return the Builder object.
     */
    public final Builder vendor(String value) {
      this.vendor = value;
      return this;
    }

    /**
     * Get Element project (Assembly only)
     *
     * @return Element project (Assembly only)
     *
     */
    public final String project() {
      return this.project;
    }

    /**
     * Set Element project (Assembly only)
     *
     * @param value Element project (Assembly only)
     *
     * @return the Builder object.
     */
    public final Builder project(String value) {
      this.project = value;
      return this;
    }

    /**
     * Get Element product line (Assembly only)
     *
     * @return Element product line (Assembly only)
     *
     */
    public final String productLine() {
      return this.productLine;
    }

    /**
     * Set Element product line (Assembly only)
     *
     * @param value Element product line (Assembly only)
     *
     * @return the Builder object.
     */
    public final Builder productLine(String value) {
      this.productLine = value;
      return this;
    }

    /**
     * Get Element title 1
     *
     * @return Element title 1
     *
     */
    public final String title1() {
      return this.title1;
    }

    /**
     * Set Element title 1
     *
     * @param value Element title 1
     *
     * @return the Builder object.
     */
    public final Builder title1(String value) {
      this.title1 = value;
      return this;
    }

    /**
     * Get Element title 2
     *
     * @return Element title 2
     *
     */
    public final String title2() {
      return this.title2;
    }

    /**
     * Set Element title 2
     *
     * @param value Element title 2
     *
     * @return the Builder object.
     */
    public final Builder title2(String value) {
      this.title2 = value;
      return this;
    }

    /**
     * Get Element title 3
     *
     * @return Element title 3
     *
     */
    public final String title3() {
      return this.title3;
    }

    /**
     * Set Element title 3
     *
     * @param value Element title 3
     *
     * @return the Builder object.
     */
    public final Builder title3(String value) {
      this.title3 = value;
      return this;
    }

    /**
     * Get Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
     *
     * @return Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
     *
     */
    public final String state() {
      return this.state;
    }

    /**
     * Set Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
     *
     * @param value Element state, which can be: IN_PROGRESS, PENDING, RELEASED, OBSOLETE, UNKNOWN
     *
     * @return the Builder object.
     */
    public final Builder state(String value) {
      this.state = value;
      return this;
    }

    /**
     * Get Custom properties
     *
     * @return Custom properties
     *
     */
    public final ElementsUpdateElementMetadataRequestCustomProperties[] customProperties() {
      return this.customProperties;
    }

    /**
     * Set Custom properties
     *
     * @param value Custom properties
     *
     * @return the Builder object.
     */
    public final Builder customProperties(ElementsUpdateElementMetadataRequestCustomProperties[] value) {
      this.customProperties = value;
      return this;
    }

    private ElementsUpdateElementMetadataRequest build() {
      return new com.onshape.api.requests.ElementsUpdateElementMetadataRequest(name,description,partNumber,revision,vendor,project,productLine,title1,title2,title3,state,customProperties);
    }

    /**
     * Calls updateElementMetadata method, Update element metadata
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
    public final ElementsUpdateElementMetadataResponse call(String did, WV wvType, String wv,
        String eid) throws OnshapeException {
      return onshape.call("post", "/elements/d/:did/[wv]/:wv/e/:eid/metadata", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap(), com.onshape.api.responses.ElementsUpdateElementMetadataResponse.class);
    }

    /**
     * Calls updateElementMetadata method, Update element metadata
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ElementsUpdateElementMetadataResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("post", "/elements/d/:did/[wv]/:wv/e/:eid/metadata", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", WV.Workspace, "wv", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.ElementsUpdateElementMetadataResponse.class);
    }
  }
}
