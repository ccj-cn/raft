package com.github.cn.ccj.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: InstallSnapshot.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstallSnapshotServiceGrpc {

  private InstallSnapshotServiceGrpc() {}

  public static final String SERVICE_NAME = "raft.InstallSnapshotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest,
      com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> getInstallSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "installSnapshot",
      requestType = com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest.class,
      responseType = com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest,
      com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> getInstallSnapshotMethod() {
    io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest, com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> getInstallSnapshotMethod;
    if ((getInstallSnapshotMethod = InstallSnapshotServiceGrpc.getInstallSnapshotMethod) == null) {
      synchronized (InstallSnapshotServiceGrpc.class) {
        if ((getInstallSnapshotMethod = InstallSnapshotServiceGrpc.getInstallSnapshotMethod) == null) {
          InstallSnapshotServiceGrpc.getInstallSnapshotMethod = getInstallSnapshotMethod =
              io.grpc.MethodDescriptor.<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest, com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "installSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallSnapshotServiceMethodDescriptorSupplier("installSnapshot"))
              .build();
        }
      }
    }
    return getInstallSnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstallSnapshotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceStub>() {
        @Override
        public InstallSnapshotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallSnapshotServiceStub(channel, callOptions);
        }
      };
    return InstallSnapshotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstallSnapshotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceBlockingStub>() {
        @Override
        public InstallSnapshotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallSnapshotServiceBlockingStub(channel, callOptions);
        }
      };
    return InstallSnapshotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstallSnapshotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallSnapshotServiceFutureStub>() {
        @Override
        public InstallSnapshotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallSnapshotServiceFutureStub(channel, callOptions);
        }
      };
    return InstallSnapshotServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InstallSnapshotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void installSnapshot(com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstallSnapshotMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInstallSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest,
                com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse>(
                  this, METHODID_INSTALL_SNAPSHOT)))
          .build();
    }
  }

  /**
   */
  public static final class InstallSnapshotServiceStub extends io.grpc.stub.AbstractAsyncStub<InstallSnapshotServiceStub> {
    private InstallSnapshotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstallSnapshotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallSnapshotServiceStub(channel, callOptions);
    }

    /**
     */
    public void installSnapshot(com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstallSnapshotServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InstallSnapshotServiceBlockingStub> {
    private InstallSnapshotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstallSnapshotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallSnapshotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse installSnapshot(com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallSnapshotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstallSnapshotServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InstallSnapshotServiceFutureStub> {
    private InstallSnapshotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstallSnapshotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallSnapshotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse> installSnapshot(
        com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSTALL_SNAPSHOT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstallSnapshotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstallSnapshotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSTALL_SNAPSHOT:
          serviceImpl.installSnapshot((com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.InstallSnapshot.InstallSnapshotResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InstallSnapshotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstallSnapshotServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.cn.ccj.rpc.InstallSnapshot.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstallSnapshotService");
    }
  }

  private static final class InstallSnapshotServiceFileDescriptorSupplier
      extends InstallSnapshotServiceBaseDescriptorSupplier {
    InstallSnapshotServiceFileDescriptorSupplier() {}
  }

  private static final class InstallSnapshotServiceMethodDescriptorSupplier
      extends InstallSnapshotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstallSnapshotServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InstallSnapshotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstallSnapshotServiceFileDescriptorSupplier())
              .addMethod(getInstallSnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
