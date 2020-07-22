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
import com.onshape.api.responses.RevisionsUpdateRuleResponse;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateRule API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsUpdateRuleRequest {
  /**
   * Name of revision rule
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Description of revision rule
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * List of revisions associated with the rule. Must keep relative order of all existing revisions.
   */
  @JsonProperty("revisionList")
  @NotNull
  String[] revisionList;

  RevisionsUpdateRuleRequest(String name, String description, String[] revisionList) {
    this.name = name;
    this.description = description;
    this.revisionList = revisionList;
  }

  /**
   * Get Name of revision rule
   *
   * @return Name of revision rule
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Description of revision rule
   *
   * @return Description of revision rule
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get List of revisions associated with the rule. Must keep relative order of all existing revisions.
   *
   * @return List of revisions associated with the rule. Must keep relative order of all existing revisions.
   *
   */
  public final String[] getRevisionList() {
    return this.revisionList;
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
     * Name of revision rule
     */
    private String name;

    /**
     * Description of revision rule
     */
    private String description;

    /**
     * List of revisions associated with the rule. Must keep relative order of all existing revisions.
     */
    private String[] revisionList;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Name of revision rule
     *
     * @return Name of revision rule
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Name of revision rule
     *
     * @param value Name of revision rule
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Description of revision rule
     *
     * @return Description of revision rule
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of revision rule
     *
     * @param value Description of revision rule
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get List of revisions associated with the rule. Must keep relative order of all existing revisions.
     *
     * @return List of revisions associated with the rule. Must keep relative order of all existing revisions.
     *
     */
    public final String[] revisionList() {
      return this.revisionList;
    }

    /**
     * Set List of revisions associated with the rule. Must keep relative order of all existing revisions.
     *
     * @param value List of revisions associated with the rule. Must keep relative order of all existing revisions.
     *
     * @return the Builder object.
     */
    public final Builder revisionList(String[] value) {
      this.revisionList = value;
      return this;
    }

    private RevisionsUpdateRuleRequest build() {
      return new com.onshape.api.requests.RevisionsUpdateRuleRequest(name,description,revisionList);
    }

    /**
     * Calls updateRule method, Update an existing revision rule for a company
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param ruleid ID of revision rule to update
     */
    public final RevisionsUpdateRuleResponse call(String ruleid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/revisionrules/:ruleid", build(), onshape.buildMap("ruleid", ruleid), onshape.buildMap(), com.onshape.api.responses.RevisionsUpdateRuleResponse.class);
    }
  }
}
