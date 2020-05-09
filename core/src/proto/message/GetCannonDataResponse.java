package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GetCannonDataResponse
        implements io.protostuff.Message<GetCannonDataResponse> {

    private static final GetCannonDataResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.CannonBase> bases;

    private java.util.List<proto.message.CannonUpgrade> upgrades;

    private java.util.List<proto.message.CannonBase> petCannons;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetCannonDataResponse() {
        this.bases = java.util.Collections.emptyList();
        this.upgrades = java.util.Collections.emptyList();
        this.petCannons = java.util.Collections.emptyList();
    }

    private GetCannonDataResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetCannonDataResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetCannonDataResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.CannonBase> getBasesList() {
        return bases;
    }

    public int getBasesCount() {
        return bases.size();
    }

    public proto.message.CannonBase getBases(int index) {
        return bases.get(index);
    }

    public GetCannonDataResponse withBases(java.util.List<proto.message.CannonBase> value) {
        return GetCannonDataResponse.newBuilder()
            .mergeFrom(this)
            .clearBases()
            .addAllBases(value)
            .build();
    }

    public java.util.List<proto.message.CannonUpgrade> getUpgradesList() {
        return upgrades;
    }

    public int getUpgradesCount() {
        return upgrades.size();
    }

    public proto.message.CannonUpgrade getUpgrades(int index) {
        return upgrades.get(index);
    }

    public GetCannonDataResponse withUpgrades(java.util.List<proto.message.CannonUpgrade> value) {
        return GetCannonDataResponse.newBuilder()
            .mergeFrom(this)
            .clearUpgrades()
            .addAllUpgrades(value)
            .build();
    }

    public java.util.List<proto.message.CannonBase> getPetCannonsList() {
        return petCannons;
    }

    public int getPetCannonsCount() {
        return petCannons.size();
    }

    public proto.message.CannonBase getPetCannons(int index) {
        return petCannons.get(index);
    }

    public GetCannonDataResponse withPetCannons(java.util.List<proto.message.CannonBase> value) {
        return GetCannonDataResponse.newBuilder()
            .mergeFrom(this)
            .clearPetCannons()
            .addAllPetCannons(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetCannonDataResponse> cachedSchema() {
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
        GetCannonDataResponse that = (GetCannonDataResponse) obj;
        if (!java.util.Objects.equals(this.bases, that.bases)) {
            return false;
        }
        if (!java.util.Objects.equals(this.upgrades, that.upgrades)) {
            return false;
        }
        if (!java.util.Objects.equals(this.petCannons, that.petCannons)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.bases == null ? 0 : this.bases.hashCode());
        result = 31 * result + (this.upgrades == null ? 0 : this.upgrades.hashCode());
        result = 31 * result + (this.petCannons == null ? 0 : this.petCannons.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!bases.isEmpty()) {
            parts.add("bases=" + getBasesList());
        }
        if (!upgrades.isEmpty()) {
            parts.add("upgrades=" + getUpgradesList());
        }
        if (!petCannons.isEmpty()) {
            parts.add("petCannons=" + getPetCannonsList());
        }
        return "GetCannonDataResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetCannonDataResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("bases", 1);
        	__fieldMap.put("upgrades", 2);
        	__fieldMap.put("petCannons", 3);
        }

        @Override
        public GetCannonDataResponse newMessage() {
            return new GetCannonDataResponse();
        }

        @Override
        public Class<GetCannonDataResponse> typeClass() {
            return GetCannonDataResponse.class;
        }

        @Override
        public String messageName() {
            return GetCannonDataResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetCannonDataResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetCannonDataResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetCannonDataResponse instance) throws java.io.IOException {
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
                    	    instance.bases = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.bases.add(input.mergeObject(null, proto.message.CannonBase.getSchema()));

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.upgrades = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.upgrades.add(input.mergeObject(null, proto.message.CannonUpgrade.getSchema()));

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.petCannons = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.petCannons.add(input.mergeObject(null, proto.message.CannonBase.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.bases = java.util.Collections.unmodifiableList(instance.bases);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.upgrades = java.util.Collections.unmodifiableList(instance.upgrades);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.petCannons = java.util.Collections.unmodifiableList(instance.petCannons);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetCannonDataResponse instance) throws java.io.IOException {
            for(proto.message.CannonBase bases : instance.bases) {
                output.writeObject(1, bases, proto.message.CannonBase.getSchema(), true);
            }

            for(proto.message.CannonUpgrade upgrades : instance.upgrades) {
                output.writeObject(2, upgrades, proto.message.CannonUpgrade.getSchema(), true);
            }

            for(proto.message.CannonBase petCannons : instance.petCannons) {
                output.writeObject(3, petCannons, proto.message.CannonBase.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "bases";
        		case 2: return "upgrades";
        		case 3: return "petCannons";
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

        private java.util.List<proto.message.CannonBase> bases;

        private java.util.List<proto.message.CannonUpgrade> upgrades;

        private java.util.List<proto.message.CannonBase> petCannons;

        private int __bitField0;

        private Builder() {
            this.bases = java.util.Collections.emptyList();
            this.upgrades = java.util.Collections.emptyList();
            this.petCannons = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetCannonDataResponse instance) {
            this.addAllBases(instance.getBasesList());

            this.addAllUpgrades(instance.getUpgradesList());

            this.addAllPetCannons(instance.getPetCannonsList());

            return this;
        }

        public java.util.List<proto.message.CannonBase> getBasesList() {
            return bases;
        }

        public Builder setBases(int index, proto.message.CannonBase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#bases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.bases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.bases.set(index, value);
            return this;
        }

        public Builder addBases(proto.message.CannonBase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#bases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.bases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.bases.add(value);
            return this;
        }

        public Builder addAllBases(java.lang.Iterable<proto.message.CannonBase> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#bases to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.bases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.CannonBase value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetCannonDataResponse#bases to null");
                }
                this.bases.add(value);
            }
            return this;
        }

        public Builder clearBases() {
            this.bases = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getBasesCount() {
            return bases.size();
        }

        public proto.message.CannonBase getBases(int index) {
            return bases.get(index);
        }

        public java.util.List<proto.message.CannonUpgrade> getUpgradesList() {
            return upgrades;
        }

        public Builder setUpgrades(int index, proto.message.CannonUpgrade value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#upgrades to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.upgrades = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.upgrades.set(index, value);
            return this;
        }

        public Builder addUpgrades(proto.message.CannonUpgrade value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#upgrades to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.upgrades = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.upgrades.add(value);
            return this;
        }

        public Builder addAllUpgrades(java.lang.Iterable<proto.message.CannonUpgrade> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#upgrades to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.upgrades = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.CannonUpgrade value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetCannonDataResponse#upgrades to null");
                }
                this.upgrades.add(value);
            }
            return this;
        }

        public Builder clearUpgrades() {
            this.upgrades = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getUpgradesCount() {
            return upgrades.size();
        }

        public proto.message.CannonUpgrade getUpgrades(int index) {
            return upgrades.get(index);
        }

        public java.util.List<proto.message.CannonBase> getPetCannonsList() {
            return petCannons;
        }

        public Builder setPetCannons(int index, proto.message.CannonBase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#petCannons to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.petCannons = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.petCannons.set(index, value);
            return this;
        }

        public Builder addPetCannons(proto.message.CannonBase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#petCannons to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.petCannons = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.petCannons.add(value);
            return this;
        }

        public Builder addAllPetCannons(java.lang.Iterable<proto.message.CannonBase> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetCannonDataResponse#petCannons to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.petCannons = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.CannonBase value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetCannonDataResponse#petCannons to null");
                }
                this.petCannons.add(value);
            }
            return this;
        }

        public Builder clearPetCannons() {
            this.petCannons = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getPetCannonsCount() {
            return petCannons.size();
        }

        public proto.message.CannonBase getPetCannons(int index) {
            return petCannons.get(index);
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
            if (!java.util.Objects.equals(this.bases, that.bases)) {
                return false;
            }
            if (!java.util.Objects.equals(this.upgrades, that.upgrades)) {
                return false;
            }
            if (!java.util.Objects.equals(this.petCannons, that.petCannons)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.bases == null ? 0 : this.bases.hashCode());
            result = 31 * result + (this.upgrades == null ? 0 : this.upgrades.hashCode());
            result = 31 * result + (this.petCannons == null ? 0 : this.petCannons.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!bases.isEmpty()) {
                parts.add("bases=" + getBasesList());
            }
            if (!upgrades.isEmpty()) {
                parts.add("upgrades=" + getUpgradesList());
            }
            if (!petCannons.isEmpty()) {
                parts.add("petCannons=" + getPetCannonsList());
            }
            return "GetCannonDataResponse{" + String.join(", ", parts) + "}";
        }

        public GetCannonDataResponse build() {
            proto.message.GetCannonDataResponse result = new proto.message.GetCannonDataResponse();
            result.__bitField0 = __bitField0;
            result.bases = java.util.Collections.unmodifiableList(this.bases);
            result.upgrades = java.util.Collections.unmodifiableList(this.upgrades);
            result.petCannons = java.util.Collections.unmodifiableList(this.petCannons);
            return result;
        }

    }



}