package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMBuyResponse
        implements io.protostuff.Message<HPLOMBuyResponse> {

    private static final HPLOMBuyResponse DEFAULT_INSTANCE = newBuilder().build();

    private int returnCode;

    private String returnMessge;

    private int amount;

    private int gold1;

    private int gold2;

    private int gold3;

    private int happyPlayCount;

    private String transactionId;

    private int happyPlayEventNewCount;

    private int petGoldBuff;

    private int ticketBuffCnt;

    private String orderId;

    private String itemId;

    private proto.message.HPBoosterPackInfoResponse listClaimedBoosterItem;

    private proto.message.HPSpecialOfferPackInfoResponse listClaimedSpecialOfferItem;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMBuyResponse() {
        this.returnCode = 0;
        this.returnMessge = "";
        this.amount = 0;
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
        this.happyPlayCount = 0;
        this.transactionId = "";
        this.happyPlayEventNewCount = 0;
        this.petGoldBuff = 0;
        this.ticketBuffCnt = 0;
        this.orderId = "";
        this.itemId = "";
        this.listClaimedBoosterItem = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
        this.listClaimedSpecialOfferItem = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
    }

    private HPLOMBuyResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMBuyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMBuyResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public boolean hasReturnCode() {
        return (__bitField0 & 1) == 1;
    }

    public HPLOMBuyResponse withReturnCode(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setReturnCode(value)
            .build();
    }

    public String getReturnMessge() {
        return returnMessge;
    }

    public boolean hasReturnMessge() {
        return (__bitField0 & 2) == 2;
    }

    public HPLOMBuyResponse withReturnMessge(String value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setReturnMessge(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 4) == 4;
    }

    public HPLOMBuyResponse withAmount(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 8) == 8;
    }

    public HPLOMBuyResponse withGold1(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 16) == 16;
    }

    public HPLOMBuyResponse withGold2(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 32) == 32;
    }

    public HPLOMBuyResponse withGold3(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }

    public int getHappyPlayCount() {
        return happyPlayCount;
    }

    public boolean hasHappyPlayCount() {
        return (__bitField0 & 64) == 64;
    }

    public HPLOMBuyResponse withHappyPlayCount(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setHappyPlayCount(value)
            .build();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public boolean hasTransactionId() {
        return (__bitField0 & 128) == 128;
    }

    public HPLOMBuyResponse withTransactionId(String value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setTransactionId(value)
            .build();
    }

    public int getHappyPlayEventNewCount() {
        return happyPlayEventNewCount;
    }

    public boolean hasHappyPlayEventNewCount() {
        return (__bitField0 & 256) == 256;
    }

    public HPLOMBuyResponse withHappyPlayEventNewCount(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setHappyPlayEventNewCount(value)
            .build();
    }

    public int getPetGoldBuff() {
        return petGoldBuff;
    }

    public boolean hasPetGoldBuff() {
        return (__bitField0 & 512) == 512;
    }

    public HPLOMBuyResponse withPetGoldBuff(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setPetGoldBuff(value)
            .build();
    }

    public int getTicketBuffCnt() {
        return ticketBuffCnt;
    }

    public boolean hasTicketBuffCnt() {
        return (__bitField0 & 1024) == 1024;
    }

    public HPLOMBuyResponse withTicketBuffCnt(int value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setTicketBuffCnt(value)
            .build();
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean hasOrderId() {
        return (__bitField0 & 2048) == 2048;
    }

    public HPLOMBuyResponse withOrderId(String value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setOrderId(value)
            .build();
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 4096) == 4096;
    }

    public HPLOMBuyResponse withItemId(String value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public proto.message.HPBoosterPackInfoResponse getListClaimedBoosterItem() {
        return listClaimedBoosterItem;
    }

    public boolean hasListClaimedBoosterItem() {
        return (__bitField0 & 8192) == 8192;
    }

    public HPLOMBuyResponse withListClaimedBoosterItem(proto.message.HPBoosterPackInfoResponse value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setListClaimedBoosterItem(value)
            .build();
    }

    public proto.message.HPSpecialOfferPackInfoResponse getListClaimedSpecialOfferItem() {
        return listClaimedSpecialOfferItem;
    }

    public boolean hasListClaimedSpecialOfferItem() {
        return (__bitField0 & 16384) == 16384;
    }

    public HPLOMBuyResponse withListClaimedSpecialOfferItem(proto.message.HPSpecialOfferPackInfoResponse value) {
        return HPLOMBuyResponse.newBuilder()
            .mergeFrom(this)
            .setListClaimedSpecialOfferItem(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMBuyResponse> cachedSchema() {
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
        HPLOMBuyResponse that = (HPLOMBuyResponse) obj;
        if (!java.util.Objects.equals(this.returnCode, that.returnCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.returnMessge, that.returnMessge)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold1, that.gold1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold2, that.gold2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold3, that.gold3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyPlayCount, that.happyPlayCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.transactionId, that.transactionId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyPlayEventNewCount, that.happyPlayEventNewCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.petGoldBuff, that.petGoldBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketBuffCnt, that.ticketBuffCnt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orderId, that.orderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listClaimedBoosterItem, that.listClaimedBoosterItem)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listClaimedSpecialOfferItem, that.listClaimedSpecialOfferItem)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.returnCode);
        result = 31 * result + (this.returnMessge == null ? 0 : this.returnMessge.hashCode());
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);
        result = 31 * result + Integer.hashCode(this.happyPlayCount);
        result = 31 * result + (this.transactionId == null ? 0 : this.transactionId.hashCode());
        result = 31 * result + Integer.hashCode(this.happyPlayEventNewCount);
        result = 31 * result + Integer.hashCode(this.petGoldBuff);
        result = 31 * result + Integer.hashCode(this.ticketBuffCnt);
        result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
        result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
        result = 31 * result + (this.listClaimedBoosterItem == null ? 0 : this.listClaimedBoosterItem.hashCode());
        result = 31 * result + (this.listClaimedSpecialOfferItem == null ? 0 : this.listClaimedSpecialOfferItem.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasReturnCode()) {
            parts.add("returnCode=" + getReturnCode());
        }
        if (hasReturnMessge()) {
            parts.add("returnMessge=" + getReturnMessge());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasGold1()) {
            parts.add("gold1=" + getGold1());
        }
        if (hasGold2()) {
            parts.add("gold2=" + getGold2());
        }
        if (hasGold3()) {
            parts.add("gold3=" + getGold3());
        }
        if (hasHappyPlayCount()) {
            parts.add("happyPlayCount=" + getHappyPlayCount());
        }
        if (hasTransactionId()) {
            parts.add("transactionId=" + getTransactionId());
        }
        if (hasHappyPlayEventNewCount()) {
            parts.add("happyPlayEventNewCount=" + getHappyPlayEventNewCount());
        }
        if (hasPetGoldBuff()) {
            parts.add("petGoldBuff=" + getPetGoldBuff());
        }
        if (hasTicketBuffCnt()) {
            parts.add("ticketBuffCnt=" + getTicketBuffCnt());
        }
        if (hasOrderId()) {
            parts.add("orderId=" + getOrderId());
        }
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasListClaimedBoosterItem()) {
            parts.add("listClaimedBoosterItem=" + getListClaimedBoosterItem());
        }
        if (hasListClaimedSpecialOfferItem()) {
            parts.add("listClaimedSpecialOfferItem=" + getListClaimedSpecialOfferItem());
        }
        return "HPLOMBuyResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMBuyResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("returnCode", 1);
        	__fieldMap.put("returnMessge", 2);
        	__fieldMap.put("amount", 3);
        	__fieldMap.put("gold1", 4);
        	__fieldMap.put("gold2", 5);
        	__fieldMap.put("gold3", 6);
        	__fieldMap.put("happyPlayCount", 7);
        	__fieldMap.put("transactionId", 8);
        	__fieldMap.put("happyPlayEventNewCount", 9);
        	__fieldMap.put("petGoldBuff", 10);
        	__fieldMap.put("ticketBuffCnt", 11);
        	__fieldMap.put("orderId", 12);
        	__fieldMap.put("itemId", 13);
        	__fieldMap.put("listClaimedBoosterItem", 14);
        	__fieldMap.put("listClaimedSpecialOfferItem", 15);
        }

        @Override
        public HPLOMBuyResponse newMessage() {
            return new HPLOMBuyResponse();
        }

        @Override
        public Class<HPLOMBuyResponse> typeClass() {
            return HPLOMBuyResponse.class;
        }

        @Override
        public String messageName() {
            return HPLOMBuyResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMBuyResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMBuyResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMBuyResponse instance) throws java.io.IOException {
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
                    	instance.returnCode = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.returnMessge = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.happyPlayCount = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.transactionId = input.readString();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.happyPlayEventNewCount = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.petGoldBuff = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.ticketBuffCnt = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.orderId = input.readString();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.itemId = input.readString();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.listClaimedBoosterItem = input.mergeObject(null, proto.message.HPBoosterPackInfoResponse.getSchema());
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.listClaimedSpecialOfferItem = input.mergeObject(null, proto.message.HPSpecialOfferPackInfoResponse.getSchema());
                    	instance.__bitField0 |= 16384;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPLOMBuyResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.returnCode, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.returnMessge, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.amount, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.gold1, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.gold2, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.gold3, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.happyPlayCount, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.transactionId, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.happyPlayEventNewCount, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.petGoldBuff, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(11, instance.ticketBuffCnt, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeString(12, instance.orderId, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeString(13, instance.itemId, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
            	output.writeObject(14, instance.listClaimedBoosterItem, proto.message.HPBoosterPackInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeObject(15, instance.listClaimedSpecialOfferItem, proto.message.HPSpecialOfferPackInfoResponse.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "returnCode";
        		case 2: return "returnMessge";
        		case 3: return "amount";
        		case 4: return "gold1";
        		case 5: return "gold2";
        		case 6: return "gold3";
        		case 7: return "happyPlayCount";
        		case 8: return "transactionId";
        		case 9: return "happyPlayEventNewCount";
        		case 10: return "petGoldBuff";
        		case 11: return "ticketBuffCnt";
        		case 12: return "orderId";
        		case 13: return "itemId";
        		case 14: return "listClaimedBoosterItem";
        		case 15: return "listClaimedSpecialOfferItem";
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

        private int returnCode;

        private String returnMessge;

        private int amount;

        private int gold1;

        private int gold2;

        private int gold3;

        private int happyPlayCount;

        private String transactionId;

        private int happyPlayEventNewCount;

        private int petGoldBuff;

        private int ticketBuffCnt;

        private String orderId;

        private String itemId;

        private proto.message.HPBoosterPackInfoResponse listClaimedBoosterItem;

        private proto.message.HPSpecialOfferPackInfoResponse listClaimedSpecialOfferItem;

        private int __bitField0;

        private Builder() {
            this.returnCode = 0;
            this.returnMessge = "";
            this.amount = 0;
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.happyPlayCount = 0;
            this.transactionId = "";
            this.happyPlayEventNewCount = 0;
            this.petGoldBuff = 0;
            this.ticketBuffCnt = 0;
            this.orderId = "";
            this.itemId = "";
            this.listClaimedBoosterItem = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
            this.listClaimedSpecialOfferItem = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
        }

        public Builder mergeFrom(HPLOMBuyResponse instance) {
            if (instance.hasReturnCode()) {
                this.setReturnCode(instance.getReturnCode());
            }

            if (instance.hasReturnMessge()) {
                this.setReturnMessge(instance.getReturnMessge());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasGold1()) {
                this.setGold1(instance.getGold1());
            }

            if (instance.hasGold2()) {
                this.setGold2(instance.getGold2());
            }

            if (instance.hasGold3()) {
                this.setGold3(instance.getGold3());
            }

            if (instance.hasHappyPlayCount()) {
                this.setHappyPlayCount(instance.getHappyPlayCount());
            }

            if (instance.hasTransactionId()) {
                this.setTransactionId(instance.getTransactionId());
            }

            if (instance.hasHappyPlayEventNewCount()) {
                this.setHappyPlayEventNewCount(instance.getHappyPlayEventNewCount());
            }

            if (instance.hasPetGoldBuff()) {
                this.setPetGoldBuff(instance.getPetGoldBuff());
            }

            if (instance.hasTicketBuffCnt()) {
                this.setTicketBuffCnt(instance.getTicketBuffCnt());
            }

            if (instance.hasOrderId()) {
                this.setOrderId(instance.getOrderId());
            }

            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasListClaimedBoosterItem()) {
                this.setListClaimedBoosterItem(instance.getListClaimedBoosterItem());
            }

            if (instance.hasListClaimedSpecialOfferItem()) {
                this.setListClaimedSpecialOfferItem(instance.getListClaimedSpecialOfferItem());
            }

            return this;
        }

        public int getReturnCode() {
            return returnCode;
        }

        public Builder setReturnCode(int value) {
            this.returnCode = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearReturnCode() {
            this.returnCode = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasReturnCode() {
            return (__bitField0 & 1) == 1;
        }

        public String getReturnMessge() {
            return returnMessge;
        }

        public Builder setReturnMessge(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#returnMessge to null");
            }

            this.returnMessge = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearReturnMessge() {
            this.returnMessge = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasReturnMessge() {
            return (__bitField0 & 2) == 2;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 4) == 4;
        }

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 8) == 8;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 16) == 16;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGold3() {
            return (__bitField0 & 32) == 32;
        }

        public int getHappyPlayCount() {
            return happyPlayCount;
        }

        public Builder setHappyPlayCount(int value) {
            this.happyPlayCount = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearHappyPlayCount() {
            this.happyPlayCount = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasHappyPlayCount() {
            return (__bitField0 & 64) == 64;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public Builder setTransactionId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#transactionId to null");
            }

            this.transactionId = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearTransactionId() {
            this.transactionId = "";
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasTransactionId() {
            return (__bitField0 & 128) == 128;
        }

        public int getHappyPlayEventNewCount() {
            return happyPlayEventNewCount;
        }

        public Builder setHappyPlayEventNewCount(int value) {
            this.happyPlayEventNewCount = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearHappyPlayEventNewCount() {
            this.happyPlayEventNewCount = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasHappyPlayEventNewCount() {
            return (__bitField0 & 256) == 256;
        }

        public int getPetGoldBuff() {
            return petGoldBuff;
        }

        public Builder setPetGoldBuff(int value) {
            this.petGoldBuff = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearPetGoldBuff() {
            this.petGoldBuff = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasPetGoldBuff() {
            return (__bitField0 & 512) == 512;
        }

        public int getTicketBuffCnt() {
            return ticketBuffCnt;
        }

        public Builder setTicketBuffCnt(int value) {
            this.ticketBuffCnt = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearTicketBuffCnt() {
            this.ticketBuffCnt = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasTicketBuffCnt() {
            return (__bitField0 & 1024) == 1024;
        }

        public String getOrderId() {
            return orderId;
        }

        public Builder setOrderId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#orderId to null");
            }

            this.orderId = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearOrderId() {
            this.orderId = "";
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasOrderId() {
            return (__bitField0 & 2048) == 2048;
        }

        public String getItemId() {
            return itemId;
        }

        public Builder setItemId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#itemId to null");
            }

            this.itemId = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = "";
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 4096) == 4096;
        }

        public proto.message.HPBoosterPackInfoResponse getListClaimedBoosterItem() {
            return listClaimedBoosterItem;
        }

        public Builder setListClaimedBoosterItem(proto.message.HPBoosterPackInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#listClaimedBoosterItem to null");
            }

            this.listClaimedBoosterItem = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearListClaimedBoosterItem() {
            this.listClaimedBoosterItem = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasListClaimedBoosterItem() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.HPSpecialOfferPackInfoResponse getListClaimedSpecialOfferItem() {
            return listClaimedSpecialOfferItem;
        }

        public Builder setListClaimedSpecialOfferItem(proto.message.HPSpecialOfferPackInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMBuyResponse#listClaimedSpecialOfferItem to null");
            }

            this.listClaimedSpecialOfferItem = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearListClaimedSpecialOfferItem() {
            this.listClaimedSpecialOfferItem = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasListClaimedSpecialOfferItem() {
            return (__bitField0 & 16384) == 16384;
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
            if (!java.util.Objects.equals(this.returnCode, that.returnCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.returnMessge, that.returnMessge)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyPlayCount, that.happyPlayCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.transactionId, that.transactionId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyPlayEventNewCount, that.happyPlayEventNewCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.petGoldBuff, that.petGoldBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ticketBuffCnt, that.ticketBuffCnt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orderId, that.orderId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listClaimedBoosterItem, that.listClaimedBoosterItem)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listClaimedSpecialOfferItem, that.listClaimedSpecialOfferItem)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.returnCode);
            result = 31 * result + (this.returnMessge == null ? 0 : this.returnMessge.hashCode());
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + Integer.hashCode(this.happyPlayCount);
            result = 31 * result + (this.transactionId == null ? 0 : this.transactionId.hashCode());
            result = 31 * result + Integer.hashCode(this.happyPlayEventNewCount);
            result = 31 * result + Integer.hashCode(this.petGoldBuff);
            result = 31 * result + Integer.hashCode(this.ticketBuffCnt);
            result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
            result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
            result = 31 * result + (this.listClaimedBoosterItem == null ? 0 : this.listClaimedBoosterItem.hashCode());
            result = 31 * result + (this.listClaimedSpecialOfferItem == null ? 0 : this.listClaimedSpecialOfferItem.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasReturnCode()) {
                parts.add("returnCode=" + getReturnCode());
            }
            if (hasReturnMessge()) {
                parts.add("returnMessge=" + getReturnMessge());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasGold1()) {
                parts.add("gold1=" + getGold1());
            }
            if (hasGold2()) {
                parts.add("gold2=" + getGold2());
            }
            if (hasGold3()) {
                parts.add("gold3=" + getGold3());
            }
            if (hasHappyPlayCount()) {
                parts.add("happyPlayCount=" + getHappyPlayCount());
            }
            if (hasTransactionId()) {
                parts.add("transactionId=" + getTransactionId());
            }
            if (hasHappyPlayEventNewCount()) {
                parts.add("happyPlayEventNewCount=" + getHappyPlayEventNewCount());
            }
            if (hasPetGoldBuff()) {
                parts.add("petGoldBuff=" + getPetGoldBuff());
            }
            if (hasTicketBuffCnt()) {
                parts.add("ticketBuffCnt=" + getTicketBuffCnt());
            }
            if (hasOrderId()) {
                parts.add("orderId=" + getOrderId());
            }
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasListClaimedBoosterItem()) {
                parts.add("listClaimedBoosterItem=" + getListClaimedBoosterItem());
            }
            if (hasListClaimedSpecialOfferItem()) {
                parts.add("listClaimedSpecialOfferItem=" + getListClaimedSpecialOfferItem());
            }
            return "HPLOMBuyResponse{" + String.join(", ", parts) + "}";
        }

        public HPLOMBuyResponse build() {
            proto.message.HPLOMBuyResponse result = new proto.message.HPLOMBuyResponse();
            result.__bitField0 = __bitField0;
            result.returnCode = this.returnCode;
            result.returnMessge = this.returnMessge;
            result.amount = this.amount;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            result.happyPlayCount = this.happyPlayCount;
            result.transactionId = this.transactionId;
            result.happyPlayEventNewCount = this.happyPlayEventNewCount;
            result.petGoldBuff = this.petGoldBuff;
            result.ticketBuffCnt = this.ticketBuffCnt;
            result.orderId = this.orderId;
            result.itemId = this.itemId;
            result.listClaimedBoosterItem = this.listClaimedBoosterItem;
            result.listClaimedSpecialOfferItem = this.listClaimedSpecialOfferItem;
            return result;
        }

    }



}