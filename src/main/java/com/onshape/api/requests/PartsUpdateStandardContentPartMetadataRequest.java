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
import com.onshape.api.responses.PartsUpdateStandardContentPartMetadataResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateStandardContentPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsUpdateStandardContentPartMetadataRequest {
  /**
   * Configuration in which to apply updates
   */
  @JsonProperty("configuration")
  @NotNull
  String configuration;

  /**
   * Part description
   */
  @JsonProperty("description")
  String description;

  /**
   * Part number
   */
  @JsonProperty("partNumber")
  String partNumber;

  /**
   * Part revision
   */
  @JsonProperty("revision")
  String revision;

  /**
   * Part vendor
   */
  @JsonProperty("vendor")
  String vendor;

  /**
   * Part project
   */
  @JsonProperty("project")
  String project;

  /**
   * Part product line
   */
  @JsonProperty("productLine")
  String productLine;

  /**
   * Part title 1
   */
  @JsonProperty("title1")
  String title1;

  /**
   * Part title 2
   */
  @JsonProperty("title2")
  String title2;

  /**
   * Part title 3
   */
  @JsonProperty("title3")
  String title3;

  /**
   * Part material (Can only be modified in workspace)
   */
  @JsonProperty("material")
  PartsUpdateStandardContentPartMetadataRequestMaterial material;

  /**
   * Custom properties
   */
  @JsonProperty("customProperties")
  @NotNull
  PartsUpdateStandardContentPartMetadataRequestCustomProperties[] customProperties;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * If true, include metadata schema property defaults in response
   */
  @JsonProperty("includePropertyDefaults")
  Boolean includePropertyDefaults;

  PartsUpdateStandardContentPartMetadataRequest(String configuration, String description,
      String partNumber, String revision, String vendor, String project, String productLine,
      String title1, String title2, String title3,
      PartsUpdateStandardContentPartMetadataRequestMaterial material,
      PartsUpdateStandardContentPartMetadataRequestCustomProperties[] customProperties,
      String linkDocumentId, Boolean includePropertyDefaults) {
    this.configuration = configuration;
    this.description = description;
    this.partNumber = partNumber;
    this.revision = revision;
    this.vendor = vendor;
    this.project = project;
    this.productLine = productLine;
    this.title1 = title1;
    this.title2 = title2;
    this.title3 = title3;
    this.material = material;
    this.customProperties = customProperties;
    this.linkDocumentId = linkDocumentId;
    this.includePropertyDefaults = includePropertyDefaults;
  }

  /**
   * Get Configuration in which to apply updates
   *
   * @return Configuration in which to apply updates
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Part description
   *
   * @return Part description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Part number
   *
   * @return Part number
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Part revision
   *
   * @return Part revision
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get Part vendor
   *
   * @return Part vendor
   *
   */
  public final String getVendor() {
    return this.vendor;
  }

  /**
   * Get Part project
   *
   * @return Part project
   *
   */
  public final String getProject() {
    return this.project;
  }

  /**
   * Get Part product line
   *
   * @return Part product line
   *
   */
  public final String getProductLine() {
    return this.productLine;
  }

  /**
   * Get Part title 1
   *
   * @return Part title 1
   *
   */
  public final String getTitle1() {
    return this.title1;
  }

  /**
   * Get Part title 2
   *
   * @return Part title 2
   *
   */
  public final String getTitle2() {
    return this.title2;
  }

  /**
   * Get Part title 3
   *
   * @return Part title 3
   *
   */
  public final String getTitle3() {
    return this.title3;
  }

  /**
   * Get Part material (Can only be modified in workspace)
   *
   * @return Part material (Can only be modified in workspace)
   *
   */
  public final PartsUpdateStandardContentPartMetadataRequestMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Custom properties
   *
   * @return Custom properties
   *
   */
  public final PartsUpdateStandardContentPartMetadataRequestCustomProperties[] getCustomProperties() {
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
     * Configuration in which to apply updates
     */
    private String configuration;

    /**
     * Part description
     */
    private String description;

    /**
     * Part number
     */
    private String partNumber;

    /**
     * Part revision
     */
    private String revision;

    /**
     * Part vendor
     */
    private String vendor;

    /**
     * Part project
     */
    private String project;

    /**
     * Part product line
     */
    private String productLine;

    /**
     * Part title 1
     */
    private String title1;

    /**
     * Part title 2
     */
    private String title2;

    /**
     * Part title 3
     */
    private String title3;

    /**
     * Part material (Can only be modified in workspace)
     */
    private PartsUpdateStandardContentPartMetadataRequestMaterial material;

    /**
     * Custom properties
     */
    private PartsUpdateStandardContentPartMetadataRequestCustomProperties[] customProperties;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * If true, include metadata schema property defaults in response
     */
    private Boolean includePropertyDefaults;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Configuration in which to apply updates
     *
     * @return Configuration in which to apply updates
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration in which to apply updates
     *
     * @param value Configuration in which to apply updates
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get Part description
     *
     * @return Part description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Part description
     *
     * @param value Part description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Part number
     *
     * @return Part number
     *
     */
    public final String partNumber() {
      return this.partNumber;
    }

    /**
     * Set Part number
     *
     * @param value Part number
     *
     * @return the Builder object.
     */
    public final Builder partNumber(String value) {
      this.partNumber = value;
      return this;
    }

    /**
     * Get Part revision
     *
     * @return Part revision
     *
     */
    public final String revision() {
      return this.revision;
    }

    /**
     * Set Part revision
     *
     * @param value Part revision
     *
     * @return the Builder object.
     */
    public final Builder revision(String value) {
      this.revision = value;
      return this;
    }

    /**
     * Get Part vendor
     *
     * @return Part vendor
     *
     */
    public final String vendor() {
      return this.vendor;
    }

    /**
     * Set Part vendor
     *
     * @param value Part vendor
     *
     * @return the Builder object.
     */
    public final Builder vendor(String value) {
      this.vendor = value;
      return this;
    }

    /**
     * Get Part project
     *
     * @return Part project
     *
     */
    public final String project() {
      return this.project;
    }

    /**
     * Set Part project
     *
     * @param value Part project
     *
     * @return the Builder object.
     */
    public final Builder project(String value) {
      this.project = value;
      return this;
    }

    /**
     * Get Part product line
     *
     * @return Part product line
     *
     */
    public final String productLine() {
      return this.productLine;
    }

    /**
     * Set Part product line
     *
     * @param value Part product line
     *
     * @return the Builder object.
     */
    public final Builder productLine(String value) {
      this.productLine = value;
      return this;
    }

    /**
     * Get Part title 1
     *
     * @return Part title 1
     *
     */
    public final String title1() {
      return this.title1;
    }

    /**
     * Set Part title 1
     *
     * @param value Part title 1
     *
     * @return the Builder object.
     */
    public final Builder title1(String value) {
      this.title1 = value;
      return this;
    }

    /**
     * Get Part title 2
     *
     * @return Part title 2
     *
     */
    public final String title2() {
      return this.title2;
    }

    /**
     * Set Part title 2
     *
     * @param value Part title 2
     *
     * @return the Builder object.
     */
    public final Builder title2(String value) {
      this.title2 = value;
      return this;
    }

    /**
     * Get Part title 3
     *
     * @return Part title 3
     *
     */
    public final String title3() {
      return this.title3;
    }

    /**
     * Set Part title 3
     *
     * @param value Part title 3
     *
     * @return the Builder object.
     */
    public final Builder title3(String value) {
      this.title3 = value;
      return this;
    }

    /**
     * Get Part material (Can only be modified in workspace)
     *
     * @return Part material (Can only be modified in workspace)
     *
     */
    public final PartsUpdateStandardContentPartMetadataRequestMaterial material() {
      return this.material;
    }

    /**
     * Set Part material (Can only be modified in workspace)
     *
     * @param value Part material (Can only be modified in workspace)
     *
     * @return the Builder object.
     */
    public final Builder material(PartsUpdateStandardContentPartMetadataRequestMaterial value) {
      this.material = value;
      return this;
    }

    /**
     * Get Custom properties
     *
     * @return Custom properties
     *
     */
    public final PartsUpdateStandardContentPartMetadataRequestCustomProperties[] customProperties() {
      return this.customProperties;
    }

    /**
     * Set Custom properties
     *
     * @param value Custom properties
     *
     * @return the Builder object.
     */
    public final Builder customProperties(PartsUpdateStandardContentPartMetadataRequestCustomProperties[] value) {
      this.customProperties = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    /**
     * Get If true, include metadata schema property defaults in response
     *
     * @return If true, include metadata schema property defaults in response
     *
     */
    public final Boolean includePropertyDefaults() {
      return this.includePropertyDefaults;
    }

    /**
     * Set If true, include metadata schema property defaults in response
     *
     * @param value If true, include metadata schema property defaults in response
     *
     * @return the Builder object.
     */
    public final Builder includePropertyDefaults(Boolean value) {
      this.includePropertyDefaults = value;
      return this;
    }

    private PartsUpdateStandardContentPartMetadataRequest build() {
      return new com.onshape.api.requests.PartsUpdateStandardContentPartMetadataRequest(configuration,description,partNumber,revision,vendor,project,productLine,title1,title2,title3,material,customProperties,linkDocumentId,includePropertyDefaults);
    }

    /**
     * Calls updateStandardContentPartMetadata method, Update metadata for a standard content part in the context of a company or user
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     *
     * @param did Document ID
     *
     * @param vid Version ID
     *
     * @param eid Element ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final PartsUpdateStandardContentPartMetadataResponse call(String partid, String did,
        String vid, String eid, String oid) throws OnshapeException {
      return onshape.call("post", "/parts/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/partid/:partid/metadata", build(), onshape.buildMap("partid", partid, "did", did, "vid", vid, "eid", eid, "oid", oid), onshape.buildMap("linkDocumentId", linkDocumentId, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsUpdateStandardContentPartMetadataResponse.class);
    }

    /**
     * Calls updateStandardContentPartMetadata method, Update metadata for a standard content part in the context of a company or user
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     *
     * @param vid Version ID
     *
     * @param oid Company (c) or User (u) ID of metadata owner
     */
    public final PartsUpdateStandardContentPartMetadataResponse call(OnshapeDocument document,
        String partid, String vid, String oid) throws OnshapeException {
      return onshape.call("post", "/parts/standardcontent/d/:did/v/:vid/e/:eid/[cu]/:oid/partid/:partid/metadata", build(), onshape.buildMap("partid", partid, "did", document.getDocumentId(), "vid", vid, "eid", document.getElementId(), "oid", oid), onshape.buildMap(), com.onshape.api.responses.PartsUpdateStandardContentPartMetadataResponse.class);
    }
  }
}
