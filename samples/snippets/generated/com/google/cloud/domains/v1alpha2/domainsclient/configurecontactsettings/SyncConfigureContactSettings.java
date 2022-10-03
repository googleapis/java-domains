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

// [START domains_v1alpha2_generated_domainsclient_configurecontactsettings_sync]
import com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest;
import com.google.cloud.domains.v1alpha2.ContactNotice;
import com.google.cloud.domains.v1alpha2.ContactSettings;
import com.google.cloud.domains.v1alpha2.DomainsClient;
import com.google.cloud.domains.v1alpha2.Registration;
import com.google.cloud.domains.v1alpha2.RegistrationName;
import com.google.protobuf.FieldMask;
import java.util.ArrayList;

public class SyncConfigureContactSettings {

  public static void main(String[] args) throws Exception {
    syncConfigureContactSettings();
  }

  public static void syncConfigureContactSettings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      ConfigureContactSettingsRequest request =
          ConfigureContactSettingsRequest.newBuilder()
              .setRegistration(
                  RegistrationName.of("[PROJECT]", "[LOCATION]", "[REGISTRATION]").toString())
              .setContactSettings(ContactSettings.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .addAllContactNotices(new ArrayList<ContactNotice>())
              .setValidateOnly(true)
              .build();
      Registration response = domainsClient.configureContactSettingsAsync(request).get();
    }
  }
}
// [END domains_v1alpha2_generated_domainsclient_configurecontactsettings_sync]
