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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updateStandardContentPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsUpdateStandardContentPartMetadataRequestMaterialProperties {
  /**
   * Material property name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Units of the material property value
   */
  @JsonProperty("units")
  public String units;

  /**
   * Material property description
   */
  @JsonProperty("description")
  public String description;

  /**
   * Material property value
   */
  @JsonProperty("value")
  public Number value;

  PartsUpdateStandardContentPartMetadataRequestMaterialProperties(String name, String units,
      String description, Number value) {
    this.name = name;
    this.units = units;
    this.description = description;
    this.value = value;
  }

  /**
   * Get Material property name
   *
   * @return Material property name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Units of the material property value
   *
   * @return Units of the material property value
   *
   */
  public final String getUnits() {
    return this.units;
  }

  /**
   * Get Material property description
   *
   * @return Material property description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Material property value
   *
   * @return Material property value
   *
   */
  public final Number getValue() {
    return this.value;
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
     * Material property name
     */
    private String name;

    /**
     * Units of the material property value
     */
    private String units;

    /**
     * Material property description
     */
    private String description;

    /**
     * Material property value
     */
    private Number value;

    Builder() {
    }

    /**
     * Get Material property name
     *
     * @return Material property name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Material property name
     *
     * @param value Material property name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Units of the material property value
     *
     * @return Units of the material property value
     *
     */
    public final String units() {
      return this.units;
    }

    /**
     * Set Units of the material property value
     *
     * @param value Units of the material property value
     *
     * @return the Builder object.
     */
    public final Builder units(String value) {
      this.units = value;
      return this;
    }

    /**
     * Get Material property description
     *
     * @return Material property description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Material property description
     *
     * @param value Material property description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Material property value
     *
     * @return Material property value
     *
     */
    public final Number value() {
      return this.value;
    }

    /**
     * Set Material property value
     *
     * @param value Material property value
     *
     * @return the Builder object.
     */
    public final Builder value(Number value) {
      this.value = value;
      return this;
    }

    public final PartsUpdateStandardContentPartMetadataRequestMaterialProperties build() {
      return new com.onshape.api.requests.PartsUpdateStandardContentPartMetadataRequestMaterialProperties(name,units,description,value);
    }
  }
}
