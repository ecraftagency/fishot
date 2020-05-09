package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class OrbitData
        implements io.protostuff.Message<OrbitData> {

    private static final OrbitData DEFAULT_INSTANCE = newBuilder().build();

    private int orbitId;

    private String orbitData;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OrbitData() {
        this.orbitId = 0;
        this.orbitData = "";
    }

    private OrbitData(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OrbitData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OrbitData> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getOrbitId() {
        return orbitId;
    }

    public boolean hasOrbitId() {
        return (__bitField0 & 1) == 1;
    }

    public OrbitData withOrbitId(int value) {
        return OrbitData.newBuilder()
            .mergeFrom(this)
            .setOrbitId(value)
            .build();
    }

    public String getOrbitData() {
        return orbitData;
    }

    public boolean hasOrbitData() {
        return (__bitField0 & 2) == 2;
    }

    public OrbitData withOrbitData(String value) {
        return OrbitData.newBuilder()
            .mergeFrom(this)
            .setOrbitData(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OrbitData> cachedSchema() {
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
        OrbitData that = (OrbitData) obj;
        if (!java.util.Objects.equals(this.orbitId, that.orbitId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orbitData, that.orbitData)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.orbitId);
        result = 31 * result + (this.orbitData == null ? 0 : this.orbitData.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasOrbitId()) {
            parts.add("orbitId=" + getOrbitId());
        }
        if (hasOrbitData()) {
            parts.add("orbitData=" + getOrbitData());
        }
        return "OrbitData{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OrbitData>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("orbitId", 1);
        	__fieldMap.put("orbitData", 2);
        }

        @Override
        public OrbitData newMessage() {
            return new OrbitData();
        }

        @Override
        public Class<OrbitData> typeClass() {
            return OrbitData.class;
        }

        @Override
        public String messageName() {
            return OrbitData.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OrbitData.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OrbitData message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OrbitData instance) throws java.io.IOException {
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
                    	instance.orbitId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.orbitData = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, OrbitData instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.orbitId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.orbitData, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "orbitId";
        		case 2: return "orbitData";
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

        private int orbitId;

        private String orbitData;

        private int __bitField0;

        private Builder() {
            this.orbitId = 0;
            this.orbitData = "";
        }

        public Builder mergeFrom(OrbitData instance) {
            if (instance.hasOrbitId()) {
                this.setOrbitId(instance.getOrbitId());
            }

            if (instance.hasOrbitData()) {
                this.setOrbitData(instance.getOrbitData());
            }

            return this;
        }

        public int getOrbitId() {
            return orbitId;
        }

        public Builder setOrbitId(int value) {
            this.orbitId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearOrbitId() {
            this.orbitId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasOrbitId() {
            return (__bitField0 & 1) == 1;
        }

        public String getOrbitData() {
            return orbitData;
        }

        public Builder setOrbitData(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OrbitData#orbitData to null");
            }

            this.orbitData = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearOrbitData() {
            this.orbitData = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasOrbitData() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.orbitId, that.orbitId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orbitData, that.orbitData)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.orbitId);
            result = 31 * result + (this.orbitData == null ? 0 : this.orbitData.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasOrbitId()) {
                parts.add("orbitId=" + getOrbitId());
            }
            if (hasOrbitData()) {
                parts.add("orbitData=" + getOrbitData());
            }
            return "OrbitData{" + String.join(", ", parts) + "}";
        }

        public OrbitData build() {
            proto.message.OrbitData result = new proto.message.OrbitData();
            result.__bitField0 = __bitField0;
            result.orbitId = this.orbitId;
            result.orbitData = this.orbitData;
            return result;
        }

    }



}