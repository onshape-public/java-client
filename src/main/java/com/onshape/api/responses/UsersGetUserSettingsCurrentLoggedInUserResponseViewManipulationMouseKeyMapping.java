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

/**
 * Object used in calls to getUserSettingsCurrentLoggedInUser API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMapping extends AbstractResponseObject {
  /**
   * Array of sets of button and key presses that pan in 2D
   */
  @JsonProperty("pan2DMapping")
  public UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingPan2DMapping[] pan2DMapping;

  /**
   * Array of sets of button and key presses that zoom in 2D
   */
  @JsonProperty("zoom2DMapping")
  public UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingZoom2DMapping[] zoom2DMapping;

  /**
   * Array of sets of button and key presses that rotate in 3D
   */
  @JsonProperty("rotate3DMapping")
  public UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingRotate3DMapping[] rotate3DMapping;

  /**
   * Array of sets of button and key presses that pan in 3D
   */
  @JsonProperty("pan3DMapping")
  public UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingPan3DMapping[] pan3DMapping;

  /**
   * Array of sets of button and key presses that zoom in 3D
   */
  @JsonProperty("zoom3DMapping")
  public UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingZoom3DMapping[] zoom3DMapping;

  /**
   * Get Array of sets of button and key presses that pan in 2D
   *
   * @return Array of sets of button and key presses that pan in 2D
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingPan2DMapping[] getPan2DMapping(
      ) {
    return this.pan2DMapping;
  }

  /**
   * Get Array of sets of button and key presses that zoom in 2D
   *
   * @return Array of sets of button and key presses that zoom in 2D
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingZoom2DMapping[] getZoom2DMapping(
      ) {
    return this.zoom2DMapping;
  }

  /**
   * Get Array of sets of button and key presses that rotate in 3D
   *
   * @return Array of sets of button and key presses that rotate in 3D
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingRotate3DMapping[] getRotate3DMapping(
      ) {
    return this.rotate3DMapping;
  }

  /**
   * Get Array of sets of button and key presses that pan in 3D
   *
   * @return Array of sets of button and key presses that pan in 3D
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingPan3DMapping[] getPan3DMapping(
      ) {
    return this.pan3DMapping;
  }

  /**
   * Get Array of sets of button and key presses that zoom in 3D
   *
   * @return Array of sets of button and key presses that zoom in 3D
   *
   */
  public final UsersGetUserSettingsCurrentLoggedInUserResponseViewManipulationMouseKeyMappingZoom3DMapping[] getZoom3DMapping(
      ) {
    return this.zoom3DMapping;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
