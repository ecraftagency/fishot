package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMInfoResponse
        implements io.protostuff.Message<HPLOMInfoResponse> {

    private static final HPLOMInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.HPIAPInfo> items;

    private java.util.List<Float> newHappyPlayEventPercent;

    private float newHappyPlayPetPercent;

    private float minMoneyUnit;

    private float minTicketUnit;

    private java.util.List<String> listChannel;

    private float promotionPercent;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMInfoResponse() {
        this.items = java.util.Collections.emptyList();
        this.newHappyPlayEventPercent = java.util.Collections.emptyList();
        this.newHappyPlayPetPercent = 0f;
        this.minMoneyUnit = 0f;
        this.minTicketUnit = 0f;
        this.listChannel = java.util.Collections.emptyList();
        this.promotionPercent = 0f;
    }

    private HPLOMInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.HPIAPInfo> getItemsList() {
        return items;
    }

    public int getItemsCount() {
        return items.size();
    }

    public proto.message.HPIAPInfo getItems(int index) {
        return items.get(index);
    }

    public HPLOMInfoResponse withItems(java.util.List<proto.message.HPIAPInfo> value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearItems()
            .addAllItems(value)
            .build();
    }

    public java.util.List<Float> getNewHappyPlayEventPercentList() {
        return newHappyPlayEventPercent;
    }

    public int getNewHappyPlayEventPercentCount() {
        return newHappyPlayEventPercent.size();
    }

    public float getNewHappyPlayEventPercent(int index) {
        return newHappyPlayEventPercent.get(index);
    }

    public HPLOMInfoResponse withNewHappyPlayEventPercent(java.util.List<Float> value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearNewHappyPlayEventPercent()
            .addAllNewHappyPlayEventPercent(value)
            .build();
    }

    public float getNewHappyPlayPetPercent() {
        return newHappyPlayPetPercent;
    }

    public boolean hasNewHappyPlayPetPercent() {
        return (__bitField0 & 4) == 4;
    }

    public HPLOMInfoResponse withNewHappyPlayPetPercent(float value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .setNewHappyPlayPetPercent(value)
            .build();
    }

    public float getMinMoneyUnit() {
        return minMoneyUnit;
    }

    public boolean hasMinMoneyUnit() {
        return (__bitField0 & 8) == 8;
    }

    public HPLOMInfoResponse withMinMoneyUnit(float value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .setMinMoneyUnit(value)
            .build();
    }

    public float getMinTicketUnit() {
        return minTicketUnit;
    }

    public boolean hasMinTicketUnit() {
        return (__bitField0 & 16) == 16;
    }

    public HPLOMInfoResponse withMinTicketUnit(float value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .setMinTicketUnit(value)
            .build();
    }

    public java.util.List<String> getListChannelList() {
        return listChannel;
    }

    public int getListChannelCount() {
        return listChannel.size();
    }

    public String getListChannel(int index) {
        return listChannel.get(index);
    }

    public HPLOMInfoResponse withListChannel(java.util.List<String> value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearListChannel()
            .addAllListChannel(value)
            .build();
    }

    public float getPromotionPercent() {
        return promotionPercent;
    }

    public boolean hasPromotionPercent() {
        return (__bitField0 & 64) == 64;
    }

    public HPLOMInfoResponse withPromotionPercent(float value) {
        return HPLOMInfoResponse.newBuilder()
            .mergeFrom(this)
            .setPromotionPercent(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMInfoResponse> cachedSchema() {
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
        HPLOMInfoResponse that = (HPLOMInfoResponse) obj;
        if (!java.util.Objects.equals(this.items, that.items)) {
            return false;
        }
        if (!java.util.Objects.equals(this.newHappyPlayEventPercent, that.newHappyPlayEventPercent)) {
            return false;
        }
        if (!java.util.Objects.equals(this.newHappyPlayPetPercent, that.newHappyPlayPetPercent)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minMoneyUnit, that.minMoneyUnit)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minTicketUnit, that.minTicketUnit)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listChannel, that.listChannel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.promotionPercent, that.promotionPercent)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.items == null ? 0 : this.items.hashCode());
        result = 31 * result + (this.newHappyPlayEventPercent == null ? 0 : this.newHappyPlayEventPercent.hashCode());
        result = 31 * result + Float.hashCode(this.newHappyPlayPetPercent);
        result = 31 * result + Float.hashCode(this.minMoneyUnit);
        result = 31 * result + Float.hashCode(this.minTicketUnit);
        result = 31 * result + (this.listChannel == null ? 0 : this.listChannel.hashCode());
        result = 31 * result + Float.hashCode(this.promotionPercent);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!items.isEmpty()) {
            parts.add("items=" + getItemsList());
        }
        if (!newHappyPlayEventPercent.isEmpty()) {
            parts.add("newHappyPlayEventPercent=" + getNewHappyPlayEventPercentList());
        }
        if (hasNewHappyPlayPetPercent()) {
            parts.add("newHappyPlayPetPercent=" + getNewHappyPlayPetPercent());
        }
        if (hasMinMoneyUnit()) {
            parts.add("minMoneyUnit=" + getMinMoneyUnit());
        }
        if (hasMinTicketUnit()) {
            parts.add("minTicketUnit=" + getMinTicketUnit());
        }
        if (!listChannel.isEmpty()) {
            parts.add("listChannel=" + getListChannelList());
        }
        if (hasPromotionPercent()) {
            parts.add("promotionPercent=" + getPromotionPercent());
        }
        return "HPLOMInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("items", 1);
        	__fieldMap.put("newHappyPlayEventPercent", 2);
        	__fieldMap.put("newHappyPlayPetPercent", 3);
        	__fieldMap.put("minMoneyUnit", 4);
        	__fieldMap.put("minTicketUnit", 5);
        	__fieldMap.put("listChannel", 6);
        	__fieldMap.put("promotionPercent", 7);
        }

        @Override
        public HPLOMInfoResponse newMessage() {
            return new HPLOMInfoResponse();
        }

        @Override
        public Class<HPLOMInfoResponse> typeClass() {
            return HPLOMInfoResponse.class;
        }

        @Override
        public String messageName() {
            return HPLOMInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMInfoResponse instance) throws java.io.IOException {
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
                    	    instance.items = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.items.add(input.mergeObject(null, proto.message.HPIAPInfo.getSchema()));

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.newHappyPlayEventPercent = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.newHappyPlayEventPercent.add(input.readFloat());

                    	break;
                    case 3:
                    	instance.newHappyPlayPetPercent = input.readFloat();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.minMoneyUnit = input.readFloat();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.minTicketUnit = input.readFloat();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	if(!((instance.__bitField0 & 32) == 32)) {
                    	    instance.listChannel = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 32;
                    	}
                    	instance.listChannel.add(input.readString());

                    	break;
                    case 7:
                    	instance.promotionPercent = input.readFloat();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.items = java.util.Collections.unmodifiableList(instance.items);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.newHappyPlayEventPercent = java.util.Collections.unmodifiableList(instance.newHappyPlayEventPercent);
            }




            if((instance.__bitField0 & 32) == 32) {
                instance.listChannel = java.util.Collections.unmodifiableList(instance.listChannel);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, HPLOMInfoResponse instance) throws java.io.IOException {
            for(proto.message.HPIAPInfo items : instance.items) {
                output.writeObject(1, items, proto.message.HPIAPInfo.getSchema(), true);
            }

            for(float newHappyPlayEventPercent : instance.newHappyPlayEventPercent) {
                output.writeFloat(2, newHappyPlayEventPercent, true);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeFloat(3, instance.newHappyPlayPetPercent, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeFloat(4, instance.minMoneyUnit, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeFloat(5, instance.minTicketUnit, false);
            }

            for(String listChannel : instance.listChannel) {
                output.writeString(6, listChannel, true);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeFloat(7, instance.promotionPercent, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "items";
        		case 2: return "newHappyPlayEventPercent";
        		case 3: return "newHappyPlayPetPercent";
        		case 4: return "minMoneyUnit";
        		case 5: return "minTicketUnit";
        		case 6: return "listChannel";
        		case 7: return "promotionPercent";
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

        private java.util.List<proto.message.HPIAPInfo> items;

        private java.util.List<Float> newHappyPlayEventPercent;

        private float newHappyPlayPetPercent;

        private float minMoneyUnit;

        private float minTicketUnit;

        private java.util.List<String> listChannel;

        private float promotionPercent;

        private int __bitField0;

        private Builder() {
            this.items = java.util.Collections.emptyList();
            this.newHappyPlayEventPercent = java.util.Collections.emptyList();
            this.newHappyPlayPetPercent = 0f;
            this.minMoneyUnit = 0f;
            this.minTicketUnit = 0f;
            this.listChannel = java.util.Collections.emptyList();
            this.promotionPercent = 0f;
        }

        public Builder mergeFrom(HPLOMInfoResponse instance) {
            this.addAllItems(instance.getItemsList());

            this.addAllNewHappyPlayEventPercent(instance.getNewHappyPlayEventPercentList());

            if (instance.hasNewHappyPlayPetPercent()) {
                this.setNewHappyPlayPetPercent(instance.getNewHappyPlayPetPercent());
            }

            if (instance.hasMinMoneyUnit()) {
                this.setMinMoneyUnit(instance.getMinMoneyUnit());
            }

            if (instance.hasMinTicketUnit()) {
                this.setMinTicketUnit(instance.getMinTicketUnit());
            }

            this.addAllListChannel(instance.getListChannelList());

            if (instance.hasPromotionPercent()) {
                this.setPromotionPercent(instance.getPromotionPercent());
            }

            return this;
        }

        public java.util.List<proto.message.HPIAPInfo> getItemsList() {
            return items;
        }

        public Builder setItems(int index, proto.message.HPIAPInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#items to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.items.set(index, value);
            return this;
        }

        public Builder addItems(proto.message.HPIAPInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#items to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.items.add(value);
            return this;
        }

        public Builder addAllItems(java.lang.Iterable<proto.message.HPIAPInfo> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#items to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.HPIAPInfo value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HPLOMInfoResponse#items to null");
                }
                this.items.add(value);
            }
            return this;
        }

        public Builder clearItems() {
            this.items = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getItemsCount() {
            return items.size();
        }

        public proto.message.HPIAPInfo getItems(int index) {
            return items.get(index);
        }

        public java.util.List<Float> getNewHappyPlayEventPercentList() {
            return newHappyPlayEventPercent;
        }

        public Builder setNewHappyPlayEventPercent(int index, float value) {
            if(!((__bitField0 & 2) == 2)) {
                this.newHappyPlayEventPercent = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.newHappyPlayEventPercent.set(index, value);
            return this;
        }

        public Builder addNewHappyPlayEventPercent(float value) {
            if(!((__bitField0 & 2) == 2)) {
                this.newHappyPlayEventPercent = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.newHappyPlayEventPercent.add(value);
            return this;
        }

        public Builder addAllNewHappyPlayEventPercent(java.lang.Iterable<Float> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#newHappyPlayEventPercent to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.newHappyPlayEventPercent = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final Float value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HPLOMInfoResponse#newHappyPlayEventPercent to null");
                }
                this.newHappyPlayEventPercent.add(value);
            }
            return this;
        }

        public Builder clearNewHappyPlayEventPercent() {
            this.newHappyPlayEventPercent = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getNewHappyPlayEventPercentCount() {
            return newHappyPlayEventPercent.size();
        }

        public float getNewHappyPlayEventPercent(int index) {
            return newHappyPlayEventPercent.get(index);
        }

        public float getNewHappyPlayPetPercent() {
            return newHappyPlayPetPercent;
        }

        public Builder setNewHappyPlayPetPercent(float value) {
            this.newHappyPlayPetPercent = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearNewHappyPlayPetPercent() {
            this.newHappyPlayPetPercent = 0f;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasNewHappyPlayPetPercent() {
            return (__bitField0 & 4) == 4;
        }

        public float getMinMoneyUnit() {
            return minMoneyUnit;
        }

        public Builder setMinMoneyUnit(float value) {
            this.minMoneyUnit = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMinMoneyUnit() {
            this.minMoneyUnit = 0f;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMinMoneyUnit() {
            return (__bitField0 & 8) == 8;
        }

        public float getMinTicketUnit() {
            return minTicketUnit;
        }

        public Builder setMinTicketUnit(float value) {
            this.minTicketUnit = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMinTicketUnit() {
            this.minTicketUnit = 0f;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMinTicketUnit() {
            return (__bitField0 & 16) == 16;
        }

        public java.util.List<String> getListChannelList() {
            return listChannel;
        }

        public Builder setListChannel(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#listChannel to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.listChannel = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.listChannel.set(index, value);
            return this;
        }

        public Builder addListChannel(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#listChannel to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.listChannel = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.listChannel.add(value);
            return this;
        }

        public Builder addAllListChannel(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HPLOMInfoResponse#listChannel to null");
            }
            if(!((__bitField0 & 32) == 32)) {
                this.listChannel = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HPLOMInfoResponse#listChannel to null");
                }
                this.listChannel.add(value);
            }
            return this;
        }

        public Builder clearListChannel() {
            this.listChannel = java.util.Collections.emptyList();
            __bitField0 &= ~32;
            return this;
        }

        public int getListChannelCount() {
            return listChannel.size();
        }

        public String getListChannel(int index) {
            return listChannel.get(index);
        }

        public float getPromotionPercent() {
            return promotionPercent;
        }

        public Builder setPromotionPercent(float value) {
            this.promotionPercent = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearPromotionPercent() {
            this.promotionPercent = 0f;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasPromotionPercent() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.items, that.items)) {
                return false;
            }
            if (!java.util.Objects.equals(this.newHappyPlayEventPercent, that.newHappyPlayEventPercent)) {
                return false;
            }
            if (!java.util.Objects.equals(this.newHappyPlayPetPercent, that.newHappyPlayPetPercent)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minMoneyUnit, that.minMoneyUnit)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minTicketUnit, that.minTicketUnit)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listChannel, that.listChannel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.promotionPercent, that.promotionPercent)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.items == null ? 0 : this.items.hashCode());
            result = 31 * result + (this.newHappyPlayEventPercent == null ? 0 : this.newHappyPlayEventPercent.hashCode());
            result = 31 * result + Float.hashCode(this.newHappyPlayPetPercent);
            result = 31 * result + Float.hashCode(this.minMoneyUnit);
            result = 31 * result + Float.hashCode(this.minTicketUnit);
            result = 31 * result + (this.listChannel == null ? 0 : this.listChannel.hashCode());
            result = 31 * result + Float.hashCode(this.promotionPercent);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!items.isEmpty()) {
                parts.add("items=" + getItemsList());
            }
            if (!newHappyPlayEventPercent.isEmpty()) {
                parts.add("newHappyPlayEventPercent=" + getNewHappyPlayEventPercentList());
            }
            if (hasNewHappyPlayPetPercent()) {
                parts.add("newHappyPlayPetPercent=" + getNewHappyPlayPetPercent());
            }
            if (hasMinMoneyUnit()) {
                parts.add("minMoneyUnit=" + getMinMoneyUnit());
            }
            if (hasMinTicketUnit()) {
                parts.add("minTicketUnit=" + getMinTicketUnit());
            }
            if (!listChannel.isEmpty()) {
                parts.add("listChannel=" + getListChannelList());
            }
            if (hasPromotionPercent()) {
                parts.add("promotionPercent=" + getPromotionPercent());
            }
            return "HPLOMInfoResponse{" + String.join(", ", parts) + "}";
        }

        public HPLOMInfoResponse build() {
            proto.message.HPLOMInfoResponse result = new proto.message.HPLOMInfoResponse();
            result.__bitField0 = __bitField0;
            result.items = java.util.Collections.unmodifiableList(this.items);
            result.newHappyPlayEventPercent = java.util.Collections.unmodifiableList(this.newHappyPlayEventPercent);
            result.newHappyPlayPetPercent = this.newHappyPlayPetPercent;
            result.minMoneyUnit = this.minMoneyUnit;
            result.minTicketUnit = this.minTicketUnit;
            result.listChannel = java.util.Collections.unmodifiableList(this.listChannel);
            result.promotionPercent = this.promotionPercent;
            return result;
        }

    }



}