package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class NetworkLoggerRequest
        implements io.protostuff.Message<NetworkLoggerRequest> {

    private static final NetworkLoggerRequest DEFAULT_INSTANCE = newBuilder().build();

    private int count;

    private int minLatency;

    private int maxLatency;

    private int averageLatency;

    private long sendTimestamp;

    private int disconnectCount;

    private int connectionType;

    private int networkudplost;

    private String osPlatform;

    private boolean __merge_lock = false;
    private int __bitField0;

    private NetworkLoggerRequest() {
        this.count = 0;
        this.minLatency = 0;
        this.maxLatency = 0;
        this.averageLatency = 0;
        this.sendTimestamp = 0L;
        this.disconnectCount = 0;
        this.connectionType = 0;
        this.networkudplost = 0;
        this.osPlatform = "";
    }

    private NetworkLoggerRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static NetworkLoggerRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<NetworkLoggerRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getCount() {
        return count;
    }

    public boolean hasCount() {
        return (__bitField0 & 1) == 1;
    }

    public NetworkLoggerRequest withCount(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setCount(value)
            .build();
    }

    public int getMinLatency() {
        return minLatency;
    }

    public boolean hasMinLatency() {
        return (__bitField0 & 2) == 2;
    }

    public NetworkLoggerRequest withMinLatency(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setMinLatency(value)
            .build();
    }

    public int getMaxLatency() {
        return maxLatency;
    }

    public boolean hasMaxLatency() {
        return (__bitField0 & 4) == 4;
    }

    public NetworkLoggerRequest withMaxLatency(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setMaxLatency(value)
            .build();
    }

    public int getAverageLatency() {
        return averageLatency;
    }

    public boolean hasAverageLatency() {
        return (__bitField0 & 8) == 8;
    }

    public NetworkLoggerRequest withAverageLatency(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setAverageLatency(value)
            .build();
    }

    public long getSendTimestamp() {
        return sendTimestamp;
    }

    public boolean hasSendTimestamp() {
        return (__bitField0 & 16) == 16;
    }

    public NetworkLoggerRequest withSendTimestamp(long value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setSendTimestamp(value)
            .build();
    }

    public int getDisconnectCount() {
        return disconnectCount;
    }

    public boolean hasDisconnectCount() {
        return (__bitField0 & 32) == 32;
    }

    public NetworkLoggerRequest withDisconnectCount(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setDisconnectCount(value)
            .build();
    }

    public int getConnectionType() {
        return connectionType;
    }

    public boolean hasConnectionType() {
        return (__bitField0 & 64) == 64;
    }

    public NetworkLoggerRequest withConnectionType(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setConnectionType(value)
            .build();
    }

    public int getNetworkudplost() {
        return networkudplost;
    }

    public boolean hasNetworkudplost() {
        return (__bitField0 & 128) == 128;
    }

    public NetworkLoggerRequest withNetworkudplost(int value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setNetworkudplost(value)
            .build();
    }

    public String getOsPlatform() {
        return osPlatform;
    }

    public boolean hasOsPlatform() {
        return (__bitField0 & 256) == 256;
    }

    public NetworkLoggerRequest withOsPlatform(String value) {
        return NetworkLoggerRequest.newBuilder()
            .mergeFrom(this)
            .setOsPlatform(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<NetworkLoggerRequest> cachedSchema() {
        return Schema.INSTANCE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        NetworkLoggerRequest that = (NetworkLoggerRequest) obj;
        if (!java.util.Objects.equals(this.count, that.count)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minLatency, that.minLatency)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxLatency, that.maxLatency)) {
            return false;
        }
        if (!java.util.Objects.equals(this.averageLatency, that.averageLatency)) {
            return false;
        }
        if (!java.util.Objects.equals(this.sendTimestamp, that.sendTimestamp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.disconnectCount, that.disconnectCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.connectionType, that.connectionType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkudplost, that.networkudplost)) {
            return false;
        }
        if (!java.util.Objects.equals(this.osPlatform, that.osPlatform)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.count);
        result = 31 * result + Integer.hashCode(this.minLatency);
        result = 31 * result + Integer.hashCode(this.maxLatency);
        result = 31 * result + Integer.hashCode(this.averageLatency);
        result = 31 * result + Long.hashCode(this.sendTimestamp);
        result = 31 * result + Integer.hashCode(this.disconnectCount);
        result = 31 * result + Integer.hashCode(this.connectionType);
        result = 31 * result + Integer.hashCode(this.networkudplost);
        result = 31 * result + (this.osPlatform == null ? 0 : this.osPlatform.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCount()) {
            parts.add("count=" + getCount());
        }
        if (hasMinLatency()) {
            parts.add("minLatency=" + getMinLatency());
        }
        if (hasMaxLatency()) {
            parts.add("maxLatency=" + getMaxLatency());
        }
        if (hasAverageLatency()) {
            parts.add("averageLatency=" + getAverageLatency());
        }
        if (hasSendTimestamp()) {
            parts.add("sendTimestamp=" + getSendTimestamp());
        }
        if (hasDisconnectCount()) {
            parts.add("disconnectCount=" + getDisconnectCount());
        }
        if (hasConnectionType()) {
            parts.add("connectionType=" + getConnectionType());
        }
        if (hasNetworkudplost()) {
            parts.add("networkudplost=" + getNetworkudplost());
        }
        if (hasOsPlatform()) {
            parts.add("osPlatform=" + getOsPlatform());
        }
        return "NetworkLoggerRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<NetworkLoggerRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("count", 1);
        	__fieldMap.put("minLatency", 2);
        	__fieldMap.put("maxLatency", 3);
        	__fieldMap.put("averageLatency", 4);
        	__fieldMap.put("sendTimestamp", 5);
        	__fieldMap.put("disconnectCount", 6);
        	__fieldMap.put("connectionType", 7);
        	__fieldMap.put("networkudplost", 8);
        	__fieldMap.put("osPlatform", 9);
        }

        @Override
        public NetworkLoggerRequest newMessage() {
            return new NetworkLoggerRequest();
        }

        @Override
        public Class<NetworkLoggerRequest> typeClass() {
            return NetworkLoggerRequest.class;
        }

        @Override
        public String messageName() {
            return NetworkLoggerRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return NetworkLoggerRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(NetworkLoggerRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, NetworkLoggerRequest instance) throws java.io.IOException {
        	if (instance.__merge_lock) {
        		throw new IllegalStateException("Cannot reuse message instance");
        	} else {
        		instance.__merge_lock = true;
        	}
        	while(true) {
        		int number = input.readFieldNumber(this);
                if (number == 0) {
                    break;
                }
                switch(number) {
                    case 1:
                    	instance.count = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.minLatency = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.maxLatency = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.averageLatency = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.sendTimestamp = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.disconnectCount = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.connectionType = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.networkudplost = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.osPlatform = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, NetworkLoggerRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.count, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.minLatency, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.maxLatency, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.averageLatency, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt64(5, instance.sendTimestamp, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.disconnectCount, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.connectionType, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.networkudplost, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.osPlatform, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "count";
        		case 2: return "minLatency";
        		case 3: return "maxLatency";
        		case 4: return "averageLatency";
        		case 5: return "sendTimestamp";
        		case 6: return "disconnectCount";
        		case 7: return "connectionType";
        		case 8: return "networkudplost";
        		case 9: return "osPlatform";
        		default: return null;
        	}
        }

        @Override
        public int getFieldNumber(String name) {
        	final Integer number = __fieldMap.get(name);
        	return number == null ? 0 : number.intValue();
        }

    }

    public static final class Builder  {

        private int count;

        private int minLatency;

        private int maxLatency;

        private int averageLatency;

        private long sendTimestamp;

        private int disconnectCount;

        private int connectionType;

        private int networkudplost;

        private String osPlatform;

        private int __bitField0;

        private Builder() {
            this.count = 0;
            this.minLatency = 0;
            this.maxLatency = 0;
            this.averageLatency = 0;
            this.sendTimestamp = 0L;
            this.disconnectCount = 0;
            this.connectionType = 0;
            this.networkudplost = 0;
            this.osPlatform = "";
        }

        public Builder mergeFrom(NetworkLoggerRequest instance) {
            if (instance.hasCount()) {
                this.setCount(instance.getCount());
            }

            if (instance.hasMinLatency()) {
                this.setMinLatency(instance.getMinLatency());
            }

            if (instance.hasMaxLatency()) {
                this.setMaxLatency(instance.getMaxLatency());
            }

            if (instance.hasAverageLatency()) {
                this.setAverageLatency(instance.getAverageLatency());
            }

            if (instance.hasSendTimestamp()) {
                this.setSendTimestamp(instance.getSendTimestamp());
            }

            if (instance.hasDisconnectCount()) {
                this.setDisconnectCount(instance.getDisconnectCount());
            }

            if (instance.hasConnectionType()) {
                this.setConnectionType(instance.getConnectionType());
            }

            if (instance.hasNetworkudplost()) {
                this.setNetworkudplost(instance.getNetworkudplost());
            }

            if (instance.hasOsPlatform()) {
                this.setOsPlatform(instance.getOsPlatform());
            }

            return this;
        }

        public int getCount() {
            return count;
        }

        public Builder setCount(int value) {
            this.count = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCount() {
            this.count = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCount() {
            return (__bitField0 & 1) == 1;
        }

        public int getMinLatency() {
            return minLatency;
        }

        public Builder setMinLatency(int value) {
            this.minLatency = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMinLatency() {
            this.minLatency = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMinLatency() {
            return (__bitField0 & 2) == 2;
        }

        public int getMaxLatency() {
            return maxLatency;
        }

        public Builder setMaxLatency(int value) {
            this.maxLatency = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMaxLatency() {
            this.maxLatency = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMaxLatency() {
            return (__bitField0 & 4) == 4;
        }

        public int getAverageLatency() {
            return averageLatency;
        }

        public Builder setAverageLatency(int value) {
            this.averageLatency = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearAverageLatency() {
            this.averageLatency = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasAverageLatency() {
            return (__bitField0 & 8) == 8;
        }

        public long getSendTimestamp() {
            return sendTimestamp;
        }

        public Builder setSendTimestamp(long value) {
            this.sendTimestamp = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSendTimestamp() {
            this.sendTimestamp = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSendTimestamp() {
            return (__bitField0 & 16) == 16;
        }

        public int getDisconnectCount() {
            return disconnectCount;
        }

        public Builder setDisconnectCount(int value) {
            this.disconnectCount = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearDisconnectCount() {
            this.disconnectCount = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasDisconnectCount() {
            return (__bitField0 & 32) == 32;
        }

        public int getConnectionType() {
            return connectionType;
        }

        public Builder setConnectionType(int value) {
            this.connectionType = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearConnectionType() {
            this.connectionType = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasConnectionType() {
            return (__bitField0 & 64) == 64;
        }

        public int getNetworkudplost() {
            return networkudplost;
        }

        public Builder setNetworkudplost(int value) {
            this.networkudplost = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearNetworkudplost() {
            this.networkudplost = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasNetworkudplost() {
            return (__bitField0 & 128) == 128;
        }

        public String getOsPlatform() {
            return osPlatform;
        }

        public Builder setOsPlatform(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NetworkLoggerRequest#osPlatform to null");
            }

            this.osPlatform = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearOsPlatform() {
            this.osPlatform = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasOsPlatform() {
            return (__bitField0 & 256) == 256;
        }




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.count, that.count)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minLatency, that.minLatency)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxLatency, that.maxLatency)) {
                return false;
            }
            if (!java.util.Objects.equals(this.averageLatency, that.averageLatency)) {
                return false;
            }
            if (!java.util.Objects.equals(this.sendTimestamp, that.sendTimestamp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.disconnectCount, that.disconnectCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.connectionType, that.connectionType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkudplost, that.networkudplost)) {
                return false;
            }
            if (!java.util.Objects.equals(this.osPlatform, that.osPlatform)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.count);
            result = 31 * result + Integer.hashCode(this.minLatency);
            result = 31 * result + Integer.hashCode(this.maxLatency);
            result = 31 * result + Integer.hashCode(this.averageLatency);
            result = 31 * result + Long.hashCode(this.sendTimestamp);
            result = 31 * result + Integer.hashCode(this.disconnectCount);
            result = 31 * result + Integer.hashCode(this.connectionType);
            result = 31 * result + Integer.hashCode(this.networkudplost);
            result = 31 * result + (this.osPlatform == null ? 0 : this.osPlatform.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCount()) {
                parts.add("count=" + getCount());
            }
            if (hasMinLatency()) {
                parts.add("minLatency=" + getMinLatency());
            }
            if (hasMaxLatency()) {
                parts.add("maxLatency=" + getMaxLatency());
            }
            if (hasAverageLatency()) {
                parts.add("averageLatency=" + getAverageLatency());
            }
            if (hasSendTimestamp()) {
                parts.add("sendTimestamp=" + getSendTimestamp());
            }
            if (hasDisconnectCount()) {
                parts.add("disconnectCount=" + getDisconnectCount());
            }
            if (hasConnectionType()) {
                parts.add("connectionType=" + getConnectionType());
            }
            if (hasNetworkudplost()) {
                parts.add("networkudplost=" + getNetworkudplost());
            }
            if (hasOsPlatform()) {
                parts.add("osPlatform=" + getOsPlatform());
            }
            return "NetworkLoggerRequest{" + String.join(", ", parts) + "}";
        }

        public NetworkLoggerRequest build() {
            proto.message.NetworkLoggerRequest result = new proto.message.NetworkLoggerRequest();
            result.__bitField0 = __bitField0;
            result.count = this.count;
            result.minLatency = this.minLatency;
            result.maxLatency = this.maxLatency;
            result.averageLatency = this.averageLatency;
            result.sendTimestamp = this.sendTimestamp;
            result.disconnectCount = this.disconnectCount;
            result.connectionType = this.connectionType;
            result.networkudplost = this.networkudplost;
            result.osPlatform = this.osPlatform;
            return result;
        }

    }



}