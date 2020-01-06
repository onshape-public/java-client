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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to shareDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsShareDocumentRequestEntries {
  /**
   * The ID of an Onshape Company to share with
   */
  @JsonProperty("companyId")
  public String companyId;

  /**
   * The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
   */
  @JsonProperty("email")
  public String email;

  /**
   * The ID of an Onshape Team to share with
   */
  @JsonProperty("teamId")
  public String teamId;

  /**
   * The ID of an Onshape User to share with
   */
  @JsonProperty("userId")
  public String userId;

  /**
   * The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
   */
  @JsonProperty("applicationId")
  public String applicationId;

  /**
   * The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
   */
  @JsonProperty("entryType")
  public String entryType;

  DocumentsShareDocumentRequestEntries(String companyId, String email, String teamId, String userId,
      String applicationId, String entryType) {
    this.companyId = companyId;
    this.email = email;
    this.teamId = teamId;
    this.userId = userId;
    this.applicationId = applicationId;
    this.entryType = entryType;
  }

  /**
   * Get The ID of an Onshape Company to share with
   *
   * @return The ID of an Onshape Company to share with
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
   *
   * @return The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
   *
   */
  public final String getEmail() {
    return this.email;
  }

  /**
   * Get The ID of an Onshape Team to share with
   *
   * @return The ID of an Onshape Team to share with
   *
   */
  public final String getTeamId() {
    return this.teamId;
  }

  /**
   * Get The ID of an Onshape User to share with
   *
   * @return The ID of an Onshape User to share with
   *
   */
  public final String getUserId() {
    return this.userId;
  }

  /**
   * Get The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
   *
   * @return The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
   *
   */
  public final String getApplicationId() {
    return this.applicationId;
  }

  /**
   * Get The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
   *
   * @return The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
   *
   */
  public final String getEntryType() {
    return this.entryType;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * The ID of an Onshape Company to share with
     */
    private String companyId;

    /**
     * The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
     */
    private String email;

    /**
     * The ID of an Onshape Team to share with
     */
    private String teamId;

    /**
     * The ID of an Onshape User to share with
     */
    private String userId;

    /**
     * The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
     */
    private String applicationId;

    /**
     * The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
     */
    private String entryType;

    Builder() {
    }

    /**
     * Get The ID of an Onshape Company to share with
     *
     * @return The ID of an Onshape Company to share with
     *
     */
    public final String companyId() {
      return this.companyId;
    }

    /**
     * Set The ID of an Onshape Company to share with
     *
     * @param value The ID of an Onshape Company to share with
     *
     * @return the Builder object.
     */
    public final Builder companyId(String value) {
      this.companyId = value;
      return this;
    }

    /**
     * Get The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
     *
     * @return The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
     *
     */
    public final String email() {
      return this.email;
    }

    /**
     * Set The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
     *
     * @param value The email of a user to share with. If the email is not associated with an existing Onshape user, an invite email will be sent to the email address if update=false, otherwise the response will be a NOT FOUND error.
     *
     * @return the Builder object.
     */
    public final Builder email(String value) {
      this.email = value;
      return this;
    }

    /**
     * Get The ID of an Onshape Team to share with
     *
     * @return The ID of an Onshape Team to share with
     *
     */
    public final String teamId() {
      return this.teamId;
    }

    /**
     * Set The ID of an Onshape Team to share with
     *
     * @param value The ID of an Onshape Team to share with
     *
     * @return the Builder object.
     */
    public final Builder teamId(String value) {
      this.teamId = value;
      return this;
    }

    /**
     * Get The ID of an Onshape User to share with
     *
     * @return The ID of an Onshape User to share with
     *
     */
    public final String userId() {
      return this.userId;
    }

    /**
     * Set The ID of an Onshape User to share with
     *
     * @param value The ID of an Onshape User to share with
     *
     * @return the Builder object.
     */
    public final Builder userId(String value) {
      this.userId = value;
      return this;
    }

    /**
     * Get The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
     *
     * @return The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
     *
     */
    public final String applicationId() {
      return this.applicationId;
    }

    /**
     * Set The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
     *
     * @param value The ID of an Onshape Application to share with. Note that application sharing only allows READ to be specified as a permission.
     *
     * @return the Builder object.
     */
    public final Builder applicationId(String value) {
      this.applicationId = value;
      return this;
    }

    /**
     * Get The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
     *
     * @return The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
     *
     */
    public final String entryType() {
      return this.entryType;
    }

    /**
     * Set The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
     *
     * @param value The type of entity that whe are sharing with. Valid values are 0=User (specify userId or email), 1=Company, 2=Team, 4=Application. Must correspond to the id field populated.
     *
     * @return the Builder object.
     */
    public final Builder entryType(String value) {
      this.entryType = value;
      return this;
    }

    public final DocumentsShareDocumentRequestEntries build() {
      return new com.onshape.api.requests.DocumentsShareDocumentRequestEntries(companyId,email,teamId,userId,applicationId,entryType);
    }
  }
}
