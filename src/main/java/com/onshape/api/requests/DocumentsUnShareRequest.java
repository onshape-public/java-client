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
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.DocumentsUnShareResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for unShare API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsUnShareRequest {
  /**
   * The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
   */
  @JsonProperty("entryType")
  Number entryType;

  DocumentsUnShareRequest(Number entryType) {
    this.entryType = entryType;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
     */
    private Number entryType;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
     *
     * @return The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
     *
     */
    public final Number entryType() {
      return this.entryType;
    }

    /**
     * Set The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
     *
     * @param value The type of entity referenced by eid. Valid values are 0=User, 1=Company, 2=Team, 4=Application.
     *
     * @return the Builder object.
     */
    public final Builder entryType(Number value) {
      this.entryType = value;
      return this;
    }

    private DocumentsUnShareRequest build() {
      return new com.onshape.api.requests.DocumentsUnShareRequest(entryType);
    }

    /**
     * Calls unShare method, Remove share permissions from document
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param eid Entry ID of the share entry to be deleted
     *
     * @param did Document ID
     */
    public final DocumentsUnShareResponse call(String eid, String did) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/documents/:did/share/:eid", build(), onshape.buildMap("eid", eid, "did", did), onshape.buildMap("entryType", entryType), com.onshape.api.responses.DocumentsUnShareResponse.class);
    }

    /**
     * Calls unShare method, Remove share permissions from document
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsUnShareResponse call(OnshapeDocument document) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/documents/:did/share/:eid", build(), onshape.buildMap("eid", document.getElementId(), "did", document.getDocumentId()), onshape.buildMap("entryType", entryType), com.onshape.api.responses.DocumentsUnShareResponse.class);
    }
  }
}
