package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class BombExplodeResponse
        implements io.protostuff.Message<BombExplodeResponse> {

    private static final BombExplodeResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userid;

    private int itemID;

    private int gold;

    private int exp;

    private boolean __merge_lock = false;
    private int __bitField0;

    private BombExplodeResponse() {
        this.userid = "";
        this.itemID = 0;
        this.gold = 0;
        this.exp = 0;
    }

    private BombExplodeResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static BombExplodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<BombExplodeResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserid() {
        return userid;
    }

    public boolean hasUserid() {
        return (__bitField0 & 1) == 1;
    }

    public BombExplodeResponse withUserid(String value) {
        return BombExplodeResponse.newBuilder()
            .mergeFrom(this)
            .setUserid(value)
            .build();
    }

    public int getItemID() {
        return itemID;
    }

    public boolean hasItemID() {
        return (__bitField0 & 2) == 2;
    }

    public BombExplodeResponse withItemID(int value) {
        return BombExplodeResponse.newBuilder()
            .mergeFrom(this)
            .setItemID(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 4) == 4;
    }

    public BombExplodeResponse withGold(int value) {
        return BombExplodeResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public int getExp() {
        return exp;
    }

    public boolean hasExp() {
        return (__bitField0 & 8) == 8;
    }

    public BombExplodeResponse withExp(int value) {
        return BombExplodeResponse.newBuilder()
            .mergeFrom(this)
            .setExp(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<BombExplodeResponse> cachedSchema() {
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
        BombExplodeResponse that = (BombExplodeResponse) obj;
        if (!java.util.Objects.equals(this.userid, that.userid)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemID, that.itemID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.exp, that.exp)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
        result = 31 * result + Integer.hashCode(this.itemID);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Integer.hashCode(this.exp);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserid()) {
            parts.add("userid=" + getUserid());
        }
        if (hasItemID()) {
            parts.add("itemID=" + getItemID());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (hasExp()) {
            parts.add("exp=" + getExp());
        }
        return "BombExplodeResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<BombExplodeResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userid", 1);
        	__fieldMap.put("itemID", 2);
        	__fieldMap.put("gold", 3);
        	__fieldMap.put("exp", 4);
        }

        @Override
        public BombExplodeResponse newMessage() {
            return new BombExplodeResponse();
        }

        @Override
        public Class<BombExplodeResponse> typeClass() {
            return BombExplodeResponse.class;
        }

        @Override
        public String messageName() {
            return BombExplodeResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return BombExplodeResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(BombExplodeResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, BombExplodeResponse instance) throws java.io.IOException {
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
                    	instance.userid = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.itemID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.exp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, BombExplodeResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userid, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.itemID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gold, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.exp, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userid";
        		case 2: return "itemID";
        		case 3: return "gold";
        		case 4: return "exp";
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

        private String userid;

        private int itemID;

        private int gold;

        private int exp;

        private int __bitField0;

        private Builder() {
            this.userid = "";
            this.itemID = 0;
            this.gold = 0;
            this.exp = 0;
        }

        public Builder mergeFrom(BombExplodeResponse instance) {
            if (instance.hasUserid()) {
                this.setUserid(instance.getUserid());
            }

            if (instance.hasItemID()) {
                this.setItemID(instance.getItemID());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasExp()) {
                this.setExp(instance.getExp());
            }

            return this;
        }

        public String getUserid() {
            return userid;
        }

        public Builder setUserid(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BombExplodeResponse#userid to null");
            }

            this.userid = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserid() {
            this.userid = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserid() {
            return (__bitField0 & 1) == 1;
        }

        public int getItemID() {
            return itemID;
        }

        public Builder setItemID(int value) {
            this.itemID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearItemID() {
            this.itemID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasItemID() {
            return (__bitField0 & 2) == 2;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 4) == 4;
        }

        public int getExp() {
            return exp;
        }

        public Builder setExp(int value) {
            this.exp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearExp() {
            this.exp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasExp() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.userid, that.userid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemID, that.itemID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.exp, that.exp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
            result = 31 * result + Integer.hashCode(this.itemID);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Integer.hashCode(this.exp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserid()) {
                parts.add("userid=" + getUserid());
            }
            if (hasItemID()) {
                parts.add("itemID=" + getItemID());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (hasExp()) {
                parts.add("exp=" + getExp());
            }
            return "BombExplodeResponse{" + String.join(", ", parts) + "}";
        }

        public BombExplodeResponse build() {
            proto.message.BombExplodeResponse result = new proto.message.BombExplodeResponse();
            result.__bitField0 = __bitField0;
            result.userid = this.userid;
            result.itemID = this.itemID;
            result.gold = this.gold;
            result.exp = this.exp;
            return result;
        }

    }



}