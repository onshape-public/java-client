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
import com.onshape.api.responses.PartsGetShadedViewsResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getShadedViews API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartsGetShadedViewsRequest {
  /**
   * Output image height (in pixels)
   */
  @JsonProperty("outputHeight")
  Number outputHeight;

  /**
   * Output image width (in pixels)
   */
  @JsonProperty("outputWidth")
  Number outputWidth;

  /**
   * Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
   */
  @JsonProperty("pixelSize")
  Number pixelSize;

  /**
   * The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
   */
  @JsonProperty("edges")
  String edges;

  /**
   * If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
   */
  @JsonProperty("useAntiAliasing")
  Boolean useAntiAliasing;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  /**
   * 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
   */
  @JsonProperty("viewMatrix")
  String viewMatrix;

  PartsGetShadedViewsRequest(Number outputHeight, Number outputWidth, Number pixelSize,
      String edges, Boolean useAntiAliasing, String linkDocumentId, String configuration,
      String viewMatrix) {
    this.outputHeight = outputHeight;
    this.outputWidth = outputWidth;
    this.pixelSize = pixelSize;
    this.edges = edges;
    this.useAntiAliasing = useAntiAliasing;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
    this.viewMatrix = viewMatrix;
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
     * Output image height (in pixels)
     */
    private Number outputHeight;

    /**
     * Output image width (in pixels)
     */
    private Number outputWidth;

    /**
     * Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
     */
    private Number pixelSize;

    /**
     * The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
     */
    private String edges;

    /**
     * If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     */
    private Boolean useAntiAliasing;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    /**
     * 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     */
    private String viewMatrix;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Output image height (in pixels)
     *
     * @return Output image height (in pixels)
     *
     */
    public final Number outputHeight() {
      return this.outputHeight;
    }

    /**
     * Set Output image height (in pixels)
     *
     * @param value Output image height (in pixels)
     *
     * @return the Builder object.
     */
    public final Builder outputHeight(Number value) {
      this.outputHeight = value;
      return this;
    }

    /**
     * Get Output image width (in pixels)
     *
     * @return Output image width (in pixels)
     *
     */
    public final Number outputWidth() {
      return this.outputWidth;
    }

    /**
     * Set Output image width (in pixels)
     *
     * @param value Output image width (in pixels)
     *
     * @return the Builder object.
     */
    public final Builder outputWidth(Number value) {
      this.outputWidth = value;
      return this;
    }

    /**
     * Get Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
     *
     * @return Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
     *
     */
    public final Number pixelSize() {
      return this.pixelSize;
    }

    /**
     * Set Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
     *
     * @param value Height and width represented by each pixel (in meters). If the value is 0, the display will be sized to fit the output image dimensions.
     *
     * @return the Builder object.
     */
    public final Builder pixelSize(Number value) {
      this.pixelSize = value;
      return this;
    }

    /**
     * Get The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
     *
     * @return The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
     *
     */
    public final String edges() {
      return this.edges;
    }

    /**
     * Set The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
     *
     * @param value The treatment to be applied to edges in the display. Options are show: show visible edges, hide: hide visible edges
     *
     * @return the Builder object.
     */
    public final Builder edges(String value) {
      this.edges = value;
      return this;
    }

    /**
     * Get If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     *
     * @return If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     *
     */
    public final Boolean useAntiAliasing() {
      return this.useAntiAliasing;
    }

    /**
     * Set If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     *
     * @param value If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     *
     * @return the Builder object.
     */
    public final Builder useAntiAliasing(Boolean value) {
      this.useAntiAliasing = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     *
     * @return 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     *
     */
    public final String viewMatrix() {
      return this.viewMatrix;
    }

    /**
     * Set 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     *
     * @param value 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     *
     * @return the Builder object.
     */
    public final Builder viewMatrix(String value) {
      this.viewMatrix = value;
      return this;
    }

    private PartsGetShadedViewsRequest build() {
      return new com.onshape.api.requests.PartsGetShadedViewsRequest(outputHeight,outputWidth,pixelSize,edges,useAntiAliasing,linkDocumentId,configuration,viewMatrix);
    }

    /**
     * Calls getShadedViews method, Get a shaded image rendering of a part
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     *
     * @param partid Part ID
     */
    public final PartsGetShadedViewsResponse call(String did, WVM wvmType, String wvm, String eid,
        String partid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/shadedviews", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid, "partid", partid), onshape.buildMap("outputHeight", outputHeight, "outputWidth", outputWidth, "pixelSize", pixelSize, "edges", edges, "useAntiAliasing", useAntiAliasing, "linkDocumentId", linkDocumentId, "configuration", configuration, "viewMatrix", viewMatrix), com.onshape.api.responses.PartsGetShadedViewsResponse.class);
    }

    /**
     * Calls getShadedViews method, Get a shaded image rendering of a part
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param partid Part ID
     */
    public final PartsGetShadedViewsResponse call(OnshapeDocument document, String partid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid/partid/:partid/shadedviews", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId(), "partid", partid), onshape.buildMap(), com.onshape.api.responses.PartsGetShadedViewsResponse.class);
    }
  }
}
