package com.github.cn.ccj.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: RequestVote.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VoteServiceGrpc {

  private VoteServiceGrpc() {}

  public static final String SERVICE_NAME = "raft.VoteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.RequestVote.VoteRequest,
      com.github.cn.ccj.rpc.RequestVote.VoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vote",
      requestType = com.github.cn.ccj.rpc.RequestVote.VoteRequest.class,
      responseType = com.github.cn.ccj.rpc.RequestVote.VoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.RequestVote.VoteRequest,
      com.github.cn.ccj.rpc.RequestVote.VoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<com.github.cn.ccj.rpc.RequestVote.VoteRequest, com.github.cn.ccj.rpc.RequestVote.VoteResponse> getVoteMethod;
    if ((getVoteMethod = VoteServiceGrpc.getVoteMethod) == null) {
      synchronized (VoteServiceGrpc.class) {
        if ((getVoteMethod = VoteServiceGrpc.getVoteMethod) == null) {
          VoteServiceGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<com.github.cn.ccj.rpc.RequestVote.VoteRequest, com.github.cn.ccj.rpc.RequestVote.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.RequestVote.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.cn.ccj.rpc.RequestVote.VoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VoteServiceMethodDescriptorSupplier("vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VoteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VoteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VoteServiceStub>() {
        @Override
        public VoteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VoteServiceStub(channel, callOptions);
        }
      };
    return VoteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VoteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VoteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VoteServiceBlockingStub>() {
        @Override
        public VoteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VoteServiceBlockingStub(channel, callOptions);
        }
      };
    return VoteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VoteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VoteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VoteServiceFutureStub>() {
        @Override
        public VoteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VoteServiceFutureStub(channel, callOptions);
        }
      };
    return VoteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VoteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void vote(com.github.cn.ccj.rpc.RequestVote.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.RequestVote.VoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVoteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.cn.ccj.rpc.RequestVote.VoteRequest,
                com.github.cn.ccj.rpc.RequestVote.VoteResponse>(
                  this, METHODID_VOTE)))
          .build();
    }
  }

  /**
   */
  public static final class VoteServiceStub extends io.grpc.stub.AbstractAsyncStub<VoteServiceStub> {
    private VoteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VoteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VoteServiceStub(channel, callOptions);
    }

    /**
     */
    public void vote(com.github.cn.ccj.rpc.RequestVote.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.RequestVote.VoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VoteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VoteServiceBlockingStub> {
    private VoteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VoteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VoteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.cn.ccj.rpc.RequestVote.VoteResponse vote(com.github.cn.ccj.rpc.RequestVote.VoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VoteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VoteServiceFutureStub> {
    private VoteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VoteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VoteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.cn.ccj.rpc.RequestVote.VoteResponse> vote(
        com.github.cn.ccj.rpc.RequestVote.VoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VOTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VoteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VoteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VOTE:
          serviceImpl.vote((com.github.cn.ccj.rpc.RequestVote.VoteRequest) request,
              (io.grpc.stub.StreamObserver<com.github.cn.ccj.rpc.RequestVote.VoteResponse>) responseObserver);
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

  private static abstract class VoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VoteServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.cn.ccj.rpc.RequestVote.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VoteService");
    }
  }

  private static final class VoteServiceFileDescriptorSupplier
      extends VoteServiceBaseDescriptorSupplier {
    VoteServiceFileDescriptorSupplier() {}
  }

  private static final class VoteServiceMethodDescriptorSupplier
      extends VoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VoteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VoteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VoteServiceFileDescriptorSupplier())
              .addMethod(getVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
