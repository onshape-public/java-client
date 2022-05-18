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
import org.openapitools.client.model.BTAppElementParams;

/**
 * BTDocumentElementCreationDescriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-18T10:48:36.222032-04:00[America/New_York]")
public class BTDocumentElementCreationDescriptor {
  public static final String SERIALIZED_NAME_ELEMENT_PARAMS = "elementParams";
  @SerializedName(SERIALIZED_NAME_ELEMENT_PARAMS)
  private BTAppElementParams elementParams;

  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "elementType";
  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private Integer elementType;

  public BTDocumentElementCreationDescriptor() { 
  }

  public BTDocumentElementCreationDescriptor elementParams(BTAppElementParams elementParams) {
    
    this.elementParams = elementParams;
    return this;
  }

   /**
   * Get elementParams
   * @return elementParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BTAppElementParams getElementParams() {
    return elementParams;
  }


  public void setElementParams(BTAppElementParams elementParams) {
    this.elementParams = elementParams;
  }


  public BTDocumentElementCreationDescriptor elementType(Integer elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElementType() {
    return elementType;
  }


  public void setElementType(Integer elementType) {
    this.elementType = elementType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BTDocumentElementCreationDescriptor btDocumentElementCreationDescriptor = (BTDocumentElementCreationDescriptor) o;
    return Objects.equals(this.elementParams, btDocumentElementCreationDescriptor.elementParams) &&
        Objects.equals(this.elementType, btDocumentElementCreationDescriptor.elementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementParams, elementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BTDocumentElementCreationDescriptor {\n");
    sb.append("    elementParams: ").append(toIndentedString(elementParams)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
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

