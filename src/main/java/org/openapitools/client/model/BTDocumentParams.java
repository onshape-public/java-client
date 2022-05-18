/*
 * Onshape REST API
 * The Onshape REST API consumed by all client. # Authorization The simplest way to authorize and enable the **Try it out** functionality is to sign in to Onshape and use the current session. The **Authorize** button enables other authorization techniques. To ensure the current session isn't used when trying other authentication techniques, make sure to remove the Onshape cookie as per the instructions for your particular browser. Alternatively, a private or incognito window may be used. Here's [how to remove a specific cookie on Chrome](https://support.google.com/chrome/answer/95647#zippy=%2Cdelete-cookies-from-a-site). - **Current Session** authorization is enabled by default if the browser is already signed in to [Onshape](/). - **OAuth2** authorization uses an Onshape OAuth2 app created on the [Onshape Developer Portal](https://dev-portal.onshape.com/oauthApps). The redirect URL field should include `https://cad.onshape.com/glassworks/explorer/oauth2-redirect.html`. - **API Key** authorization using basic authentication is also available. The keys can be generated in the [Onshape Developer Portal](https://dev-portal.onshape.com/keys). In the authentication dialog, enter the access key in the `Username` field, and enter the secret key in the `Password` field. Basic authentication should only be used during the development process since sharing API Keys provides the same level of access as a username and password.
 *
 * The version of the OpenAPI document: 1.147.4893-d7846311aebf
 * Contact: api-support@onshape.zendesk.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BTDocumentElementCreationDescriptor;

/**
 * BTDocumentParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-18T10:48:36.222032-04:00[America/New_York]")
public class BTDocumentParams {
  public static final String SERIALIZED_NAME_BETA_CAPABILITY_IDS = "betaCapabilityIds";
  @SerializedName(SERIALIZED_NAME_BETA_CAPABILITY_IDS)
  private List<String> betaCapabilityIds = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<BTDocumentElementCreationDescriptor> elements = null;

  public static final String SERIALIZED_NAME_GENERATE_UNKNOWN_MESSAGES = "generateUnknownMessages";
  @SerializedName(SERIALIZED_NAME_GENERATE_UNKNOWN_MESSAGES)
  private Boolean generateUnknownMessages;

  public static final String SERIALIZED_NAME_IS_EMPTY_CONTENT = "isEmptyContent";
  @SerializedName(SERIALIZED_NAME_IS_EMPTY_CONTENT)
  private Boolean isEmptyContent;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "isPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOT_REVISION_MANAGED = "notRevisionManaged";
  @SerializedName(SERIALIZED_NAME_NOT_REVISION_MANAGED)
  private Boolean notRevisionManaged;

  public static final String SERIALIZED_NAME_OWNER_EMAIL = "ownerEmail";
  @SerializedName(SERIALIZED_NAME_OWNER_EMAIL)
  private String ownerEmail;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "ownerType";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private Integer ownerType;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public BTDocumentParams() { 
  }

  public BTDocumentParams betaCapabilityIds(List<String> betaCapabilityIds) {
    
    this.betaCapabilityIds = betaCapabilityIds;
    return this;
  }

  public BTDocumentParams addBetaCapabilityIdsItem(String betaCapabilityIdsItem) {
    if (this.betaCapabilityIds == null) {
      this.betaCapabilityIds = new ArrayList<String>();
    }
    this.betaCapabilityIds.add(betaCapabilityIdsItem);
    return this;
  }

   /**
   * Get betaCapabilityIds
   * @return betaCapabilityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBetaCapabilityIds() {
    return betaCapabilityIds;
  }


  public void setBetaCapabilityIds(List<String> betaCapabilityIds) {
    this.betaCapabilityIds = betaCapabilityIds;
  }


  public BTDocumentParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BTDocumentParams elements(List<BTDocumentElementCreationDescriptor> elements) {
    
    this.elements = elements;
    return this;
  }

  public BTDocumentParams addElementsItem(BTDocumentElementCreationDescriptor elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<BTDocumentElementCreationDescriptor>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BTDocumentElementCreationDescriptor> getElements() {
    return elements;
  }


  public void setElements(List<BTDocumentElementCreationDescriptor> elements) {
    this.elements = elements;
  }


  public BTDocumentParams generateUnknownMessages(Boolean generateUnknownMessages) {
    
    this.generateUnknownMessages = generateUnknownMessages;
    return this;
  }

   /**
   * Get generateUnknownMessages
   * @return generateUnknownMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGenerateUnknownMessages() {
    return generateUnknownMessages;
  }


  public void setGenerateUnknownMessages(Boolean generateUnknownMessages) {
    this.generateUnknownMessages = generateUnknownMessages;
  }


  public BTDocumentParams isEmptyContent(Boolean isEmptyContent) {
    
    this.isEmptyContent = isEmptyContent;
    return this;
  }

   /**
   * Get isEmptyContent
   * @return isEmptyContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEmptyContent() {
    return isEmptyContent;
  }


  public void setIsEmptyContent(Boolean isEmptyContent) {
    this.isEmptyContent = isEmptyContent;
  }


  public BTDocumentParams isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public BTDocumentParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BTDocumentParams notRevisionManaged(Boolean notRevisionManaged) {
    
    this.notRevisionManaged = notRevisionManaged;
    return this;
  }

   /**
   * Get notRevisionManaged
   * @return notRevisionManaged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotRevisionManaged() {
    return notRevisionManaged;
  }


  public void setNotRevisionManaged(Boolean notRevisionManaged) {
    this.notRevisionManaged = notRevisionManaged;
  }


  public BTDocumentParams ownerEmail(String ownerEmail) {
    
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * Get ownerEmail
   * @return ownerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerEmail() {
    return ownerEmail;
  }


  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }


  public BTDocumentParams ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public BTDocumentParams ownerType(Integer ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * Get ownerType
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(Integer ownerType) {
    this.ownerType = ownerType;
  }


  public BTDocumentParams parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public BTDocumentParams projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public BTDocumentParams tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public BTDocumentParams addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BTDocumentParams btDocumentParams = (BTDocumentParams) o;
    return Objects.equals(this.betaCapabilityIds, btDocumentParams.betaCapabilityIds) &&
        Objects.equals(this.description, btDocumentParams.description) &&
        Objects.equals(this.elements, btDocumentParams.elements) &&
        Objects.equals(this.generateUnknownMessages, btDocumentParams.generateUnknownMessages) &&
        Objects.equals(this.isEmptyContent, btDocumentParams.isEmptyContent) &&
        Objects.equals(this.isPublic, btDocumentParams.isPublic) &&
        Objects.equals(this.name, btDocumentParams.name) &&
        Objects.equals(this.notRevisionManaged, btDocumentParams.notRevisionManaged) &&
        Objects.equals(this.ownerEmail, btDocumentParams.ownerEmail) &&
        Objects.equals(this.ownerId, btDocumentParams.ownerId) &&
        Objects.equals(this.ownerType, btDocumentParams.ownerType) &&
        Objects.equals(this.parentId, btDocumentParams.parentId) &&
        Objects.equals(this.projectId, btDocumentParams.projectId) &&
        Objects.equals(this.tags, btDocumentParams.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betaCapabilityIds, description, elements, generateUnknownMessages, isEmptyContent, isPublic, name, notRevisionManaged, ownerEmail, ownerId, ownerType, parentId, projectId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BTDocumentParams {\n");
    sb.append("    betaCapabilityIds: ").append(toIndentedString(betaCapabilityIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    generateUnknownMessages: ").append(toIndentedString(generateUnknownMessages)).append("\n");
    sb.append("    isEmptyContent: ").append(toIndentedString(isEmptyContent)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notRevisionManaged: ").append(toIndentedString(notRevisionManaged)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

