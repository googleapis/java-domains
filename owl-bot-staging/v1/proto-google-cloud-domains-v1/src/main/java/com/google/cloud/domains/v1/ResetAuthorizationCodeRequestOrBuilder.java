// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1/domains.proto

package com.google.cloud.domains.v1;

public interface ResetAuthorizationCodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1.ResetAuthorizationCodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `Registration` whose authorization code is being reset,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The registration.
   */
  java.lang.String getRegistration();
  /**
   * <pre>
   * Required. The name of the `Registration` whose authorization code is being reset,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for registration.
   */
  com.google.protobuf.ByteString
      getRegistrationBytes();
}
