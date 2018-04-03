package com.yifan.demo.netty.protobuf;

/**
 * @version V1.0
 * @Title: SubscribeRespProto
 * @Package: com.yifan.demo.netty.protobuf
 * @Description:
 * @author: dengyin
 * @date: 18-4-3
 */
public class SubscribeRespProto {
    private SubscribeRespProto() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface SubscribeRespOrBuilder extends
            // @@protoc_insertion_point(interface_extends:netty.SubscribeResp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required int32 subReqID = 1;</code>
         */
        boolean hasSubReqID();
        /**
         * <code>required int32 subReqID = 1;</code>
         */
        int getSubReqID();

        /**
         * <code>required int32 respCode = 2;</code>
         */
        boolean hasRespCode();
        /**
         * <code>required int32 respCode = 2;</code>
         */
        int getRespCode();

        /**
         * <code>required string desc = 3;</code>
         */
        boolean hasDesc();
        /**
         * <code>required string desc = 3;</code>
         */
        java.lang.String getDesc();
        /**
         * <code>required string desc = 3;</code>
         */
        com.google.protobuf.ByteString
        getDescBytes();
    }
    /**
     * Protobuf type {@code netty.SubscribeResp}
     */
    public static final class SubscribeResp extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:netty.SubscribeResp)
            SubscribeRespOrBuilder {
        // Use SubscribeResp.newBuilder() to construct.
        private SubscribeResp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private SubscribeResp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final SubscribeResp defaultInstance;
        public static SubscribeResp getDefaultInstance() {
            return defaultInstance;
        }

        public SubscribeResp getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SubscribeResp(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            subReqID_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            respCode_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            desc_ = bs;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.yifan.demo.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.yifan.demo.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.class, com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.Builder.class);
        }

        public static com.google.protobuf.Parser<SubscribeResp> PARSER =
                new com.google.protobuf.AbstractParser<SubscribeResp>() {
                    public SubscribeResp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SubscribeResp(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<SubscribeResp> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        public static final int SUBREQID_FIELD_NUMBER = 1;
        private int subReqID_;
        /**
         * <code>required int32 subReqID = 1;</code>
         */
        public boolean hasSubReqID() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required int32 subReqID = 1;</code>
         */
        public int getSubReqID() {
            return subReqID_;
        }

        public static final int RESPCODE_FIELD_NUMBER = 2;
        private int respCode_;
        /**
         * <code>required int32 respCode = 2;</code>
         */
        public boolean hasRespCode() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int32 respCode = 2;</code>
         */
        public int getRespCode() {
            return respCode_;
        }

        public static final int DESC_FIELD_NUMBER = 3;
        private java.lang.Object desc_;
        /**
         * <code>required string desc = 3;</code>
         */
        public boolean hasDesc() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required string desc = 3;</code>
         */
        public java.lang.String getDesc() {
            java.lang.Object ref = desc_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    desc_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string desc = 3;</code>
         */
        public com.google.protobuf.ByteString
        getDescBytes() {
            java.lang.Object ref = desc_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                desc_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            subReqID_ = 0;
            respCode_ = 0;
            desc_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasSubReqID()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasRespCode()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDesc()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, subReqID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, respCode_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getDescBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, subReqID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, respCode_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getDescBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code netty.SubscribeResp}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:netty.SubscribeResp)
                com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeRespOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.yifan.demo.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.yifan.demo.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.class, com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.Builder.class);
            }

            // Construct using com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                subReqID_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                respCode_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                desc_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.yifan.demo.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
            }

            public com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
                return com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.getDefaultInstance();
            }

            public com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp build() {
                com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp buildPartial() {
                com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp result = new com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.subReqID_ = subReqID_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.respCode_ = respCode_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.desc_ = desc_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp) {
                    return mergeFrom((com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp other) {
                if (other == com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp.getDefaultInstance()) return this;
                if (other.hasSubReqID()) {
                    setSubReqID(other.getSubReqID());
                }
                if (other.hasRespCode()) {
                    setRespCode(other.getRespCode());
                }
                if (other.hasDesc()) {
                    bitField0_ |= 0x00000004;
                    desc_ = other.desc_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSubReqID()) {

                    return false;
                }
                if (!hasRespCode()) {

                    return false;
                }
                if (!hasDesc()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.yifan.demo.netty.protobuf.SubscribeRespProto.SubscribeResp) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int subReqID_ ;
            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public boolean hasSubReqID() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public int getSubReqID() {
                return subReqID_;
            }
            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public Builder setSubReqID(int value) {
                bitField0_ |= 0x00000001;
                subReqID_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public Builder clearSubReqID() {
                bitField0_ = (bitField0_ & ~0x00000001);
                subReqID_ = 0;
                onChanged();
                return this;
            }

            private int respCode_ ;
            /**
             * <code>required int32 respCode = 2;</code>
             */
            public boolean hasRespCode() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int32 respCode = 2;</code>
             */
            public int getRespCode() {
                return respCode_;
            }
            /**
             * <code>required int32 respCode = 2;</code>
             */
            public Builder setRespCode(int value) {
                bitField0_ |= 0x00000002;
                respCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 respCode = 2;</code>
             */
            public Builder clearRespCode() {
                bitField0_ = (bitField0_ & ~0x00000002);
                respCode_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object desc_ = "";
            /**
             * <code>required string desc = 3;</code>
             */
            public boolean hasDesc() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string desc = 3;</code>
             */
            public java.lang.String getDesc() {
                java.lang.Object ref = desc_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        desc_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string desc = 3;</code>
             */
            public com.google.protobuf.ByteString
            getDescBytes() {
                java.lang.Object ref = desc_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    desc_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string desc = 3;</code>
             */
            public Builder setDesc(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                desc_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string desc = 3;</code>
             */
            public Builder clearDesc() {
                bitField0_ = (bitField0_ & ~0x00000004);
                desc_ = getDefaultInstance().getDesc();
                onChanged();
                return this;
            }
            /**
             * <code>required string desc = 3;</code>
             */
            public Builder setDescBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                desc_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:netty.SubscribeResp)
        }

        static {
            defaultInstance = new SubscribeResp(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:netty.SubscribeResp)
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_netty_SubscribeResp_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_netty_SubscribeResp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\023SubscribeResp.proto\022\005netty\"A\n\rSubscrib" +
                        "eResp\022\020\n\010subReqID\030\001 \002(\005\022\020\n\010respCode\030\002 \002(" +
                        "\005\022\014\n\004desc\030\003 \002(\tB3\n\035com.phei.netty.codec." +
                        "protobufB\022SubscribeRespProto"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_netty_SubscribeResp_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_netty_SubscribeResp_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_netty_SubscribeResp_descriptor,
                new java.lang.String[] { "SubReqID", "RespCode", "Desc", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
