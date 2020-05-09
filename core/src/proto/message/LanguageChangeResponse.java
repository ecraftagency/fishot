package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class LanguageChangeResponse
        implements io.protostuff.Message<LanguageChangeResponse> {

    private static final LanguageChangeResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int languageCode;

    private java.util.List<String> gameHints;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LanguageChangeResponse() {
        this.result = 0;
        this.languageCode = 0;
        this.gameHints = java.util.Collections.emptyList();
    }

    private LanguageChangeResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LanguageChangeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LanguageChangeResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getResult() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public LanguageChangeResponse withResult(int value) {
        return LanguageChangeResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public boolean hasLanguageCode() {
        return (__bitField0 & 2) == 2;
    }

    public LanguageChangeResponse withLanguageCode(int value) {
        return LanguageChangeResponse.newBuilder()
            .mergeFrom(this)
            .setLanguageCode(value)
            .build();
    }

    public java.util.List<String> getGameHintsList() {
        return gameHints;
    }

    public int getGameHintsCount() {
        return gameHints.size();
    }

    public String getGameHints(int index) {
        return gameHints.get(index);
    }

    public LanguageChangeResponse withGameHints(java.util.List<String> value) {
        return LanguageChangeResponse.newBuilder()
            .mergeFrom(this)
            .clearGameHints()
            .addAllGameHints(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LanguageChangeResponse> cachedSchema() {
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
        LanguageChangeResponse that = (LanguageChangeResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameHints, that.gameHints)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.languageCode);
        result = 31 * result + (this.gameHints == null ? 0 : this.gameHints.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult());
        }
        if (hasLanguageCode()) {
            parts.add("languageCode=" + getLanguageCode());
        }
        if (!gameHints.isEmpty()) {
            parts.add("gameHints=" + getGameHintsList());
        }
        return "LanguageChangeResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LanguageChangeResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("languageCode", 2);
        	__fieldMap.put("gameHints", 3);
        }

        @Override
        public LanguageChangeResponse newMessage() {
            return new LanguageChangeResponse();
        }

        @Override
        public Class<LanguageChangeResponse> typeClass() {
            return LanguageChangeResponse.class;
        }

        @Override
        public String messageName() {
            return LanguageChangeResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LanguageChangeResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LanguageChangeResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LanguageChangeResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.languageCode = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.gameHints = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.gameHints.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.gameHints = java.util.Collections.unmodifiableList(instance.gameHints);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, LanguageChangeResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.languageCode, false);
            }

            for(String gameHints : instance.gameHints) {
                output.writeString(3, gameHints, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "languageCode";
        		case 3: return "gameHints";
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

        private int result;

        private int languageCode;

        private java.util.List<String> gameHints;

        private int __bitField0;

        private Builder() {
            this.result = 0;
            this.languageCode = 0;
            this.gameHints = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(LanguageChangeResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasLanguageCode()) {
                this.setLanguageCode(instance.getLanguageCode());
            }

            this.addAllGameHints(instance.getGameHintsList());

            return this;
        }

        public int getResult() {
            return result;
        }

        public Builder setResult(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public int getLanguageCode() {
            return languageCode;
        }

        public Builder setLanguageCode(int value) {
            this.languageCode = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearLanguageCode() {
            this.languageCode = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasLanguageCode() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<String> getGameHintsList() {
            return gameHints;
        }

        public Builder setGameHints(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LanguageChangeResponse#gameHints to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.gameHints.set(index, value);
            return this;
        }

        public Builder addGameHints(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LanguageChangeResponse#gameHints to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.gameHints.add(value);
            return this;
        }

        public Builder addAllGameHints(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LanguageChangeResponse#gameHints to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LanguageChangeResponse#gameHints to null");
                }
                this.gameHints.add(value);
            }
            return this;
        }

        public Builder clearGameHints() {
            this.gameHints = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getGameHintsCount() {
            return gameHints.size();
        }

        public String getGameHints(int index) {
            return gameHints.get(index);
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameHints, that.gameHints)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.languageCode);
            result = 31 * result + (this.gameHints == null ? 0 : this.gameHints.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult());
            }
            if (hasLanguageCode()) {
                parts.add("languageCode=" + getLanguageCode());
            }
            if (!gameHints.isEmpty()) {
                parts.add("gameHints=" + getGameHintsList());
            }
            return "LanguageChangeResponse{" + String.join(", ", parts) + "}";
        }

        public LanguageChangeResponse build() {
            proto.message.LanguageChangeResponse result = new proto.message.LanguageChangeResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.languageCode = this.languageCode;
            result.gameHints = java.util.Collections.unmodifiableList(this.gameHints);
            return result;
        }

    }



}