package com.github.cn.ccj.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: AppendEntries.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppendEntriesServiceGrpc {

  private AppendEntriesServiceGrpc() {}

  public static final String SERVICE_NAME = "raft.AppendEntriesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest,
      com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> getAppendEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "appendEntries",
      requestType = com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest.class,
      responseType = com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest,
      com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> getAppendEntriesMethod() {
    io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest, com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> getAppendEntriesMethod;
    if ((getAppendEntriesMethod = AppendEntriesServiceGrpc.getAppendEntriesMethod) == null) {
      synchronized (AppendEntriesServiceGrpc.class) {
        if ((getAppendEntriesMethod = AppendEntriesServiceGrpc.getAppendEntriesMethod) == null) {
          AppendEntriesServiceGrpc.getAppendEntriesMethod = getAppendEntriesMethod =
              io.grpc.MethodDescriptor.<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest, com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "appendEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppendEntriesServiceMethodDescriptorSupplier("appendEntries"))
              .build();
        }
      }
    }
    return getAppendEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppendEntriesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceStub>() {
        @Override
        public AppendEntriesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppendEntriesServiceStub(channel, callOptions);
        }
      };
    return AppendEntriesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppendEntriesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceBlockingStub>() {
        @Override
        public AppendEntriesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppendEntriesServiceBlockingStub(channel, callOptions);
        }
      };
    return AppendEntriesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppendEntriesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppendEntriesServiceFutureStub>() {
        @Override
        public AppendEntriesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppendEntriesServiceFutureStub(channel, callOptions);
        }
      };
    return AppendEntriesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppendEntriesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void appendEntries(com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendEntriesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAppendEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest,
                com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse>(
                  this, METHODID_APPEND_ENTRIES)))
          .build();
    }
  }

  /**
   */
  public static final class AppendEntriesServiceStub extends io.grpc.stub.AbstractAsyncStub<AppendEntriesServiceStub> {
    private AppendEntriesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppendEntriesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppendEntriesServiceStub(channel, callOptions);
    }

    /**
     */
    public void appendEntries(com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppendEntriesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppendEntriesServiceBlockingStub> {
    private AppendEntriesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppendEntriesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppendEntriesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse appendEntries(com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppendEntriesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppendEntriesServiceFutureStub> {
    private AppendEntriesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppendEntriesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppendEntriesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse> appendEntries(
        com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPEND_ENTRIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppendEntriesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppendEntriesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPEND_ENTRIES:
          serviceImpl.appendEntries((com.github.cn.ccj.rpc.AppendEntries.AppendEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.AppendEntries.AppendEntriesResponse>) responseObserver);
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

  private static abstract class AppendEntriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppendEntriesServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.cn.ccj.rpc.AppendEntries.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppendEntriesService");
    }
  }

  private static final class AppendEntriesServiceFileDescriptorSupplier
      extends AppendEntriesServiceBaseDescriptorSupplier {
    AppendEntriesServiceFileDescriptorSupplier() {}
  }

  private static final class AppendEntriesServiceMethodDescriptorSupplier
      extends AppendEntriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppendEntriesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppendEntriesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppendEntriesServiceFileDescriptorSupplier())
              .addMethod(getAppendEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
