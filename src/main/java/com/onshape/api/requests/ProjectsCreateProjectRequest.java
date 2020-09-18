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
import com.onshape.api.responses.ProjectsCreateProjectResponse;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Request object for createProject API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ProjectsCreateProjectRequest {
  /**
   * Project name
   */
  @JsonProperty("name")
  String name;

  /**
   * Project description
   */
  @JsonProperty("description")
  String description;

  /**
   * Permission scheme Id
   */
  @JsonProperty("permissionSchemeId")
  String permissionSchemeId;

  /**
   * Map of role to a list of identity params.
   */
  @JsonProperty("roleMap")
  Map roleMap;

  ProjectsCreateProjectRequest(String name, String description, String permissionSchemeId,
      Map roleMap) {
    this.name = name;
    this.description = description;
    this.permissionSchemeId = permissionSchemeId;
    this.roleMap = roleMap;
  }

  /**
   * Get Project name
   *
   * @return Project name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Project description
   *
   * @return Project description
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Permission scheme Id
   *
   * @return Permission scheme Id
   *
   */
  public final String getPermissionSchemeId() {
    return this.permissionSchemeId;
  }

  /**
   * Get Map of role to a list of identity params.
   *
   * @return Map of role to a list of identity params.
   *
   */
  public final Map getRoleMap() {
    return this.roleMap;
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
     * Project name
     */
    private String name;

    /**
     * Project description
     */
    private String description;

    /**
     * Permission scheme Id
     */
    private String permissionSchemeId;

    /**
     * Map of role to a list of identity params.
     */
    private Map roleMap;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Project name
     *
     * @return Project name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Project name
     *
     * @param value Project name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Project description
     *
     * @return Project description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Project description
     *
     * @param value Project description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Permission scheme Id
     *
     * @return Permission scheme Id
     *
     */
    public final String permissionSchemeId() {
      return this.permissionSchemeId;
    }

    /**
     * Set Permission scheme Id
     *
     * @param value Permission scheme Id
     *
     * @return the Builder object.
     */
    public final Builder permissionSchemeId(String value) {
      this.permissionSchemeId = value;
      return this;
    }

    /**
     * Get Map of role to a list of identity params.
     *
     * @return Map of role to a list of identity params.
     *
     */
    public final Map roleMap() {
      return this.roleMap;
    }

    /**
     * Set Map of role to a list of identity params.
     *
     * @param value Map of role to a list of identity params.
     *
     * @return the Builder object.
     */
    public final Builder roleMap(Map value) {
      this.roleMap = value;
      return this;
    }

    private ProjectsCreateProjectRequest build() {
      return new com.onshape.api.requests.ProjectsCreateProjectRequest(name,description,permissionSchemeId,roleMap);
    }

    /**
     * Calls createProject method, Create a new project within the session's enterprise company
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final ProjectsCreateProjectResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/projects", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.ProjectsCreateProjectResponse.class);
    }
  }
}
