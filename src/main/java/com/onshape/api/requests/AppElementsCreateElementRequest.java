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
import com.onshape.api.responses.AppElementsCreateElementResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for createElement API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class AppElementsCreateElementRequest {
  /**
   * The format id for the application element
   */
  @JsonProperty("formatId")
  @NotNull
  String formatId;

  /**
   * Requested app-element name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Description of the change being made, for history tracking
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Initial list of sub-element contents
   */
  @JsonProperty("subelements")
  @NotNull
  AppElementsCreateElementRequestSubelements[] subelements;

  /**
   * Location at which element should be inserted.
   */
  @JsonProperty("location")
  AppElementsCreateElementRequestLocation location;

  AppElementsCreateElementRequest(String formatId, String name, String description,
      AppElementsCreateElementRequestSubelements[] subelements,
      AppElementsCreateElementRequestLocation location) {
    this.formatId = formatId;
    this.name = name;
    this.description = description;
    this.subelements = subelements;
    this.location = location;
  }

  /**
   * Get The format id for the application element
   *
   * @return The format id for the application element
   *
   */
  public final String getFormatId() {
    return this.formatId;
  }

  /**
   * Get Requested app-element name
   *
   * @return Requested app-element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Description of the change being made, for history tracking
   *
   * @return Description of the change being made, for history tracking
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Initial list of sub-element contents
   *
   * @return Initial list of sub-element contents
   *
   */
  public final AppElementsCreateElementRequestSubelements[] getSubelements() {
    return this.subelements;
  }

  /**
   * Get Location at which element should be inserted.
   *
   * @return Location at which element should be inserted.
   *
   */
  public final AppElementsCreateElementRequestLocation getLocation() {
    return this.location;
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
     * The format id for the application element
     */
    private String formatId;

    /**
     * Requested app-element name
     */
    private String name;

    /**
     * Description of the change being made, for history tracking
     */
    private String description;

    /**
     * Initial list of sub-element contents
     */
    private AppElementsCreateElementRequestSubelements[] subelements;

    /**
     * Location at which element should be inserted.
     */
    private AppElementsCreateElementRequestLocation location;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The format id for the application element
     *
     * @return The format id for the application element
     *
     */
    public final String formatId() {
      return this.formatId;
    }

    /**
     * Set The format id for the application element
     *
     * @param value The format id for the application element
     *
     * @return the Builder object.
     */
    public final Builder formatId(String value) {
      this.formatId = value;
      return this;
    }

    /**
     * Get Requested app-element name
     *
     * @return Requested app-element name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Requested app-element name
     *
     * @param value Requested app-element name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Description of the change being made, for history tracking
     *
     * @return Description of the change being made, for history tracking
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the change being made, for history tracking
     *
     * @param value Description of the change being made, for history tracking
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Initial list of sub-element contents
     *
     * @return Initial list of sub-element contents
     *
     */
    public final AppElementsCreateElementRequestSubelements[] subelements() {
      return this.subelements;
    }

    /**
     * Set Initial list of sub-element contents
     *
     * @param value Initial list of sub-element contents
     *
     * @return the Builder object.
     */
    public final Builder subelements(AppElementsCreateElementRequestSubelements[] value) {
      this.subelements = value;
      return this;
    }

    /**
     * Get Location at which element should be inserted.
     *
     * @return Location at which element should be inserted.
     *
     */
    public final AppElementsCreateElementRequestLocation location() {
      return this.location;
    }

    /**
     * Set Location at which element should be inserted.
     *
     * @param value Location at which element should be inserted.
     *
     * @return the Builder object.
     */
    public final Builder location(AppElementsCreateElementRequestLocation value) {
      this.location = value;
      return this;
    }

    private AppElementsCreateElementRequest build() {
      return new com.onshape.api.requests.AppElementsCreateElementRequest(formatId,name,description,subelements,location);
    }

    /**
     * Calls createElement method, Create an app element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final AppElementsCreateElementResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateElementResponse.class);
    }

    /**
     * Calls createElement method, Create an app element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsCreateElementResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateElementResponse.class);
    }
  }
}
