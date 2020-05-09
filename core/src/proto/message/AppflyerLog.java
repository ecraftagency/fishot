package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class AppflyerLog
        implements io.protostuff.Message<AppflyerLog> {

    private static final AppflyerLog DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> str;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AppflyerLog() {
        this.str = java.util.Collections.emptyList();
    }

    private AppflyerLog(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AppflyerLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AppflyerLog> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<String> getStrList() {
        return str;
    }

    public int getStrCount() {
        return str.size();
    }

    public String getStr(int index) {
        return str.get(index);
    }

    public AppflyerLog withStr(java.util.List<String> value) {
        return AppflyerLog.newBuilder()
            .mergeFrom(this)
            .clearStr()
            .addAllStr(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AppflyerLog> cachedSchema() {
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
        AppflyerLog that = (AppflyerLog) obj;
        if (!java.util.Objects.equals(this.str, that.str)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.str == null ? 0 : this.str.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!str.isEmpty()) {
            parts.add("str=" + getStrList());
        }
        return "AppflyerLog{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AppflyerLog>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("str", 1);
        }

        @Override
        public AppflyerLog newMessage() {
            return new AppflyerLog();
        }

        @Override
        public Class<AppflyerLog> typeClass() {
            return AppflyerLog.class;
        }

        @Override
        public String messageName() {
            return AppflyerLog.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AppflyerLog.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AppflyerLog message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AppflyerLog instance) throws java.io.IOException {
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
                    	    instance.str = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.str.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.str = java.util.Collections.unmodifiableList(instance.str);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, AppflyerLog instance) throws java.io.IOException {
            for(String str : instance.str) {
                output.writeString(1, str, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "str";
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

        private java.util.List<String> str;

        private int __bitField0;

        private Builder() {
            this.str = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(AppflyerLog instance) {
            this.addAllStr(instance.getStrList());

            return this;
        }

        public java.util.List<String> getStrList() {
            return str;
        }

        public Builder setStr(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AppflyerLog#str to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.str = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.str.set(index, value);
            return this;
        }

        public Builder addStr(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AppflyerLog#str to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.str = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.str.add(value);
            return this;
        }

        public Builder addAllStr(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set AppflyerLog#str to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.str = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set AppflyerLog#str to null");
                }
                this.str.add(value);
            }
            return this;
        }

        public Builder clearStr() {
            this.str = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getStrCount() {
            return str.size();
        }

        public String getStr(int index) {
            return str.get(index);
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
            if (!java.util.Objects.equals(this.str, that.str)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.str == null ? 0 : this.str.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!str.isEmpty()) {
                parts.add("str=" + getStrList());
            }
            return "AppflyerLog{" + String.join(", ", parts) + "}";
        }

        public AppflyerLog build() {
            proto.message.AppflyerLog result = new proto.message.AppflyerLog();
            result.__bitField0 = __bitField0;
            result.str = java.util.Collections.unmodifiableList(this.str);
            return result;
        }

    }



}