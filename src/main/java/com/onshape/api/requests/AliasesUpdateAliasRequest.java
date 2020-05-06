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
import com.onshape.api.responses.AliasesUpdateAliasResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateAlias API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AliasesUpdateAliasRequest {
  /**
   * New name of the alias
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * New description of the alias
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
   */
  @JsonProperty("entries")
  @NotNull
  AliasesUpdateAliasRequestEntries[] entries;

  /**
   * Users/teams to add to the alias (provide one of userId, teamId, email on each)
   */
  @JsonProperty("additions")
  @NotNull
  AliasesUpdateAliasRequestAdditions[] additions;

  /**
   * Users/teams to remove from the alias (provide one of userId, teamId, email on each)
   */
  @JsonProperty("removals")
  @NotNull
  AliasesUpdateAliasRequestRemovals[] removals;

  AliasesUpdateAliasRequest(String name, String description,
      AliasesUpdateAliasRequestEntries[] entries, AliasesUpdateAliasRequestAdditions[] additions,
      AliasesUpdateAliasRequestRemovals[] removals) {
    this.name = name;
    this.description = description;
    this.entries = entries;
    this.additions = additions;
    this.removals = removals;
  }

  /**
   * Get New name of the alias
   *
   * @return New name of the alias
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get New description of the alias
   *
   * @return New description of the alias
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
   *
   * @return Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
   *
   */
  public final AliasesUpdateAliasRequestEntries[] getEntries() {
    return this.entries;
  }

  /**
   * Get Users/teams to add to the alias (provide one of userId, teamId, email on each)
   *
   * @return Users/teams to add to the alias (provide one of userId, teamId, email on each)
   *
   */
  public final AliasesUpdateAliasRequestAdditions[] getAdditions() {
    return this.additions;
  }

  /**
   * Get Users/teams to remove from the alias (provide one of userId, teamId, email on each)
   *
   * @return Users/teams to remove from the alias (provide one of userId, teamId, email on each)
   *
   */
  public final AliasesUpdateAliasRequestRemovals[] getRemovals() {
    return this.removals;
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
     * New name of the alias
     */
    private String name;

    /**
     * New description of the alias
     */
    private String description;

    /**
     * Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
     */
    private AliasesUpdateAliasRequestEntries[] entries;

    /**
     * Users/teams to add to the alias (provide one of userId, teamId, email on each)
     */
    private AliasesUpdateAliasRequestAdditions[] additions;

    /**
     * Users/teams to remove from the alias (provide one of userId, teamId, email on each)
     */
    private AliasesUpdateAliasRequestRemovals[] removals;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get New name of the alias
     *
     * @return New name of the alias
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set New name of the alias
     *
     * @param value New name of the alias
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get New description of the alias
     *
     * @return New description of the alias
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set New description of the alias
     *
     * @param value New description of the alias
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
     *
     * @return Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
     *
     */
    public final AliasesUpdateAliasRequestEntries[] entries() {
      return this.entries;
    }

    /**
     * Set Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
     *
     * @param value Users/teams to replace the contents of the alias (provide one of userId, teamId, email on each). If provided, additions and removals must be left out.
     *
     * @return the Builder object.
     */
    public final Builder entries(AliasesUpdateAliasRequestEntries[] value) {
      this.entries = value;
      return this;
    }

    /**
     * Get Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @return Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     */
    public final AliasesUpdateAliasRequestAdditions[] additions() {
      return this.additions;
    }

    /**
     * Set Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @param value Users/teams to add to the alias (provide one of userId, teamId, email on each)
     *
     * @return the Builder object.
     */
    public final Builder additions(AliasesUpdateAliasRequestAdditions[] value) {
      this.additions = value;
      return this;
    }

    /**
     * Get Users/teams to remove from the alias (provide one of userId, teamId, email on each)
     *
     * @return Users/teams to remove from the alias (provide one of userId, teamId, email on each)
     *
     */
    public final AliasesUpdateAliasRequestRemovals[] removals() {
      return this.removals;
    }

    /**
     * Set Users/teams to remove from the alias (provide one of userId, teamId, email on each)
     *
     * @param value Users/teams to remove from the alias (provide one of userId, teamId, email on each)
     *
     * @return the Builder object.
     */
    public final Builder removals(AliasesUpdateAliasRequestRemovals[] value) {
      this.removals = value;
      return this;
    }

    private AliasesUpdateAliasRequest build() {
      return new com.onshape.api.requests.AliasesUpdateAliasRequest(name,description,entries,additions,removals);
    }

    /**
     * Calls updateAlias method, Rename or add/remove identities on an alias in your enterprise.  You need the "Manage users and teams" global permission for this.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param aid Alias ID to update
     */
    public final AliasesUpdateAliasResponse call(String aid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/aliases/:aid", build(), onshape.buildMap("aid", aid), onshape.buildMap(), com.onshape.api.responses.AliasesUpdateAliasResponse.class);
    }
  }
}
