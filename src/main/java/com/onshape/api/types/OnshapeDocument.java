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

import com.fasterxml.jackson.annotation.JsonProperty;
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

    private static final Pattern PATTERN = Pattern.compile("^(https:\\/\\/\\w+(?:\\.\\w+){1,})\\/documents\\/([0-9a-z]+)\\/([wvm])\\/([0-9a-z]+)\\/e\\/([0-9a-z]+)$");
    @JsonProperty
    private final String baseURL;
    @JsonProperty
    private final String documentId;
    @JsonProperty
    private final WVM wvm;
    @JsonProperty
    private final String workspaceId;
    @JsonProperty
    private final String versionId;
    @JsonProperty
    private final String microversionId;
    @JsonProperty
    private final String elementId;

    /**
     * Create a null instance, for deserialization purposes
     */
    public OnshapeDocument() {
        this(null, null, null);
    }

    /**
     * Parse the given URL to determine document id, workspace id, and element
     * id.
     *
     * @param url A URL from the Onshape web application.
     * @throws OnshapeException If the URL cannot be parsed.
     */
    public OnshapeDocument(String url) throws OnshapeException {
        Matcher matcher = PATTERN.matcher(url.trim());
        if (!matcher.matches()) {
            throw new OnshapeException("URL is not a valid Onshape document URL: " + url);
        }
        this.baseURL = matcher.group(1);
        this.documentId = matcher.group(2);
        switch (matcher.group(3)) {
            case "v":
                this.wvm = WVM.Version;
                this.workspaceId = null;
                this.versionId = matcher.group(4);
                this.microversionId = null;
                break;
            case "m":
                this.wvm = WVM.Microversion;
                this.workspaceId = null;
                this.versionId = null;
                this.microversionId = matcher.group(4);
                break;
            default:
                this.wvm = WVM.Workspace;
                this.workspaceId = matcher.group(4);
                this.versionId = null;
                this.microversionId = null;
        }
        this.elementId = matcher.group(5);
    }

    /**
     * Create a new instance from a document id, workspace id, and element id.
     *
     * @param documentId Document id.
     * @param workspaceId Workspace id.
     * @param elementId Element id.
     */
    public OnshapeDocument(String documentId, String workspaceId, String elementId) {
        this.baseURL = "https://cad.onshape.com";
        this.documentId = documentId;
        this.wvm = WVM.Workspace;
        this.workspaceId = workspaceId;
        this.versionId = null;
        this.microversionId = null;
        this.elementId = elementId;
    }

    /**
     * Create a new instance using all possible options, used internally by
     * response objects.
     *
     * @param documentId Document id.
     * @param workspaceId Workspace id.
     * @param versionId Version id.
     * @param microversionId Microversion id.
     * @param elementId Element id.
     */
    public OnshapeDocument(String documentId, String workspaceId, String versionId, String microversionId, String elementId) {
        this.baseURL = "https://cad.onshape.com";
        this.documentId = documentId;
        this.wvm = workspaceId != null ? WVM.Workspace : (versionId != null ? WVM.Version : (microversionId != null ? WVM.Microversion : null));
        this.workspaceId = workspaceId;
        this.versionId = versionId;
        this.microversionId = microversionId;
        this.elementId = elementId;
    }

    /**
     * Get the base URL, typically https://cad.onshape.com
     *
     * @return Base URL as a String
     */
    public String getBaseURL() {
        return baseURL;
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
     * Gets the choice of WVM (Workspace, Version, Microversion)
     *
     * @return wvm or null if no workspace, version, or microversion
     */
    public WVM getWVM() {
        return wvm;
    }

    /**
     * Gets the choice of WV (Workspace, Version)
     *
     * @return wv or null if no workspace or version
     */
    public WV getWV() {
        if (wvm == null || wvm == WVM.Microversion) {
            return null;
        }
        switch (wvm) {
            case Workspace:
                return WV.Workspace;
            default:
                return WV.Version;
        }
    }

    /**
     * Gets either Workspace, Version or Microversion, depending on WVM variable
     *
     * @return An id, or null if none available
     */
    public String getWVMId() {
        if (wvm == null) {
            return null;
        }
        switch (wvm) {
            case Workspace:
                return workspaceId;
            case Version:
                return versionId;
            default:
                return microversionId;
        }
    }

    /**
     * Gets either Workspace or Version, depending on WV variable
     *
     * @return An id, or null if none available
     */
    public String getWVId() {
        if (wvm == null || wvm == WVM.Microversion) {
            return null;
        }
        switch (wvm) {
            case Workspace:
                return workspaceId;
            default:
                return versionId;
        }
    }

    /**
     * Get the version id.
     *
     * @return Version id.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Get the microversion id.
     *
     * @return Microversion id.
     */
    public String getMicroversionId() {
        return microversionId;
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
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.baseURL);
        hash = 59 * hash + Objects.hashCode(this.documentId);
        hash = 59 * hash + Objects.hashCode(this.wvm);
        hash = 59 * hash + Objects.hashCode(this.workspaceId);
        hash = 59 * hash + Objects.hashCode(this.versionId);
        hash = 59 * hash + Objects.hashCode(this.microversionId);
        hash = 59 * hash + Objects.hashCode(this.elementId);
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
        if (!Objects.equals(this.baseURL, other.baseURL)) {
            return false;
        }
        if (!Objects.equals(this.documentId, other.documentId)) {
            return false;
        }
        if (!Objects.equals(this.workspaceId, other.workspaceId)) {
            return false;
        }
        if (!Objects.equals(this.versionId, other.versionId)) {
            return false;
        }
        if (!Objects.equals(this.microversionId, other.microversionId)) {
            return false;
        }
        if (!Objects.equals(this.elementId, other.elementId)) {
            return false;
        }
        return this.wvm == other.wvm;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(this.baseURL)
                .append("/documents/")
                .append(documentId);
        if (wvm != null) {
            switch (wvm) {
                case Version:
                    out.append("/v/").append(versionId);
                    break;
                case Microversion:
                    out.append("/m/").append(microversionId);
                    break;
                default:
                    out.append("/w/").append(workspaceId);
            }
        }
        if (elementId != null) {
            out.append("/e/").append(elementId);
        }
        return out.toString();
    }

}
