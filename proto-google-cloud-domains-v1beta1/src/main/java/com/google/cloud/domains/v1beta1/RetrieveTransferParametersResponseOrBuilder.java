/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface RetrieveTransferParametersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   *
   * @return Whether the transferParameters field is set.
   */
  boolean hasTransferParameters();
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   *
   * @return The transferParameters.
   */
  com.google.cloud.domains.v1beta1.TransferParameters getTransferParameters();
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   */
  com.google.cloud.domains.v1beta1.TransferParametersOrBuilder getTransferParametersOrBuilder();
}
