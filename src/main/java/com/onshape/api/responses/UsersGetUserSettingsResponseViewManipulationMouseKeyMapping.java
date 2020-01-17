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
 * Object used in calls to getUserSettings API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class UsersGetUserSettingsResponseViewManipulationMouseKeyMapping extends AbstractResponseObject {
  /**
   * Array of sets of button and key presses that pan in 2D
   */
  @JsonProperty("pan2DMapping")
  public UsersGetUserSettingsResponseViewManipulationMouseKeyMappingPan2DMapping[] pan2DMapping;

  /**
   * Array of sets of button and key presses that zoom in 2D
   */
  @JsonProperty("zoom2DMapping")
  public UsersGetUserSettingsResponseViewManipulationMouseKeyMappingZoom2DMapping[] zoom2DMapping;

  /**
   * Array of sets of button and key presses that rotate in 3D
   */
  @JsonProperty("rotate3DMapping")
  public UsersGetUserSettingsResponseViewManipulationMouseKeyMappingRotate3DMapping[] rotate3DMapping;

  /**
   * Array of sets of button and key presses that pan in 3D
   */
  @JsonProperty("pan3DMapping")
  public UsersGetUserSettingsResponseViewManipulationMouseKeyMappingPan3DMapping[] pan3DMapping;

  /**
   * Array of sets of button and key presses that zoom in 3D
   */
  @JsonProperty("zoom3DMapping")
  public UsersGetUserSettingsResponseViewManipulationMouseKeyMappingZoom3DMapping[] zoom3DMapping;

  /**
   * Get Array of sets of button and key presses that pan in 2D
   *
   * @return Array of sets of button and key presses that pan in 2D
   *
   */
  public final UsersGetUserSettingsResponseViewManipulationMouseKeyMappingPan2DMapping[] getPan2DMapping() {
    return this.pan2DMapping;
  }

  /**
   * Get Array of sets of button and key presses that zoom in 2D
   *
   * @return Array of sets of button and key presses that zoom in 2D
   *
   */
  public final UsersGetUserSettingsResponseViewManipulationMouseKeyMappingZoom2DMapping[] getZoom2DMapping() {
    return this.zoom2DMapping;
  }

  /**
   * Get Array of sets of button and key presses that rotate in 3D
   *
   * @return Array of sets of button and key presses that rotate in 3D
   *
   */
  public final UsersGetUserSettingsResponseViewManipulationMouseKeyMappingRotate3DMapping[] getRotate3DMapping() {
    return this.rotate3DMapping;
  }

  /**
   * Get Array of sets of button and key presses that pan in 3D
   *
   * @return Array of sets of button and key presses that pan in 3D
   *
   */
  public final UsersGetUserSettingsResponseViewManipulationMouseKeyMappingPan3DMapping[] getPan3DMapping() {
    return this.pan3DMapping;
  }

  /**
   * Get Array of sets of button and key presses that zoom in 3D
   *
   * @return Array of sets of button and key presses that zoom in 3D
   *
   */
  public final UsersGetUserSettingsResponseViewManipulationMouseKeyMappingZoom3DMapping[] getZoom3DMapping() {
    return this.zoom3DMapping;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
