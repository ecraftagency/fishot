package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameNetworkTime
        implements io.protostuff.Message<IngameNetworkTime> {

    private static final IngameNetworkTime DEFAULT_INSTANCE = newBuilder().build();

    private int connectiontype;

    private long networkavg;

    private long networkpick;

    private int networkpickgrp;

    private int networkpickid;

    private int networkudplost;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameNetworkTime() {
        this.connectiontype = 0;
        this.networkavg = 0L;
        this.networkpick = 0L;
        this.networkpickgrp = 0;
        this.networkpickid = 0;
        this.networkudplost = 0;
    }

    private IngameNetworkTime(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameNetworkTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameNetworkTime> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getConnectiontype() {
        return connectiontype;
    }

    public boolean hasConnectiontype() {
        return (__bitField0 & 1) == 1;
    }

    public IngameNetworkTime withConnectiontype(int value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setConnectiontype(value)
            .build();
    }

    public long getNetworkavg() {
        return networkavg;
    }

    public boolean hasNetworkavg() {
        return (__bitField0 & 2) == 2;
    }

    public IngameNetworkTime withNetworkavg(long value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setNetworkavg(value)
            .build();
    }

    public long getNetworkpick() {
        return networkpick;
    }

    public boolean hasNetworkpick() {
        return (__bitField0 & 4) == 4;
    }

    public IngameNetworkTime withNetworkpick(long value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setNetworkpick(value)
            .build();
    }

    public int getNetworkpickgrp() {
        return networkpickgrp;
    }

    public boolean hasNetworkpickgrp() {
        return (__bitField0 & 8) == 8;
    }

    public IngameNetworkTime withNetworkpickgrp(int value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setNetworkpickgrp(value)
            .build();
    }

    public int getNetworkpickid() {
        return networkpickid;
    }

    public boolean hasNetworkpickid() {
        return (__bitField0 & 16) == 16;
    }

    public IngameNetworkTime withNetworkpickid(int value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setNetworkpickid(value)
            .build();
    }

    public int getNetworkudplost() {
        return networkudplost;
    }

    public boolean hasNetworkudplost() {
        return (__bitField0 & 32) == 32;
    }

    public IngameNetworkTime withNetworkudplost(int value) {
        return IngameNetworkTime.newBuilder()
            .mergeFrom(this)
            .setNetworkudplost(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameNetworkTime> cachedSchema() {
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
        IngameNetworkTime that = (IngameNetworkTime) obj;
        if (!java.util.Objects.equals(this.connectiontype, that.connectiontype)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkavg, that.networkavg)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkpick, that.networkpick)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkpickgrp, that.networkpickgrp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkpickid, that.networkpickid)) {
            return false;
        }
        if (!java.util.Objects.equals(this.networkudplost, that.networkudplost)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.connectiontype);
        result = 31 * result + Long.hashCode(this.networkavg);
        result = 31 * result + Long.hashCode(this.networkpick);
        result = 31 * result + Integer.hashCode(this.networkpickgrp);
        result = 31 * result + Integer.hashCode(this.networkpickid);
        result = 31 * result + Integer.hashCode(this.networkudplost);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasConnectiontype()) {
            parts.add("connectiontype=" + getConnectiontype());
        }
        if (hasNetworkavg()) {
            parts.add("networkavg=" + getNetworkavg());
        }
        if (hasNetworkpick()) {
            parts.add("networkpick=" + getNetworkpick());
        }
        if (hasNetworkpickgrp()) {
            parts.add("networkpickgrp=" + getNetworkpickgrp());
        }
        if (hasNetworkpickid()) {
            parts.add("networkpickid=" + getNetworkpickid());
        }
        if (hasNetworkudplost()) {
            parts.add("networkudplost=" + getNetworkudplost());
        }
        return "IngameNetworkTime{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameNetworkTime>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("connectiontype", 1);
        	__fieldMap.put("networkavg", 2);
        	__fieldMap.put("networkpick", 3);
        	__fieldMap.put("networkpickgrp", 4);
        	__fieldMap.put("networkpickid", 5);
        	__fieldMap.put("networkudplost", 6);
        }

        @Override
        public IngameNetworkTime newMessage() {
            return new IngameNetworkTime();
        }

        @Override
        public Class<IngameNetworkTime> typeClass() {
            return IngameNetworkTime.class;
        }

        @Override
        public String messageName() {
            return IngameNetworkTime.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameNetworkTime.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameNetworkTime message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameNetworkTime instance) throws java.io.IOException {
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
                    	instance.connectiontype = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.networkavg = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.networkpick = input.readInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.networkpickgrp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.networkpickid = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.networkudplost = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameNetworkTime instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.connectiontype, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(2, instance.networkavg, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt64(3, instance.networkpick, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.networkpickgrp, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.networkpickid, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.networkudplost, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "connectiontype";
        		case 2: return "networkavg";
        		case 3: return "networkpick";
        		case 4: return "networkpickgrp";
        		case 5: return "networkpickid";
        		case 6: return "networkudplost";
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

        private int connectiontype;

        private long networkavg;

        private long networkpick;

        private int networkpickgrp;

        private int networkpickid;

        private int networkudplost;

        private int __bitField0;

        private Builder() {
            this.connectiontype = 0;
            this.networkavg = 0L;
            this.networkpick = 0L;
            this.networkpickgrp = 0;
            this.networkpickid = 0;
            this.networkudplost = 0;
        }

        public Builder mergeFrom(IngameNetworkTime instance) {
            if (instance.hasConnectiontype()) {
                this.setConnectiontype(instance.getConnectiontype());
            }

            if (instance.hasNetworkavg()) {
                this.setNetworkavg(instance.getNetworkavg());
            }

            if (instance.hasNetworkpick()) {
                this.setNetworkpick(instance.getNetworkpick());
            }

            if (instance.hasNetworkpickgrp()) {
                this.setNetworkpickgrp(instance.getNetworkpickgrp());
            }

            if (instance.hasNetworkpickid()) {
                this.setNetworkpickid(instance.getNetworkpickid());
            }

            if (instance.hasNetworkudplost()) {
                this.setNetworkudplost(instance.getNetworkudplost());
            }

            return this;
        }

        public int getConnectiontype() {
            return connectiontype;
        }

        public Builder setConnectiontype(int value) {
            this.connectiontype = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearConnectiontype() {
            this.connectiontype = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasConnectiontype() {
            return (__bitField0 & 1) == 1;
        }

        public long getNetworkavg() {
            return networkavg;
        }

        public Builder setNetworkavg(long value) {
            this.networkavg = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearNetworkavg() {
            this.networkavg = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasNetworkavg() {
            return (__bitField0 & 2) == 2;
        }

        public long getNetworkpick() {
            return networkpick;
        }

        public Builder setNetworkpick(long value) {
            this.networkpick = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearNetworkpick() {
            this.networkpick = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasNetworkpick() {
            return (__bitField0 & 4) == 4;
        }

        public int getNetworkpickgrp() {
            return networkpickgrp;
        }

        public Builder setNetworkpickgrp(int value) {
            this.networkpickgrp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearNetworkpickgrp() {
            this.networkpickgrp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasNetworkpickgrp() {
            return (__bitField0 & 8) == 8;
        }

        public int getNetworkpickid() {
            return networkpickid;
        }

        public Builder setNetworkpickid(int value) {
            this.networkpickid = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearNetworkpickid() {
            this.networkpickid = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasNetworkpickid() {
            return (__bitField0 & 16) == 16;
        }

        public int getNetworkudplost() {
            return networkudplost;
        }

        public Builder setNetworkudplost(int value) {
            this.networkudplost = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearNetworkudplost() {
            this.networkudplost = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasNetworkudplost() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.connectiontype, that.connectiontype)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkavg, that.networkavg)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkpick, that.networkpick)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkpickgrp, that.networkpickgrp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkpickid, that.networkpickid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.networkudplost, that.networkudplost)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.connectiontype);
            result = 31 * result + Long.hashCode(this.networkavg);
            result = 31 * result + Long.hashCode(this.networkpick);
            result = 31 * result + Integer.hashCode(this.networkpickgrp);
            result = 31 * result + Integer.hashCode(this.networkpickid);
            result = 31 * result + Integer.hashCode(this.networkudplost);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasConnectiontype()) {
                parts.add("connectiontype=" + getConnectiontype());
            }
            if (hasNetworkavg()) {
                parts.add("networkavg=" + getNetworkavg());
            }
            if (hasNetworkpick()) {
                parts.add("networkpick=" + getNetworkpick());
            }
            if (hasNetworkpickgrp()) {
                parts.add("networkpickgrp=" + getNetworkpickgrp());
            }
            if (hasNetworkpickid()) {
                parts.add("networkpickid=" + getNetworkpickid());
            }
            if (hasNetworkudplost()) {
                parts.add("networkudplost=" + getNetworkudplost());
            }
            return "IngameNetworkTime{" + String.join(", ", parts) + "}";
        }

        public IngameNetworkTime build() {
            proto.message.IngameNetworkTime result = new proto.message.IngameNetworkTime();
            result.__bitField0 = __bitField0;
            result.connectiontype = this.connectiontype;
            result.networkavg = this.networkavg;
            result.networkpick = this.networkpick;
            result.networkpickgrp = this.networkpickgrp;
            result.networkpickid = this.networkpickid;
            result.networkudplost = this.networkudplost;
            return result;
        }

    }



}