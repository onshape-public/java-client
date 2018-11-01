/*
 * The MIT License
 *
 * Copyright 2018 Onshape Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.onshape.api.types;

import com.onshape.api.exceptions.OnshapeException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents a document in the Onshape web application, enabling documents to
 * be selected in the API client by copying URL.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class OnshapeDocument {

    private static final Pattern PATTERN = Pattern.compile("^https:\\/\\/cad\\.onshape\\.com\\/documents\\/([0-9a-z]+)\\/w\\/([0-9a-z]+)\\/e\\/([0-9a-z]+)$");
    private final String documentId;
    private final String workspaceId;
    private final String elementId;

    /**
     * Parse the given URL to determine document id, workspace id, and element
     * id.
     *
     * @param url A URL from the Onshape web application.
     * @throws OnshapeException If the URL cannot be parsed.
     */
    public OnshapeDocument(String url) throws OnshapeException {
        Matcher matcher = PATTERN.matcher(url.trim());
        if (matcher.find()) {
            throw new OnshapeException("URL is not a valid Onshape document URL: " + url);
        }
        this.documentId = matcher.group(1);
        this.workspaceId = matcher.group(2);
        this.elementId = matcher.group(3);
    }

    /**
     * Create a new instance from a document id, workspace id, and element id.
     *
     * @param documentId Document id.
     * @param workspaceId Workspace id.
     * @param elementId Element id.
     */
    public OnshapeDocument(String documentId, String workspaceId, String elementId) {
        this.documentId = documentId;
        this.workspaceId = workspaceId;
        this.elementId = elementId;
    }

    /**
     * Get the document id.
     *
     * @return Document id.
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Get the workspace id.
     *
     * @return Workspace id.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * Get the element id.
     *
     * @return Element id.
     */
    public String getElementId() {
        return elementId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.documentId);
        hash = 37 * hash + Objects.hashCode(this.workspaceId);
        hash = 37 * hash + Objects.hashCode(this.elementId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OnshapeDocument other = (OnshapeDocument) obj;
        if (!Objects.equals(this.documentId, other.documentId)) {
            return false;
        }
        if (!Objects.equals(this.workspaceId, other.workspaceId)) {
            return false;
        }
        return Objects.equals(this.elementId, other.elementId);
    }

    @Override
    public String toString() {
        return "https://cad.onshape.com/documents/" + documentId + "/w/" + workspaceId + "/e/" + elementId;
    }

}
