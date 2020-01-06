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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for getUserSettingsCurrentLoggedInUser API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class UsersGetUserSettingsCurrentLoggedInUserResponse extends AbstractResponseObject {
  /**
   * Onshape internal use
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Onshape internal use
   */
  @JsonProperty("enforceApplicationAcl")
  @NotNull
  Boolean enforceApplicationAcl;

  /**
   * Common units
   */
  @JsonProperty("commonUnits")
  @NotNull
  UsersGetUserSettingsCurrentLoggedInUserResponseCommonUnits commonUnits;

  /**
   * User default units
   */
  @JsonProperty("defaultUnits")
  @NotNull
  UsersGetUserSettingsCurrentLoggedInUserResponseDefaultUnits defaultUnits;

  /**
   * Onshape internal use (deprecated)
   */
  @JsonProperty("mouseActions")
  @NotNull
  String mouseActions;

  /**
   * Whether scroll wheel zoom direction is reversed (default: scroll forward to zoom in)
   */
  @JsonProperty("reverseScrollWheelZoomDirection")
  @NotNull
  Boolean reverseScrollWheelZoomDirection;

  /**
   * Onshape internal use
   */
  @JsonProperty("viewMappingId")
  @NotNull
  Number viewMappingId;

  /**
   * Set of mouse buttons and modifier keys to manipulate view
   */
  @JsonProperty("viewManipulationMouseKeyMapping")
  @NotNull
  UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMapping viewManipulationMouseKeyMapping;

  /**
   * Locale and language in which user uses Onshape
   */
  @JsonProperty("locale")
  @NotNull
  String locale;

  /**
   * Onshape internal use
   */
  @JsonProperty("drawingBackgroundId")
  @NotNull
  Number drawingBackgroundId;

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Boolean getEnforceApplicationAcl() {
    return this.enforceApplicationAcl;
  }

  /**
   * Get Common units
   *
   * @return Common units
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseCommonUnits getCommonUnits() {
    return this.commonUnits;
  }

  /**
   * Get User default units
   *
   * @return User default units
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseDefaultUnits getDefaultUnits() {
    return this.defaultUnits;
  }

  /**
   * Get Onshape internal use (deprecated)
   *
   * @return Onshape internal use (deprecated)
   *
   */
  public final String getMouseActions() {
    return this.mouseActions;
  }

  /**
   * Get Whether scroll wheel zoom direction is reversed (default: scroll forward to zoom in)
   *
   * @return Whether scroll wheel zoom direction is reversed (default: scroll forward to zoom in)
   *
   */
  public final Boolean getReverseScrollWheelZoomDirection() {
    return this.reverseScrollWheelZoomDirection;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Number getViewMappingId() {
    return this.viewMappingId;
  }

  /**
   * Get Set of mouse buttons and modifier keys to manipulate view
   *
   * @return Set of mouse buttons and modifier keys to manipulate view
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMapping getViewManipulationMouseKeyMapping(
      ) {
    return this.viewManipulationMouseKeyMapping;
  }

  /**
   * Get Locale and language in which user uses Onshape
   *
   * @return Locale and language in which user uses Onshape
   *
   */
  public final String getLocale() {
    return this.locale;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Number getDrawingBackgroundId() {
    return this.drawingBackgroundId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
