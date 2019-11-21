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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to insertTransformedInstances API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesInsertTransformedInstancesRequestTransformGroupsInstances {
  /**
   * Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Source element ID for the instance.
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
   */
  @JsonProperty("featureId")
  public String featureId;

  /**
   * Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
   */
  @JsonProperty("microversionId")
  public String microversionId;

  /**
   * Document version ID in which to resolve elementId and partId.
   */
  @JsonProperty("versionId")
  public String versionId;

  /**
   * Configuration of the source element, valid only if the referenced element is a Part Studio.
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Whether the instance is the entire part studio specified by the element ID.
   */
  @JsonProperty("isWholePartStudio")
  public Boolean isWholePartStudio;

  /**
   * Whether the instance is the assembly specified by the element ID.
   */
  @JsonProperty("isAssembly")
  public Boolean isAssembly;

  /**
   * If true add the instance as suppressed
   */
  @JsonProperty("isSuppressed")
  public Boolean isSuppressed;

  /**
   * If true add the instance as hidden
   */
  @JsonProperty("isHidden")
  public Boolean isHidden;

  /**
   * The revision containing the released part or assembly to be inserted.
   */
  @JsonProperty("revision")
  public String revision;

  /**
   * The part number identifying the part or assembly in the release that is to be inserted.
   */
  @JsonProperty("partNumber")
  public String partNumber;

  AssembliesInsertTransformedInstancesRequestTransformGroupsInstances(String documentId,
      String elementId, String partId, String featureId, String microversionId, String versionId,
      String configuration, Boolean isWholePartStudio, Boolean isAssembly, Boolean isSuppressed,
      Boolean isHidden, String revision, String partNumber) {
    this.documentId = documentId;
    this.elementId = elementId;
    this.partId = partId;
    this.featureId = featureId;
    this.microversionId = microversionId;
    this.versionId = versionId;
    this.configuration = configuration;
    this.isWholePartStudio = isWholePartStudio;
    this.isAssembly = isAssembly;
    this.isSuppressed = isSuppressed;
    this.isHidden = isHidden;
    this.revision = revision;
    this.partNumber = partNumber;
  }

  /**
   * Get Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
   *
   * @return Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Source element ID for the instance.
   *
   * @return Source element ID for the instance.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
   *
   * @return Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
   *
   * @return Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
   *
   */
  public final String getFeatureId() {
    return this.featureId;
  }

  /**
   * Get Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
   *
   * @return Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Document version ID in which to resolve elementId and partId.
   *
   * @return Document version ID in which to resolve elementId and partId.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Configuration of the source element, valid only if the referenced element is a Part Studio.
   *
   * @return Configuration of the source element, valid only if the referenced element is a Part Studio.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Whether the instance is the entire part studio specified by the element ID.
   *
   * @return Whether the instance is the entire part studio specified by the element ID.
   *
   */
  public final Boolean getIsWholePartStudio() {
    return this.isWholePartStudio;
  }

  /**
   * Get Whether the instance is the assembly specified by the element ID.
   *
   * @return Whether the instance is the assembly specified by the element ID.
   *
   */
  public final Boolean getIsAssembly() {
    return this.isAssembly;
  }

  /**
   * Get If true add the instance as suppressed
   *
   * @return If true add the instance as suppressed
   *
   */
  public final Boolean getIsSuppressed() {
    return this.isSuppressed;
  }

  /**
   * Get If true add the instance as hidden
   *
   * @return If true add the instance as hidden
   *
   */
  public final Boolean getIsHidden() {
    return this.isHidden;
  }

  /**
   * Get The revision containing the released part or assembly to be inserted.
   *
   * @return The revision containing the released part or assembly to be inserted.
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get The part number identifying the part or assembly in the release that is to be inserted.
   *
   * @return The part number identifying the part or assembly in the release that is to be inserted.
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
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
     * Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
     */
    private String documentId;

    /**
     * Source element ID for the instance.
     */
    private String elementId;

    /**
     * Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
     */
    private String partId;

    /**
     * Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
     */
    private String featureId;

    /**
     * Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
     */
    private String microversionId;

    /**
     * Document version ID in which to resolve elementId and partId.
     */
    private String versionId;

    /**
     * Configuration of the source element, valid only if the referenced element is a Part Studio.
     */
    private String configuration;

    /**
     * Whether the instance is the entire part studio specified by the element ID.
     */
    private Boolean isWholePartStudio;

    /**
     * Whether the instance is the assembly specified by the element ID.
     */
    private Boolean isAssembly;

    /**
     * If true add the instance as suppressed
     */
    private Boolean isSuppressed;

    /**
     * If true add the instance as hidden
     */
    private Boolean isHidden;

    /**
     * The revision containing the released part or assembly to be inserted.
     */
    private String revision;

    /**
     * The part number identifying the part or assembly in the release that is to be inserted.
     */
    private String partNumber;

    Builder() {
    }

    /**
     * Get Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
     *
     * @return Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
     *
     * @param value Source document ID for the instance. If this differs from the same document as in the path, you must specify a versionId for the instance in the source document.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Source element ID for the instance.
     *
     * @return Source element ID for the instance.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set Source element ID for the instance.
     *
     * @param value Source element ID for the instance.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
     *
     * @return Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
     *
     * @param value Part ID of instance, if it&#39;s a part or surface. Must be left blank if featureId is set.
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @return Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     */
    public final String featureId() {
      return this.featureId;
    }

    /**
     * Set Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @param value Feature ID of instance, if it&#39;s a feature. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @return the Builder object.
     */
    public final Builder featureId(String value) {
      this.featureId = value;
      return this;
    }

    /**
     * Get Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
     *
     * @return Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
     *
     */
    public final String microversionId() {
      return this.microversionId;
    }

    /**
     * Set Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
     *
     * @param value Source document microversion ID in which to resolve elementId and partId. This must be left empty if a versionId is specified.
     *
     * @return the Builder object.
     */
    public final Builder microversionId(String value) {
      this.microversionId = value;
      return this;
    }

    /**
     * Get Document version ID in which to resolve elementId and partId.
     *
     * @return Document version ID in which to resolve elementId and partId.
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set Document version ID in which to resolve elementId and partId.
     *
     * @param value Document version ID in which to resolve elementId and partId.
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get Configuration of the source element, valid only if the referenced element is a Part Studio.
     *
     * @return Configuration of the source element, valid only if the referenced element is a Part Studio.
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration of the source element, valid only if the referenced element is a Part Studio.
     *
     * @param value Configuration of the source element, valid only if the referenced element is a Part Studio.
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get Whether the instance is the entire part studio specified by the element ID.
     *
     * @return Whether the instance is the entire part studio specified by the element ID.
     *
     */
    public final Boolean isWholePartStudio() {
      return this.isWholePartStudio;
    }

    /**
     * Set Whether the instance is the entire part studio specified by the element ID.
     *
     * @param value Whether the instance is the entire part studio specified by the element ID.
     *
     * @return the Builder object.
     */
    public final Builder isWholePartStudio(Boolean value) {
      this.isWholePartStudio = value;
      return this;
    }

    /**
     * Get Whether the instance is the assembly specified by the element ID.
     *
     * @return Whether the instance is the assembly specified by the element ID.
     *
     */
    public final Boolean isAssembly() {
      return this.isAssembly;
    }

    /**
     * Set Whether the instance is the assembly specified by the element ID.
     *
     * @param value Whether the instance is the assembly specified by the element ID.
     *
     * @return the Builder object.
     */
    public final Builder isAssembly(Boolean value) {
      this.isAssembly = value;
      return this;
    }

    /**
     * Get If true add the instance as suppressed
     *
     * @return If true add the instance as suppressed
     *
     */
    public final Boolean isSuppressed() {
      return this.isSuppressed;
    }

    /**
     * Set If true add the instance as suppressed
     *
     * @param value If true add the instance as suppressed
     *
     * @return the Builder object.
     */
    public final Builder isSuppressed(Boolean value) {
      this.isSuppressed = value;
      return this;
    }

    /**
     * Get If true add the instance as hidden
     *
     * @return If true add the instance as hidden
     *
     */
    public final Boolean isHidden() {
      return this.isHidden;
    }

    /**
     * Set If true add the instance as hidden
     *
     * @param value If true add the instance as hidden
     *
     * @return the Builder object.
     */
    public final Builder isHidden(Boolean value) {
      this.isHidden = value;
      return this;
    }

    /**
     * Get The revision containing the released part or assembly to be inserted.
     *
     * @return The revision containing the released part or assembly to be inserted.
     *
     */
    public final String revision() {
      return this.revision;
    }

    /**
     * Set The revision containing the released part or assembly to be inserted.
     *
     * @param value The revision containing the released part or assembly to be inserted.
     *
     * @return the Builder object.
     */
    public final Builder revision(String value) {
      this.revision = value;
      return this;
    }

    /**
     * Get The part number identifying the part or assembly in the release that is to be inserted.
     *
     * @return The part number identifying the part or assembly in the release that is to be inserted.
     *
     */
    public final String partNumber() {
      return this.partNumber;
    }

    /**
     * Set The part number identifying the part or assembly in the release that is to be inserted.
     *
     * @param value The part number identifying the part or assembly in the release that is to be inserted.
     *
     * @return the Builder object.
     */
    public final Builder partNumber(String value) {
      this.partNumber = value;
      return this;
    }

    public final AssembliesInsertTransformedInstancesRequestTransformGroupsInstances build() {
      return new com.onshape.api.requests.AssembliesInsertTransformedInstancesRequestTransformGroupsInstances(documentId,elementId,partId,featureId,microversionId,versionId,configuration,isWholePartStudio,isAssembly,isSuppressed,isHidden,revision,partNumber);
    }
  }
}
