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
import com.onshape.api.responses.AliasesCreateAliasResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createAlias API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AliasesCreateAliasRequest {
  /**
   * Name of the alias (required)
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Description of the alias
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Users/teams to add to the alias (provide one of userId, teamId, email on each)
   */
  @JsonProperty("entries")
  @NotNull
  AliasesCreateAliasRequestEntries[] entries;

  AliasesCreateAliasRequest(String name, String description,
      AliasesCreateAliasRequestEntries[] entries) {
    this.name = name;
    this.description = description;
    this.entries = entries;
  }

  /**
   * Get Name of the alias (required)
   *
   * @return Name of the alias (required)
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Description of the alias
   *
   * @return Description of the alias
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Users/teams to add to the alias (provide one of userId, teamId, email on each)
   *
   * @return Users/teams to add to the alias (provide one of userId, teamId, email on each)
   *
   */
  public final AliasesCreateAliasRequestEntries[] getEntries() {
    return this.entries;
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
     * Name of the alias (required)
     */
    private String name;

    /**
     * Description of the alias
     */
    private String description;

    /**
     * Users/teams to add to the alias (provide one of userId, teamId, email on each)
     */
    private AliasesCreateAliasRequestEntries[] entries;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Name of the alias (required)
     *
     * @return Name of the alias (required)
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Name of the alias (required)
     *
     * @param value Name of the alias (required)
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Description of the alias
     *
     * @return Description of the alias
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the alias
     *
     * @param value Description of the alias
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @return Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     */
    public final AliasesCreateAliasRequestEntries[] entries() {
      return this.entries;
    }

    /**
     * Set Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @param value Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @return the Builder object.
     */
    public final Builder entries(AliasesCreateAliasRequestEntries[] value) {
      this.entries = value;
      return this;
    }

    private AliasesCreateAliasRequest build() {
      return new com.onshape.api.requests.AliasesCreateAliasRequest(name,description,entries);
    }

    /**
     * Calls createAlias method, Create an alias in your enterprise.  You need the "Manage users and teams" global permission for this.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AliasesCreateAliasResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/aliases", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.AliasesCreateAliasResponse.class);
    }
  }
}
