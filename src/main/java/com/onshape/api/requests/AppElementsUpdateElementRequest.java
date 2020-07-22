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
import com.onshape.api.responses.AppElementsUpdateElementResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.validation.constraints.NotNull;

/**
 * Request object for updateElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsUpdateElementRequest {
  /**
   * Id of transaction in which the update should be performed
   */
  @JsonProperty("transactionId")
  @NotNull
  String transactionId;

  /**
   * Id of the last change made by this application to this element
   */
  @JsonProperty("parentChangeId")
  @NotNull
  String parentChangeId;

  /**
   * Description of the change being made, for history tracking
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * List of changes to make to the application element
   */
  @JsonProperty("changes")
  @NotNull
  AppElementsUpdateElementRequestChanges[] changes;

  /**
   * A change to the JSON tree encoded as a BTJEdit
   */
  @JsonProperty("jsonTreeEdit")
  @NotNull
  Map jsonTreeEdit;

  AppElementsUpdateElementRequest(String transactionId, String parentChangeId, String description,
      AppElementsUpdateElementRequestChanges[] changes, Map jsonTreeEdit) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.description = description;
    this.changes = changes;
    this.jsonTreeEdit = jsonTreeEdit;
  }

  /**
   * Get Id of transaction in which the update should be performed
   *
   * @return Id of transaction in which the update should be performed
   *
   */
  public final String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Get Id of the last change made by this application to this element
   *
   * @return Id of the last change made by this application to this element
   *
   */
  public final String getParentChangeId() {
    return this.parentChangeId;
  }

  /**
   * Get Description of the change being made, for history tracking
   *
   * @return Description of the change being made, for history tracking
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get List of changes to make to the application element
   *
   * @return List of changes to make to the application element
   *
   */
  public final AppElementsUpdateElementRequestChanges[] getChanges() {
    return this.changes;
  }

  /**
   * Get A change to the JSON tree encoded as a BTJEdit
   *
   * @return A change to the JSON tree encoded as a BTJEdit
   *
   */
  public final Map getJsonTreeEdit() {
    return this.jsonTreeEdit;
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
     * Id of transaction in which the update should be performed
     */
    private String transactionId;

    /**
     * Id of the last change made by this application to this element
     */
    private String parentChangeId;

    /**
     * Description of the change being made, for history tracking
     */
    private String description;

    /**
     * List of changes to make to the application element
     */
    private AppElementsUpdateElementRequestChanges[] changes;

    /**
     * A change to the JSON tree encoded as a BTJEdit
     */
    private Map jsonTreeEdit;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of transaction in which the update should be performed
     *
     * @return Id of transaction in which the update should be performed
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of transaction in which the update should be performed
     *
     * @param value Id of transaction in which the update should be performed
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Id of the last change made by this application to this element
     *
     * @return Id of the last change made by this application to this element
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set Id of the last change made by this application to this element
     *
     * @param value Id of the last change made by this application to this element
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get Description of the change being made, for history tracking
     *
     * @return Description of the change being made, for history tracking
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set Description of the change being made, for history tracking
     *
     * @param value Description of the change being made, for history tracking
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get List of changes to make to the application element
     *
     * @return List of changes to make to the application element
     *
     */
    public final AppElementsUpdateElementRequestChanges[] changes() {
      return this.changes;
    }

    /**
     * Set List of changes to make to the application element
     *
     * @param value List of changes to make to the application element
     *
     * @return the Builder object.
     */
    public final Builder changes(AppElementsUpdateElementRequestChanges[] value) {
      this.changes = value;
      return this;
    }

    /**
     * Get A change to the JSON tree encoded as a BTJEdit
     *
     * @return A change to the JSON tree encoded as a BTJEdit
     *
     */
    public final Map jsonTreeEdit() {
      return this.jsonTreeEdit;
    }

    /**
     * Set A change to the JSON tree encoded as a BTJEdit
     *
     * @param value A change to the JSON tree encoded as a BTJEdit
     *
     * @return the Builder object.
     */
    public final Builder jsonTreeEdit(Map value) {
      this.jsonTreeEdit = value;
      return this;
    }

    private AppElementsUpdateElementRequest build() {
      return new com.onshape.api.requests.AppElementsUpdateElementRequest(transactionId,parentChangeId,description,changes,jsonTreeEdit);
    }

    /**
     * Calls updateElement method, Update an app element
     *                 <p>
     *                 The BTJEdit encoding is as follows:
     *                 <p>
     *                 An edit is one of
     *                 <p>
     *                 * Deletion: { 'btType' : 'BTJEditDelete-1992', 'path' : path }
     *                 <p>
     *                 * Insertion: { 'btType' : 'BTJEditInsert-2523', 'path' : path, 'value' : newValue }
     *                 <p>
     *                 * Change: { 'btType' : 'BTJEditChange-2636', 'path' : path, 'value' : newValue }
     *                 <p>
     *                 * Move: { 'btType' : 'BTJEditMove-3245', 'sourcePath' : path, 'destinationPath' : path }
     *                 <p>
     *                 * List: { 'btType' : 'BTJEditList-2707', 'edits' : [ edit1, edit2, ...] }
     *                 <p>
     *                 Where edit1, edit2, etc. are zero or more edits, newValue is any JSON, and path is:
     *                 <p>
     *                 { 'btType' : 'BTJPath-3073', 'startNode' : startNode, 'path' : [ pathElement1, pathElement2, ...]
     *                 }
     *                 <p>
     *                 where startNode is a string that is either empty or a nodeId of a node in the tree and
     *                 pathElement is one of:
     *                 <p>
     *                 * Key: { 'btType' : 'BTJPathKey-3221', 'key' : string }
     *                 <p>
     *                 * Index: { 'btType' : 'BTJPathIndex-1871', 'index' : integer }
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppElementsUpdateElementResponse call(String did, String wid, String eid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/content", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppElementsUpdateElementResponse.class);
    }

    /**
     * Calls updateElement method, Update an app element
     *                 <p>
     *                 The BTJEdit encoding is as follows:
     *                 <p>
     *                 An edit is one of
     *                 <p>
     *                 * Deletion: { 'btType' : 'BTJEditDelete-1992', 'path' : path }
     *                 <p>
     *                 * Insertion: { 'btType' : 'BTJEditInsert-2523', 'path' : path, 'value' : newValue }
     *                 <p>
     *                 * Change: { 'btType' : 'BTJEditChange-2636', 'path' : path, 'value' : newValue }
     *                 <p>
     *                 * Move: { 'btType' : 'BTJEditMove-3245', 'sourcePath' : path, 'destinationPath' : path }
     *                 <p>
     *                 * List: { 'btType' : 'BTJEditList-2707', 'edits' : [ edit1, edit2, ...] }
     *                 <p>
     *                 Where edit1, edit2, etc. are zero or more edits, newValue is any JSON, and path is:
     *                 <p>
     *                 { 'btType' : 'BTJPath-3073', 'startNode' : startNode, 'path' : [ pathElement1, pathElement2, ...]
     *                 }
     *                 <p>
     *                 where startNode is a string that is either empty or a nodeId of a node in the tree and
     *                 pathElement is one of:
     *                 <p>
     *                 * Key: { 'btType' : 'BTJPathKey-3221', 'key' : string }
     *                 <p>
     *                 * Index: { 'btType' : 'BTJPathIndex-1871', 'index' : integer }
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsUpdateElementResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/content", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppElementsUpdateElementResponse.class);
    }
  }
}
