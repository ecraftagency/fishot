package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class OrbitDataChecksum
        implements io.protostuff.Message<OrbitDataChecksum> {

    private static final OrbitDataChecksum DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.OrbitData> orbits;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OrbitDataChecksum() {
        this.orbits = java.util.Collections.emptyList();
    }

    private OrbitDataChecksum(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OrbitDataChecksum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OrbitDataChecksum> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.OrbitData> getOrbitsList() {
        return orbits;
    }

    public int getOrbitsCount() {
        return orbits.size();
    }

    public proto.message.OrbitData getOrbits(int index) {
        return orbits.get(index);
    }

    public OrbitDataChecksum withOrbits(java.util.List<proto.message.OrbitData> value) {
        return OrbitDataChecksum.newBuilder()
            .mergeFrom(this)
            .clearOrbits()
            .addAllOrbits(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OrbitDataChecksum> cachedSchema() {
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
        OrbitDataChecksum that = (OrbitDataChecksum) obj;
        if (!java.util.Objects.equals(this.orbits, that.orbits)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.orbits == null ? 0 : this.orbits.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!orbits.isEmpty()) {
            parts.add("orbits=" + getOrbitsList());
        }
        return "OrbitDataChecksum{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OrbitDataChecksum>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("orbits", 1);
        }

        @Override
        public OrbitDataChecksum newMessage() {
            return new OrbitDataChecksum();
        }

        @Override
        public Class<OrbitDataChecksum> typeClass() {
            return OrbitDataChecksum.class;
        }

        @Override
        public String messageName() {
            return OrbitDataChecksum.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OrbitDataChecksum.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OrbitDataChecksum message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OrbitDataChecksum instance) throws java.io.IOException {
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
                    	    instance.orbits = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.orbits.add(input.mergeObject(null, proto.message.OrbitData.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.orbits = java.util.Collections.unmodifiableList(instance.orbits);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, OrbitDataChecksum instance) throws java.io.IOException {
            for(proto.message.OrbitData orbits : instance.orbits) {
                output.writeObject(1, orbits, proto.message.OrbitData.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "orbits";
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

        private java.util.List<proto.message.OrbitData> orbits;

        private int __bitField0;

        private Builder() {
            this.orbits = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(OrbitDataChecksum instance) {
            this.addAllOrbits(instance.getOrbitsList());

            return this;
        }

        public java.util.List<proto.message.OrbitData> getOrbitsList() {
            return orbits;
        }

        public Builder setOrbits(int index, proto.message.OrbitData value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OrbitDataChecksum#orbits to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.orbits = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.orbits.set(index, value);
            return this;
        }

        public Builder addOrbits(proto.message.OrbitData value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OrbitDataChecksum#orbits to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.orbits = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.orbits.add(value);
            return this;
        }

        public Builder addAllOrbits(java.lang.Iterable<proto.message.OrbitData> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set OrbitDataChecksum#orbits to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.orbits = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.OrbitData value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set OrbitDataChecksum#orbits to null");
                }
                this.orbits.add(value);
            }
            return this;
        }

        public Builder clearOrbits() {
            this.orbits = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getOrbitsCount() {
            return orbits.size();
        }

        public proto.message.OrbitData getOrbits(int index) {
            return orbits.get(index);
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
            if (!java.util.Objects.equals(this.orbits, that.orbits)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.orbits == null ? 0 : this.orbits.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!orbits.isEmpty()) {
                parts.add("orbits=" + getOrbitsList());
            }
            return "OrbitDataChecksum{" + String.join(", ", parts) + "}";
        }

        public OrbitDataChecksum build() {
            proto.message.OrbitDataChecksum result = new proto.message.OrbitDataChecksum();
            result.__bitField0 = __bitField0;
            result.orbits = java.util.Collections.unmodifiableList(this.orbits);
            return result;
        }

    }



}