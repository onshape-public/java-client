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
import com.onshape.api.responses.AssembliesGetShadedViewsResponse;
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
public final class AssembliesGetShadedViewsRequest {
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
   * Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
   */
  @JsonProperty("showAllParts")
  Boolean showAllParts;

  /**
   * Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
   */
  @JsonProperty("includeSurfaces")
  Boolean includeSurfaces;

  /**
   * If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
   */
  @JsonProperty("useAntiAliasing")
  Boolean useAntiAliasing;

  /**
   * 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
   */
  @JsonProperty("viewMatrix")
  String viewMatrix;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AssembliesGetShadedViewsRequest(Number outputHeight, Number outputWidth, Number pixelSize,
      String edges, Boolean showAllParts, Boolean includeSurfaces, Boolean useAntiAliasing,
      String viewMatrix, String linkDocumentId) {
    this.outputHeight = outputHeight;
    this.outputWidth = outputWidth;
    this.pixelSize = pixelSize;
    this.edges = edges;
    this.showAllParts = showAllParts;
    this.includeSurfaces = includeSurfaces;
    this.useAntiAliasing = useAntiAliasing;
    this.viewMatrix = viewMatrix;
    this.linkDocumentId = linkDocumentId;
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
     * Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
     */
    private Boolean showAllParts;

    /**
     * Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
     */
    private Boolean includeSurfaces;

    /**
     * If true, an anti-aliasing factor will be used to smooth model boundaries in the final image result. If false, the image will be rasterized at the given resolution. Setting to true can have negative performance implications with respect to rendering time and memory usage. If a high-resolution image is requested and anti-aliasing is turned on, the server may not be able to fulfill the request.
     */
    private Boolean useAntiAliasing;

    /**
     * 12-number view matrix (comma-separated), or one of the following named views: top, bottom, front, back, left, right The 12 entries in the view matrix form three rows and four columns, which is a linear transformation applied to the model itself. The matrix&#39;s first three columns maps the coordinate axes of the model to the coordinate axes of the view, and the fourth column translates the origin (in meters). The view coordinates have x pointing right, y pointing up, and z pointing towards the viewer, while a front view of the model has x pointing right, y pointing away from the viewer, and z pointing up. For example, the identity matrix viewMatrix=1,0,0,0,0,1,0,0,0,0,1,0 corresponds to the top view, and viewMatrix=0.612,0.612,0,0,-0.354,0.354,0.707,0,0.707,-0.707,0.707,0 corresponds (approximately) to the isometric view. The first three columns of the view matrix should be orthonormal and have a positive determinant. If this is not the case, view behavior may be undefined.
     */
    private String viewMatrix;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

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
     * Get Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
     *
     * @return Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
     *
     */
    public final Boolean showAllParts() {
      return this.showAllParts;
    }

    /**
     * Set Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
     *
     * @param value Whether or not all parts should be shown in the element, regardless of user setting. If false, the visibility setting made by the user will be reflected in the image. If true, all parts will be shown.
     *
     * @return the Builder object.
     */
    public final Builder showAllParts(Boolean value) {
      this.showAllParts = value;
      return this;
    }

    /**
     * Get Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
     *
     * @return Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
     *
     */
    public final Boolean includeSurfaces() {
      return this.includeSurfaces;
    }

    /**
     * Set Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
     *
     * @param value Whether or not surfaces should be shown in the element. If false, surfaces will be excluded. If true, all surfaces will be shown.
     *
     * @return the Builder object.
     */
    public final Builder includeSurfaces(Boolean value) {
      this.includeSurfaces = value;
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

    private AssembliesGetShadedViewsRequest build() {
      return new com.onshape.api.requests.AssembliesGetShadedViewsRequest(outputHeight,outputWidth,pixelSize,edges,showAllParts,includeSurfaces,useAntiAliasing,viewMatrix,linkDocumentId);
    }

    /**
     * Calls getShadedViews method, Get a shaded image rendering of an Assembly
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
     */
    public final AssembliesGetShadedViewsResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/shadedviews", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("outputHeight", outputHeight, "outputWidth", outputWidth, "pixelSize", pixelSize, "edges", edges, "showAllParts", showAllParts, "includeSurfaces", includeSurfaces, "useAntiAliasing", useAntiAliasing, "viewMatrix", viewMatrix, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AssembliesGetShadedViewsResponse.class);
    }

    /**
     * Calls getShadedViews method, Get a shaded image rendering of an Assembly
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AssembliesGetShadedViewsResponse call(OnshapeDocument document) throws
        OnshapeException {
      return onshape.call("get", "/assemblies/d/:did/[wvm]/:wvm/e/:eid/shadedviews", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", WVM.Workspace, "wvm", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.AssembliesGetShadedViewsResponse.class);
    }
  }
}
