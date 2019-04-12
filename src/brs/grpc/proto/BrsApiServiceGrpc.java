package brs.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: brsApi.proto")
public final class BrsApiServiceGrpc {

  private BrsApiServiceGrpc() {}

  public static final String SERVICE_NAME = "BrsApiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetBlockRequest,
      brs.grpc.proto.BrsApi.Block> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlock",
      requestType = brs.grpc.proto.BrsApi.GetBlockRequest.class,
      responseType = brs.grpc.proto.BrsApi.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetBlockRequest,
      brs.grpc.proto.BrsApi.Block> getGetBlockMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetBlockRequest, brs.grpc.proto.BrsApi.Block> getGetBlockMethod;
    if ((getGetBlockMethod = BrsApiServiceGrpc.getGetBlockMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetBlockMethod = BrsApiServiceGrpc.getGetBlockMethod) == null) {
          BrsApiServiceGrpc.getGetBlockMethod = getGetBlockMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.GetBlockRequest, brs.grpc.proto.BrsApi.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.GetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetBlock"))
                  .build();
          }
        }
     }
     return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountRequest,
      brs.grpc.proto.BrsApi.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = brs.grpc.proto.BrsApi.GetAccountRequest.class,
      responseType = brs.grpc.proto.BrsApi.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountRequest,
      brs.grpc.proto.BrsApi.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountRequest, brs.grpc.proto.BrsApi.Account> getGetAccountMethod;
    if ((getGetAccountMethod = BrsApiServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetAccountMethod = BrsApiServiceGrpc.getGetAccountMethod) == null) {
          BrsApiServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.GetAccountRequest, brs.grpc.proto.BrsApi.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.Account.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountsRequest,
      brs.grpc.proto.BrsApi.Accounts> getGetAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccounts",
      requestType = brs.grpc.proto.BrsApi.GetAccountsRequest.class,
      responseType = brs.grpc.proto.BrsApi.Accounts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountsRequest,
      brs.grpc.proto.BrsApi.Accounts> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetAccountsRequest, brs.grpc.proto.BrsApi.Accounts> getGetAccountsMethod;
    if ((getGetAccountsMethod = BrsApiServiceGrpc.getGetAccountsMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetAccountsMethod = BrsApiServiceGrpc.getGetAccountsMethod) == null) {
          BrsApiServiceGrpc.getGetAccountsMethod = getGetAccountsMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.GetAccountsRequest, brs.grpc.proto.BrsApi.Accounts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.GetAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.Accounts.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetAccounts"))
                  .build();
          }
        }
     }
     return getGetAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      brs.grpc.proto.BrsApi.MiningInfo> getGetMiningInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMiningInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = brs.grpc.proto.BrsApi.MiningInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      brs.grpc.proto.BrsApi.MiningInfo> getGetMiningInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, brs.grpc.proto.BrsApi.MiningInfo> getGetMiningInfoMethod;
    if ((getGetMiningInfoMethod = BrsApiServiceGrpc.getGetMiningInfoMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetMiningInfoMethod = BrsApiServiceGrpc.getGetMiningInfoMethod) == null) {
          BrsApiServiceGrpc.getGetMiningInfoMethod = getGetMiningInfoMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, brs.grpc.proto.BrsApi.MiningInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetMiningInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.MiningInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetMiningInfo"))
                  .build();
          }
        }
     }
     return getGetMiningInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest,
      brs.grpc.proto.BrsApi.Transaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = brs.grpc.proto.BrsApi.GetTransactionRequest.class,
      responseType = brs.grpc.proto.BrsApi.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest,
      brs.grpc.proto.BrsApi.Transaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest, brs.grpc.proto.BrsApi.Transaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = BrsApiServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetTransactionMethod = BrsApiServiceGrpc.getGetTransactionMethod) == null) {
          BrsApiServiceGrpc.getGetTransactionMethod = getGetTransactionMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.GetTransactionRequest, brs.grpc.proto.BrsApi.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetTransaction"))
                  .build();
          }
        }
     }
     return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest,
      brs.grpc.proto.BrsApi.TransactionBytes> getGetTransactionBytesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionBytes",
      requestType = brs.grpc.proto.BrsApi.GetTransactionRequest.class,
      responseType = brs.grpc.proto.BrsApi.TransactionBytes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest,
      brs.grpc.proto.BrsApi.TransactionBytes> getGetTransactionBytesMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.GetTransactionRequest, brs.grpc.proto.BrsApi.TransactionBytes> getGetTransactionBytesMethod;
    if ((getGetTransactionBytesMethod = BrsApiServiceGrpc.getGetTransactionBytesMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getGetTransactionBytesMethod = BrsApiServiceGrpc.getGetTransactionBytesMethod) == null) {
          BrsApiServiceGrpc.getGetTransactionBytesMethod = getGetTransactionBytesMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.GetTransactionRequest, brs.grpc.proto.BrsApi.TransactionBytes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "GetTransactionBytes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.TransactionBytes.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("GetTransactionBytes"))
                  .build();
          }
        }
     }
     return getGetTransactionBytesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.SubmitNonceRequest,
      brs.grpc.proto.BrsApi.SubmitNonceResponse> getSubmitNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitNonce",
      requestType = brs.grpc.proto.BrsApi.SubmitNonceRequest.class,
      responseType = brs.grpc.proto.BrsApi.SubmitNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.SubmitNonceRequest,
      brs.grpc.proto.BrsApi.SubmitNonceResponse> getSubmitNonceMethod() {
    io.grpc.MethodDescriptor<brs.grpc.proto.BrsApi.SubmitNonceRequest, brs.grpc.proto.BrsApi.SubmitNonceResponse> getSubmitNonceMethod;
    if ((getSubmitNonceMethod = BrsApiServiceGrpc.getSubmitNonceMethod) == null) {
      synchronized (BrsApiServiceGrpc.class) {
        if ((getSubmitNonceMethod = BrsApiServiceGrpc.getSubmitNonceMethod) == null) {
          BrsApiServiceGrpc.getSubmitNonceMethod = getSubmitNonceMethod = 
              io.grpc.MethodDescriptor.<brs.grpc.proto.BrsApi.SubmitNonceRequest, brs.grpc.proto.BrsApi.SubmitNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BrsApiService", "SubmitNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.SubmitNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brs.grpc.proto.BrsApi.SubmitNonceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BrsApiServiceMethodDescriptorSupplier("SubmitNonce"))
                  .build();
          }
        }
     }
     return getSubmitNonceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrsApiServiceStub newStub(io.grpc.Channel channel) {
    return new BrsApiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrsApiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrsApiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrsApiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrsApiServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BrsApiServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBlock(brs.grpc.proto.BrsApi.GetBlockRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(brs.grpc.proto.BrsApi.GetAccountRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccounts(brs.grpc.proto.BrsApi.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Accounts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    /**
     */
    public void getMiningInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.MiningInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMiningInfoMethod(), responseObserver);
    }

    /**
     */
    public void getTransaction(brs.grpc.proto.BrsApi.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionBytes(brs.grpc.proto.BrsApi.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.TransactionBytes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionBytesMethod(), responseObserver);
    }

    /**
     */
    public void submitNonce(brs.grpc.proto.BrsApi.SubmitNonceRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.SubmitNonceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitNonceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.GetBlockRequest,
                brs.grpc.proto.BrsApi.Block>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.GetAccountRequest,
                brs.grpc.proto.BrsApi.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.GetAccountsRequest,
                brs.grpc.proto.BrsApi.Accounts>(
                  this, METHODID_GET_ACCOUNTS)))
          .addMethod(
            getGetMiningInfoMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                brs.grpc.proto.BrsApi.MiningInfo>(
                  this, METHODID_GET_MINING_INFO)))
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.GetTransactionRequest,
                brs.grpc.proto.BrsApi.Transaction>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getGetTransactionBytesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.GetTransactionRequest,
                brs.grpc.proto.BrsApi.TransactionBytes>(
                  this, METHODID_GET_TRANSACTION_BYTES)))
          .addMethod(
            getSubmitNonceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                brs.grpc.proto.BrsApi.SubmitNonceRequest,
                brs.grpc.proto.BrsApi.SubmitNonceResponse>(
                  this, METHODID_SUBMIT_NONCE)))
          .build();
    }
  }

  /**
   */
  public static final class BrsApiServiceStub extends io.grpc.stub.AbstractStub<BrsApiServiceStub> {
    private BrsApiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrsApiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrsApiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrsApiServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBlock(brs.grpc.proto.BrsApi.GetBlockRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(brs.grpc.proto.BrsApi.GetAccountRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccounts(brs.grpc.proto.BrsApi.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Accounts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMiningInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.MiningInfo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMiningInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(brs.grpc.proto.BrsApi.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionBytes(brs.grpc.proto.BrsApi.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.TransactionBytes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionBytesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitNonce(brs.grpc.proto.BrsApi.SubmitNonceRequest request,
        io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.SubmitNonceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitNonceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BrsApiServiceBlockingStub extends io.grpc.stub.AbstractStub<BrsApiServiceBlockingStub> {
    private BrsApiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrsApiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrsApiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrsApiServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.Block getBlock(brs.grpc.proto.BrsApi.GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.Account getAccount(brs.grpc.proto.BrsApi.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.Accounts getAccounts(brs.grpc.proto.BrsApi.GetAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<brs.grpc.proto.BrsApi.MiningInfo> getMiningInfo(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMiningInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.Transaction getTransaction(brs.grpc.proto.BrsApi.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.TransactionBytes getTransactionBytes(brs.grpc.proto.BrsApi.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionBytesMethod(), getCallOptions(), request);
    }

    /**
     */
    public brs.grpc.proto.BrsApi.SubmitNonceResponse submitNonce(brs.grpc.proto.BrsApi.SubmitNonceRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitNonceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BrsApiServiceFutureStub extends io.grpc.stub.AbstractStub<BrsApiServiceFutureStub> {
    private BrsApiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrsApiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrsApiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrsApiServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.Block> getBlock(
        brs.grpc.proto.BrsApi.GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.Account> getAccount(
        brs.grpc.proto.BrsApi.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.Accounts> getAccounts(
        brs.grpc.proto.BrsApi.GetAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.Transaction> getTransaction(
        brs.grpc.proto.BrsApi.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.TransactionBytes> getTransactionBytes(
        brs.grpc.proto.BrsApi.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionBytesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brs.grpc.proto.BrsApi.SubmitNonceResponse> submitNonce(
        brs.grpc.proto.BrsApi.SubmitNonceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitNonceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BLOCK = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_ACCOUNTS = 2;
  private static final int METHODID_GET_MINING_INFO = 3;
  private static final int METHODID_GET_TRANSACTION = 4;
  private static final int METHODID_GET_TRANSACTION_BYTES = 5;
  private static final int METHODID_SUBMIT_NONCE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrsApiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrsApiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((brs.grpc.proto.BrsApi.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Block>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((brs.grpc.proto.BrsApi.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNTS:
          serviceImpl.getAccounts((brs.grpc.proto.BrsApi.GetAccountsRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Accounts>) responseObserver);
          break;
        case METHODID_GET_MINING_INFO:
          serviceImpl.getMiningInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.MiningInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((brs.grpc.proto.BrsApi.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BYTES:
          serviceImpl.getTransactionBytes((brs.grpc.proto.BrsApi.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.TransactionBytes>) responseObserver);
          break;
        case METHODID_SUBMIT_NONCE:
          serviceImpl.submitNonce((brs.grpc.proto.BrsApi.SubmitNonceRequest) request,
              (io.grpc.stub.StreamObserver<brs.grpc.proto.BrsApi.SubmitNonceResponse>) responseObserver);
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

  private static abstract class BrsApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrsApiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return brs.grpc.proto.BrsApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BrsApiService");
    }
  }

  private static final class BrsApiServiceFileDescriptorSupplier
      extends BrsApiServiceBaseDescriptorSupplier {
    BrsApiServiceFileDescriptorSupplier() {}
  }

  private static final class BrsApiServiceMethodDescriptorSupplier
      extends BrsApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrsApiServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrsApiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrsApiServiceFileDescriptorSupplier())
              .addMethod(getGetBlockMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountsMethod())
              .addMethod(getGetMiningInfoMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionBytesMethod())
              .addMethod(getSubmitNonceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
