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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to updateStandardContentPartMetadata API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsUpdateStandardContentPartMetadataRequestMaterial {
  /**
   * Name of the material library
   */
  @JsonProperty("libraryName")
  public String libraryName;

  /**
   * Id of the material
   */
  @JsonProperty("id")
  public String id;

  /**
   * Properties of the material
   */
  @JsonProperty("properties")
  public PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] properties;

  PartsUpdateStandardContentPartMetadataRequestMaterial(String libraryName, String id,
      PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] properties) {
    this.libraryName = libraryName;
    this.id = id;
    this.properties = properties;
  }

  /**
   * Get Name of the material library
   *
   * @return Name of the material library
   *
   */
  public final String getLibraryName() {
    return this.libraryName;
  }

  /**
   * Get Id of the material
   *
   * @return Id of the material
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Properties of the material
   *
   * @return Properties of the material
   *
   */
  public final PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] getProperties() {
    return this.properties;
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
     * Name of the material library
     */
    private String libraryName;

    /**
     * Id of the material
     */
    private String id;

    /**
     * Properties of the material
     */
    private PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] properties;

    Builder() {
    }

    /**
     * Get Name of the material library
     *
     * @return Name of the material library
     *
     */
    public final String libraryName() {
      return this.libraryName;
    }

    /**
     * Set Name of the material library
     *
     * @param value Name of the material library
     *
     * @return the Builder object.
     */
    public final Builder libraryName(String value) {
      this.libraryName = value;
      return this;
    }

    /**
     * Get Id of the material
     *
     * @return Id of the material
     *
     */
    public final String id() {
      return this.id;
    }

    /**
     * Set Id of the material
     *
     * @param value Id of the material
     *
     * @return the Builder object.
     */
    public final Builder id(String value) {
      this.id = value;
      return this;
    }

    /**
     * Get Properties of the material
     *
     * @return Properties of the material
     *
     */
    public final PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] properties() {
      return this.properties;
    }

    /**
     * Set Properties of the material
     *
     * @param value Properties of the material
     *
     * @return the Builder object.
     */
    public final Builder properties(PartsUpdateStandardContentPartMetadataRequestMaterialProperties[] value) {
      this.properties = value;
      return this;
    }

    public final PartsUpdateStandardContentPartMetadataRequestMaterial build() {
      return new com.onshape.api.requests.PartsUpdateStandardContentPartMetadataRequestMaterial(libraryName,id,properties);
    }
  }
}
