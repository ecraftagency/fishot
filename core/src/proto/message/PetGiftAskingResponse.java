package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetGiftAskingResponse
        implements io.protostuff.Message<PetGiftAskingResponse> {

    private static final PetGiftAskingResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.PetGift> gifts;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetGiftAskingResponse() {
        this.gifts = java.util.Collections.emptyList();
    }

    private PetGiftAskingResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetGiftAskingResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetGiftAskingResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.PetGift> getGiftsList() {
        return gifts;
    }

    public int getGiftsCount() {
        return gifts.size();
    }

    public proto.message.PetGift getGifts(int index) {
        return gifts.get(index);
    }

    public PetGiftAskingResponse withGifts(java.util.List<proto.message.PetGift> value) {
        return PetGiftAskingResponse.newBuilder()
            .mergeFrom(this)
            .clearGifts()
            .addAllGifts(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetGiftAskingResponse> cachedSchema() {
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
        PetGiftAskingResponse that = (PetGiftAskingResponse) obj;
        if (!java.util.Objects.equals(this.gifts, that.gifts)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!gifts.isEmpty()) {
            parts.add("gifts=" + getGiftsList());
        }
        return "PetGiftAskingResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetGiftAskingResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gifts", 1);
        }

        @Override
        public PetGiftAskingResponse newMessage() {
            return new PetGiftAskingResponse();
        }

        @Override
        public Class<PetGiftAskingResponse> typeClass() {
            return PetGiftAskingResponse.class;
        }

        @Override
        public String messageName() {
            return PetGiftAskingResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetGiftAskingResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetGiftAskingResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetGiftAskingResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.gifts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.gifts.add(input.mergeObject(null, proto.message.PetGift.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.gifts = java.util.Collections.unmodifiableList(instance.gifts);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, PetGiftAskingResponse instance) throws java.io.IOException {
            for(proto.message.PetGift gifts : instance.gifts) {
                output.writeObject(1, gifts, proto.message.PetGift.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gifts";
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

        private java.util.List<proto.message.PetGift> gifts;

        private int __bitField0;

        private Builder() {
            this.gifts = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(PetGiftAskingResponse instance) {
            this.addAllGifts(instance.getGiftsList());

            return this;
        }

        public java.util.List<proto.message.PetGift> getGiftsList() {
            return gifts;
        }

        public Builder setGifts(int index, proto.message.PetGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetGiftAskingResponse#gifts to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.gifts.set(index, value);
            return this;
        }

        public Builder addGifts(proto.message.PetGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetGiftAskingResponse#gifts to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.gifts.add(value);
            return this;
        }

        public Builder addAllGifts(java.lang.Iterable<proto.message.PetGift> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set PetGiftAskingResponse#gifts to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.PetGift value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set PetGiftAskingResponse#gifts to null");
                }
                this.gifts.add(value);
            }
            return this;
        }

        public Builder clearGifts() {
            this.gifts = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getGiftsCount() {
            return gifts.size();
        }

        public proto.message.PetGift getGifts(int index) {
            return gifts.get(index);
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
            if (!java.util.Objects.equals(this.gifts, that.gifts)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!gifts.isEmpty()) {
                parts.add("gifts=" + getGiftsList());
            }
            return "PetGiftAskingResponse{" + String.join(", ", parts) + "}";
        }

        public PetGiftAskingResponse build() {
            proto.message.PetGiftAskingResponse result = new proto.message.PetGiftAskingResponse();
            result.__bitField0 = __bitField0;
            result.gifts = java.util.Collections.unmodifiableList(this.gifts);
            return result;
        }

    }



}