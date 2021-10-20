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

import com.onshape.api.base.BaseClient;
import com.onshape.api.types.OnshapeVersion;

/**
 * Onshape API client class.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Onshape extends BaseClient {
  private final OnshapeVersion buildVersion = new OnshapeVersion("1.0", "860f36b32a5a25c11fbc5c1d5423be9e4a20e915", "1.137.27923.860f36b32a5a");

  /**
   * Access API methods for category Accounts
   *  @return API group object
   */
  public final Accounts accounts() {
    return new Accounts(this);
  }

  /**
   * Access API methods for category Aliases
   *  @return API group object
   */
  public final Aliases aliases() {
    return new Aliases(this);
  }

  /**
   * Access API methods for category AppAssociativeData
   *  @return API group object
   */
  public final AppAssociativeData appAssociativeData() {
    return new AppAssociativeData(this);
  }

  /**
   * Access API methods for category AppElements
   *  @return API group object
   */
  public final AppElements appElements() {
    return new AppElements(this);
  }

  /**
   * Access API methods for category ApplicationElements
   *  @return API group object
   */
  public final ApplicationElements applicationElements() {
    return new ApplicationElements(this);
  }

  /**
   * Access API methods for category Applications
   *  @return API group object
   */
  public final Applications applications() {
    return new Applications(this);
  }

  /**
   * Access API methods for category Assemblies
   *  @return API group object
   */
  public final Assemblies assemblies() {
    return new Assemblies(this);
  }

  /**
   * Access API methods for category Billing
   *  @return API group object
   */
  public final Billing billing() {
    return new Billing(this);
  }

  /**
   * Access API methods for category BlobElements
   *  @return API group object
   */
  public final BlobElements blobElements() {
    return new BlobElements(this);
  }

  /**
   * Access API methods for category Comments
   *  @return API group object
   */
  public final Comments comments() {
    return new Comments(this);
  }

  /**
   * Access API methods for category Companies
   *  @return API group object
   */
  public final Companies companies() {
    return new Companies(this);
  }

  /**
   * Access API methods for category Documents
   *  @return API group object
   */
  public final Documents documents() {
    return new Documents(this);
  }

  /**
   * Access API methods for category Drawings
   *  @return API group object
   */
  public final Drawings drawings() {
    return new Drawings(this);
  }

  /**
   * Access API methods for category Elements
   *  @return API group object
   */
  public final Elements elements() {
    return new Elements(this);
  }

  /**
   * Access API methods for category Endpoints
   *  @return API group object
   */
  public final Endpoints endpoints() {
    return new Endpoints(this);
  }

  /**
   * Access API methods for category ExportRules
   *  @return API group object
   */
  public final ExportRules exportRules() {
    return new ExportRules(this);
  }

  /**
   * Access API methods for category FeatureStudios
   *  @return API group object
   */
  public final FeatureStudios featureStudios() {
    return new FeatureStudios(this);
  }

  /**
   * Access API methods for category Folders
   *  @return API group object
   */
  public final Folders folders() {
    return new Folders(this);
  }

  /**
   * Access API methods for category Insertables
   *  @return API group object
   */
  public final Insertables insertables() {
    return new Insertables(this);
  }

  /**
   * Access API methods for category Metadata
   *  @return API group object
   */
  public final Metadata metadata() {
    return new Metadata(this);
  }

  /**
   * Access API methods for category MetadataCategory
   *  @return API group object
   */
  public final MetadataCategory metadataCategory() {
    return new MetadataCategory(this);
  }

  /**
   * Access API methods for category Models
   *  @return API group object
   */
  public final Models models() {
    return new Models(this);
  }

  /**
   * Access API methods for category PartStudios
   *  @return API group object
   */
  public final PartStudios partStudios() {
    return new PartStudios(this);
  }

  /**
   * Access API methods for category Parts
   *  @return API group object
   */
  public final Parts parts() {
    return new Parts(this);
  }

  /**
   * Access API methods for category Projects
   *  @return API group object
   */
  public final Projects projects() {
    return new Projects(this);
  }

  /**
   * Access API methods for category ReleaseManagement
   *  @return API group object
   */
  public final ReleaseManagement releaseManagement() {
    return new ReleaseManagement(this);
  }

  /**
   * Access API methods for category Revisions
   *  @return API group object
   */
  public final Revisions revisions() {
    return new Revisions(this);
  }

  /**
   * Access API methods for category Teams
   *  @return API group object
   */
  public final Teams teams() {
    return new Teams(this);
  }

  /**
   * Access API methods for category TestCustomWorkflows
   *  @return API group object
   */
  public final TestCustomWorkflows testCustomWorkflows() {
    return new TestCustomWorkflows(this);
  }

  /**
   * Access API methods for category Thumbnails
   *  @return API group object
   */
  public final Thumbnails thumbnails() {
    return new Thumbnails(this);
  }

  /**
   * Access API methods for category Translations
   *  @return API group object
   */
  public final Translations translations() {
    return new Translations(this);
  }

  /**
   * Access API methods for category Users
   *  @return API group object
   */
  public final Users users() {
    return new Users(this);
  }

  /**
   * Access API methods for category Versions
   *  @return API group object
   */
  public final Versions versions() {
    return new Versions(this);
  }

  /**
   * Access API methods for category Webhooks
   *  @return API group object
   */
  public final Webhooks webhooks() {
    return new Webhooks(this);
  }

  /**
   * Access API methods for category Workflow
   *  @return API group object
   */
  public final Workflow workflow() {
    return new Workflow(this);
  }

  /**
   * Get the Onshape build this API was created with.
   * @return Onshape build version
   */
  public final OnshapeVersion getBuildVersion() {
    return buildVersion;
  }
}
