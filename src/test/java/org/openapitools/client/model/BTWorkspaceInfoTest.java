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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BTThumbnailInfo;
import org.openapitools.client.model.BTUserBasicSummaryInfo;
import org.openapitools.client.model.BTVersionInfo;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for BTWorkspaceInfo
 */
public class BTWorkspaceInfoTest {
    private final BTWorkspaceInfo model = new BTWorkspaceInfo();

    /**
     * Model tests for BTWorkspaceInfo
     */
    @Test
    public void testBTWorkspaceInfo() {
        // TODO: test BTWorkspaceInfo
    }

    /**
     * Test the property 'canDelete'
     */
    @Test
    public void canDeleteTest() {
        // TODO: test canDelete
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'creator'
     */
    @Test
    public void creatorTest() {
        // TODO: test creator
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'documentId'
     */
    @Test
    public void documentIdTest() {
        // TODO: test documentId
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
     * Test the property 'isReadOnly'
     */
    @Test
    public void isReadOnlyTest() {
        // TODO: test isReadOnly
    }

    /**
     * Test the property 'lastModifier'
     */
    @Test
    public void lastModifierTest() {
        // TODO: test lastModifier
    }

    /**
     * Test the property 'microversion'
     */
    @Test
    public void microversionTest() {
        // TODO: test microversion
    }

    /**
     * Test the property 'modifiedAt'
     */
    @Test
    public void modifiedAtTest() {
        // TODO: test modifiedAt
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'overrideDate'
     */
    @Test
    public void overrideDateTest() {
        // TODO: test overrideDate
    }

    /**
     * Test the property 'parent'
     */
    @Test
    public void parentTest() {
        // TODO: test parent
    }

    /**
     * Test the property 'parents'
     */
    @Test
    public void parentsTest() {
        // TODO: test parents
    }

    /**
     * Test the property 'thumbnail'
     */
    @Test
    public void thumbnailTest() {
        // TODO: test thumbnail
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'viewRef'
     */
    @Test
    public void viewRefTest() {
        // TODO: test viewRef
    }

}
