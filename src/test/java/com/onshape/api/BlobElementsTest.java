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
package com.onshape.api;

import com.onshape.api.desktop.OnshapeDesktop;
import com.onshape.api.exceptions.OnshapeException;

import java.io.File;
import java.lang.String;

import com.onshape.api.responses.BlobElementsUploadFileCreateElementResponse;
import com.onshape.api.responses.DocumentsCreateDocumentResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class BlobElementsTest {
    private static Onshape CLIENT;

    public Onshape getClient() {
        return CLIENT;
    }

    public BlobElements getGroup() {
        return getClient().blobElements();
    }

    public String getUserId() throws OnshapeException {
        return getClient().users().getSessionInfo().call().getId();
    }

    @Test
    public void testUploadFileCreateElementWithOAuth() {
        Onshape o = new Onshape();
        OnshapeDesktop od = new OnshapeDesktop(System.getenv("ONSHAPE_CLIENTID"), System.getenv("ONSHAPE_CLIENTSECRET"));
        try {
            od.setupClient(o);
        } catch (OnshapeException ex) {
            Assertions.fail("Failed to set OAuth credentials", ex);
            return;
        }
        uploadFileCreateElement(o);
    }

    @Test
    public void testUploadFileCreateElementWithAPIKeys() throws OnshapeException {
        Onshape o = new Onshape();
        o.setAPICredentials(System.getenv("ONSHAPE_API_ACCESSKEY"), System.getenv("ONSHAPE_API_SECRETKEY"));
        uploadFileCreateElement(o);
    }

    public void uploadFileCreateElement(Onshape o) {
        File f = new File(new File(System.getProperty("user.dir")), "/src/test/resources/stepexample.step");
        DocumentsCreateDocumentResponse createdDocument;
        try {
            createdDocument = o.documents().createDocument().isPublic(Boolean.TRUE).name("IAmATestDeleteMe").ownerType(0).call();
        } catch (OnshapeException ex) {
            Assertions.fail("Failed to create document", ex);
            return;
        }
        BlobElementsUploadFileCreateElementResponse response;
        try {
            response = o.blobElements()
                    .uploadFileCreateElement()
                    .file(f)
                    .translate(Boolean.TRUE)
                    .yAxisIsUp(Boolean.FALSE)
                    .flattenAssemblies(Boolean.FALSE)
                    .call(createdDocument.getId(), createdDocument.getDefaultWorkspace().getId());
        } catch (OnshapeException ex) {
            Assertions.fail("Failed to upload blob to new element", ex);
        }
        try {
            o.documents().deleteDocument().call(createdDocument.getId());
        } catch (OnshapeException ex) {
            Assertions.fail("Failed to delete document", ex);
        }
    }

    @BeforeAll
    public static void setup() throws OnshapeException {
        CLIENT = new Onshape();
        String accessKey = System.getenv("ONSHAPE_API_ACCESSKEY");
        String secretKey = System.getenv("ONSHAPE_API_SECRETKEY");
        if ((accessKey == null || accessKey.isEmpty()) || (secretKey == null || secretKey.isEmpty())) {
            throw new OnshapeException("Please define ONSHAPE_API_ACCESSKEY and ONSHAPE_API_SECRETKEY environment variables");
        }
        CLIENT.setAPICredentials(accessKey, secretKey);
    }
}
