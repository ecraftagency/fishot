package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetFishHordeInforResponse
        implements io.protostuff.Message<GetFishHordeInforResponse> {

    private static final GetFishHordeInforResponse DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private int timeTicker;

    private java.util.List<proto.message.GetFishHordeInforResponse.FishHordeInfor> fishHordeInfor;

    private long dtFromBegin;

    private java.util.List<proto.message.IngameItemInfo> itemInfos;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetFishHordeInforResponse() {
        this.type = proto.message.ListType.PENDING_LIST.getNumber();
        this.timeTicker = 0;
        this.fishHordeInfor = java.util.Collections.emptyList();
        this.dtFromBegin = 0L;
        this.itemInfos = java.util.Collections.emptyList();
    }

    private GetFishHordeInforResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetFishHordeInforResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetFishHordeInforResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ListType getType() {
        return proto.message.ListType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 1) == 1;
    }

    public GetFishHordeInforResponse withType(proto.message.ListType value) {
        return GetFishHordeInforResponse.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getTimeTicker() {
        return timeTicker;
    }

    public boolean hasTimeTicker() {
        return (__bitField0 & 2) == 2;
    }

    public GetFishHordeInforResponse withTimeTicker(int value) {
        return GetFishHordeInforResponse.newBuilder()
            .mergeFrom(this)
            .setTimeTicker(value)
            .build();
    }

    public java.util.List<proto.message.GetFishHordeInforResponse.FishHordeInfor> getFishHordeInforList() {
        return fishHordeInfor;
    }

    public int getFishHordeInforCount() {
        return fishHordeInfor.size();
    }

    public proto.message.GetFishHordeInforResponse.FishHordeInfor getFishHordeInfor(int index) {
        return fishHordeInfor.get(index);
    }

    public GetFishHordeInforResponse withFishHordeInfor(java.util.List<proto.message.GetFishHordeInforResponse.FishHordeInfor> value) {
        return GetFishHordeInforResponse.newBuilder()
            .mergeFrom(this)
            .clearFishHordeInfor()
            .addAllFishHordeInfor(value)
            .build();
    }

    public long getDtFromBegin() {
        return dtFromBegin;
    }

    public boolean hasDtFromBegin() {
        return (__bitField0 & 8) == 8;
    }

    public GetFishHordeInforResponse withDtFromBegin(long value) {
        return GetFishHordeInforResponse.newBuilder()
            .mergeFrom(this)
            .setDtFromBegin(value)
            .build();
    }

    public java.util.List<proto.message.IngameItemInfo> getItemInfosList() {
        return itemInfos;
    }

    public int getItemInfosCount() {
        return itemInfos.size();
    }

    public proto.message.IngameItemInfo getItemInfos(int index) {
        return itemInfos.get(index);
    }

    public GetFishHordeInforResponse withItemInfos(java.util.List<proto.message.IngameItemInfo> value) {
        return GetFishHordeInforResponse.newBuilder()
            .mergeFrom(this)
            .clearItemInfos()
            .addAllItemInfos(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetFishHordeInforResponse> cachedSchema() {
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
        GetFishHordeInforResponse that = (GetFishHordeInforResponse) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.timeTicker, that.timeTicker)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fishHordeInfor, that.fishHordeInfor)) {
            return false;
        }
        if (!java.util.Objects.equals(this.dtFromBegin, that.dtFromBegin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemInfos, that.itemInfos)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.timeTicker);
        result = 31 * result + (this.fishHordeInfor == null ? 0 : this.fishHordeInfor.hashCode());
        result = 31 * result + Long.hashCode(this.dtFromBegin);
        result = 31 * result + (this.itemInfos == null ? 0 : this.itemInfos.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasTimeTicker()) {
            parts.add("timeTicker=" + getTimeTicker());
        }
        if (!fishHordeInfor.isEmpty()) {
            parts.add("fishHordeInfor=" + getFishHordeInforList());
        }
        if (hasDtFromBegin()) {
            parts.add("dtFromBegin=" + getDtFromBegin());
        }
        if (!itemInfos.isEmpty()) {
            parts.add("itemInfos=" + getItemInfosList());
        }
        return "GetFishHordeInforResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetFishHordeInforResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        	__fieldMap.put("timeTicker", 2);
        	__fieldMap.put("fishHordeInfor", 3);
        	__fieldMap.put("dtFromBegin", 4);
        	__fieldMap.put("itemInfos", 5);
        }

        @Override
        public GetFishHordeInforResponse newMessage() {
            return new GetFishHordeInforResponse();
        }

        @Override
        public Class<GetFishHordeInforResponse> typeClass() {
            return GetFishHordeInforResponse.class;
        }

        @Override
        public String messageName() {
            return GetFishHordeInforResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetFishHordeInforResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetFishHordeInforResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetFishHordeInforResponse instance) throws java.io.IOException {
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
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.timeTicker = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.fishHordeInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.fishHordeInfor.add(input.mergeObject(null, proto.message.GetFishHordeInforResponse.FishHordeInfor.getSchema()));

                    	break;
                    case 4:
                    	instance.dtFromBegin = input.readInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.itemInfos = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.itemInfos.add(input.mergeObject(null, proto.message.IngameItemInfo.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.fishHordeInfor = java.util.Collections.unmodifiableList(instance.fishHordeInfor);
            }


            if((instance.__bitField0 & 16) == 16) {
                instance.itemInfos = java.util.Collections.unmodifiableList(instance.itemInfos);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetFishHordeInforResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.type, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.timeTicker, false);
            }

            for(proto.message.GetFishHordeInforResponse.FishHordeInfor fishHordeInfor : instance.fishHordeInfor) {
                output.writeObject(3, fishHordeInfor, proto.message.GetFishHordeInforResponse.FishHordeInfor.getSchema(), true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt64(4, instance.dtFromBegin, false);
            }

            for(proto.message.IngameItemInfo itemInfos : instance.itemInfos) {
                output.writeObject(5, itemInfos, proto.message.IngameItemInfo.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
        		case 2: return "timeTicker";
        		case 3: return "fishHordeInfor";
        		case 4: return "dtFromBegin";
        		case 5: return "itemInfos";
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

        private int type;

        private int timeTicker;

        private java.util.List<proto.message.GetFishHordeInforResponse.FishHordeInfor> fishHordeInfor;

        private long dtFromBegin;

        private java.util.List<proto.message.IngameItemInfo> itemInfos;

        private int __bitField0;

        private Builder() {
            this.type = proto.message.ListType.PENDING_LIST.getNumber();
            this.timeTicker = 0;
            this.fishHordeInfor = java.util.Collections.emptyList();
            this.dtFromBegin = 0L;
            this.itemInfos = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetFishHordeInforResponse instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasTimeTicker()) {
                this.setTimeTicker(instance.getTimeTicker());
            }

            this.addAllFishHordeInfor(instance.getFishHordeInforList());

            if (instance.hasDtFromBegin()) {
                this.setDtFromBegin(instance.getDtFromBegin());
            }

            this.addAllItemInfos(instance.getItemInfosList());

            return this;
        }

        public proto.message.ListType getType() {
            return proto.message.ListType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.ListType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#type to null");
            }

            if (value == proto.message.ListType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set GetFishHordeInforResponse#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 1) == 1;
        }

        public int getTimeTicker() {
            return timeTicker;
        }

        public Builder setTimeTicker(int value) {
            this.timeTicker = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTimeTicker() {
            this.timeTicker = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTimeTicker() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.GetFishHordeInforResponse.FishHordeInfor> getFishHordeInforList() {
            return fishHordeInfor;
        }

        public Builder setFishHordeInfor(int index, proto.message.GetFishHordeInforResponse.FishHordeInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#fishHordeInfor to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.fishHordeInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fishHordeInfor.set(index, value);
            return this;
        }

        public Builder addFishHordeInfor(proto.message.GetFishHordeInforResponse.FishHordeInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#fishHordeInfor to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.fishHordeInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fishHordeInfor.add(value);
            return this;
        }

        public Builder addAllFishHordeInfor(java.lang.Iterable<proto.message.GetFishHordeInforResponse.FishHordeInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#fishHordeInfor to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.fishHordeInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.GetFishHordeInforResponse.FishHordeInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetFishHordeInforResponse#fishHordeInfor to null");
                }
                this.fishHordeInfor.add(value);
            }
            return this;
        }

        public Builder clearFishHordeInfor() {
            this.fishHordeInfor = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getFishHordeInforCount() {
            return fishHordeInfor.size();
        }

        public proto.message.GetFishHordeInforResponse.FishHordeInfor getFishHordeInfor(int index) {
            return fishHordeInfor.get(index);
        }

        public long getDtFromBegin() {
            return dtFromBegin;
        }

        public Builder setDtFromBegin(long value) {
            this.dtFromBegin = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearDtFromBegin() {
            this.dtFromBegin = 0L;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasDtFromBegin() {
            return (__bitField0 & 8) == 8;
        }

        public java.util.List<proto.message.IngameItemInfo> getItemInfosList() {
            return itemInfos;
        }

        public Builder setItemInfos(int index, proto.message.IngameItemInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#itemInfos to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.itemInfos = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.itemInfos.set(index, value);
            return this;
        }

        public Builder addItemInfos(proto.message.IngameItemInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#itemInfos to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.itemInfos = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.itemInfos.add(value);
            return this;
        }

        public Builder addAllItemInfos(java.lang.Iterable<proto.message.IngameItemInfo> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetFishHordeInforResponse#itemInfos to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.itemInfos = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final proto.message.IngameItemInfo value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetFishHordeInforResponse#itemInfos to null");
                }
                this.itemInfos.add(value);
            }
            return this;
        }

        public Builder clearItemInfos() {
            this.itemInfos = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getItemInfosCount() {
            return itemInfos.size();
        }

        public proto.message.IngameItemInfo getItemInfos(int index) {
            return itemInfos.get(index);
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.timeTicker, that.timeTicker)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishHordeInfor, that.fishHordeInfor)) {
                return false;
            }
            if (!java.util.Objects.equals(this.dtFromBegin, that.dtFromBegin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemInfos, that.itemInfos)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.timeTicker);
            result = 31 * result + (this.fishHordeInfor == null ? 0 : this.fishHordeInfor.hashCode());
            result = 31 * result + Long.hashCode(this.dtFromBegin);
            result = 31 * result + (this.itemInfos == null ? 0 : this.itemInfos.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasTimeTicker()) {
                parts.add("timeTicker=" + getTimeTicker());
            }
            if (!fishHordeInfor.isEmpty()) {
                parts.add("fishHordeInfor=" + getFishHordeInforList());
            }
            if (hasDtFromBegin()) {
                parts.add("dtFromBegin=" + getDtFromBegin());
            }
            if (!itemInfos.isEmpty()) {
                parts.add("itemInfos=" + getItemInfosList());
            }
            return "GetFishHordeInforResponse{" + String.join(", ", parts) + "}";
        }

        public GetFishHordeInforResponse build() {
            proto.message.GetFishHordeInforResponse result = new proto.message.GetFishHordeInforResponse();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            result.timeTicker = this.timeTicker;
            result.fishHordeInfor = java.util.Collections.unmodifiableList(this.fishHordeInfor);
            result.dtFromBegin = this.dtFromBegin;
            result.itemInfos = java.util.Collections.unmodifiableList(this.itemInfos);
            return result;
        }

    }

    public static final class FishHordeInfor
            implements io.protostuff.Message<FishHordeInfor> {

        private static final FishHordeInfor DEFAULT_INSTANCE = newBuilder().build();

        private long id;

        private int fishID;

        private int fishAmount;

        private int speed;

        private int radius;

        private int appearSecond;

        private int orbitID;

        private int accumulateType;

        private float originalValue;

        private float currentValue;

        private proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform orbitTrans;

        private boolean __merge_lock = false;
        private int __bitField0;

        private FishHordeInfor() {
            this.id = 0L;
            this.fishID = 0;
            this.fishAmount = 0;
            this.speed = 0;
            this.radius = 0;
            this.appearSecond = 0;
            this.orbitID = 0;
            this.accumulateType = 0;
            this.originalValue = 0f;
            this.currentValue = 0f;
            this.orbitTrans = proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform.getDefaultInstance();
        }

        private FishHordeInfor(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static FishHordeInfor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<FishHordeInfor> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public long getId() {
            return id;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public FishHordeInfor withId(long value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setId(value)
                .build();
        }

        public int getFishID() {
            return fishID;
        }

        public boolean hasFishID() {
            return (__bitField0 & 2) == 2;
        }

        public FishHordeInfor withFishID(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setFishID(value)
                .build();
        }

        public int getFishAmount() {
            return fishAmount;
        }

        public boolean hasFishAmount() {
            return (__bitField0 & 4) == 4;
        }

        public FishHordeInfor withFishAmount(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setFishAmount(value)
                .build();
        }

        public int getSpeed() {
            return speed;
        }

        public boolean hasSpeed() {
            return (__bitField0 & 8) == 8;
        }

        public FishHordeInfor withSpeed(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setSpeed(value)
                .build();
        }

        public int getRadius() {
            return radius;
        }

        public boolean hasRadius() {
            return (__bitField0 & 16) == 16;
        }

        public FishHordeInfor withRadius(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setRadius(value)
                .build();
        }

        public int getAppearSecond() {
            return appearSecond;
        }

        public boolean hasAppearSecond() {
            return (__bitField0 & 32) == 32;
        }

        public FishHordeInfor withAppearSecond(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setAppearSecond(value)
                .build();
        }

        public int getOrbitID() {
            return orbitID;
        }

        public boolean hasOrbitID() {
            return (__bitField0 & 64) == 64;
        }

        public FishHordeInfor withOrbitID(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setOrbitID(value)
                .build();
        }

        public int getAccumulateType() {
            return accumulateType;
        }

        public boolean hasAccumulateType() {
            return (__bitField0 & 128) == 128;
        }

        public FishHordeInfor withAccumulateType(int value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setAccumulateType(value)
                .build();
        }

        public float getOriginalValue() {
            return originalValue;
        }

        public boolean hasOriginalValue() {
            return (__bitField0 & 256) == 256;
        }

        public FishHordeInfor withOriginalValue(float value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setOriginalValue(value)
                .build();
        }

        public float getCurrentValue() {
            return currentValue;
        }

        public boolean hasCurrentValue() {
            return (__bitField0 & 512) == 512;
        }

        public FishHordeInfor withCurrentValue(float value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setCurrentValue(value)
                .build();
        }

        public proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform getOrbitTrans() {
            return orbitTrans;
        }

        public boolean hasOrbitTrans() {
            return (__bitField0 & 1024) == 1024;
        }

        public FishHordeInfor withOrbitTrans(proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform value) {
            return FishHordeInfor.newBuilder()
                .mergeFrom(this)
                .setOrbitTrans(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<FishHordeInfor> cachedSchema() {
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
            FishHordeInfor that = (FishHordeInfor) obj;
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishID, that.fishID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishAmount, that.fishAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.speed, that.speed)) {
                return false;
            }
            if (!java.util.Objects.equals(this.radius, that.radius)) {
                return false;
            }
            if (!java.util.Objects.equals(this.appearSecond, that.appearSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orbitID, that.orbitID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateType, that.accumulateType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.originalValue, that.originalValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentValue, that.currentValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orbitTrans, that.orbitTrans)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.fishID);
            result = 31 * result + Integer.hashCode(this.fishAmount);
            result = 31 * result + Integer.hashCode(this.speed);
            result = 31 * result + Integer.hashCode(this.radius);
            result = 31 * result + Integer.hashCode(this.appearSecond);
            result = 31 * result + Integer.hashCode(this.orbitID);
            result = 31 * result + Integer.hashCode(this.accumulateType);
            result = 31 * result + Float.hashCode(this.originalValue);
            result = 31 * result + Float.hashCode(this.currentValue);
            result = 31 * result + (this.orbitTrans == null ? 0 : this.orbitTrans.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasFishID()) {
                parts.add("fishID=" + getFishID());
            }
            if (hasFishAmount()) {
                parts.add("fishAmount=" + getFishAmount());
            }
            if (hasSpeed()) {
                parts.add("speed=" + getSpeed());
            }
            if (hasRadius()) {
                parts.add("radius=" + getRadius());
            }
            if (hasAppearSecond()) {
                parts.add("appearSecond=" + getAppearSecond());
            }
            if (hasOrbitID()) {
                parts.add("orbitID=" + getOrbitID());
            }
            if (hasAccumulateType()) {
                parts.add("accumulateType=" + getAccumulateType());
            }
            if (hasOriginalValue()) {
                parts.add("originalValue=" + getOriginalValue());
            }
            if (hasCurrentValue()) {
                parts.add("currentValue=" + getCurrentValue());
            }
            if (hasOrbitTrans()) {
                parts.add("orbitTrans=" + getOrbitTrans());
            }
            return "FishHordeInfor{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<FishHordeInfor>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("id", 1);
            	__fieldMap.put("fishID", 2);
            	__fieldMap.put("fishAmount", 3);
            	__fieldMap.put("speed", 4);
            	__fieldMap.put("radius", 5);
            	__fieldMap.put("appearSecond", 6);
            	__fieldMap.put("orbitID", 7);
            	__fieldMap.put("accumulateType", 8);
            	__fieldMap.put("originalValue", 9);
            	__fieldMap.put("currentValue", 10);
            	__fieldMap.put("orbitTrans", 11);
            }

            @Override
            public FishHordeInfor newMessage() {
                return new FishHordeInfor();
            }

            @Override
            public Class<FishHordeInfor> typeClass() {
                return FishHordeInfor.class;
            }

            @Override
            public String messageName() {
                return FishHordeInfor.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return FishHordeInfor.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(FishHordeInfor message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, FishHordeInfor instance) throws java.io.IOException {
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
                        	instance.id = input.readInt64();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.fishID = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.fishAmount = input.readInt32();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.speed = input.readInt32();
                        	instance.__bitField0 |= 8;
                        	break;
                        case 5:
                        	instance.radius = input.readInt32();
                        	instance.__bitField0 |= 16;
                        	break;
                        case 6:
                        	instance.appearSecond = input.readInt32();
                        	instance.__bitField0 |= 32;
                        	break;
                        case 7:
                        	instance.orbitID = input.readInt32();
                        	instance.__bitField0 |= 64;
                        	break;
                        case 8:
                        	instance.accumulateType = input.readInt32();
                        	instance.__bitField0 |= 128;
                        	break;
                        case 9:
                        	instance.originalValue = input.readFloat();
                        	instance.__bitField0 |= 256;
                        	break;
                        case 10:
                        	instance.currentValue = input.readFloat();
                        	instance.__bitField0 |= 512;
                        	break;
                        case 11:
                        	instance.orbitTrans = input.mergeObject(null, proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform.getSchema());
                        	instance.__bitField0 |= 1024;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, FishHordeInfor instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeInt64(1, instance.id, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.fishID, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt32(3, instance.fishAmount, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt32(4, instance.speed, false);
                }

                if((instance.__bitField0 & 16) == 16) {
                    output.writeInt32(5, instance.radius, false);
                }

                if((instance.__bitField0 & 32) == 32) {
                    output.writeInt32(6, instance.appearSecond, false);
                }

                if((instance.__bitField0 & 64) == 64) {
                    output.writeInt32(7, instance.orbitID, false);
                }

                if((instance.__bitField0 & 128) == 128) {
                    output.writeInt32(8, instance.accumulateType, false);
                }

                if((instance.__bitField0 & 256) == 256) {
                    output.writeFloat(9, instance.originalValue, false);
                }

                if((instance.__bitField0 & 512) == 512) {
                    output.writeFloat(10, instance.currentValue, false);
                }

                if((instance.__bitField0 & 1024) == 1024) {
                	output.writeObject(11, instance.orbitTrans, proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform.getSchema(), false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "id";
            		case 2: return "fishID";
            		case 3: return "fishAmount";
            		case 4: return "speed";
            		case 5: return "radius";
            		case 6: return "appearSecond";
            		case 7: return "orbitID";
            		case 8: return "accumulateType";
            		case 9: return "originalValue";
            		case 10: return "currentValue";
            		case 11: return "orbitTrans";
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

            private long id;

            private int fishID;

            private int fishAmount;

            private int speed;

            private int radius;

            private int appearSecond;

            private int orbitID;

            private int accumulateType;

            private float originalValue;

            private float currentValue;

            private proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform orbitTrans;

            private int __bitField0;

            private Builder() {
                this.id = 0L;
                this.fishID = 0;
                this.fishAmount = 0;
                this.speed = 0;
                this.radius = 0;
                this.appearSecond = 0;
                this.orbitID = 0;
                this.accumulateType = 0;
                this.originalValue = 0f;
                this.currentValue = 0f;
                this.orbitTrans = proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform.getDefaultInstance();
            }

            public Builder mergeFrom(FishHordeInfor instance) {
                if (instance.hasId()) {
                    this.setId(instance.getId());
                }

                if (instance.hasFishID()) {
                    this.setFishID(instance.getFishID());
                }

                if (instance.hasFishAmount()) {
                    this.setFishAmount(instance.getFishAmount());
                }

                if (instance.hasSpeed()) {
                    this.setSpeed(instance.getSpeed());
                }

                if (instance.hasRadius()) {
                    this.setRadius(instance.getRadius());
                }

                if (instance.hasAppearSecond()) {
                    this.setAppearSecond(instance.getAppearSecond());
                }

                if (instance.hasOrbitID()) {
                    this.setOrbitID(instance.getOrbitID());
                }

                if (instance.hasAccumulateType()) {
                    this.setAccumulateType(instance.getAccumulateType());
                }

                if (instance.hasOriginalValue()) {
                    this.setOriginalValue(instance.getOriginalValue());
                }

                if (instance.hasCurrentValue()) {
                    this.setCurrentValue(instance.getCurrentValue());
                }

                if (instance.hasOrbitTrans()) {
                    this.setOrbitTrans(instance.getOrbitTrans());
                }

                return this;
            }

            public long getId() {
                return id;
            }

            public Builder setId(long value) {
                this.id = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearId() {
                this.id = 0L;
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasId() {
                return (__bitField0 & 1) == 1;
            }

            public int getFishID() {
                return fishID;
            }

            public Builder setFishID(int value) {
                this.fishID = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearFishID() {
                this.fishID = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasFishID() {
                return (__bitField0 & 2) == 2;
            }

            public int getFishAmount() {
                return fishAmount;
            }

            public Builder setFishAmount(int value) {
                this.fishAmount = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearFishAmount() {
                this.fishAmount = 0;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasFishAmount() {
                return (__bitField0 & 4) == 4;
            }

            public int getSpeed() {
                return speed;
            }

            public Builder setSpeed(int value) {
                this.speed = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearSpeed() {
                this.speed = 0;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasSpeed() {
                return (__bitField0 & 8) == 8;
            }

            public int getRadius() {
                return radius;
            }

            public Builder setRadius(int value) {
                this.radius = value;
                __bitField0 |= 16;
                return this;
            }

            public Builder clearRadius() {
                this.radius = 0;
                __bitField0 &= ~16;
                return this;
            }

            public boolean hasRadius() {
                return (__bitField0 & 16) == 16;
            }

            public int getAppearSecond() {
                return appearSecond;
            }

            public Builder setAppearSecond(int value) {
                this.appearSecond = value;
                __bitField0 |= 32;
                return this;
            }

            public Builder clearAppearSecond() {
                this.appearSecond = 0;
                __bitField0 &= ~32;
                return this;
            }

            public boolean hasAppearSecond() {
                return (__bitField0 & 32) == 32;
            }

            public int getOrbitID() {
                return orbitID;
            }

            public Builder setOrbitID(int value) {
                this.orbitID = value;
                __bitField0 |= 64;
                return this;
            }

            public Builder clearOrbitID() {
                this.orbitID = 0;
                __bitField0 &= ~64;
                return this;
            }

            public boolean hasOrbitID() {
                return (__bitField0 & 64) == 64;
            }

            public int getAccumulateType() {
                return accumulateType;
            }

            public Builder setAccumulateType(int value) {
                this.accumulateType = value;
                __bitField0 |= 128;
                return this;
            }

            public Builder clearAccumulateType() {
                this.accumulateType = 0;
                __bitField0 &= ~128;
                return this;
            }

            public boolean hasAccumulateType() {
                return (__bitField0 & 128) == 128;
            }

            public float getOriginalValue() {
                return originalValue;
            }

            public Builder setOriginalValue(float value) {
                this.originalValue = value;
                __bitField0 |= 256;
                return this;
            }

            public Builder clearOriginalValue() {
                this.originalValue = 0f;
                __bitField0 &= ~256;
                return this;
            }

            public boolean hasOriginalValue() {
                return (__bitField0 & 256) == 256;
            }

            public float getCurrentValue() {
                return currentValue;
            }

            public Builder setCurrentValue(float value) {
                this.currentValue = value;
                __bitField0 |= 512;
                return this;
            }

            public Builder clearCurrentValue() {
                this.currentValue = 0f;
                __bitField0 &= ~512;
                return this;
            }

            public boolean hasCurrentValue() {
                return (__bitField0 & 512) == 512;
            }

            public proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform getOrbitTrans() {
                return orbitTrans;
            }

            public Builder setOrbitTrans(proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set FishHordeInfor#orbitTrans to null");
                }

                this.orbitTrans = value;
                __bitField0 |= 1024;
                return this;
            }

            public Builder clearOrbitTrans() {
                this.orbitTrans = proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform.getDefaultInstance();
                __bitField0 &= ~1024;
                return this;
            }

            public boolean hasOrbitTrans() {
                return (__bitField0 & 1024) == 1024;
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
                if (!java.util.Objects.equals(this.id, that.id)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.fishID, that.fishID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.fishAmount, that.fishAmount)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.speed, that.speed)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.radius, that.radius)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.appearSecond, that.appearSecond)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.orbitID, that.orbitID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.accumulateType, that.accumulateType)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.originalValue, that.originalValue)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.currentValue, that.currentValue)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.orbitTrans, that.orbitTrans)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Long.hashCode(this.id);
                result = 31 * result + Integer.hashCode(this.fishID);
                result = 31 * result + Integer.hashCode(this.fishAmount);
                result = 31 * result + Integer.hashCode(this.speed);
                result = 31 * result + Integer.hashCode(this.radius);
                result = 31 * result + Integer.hashCode(this.appearSecond);
                result = 31 * result + Integer.hashCode(this.orbitID);
                result = 31 * result + Integer.hashCode(this.accumulateType);
                result = 31 * result + Float.hashCode(this.originalValue);
                result = 31 * result + Float.hashCode(this.currentValue);
                result = 31 * result + (this.orbitTrans == null ? 0 : this.orbitTrans.hashCode());

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasId()) {
                    parts.add("id=" + getId());
                }
                if (hasFishID()) {
                    parts.add("fishID=" + getFishID());
                }
                if (hasFishAmount()) {
                    parts.add("fishAmount=" + getFishAmount());
                }
                if (hasSpeed()) {
                    parts.add("speed=" + getSpeed());
                }
                if (hasRadius()) {
                    parts.add("radius=" + getRadius());
                }
                if (hasAppearSecond()) {
                    parts.add("appearSecond=" + getAppearSecond());
                }
                if (hasOrbitID()) {
                    parts.add("orbitID=" + getOrbitID());
                }
                if (hasAccumulateType()) {
                    parts.add("accumulateType=" + getAccumulateType());
                }
                if (hasOriginalValue()) {
                    parts.add("originalValue=" + getOriginalValue());
                }
                if (hasCurrentValue()) {
                    parts.add("currentValue=" + getCurrentValue());
                }
                if (hasOrbitTrans()) {
                    parts.add("orbitTrans=" + getOrbitTrans());
                }
                return "FishHordeInfor{" + String.join(", ", parts) + "}";
            }

            public FishHordeInfor build() {
                proto.message.GetFishHordeInforResponse.FishHordeInfor result = new proto.message.GetFishHordeInforResponse.FishHordeInfor();
                result.__bitField0 = __bitField0;
                result.id = this.id;
                result.fishID = this.fishID;
                result.fishAmount = this.fishAmount;
                result.speed = this.speed;
                result.radius = this.radius;
                result.appearSecond = this.appearSecond;
                result.orbitID = this.orbitID;
                result.accumulateType = this.accumulateType;
                result.originalValue = this.originalValue;
                result.currentValue = this.currentValue;
                result.orbitTrans = this.orbitTrans;
                return result;
            }

        }

        public static final class OrbitTransform
                implements io.protostuff.Message<OrbitTransform> {

            private static final OrbitTransform DEFAULT_INSTANCE = newBuilder().build();

            private int transform;

            private java.util.List<Float> params;

            private int center;

            private boolean __merge_lock = false;
            private int __bitField0;

            private OrbitTransform() {
                this.transform = 0;
                this.params = java.util.Collections.emptyList();
                this.center = 0;
            }

            private OrbitTransform(Builder builder) {
                __merge_lock = true;
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public static OrbitTransform getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static io.protostuff.Schema<OrbitTransform> getSchema()
            {
            	return Schema.INSTANCE;
            }

            public int getTransform() {
                return transform;
            }

            public boolean hasTransform() {
                return (__bitField0 & 1) == 1;
            }

            public OrbitTransform withTransform(int value) {
                return OrbitTransform.newBuilder()
                    .mergeFrom(this)
                    .setTransform(value)
                    .build();
            }

            public java.util.List<Float> getParamsList() {
                return params;
            }

            public int getParamsCount() {
                return params.size();
            }

            public float getParams(int index) {
                return params.get(index);
            }

            public OrbitTransform withParams(java.util.List<Float> value) {
                return OrbitTransform.newBuilder()
                    .mergeFrom(this)
                    .clearParams()
                    .addAllParams(value)
                    .build();
            }

            public int getCenter() {
                return center;
            }

            public boolean hasCenter() {
                return (__bitField0 & 4) == 4;
            }

            public OrbitTransform withCenter(int value) {
                return OrbitTransform.newBuilder()
                    .mergeFrom(this)
                    .setCenter(value)
                    .build();
            }



            @Override
            public io.protostuff.Schema<OrbitTransform> cachedSchema() {
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
                OrbitTransform that = (OrbitTransform) obj;
                if (!java.util.Objects.equals(this.transform, that.transform)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.params, that.params)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.center, that.center)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Integer.hashCode(this.transform);
                result = 31 * result + (this.params == null ? 0 : this.params.hashCode());
                result = 31 * result + Integer.hashCode(this.center);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasTransform()) {
                    parts.add("transform=" + getTransform());
                }
                if (!params.isEmpty()) {
                    parts.add("params=" + getParamsList());
                }
                if (hasCenter()) {
                    parts.add("center=" + getCenter());
                }
                return "OrbitTransform{" + String.join(", ", parts) + "}";
            }

            public static final class Schema implements io.protostuff.Schema<OrbitTransform>{

                private static final Schema INSTANCE = new Schema();

                private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

                static {
                	__fieldMap.put("transform", 1);
                	__fieldMap.put("params", 2);
                	__fieldMap.put("center", 3);
                }

                @Override
                public OrbitTransform newMessage() {
                    return new OrbitTransform();
                }

                @Override
                public Class<OrbitTransform> typeClass() {
                    return OrbitTransform.class;
                }

                @Override
                public String messageName() {
                    return OrbitTransform.class.getSimpleName();
                }

                @Override
                public String messageFullName() {
                    return OrbitTransform.class.getName();
                }

                @Override
                @Deprecated
                public boolean isInitialized(OrbitTransform message) {
                    return true;
                }

                @Override
                public void mergeFrom(io.protostuff.Input input, OrbitTransform instance) throws java.io.IOException {
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
                            	instance.transform = input.readInt32();
                            	instance.__bitField0 |= 1;
                            	break;
                            case 2:
                            	if(!((instance.__bitField0 & 2) == 2)) {
                            	    instance.params = new java.util.ArrayList<>();
                            	    instance.__bitField0 |= 2;
                            	}
                            	instance.params.add(input.readFloat());

                            	break;
                            case 3:
                            	instance.center = input.readInt32();
                            	instance.__bitField0 |= 4;
                            	break;
                            default:
                                input.handleUnknownField(number, this);
                        }
                	}
                    if((instance.__bitField0 & 2) == 2) {
                        instance.params = java.util.Collections.unmodifiableList(instance.params);
                    }


                }

                @Override
                public void writeTo(io.protostuff.Output output, OrbitTransform instance) throws java.io.IOException {
                    if((instance.__bitField0 & 1) == 1) {
                        output.writeInt32(1, instance.transform, false);
                    }

                    for(float params : instance.params) {
                        output.writeFloat(2, params, true);
                    }

                    if((instance.__bitField0 & 4) == 4) {
                        output.writeInt32(3, instance.center, false);
                    }

                }

                @Override
                public String getFieldName(int number) {
                	switch(number) {
                		case 1: return "transform";
                		case 2: return "params";
                		case 3: return "center";
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

                private int transform;

                private java.util.List<Float> params;

                private int center;

                private int __bitField0;

                private Builder() {
                    this.transform = 0;
                    this.params = java.util.Collections.emptyList();
                    this.center = 0;
                }

                public Builder mergeFrom(OrbitTransform instance) {
                    if (instance.hasTransform()) {
                        this.setTransform(instance.getTransform());
                    }

                    this.addAllParams(instance.getParamsList());

                    if (instance.hasCenter()) {
                        this.setCenter(instance.getCenter());
                    }

                    return this;
                }

                public int getTransform() {
                    return transform;
                }

                public Builder setTransform(int value) {
                    this.transform = value;
                    __bitField0 |= 1;
                    return this;
                }

                public Builder clearTransform() {
                    this.transform = 0;
                    __bitField0 &= ~1;
                    return this;
                }

                public boolean hasTransform() {
                    return (__bitField0 & 1) == 1;
                }

                public java.util.List<Float> getParamsList() {
                    return params;
                }

                public Builder setParams(int index, float value) {
                    if(!((__bitField0 & 2) == 2)) {
                        this.params = new java.util.ArrayList<>();
                        __bitField0 |= 2;
                    }
                    this.params.set(index, value);
                    return this;
                }

                public Builder addParams(float value) {
                    if(!((__bitField0 & 2) == 2)) {
                        this.params = new java.util.ArrayList<>();
                        __bitField0 |= 2;
                    }
                    this.params.add(value);
                    return this;
                }

                public Builder addAllParams(java.lang.Iterable<Float> values) {
                    if (values == null) {
                        throw new NullPointerException("Cannot set OrbitTransform#params to null");
                    }
                    if(!((__bitField0 & 2) == 2)) {
                        this.params = new java.util.ArrayList<>();
                        __bitField0 |= 2;
                    }
                    for (final Float value : values) {
                        if (value == null) {
                           throw new NullPointerException("Cannot set OrbitTransform#params to null");
                        }
                        this.params.add(value);
                    }
                    return this;
                }

                public Builder clearParams() {
                    this.params = java.util.Collections.emptyList();
                    __bitField0 &= ~2;
                    return this;
                }

                public int getParamsCount() {
                    return params.size();
                }

                public float getParams(int index) {
                    return params.get(index);
                }

                public int getCenter() {
                    return center;
                }

                public Builder setCenter(int value) {
                    this.center = value;
                    __bitField0 |= 4;
                    return this;
                }

                public Builder clearCenter() {
                    this.center = 0;
                    __bitField0 &= ~4;
                    return this;
                }

                public boolean hasCenter() {
                    return (__bitField0 & 4) == 4;
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
                    if (!java.util.Objects.equals(this.transform, that.transform)) {
                        return false;
                    }
                    if (!java.util.Objects.equals(this.params, that.params)) {
                        return false;
                    }
                    if (!java.util.Objects.equals(this.center, that.center)) {
                        return false;
                    }

                    return true;
                }

                @Override
                public int hashCode() {
                    int result = 1;
                    result = 31 * result + Integer.hashCode(this.transform);
                    result = 31 * result + (this.params == null ? 0 : this.params.hashCode());
                    result = 31 * result + Integer.hashCode(this.center);

                    return result;
                }

                @Override
                public String toString() {
                    java.util.List<String> parts = new java.util.ArrayList<>();
                    if (hasTransform()) {
                        parts.add("transform=" + getTransform());
                    }
                    if (!params.isEmpty()) {
                        parts.add("params=" + getParamsList());
                    }
                    if (hasCenter()) {
                        parts.add("center=" + getCenter());
                    }
                    return "OrbitTransform{" + String.join(", ", parts) + "}";
                }

                public OrbitTransform build() {
                    proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform result = new proto.message.GetFishHordeInforResponse.FishHordeInfor.OrbitTransform();
                    result.__bitField0 = __bitField0;
                    result.transform = this.transform;
                    result.params = java.util.Collections.unmodifiableList(this.params);
                    result.center = this.center;
                    return result;
                }

            }



        }


    }


}