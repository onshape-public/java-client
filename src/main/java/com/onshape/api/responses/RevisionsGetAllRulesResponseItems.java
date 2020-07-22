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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getAllRules API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class RevisionsGetAllRulesResponseItems extends AbstractResponseObject {
  /**
   * ID of the revision rule
   */
  @JsonProperty("id")
  public String id;

  /**
   * Name of the revision rule
   */
  @JsonProperty("name")
  public String name;

  /**
   * Description of the revision rule
   */
  @JsonProperty("description")
  public String description;

  /**
   * ID of the company to which the revision rule belongs
   */
  @JsonProperty("companyId")
  public String companyId;

  /**
   * Method of determining next revisions. 0=Javascript, 1=List.
   */
  @JsonProperty("ruleType")
  public Number ruleType;

  /**
   * For List-type rules: list of revisions associated with the rule
   */
  @JsonProperty("revisionList")
  public String[] revisionList;

  /**
   * For Javascript-type rules: Javascript used to determine next revision
   */
  @JsonProperty("script")
  public String script;

  /**
   * Get ID of the revision rule
   *
   * @return ID of the revision rule
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Name of the revision rule
   *
   * @return Name of the revision rule
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Description of the revision rule
   *
   * @return Description of the revision rule
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
   * Get Method of determining next revisions. 0=Javascript, 1=List.
   *
   * @return Method of determining next revisions. 0=Javascript, 1=List.
   *
   */
  public final Number getRuleType() {
    return this.ruleType;
  }

  /**
   * Get For List-type rules: list of revisions associated with the rule
   *
   * @return For List-type rules: list of revisions associated with the rule
   *
   */
  public final String[] getRevisionList() {
    return this.revisionList;
  }

  /**
   * Get For Javascript-type rules: Javascript used to determine next revision
   *
   * @return For Javascript-type rules: Javascript used to determine next revision
   *
   */
  public final String getScript() {
    return this.script;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
