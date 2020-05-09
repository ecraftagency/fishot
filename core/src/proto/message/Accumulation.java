package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class Accumulation
        implements io.protostuff.Message<Accumulation> {

    private static final Accumulation DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int current;

    private java.util.List<Integer> milestones;

    private java.util.List<Integer> gifts;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Accumulation() {
        this.id = 0;
        this.current = 0;
        this.milestones = java.util.Collections.emptyList();
        this.gifts = java.util.Collections.emptyList();
    }

    private Accumulation(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Accumulation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Accumulation> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Accumulation withId(int value) {
        return Accumulation.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getCurrent() {
        return current;
    }

    public boolean hasCurrent() {
        return (__bitField0 & 2) == 2;
    }

    public Accumulation withCurrent(int value) {
        return Accumulation.newBuilder()
            .mergeFrom(this)
            .setCurrent(value)
            .build();
    }

    public java.util.List<Integer> getMilestonesList() {
        return milestones;
    }

    public int getMilestonesCount() {
        return milestones.size();
    }

    public int getMilestones(int index) {
        return milestones.get(index);
    }

    public Accumulation withMilestones(java.util.List<Integer> value) {
        return Accumulation.newBuilder()
            .mergeFrom(this)
            .clearMilestones()
            .addAllMilestones(value)
            .build();
    }

    public java.util.List<Integer> getGiftsList() {
        return gifts;
    }

    public int getGiftsCount() {
        return gifts.size();
    }

    public int getGifts(int index) {
        return gifts.get(index);
    }

    public Accumulation withGifts(java.util.List<Integer> value) {
        return Accumulation.newBuilder()
            .mergeFrom(this)
            .clearGifts()
            .addAllGifts(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Accumulation> cachedSchema() {
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
        Accumulation that = (Accumulation) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.current, that.current)) {
            return false;
        }
        if (!java.util.Objects.equals(this.milestones, that.milestones)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gifts, that.gifts)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.current);
        result = 31 * result + (this.milestones == null ? 0 : this.milestones.hashCode());
        result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasCurrent()) {
            parts.add("current=" + getCurrent());
        }
        if (!milestones.isEmpty()) {
            parts.add("milestones=" + getMilestonesList());
        }
        if (!gifts.isEmpty()) {
            parts.add("gifts=" + getGiftsList());
        }
        return "Accumulation{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Accumulation>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("current", 2);
        	__fieldMap.put("milestones", 4);
        	__fieldMap.put("gifts", 5);
        }

        @Override
        public Accumulation newMessage() {
            return new Accumulation();
        }

        @Override
        public Class<Accumulation> typeClass() {
            return Accumulation.class;
        }

        @Override
        public String messageName() {
            return Accumulation.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Accumulation.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Accumulation message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Accumulation instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.current = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.milestones = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.milestones.add(input.readInt32());

                    	break;
                    case 5:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.gifts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.gifts.add(input.readInt32());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.milestones = java.util.Collections.unmodifiableList(instance.milestones);
            }

            if((instance.__bitField0 & 8) == 8) {
                instance.gifts = java.util.Collections.unmodifiableList(instance.gifts);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Accumulation instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.current, false);
            }

            for(int milestones : instance.milestones) {
                output.writeInt32(4, milestones, true);
            }

            for(int gifts : instance.gifts) {
                output.writeInt32(5, gifts, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "current";
        		case 4: return "milestones";
        		case 5: return "gifts";
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

        private int id;

        private int current;

        private java.util.List<Integer> milestones;

        private java.util.List<Integer> gifts;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.current = 0;
            this.milestones = java.util.Collections.emptyList();
            this.gifts = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Accumulation instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasCurrent()) {
                this.setCurrent(instance.getCurrent());
            }

            this.addAllMilestones(instance.getMilestonesList());

            this.addAllGifts(instance.getGiftsList());

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public int getCurrent() {
            return current;
        }

        public Builder setCurrent(int value) {
            this.current = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCurrent() {
            this.current = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCurrent() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<Integer> getMilestonesList() {
            return milestones;
        }

        public Builder setMilestones(int index, int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.milestones.set(index, value);
            return this;
        }

        public Builder addMilestones(int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.milestones.add(value);
            return this;
        }

        public Builder addAllMilestones(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Accumulation#milestones to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Accumulation#milestones to null");
                }
                this.milestones.add(value);
            }
            return this;
        }

        public Builder clearMilestones() {
            this.milestones = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getMilestonesCount() {
            return milestones.size();
        }

        public int getMilestones(int index) {
            return milestones.get(index);
        }

        public java.util.List<Integer> getGiftsList() {
            return gifts;
        }

        public Builder setGifts(int index, int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.gifts.set(index, value);
            return this;
        }

        public Builder addGifts(int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.gifts.add(value);
            return this;
        }

        public Builder addAllGifts(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Accumulation#gifts to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Accumulation#gifts to null");
                }
                this.gifts.add(value);
            }
            return this;
        }

        public Builder clearGifts() {
            this.gifts = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getGiftsCount() {
            return gifts.size();
        }

        public int getGifts(int index) {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.current, that.current)) {
                return false;
            }
            if (!java.util.Objects.equals(this.milestones, that.milestones)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gifts, that.gifts)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.current);
            result = 31 * result + (this.milestones == null ? 0 : this.milestones.hashCode());
            result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasCurrent()) {
                parts.add("current=" + getCurrent());
            }
            if (!milestones.isEmpty()) {
                parts.add("milestones=" + getMilestonesList());
            }
            if (!gifts.isEmpty()) {
                parts.add("gifts=" + getGiftsList());
            }
            return "Accumulation{" + String.join(", ", parts) + "}";
        }

        public Accumulation build() {
            proto.message.Accumulation result = new proto.message.Accumulation();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.current = this.current;
            result.milestones = java.util.Collections.unmodifiableList(this.milestones);
            result.gifts = java.util.Collections.unmodifiableList(this.gifts);
            return result;
        }

    }



}