// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrifleGadget.proto

package emu.grasscutter.net.proto;

public final class TrifleGadgetOuterClass {
  private TrifleGadgetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrifleGadgetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrifleGadget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Item item = 1;</code>
     * @return Whether the item field is set.
     */
    boolean hasItem();
    /**
     * <code>.Item item = 1;</code>
     * @return The item.
     */
    emu.grasscutter.net.proto.ItemOuterClass.Item getItem();
    /**
     * <code>.Item item = 1;</code>
     */
    emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemOrBuilder();

    /**
     * <code>uint32 GAHBDCCFPGJ = 2;</code>
     * @return The gAHBDCCFPGJ.
     */
    int getGAHBDCCFPGJ();
  }
  /**
   * Protobuf type {@code TrifleGadget}
   */
  public static final class TrifleGadget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrifleGadget)
      TrifleGadgetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrifleGadget.newBuilder() to construct.
    private TrifleGadget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrifleGadget() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrifleGadget();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrifleGadget(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              emu.grasscutter.net.proto.ItemOuterClass.Item.Builder subBuilder = null;
              if (item_ != null) {
                subBuilder = item_.toBuilder();
              }
              item_ = input.readMessage(emu.grasscutter.net.proto.ItemOuterClass.Item.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(item_);
                item_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              gAHBDCCFPGJ_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TrifleGadgetOuterClass.internal_static_TrifleGadget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TrifleGadgetOuterClass.internal_static_TrifleGadget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.class, emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.Builder.class);
    }

    public static final int ITEM_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.ItemOuterClass.Item item_;
    /**
     * <code>.Item item = 1;</code>
     * @return Whether the item field is set.
     */
    @java.lang.Override
    public boolean hasItem() {
      return item_ != null;
    }
    /**
     * <code>.Item item = 1;</code>
     * @return The item.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemOuterClass.Item getItem() {
      return item_ == null ? emu.grasscutter.net.proto.ItemOuterClass.Item.getDefaultInstance() : item_;
    }
    /**
     * <code>.Item item = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemOrBuilder() {
      return getItem();
    }

    public static final int GAHBDCCFPGJ_FIELD_NUMBER = 2;
    private int gAHBDCCFPGJ_;
    /**
     * <code>uint32 GAHBDCCFPGJ = 2;</code>
     * @return The gAHBDCCFPGJ.
     */
    @java.lang.Override
    public int getGAHBDCCFPGJ() {
      return gAHBDCCFPGJ_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (item_ != null) {
        output.writeMessage(1, getItem());
      }
      if (gAHBDCCFPGJ_ != 0) {
        output.writeUInt32(2, gAHBDCCFPGJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (item_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getItem());
      }
      if (gAHBDCCFPGJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, gAHBDCCFPGJ_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget other = (emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget) obj;

      if (hasItem() != other.hasItem()) return false;
      if (hasItem()) {
        if (!getItem()
            .equals(other.getItem())) return false;
      }
      if (getGAHBDCCFPGJ()
          != other.getGAHBDCCFPGJ()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasItem()) {
        hash = (37 * hash) + ITEM_FIELD_NUMBER;
        hash = (53 * hash) + getItem().hashCode();
      }
      hash = (37 * hash) + GAHBDCCFPGJ_FIELD_NUMBER;
      hash = (53 * hash) + getGAHBDCCFPGJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TrifleGadget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrifleGadget)
        emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadgetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TrifleGadgetOuterClass.internal_static_TrifleGadget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TrifleGadgetOuterClass.internal_static_TrifleGadget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.class, emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (itemBuilder_ == null) {
          item_ = null;
        } else {
          item_ = null;
          itemBuilder_ = null;
        }
        gAHBDCCFPGJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TrifleGadgetOuterClass.internal_static_TrifleGadget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget build() {
        emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget buildPartial() {
        emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget result = new emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget(this);
        if (itemBuilder_ == null) {
          result.item_ = item_;
        } else {
          result.item_ = itemBuilder_.build();
        }
        result.gAHBDCCFPGJ_ = gAHBDCCFPGJ_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget) {
          return mergeFrom((emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget other) {
        if (other == emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget.getDefaultInstance()) return this;
        if (other.hasItem()) {
          mergeItem(other.getItem());
        }
        if (other.getGAHBDCCFPGJ() != 0) {
          setGAHBDCCFPGJ(other.getGAHBDCCFPGJ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ItemOuterClass.Item item_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> itemBuilder_;
      /**
       * <code>.Item item = 1;</code>
       * @return Whether the item field is set.
       */
      public boolean hasItem() {
        return itemBuilder_ != null || item_ != null;
      }
      /**
       * <code>.Item item = 1;</code>
       * @return The item.
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item getItem() {
        if (itemBuilder_ == null) {
          return item_ == null ? emu.grasscutter.net.proto.ItemOuterClass.Item.getDefaultInstance() : item_;
        } else {
          return itemBuilder_.getMessage();
        }
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public Builder setItem(emu.grasscutter.net.proto.ItemOuterClass.Item value) {
        if (itemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          item_ = value;
          onChanged();
        } else {
          itemBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public Builder setItem(
          emu.grasscutter.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemBuilder_ == null) {
          item_ = builderForValue.build();
          onChanged();
        } else {
          itemBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public Builder mergeItem(emu.grasscutter.net.proto.ItemOuterClass.Item value) {
        if (itemBuilder_ == null) {
          if (item_ != null) {
            item_ =
              emu.grasscutter.net.proto.ItemOuterClass.Item.newBuilder(item_).mergeFrom(value).buildPartial();
          } else {
            item_ = value;
          }
          onChanged();
        } else {
          itemBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public Builder clearItem() {
        if (itemBuilder_ == null) {
          item_ = null;
          onChanged();
        } else {
          item_ = null;
          itemBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item.Builder getItemBuilder() {
        
        onChanged();
        return getItemFieldBuilder().getBuilder();
      }
      /**
       * <code>.Item item = 1;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemOrBuilder() {
        if (itemBuilder_ != null) {
          return itemBuilder_.getMessageOrBuilder();
        } else {
          return item_ == null ?
              emu.grasscutter.net.proto.ItemOuterClass.Item.getDefaultInstance() : item_;
        }
      }
      /**
       * <code>.Item item = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> 
          getItemFieldBuilder() {
        if (itemBuilder_ == null) {
          itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder>(
                  getItem(),
                  getParentForChildren(),
                  isClean());
          item_ = null;
        }
        return itemBuilder_;
      }

      private int gAHBDCCFPGJ_ ;
      /**
       * <code>uint32 GAHBDCCFPGJ = 2;</code>
       * @return The gAHBDCCFPGJ.
       */
      @java.lang.Override
      public int getGAHBDCCFPGJ() {
        return gAHBDCCFPGJ_;
      }
      /**
       * <code>uint32 GAHBDCCFPGJ = 2;</code>
       * @param value The gAHBDCCFPGJ to set.
       * @return This builder for chaining.
       */
      public Builder setGAHBDCCFPGJ(int value) {
        
        gAHBDCCFPGJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GAHBDCCFPGJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGAHBDCCFPGJ() {
        
        gAHBDCCFPGJ_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TrifleGadget)
    }

    // @@protoc_insertion_point(class_scope:TrifleGadget)
    private static final emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget();
    }

    public static emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrifleGadget>
        PARSER = new com.google.protobuf.AbstractParser<TrifleGadget>() {
      @java.lang.Override
      public TrifleGadget parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrifleGadget(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrifleGadget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrifleGadget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TrifleGadgetOuterClass.TrifleGadget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrifleGadget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrifleGadget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022TrifleGadget.proto\032\nItem.proto\"8\n\014Trif" +
      "leGadget\022\023\n\004item\030\001 \001(\0132\005.Item\022\023\n\013GAHBDCC" +
      "FPGJ\030\002 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemOuterClass.getDescriptor(),
        });
    internal_static_TrifleGadget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrifleGadget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrifleGadget_descriptor,
        new java.lang.String[] { "Item", "GAHBDCCFPGJ", });
    emu.grasscutter.net.proto.ItemOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
