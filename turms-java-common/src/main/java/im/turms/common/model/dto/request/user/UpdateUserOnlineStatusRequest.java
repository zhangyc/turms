// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/update_user_online_status_request.proto

package im.turms.common.model.dto.request.user;

/**
 * Protobuf type {@code im.turms.proto.UpdateUserOnlineStatusRequest}
 */
public  final class UpdateUserOnlineStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateUserOnlineStatusRequest)
    UpdateUserOnlineStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserOnlineStatusRequest.newBuilder() to construct.
  private UpdateUserOnlineStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserOnlineStatusRequest() {
    userStatus_ = 0;
    deviceTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserOnlineStatusRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateUserOnlineStatusRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            userStatus_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              deviceTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            deviceTypes_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                deviceTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              deviceTypes_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        deviceTypes_ = java.util.Collections.unmodifiableList(deviceTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOuterClass.internal_static_im_turms_proto_UpdateUserOnlineStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOuterClass.internal_static_im_turms_proto_UpdateUserOnlineStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.class, im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.Builder.class);
  }

  public static final int USER_STATUS_FIELD_NUMBER = 1;
  private int userStatus_;
  /**
   * <code>.im.turms.proto.UserStatus user_status = 1;</code>
   * @return The enum numeric value on the wire for userStatus.
   */
  public int getUserStatusValue() {
    return userStatus_;
  }
  /**
   * <code>.im.turms.proto.UserStatus user_status = 1;</code>
   * @return The userStatus.
   */
  public im.turms.common.constant.UserStatus getUserStatus() {
    @SuppressWarnings("deprecation")
    im.turms.common.constant.UserStatus result = im.turms.common.constant.UserStatus.valueOf(userStatus_);
    return result == null ? im.turms.common.constant.UserStatus.UNRECOGNIZED : result;
  }

  public static final int DEVICE_TYPES_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> deviceTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, im.turms.common.constant.DeviceType> deviceTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, im.turms.common.constant.DeviceType>() {
            public im.turms.common.constant.DeviceType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              im.turms.common.constant.DeviceType result = im.turms.common.constant.DeviceType.valueOf(from);
              return result == null ? im.turms.common.constant.DeviceType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
   * @return A list containing the deviceTypes.
   */
  public java.util.List<im.turms.common.constant.DeviceType> getDeviceTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, im.turms.common.constant.DeviceType>(deviceTypes_, deviceTypes_converter_);
  }
  /**
   * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
   * @return The count of deviceTypes.
   */
  public int getDeviceTypesCount() {
    return deviceTypes_.size();
  }
  /**
   * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
   * @param index The index of the element to return.
   * @return The deviceTypes at the given index.
   */
  public im.turms.common.constant.DeviceType getDeviceTypes(int index) {
    return deviceTypes_converter_.convert(deviceTypes_.get(index));
  }
  /**
   * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
   * @return A list containing the enum numeric values on the wire for deviceTypes.
   */
  public java.util.List<java.lang.Integer>
  getDeviceTypesValueList() {
    return deviceTypes_;
  }
  /**
   * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of deviceTypes at the given index.
   */
  public int getDeviceTypesValue(int index) {
    return deviceTypes_.get(index);
  }
  private int deviceTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (userStatus_ != im.turms.common.constant.UserStatus.AVAILABLE.getNumber()) {
      output.writeEnum(1, userStatus_);
    }
    if (getDeviceTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(deviceTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < deviceTypes_.size(); i++) {
      output.writeEnumNoTag(deviceTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userStatus_ != im.turms.common.constant.UserStatus.AVAILABLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, userStatus_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < deviceTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(deviceTypes_.get(i));
      }
      size += dataSize;
      if (!getDeviceTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }deviceTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest other = (im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest) obj;

    if (userStatus_ != other.userStatus_) return false;
    if (!deviceTypes_.equals(other.deviceTypes_)) return false;
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
    hash = (37 * hash) + USER_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + userStatus_;
    if (getDeviceTypesCount() > 0) {
      hash = (37 * hash) + DEVICE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + deviceTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest prototype) {
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
   * Protobuf type {@code im.turms.proto.UpdateUserOnlineStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateUserOnlineStatusRequest)
      im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOuterClass.internal_static_im_turms_proto_UpdateUserOnlineStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOuterClass.internal_static_im_turms_proto_UpdateUserOnlineStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.class, im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.newBuilder()
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
      userStatus_ = 0;

      deviceTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequestOuterClass.internal_static_im_turms_proto_UpdateUserOnlineStatusRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest build() {
      im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest buildPartial() {
      im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest result = new im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest(this);
      int from_bitField0_ = bitField0_;
      result.userStatus_ = userStatus_;
      if (((bitField0_ & 0x00000001) != 0)) {
        deviceTypes_ = java.util.Collections.unmodifiableList(deviceTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.deviceTypes_ = deviceTypes_;
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
      if (other instanceof im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest) {
        return mergeFrom((im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest other) {
      if (other == im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest.getDefaultInstance()) return this;
      if (other.userStatus_ != 0) {
        setUserStatusValue(other.getUserStatusValue());
      }
      if (!other.deviceTypes_.isEmpty()) {
        if (deviceTypes_.isEmpty()) {
          deviceTypes_ = other.deviceTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDeviceTypesIsMutable();
          deviceTypes_.addAll(other.deviceTypes_);
        }
        onChanged();
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
      im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int userStatus_ = 0;
    /**
     * <code>.im.turms.proto.UserStatus user_status = 1;</code>
     * @return The enum numeric value on the wire for userStatus.
     */
    public int getUserStatusValue() {
      return userStatus_;
    }
    /**
     * <code>.im.turms.proto.UserStatus user_status = 1;</code>
     * @param value The enum numeric value on the wire for userStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUserStatusValue(int value) {
      userStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.im.turms.proto.UserStatus user_status = 1;</code>
     * @return The userStatus.
     */
    public im.turms.common.constant.UserStatus getUserStatus() {
      @SuppressWarnings("deprecation")
      im.turms.common.constant.UserStatus result = im.turms.common.constant.UserStatus.valueOf(userStatus_);
      return result == null ? im.turms.common.constant.UserStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.im.turms.proto.UserStatus user_status = 1;</code>
     * @param value The userStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUserStatus(im.turms.common.constant.UserStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      userStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.im.turms.proto.UserStatus user_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserStatus() {
      
      userStatus_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> deviceTypes_ =
      java.util.Collections.emptyList();
    private void ensureDeviceTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deviceTypes_ = new java.util.ArrayList<java.lang.Integer>(deviceTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @return A list containing the deviceTypes.
     */
    public java.util.List<im.turms.common.constant.DeviceType> getDeviceTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, im.turms.common.constant.DeviceType>(deviceTypes_, deviceTypes_converter_);
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @return The count of deviceTypes.
     */
    public int getDeviceTypesCount() {
      return deviceTypes_.size();
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param index The index of the element to return.
     * @return The deviceTypes at the given index.
     */
    public im.turms.common.constant.DeviceType getDeviceTypes(int index) {
      return deviceTypes_converter_.convert(deviceTypes_.get(index));
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param index The index to set the value at.
     * @param value The deviceTypes to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypes(
        int index, im.turms.common.constant.DeviceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeviceTypesIsMutable();
      deviceTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param value The deviceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addDeviceTypes(im.turms.common.constant.DeviceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeviceTypesIsMutable();
      deviceTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param values The deviceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeviceTypes(
        java.lang.Iterable<? extends im.turms.common.constant.DeviceType> values) {
      ensureDeviceTypesIsMutable();
      for (im.turms.common.constant.DeviceType value : values) {
        deviceTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceTypes() {
      deviceTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @return A list containing the enum numeric values on the wire for deviceTypes.
     */
    public java.util.List<java.lang.Integer>
    getDeviceTypesValueList() {
      return java.util.Collections.unmodifiableList(deviceTypes_);
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of deviceTypes at the given index.
     */
    public int getDeviceTypesValue(int index) {
      return deviceTypes_.get(index);
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of deviceTypes at the given index.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypesValue(
        int index, int value) {
      ensureDeviceTypesIsMutable();
      deviceTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param value The enum numeric value on the wire for deviceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addDeviceTypesValue(int value) {
      ensureDeviceTypesIsMutable();
      deviceTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.DeviceType device_types = 2;</code>
     * @param values The enum numeric values on the wire for deviceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeviceTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDeviceTypesIsMutable();
      for (int value : values) {
        deviceTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateUserOnlineStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateUserOnlineStatusRequest)
  private static final im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest();
  }

  public static im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserOnlineStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserOnlineStatusRequest>() {
    @java.lang.Override
    public UpdateUserOnlineStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateUserOnlineStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateUserOnlineStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserOnlineStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.user.UpdateUserOnlineStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

