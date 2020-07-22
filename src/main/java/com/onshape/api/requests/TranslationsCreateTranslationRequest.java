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
import com.onshape.api.responses.TranslationsCreateTranslationResponse;
import com.onshape.api.types.Blob;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createTranslation API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class TranslationsCreateTranslationRequest {
  /**
   * File to upload
   */
  @JsonProperty("file")
  @NotNull
  Blob file;

  /**
   * Name of format into which this file or element should be translated.
   */
  @JsonProperty("formatName")
  @NotNull
  String formatName;

  /**
   * Version of output format to use (format-dependent)
   */
  @JsonProperty("versionString")
  String versionString;

  /**
   * Whether a user notification should be generated on completion
   */
  @JsonProperty("notifyUser")
  Boolean notifyUser;

  /**
   * If true, remove assembly structure and create only a Part Studio
   */
  @JsonProperty("flattenAssemblies")
  @NotNull
  Boolean flattenAssemblies;

  /**
   * If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   */
  @JsonProperty("yAxisIsUp")
  @NotNull
  Boolean yAxisIsUp;

  /**
   * If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   */
  @JsonProperty("importInBackground")
  Boolean importInBackground;

  /**
   * If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   */
  @JsonProperty("allowFaultyParts")
  Boolean allowFaultyParts;

  /**
   * If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
   */
  @JsonProperty("createComposite")
  Boolean createComposite;

  /**
   * controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   */
  @JsonProperty("storeInDocument")
  @NotNull
  Boolean storeInDocument;

  TranslationsCreateTranslationRequest(Blob file, String formatName, String versionString,
      Boolean notifyUser, Boolean flattenAssemblies, Boolean yAxisIsUp, Boolean importInBackground,
      Boolean allowFaultyParts, Boolean createComposite, Boolean storeInDocument) {
    this.file = file;
    this.formatName = formatName;
    this.versionString = versionString;
    this.notifyUser = notifyUser;
    this.flattenAssemblies = flattenAssemblies;
    this.yAxisIsUp = yAxisIsUp;
    this.importInBackground = importInBackground;
    this.allowFaultyParts = allowFaultyParts;
    this.createComposite = createComposite;
    this.storeInDocument = storeInDocument;
  }

  /**
   * Get File to upload
   *
   * @return File to upload
   *
   */
  public final Blob getFile() {
    return this.file;
  }

  /**
   * Get Name of format into which this file or element should be translated.
   *
   * @return Name of format into which this file or element should be translated.
   *
   */
  public final String getFormatName() {
    return this.formatName;
  }

  /**
   * Get Version of output format to use (format-dependent)
   *
   * @return Version of output format to use (format-dependent)
   *
   */
  public final String getVersionString() {
    return this.versionString;
  }

  /**
   * Get Whether a user notification should be generated on completion
   *
   * @return Whether a user notification should be generated on completion
   *
   */
  public final Boolean getNotifyUser() {
    return this.notifyUser;
  }

  /**
   * Get If true, remove assembly structure and create only a Part Studio
   *
   * @return If true, remove assembly structure and create only a Part Studio
   *
   */
  public final Boolean getFlattenAssemblies() {
    return this.flattenAssemblies;
  }

  /**
   * Get If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   *
   * @return If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   *
   */
  public final Boolean getYAxisIsUp() {
    return this.yAxisIsUp;
  }

  /**
   * Get If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   *
   * @return If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   *
   */
  public final Boolean getImportInBackground() {
    return this.importInBackground;
  }

  /**
   * Get If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   *
   * @return If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   *
   */
  public final Boolean getAllowFaultyParts() {
    return this.allowFaultyParts;
  }

  /**
   * Get If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
   *
   * @return If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
   *
   */
  public final Boolean getCreateComposite() {
    return this.createComposite;
  }

  /**
   * Get controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   *
   * @return controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
   *
   */
  public final Boolean getStoreInDocument() {
    return this.storeInDocument;
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
     * File to upload
     */
    private Blob file;

    /**
     * Name of format into which this file or element should be translated.
     */
    private String formatName;

    /**
     * Version of output format to use (format-dependent)
     */
    private String versionString;

    /**
     * Whether a user notification should be generated on completion
     */
    private Boolean notifyUser;

    /**
     * If true, remove assembly structure and create only a Part Studio
     */
    private Boolean flattenAssemblies;

    /**
     * If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     */
    private Boolean yAxisIsUp;

    /**
     * If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     */
    private Boolean importInBackground;

    /**
     * If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     */
    private Boolean allowFaultyParts;

    /**
     * If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
     */
    private Boolean createComposite;

    /**
     * controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     */
    private Boolean storeInDocument;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get File to upload
     *
     * @return File to upload
     *
     */
    public final Blob file() {
      return this.file;
    }

    /**
     * Set File to upload
     *
     * @param value File to upload
     *
     * @return the Builder object.
     */
    public final Builder file(Blob value) {
      this.file = value;
      return this;
    }

    /**
     * Get Name of format into which this file or element should be translated.
     *
     * @return Name of format into which this file or element should be translated.
     *
     */
    public final String formatName() {
      return this.formatName;
    }

    /**
     * Set Name of format into which this file or element should be translated.
     *
     * @param value Name of format into which this file or element should be translated.
     *
     * @return the Builder object.
     */
    public final Builder formatName(String value) {
      this.formatName = value;
      return this;
    }

    /**
     * Get Version of output format to use (format-dependent)
     *
     * @return Version of output format to use (format-dependent)
     *
     */
    public final String versionString() {
      return this.versionString;
    }

    /**
     * Set Version of output format to use (format-dependent)
     *
     * @param value Version of output format to use (format-dependent)
     *
     * @return the Builder object.
     */
    public final Builder versionString(String value) {
      this.versionString = value;
      return this;
    }

    /**
     * Get Whether a user notification should be generated on completion
     *
     * @return Whether a user notification should be generated on completion
     *
     */
    public final Boolean notifyUser() {
      return this.notifyUser;
    }

    /**
     * Set Whether a user notification should be generated on completion
     *
     * @param value Whether a user notification should be generated on completion
     *
     * @return the Builder object.
     */
    public final Builder notifyUser(Boolean value) {
      this.notifyUser = value;
      return this;
    }

    /**
     * Get If true, remove assembly structure and create only a Part Studio
     *
     * @return If true, remove assembly structure and create only a Part Studio
     *
     */
    public final Boolean flattenAssemblies() {
      return this.flattenAssemblies;
    }

    /**
     * Set If true, remove assembly structure and create only a Part Studio
     *
     * @param value If true, remove assembly structure and create only a Part Studio
     *
     * @return the Builder object.
     */
    public final Builder flattenAssemblies(Boolean value) {
      this.flattenAssemblies = value;
      return this;
    }

    /**
     * Get If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @return If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     */
    public final Boolean yAxisIsUp() {
      return this.yAxisIsUp;
    }

    /**
     * Set If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @param value If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @return the Builder object.
     */
    public final Builder yAxisIsUp(Boolean value) {
      this.yAxisIsUp = value;
      return this;
    }

    /**
     * Get If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @return If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     */
    public final Boolean importInBackground() {
      return this.importInBackground;
    }

    /**
     * Set If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @param value If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @return the Builder object.
     */
    public final Builder importInBackground(Boolean value) {
      this.importInBackground = value;
      return this;
    }

    /**
     * Get If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @return If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     */
    public final Boolean allowFaultyParts() {
      return this.allowFaultyParts;
    }

    /**
     * Set If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @param value If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @return the Builder object.
     */
    public final Builder allowFaultyParts(Boolean value) {
      this.allowFaultyParts = value;
      return this;
    }

    /**
     * Get If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
     *
     * @return If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
     *
     */
    public final Boolean createComposite() {
      return this.createComposite;
    }

    /**
     * Set If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
     *
     * @param value If the value is specified as true, each part studio contains a single composite part made up of all its topologies.
     *
     * @return the Builder object.
     */
    public final Builder createComposite(Boolean value) {
      this.createComposite = value;
      return this;
    }

    /**
     * Get controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @return controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     */
    public final Boolean storeInDocument() {
      return this.storeInDocument;
    }

    /**
     * Set controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @param value controls whether the translation is stored as a new element or whether the data is stored as external data (storeInDocument=false).
     *
     * @return the Builder object.
     */
    public final Builder storeInDocument(Boolean value) {
      this.storeInDocument = value;
      return this;
    }

    private TranslationsCreateTranslationRequest build() {
      return new com.onshape.api.requests.TranslationsCreateTranslationRequest(file,formatName,versionString,notifyUser,flattenAssemblies,yAxisIsUp,importInBackground,allowFaultyParts,createComposite,storeInDocument);
    }

    /**
     * Calls createTranslation method, Create a translation of the input data. The translation may be incomplete at the time that the
     *                 call completes. If the requestState is ACTIVE, the translation can be polled until the state
     *                 becomes either DONE or FAILED. Alternatively, a webhook callback can be registered for
     *                 notification of translation completion.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final TranslationsCreateTranslationResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/translations/d/:did/w/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.TranslationsCreateTranslationResponse.class);
    }

    /**
     * Calls createTranslation method, Create a translation of the input data. The translation may be incomplete at the time that the
     *                 call completes. If the requestState is ACTIVE, the translation can be polled until the state
     *                 becomes either DONE or FAILED. Alternatively, a webhook callback can be registered for
     *                 notification of translation completion.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final TranslationsCreateTranslationResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/translations/d/:did/w/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.TranslationsCreateTranslationResponse.class);
    }
  }
}
