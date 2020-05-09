package proto.message;

@javax.annotation.Generated("/Users/vunguyen/Desktop/test/core/src/proto/message.proto")
public final class Test
        implements io.protostuff.Message<Test> {

    private static final Test DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String name;

    private java.util.List<String> items;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Test() {
        this.id = 0;
        this.name = "";
        this.items = java.util.Collections.emptyList();
    }

    private Test(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Test getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Test> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Test withId(int value) {
        return Test.newBuilder()
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

    public Test withName(String value) {
        return Test.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public java.util.List<String> getItemsList() {
        return items;
    }

    public int getItemsCount() {
        return items.size();
    }

    public String getItems(int index) {
        return items.get(index);
    }

    public Test withItems(java.util.List<String> value) {
        return Test.newBuilder()
            .mergeFrom(this)
            .clearItems()
            .addAllItems(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Test> cachedSchema() {
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
        Test that = (Test) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.items, that.items)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + (this.items == null ? 0 : this.items.hashCode());

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
        if (!items.isEmpty()) {
            parts.add("items=" + getItemsList());
        }
        return "Test{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Test>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("items", 3);
        }

        @Override
        public Test newMessage() {
            return new Test();
        }

        @Override
        public Class<Test> typeClass() {
            return Test.class;
        }

        @Override
        public String messageName() {
            return Test.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Test.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Test message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Test instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.items = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.items.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.items = java.util.Collections.unmodifiableList(instance.items);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Test instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            for(String items : instance.items) {
                output.writeString(3, items, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "items";
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

        private java.util.List<String> items;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.name = "";
            this.items = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Test instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            this.addAllItems(instance.getItemsList());

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
                throw new NullPointerException("Cannot set Test#name to null");
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

        public java.util.List<String> getItemsList() {
            return items;
        }

        public Builder setItems(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Test#items to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.items.set(index, value);
            return this;
        }

        public Builder addItems(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Test#items to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.items.add(value);
            return this;
        }

        public Builder addAllItems(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Test#items to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Test#items to null");
                }
                this.items.add(value);
            }
            return this;
        }

        public Builder clearItems() {
            this.items = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getItemsCount() {
            return items.size();
        }

        public String getItems(int index) {
            return items.get(index);
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
            if (!java.util.Objects.equals(this.items, that.items)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + (this.items == null ? 0 : this.items.hashCode());

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
            if (!items.isEmpty()) {
                parts.add("items=" + getItemsList());
            }
            return "Test{" + String.join(", ", parts) + "}";
        }

        public Test build() {
            proto.message.Test result = new proto.message.Test();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.items = java.util.Collections.unmodifiableList(this.items);
            return result;
        }

    }



}