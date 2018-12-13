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

import com.onshape.api.requests.CompaniesFindRequest;
import com.onshape.api.requests.CompaniesGetRequest;

/**
 * Companies: API endpoints for Companies group.
 * &copy; 2018 Onshape Inc.
 */
public final class Companies {
  final Onshape onshape;

  Companies(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for find
   *  @return Request builder object
   */
  public final CompaniesFindRequest.Builder find() {
    return CompaniesFindRequest.builder(onshape);
  }

  /**
   * Create request for get
   *  @return Request builder object
   */
  public final CompaniesGetRequest.Builder get() {
    return CompaniesGetRequest.builder(onshape);
  }
}
