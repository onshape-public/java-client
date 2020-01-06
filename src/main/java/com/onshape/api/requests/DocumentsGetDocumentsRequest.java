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
import com.onshape.api.responses.DocumentsGetDocumentsResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getDocuments API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsGetDocumentsRequest {
  /**
   * Search for documents that contain the given string in the name. Search is not case-sensitive.
   */
  @JsonProperty("q")
  String q;

  /**
   * Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
   */
  @JsonProperty("filter")
  Number filter;

  /**
   * Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
   */
  @JsonProperty("owner")
  String owner;

  /**
   * Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
   */
  @JsonProperty("ownerType")
  Number ownerType;

  /**
   * Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
   */
  @JsonProperty("sortColumn")
  String sortColumn;

  /**
   * Sort order, which can be desc: descending, or asc: ascending
   */
  @JsonProperty("sortOrder")
  String sortOrder;

  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (max is 20)
   */
  @JsonProperty("limit")
  Number limit;

  DocumentsGetDocumentsRequest(String q, Number filter, String owner, Number ownerType,
      String sortColumn, String sortOrder, Number offset, Number limit) {
    this.q = q;
    this.filter = filter;
    this.owner = owner;
    this.ownerType = ownerType;
    this.sortColumn = sortColumn;
    this.sortOrder = sortOrder;
    this.offset = offset;
    this.limit = limit;
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
     * Search for documents that contain the given string in the name. Search is not case-sensitive.
     */
    private String q;

    /**
     * Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
     */
    private Number filter;

    /**
     * Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
     */
    private String owner;

    /**
     * Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
     */
    private Number ownerType;

    /**
     * Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
     */
    private String sortColumn;

    /**
     * Sort order, which can be desc: descending, or asc: ascending
     */
    private String sortOrder;

    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (max is 20)
     */
    private Number limit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Search for documents that contain the given string in the name. Search is not case-sensitive.
     *
     * @return Search for documents that contain the given string in the name. Search is not case-sensitive.
     *
     */
    public final String q() {
      return this.q;
    }

    /**
     * Set Search for documents that contain the given string in the name. Search is not case-sensitive.
     *
     * @param value Search for documents that contain the given string in the name. Search is not case-sensitive.
     *
     * @return the Builder object.
     */
    public final Builder q(String value) {
      this.q = value;
      return this;
    }

    /**
     * Get Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
     *
     * @return Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
     *
     */
    public final Number filter() {
      return this.filter;
    }

    /**
     * Set Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
     *
     * @param value Filter ID, which can be 0: my docs, 1: created, 2: shared, 3: trash, 4: public, 5: recent, 6: by owner, 7: by company, or 9: by team
     *
     * @return the Builder object.
     */
    public final Builder filter(Number value) {
      this.filter = value;
      return this;
    }

    /**
     * Get Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
     *
     * @return Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
     *
     */
    public final String owner() {
      return this.owner;
    }

    /**
     * Set Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
     *
     * @param value Document owner&#39;s ID if filter is 6 or 7. Team Id if filter is 9
     *
     * @return the Builder object.
     */
    public final Builder owner(String value) {
      this.owner = value;
      return this;
    }

    /**
     * Get Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
     *
     * @return Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
     *
     * @param value Type of owner, which can be 0: user, 1: company, 2: onshape. If owner is a teamId, leave this unspecified.
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
     *
     * @return Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
     *
     */
    public final String sortColumn() {
      return this.sortColumn;
    }

    /**
     * Set Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
     *
     * @param value Column by which to sort search results. Valid options are name, modifiedAt, createdAt, email, modifiedBy, and promotedAt
     *
     * @return the Builder object.
     */
    public final Builder sortColumn(String value) {
      this.sortColumn = value;
      return this;
    }

    /**
     * Get Sort order, which can be desc: descending, or asc: ascending
     *
     * @return Sort order, which can be desc: descending, or asc: ascending
     *
     */
    public final String sortOrder() {
      return this.sortOrder;
    }

    /**
     * Set Sort order, which can be desc: descending, or asc: ascending
     *
     * @param value Sort order, which can be desc: descending, or asc: ascending
     *
     * @return the Builder object.
     */
    public final Builder sortOrder(String value) {
      this.sortOrder = value;
      return this;
    }

    /**
     * Get Where to begin search results
     *
     * @return Where to begin search results
     *
     */
    public final Number offset() {
      return this.offset;
    }

    /**
     * Set Where to begin search results
     *
     * @param value Where to begin search results
     *
     * @return the Builder object.
     */
    public final Builder offset(Number value) {
      this.offset = value;
      return this;
    }

    /**
     * Get Number of results to return per page (max is 20)
     *
     * @return Number of results to return per page (max is 20)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (max is 20)
     *
     * @param value Number of results to return per page (max is 20)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    private DocumentsGetDocumentsRequest build() {
      return new com.onshape.api.requests.DocumentsGetDocumentsRequest(q,filter,owner,ownerType,sortColumn,sortOrder,offset,limit);
    }

    /**
     * Calls getDocuments method, Search for documents
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsGetDocumentsResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents", build(), onshape.buildMap(), onshape.buildMap("q", q, "filter", filter, "owner", owner, "ownerType", ownerType, "sortColumn", sortColumn, "sortOrder", sortOrder, "offset", offset, "limit", limit), com.onshape.api.responses.DocumentsGetDocumentsResponse.class);
    }
  }
}
