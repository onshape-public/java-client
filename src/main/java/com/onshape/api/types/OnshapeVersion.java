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
import java.util.Objects;

/**
 * Represents the current build version of Onshape
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class OnshapeVersion {

    @JsonProperty("Manifest-Version")
    private String manifestVersion;
    @JsonProperty("Git-Commit")
    private String gitCommit;
    @JsonProperty("Implementation-Version")
    private String implementationVersion;

    public OnshapeVersion() {
    }

    public OnshapeVersion(String manifestVersion, String gitCommit, String implementationVersion) {
        this.manifestVersion = manifestVersion;
        this.gitCommit = gitCommit;
        this.implementationVersion = implementationVersion;
    }

    public String getManifestVersion() {
        return manifestVersion;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public String getImplementationVersion() {
        return implementationVersion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.manifestVersion);
        hash = 53 * hash + Objects.hashCode(this.gitCommit);
        hash = 53 * hash + Objects.hashCode(this.implementationVersion);
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
        final OnshapeVersion other = (OnshapeVersion) obj;
        if (!Objects.equals(this.manifestVersion, other.manifestVersion)) {
            return false;
        }
        if (!Objects.equals(this.gitCommit, other.gitCommit)) {
            return false;
        }
        if (!Objects.equals(this.implementationVersion, other.implementationVersion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OnshapeVersion{" + "manifestVersion=" + manifestVersion + ", gitCommit=" + gitCommit + ", implementationVersion=" + implementationVersion + '}';
    }

}
