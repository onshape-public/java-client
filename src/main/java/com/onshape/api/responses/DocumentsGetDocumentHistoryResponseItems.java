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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getDocumentHistory API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsGetDocumentHistoryResponseItems extends AbstractResponseObject {
  /**
   * microversion id.
   */
  @JsonProperty("microversionId_")
  public String microversionId_;

  /**
   * next microversion id.
   */
  @JsonProperty("nextMicroversionId_")
  public String nextMicroversionId_;

  /**
   * username (scrubbed if lacking PII scope).
   */
  @JsonProperty("username_")
  public String username_;

  /**
   * date of creation.
   */
  @JsonProperty("date_")
  public String date_;

  /**
   * MV description.
   */
  @JsonProperty("description_")
  public String description_;

  /**
   * user ID.
   */
  @JsonProperty("userId_")
  public String userId_;

  /**
   * can this mv be restored.
   */
  @JsonProperty("canBeRestored_")
  public Boolean canBeRestored_;

  /**
   * Get microversion id.
   *
   * @return microversion id.
   *
   */
  public final String getMicroversionId_() {
    return this.microversionId_;
  }

  /**
   * Get next microversion id.
   *
   * @return next microversion id.
   *
   */
  public final String getNextMicroversionId_() {
    return this.nextMicroversionId_;
  }

  /**
   * Get username (scrubbed if lacking PII scope).
   *
   * @return username (scrubbed if lacking PII scope).
   *
   */
  public final String getUsername_() {
    return this.username_;
  }

  /**
   * Get date of creation.
   *
   * @return date of creation.
   *
   */
  public final String getDate_() {
    return this.date_;
  }

  /**
   * Get MV description.
   *
   * @return MV description.
   *
   */
  public final String getDescription_() {
    return this.description_;
  }

  /**
   * Get user ID.
   *
   * @return user ID.
   *
   */
  public final String getUserId_() {
    return this.userId_;
  }

  /**
   * Get can this mv be restored.
   *
   * @return can this mv be restored.
   *
   */
  public final Boolean getCanBeRestored_() {
    return this.canBeRestored_;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
