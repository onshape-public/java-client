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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.openapitools.client.model.BTOwnerInfo;
import org.openapitools.client.model.BTUserBasicSummaryInfo;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for BTDocumentLabelInfo
 */
public class BTDocumentLabelInfoTest {
    private final BTDocumentLabelInfo model = new BTDocumentLabelInfo();

    /**
     * Model tests for BTDocumentLabelInfo
     */
    @Test
    public void testBTDocumentLabelInfo() {
        // TODO: test BTDocumentLabelInfo
    }

    /**
     * Test the property 'canMove'
     */
    @Test
    public void canMoveTest() {
        // TODO: test canMove
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'href'
     */
    @Test
    public void hrefTest() {
        // TODO: test href
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'isContainer'
     */
    @Test
    public void isContainerTest() {
        // TODO: test isContainer
    }

    /**
     * Test the property 'isEnterpriseOwned'
     */
    @Test
    public void isEnterpriseOwnedTest() {
        // TODO: test isEnterpriseOwned
    }

    /**
     * Test the property 'isMutable'
     */
    @Test
    public void isMutableTest() {
        // TODO: test isMutable
    }

    /**
     * Test the property 'modifiedAt'
     */
    @Test
    public void modifiedAtTest() {
        // TODO: test modifiedAt
    }

    /**
     * Test the property 'modifiedBy'
     */
    @Test
    public void modifiedByTest() {
        // TODO: test modifiedBy
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'owner'
     */
    @Test
    public void ownerTest() {
        // TODO: test owner
    }

    /**
     * Test the property 'parentLabelId'
     */
    @Test
    public void parentLabelIdTest() {
        // TODO: test parentLabelId
    }

    /**
     * Test the property 'path'
     */
    @Test
    public void pathTest() {
        // TODO: test path
    }

    /**
     * Test the property 'projectId'
     */
    @Test
    public void projectIdTest() {
        // TODO: test projectId
    }

    /**
     * Test the property 'resourceType'
     */
    @Test
    public void resourceTypeTest() {
        // TODO: test resourceType
    }

    /**
     * Test the property 'treeHref'
     */
    @Test
    public void treeHrefTest() {
        // TODO: test treeHref
    }

    /**
     * Test the property 'viewRef'
     */
    @Test
    public void viewRefTest() {
        // TODO: test viewRef
    }

}
