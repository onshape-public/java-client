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
import com.onshape.api.responses.AppElementsUploadBlobSubelementResponse;
import com.onshape.api.types.Blob;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for uploadBlobSubelement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsUploadBlobSubelementRequest {
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
   * File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   */
  @JsonProperty("file")
  @NotNull
  Blob file;

  /**
   * Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
   */
  @JsonProperty("encodedFilename")
  String encodedFilename;

  /**
   * The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
   */
  @JsonProperty("fileContentLength")
  Number fileContentLength;

  AppElementsUploadBlobSubelementRequest(String transactionId, String parentChangeId,
      String description, Blob file, String encodedFilename, Number fileContentLength) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.description = description;
    this.file = file;
    this.encodedFilename = encodedFilename;
    this.fileContentLength = fileContentLength;
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
   * Get File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   *
   * @return File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   *
   */
  public final Blob getFile() {
    return this.file;
  }

  /**
   * Get Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
   *
   * @return Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
   *
   */
  public final String getEncodedFilename() {
    return this.encodedFilename;
  }

  /**
   * Get The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
   *
   * @return The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
   *
   */
  public final Number getFileContentLength() {
    return this.fileContentLength;
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
     * File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     */
    private Blob file;

    /**
     * Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     */
    private String encodedFilename;

    /**
     * The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     */
    private Number fileContentLength;

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
     * Get File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @return File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     */
    public final Blob file() {
      return this.file;
    }

    /**
     * Set File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @param value File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @return the Builder object.
     */
    public final Builder file(Blob value) {
      this.file = value;
      return this;
    }

    /**
     * Get Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     *
     * @return Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     *
     */
    public final String encodedFilename() {
      return this.encodedFilename;
    }

    /**
     * Set Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     *
     * @param value Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     *
     * @return the Builder object.
     */
    public final Builder encodedFilename(String value) {
      this.encodedFilename = value;
      return this;
    }

    /**
     * Get The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     *
     * @return The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     *
     */
    public final Number fileContentLength() {
      return this.fileContentLength;
    }

    /**
     * Set The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     *
     * @param value The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     *
     * @return the Builder object.
     */
    public final Builder fileContentLength(Number value) {
      this.fileContentLength = value;
      return this;
    }

    private AppElementsUploadBlobSubelementRequest build() {
      return new com.onshape.api.requests.AppElementsUploadBlobSubelementRequest(transactionId,parentChangeId,description,file,encodedFilename,fileContentLength);
    }

    /**
     * Calls uploadBlobSubelement method, Create a blob subelement in an app element from an uploaded file. The request body must have a
     *                 Content-Type of multipart/form-data. Request Body parameters are multipart fields.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param bid Blob subelement ID
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final AppElementsUploadBlobSubelementResponse call(String bid, String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/blob/:bid", build(), onshape.buildMap("bid", bid, "did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.AppElementsUploadBlobSubelementResponse.class);
    }

    /**
     * Calls uploadBlobSubelement method, Create a blob subelement in an app element from an uploaded file. The request body must have a
     *                 Content-Type of multipart/form-data. Request Body parameters are multipart fields.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param bid Blob subelement ID
     */
    public final AppElementsUploadBlobSubelementResponse call(OnshapeDocument document, String bid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/e/:eid/blob/:bid", build(), onshape.buildMap("bid", bid, "did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AppElementsUploadBlobSubelementResponse.class);
    }
  }
}
