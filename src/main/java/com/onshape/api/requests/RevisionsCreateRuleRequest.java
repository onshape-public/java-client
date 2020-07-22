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
import com.onshape.api.responses.RevisionsCreateRuleResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createRule API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsCreateRuleRequest {
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
   * ID of the company to which the revision rule belongs
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
   */
  @JsonProperty("ruleType")
  @NotNull
  Number ruleType;

  /**
   * List of revisions associated with the rule. Must contain at least 50 unique revisions.
   */
  @JsonProperty("revisionList")
  @NotNull
  String[] revisionList;

  RevisionsCreateRuleRequest(String name, String description, String companyId, Number ruleType,
      String[] revisionList) {
    this.name = name;
    this.description = description;
    this.companyId = companyId;
    this.ruleType = ruleType;
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
   * Get ID of the company to which the revision rule belongs
   *
   * @return ID of the company to which the revision rule belongs
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
   *
   * @return Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
   *
   */
  public final Number getRuleType() {
    return this.ruleType;
  }

  /**
   * Get List of revisions associated with the rule. Must contain at least 50 unique revisions.
   *
   * @return List of revisions associated with the rule. Must contain at least 50 unique revisions.
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
     * ID of the company to which the revision rule belongs
     */
    private String companyId;

    /**
     * Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
     */
    private Number ruleType;

    /**
     * List of revisions associated with the rule. Must contain at least 50 unique revisions.
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
     * Get ID of the company to which the revision rule belongs
     *
     * @return ID of the company to which the revision rule belongs
     *
     */
    public final String companyId() {
      return this.companyId;
    }

    /**
     * Set ID of the company to which the revision rule belongs
     *
     * @param value ID of the company to which the revision rule belongs
     *
     * @return the Builder object.
     */
    public final Builder companyId(String value) {
      this.companyId = value;
      return this;
    }

    /**
     * Get Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
     *
     * @return Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
     *
     */
    public final Number ruleType() {
      return this.ruleType;
    }

    /**
     * Set Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
     *
     * @param value Method of determining next revisions. 0=Javascript, 1=List. Only List is currently supported for custom revision rules.
     *
     * @return the Builder object.
     */
    public final Builder ruleType(Number value) {
      this.ruleType = value;
      return this;
    }

    /**
     * Get List of revisions associated with the rule. Must contain at least 50 unique revisions.
     *
     * @return List of revisions associated with the rule. Must contain at least 50 unique revisions.
     *
     */
    public final String[] revisionList() {
      return this.revisionList;
    }

    /**
     * Set List of revisions associated with the rule. Must contain at least 50 unique revisions.
     *
     * @param value List of revisions associated with the rule. Must contain at least 50 unique revisions.
     *
     * @return the Builder object.
     */
    public final Builder revisionList(String[] value) {
      this.revisionList = value;
      return this;
    }

    private RevisionsCreateRuleRequest build() {
      return new com.onshape.api.requests.RevisionsCreateRuleRequest(name,description,companyId,ruleType,revisionList);
    }

    /**
     * Calls createRule method, Create a new revision rule for a company
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final RevisionsCreateRuleResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/revisionrules", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.RevisionsCreateRuleResponse.class);
    }
  }
}
