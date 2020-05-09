package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class LdbRecord
        implements io.protostuff.Message<LdbRecord> {

    private static final LdbRecord DEFAULT_INSTANCE = newBuilder().build();

    private String id;

    private String name;

    private int score;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LdbRecord() {
        this.id = "";
        this.name = "";
        this.score = 0;
    }

    private LdbRecord(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LdbRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LdbRecord> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public LdbRecord withId(String value) {
        return LdbRecord.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 2) == 2;
    }

    public LdbRecord withName(String value) {
        return LdbRecord.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public int getScore() {
        return score;
    }

    public boolean hasScore() {
        return (__bitField0 & 4) == 4;
    }

    public LdbRecord withScore(int value) {
        return LdbRecord.newBuilder()
            .mergeFrom(this)
            .setScore(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LdbRecord> cachedSchema() {
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
        LdbRecord that = (LdbRecord) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.score, that.score)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + Integer.hashCode(this.score);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasScore()) {
            parts.add("score=" + getScore());
        }
        return "LdbRecord{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LdbRecord>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("score", 3);
        }

        @Override
        public LdbRecord newMessage() {
            return new LdbRecord();
        }

        @Override
        public Class<LdbRecord> typeClass() {
            return LdbRecord.class;
        }

        @Override
        public String messageName() {
            return LdbRecord.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LdbRecord.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LdbRecord message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LdbRecord instance) throws java.io.IOException {
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
                    	instance.id = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.score = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, LdbRecord instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.score, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "score";
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

        private String id;

        private String name;

        private int score;

        private int __bitField0;

        private Builder() {
            this.id = "";
            this.name = "";
            this.score = 0;
        }

        public Builder mergeFrom(LdbRecord instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasScore()) {
                this.setScore(instance.getScore());
            }

            return this;
        }

        public String getId() {
            return id;
        }

        public Builder setId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LdbRecord#id to null");
            }

            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LdbRecord#name to null");
            }

            this.name = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasName() {
            return (__bitField0 & 2) == 2;
        }

        public int getScore() {
            return score;
        }

        public Builder setScore(int value) {
            this.score = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearScore() {
            this.score = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasScore() {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.score, that.score)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + Integer.hashCode(this.score);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasScore()) {
                parts.add("score=" + getScore());
            }
            return "LdbRecord{" + String.join(", ", parts) + "}";
        }

        public LdbRecord build() {
            proto.message.LdbRecord result = new proto.message.LdbRecord();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.score = this.score;
            return result;
        }

    }



}