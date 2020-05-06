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
package com.onshape.api;

import com.onshape.api.requests.AliasesCreateAliasRequest;
import com.onshape.api.requests.AliasesDeleteAliasRequest;
import com.onshape.api.requests.AliasesGetAliasRequest;
import com.onshape.api.requests.AliasesGetAliasesInCompanyRequest;
import com.onshape.api.requests.AliasesUpdateAliasRequest;

/**
 * Aliases: API endpoints for Aliases group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Aliases {
  final Onshape onshape;

  Aliases(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for createAlias
   *  @return Request builder object
   */
  public final AliasesCreateAliasRequest.Builder createAlias() {
    return AliasesCreateAliasRequest.builder(onshape);
  }

  /**
   * Create request for deleteAlias
   *  @return Request builder object
   */
  public final AliasesDeleteAliasRequest.Builder deleteAlias() {
    return AliasesDeleteAliasRequest.builder(onshape);
  }

  /**
   * Create request for getAlias
   *  @return Request builder object
   */
  public final AliasesGetAliasRequest.Builder getAlias() {
    return AliasesGetAliasRequest.builder(onshape);
  }

  /**
   * Create request for getAliasesInCompany
   *  @return Request builder object
   */
  public final AliasesGetAliasesInCompanyRequest.Builder getAliasesInCompany() {
    return AliasesGetAliasesInCompanyRequest.builder(onshape);
  }

  /**
   * Create request for updateAlias
   *  @return Request builder object
   */
  public final AliasesUpdateAliasRequest.Builder updateAlias() {
    return AliasesUpdateAliasRequest.builder(onshape);
  }
}
