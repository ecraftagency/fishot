package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class UseItemResquest
        implements io.protostuff.Message<UseItemResquest> {

    private static final UseItemResquest DEFAULT_INSTANCE = newBuilder().build();

    private int itemId;

    private String toUserId;

    private java.util.List<Long> fishes;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UseItemResquest() {
        this.itemId = 0;
        this.toUserId = "";
        this.fishes = java.util.Collections.emptyList();
    }

    private UseItemResquest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UseItemResquest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UseItemResquest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public UseItemResquest withItemId(int value) {
        return UseItemResquest.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public String getToUserId() {
        return toUserId;
    }

    public boolean hasToUserId() {
        return (__bitField0 & 2) == 2;
    }

    public UseItemResquest withToUserId(String value) {
        return UseItemResquest.newBuilder()
            .mergeFrom(this)
            .setToUserId(value)
            .build();
    }

    public java.util.List<Long> getFishesList() {
        return fishes;
    }

    public int getFishesCount() {
        return fishes.size();
    }

    public long getFishes(int index) {
        return fishes.get(index);
    }

    public UseItemResquest withFishes(java.util.List<Long> value) {
        return UseItemResquest.newBuilder()
            .mergeFrom(this)
            .clearFishes()
            .addAllFishes(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UseItemResquest> cachedSchema() {
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
        UseItemResquest that = (UseItemResquest) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fishes, that.fishes)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.itemId);
        result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
        result = 31 * result + (this.fishes == null ? 0 : this.fishes.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasToUserId()) {
            parts.add("toUserId=" + getToUserId());
        }
        if (!fishes.isEmpty()) {
            parts.add("fishes=" + getFishesList());
        }
        return "UseItemResquest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UseItemResquest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        	__fieldMap.put("toUserId", 2);
        	__fieldMap.put("fishes", 3);
        }

        @Override
        public UseItemResquest newMessage() {
            return new UseItemResquest();
        }

        @Override
        public Class<UseItemResquest> typeClass() {
            return UseItemResquest.class;
        }

        @Override
        public String messageName() {
            return UseItemResquest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UseItemResquest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UseItemResquest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UseItemResquest instance) throws java.io.IOException {
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
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.toUserId = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.fishes = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.fishes.add(input.readInt64());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.fishes = java.util.Collections.unmodifiableList(instance.fishes);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, UseItemResquest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.itemId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.toUserId, false);
            }

            for(long fishes : instance.fishes) {
                output.writeInt64(3, fishes, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
        		case 2: return "toUserId";
        		case 3: return "fishes";
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

        private int itemId;

        private String toUserId;

        private java.util.List<Long> fishes;

        private int __bitField0;

        private Builder() {
            this.itemId = 0;
            this.toUserId = "";
            this.fishes = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(UseItemResquest instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasToUserId()) {
                this.setToUserId(instance.getToUserId());
            }

            this.addAllFishes(instance.getFishesList());

            return this;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 1) == 1;
        }

        public String getToUserId() {
            return toUserId;
        }

        public Builder setToUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UseItemResquest#toUserId to null");
            }

            this.toUserId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearToUserId() {
            this.toUserId = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasToUserId() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<Long> getFishesList() {
            return fishes;
        }

        public Builder setFishes(int index, long value) {
            if(!((__bitField0 & 4) == 4)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fishes.set(index, value);
            return this;
        }

        public Builder addFishes(long value) {
            if(!((__bitField0 & 4) == 4)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fishes.add(value);
            return this;
        }

        public Builder addAllFishes(java.lang.Iterable<Long> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set UseItemResquest#fishes to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Long value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set UseItemResquest#fishes to null");
                }
                this.fishes.add(value);
            }
            return this;
        }

        public Builder clearFishes() {
            this.fishes = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getFishesCount() {
            return fishes.size();
        }

        public long getFishes(int index) {
            return fishes.get(index);
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
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishes, that.fishes)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.itemId);
            result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
            result = 31 * result + (this.fishes == null ? 0 : this.fishes.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasToUserId()) {
                parts.add("toUserId=" + getToUserId());
            }
            if (!fishes.isEmpty()) {
                parts.add("fishes=" + getFishesList());
            }
            return "UseItemResquest{" + String.join(", ", parts) + "}";
        }

        public UseItemResquest build() {
            proto.message.UseItemResquest result = new proto.message.UseItemResquest();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            result.toUserId = this.toUserId;
            result.fishes = java.util.Collections.unmodifiableList(this.fishes);
            return result;
        }

    }



}