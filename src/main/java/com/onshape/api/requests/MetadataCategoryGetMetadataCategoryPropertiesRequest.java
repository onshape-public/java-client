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
import com.onshape.api.responses.MetadataCategoryGetMetadataCategoryPropertiesResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getMetadataCategoryProperties API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataCategoryGetMetadataCategoryPropertiesRequest {
  /**
   * ID of the document the categories are associated with.
   */
  @JsonProperty("documentId")
  String documentId;

  /**
   * Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
   */
  @JsonProperty("objectType")
  Number objectType;

  /**
   * If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
   */
  @JsonProperty("strict")
  Boolean strict;

  /**
   * Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
   */
  @JsonProperty("includeObjectTypeDefaults")
  Boolean includeObjectTypeDefaults;

  /**
   * If true, computed properties will be included in results
   */
  @JsonProperty("includeComputedProperties")
  Boolean includeComputedProperties;

  /**
   * If true, properties found in the part properties table wil be included in the results
   */
  @JsonProperty("includePartPropertiesTableOnlyProperties")
  Boolean includePartPropertiesTableOnlyProperties;

  /**
   * If true, only active properties will be returned
   */
  @JsonProperty("onlyActive")
  Boolean onlyActive;

  MetadataCategoryGetMetadataCategoryPropertiesRequest(String documentId, Number objectType,
      Boolean strict, Boolean includeObjectTypeDefaults, Boolean includeComputedProperties,
      Boolean includePartPropertiesTableOnlyProperties, Boolean onlyActive) {
    this.documentId = documentId;
    this.objectType = objectType;
    this.strict = strict;
    this.includeObjectTypeDefaults = includeObjectTypeDefaults;
    this.includeComputedProperties = includeComputedProperties;
    this.includePartPropertiesTableOnlyProperties = includePartPropertiesTableOnlyProperties;
    this.onlyActive = onlyActive;
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
     * ID of the document the categories are associated with.
     */
    private String documentId;

    /**
     * Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
     */
    private Number objectType;

    /**
     * If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
     */
    private Boolean strict;

    /**
     * Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
     */
    private Boolean includeObjectTypeDefaults;

    /**
     * If true, computed properties will be included in results
     */
    private Boolean includeComputedProperties;

    /**
     * If true, properties found in the part properties table wil be included in the results
     */
    private Boolean includePartPropertiesTableOnlyProperties;

    /**
     * If true, only active properties will be returned
     */
    private Boolean onlyActive;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get ID of the document the categories are associated with.
     *
     * @return ID of the document the categories are associated with.
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set ID of the document the categories are associated with.
     *
     * @param value ID of the document the categories are associated with.
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @return Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
     *
     */
    public final Number objectType() {
      return this.objectType;
    }

    /**
     * Set Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @param value Metadata object type. Optional but if specified it must be any BTMetadataObjectType enum ordinal except GLOBAL.
     *
     * @return the Builder object.
     */
    public final Builder objectType(Number value) {
      this.objectType = value;
      return this;
    }

    /**
     * Get If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
     *
     * @return If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
     *
     */
    public final Boolean strict() {
      return this.strict;
    }

    /**
     * Set If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
     *
     * @param value If true: only those properties reachable by the specified category ids will be included. Otherwise: category properties, system properties, global defaults and, if &lt;code&gt;includeObjectTypeDefaults&lt;/code&gt; is true, default properties for the objectType will be included
     *
     * @return the Builder object.
     */
    public final Builder strict(Boolean value) {
      this.strict = value;
      return this;
    }

    /**
     * Get Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
     *
     * @return Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
     *
     */
    public final Boolean includeObjectTypeDefaults() {
      return this.includeObjectTypeDefaults;
    }

    /**
     * Set Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
     *
     * @param value Default properties for the &lt;code&gt;objectType&lt;/code&gt; specified should be included in the response
     *
     * @return the Builder object.
     */
    public final Builder includeObjectTypeDefaults(Boolean value) {
      this.includeObjectTypeDefaults = value;
      return this;
    }

    /**
     * Get If true, computed properties will be included in results
     *
     * @return If true, computed properties will be included in results
     *
     */
    public final Boolean includeComputedProperties() {
      return this.includeComputedProperties;
    }

    /**
     * Set If true, computed properties will be included in results
     *
     * @param value If true, computed properties will be included in results
     *
     * @return the Builder object.
     */
    public final Builder includeComputedProperties(Boolean value) {
      this.includeComputedProperties = value;
      return this;
    }

    /**
     * Get If true, properties found in the part properties table wil be included in the results
     *
     * @return If true, properties found in the part properties table wil be included in the results
     *
     */
    public final Boolean includePartPropertiesTableOnlyProperties() {
      return this.includePartPropertiesTableOnlyProperties;
    }

    /**
     * Set If true, properties found in the part properties table wil be included in the results
     *
     * @param value If true, properties found in the part properties table wil be included in the results
     *
     * @return the Builder object.
     */
    public final Builder includePartPropertiesTableOnlyProperties(Boolean value) {
      this.includePartPropertiesTableOnlyProperties = value;
      return this;
    }

    /**
     * Get If true, only active properties will be returned
     *
     * @return If true, only active properties will be returned
     *
     */
    public final Boolean onlyActive() {
      return this.onlyActive;
    }

    /**
     * Set If true, only active properties will be returned
     *
     * @param value If true, only active properties will be returned
     *
     * @return the Builder object.
     */
    public final Builder onlyActive(Boolean value) {
      this.onlyActive = value;
      return this;
    }

    private MetadataCategoryGetMetadataCategoryPropertiesRequest build() {
      return new com.onshape.api.requests.MetadataCategoryGetMetadataCategoryPropertiesRequest(documentId,objectType,strict,includeObjectTypeDefaults,includeComputedProperties,includePartPropertiesTableOnlyProperties,onlyActive);
    }

    /**
     * Calls getMetadataCategoryProperties method, Get metadata category properties
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ownerId Owner ID. Must be specified. (Default: null)
     * @param ownerType Schema owner type must be 1 company which is the default. (Default: null)
     * @param categoryIds Metadata category IDs, must be specified if &lt;code&gt;strict&lt;/code&gt; is true (Default: null) */
    public final MetadataCategoryGetMetadataCategoryPropertiesResponse call(String ownerId,
        Number ownerType, String[] categoryIds) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/metadatacategory/categoryproperties", build(), onshape.buildMap(), onshape.buildMap("ownerId", ownerId, "ownerType", ownerType, "documentId", documentId, "categoryIds", categoryIds, "objectType", objectType, "strict", strict, "includeObjectTypeDefaults", includeObjectTypeDefaults, "includeComputedProperties", includeComputedProperties, "includePartPropertiesTableOnlyProperties", includePartPropertiesTableOnlyProperties, "onlyActive", onlyActive), com.onshape.api.responses.MetadataCategoryGetMetadataCategoryPropertiesResponse.class);
    }
  }
}
