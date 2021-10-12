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
import com.onshape.api.responses.PartStudiosGetFeatureScriptTableResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getFeatureScriptTable API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetFeatureScriptTableRequest {
  /**
   * The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
   */
  @JsonProperty("tableNamespace")
  String tableNamespace;

  /**
   * The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
   */
  @JsonProperty("tableParameters")
  String tableParameters;

  /**
   * If provided, the function will only return tables associated with that partId
   */
  @JsonProperty("partId")
  String partId;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  PartStudiosGetFeatureScriptTableRequest(String tableNamespace, String tableParameters,
      String partId, String linkDocumentId, String configuration) {
    this.tableNamespace = tableNamespace;
    this.tableParameters = tableParameters;
    this.partId = partId;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
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
     * The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
     */
    private String tableNamespace;

    /**
     * The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
     */
    private String tableParameters;

    /**
     * If provided, the function will only return tables associated with that partId
     */
    private String partId;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
     *
     * @return The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
     *
     */
    public final String tableNamespace() {
      return this.tableNamespace;
    }

    /**
     * Set The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
     *
     * @param value The namespace of the table definition, empty or omitted if it&#39;s a standard table. For custom tables it&#39;ll usually be in the form d[docId]::v[versionId]::e[elementId]::m[microversionId]
     *
     * @return the Builder object.
     */
    public final Builder tableNamespace(String value) {
      this.tableNamespace = value;
      return this;
    }

    /**
     * Get The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
     *
     * @return The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
     *
     */
    public final String tableParameters() {
      return this.tableParameters;
    }

    /**
     * Set The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
     *
     * @param value The parameters to the table function. They are provided in a similar, but not exactly the same way as configuration parameters. The overall syntax is: param1=value1;param2=value2;...;paramN=valueN For booleans, value must be `true` or `false`. For strings, value must be the string in double quotes. For enums, the value must be of the form EnumName.ENUM_VALUE. Anything else is considered a quantity. //@formatter:on
     *
     * @return the Builder object.
     */
    public final Builder tableParameters(String value) {
      this.tableParameters = value;
      return this;
    }

    /**
     * Get If provided, the function will only return tables associated with that partId
     *
     * @return If provided, the function will only return tables associated with that partId
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set If provided, the function will only return tables associated with that partId
     *
     * @param value If provided, the function will only return tables associated with that partId
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
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
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    private PartStudiosGetFeatureScriptTableRequest build() {
      return new com.onshape.api.requests.PartStudiosGetFeatureScriptTableRequest(tableNamespace,tableParameters,partId,linkDocumentId,configuration);
    }

    /**
     * Calls getFeatureScriptTable method, Compute and return a FeatureScript table for a given part studio (and possibly part).
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     *
     * @param tableType The name of the function that computes the table //@formatter:off (Default: null) */
    public final PartStudiosGetFeatureScriptTableResponse call(String did, WVM wvmType, String wvm,
        String eid, String tableType) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/fstable", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("tableNamespace", tableNamespace, "tableType", tableType, "tableParameters", tableParameters, "partId", partId, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetFeatureScriptTableResponse.class);
    }

    /**
     * Calls getFeatureScriptTable method, Compute and return a FeatureScript table for a given part studio (and possibly part).
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param tableType The name of the function that computes the table //@formatter:off (Default: null) */
    public final PartStudiosGetFeatureScriptTableResponse call(OnshapeDocument document,
        String tableType) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/fstable", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("tableNamespace", tableNamespace, "tableType", tableType, "tableParameters", tableParameters, "partId", partId, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetFeatureScriptTableResponse.class);
    }
  }
}
