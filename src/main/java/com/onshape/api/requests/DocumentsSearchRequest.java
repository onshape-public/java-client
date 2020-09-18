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
import com.onshape.api.responses.DocumentsSearchResponse;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for search API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsSearchRequest {
  /**
   * Search domain: documents, element type, parts, or &quot;all&quot;
   */
  @JsonProperty("type")
  String type;

  /**
   * Document filter ID (e.g., MY_DOCS, ALL)
   */
  @JsonProperty("documentFilterOrdinal")
  Number documentFilterOrdinal;

  /**
   * Relevant for certain values of documentFilterOrdinal
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
   */
  @JsonProperty("rawQuery")
  String rawQuery;

  /**
   * Where to begin search results
   */
  @JsonProperty("offset")
  Number offset;

  /**
   * Number of results to return per page (default and max is 20)
   */
  @JsonProperty("limit")
  Number limit;

  /**
   * Column by which to sort search results.
   */
  @JsonProperty("sortColumn")
  String sortColumn;

  /**
   * Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
   */
  @JsonProperty("sortOrder")
  String sortOrder;

  /**
   * If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
   */
  @JsonProperty("luceneSyntax")
  Boolean luceneSyntax;

  DocumentsSearchRequest(String type, Number documentFilterOrdinal, String ownerId, String rawQuery,
      Number offset, Number limit, String sortColumn, String sortOrder, Boolean luceneSyntax) {
    this.type = type;
    this.documentFilterOrdinal = documentFilterOrdinal;
    this.ownerId = ownerId;
    this.rawQuery = rawQuery;
    this.offset = offset;
    this.limit = limit;
    this.sortColumn = sortColumn;
    this.sortOrder = sortOrder;
    this.luceneSyntax = luceneSyntax;
  }

  /**
   * Get Search domain: documents, element type, parts, or &quot;all&quot;
   *
   * @return Search domain: documents, element type, parts, or &quot;all&quot;
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Document filter ID (e.g., MY_DOCS, ALL)
   *
   * @return Document filter ID (e.g., MY_DOCS, ALL)
   *
   */
  public final Number getDocumentFilterOrdinal() {
    return this.documentFilterOrdinal;
  }

  /**
   * Get Relevant for certain values of documentFilterOrdinal
   *
   * @return Relevant for certain values of documentFilterOrdinal
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
   *
   * @return name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
   *
   */
  public final String getRawQuery() {
    return this.rawQuery;
  }

  /**
   * Get Where to begin search results
   *
   * @return Where to begin search results
   *
   */
  public final Number getOffset() {
    return this.offset;
  }

  /**
   * Get Number of results to return per page (default and max is 20)
   *
   * @return Number of results to return per page (default and max is 20)
   *
   */
  public final Number getLimit() {
    return this.limit;
  }

  /**
   * Get Column by which to sort search results.
   *
   * @return Column by which to sort search results.
   *
   */
  public final String getSortColumn() {
    return this.sortColumn;
  }

  /**
   * Get Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
   *
   * @return Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
   *
   */
  public final String getSortOrder() {
    return this.sortOrder;
  }

  /**
   * Get If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
   *
   * @return If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
   *
   */
  public final Boolean getLuceneSyntax() {
    return this.luceneSyntax;
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
     * Search domain: documents, element type, parts, or &quot;all&quot;
     */
    private String type;

    /**
     * Document filter ID (e.g., MY_DOCS, ALL)
     */
    private Number documentFilterOrdinal;

    /**
     * Relevant for certain values of documentFilterOrdinal
     */
    private String ownerId;

    /**
     * name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
     */
    private String rawQuery;

    /**
     * Where to begin search results
     */
    private Number offset;

    /**
     * Number of results to return per page (default and max is 20)
     */
    private Number limit;

    /**
     * Column by which to sort search results.
     */
    private String sortColumn;

    /**
     * Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
     */
    private String sortOrder;

    /**
     * If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
     */
    private Boolean luceneSyntax;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Search domain: documents, element type, parts, or &quot;all&quot;
     *
     * @return Search domain: documents, element type, parts, or &quot;all&quot;
     *
     */
    public final String type() {
      return this.type;
    }

    /**
     * Set Search domain: documents, element type, parts, or &quot;all&quot;
     *
     * @param value Search domain: documents, element type, parts, or &quot;all&quot;
     *
     * @return the Builder object.
     */
    public final Builder type(String value) {
      this.type = value;
      return this;
    }

    /**
     * Get Document filter ID (e.g., MY_DOCS, ALL)
     *
     * @return Document filter ID (e.g., MY_DOCS, ALL)
     *
     */
    public final Number documentFilterOrdinal() {
      return this.documentFilterOrdinal;
    }

    /**
     * Set Document filter ID (e.g., MY_DOCS, ALL)
     *
     * @param value Document filter ID (e.g., MY_DOCS, ALL)
     *
     * @return the Builder object.
     */
    public final Builder documentFilterOrdinal(Number value) {
      this.documentFilterOrdinal = value;
      return this;
    }

    /**
     * Get Relevant for certain values of documentFilterOrdinal
     *
     * @return Relevant for certain values of documentFilterOrdinal
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set Relevant for certain values of documentFilterOrdinal
     *
     * @param value Relevant for certain values of documentFilterOrdinal
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
     *
     * @return name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
     *
     */
    public final String rawQuery() {
      return this.rawQuery;
    }

    /**
     * Set name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
     *
     * @param value name:value search terms (value may be a list, in quotes) If empty, equivalent to a &quot;wildcard&quot; search.
     *
     * @return the Builder object.
     */
    public final Builder rawQuery(String value) {
      this.rawQuery = value;
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
     * Get Number of results to return per page (default and max is 20)
     *
     * @return Number of results to return per page (default and max is 20)
     *
     */
    public final Number limit() {
      return this.limit;
    }

    /**
     * Set Number of results to return per page (default and max is 20)
     *
     * @param value Number of results to return per page (default and max is 20)
     *
     * @return the Builder object.
     */
    public final Builder limit(Number value) {
      this.limit = value;
      return this;
    }

    /**
     * Get Column by which to sort search results.
     *
     * @return Column by which to sort search results.
     *
     */
    public final String sortColumn() {
      return this.sortColumn;
    }

    /**
     * Set Column by which to sort search results.
     *
     * @param value Column by which to sort search results.
     *
     * @return the Builder object.
     */
    public final Builder sortColumn(String value) {
      this.sortColumn = value;
      return this;
    }

    /**
     * Get Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
     *
     * @return Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
     *
     */
    public final String sortOrder() {
      return this.sortOrder;
    }

    /**
     * Set Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
     *
     * @param value Sort order, which can be &#39;desc&#39; (descending) or &#39;asc&#39; (ascending)
     *
     * @return the Builder object.
     */
    public final Builder sortOrder(String value) {
      this.sortOrder = value;
      return this;
    }

    /**
     * Get If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
     *
     * @return If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
     *
     */
    public final Boolean luceneSyntax() {
      return this.luceneSyntax;
    }

    /**
     * Set If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
     *
     * @param value If set to true the &#39;rawQuery&#39; is considered as a query in Lucene format and passed to ElasticSearch w/o parsing.
     *
     * @return the Builder object.
     */
    public final Builder luceneSyntax(Boolean value) {
      this.luceneSyntax = value;
      return this;
    }

    private DocumentsSearchRequest build() {
      return new com.onshape.api.requests.DocumentsSearchRequest(type,documentFilterOrdinal,ownerId,rawQuery,offset,limit,sortColumn,sortOrder,luceneSyntax);
    }

    /**
     * Calls search method, Returns document search results
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsSearchResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/search", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.DocumentsSearchResponse.class);
    }
  }
}
