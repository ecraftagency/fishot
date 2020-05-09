package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerTeam
        implements io.protostuff.Message<SoccerTeam> {

    private static final SoccerTeam DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String name;

    private String logo;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerTeam() {
        this.id = 0;
        this.name = "";
        this.logo = "";
    }

    private SoccerTeam(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerTeam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerTeam> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerTeam withId(int value) {
        return SoccerTeam.newBuilder()
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

    public SoccerTeam withName(String value) {
        return SoccerTeam.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public String getLogo() {
        return logo;
    }

    public boolean hasLogo() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerTeam withLogo(String value) {
        return SoccerTeam.newBuilder()
            .mergeFrom(this)
            .setLogo(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerTeam> cachedSchema() {
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
        SoccerTeam that = (SoccerTeam) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.logo, that.logo)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + (this.logo == null ? 0 : this.logo.hashCode());

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
        if (hasLogo()) {
            parts.add("logo=" + getLogo());
        }
        return "SoccerTeam{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerTeam>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("logo", 3);
        }

        @Override
        public SoccerTeam newMessage() {
            return new SoccerTeam();
        }

        @Override
        public Class<SoccerTeam> typeClass() {
            return SoccerTeam.class;
        }

        @Override
        public String messageName() {
            return SoccerTeam.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerTeam.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerTeam message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerTeam instance) throws java.io.IOException {
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
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.logo = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerTeam instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.logo, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "logo";
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

        private String name;

        private String logo;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.name = "";
            this.logo = "";
        }

        public Builder mergeFrom(SoccerTeam instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasLogo()) {
                this.setLogo(instance.getLogo());
            }

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

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerTeam#name to null");
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

        public String getLogo() {
            return logo;
        }

        public Builder setLogo(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerTeam#logo to null");
            }

            this.logo = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearLogo() {
            this.logo = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasLogo() {
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
            if (!java.util.Objects.equals(this.logo, that.logo)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + (this.logo == null ? 0 : this.logo.hashCode());

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
            if (hasLogo()) {
                parts.add("logo=" + getLogo());
            }
            return "SoccerTeam{" + String.join(", ", parts) + "}";
        }

        public SoccerTeam build() {
            proto.message.SoccerTeam result = new proto.message.SoccerTeam();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.logo = this.logo;
            return result;
        }

    }



}