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
import com.onshape.api.responses.DocumentsFilterDocumentHistoryResponse;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * Request object for filterDocumentHistory API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsFilterDocumentHistoryRequest {
  /**
   * is current document id
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * is target user id
   */
  @JsonProperty("userId")
  @NotNull
  String userId;

  /**
   * is start date of the target date range
   */
  @JsonProperty("startDate")
  @NotNull
  Date startDate;

  /**
   * is end date of the target date
   */
  @JsonProperty("endDate")
  @NotNull
  Date endDate;

  /**
   * is list of element ids included for target filtered history
   */
  @JsonProperty("elementIds")
  @NotNull
  String[] elementIds;

  /**
   * is list of element types included for target filtered history
   */
  @JsonProperty("elementTypes")
  @NotNull
  Number[] elementTypes;

  /**
   * sorting option (by date is the default)
   */
  @JsonProperty("sortingStrategy")
  @NotNull
  Number sortingStrategy;

  /**
   * is edit description
   */
  @JsonProperty("editDescription")
  @NotNull
  String editDescription;

  DocumentsFilterDocumentHistoryRequest(String documentId, String userId, Date startDate,
      Date endDate, String[] elementIds, Number[] elementTypes, Number sortingStrategy,
      String editDescription) {
    this.documentId = documentId;
    this.userId = userId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.elementIds = elementIds;
    this.elementTypes = elementTypes;
    this.sortingStrategy = sortingStrategy;
    this.editDescription = editDescription;
  }

  /**
   * Get is current document id
   *
   * @return is current document id
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get is target user id
   *
   * @return is target user id
   *
   */
  public final String getUserId() {
    return this.userId;
  }

  /**
   * Get is start date of the target date range
   *
   * @return is start date of the target date range
   *
   */
  public final Date getStartDate() {
    return this.startDate;
  }

  /**
   * Get is end date of the target date
   *
   * @return is end date of the target date
   *
   */
  public final Date getEndDate() {
    return this.endDate;
  }

  /**
   * Get is list of element ids included for target filtered history
   *
   * @return is list of element ids included for target filtered history
   *
   */
  public final String[] getElementIds() {
    return this.elementIds;
  }

  /**
   * Get is list of element types included for target filtered history
   *
   * @return is list of element types included for target filtered history
   *
   */
  public final Number[] getElementTypes() {
    return this.elementTypes;
  }

  /**
   * Get sorting option (by date is the default)
   *
   * @return sorting option (by date is the default)
   *
   */
  public final Number getSortingStrategy() {
    return this.sortingStrategy;
  }

  /**
   * Get is edit description
   *
   * @return is edit description
   *
   */
  public final String getEditDescription() {
    return this.editDescription;
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
     * is current document id
     */
    private String documentId;

    /**
     * is target user id
     */
    private String userId;

    /**
     * is start date of the target date range
     */
    private Date startDate;

    /**
     * is end date of the target date
     */
    private Date endDate;

    /**
     * is list of element ids included for target filtered history
     */
    private String[] elementIds;

    /**
     * is list of element types included for target filtered history
     */
    private Number[] elementTypes;

    /**
     * sorting option (by date is the default)
     */
    private Number sortingStrategy;

    /**
     * is edit description
     */
    private String editDescription;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get is current document id
     *
     * @return is current document id
     *
     */
    public final String documentId() {
      return this.documentId;
    }

    /**
     * Set is current document id
     *
     * @param value is current document id
     *
     * @return the Builder object.
     */
    public final Builder documentId(String value) {
      this.documentId = value;
      return this;
    }

    /**
     * Get is target user id
     *
     * @return is target user id
     *
     */
    public final String userId() {
      return this.userId;
    }

    /**
     * Set is target user id
     *
     * @param value is target user id
     *
     * @return the Builder object.
     */
    public final Builder userId(String value) {
      this.userId = value;
      return this;
    }

    /**
     * Get is start date of the target date range
     *
     * @return is start date of the target date range
     *
     */
    public final Date startDate() {
      return this.startDate;
    }

    /**
     * Set is start date of the target date range
     *
     * @param value is start date of the target date range
     *
     * @return the Builder object.
     */
    public final Builder startDate(Date value) {
      this.startDate = value;
      return this;
    }

    /**
     * Get is end date of the target date
     *
     * @return is end date of the target date
     *
     */
    public final Date endDate() {
      return this.endDate;
    }

    /**
     * Set is end date of the target date
     *
     * @param value is end date of the target date
     *
     * @return the Builder object.
     */
    public final Builder endDate(Date value) {
      this.endDate = value;
      return this;
    }

    /**
     * Get is list of element ids included for target filtered history
     *
     * @return is list of element ids included for target filtered history
     *
     */
    public final String[] elementIds() {
      return this.elementIds;
    }

    /**
     * Set is list of element ids included for target filtered history
     *
     * @param value is list of element ids included for target filtered history
     *
     * @return the Builder object.
     */
    public final Builder elementIds(String[] value) {
      this.elementIds = value;
      return this;
    }

    /**
     * Get is list of element types included for target filtered history
     *
     * @return is list of element types included for target filtered history
     *
     */
    public final Number[] elementTypes() {
      return this.elementTypes;
    }

    /**
     * Set is list of element types included for target filtered history
     *
     * @param value is list of element types included for target filtered history
     *
     * @return the Builder object.
     */
    public final Builder elementTypes(Number[] value) {
      this.elementTypes = value;
      return this;
    }

    /**
     * Get sorting option (by date is the default)
     *
     * @return sorting option (by date is the default)
     *
     */
    public final Number sortingStrategy() {
      return this.sortingStrategy;
    }

    /**
     * Set sorting option (by date is the default)
     *
     * @param value sorting option (by date is the default)
     *
     * @return the Builder object.
     */
    public final Builder sortingStrategy(Number value) {
      this.sortingStrategy = value;
      return this;
    }

    /**
     * Get is edit description
     *
     * @return is edit description
     *
     */
    public final String editDescription() {
      return this.editDescription;
    }

    /**
     * Set is edit description
     *
     * @param value is edit description
     *
     * @return the Builder object.
     */
    public final Builder editDescription(String value) {
      this.editDescription = value;
      return this;
    }

    private DocumentsFilterDocumentHistoryRequest build() {
      return new com.onshape.api.requests.DocumentsFilterDocumentHistoryRequest(documentId,userId,startDate,endDate,elementIds,elementTypes,sortingStrategy,editDescription);
    }

    /**
     * Calls filterDocumentHistory method, filter document history
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsFilterDocumentHistoryResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/filter/history", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.DocumentsFilterDocumentHistoryResponse.class);
    }
  }
}
