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
import com.onshape.api.responses.BlobElementsUploadFileCreateElementResponse;
import com.onshape.api.types.Base64Encoded;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for uploadFileCreateElement API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class BlobElementsUploadFileCreateElementRequest {
  /**
   * If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
   */
  @JsonProperty("createDrawingIfPossible")
  Boolean createDrawingIfPossible;

  /**
   * File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   */
  @JsonProperty("file")
  @NotNull
  Base64Encoded file;

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

  /**
   * Whether the uploaded file should be translated to Onshape format, if possible
   */
  @JsonProperty("translate")
  @NotNull
  Boolean translate;

  /**
   * If true, remove assembly structure and create only a Part Studio
   */
  @JsonProperty("flattenAssemblies")
  @NotNull
  Boolean flattenAssemblies;

  /**
   * If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   */
  @JsonProperty("yAxisIsUp")
  @NotNull
  Boolean yAxisIsUp;

  /**
   * If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   */
  @JsonProperty("importInBackground")
  Boolean importInBackground;

  /**
   * If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   */
  @JsonProperty("allowFaultyParts")
  Boolean allowFaultyParts;

  /**
   * For internal use.
   */
  @JsonProperty("locationGroupId")
  String locationGroupId;

  /**
   * Id of an element to place the new element near.
   */
  @JsonProperty("locationElementId")
  String locationElementId;

  /**
   * An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
   */
  @JsonProperty("locationPosition")
  Number locationPosition;

  BlobElementsUploadFileCreateElementRequest(Boolean createDrawingIfPossible, Base64Encoded file,
      String encodedFilename, Number fileContentLength, Boolean translate,
      Boolean flattenAssemblies, Boolean yAxisIsUp, Boolean importInBackground,
      Boolean allowFaultyParts, String locationGroupId, String locationElementId,
      Number locationPosition) {
    this.createDrawingIfPossible = createDrawingIfPossible;
    this.file = file;
    this.encodedFilename = encodedFilename;
    this.fileContentLength = fileContentLength;
    this.translate = translate;
    this.flattenAssemblies = flattenAssemblies;
    this.yAxisIsUp = yAxisIsUp;
    this.importInBackground = importInBackground;
    this.allowFaultyParts = allowFaultyParts;
    this.locationGroupId = locationGroupId;
    this.locationElementId = locationElementId;
    this.locationPosition = locationPosition;
  }

  /**
   * Get If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
   *
   * @return If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
   *
   */
  public final Boolean getCreateDrawingIfPossible() {
    return this.createDrawingIfPossible;
  }

  /**
   * Get File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   *
   * @return File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
   *
   */
  public final Base64Encoded getFile() {
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

  /**
   * Get Whether the uploaded file should be translated to Onshape format, if possible
   *
   * @return Whether the uploaded file should be translated to Onshape format, if possible
   *
   */
  public final Boolean getTranslate() {
    return this.translate;
  }

  /**
   * Get If true, remove assembly structure and create only a Part Studio
   *
   * @return If true, remove assembly structure and create only a Part Studio
   *
   */
  public final Boolean getFlattenAssemblies() {
    return this.flattenAssemblies;
  }

  /**
   * Get If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   *
   * @return If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
   *
   */
  public final Boolean getYAxisIsUp() {
    return this.yAxisIsUp;
  }

  /**
   * Get If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   *
   * @return If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
   *
   */
  public final Boolean getImportInBackground() {
    return this.importInBackground;
  }

  /**
   * Get If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   *
   * @return If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
   *
   */
  public final Boolean getAllowFaultyParts() {
    return this.allowFaultyParts;
  }

  /**
   * Get For internal use.
   *
   * @return For internal use.
   *
   */
  public final String getLocationGroupId() {
    return this.locationGroupId;
  }

  /**
   * Get Id of an element to place the new element near.
   *
   * @return Id of an element to place the new element near.
   *
   */
  public final String getLocationElementId() {
    return this.locationElementId;
  }

  /**
   * Get An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
   *
   * @return An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
   *
   */
  public final Number getLocationPosition() {
    return this.locationPosition;
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
     * If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
     */
    private Boolean createDrawingIfPossible;

    /**
     * File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     */
    private Base64Encoded file;

    /**
     * Filename override interpreted as a URL-encoded string. If specified, this overrides the filename from a Content-Disposition in the file field.
     */
    private String encodedFilename;

    /**
     * The length of the file being uploaded, in bytes. If not present, Onshape may restrict the upload size under some operating conditions, as the file contents may need to be buffered in memory. If specified, it should be the actual length of the data being uploaded.
     */
    private Number fileContentLength;

    /**
     * Whether the uploaded file should be translated to Onshape format, if possible
     */
    private Boolean translate;

    /**
     * If true, remove assembly structure and create only a Part Studio
     */
    private Boolean flattenAssemblies;

    /**
     * If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     */
    private Boolean yAxisIsUp;

    /**
     * If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     */
    private Boolean importInBackground;

    /**
     * If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     */
    private Boolean allowFaultyParts;

    /**
     * For internal use.
     */
    private String locationGroupId;

    /**
     * Id of an element to place the new element near.
     */
    private String locationElementId;

    /**
     * An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     */
    private Number locationPosition;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
     *
     * @return If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
     *
     */
    public final Boolean createDrawingIfPossible() {
      return this.createDrawingIfPossible;
    }

    /**
     * Set If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
     *
     * @param value If true and the uploaded file is a DXF or a DWG, automatically create a Drawing element along with the Blob element. Otherwise, just create the Blob element.
     *
     * @return the Builder object.
     */
    public final Builder createDrawingIfPossible(Boolean value) {
      this.createDrawingIfPossible = value;
      return this;
    }

    /**
     * Get File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @return File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     */
    public final Base64Encoded file() {
      return this.file;
    }

    /**
     * Set File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @param value File data to upload. This field should normally have a Content-Disposition header field with a &quot;filename&quot; attribute, naming the uploaded file.
     *
     * @return the Builder object.
     */
    public final Builder file(Base64Encoded value) {
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

    /**
     * Get Whether the uploaded file should be translated to Onshape format, if possible
     *
     * @return Whether the uploaded file should be translated to Onshape format, if possible
     *
     */
    public final Boolean translate() {
      return this.translate;
    }

    /**
     * Set Whether the uploaded file should be translated to Onshape format, if possible
     *
     * @param value Whether the uploaded file should be translated to Onshape format, if possible
     *
     * @return the Builder object.
     */
    public final Builder translate(Boolean value) {
      this.translate = value;
      return this;
    }

    /**
     * Get If true, remove assembly structure and create only a Part Studio
     *
     * @return If true, remove assembly structure and create only a Part Studio
     *
     */
    public final Boolean flattenAssemblies() {
      return this.flattenAssemblies;
    }

    /**
     * Set If true, remove assembly structure and create only a Part Studio
     *
     * @param value If true, remove assembly structure and create only a Part Studio
     *
     * @return the Builder object.
     */
    public final Builder flattenAssemblies(Boolean value) {
      this.flattenAssemblies = value;
      return this;
    }

    /**
     * Get If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @return If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     */
    public final Boolean yAxisIsUp() {
      return this.yAxisIsUp;
    }

    /**
     * Set If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @param value If true, treat the model&#39;s Y axis as the vertical axis. Otherwise, Z is treated as the vertical axis.
     *
     * @return the Builder object.
     */
    public final Builder yAxisIsUp(Boolean value) {
      this.yAxisIsUp = value;
      return this;
    }

    /**
     * Get If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @return If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     */
    public final Boolean importInBackground() {
      return this.importInBackground;
    }

    /**
     * Set If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @param value If storeInDocument is true and formatName is ONSHAPE and the source is a Parasolid file, this specifies the preference as to whether the import should be completed prior to the completion of the request (importInBackground=false) or whether it should be performed asynchronously (importInBackground=true). Historically, this parameter was implicitly set to false, but large imports can take long enough that the request could result in a timeout. Applications are encouraged to set this parameter to true for reliable operation.
     *
     * @return the Builder object.
     */
    public final Builder importInBackground(Boolean value) {
      this.importInBackground = value;
      return this;
    }

    /**
     * Get If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @return If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     */
    public final Boolean allowFaultyParts() {
      return this.allowFaultyParts;
    }

    /**
     * Set If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @param value If not specified or if specified as false, bodies to be imported are examined for validity and any found to be faulty are removed from the import. If all bodies are found to be faulty, the import fails. If the value is specified as true, we attempt to import the bodies that appear to have faults.
     *
     * @return the Builder object.
     */
    public final Builder allowFaultyParts(Boolean value) {
      this.allowFaultyParts = value;
      return this;
    }

    /**
     * Get For internal use.
     *
     * @return For internal use.
     *
     */
    public final String locationGroupId() {
      return this.locationGroupId;
    }

    /**
     * Set For internal use.
     *
     * @param value For internal use.
     *
     * @return the Builder object.
     */
    public final Builder locationGroupId(String value) {
      this.locationGroupId = value;
      return this;
    }

    /**
     * Get Id of an element to place the new element near.
     *
     * @return Id of an element to place the new element near.
     *
     */
    public final String locationElementId() {
      return this.locationElementId;
    }

    /**
     * Set Id of an element to place the new element near.
     *
     * @param value Id of an element to place the new element near.
     *
     * @return the Builder object.
     */
    public final Builder locationElementId(String value) {
      this.locationElementId = value;
      return this;
    }

    /**
     * Get An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @return An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     */
    public final Number locationPosition() {
      return this.locationPosition;
    }

    /**
     * Set An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @param value An indicator for the relative placement of the new element. If locationElementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the group or element list and a non-negative number indicates insertion at the start of the group or elmenet list.
     *
     * @return the Builder object.
     */
    public final Builder locationPosition(Number value) {
      this.locationPosition = value;
      return this;
    }

    private BlobElementsUploadFileCreateElementRequest build() {
      return new com.onshape.api.requests.BlobElementsUploadFileCreateElementRequest(createDrawingIfPossible,file,encodedFilename,fileContentLength,translate,flattenAssemblies,yAxisIsUp,importInBackground,allowFaultyParts,locationGroupId,locationElementId,locationPosition);
    }

    /**
     * Calls uploadFileCreateElement method, Create a blob element from an uploaded file. The request body must have a Content-Type of
     *                 multipart/form-data. Request Body parameters are multipart fields.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final BlobElementsUploadFileCreateElementResponse call(String did, String wid) throws
        OnshapeException {
      return onshape.call("post", "/blobelements/d/:did/w/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.BlobElementsUploadFileCreateElementResponse.class);
    }

    /**
     * Calls uploadFileCreateElement method, Create a blob element from an uploaded file. The request body must have a Content-Type of
     *                 multipart/form-data. Request Body parameters are multipart fields.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final BlobElementsUploadFileCreateElementResponse call(OnshapeDocument document,
        String wid) throws OnshapeException {
      return onshape.call("post", "/blobelements/d/:did/w/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid), onshape.buildMap(), com.onshape.api.responses.BlobElementsUploadFileCreateElementResponse.class);
    }
  }
}
