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
import com.onshape.api.responses.AssembliesCreateInstanceResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createInstance API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AssembliesCreateInstanceRequest {
  /**
   * The id of the content document containing the parts or assemblies to be inserted.
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * The id of the element containing the part(s), feature or assemblies to be inserted.
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
   */
  @JsonProperty("microversionId")
  @NotNull
  String microversionId;

  /**
   * If true add the instance as suppressed
   */
  @JsonProperty("isSuppressed")
  Boolean isSuppressed;

  /**
   * If true add the instance as hidden
   */
  @JsonProperty("isHidden")
  Boolean isHidden;

  /**
   * If true then the source element must be an assembly and whole assembly is inserted.
   */
  @JsonProperty("isAssembly")
  @NotNull
  Boolean isAssembly;

  /**
   * If true then the source element must be a partStudio and all parts are inserted.
   */
  @JsonProperty("isWholePartStudio")
  @NotNull
  Boolean isWholePartStudio;

  /**
   * If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
   */
  @JsonProperty("partId")
  @NotNull
  String partId;

  /**
   * If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
   */
  @JsonProperty("featureId")
  @NotNull
  String featureId;

  /**
   * Configuration of the source element, valid only if the referenced element is a Part Studio.
   */
  @JsonProperty("configuration")
  String configuration;

  /**
   * The revision containing the released part or assembly to be inserted.
   */
  @JsonProperty("revision")
  String revision;

  /**
   * The part number identifying the part or assembly in the release that is to be inserted.
   */
  @JsonProperty("partNumber")
  String partNumber;

  AssembliesCreateInstanceRequest(String documentId, String elementId, String versionId,
      String microversionId, Boolean isSuppressed, Boolean isHidden, Boolean isAssembly,
      Boolean isWholePartStudio, String partId, String featureId, String configuration,
      String revision, String partNumber) {
    this.documentId = documentId;
    this.elementId = elementId;
    this.versionId = versionId;
    this.microversionId = microversionId;
    this.isSuppressed = isSuppressed;
    this.isHidden = isHidden;
    this.isAssembly = isAssembly;
    this.isWholePartStudio = isWholePartStudio;
    this.partId = partId;
    this.featureId = featureId;
    this.configuration = configuration;
    this.revision = revision;
    this.partNumber = partNumber;
  }

  /**
   * Get The id of the content document containing the parts or assemblies to be inserted.
   *
   * @return The id of the content document containing the parts or assemblies to be inserted.
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get The id of the element containing the part(s), feature or assemblies to be inserted.
   *
   * @return The id of the element containing the part(s), feature or assemblies to be inserted.
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
   *
   * @return The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
   *
   * @return The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
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
   * Get If true then the source element must be an assembly and whole assembly is inserted.
   *
   * @return If true then the source element must be an assembly and whole assembly is inserted.
   *
   */
  public final Boolean getIsAssembly() {
    return this.isAssembly;
  }

  /**
   * Get If true then the source element must be a partStudio and all parts are inserted.
   *
   * @return If true then the source element must be a partStudio and all parts are inserted.
   *
   */
  public final Boolean getIsWholePartStudio() {
    return this.isWholePartStudio;
  }

  /**
   * Get If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
   *
   * @return If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
   *
   * @return If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
   *
   */
  public final String getFeatureId() {
    return this.featureId;
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
     * The id of the content document containing the parts or assemblies to be inserted.
     */
    private String documentId;

    /**
     * The id of the element containing the part(s), feature or assemblies to be inserted.
     */
    private String elementId;

    /**
     * The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
     */
    private String versionId;

    /**
     * The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
     */
    private String microversionId;

    /**
     * If true add the instance as suppressed
     */
    private Boolean isSuppressed;

    /**
     * If true add the instance as hidden
     */
    private Boolean isHidden;

    /**
     * If true then the source element must be an assembly and whole assembly is inserted.
     */
    private Boolean isAssembly;

    /**
     * If true then the source element must be a partStudio and all parts are inserted.
     */
    private Boolean isWholePartStudio;

    /**
     * If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
     */
    private String partId;

    /**
     * If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
     */
    private String featureId;

    /**
     * Configuration of the source element, valid only if the referenced element is a Part Studio.
     */
    private String configuration;

    /**
     * The revision containing the released part or assembly to be inserted.
     */
    private String revision;

    /**
     * The part number identifying the part or assembly in the release that is to be inserted.
     */
    private String partNumber;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The id of the content document containing the parts or assemblies to be inserted.
     *
     * @return The id of the content document containing the parts or assemblies to be inserted.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set The id of the content document containing the parts or assemblies to be inserted.
     *
     * @param value The id of the content document containing the parts or assemblies to be inserted.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get The id of the element containing the part(s), feature or assemblies to be inserted.
     *
     * @return The id of the element containing the part(s), feature or assemblies to be inserted.
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set The id of the element containing the part(s), feature or assemblies to be inserted.
     *
     * @param value The id of the element containing the part(s), feature or assemblies to be inserted.
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
     *
     * @return The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
     *
     */
    public final String versionId() {
      return this.versionId;
    }

    /**
     * Set The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
     *
     * @param value The document versionId from which the parts or assembly to be inserted will be taken. If documentId references a different document than did, this must be set to a valid version.
     *
     * @return the Builder object.
     */
    public final Builder versionId(String value) {
      this.versionId = value;
      return this;
    }

    /**
     * Get The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
     *
     * @return The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
     *
     */
    public final String microversionId() {
      return this.microversionId;
    }

    /**
     * Set The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
     *
     * @param value The document microversionId in which the elementId and partId will be resolved. This is valid only if no versionId is specified. When a versionId is specified, the partId must be obtained from the specified version.
     *
     * @return the Builder object.
     */
    public final Builder microversionId(String value) {
      this.microversionId = value;
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
     * Get If true then the source element must be an assembly and whole assembly is inserted.
     *
     * @return If true then the source element must be an assembly and whole assembly is inserted.
     *
     */
    public final Boolean isAssembly() {
      return this.isAssembly;
    }

    /**
     * Set If true then the source element must be an assembly and whole assembly is inserted.
     *
     * @param value If true then the source element must be an assembly and whole assembly is inserted.
     *
     * @return the Builder object.
     */
    public final Builder isAssembly(Boolean value) {
      this.isAssembly = value;
      return this;
    }

    /**
     * Get If true then the source element must be a partStudio and all parts are inserted.
     *
     * @return If true then the source element must be a partStudio and all parts are inserted.
     *
     */
    public final Boolean isWholePartStudio() {
      return this.isWholePartStudio;
    }

    /**
     * Set If true then the source element must be a partStudio and all parts are inserted.
     *
     * @param value If true then the source element must be a partStudio and all parts are inserted.
     *
     * @return the Builder object.
     */
    public final Builder isWholePartStudio(Boolean value) {
      this.isWholePartStudio = value;
      return this;
    }

    /**
     * Get If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
     *
     * @return If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
     *
     * @param value If isAssembly and isWholePartStudio are false, then this is the id of the part or surface to be inserted. Must be left blank if featureId is set.
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @return If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     */
    public final String featureId() {
      return this.featureId;
    }

    /**
     * Set If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @param value If isAssembly and isWholePartStudio are false, then this is the id of the feature to be inserted. Currently, only sketch features are valid. Must be left blank if partId is set.
     *
     * @return the Builder object.
     */
    public final Builder featureId(String value) {
      this.featureId = value;
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

    private AssembliesCreateInstanceRequest build() {
      return new com.onshape.api.requests.AssembliesCreateInstanceRequest(documentId,elementId,versionId,microversionId,isSuppressed,isHidden,isAssembly,isWholePartStudio,partId,featureId,configuration,revision,partNumber);
    }

    /**
     * Calls createInstance method, Create an instance of a part, part studio or assembly into an existing assembly element. If
     *                 instanceDefinition.isAssembly == true, isWholePartStudio and partId are ignored. If
     *                 instanceDefinition.isWholePartStudio == true, partId is ignored If both are false, partId must
     *                 point to a valid part.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AssembliesCreateInstanceResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/instances", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AssembliesCreateInstanceResponse.class);
    }

    /**
     * Calls createInstance method, Create an instance of a part, part studio or assembly into an existing assembly element. If
     *                 instanceDefinition.isAssembly == true, isWholePartStudio and partId are ignored. If
     *                 instanceDefinition.isWholePartStudio == true, partId is ignored If both are false, partId must
     *                 point to a valid part.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesCreateInstanceResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/assemblies/d/:did/w/:wid/e/:eid/instances", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesCreateInstanceResponse.class);
    }
  }
}
