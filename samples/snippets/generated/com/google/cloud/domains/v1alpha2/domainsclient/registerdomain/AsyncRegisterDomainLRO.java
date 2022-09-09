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

// [START domains_v1alpha2_generated_domainsclient_registerdomain_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.domains.v1alpha2.ContactNotice;
import com.google.cloud.domains.v1alpha2.DomainNotice;
import com.google.cloud.domains.v1alpha2.DomainsClient;
import com.google.cloud.domains.v1alpha2.LocationName;
import com.google.cloud.domains.v1alpha2.OperationMetadata;
import com.google.cloud.domains.v1alpha2.RegisterDomainRequest;
import com.google.cloud.domains.v1alpha2.Registration;
import com.google.type.Money;
import java.util.ArrayList;

public class AsyncRegisterDomainLRO {

  public static void main(String[] args) throws Exception {
    asyncRegisterDomainLRO();
  }

  public static void asyncRegisterDomainLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      RegisterDomainRequest request =
          RegisterDomainRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setRegistration(Registration.newBuilder().build())
              .addAllDomainNotices(new ArrayList<DomainNotice>())
              .addAllContactNotices(new ArrayList<ContactNotice>())
              .setYearlyPrice(Money.newBuilder().build())
              .setValidateOnly(true)
              .build();
      OperationFuture<Registration, OperationMetadata> future =
          domainsClient.registerDomainOperationCallable().futureCall(request);
      // Do something.
      Registration response = future.get();
    }
  }
}
// [END domains_v1alpha2_generated_domainsclient_registerdomain_lro_async]
