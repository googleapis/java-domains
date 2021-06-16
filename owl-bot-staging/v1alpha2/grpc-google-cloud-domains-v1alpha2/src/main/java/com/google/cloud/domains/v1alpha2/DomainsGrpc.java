package com.google.cloud.domains.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Cloud Domains API enables management and configuration of domain names.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/domains/v1alpha2/domains.proto")
public final class DomainsGrpc {

  private DomainsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.domains.v1alpha2.Domains";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.SearchDomainsRequest,
      com.google.cloud.domains.v1alpha2.SearchDomainsResponse> getSearchDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchDomains",
      requestType = com.google.cloud.domains.v1alpha2.SearchDomainsRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.SearchDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.SearchDomainsRequest,
      com.google.cloud.domains.v1alpha2.SearchDomainsResponse> getSearchDomainsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.SearchDomainsRequest, com.google.cloud.domains.v1alpha2.SearchDomainsResponse> getSearchDomainsMethod;
    if ((getSearchDomainsMethod = DomainsGrpc.getSearchDomainsMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getSearchDomainsMethod = DomainsGrpc.getSearchDomainsMethod) == null) {
          DomainsGrpc.getSearchDomainsMethod = getSearchDomainsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.SearchDomainsRequest, com.google.cloud.domains.v1alpha2.SearchDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.SearchDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.SearchDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("SearchDomains"))
              .build();
        }
      }
    }
    return getSearchDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest,
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> getRetrieveRegisterParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveRegisterParameters",
      requestType = com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest,
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> getRetrieveRegisterParametersMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest, com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> getRetrieveRegisterParametersMethod;
    if ((getRetrieveRegisterParametersMethod = DomainsGrpc.getRetrieveRegisterParametersMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getRetrieveRegisterParametersMethod = DomainsGrpc.getRetrieveRegisterParametersMethod) == null) {
          DomainsGrpc.getRetrieveRegisterParametersMethod = getRetrieveRegisterParametersMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest, com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveRegisterParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("RetrieveRegisterParameters"))
              .build();
        }
      }
    }
    return getRetrieveRegisterParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RegisterDomainRequest,
      com.google.longrunning.Operation> getRegisterDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDomain",
      requestType = com.google.cloud.domains.v1alpha2.RegisterDomainRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RegisterDomainRequest,
      com.google.longrunning.Operation> getRegisterDomainMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RegisterDomainRequest, com.google.longrunning.Operation> getRegisterDomainMethod;
    if ((getRegisterDomainMethod = DomainsGrpc.getRegisterDomainMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getRegisterDomainMethod = DomainsGrpc.getRegisterDomainMethod) == null) {
          DomainsGrpc.getRegisterDomainMethod = getRegisterDomainMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.RegisterDomainRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.RegisterDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("RegisterDomain"))
              .build();
        }
      }
    }
    return getRegisterDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ListRegistrationsRequest,
      com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> getListRegistrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegistrations",
      requestType = com.google.cloud.domains.v1alpha2.ListRegistrationsRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.ListRegistrationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ListRegistrationsRequest,
      com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> getListRegistrationsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ListRegistrationsRequest, com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> getListRegistrationsMethod;
    if ((getListRegistrationsMethod = DomainsGrpc.getListRegistrationsMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getListRegistrationsMethod = DomainsGrpc.getListRegistrationsMethod) == null) {
          DomainsGrpc.getListRegistrationsMethod = getListRegistrationsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ListRegistrationsRequest, com.google.cloud.domains.v1alpha2.ListRegistrationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegistrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ListRegistrationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ListRegistrationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ListRegistrations"))
              .build();
        }
      }
    }
    return getListRegistrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.GetRegistrationRequest,
      com.google.cloud.domains.v1alpha2.Registration> getGetRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegistration",
      requestType = com.google.cloud.domains.v1alpha2.GetRegistrationRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.Registration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.GetRegistrationRequest,
      com.google.cloud.domains.v1alpha2.Registration> getGetRegistrationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.GetRegistrationRequest, com.google.cloud.domains.v1alpha2.Registration> getGetRegistrationMethod;
    if ((getGetRegistrationMethod = DomainsGrpc.getGetRegistrationMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getGetRegistrationMethod = DomainsGrpc.getGetRegistrationMethod) == null) {
          DomainsGrpc.getGetRegistrationMethod = getGetRegistrationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.GetRegistrationRequest, com.google.cloud.domains.v1alpha2.Registration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.GetRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.Registration.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("GetRegistration"))
              .build();
        }
      }
    }
    return getGetRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest,
      com.google.longrunning.Operation> getUpdateRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistration",
      requestType = com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest,
      com.google.longrunning.Operation> getUpdateRegistrationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest, com.google.longrunning.Operation> getUpdateRegistrationMethod;
    if ((getUpdateRegistrationMethod = DomainsGrpc.getUpdateRegistrationMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getUpdateRegistrationMethod = DomainsGrpc.getUpdateRegistrationMethod) == null) {
          DomainsGrpc.getUpdateRegistrationMethod = getUpdateRegistrationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("UpdateRegistration"))
              .build();
        }
      }
    }
    return getUpdateRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest,
      com.google.longrunning.Operation> getConfigureManagementSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureManagementSettings",
      requestType = com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest,
      com.google.longrunning.Operation> getConfigureManagementSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest, com.google.longrunning.Operation> getConfigureManagementSettingsMethod;
    if ((getConfigureManagementSettingsMethod = DomainsGrpc.getConfigureManagementSettingsMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getConfigureManagementSettingsMethod = DomainsGrpc.getConfigureManagementSettingsMethod) == null) {
          DomainsGrpc.getConfigureManagementSettingsMethod = getConfigureManagementSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureManagementSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ConfigureManagementSettings"))
              .build();
        }
      }
    }
    return getConfigureManagementSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest,
      com.google.longrunning.Operation> getConfigureDnsSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureDnsSettings",
      requestType = com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest,
      com.google.longrunning.Operation> getConfigureDnsSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest, com.google.longrunning.Operation> getConfigureDnsSettingsMethod;
    if ((getConfigureDnsSettingsMethod = DomainsGrpc.getConfigureDnsSettingsMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getConfigureDnsSettingsMethod = DomainsGrpc.getConfigureDnsSettingsMethod) == null) {
          DomainsGrpc.getConfigureDnsSettingsMethod = getConfigureDnsSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureDnsSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ConfigureDnsSettings"))
              .build();
        }
      }
    }
    return getConfigureDnsSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest,
      com.google.longrunning.Operation> getConfigureContactSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureContactSettings",
      requestType = com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest,
      com.google.longrunning.Operation> getConfigureContactSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest, com.google.longrunning.Operation> getConfigureContactSettingsMethod;
    if ((getConfigureContactSettingsMethod = DomainsGrpc.getConfigureContactSettingsMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getConfigureContactSettingsMethod = DomainsGrpc.getConfigureContactSettingsMethod) == null) {
          DomainsGrpc.getConfigureContactSettingsMethod = getConfigureContactSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureContactSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ConfigureContactSettings"))
              .build();
        }
      }
    }
    return getConfigureContactSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ExportRegistrationRequest,
      com.google.longrunning.Operation> getExportRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportRegistration",
      requestType = com.google.cloud.domains.v1alpha2.ExportRegistrationRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ExportRegistrationRequest,
      com.google.longrunning.Operation> getExportRegistrationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ExportRegistrationRequest, com.google.longrunning.Operation> getExportRegistrationMethod;
    if ((getExportRegistrationMethod = DomainsGrpc.getExportRegistrationMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getExportRegistrationMethod = DomainsGrpc.getExportRegistrationMethod) == null) {
          DomainsGrpc.getExportRegistrationMethod = getExportRegistrationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ExportRegistrationRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ExportRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ExportRegistration"))
              .build();
        }
      }
    }
    return getExportRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest,
      com.google.longrunning.Operation> getDeleteRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRegistration",
      requestType = com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest,
      com.google.longrunning.Operation> getDeleteRegistrationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest, com.google.longrunning.Operation> getDeleteRegistrationMethod;
    if ((getDeleteRegistrationMethod = DomainsGrpc.getDeleteRegistrationMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getDeleteRegistrationMethod = DomainsGrpc.getDeleteRegistrationMethod) == null) {
          DomainsGrpc.getDeleteRegistrationMethod = getDeleteRegistrationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("DeleteRegistration"))
              .build();
        }
      }
    }
    return getDeleteRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest,
      com.google.cloud.domains.v1alpha2.AuthorizationCode> getRetrieveAuthorizationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveAuthorizationCode",
      requestType = com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.AuthorizationCode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest,
      com.google.cloud.domains.v1alpha2.AuthorizationCode> getRetrieveAuthorizationCodeMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest, com.google.cloud.domains.v1alpha2.AuthorizationCode> getRetrieveAuthorizationCodeMethod;
    if ((getRetrieveAuthorizationCodeMethod = DomainsGrpc.getRetrieveAuthorizationCodeMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getRetrieveAuthorizationCodeMethod = DomainsGrpc.getRetrieveAuthorizationCodeMethod) == null) {
          DomainsGrpc.getRetrieveAuthorizationCodeMethod = getRetrieveAuthorizationCodeMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest, com.google.cloud.domains.v1alpha2.AuthorizationCode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveAuthorizationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.AuthorizationCode.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("RetrieveAuthorizationCode"))
              .build();
        }
      }
    }
    return getRetrieveAuthorizationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest,
      com.google.cloud.domains.v1alpha2.AuthorizationCode> getResetAuthorizationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetAuthorizationCode",
      requestType = com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest.class,
      responseType = com.google.cloud.domains.v1alpha2.AuthorizationCode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest,
      com.google.cloud.domains.v1alpha2.AuthorizationCode> getResetAuthorizationCodeMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest, com.google.cloud.domains.v1alpha2.AuthorizationCode> getResetAuthorizationCodeMethod;
    if ((getResetAuthorizationCodeMethod = DomainsGrpc.getResetAuthorizationCodeMethod) == null) {
      synchronized (DomainsGrpc.class) {
        if ((getResetAuthorizationCodeMethod = DomainsGrpc.getResetAuthorizationCodeMethod) == null) {
          DomainsGrpc.getResetAuthorizationCodeMethod = getResetAuthorizationCodeMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest, com.google.cloud.domains.v1alpha2.AuthorizationCode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetAuthorizationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.domains.v1alpha2.AuthorizationCode.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsMethodDescriptorSupplier("ResetAuthorizationCode"))
              .build();
        }
      }
    }
    return getResetAuthorizationCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsStub>() {
        @java.lang.Override
        public DomainsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsStub(channel, callOptions);
        }
      };
    return DomainsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsBlockingStub>() {
        @java.lang.Override
        public DomainsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsBlockingStub(channel, callOptions);
        }
      };
    return DomainsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsFutureStub>() {
        @java.lang.Override
        public DomainsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsFutureStub(channel, callOptions);
        }
      };
    return DomainsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Cloud Domains API enables management and configuration of domain names.
   * </pre>
   */
  public static abstract class DomainsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Searches for available domain names similar to the provided query.
     * Availability results from this method are approximate; call
     * `RetrieveRegisterParameters` on a domain before registering to confirm
     * availability.
     * </pre>
     */
    public void searchDomains(com.google.cloud.domains.v1alpha2.SearchDomainsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.SearchDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets parameters needed to register a new domain name, including price and
     * up-to-date availability. Use the returned values to call `RegisterDomain`.
     * </pre>
     */
    public void retrieveRegisterParameters(com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveRegisterParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers a new domain name and creates a corresponding `Registration`
     * resource.
     * Call `RetrieveRegisterParameters` first to check availability of the domain
     * name and determine parameters like price that are needed to build a call to
     * this method.
     * A successful call creates a `Registration` resource in state
     * `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2
     * minutes, indicating that the domain was successfully registered. If the
     * resource ends up in state `REGISTRATION_FAILED`, it indicates that the
     * domain was not registered successfully, and you can safely delete the
     * resource and retry registration.
     * </pre>
     */
    public void registerDomain(com.google.cloud.domains.v1alpha2.RegisterDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the `Registration` resources in a project.
     * </pre>
     */
    public void listRegistrations(com.google.cloud.domains.v1alpha2.ListRegistrationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegistrationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a `Registration` resource.
     * </pre>
     */
    public void getRegistration(com.google.cloud.domains.v1alpha2.GetRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.Registration> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates select fields of a `Registration` resource, notably `labels`. To
     * update other fields, use the appropriate custom update method:
     * * To update management settings, see `ConfigureManagementSettings`
     * * To update DNS configuration, see `ConfigureDnsSettings`
     * * To update contact information, see `ConfigureContactSettings`
     * </pre>
     */
    public void updateRegistration(com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s management settings.
     * </pre>
     */
    public void configureManagementSettings(com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureManagementSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s DNS settings.
     * </pre>
     */
    public void configureDnsSettings(com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureDnsSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s contact settings. Some changes require
     * confirmation by the domain's registrant contact .
     * </pre>
     */
    public void configureContactSettings(com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureContactSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports a `Registration` that you no longer want to use with
     * Cloud Domains. You can continue to use the domain in
     * [Google Domains](https://domains.google/) until it expires.
     * If the export is successful:
     * * The resource's `state` becomes `EXPORTED`, meaning that it is no longer
     * managed by Cloud Domains
     * * Because individual users can own domains in Google Domains, the calling
     * user becomes the domain's sole owner. Permissions for the domain are
     * subsequently managed in Google Domains.
     * * Without further action, the domain does not renew automatically.
     * The new owner can set up billing in Google Domains to renew the domain
     * if needed.
     * </pre>
     */
    public void exportRegistration(com.google.cloud.domains.v1alpha2.ExportRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a `Registration` resource.
     * This method only works on resources in one of the following states:
     * * `state` is `EXPORTED` with `expire_time` in the past
     * * `state` is `REGISTRATION_FAILED`
     * </pre>
     */
    public void deleteRegistration(com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the authorization code of the `Registration` for the purpose of
     * transferring the domain to another registrar.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public void retrieveAuthorizationCode(com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveAuthorizationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resets the authorization code of the `Registration` to a new random string.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public void resetAuthorizationCode(com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetAuthorizationCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchDomainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.SearchDomainsRequest,
                com.google.cloud.domains.v1alpha2.SearchDomainsResponse>(
                  this, METHODID_SEARCH_DOMAINS)))
          .addMethod(
            getRetrieveRegisterParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest,
                com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse>(
                  this, METHODID_RETRIEVE_REGISTER_PARAMETERS)))
          .addMethod(
            getRegisterDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.RegisterDomainRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_REGISTER_DOMAIN)))
          .addMethod(
            getListRegistrationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ListRegistrationsRequest,
                com.google.cloud.domains.v1alpha2.ListRegistrationsResponse>(
                  this, METHODID_LIST_REGISTRATIONS)))
          .addMethod(
            getGetRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.GetRegistrationRequest,
                com.google.cloud.domains.v1alpha2.Registration>(
                  this, METHODID_GET_REGISTRATION)))
          .addMethod(
            getUpdateRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_REGISTRATION)))
          .addMethod(
            getConfigureManagementSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CONFIGURE_MANAGEMENT_SETTINGS)))
          .addMethod(
            getConfigureDnsSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CONFIGURE_DNS_SETTINGS)))
          .addMethod(
            getConfigureContactSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CONFIGURE_CONTACT_SETTINGS)))
          .addMethod(
            getExportRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ExportRegistrationRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_REGISTRATION)))
          .addMethod(
            getDeleteRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_REGISTRATION)))
          .addMethod(
            getRetrieveAuthorizationCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest,
                com.google.cloud.domains.v1alpha2.AuthorizationCode>(
                  this, METHODID_RETRIEVE_AUTHORIZATION_CODE)))
          .addMethod(
            getResetAuthorizationCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest,
                com.google.cloud.domains.v1alpha2.AuthorizationCode>(
                  this, METHODID_RESET_AUTHORIZATION_CODE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Cloud Domains API enables management and configuration of domain names.
   * </pre>
   */
  public static final class DomainsStub extends io.grpc.stub.AbstractAsyncStub<DomainsStub> {
    private DomainsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for available domain names similar to the provided query.
     * Availability results from this method are approximate; call
     * `RetrieveRegisterParameters` on a domain before registering to confirm
     * availability.
     * </pre>
     */
    public void searchDomains(com.google.cloud.domains.v1alpha2.SearchDomainsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.SearchDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets parameters needed to register a new domain name, including price and
     * up-to-date availability. Use the returned values to call `RegisterDomain`.
     * </pre>
     */
    public void retrieveRegisterParameters(com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveRegisterParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers a new domain name and creates a corresponding `Registration`
     * resource.
     * Call `RetrieveRegisterParameters` first to check availability of the domain
     * name and determine parameters like price that are needed to build a call to
     * this method.
     * A successful call creates a `Registration` resource in state
     * `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2
     * minutes, indicating that the domain was successfully registered. If the
     * resource ends up in state `REGISTRATION_FAILED`, it indicates that the
     * domain was not registered successfully, and you can safely delete the
     * resource and retry registration.
     * </pre>
     */
    public void registerDomain(com.google.cloud.domains.v1alpha2.RegisterDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the `Registration` resources in a project.
     * </pre>
     */
    public void listRegistrations(com.google.cloud.domains.v1alpha2.ListRegistrationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegistrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a `Registration` resource.
     * </pre>
     */
    public void getRegistration(com.google.cloud.domains.v1alpha2.GetRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.Registration> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates select fields of a `Registration` resource, notably `labels`. To
     * update other fields, use the appropriate custom update method:
     * * To update management settings, see `ConfigureManagementSettings`
     * * To update DNS configuration, see `ConfigureDnsSettings`
     * * To update contact information, see `ConfigureContactSettings`
     * </pre>
     */
    public void updateRegistration(com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s management settings.
     * </pre>
     */
    public void configureManagementSettings(com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureManagementSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s DNS settings.
     * </pre>
     */
    public void configureDnsSettings(com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureDnsSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a `Registration`'s contact settings. Some changes require
     * confirmation by the domain's registrant contact .
     * </pre>
     */
    public void configureContactSettings(com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureContactSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports a `Registration` that you no longer want to use with
     * Cloud Domains. You can continue to use the domain in
     * [Google Domains](https://domains.google/) until it expires.
     * If the export is successful:
     * * The resource's `state` becomes `EXPORTED`, meaning that it is no longer
     * managed by Cloud Domains
     * * Because individual users can own domains in Google Domains, the calling
     * user becomes the domain's sole owner. Permissions for the domain are
     * subsequently managed in Google Domains.
     * * Without further action, the domain does not renew automatically.
     * The new owner can set up billing in Google Domains to renew the domain
     * if needed.
     * </pre>
     */
    public void exportRegistration(com.google.cloud.domains.v1alpha2.ExportRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a `Registration` resource.
     * This method only works on resources in one of the following states:
     * * `state` is `EXPORTED` with `expire_time` in the past
     * * `state` is `REGISTRATION_FAILED`
     * </pre>
     */
    public void deleteRegistration(com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the authorization code of the `Registration` for the purpose of
     * transferring the domain to another registrar.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public void retrieveAuthorizationCode(com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveAuthorizationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resets the authorization code of the `Registration` to a new random string.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public void resetAuthorizationCode(com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetAuthorizationCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Cloud Domains API enables management and configuration of domain names.
   * </pre>
   */
  public static final class DomainsBlockingStub extends io.grpc.stub.AbstractBlockingStub<DomainsBlockingStub> {
    private DomainsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for available domain names similar to the provided query.
     * Availability results from this method are approximate; call
     * `RetrieveRegisterParameters` on a domain before registering to confirm
     * availability.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.SearchDomainsResponse searchDomains(com.google.cloud.domains.v1alpha2.SearchDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets parameters needed to register a new domain name, including price and
     * up-to-date availability. Use the returned values to call `RegisterDomain`.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse retrieveRegisterParameters(com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveRegisterParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers a new domain name and creates a corresponding `Registration`
     * resource.
     * Call `RetrieveRegisterParameters` first to check availability of the domain
     * name and determine parameters like price that are needed to build a call to
     * this method.
     * A successful call creates a `Registration` resource in state
     * `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2
     * minutes, indicating that the domain was successfully registered. If the
     * resource ends up in state `REGISTRATION_FAILED`, it indicates that the
     * domain was not registered successfully, and you can safely delete the
     * resource and retry registration.
     * </pre>
     */
    public com.google.longrunning.Operation registerDomain(com.google.cloud.domains.v1alpha2.RegisterDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the `Registration` resources in a project.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.ListRegistrationsResponse listRegistrations(com.google.cloud.domains.v1alpha2.ListRegistrationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegistrationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the details of a `Registration` resource.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.Registration getRegistration(com.google.cloud.domains.v1alpha2.GetRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates select fields of a `Registration` resource, notably `labels`. To
     * update other fields, use the appropriate custom update method:
     * * To update management settings, see `ConfigureManagementSettings`
     * * To update DNS configuration, see `ConfigureDnsSettings`
     * * To update contact information, see `ConfigureContactSettings`
     * </pre>
     */
    public com.google.longrunning.Operation updateRegistration(com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s management settings.
     * </pre>
     */
    public com.google.longrunning.Operation configureManagementSettings(com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureManagementSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s DNS settings.
     * </pre>
     */
    public com.google.longrunning.Operation configureDnsSettings(com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureDnsSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s contact settings. Some changes require
     * confirmation by the domain's registrant contact .
     * </pre>
     */
    public com.google.longrunning.Operation configureContactSettings(com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureContactSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports a `Registration` that you no longer want to use with
     * Cloud Domains. You can continue to use the domain in
     * [Google Domains](https://domains.google/) until it expires.
     * If the export is successful:
     * * The resource's `state` becomes `EXPORTED`, meaning that it is no longer
     * managed by Cloud Domains
     * * Because individual users can own domains in Google Domains, the calling
     * user becomes the domain's sole owner. Permissions for the domain are
     * subsequently managed in Google Domains.
     * * Without further action, the domain does not renew automatically.
     * The new owner can set up billing in Google Domains to renew the domain
     * if needed.
     * </pre>
     */
    public com.google.longrunning.Operation exportRegistration(com.google.cloud.domains.v1alpha2.ExportRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a `Registration` resource.
     * This method only works on resources in one of the following states:
     * * `state` is `EXPORTED` with `expire_time` in the past
     * * `state` is `REGISTRATION_FAILED`
     * </pre>
     */
    public com.google.longrunning.Operation deleteRegistration(com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the authorization code of the `Registration` for the purpose of
     * transferring the domain to another registrar.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.AuthorizationCode retrieveAuthorizationCode(com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveAuthorizationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resets the authorization code of the `Registration` to a new random string.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public com.google.cloud.domains.v1alpha2.AuthorizationCode resetAuthorizationCode(com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetAuthorizationCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Cloud Domains API enables management and configuration of domain names.
   * </pre>
   */
  public static final class DomainsFutureStub extends io.grpc.stub.AbstractFutureStub<DomainsFutureStub> {
    private DomainsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for available domain names similar to the provided query.
     * Availability results from this method are approximate; call
     * `RetrieveRegisterParameters` on a domain before registering to confirm
     * availability.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.SearchDomainsResponse> searchDomains(
        com.google.cloud.domains.v1alpha2.SearchDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets parameters needed to register a new domain name, including price and
     * up-to-date availability. Use the returned values to call `RegisterDomain`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse> retrieveRegisterParameters(
        com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveRegisterParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers a new domain name and creates a corresponding `Registration`
     * resource.
     * Call `RetrieveRegisterParameters` first to check availability of the domain
     * name and determine parameters like price that are needed to build a call to
     * this method.
     * A successful call creates a `Registration` resource in state
     * `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2
     * minutes, indicating that the domain was successfully registered. If the
     * resource ends up in state `REGISTRATION_FAILED`, it indicates that the
     * domain was not registered successfully, and you can safely delete the
     * resource and retry registration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> registerDomain(
        com.google.cloud.domains.v1alpha2.RegisterDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the `Registration` resources in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.ListRegistrationsResponse> listRegistrations(
        com.google.cloud.domains.v1alpha2.ListRegistrationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegistrationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the details of a `Registration` resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.Registration> getRegistration(
        com.google.cloud.domains.v1alpha2.GetRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates select fields of a `Registration` resource, notably `labels`. To
     * update other fields, use the appropriate custom update method:
     * * To update management settings, see `ConfigureManagementSettings`
     * * To update DNS configuration, see `ConfigureDnsSettings`
     * * To update contact information, see `ConfigureContactSettings`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateRegistration(
        com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s management settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> configureManagementSettings(
        com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureManagementSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s DNS settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> configureDnsSettings(
        com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureDnsSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a `Registration`'s contact settings. Some changes require
     * confirmation by the domain's registrant contact .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> configureContactSettings(
        com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureContactSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports a `Registration` that you no longer want to use with
     * Cloud Domains. You can continue to use the domain in
     * [Google Domains](https://domains.google/) until it expires.
     * If the export is successful:
     * * The resource's `state` becomes `EXPORTED`, meaning that it is no longer
     * managed by Cloud Domains
     * * Because individual users can own domains in Google Domains, the calling
     * user becomes the domain's sole owner. Permissions for the domain are
     * subsequently managed in Google Domains.
     * * Without further action, the domain does not renew automatically.
     * The new owner can set up billing in Google Domains to renew the domain
     * if needed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportRegistration(
        com.google.cloud.domains.v1alpha2.ExportRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a `Registration` resource.
     * This method only works on resources in one of the following states:
     * * `state` is `EXPORTED` with `expire_time` in the past
     * * `state` is `REGISTRATION_FAILED`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteRegistration(
        com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the authorization code of the `Registration` for the purpose of
     * transferring the domain to another registrar.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.AuthorizationCode> retrieveAuthorizationCode(
        com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveAuthorizationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resets the authorization code of the `Registration` to a new random string.
     * You can call this method only after 60 days have elapsed since the initial
     * domain registration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.domains.v1alpha2.AuthorizationCode> resetAuthorizationCode(
        com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetAuthorizationCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_DOMAINS = 0;
  private static final int METHODID_RETRIEVE_REGISTER_PARAMETERS = 1;
  private static final int METHODID_REGISTER_DOMAIN = 2;
  private static final int METHODID_LIST_REGISTRATIONS = 3;
  private static final int METHODID_GET_REGISTRATION = 4;
  private static final int METHODID_UPDATE_REGISTRATION = 5;
  private static final int METHODID_CONFIGURE_MANAGEMENT_SETTINGS = 6;
  private static final int METHODID_CONFIGURE_DNS_SETTINGS = 7;
  private static final int METHODID_CONFIGURE_CONTACT_SETTINGS = 8;
  private static final int METHODID_EXPORT_REGISTRATION = 9;
  private static final int METHODID_DELETE_REGISTRATION = 10;
  private static final int METHODID_RETRIEVE_AUTHORIZATION_CODE = 11;
  private static final int METHODID_RESET_AUTHORIZATION_CODE = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DomainsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DomainsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_DOMAINS:
          serviceImpl.searchDomains((com.google.cloud.domains.v1alpha2.SearchDomainsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.SearchDomainsResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_REGISTER_PARAMETERS:
          serviceImpl.retrieveRegisterParameters((com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DOMAIN:
          serviceImpl.registerDomain((com.google.cloud.domains.v1alpha2.RegisterDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_REGISTRATIONS:
          serviceImpl.listRegistrations((com.google.cloud.domains.v1alpha2.ListRegistrationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.ListRegistrationsResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTRATION:
          serviceImpl.getRegistration((com.google.cloud.domains.v1alpha2.GetRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.Registration>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION:
          serviceImpl.updateRegistration((com.google.cloud.domains.v1alpha2.UpdateRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_MANAGEMENT_SETTINGS:
          serviceImpl.configureManagementSettings((com.google.cloud.domains.v1alpha2.ConfigureManagementSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_DNS_SETTINGS:
          serviceImpl.configureDnsSettings((com.google.cloud.domains.v1alpha2.ConfigureDnsSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_CONTACT_SETTINGS:
          serviceImpl.configureContactSettings((com.google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_REGISTRATION:
          serviceImpl.exportRegistration((com.google.cloud.domains.v1alpha2.ExportRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_REGISTRATION:
          serviceImpl.deleteRegistration((com.google.cloud.domains.v1alpha2.DeleteRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RETRIEVE_AUTHORIZATION_CODE:
          serviceImpl.retrieveAuthorizationCode((com.google.cloud.domains.v1alpha2.RetrieveAuthorizationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode>) responseObserver);
          break;
        case METHODID_RESET_AUTHORIZATION_CODE:
          serviceImpl.resetAuthorizationCode((com.google.cloud.domains.v1alpha2.ResetAuthorizationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.domains.v1alpha2.AuthorizationCode>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DomainsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.domains.v1alpha2.DomainsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Domains");
    }
  }

  private static final class DomainsFileDescriptorSupplier
      extends DomainsBaseDescriptorSupplier {
    DomainsFileDescriptorSupplier() {}
  }

  private static final class DomainsMethodDescriptorSupplier
      extends DomainsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DomainsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DomainsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainsFileDescriptorSupplier())
              .addMethod(getSearchDomainsMethod())
              .addMethod(getRetrieveRegisterParametersMethod())
              .addMethod(getRegisterDomainMethod())
              .addMethod(getListRegistrationsMethod())
              .addMethod(getGetRegistrationMethod())
              .addMethod(getUpdateRegistrationMethod())
              .addMethod(getConfigureManagementSettingsMethod())
              .addMethod(getConfigureDnsSettingsMethod())
              .addMethod(getConfigureContactSettingsMethod())
              .addMethod(getExportRegistrationMethod())
              .addMethod(getDeleteRegistrationMethod())
              .addMethod(getRetrieveAuthorizationCodeMethod())
              .addMethod(getResetAuthorizationCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
