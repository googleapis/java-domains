// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1/domains.proto

package com.google.cloud.domains.v1;

public interface TransferDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1.TransferDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource of the `Registration`. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource of the `Registration`. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * You can leave `registration.dns_settings` unset to import the
   * domain's current DNS configuration from its current registrar. Use this
   * option only if you are sure that the domain's current DNS service
   * does not cease upon transfer, as is often the case for DNS services
   * provided for free by the registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the registration field is set.
   */
  boolean hasRegistration();
  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * You can leave `registration.dns_settings` unset to import the
   * domain's current DNS configuration from its current registrar. Use this
   * option only if you are sure that the domain's current DNS service
   * does not cease upon transfer, as is often the case for DNS services
   * provided for free by the registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The registration.
   */
  com.google.cloud.domains.v1.Registration getRegistration();
  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * You can leave `registration.dns_settings` unset to import the
   * domain's current DNS configuration from its current registrar. Use this
   * option only if you are sure that the domain's current DNS service
   * does not cease upon transfer, as is often the case for DNS services
   * provided for free by the registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.domains.v1.RegistrationOrBuilder getRegistrationOrBuilder();

  /**
   * <pre>
   * The list of contact notices that you acknowledge. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1.ContactNotice contact_notices = 3;</code>
   * @return A list containing the contactNotices.
   */
  java.util.List<com.google.cloud.domains.v1.ContactNotice> getContactNoticesList();
  /**
   * <pre>
   * The list of contact notices that you acknowledge. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1.ContactNotice contact_notices = 3;</code>
   * @return The count of contactNotices.
   */
  int getContactNoticesCount();
  /**
   * <pre>
   * The list of contact notices that you acknowledge. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1.ContactNotice contact_notices = 3;</code>
   * @param index The index of the element to return.
   * @return The contactNotices at the given index.
   */
  com.google.cloud.domains.v1.ContactNotice getContactNotices(int index);
  /**
   * <pre>
   * The list of contact notices that you acknowledge. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1.ContactNotice contact_notices = 3;</code>
   * @return A list containing the enum numeric values on the wire for contactNotices.
   */
  java.util.List<java.lang.Integer>
  getContactNoticesValueList();
  /**
   * <pre>
   * The list of contact notices that you acknowledge. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1.ContactNotice contact_notices = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of contactNotices at the given index.
   */
  int getContactNoticesValue(int index);

  /**
   * <pre>
   * Required. Acknowledgement of the price to transfer or renew the domain for one year.
   * Call `RetrieveTransferParameters` to obtain the price, which you must
   * acknowledge.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the yearlyPrice field is set.
   */
  boolean hasYearlyPrice();
  /**
   * <pre>
   * Required. Acknowledgement of the price to transfer or renew the domain for one year.
   * Call `RetrieveTransferParameters` to obtain the price, which you must
   * acknowledge.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The yearlyPrice.
   */
  com.google.type.Money getYearlyPrice();
  /**
   * <pre>
   * Required. Acknowledgement of the price to transfer or renew the domain for one year.
   * Call `RetrieveTransferParameters` to obtain the price, which you must
   * acknowledge.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.MoneyOrBuilder getYearlyPriceOrBuilder();

  /**
   * <pre>
   * The domain's transfer authorization code. You can obtain this from the
   * domain's current registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.AuthorizationCode authorization_code = 5;</code>
   * @return Whether the authorizationCode field is set.
   */
  boolean hasAuthorizationCode();
  /**
   * <pre>
   * The domain's transfer authorization code. You can obtain this from the
   * domain's current registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.AuthorizationCode authorization_code = 5;</code>
   * @return The authorizationCode.
   */
  com.google.cloud.domains.v1.AuthorizationCode getAuthorizationCode();
  /**
   * <pre>
   * The domain's transfer authorization code. You can obtain this from the
   * domain's current registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.AuthorizationCode authorization_code = 5;</code>
   */
  com.google.cloud.domains.v1.AuthorizationCodeOrBuilder getAuthorizationCodeOrBuilder();

  /**
   * <pre>
   * Validate the request without actually transferring the domain.
   * </pre>
   *
   * <code>bool validate_only = 6;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
