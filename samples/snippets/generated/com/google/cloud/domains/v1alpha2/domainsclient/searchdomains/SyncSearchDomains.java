/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.domains.v1alpha2.samples;

// [START domains_v1alpha2_generated_domainsclient_searchdomains_sync]
import com.google.cloud.domains.v1alpha2.DomainsClient;
import com.google.cloud.domains.v1alpha2.LocationName;
import com.google.cloud.domains.v1alpha2.SearchDomainsRequest;
import com.google.cloud.domains.v1alpha2.SearchDomainsResponse;

public class SyncSearchDomains {

  public static void main(String[] args) throws Exception {
    syncSearchDomains();
  }

  public static void syncSearchDomains() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      SearchDomainsRequest request =
          SearchDomainsRequest.newBuilder()
              .setQuery("query107944136")
              .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      SearchDomainsResponse response = domainsClient.searchDomains(request);
    }
  }
}
// [END domains_v1alpha2_generated_domainsclient_searchdomains_sync]
