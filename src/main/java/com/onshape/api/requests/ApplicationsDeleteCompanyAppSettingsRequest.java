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

import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.ApplicationsDeleteCompanyAppSettingsResponse;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for deleteCompanyAppSettings API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ApplicationsDeleteCompanyAppSettingsRequest {
  ApplicationsDeleteCompanyAppSettingsRequest() {
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
    Onshape onshape;

    Builder() {
    }

    private ApplicationsDeleteCompanyAppSettingsRequest build() {
      return new com.onshape.api.requests.ApplicationsDeleteCompanyAppSettingsRequest();
    }

    /**
     * Calls deleteCompanyAppSettings method, Delete a company's application settings. This API may only be used with an OAuth token and only
     *                 by the current user who is company admin of company provided in api path.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param cid Client ID
     *
     * @param cpid Company ID
     *
     * @param key Repeatable key for deletion. If no keys are specified, all keys are deleted. (Default: null) */
    public final ApplicationsDeleteCompanyAppSettingsResponse call(String cid, String cpid,
        String key) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/applications/clients/:cid/settings/companies/:cpid", build(), onshape.buildMap("cid", cid, "cpid", cpid), onshape.buildMap("key", key), com.onshape.api.responses.ApplicationsDeleteCompanyAppSettingsResponse.class);
    }
  }
}
