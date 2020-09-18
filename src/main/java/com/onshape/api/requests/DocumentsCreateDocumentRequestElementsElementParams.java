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
import java.util.Map;

/**
 * Object used in calls to createDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCreateDocumentRequestElementsElementParams {
  /**
   * app element name
   */
  @JsonProperty("name")
  public String name;

  /**
   * app element format id
   */
  @JsonProperty("formatId")
  public String formatId;

  /**
   * app element description
   */
  @JsonProperty("description")
  public String description;

  /**
   * app element subelements
   */
  @JsonProperty("subelements")
  public DocumentsCreateDocumentRequestElementsElementParamsSubelements subelements;

  /**
   * app element location
   */
  @JsonProperty("location")
  public DocumentsCreateDocumentRequestElementsElementParamsLocation location;

  /**
   * app element JsonNode
   */
  @JsonProperty("jsonTree")
  public Map jsonTree;

  DocumentsCreateDocumentRequestElementsElementParams(String name, String formatId,
      String description,
      DocumentsCreateDocumentRequestElementsElementParamsSubelements subelements,
      DocumentsCreateDocumentRequestElementsElementParamsLocation location, Map jsonTree) {
    this.name = name;
    this.formatId = formatId;
    this.description = description;
    this.subelements = subelements;
    this.location = location;
    this.jsonTree = jsonTree;
  }

  /**
   * Get app element name
   *
   * @return app element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get app element format id
   *
   * @return app element format id
   *
   */
  public final String getFormatId() {
    return this.formatId;
  }

  /**
   * Get app element description
   *
   * @return app element description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get app element subelements
   *
   * @return app element subelements
   *
   */
  public final DocumentsCreateDocumentRequestElementsElementParamsSubelements getSubelements() {
    return this.subelements;
  }

  /**
   * Get app element location
   *
   * @return app element location
   *
   */
  public final DocumentsCreateDocumentRequestElementsElementParamsLocation getLocation() {
    return this.location;
  }

  /**
   * Get app element JsonNode
   *
   * @return app element JsonNode
   *
   */
  public final Map getJsonTree() {
    return this.jsonTree;
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
     * app element name
     */
    private String name;

    /**
     * app element format id
     */
    private String formatId;

    /**
     * app element description
     */
    private String description;

    /**
     * app element subelements
     */
    private DocumentsCreateDocumentRequestElementsElementParamsSubelements subelements;

    /**
     * app element location
     */
    private DocumentsCreateDocumentRequestElementsElementParamsLocation location;

    /**
     * app element JsonNode
     */
    private Map jsonTree;

    Builder() {
    }

    /**
     * Get app element name
     *
     * @return app element name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set app element name
     *
     * @param value app element name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get app element format id
     *
     * @return app element format id
     *
     */
    public final String formatId() {
      return this.formatId;
    }

    /**
     * Set app element format id
     *
     * @param value app element format id
     *
     * @return the Builder object.
     */
    public final Builder formatId(String value) {
      this.formatId = value;
      return this;
    }

    /**
     * Get app element description
     *
     * @return app element description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set app element description
     *
     * @param value app element description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get app element subelements
     *
     * @return app element subelements
     *
     */
    public final DocumentsCreateDocumentRequestElementsElementParamsSubelements subelements() {
      return this.subelements;
    }

    /**
     * Set app element subelements
     *
     * @param value app element subelements
     *
     * @return the Builder object.
     */
    public final Builder subelements(DocumentsCreateDocumentRequestElementsElementParamsSubelements value) {
      this.subelements = value;
      return this;
    }

    /**
     * Get app element location
     *
     * @return app element location
     *
     */
    public final DocumentsCreateDocumentRequestElementsElementParamsLocation location() {
      return this.location;
    }

    /**
     * Set app element location
     *
     * @param value app element location
     *
     * @return the Builder object.
     */
    public final Builder location(DocumentsCreateDocumentRequestElementsElementParamsLocation value) {
      this.location = value;
      return this;
    }

    /**
     * Get app element JsonNode
     *
     * @return app element JsonNode
     *
     */
    public final Map jsonTree() {
      return this.jsonTree;
    }

    /**
     * Set app element JsonNode
     *
     * @param value app element JsonNode
     *
     * @return the Builder object.
     */
    public final Builder jsonTree(Map value) {
      this.jsonTree = value;
      return this;
    }

    public final DocumentsCreateDocumentRequestElementsElementParams build() {
      return new com.onshape.api.requests.DocumentsCreateDocumentRequestElementsElementParams(name,formatId,description,subelements,location,jsonTree);
    }
  }
}
