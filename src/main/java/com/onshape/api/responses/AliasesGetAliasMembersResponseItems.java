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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getAliasMembers API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AliasesGetAliasMembersResponseItems extends AbstractResponseObject {
  /**
   * ID of the alias entry
   */
  @JsonProperty("id")
  public String id;

  /**
   * CreatedAt of the alias entry
   */
  @JsonProperty("createdAt")
  public String createdAt;

  /**
   * Name of the alias entry
   */
  @JsonProperty("name")
  public String name;

  /**
   * Identity (user/team) contained in the alias
   */
  @JsonProperty("identity")
  public Map[] identity;

  /**
   * Get ID of the alias entry
   *
   * @return ID of the alias entry
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get CreatedAt of the alias entry
   *
   * @return CreatedAt of the alias entry
   *
   */
  public final String getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Get Name of the alias entry
   *
   * @return Name of the alias entry
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Identity (user/team) contained in the alias
   *
   * @return Identity (user/team) contained in the alias
   *
   */
  public final Map[] getIdentity() {
    return this.identity;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
