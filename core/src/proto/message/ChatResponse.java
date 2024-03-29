package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class ChatResponse
        implements io.protostuff.Message<ChatResponse> {

    private static final ChatResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String content;

    private String userName;

    private int languageCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ChatResponse() {
        this.userID = "";
        this.content = "";
        this.userName = "";
        this.languageCode = 0;
    }

    private ChatResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ChatResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ChatResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public ChatResponse withUserID(String value) {
        return ChatResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 2) == 2;
    }

    public ChatResponse withContent(String value) {
        return ChatResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 4) == 4;
    }

    public ChatResponse withUserName(String value) {
        return ChatResponse.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public boolean hasLanguageCode() {
        return (__bitField0 & 8) == 8;
    }

    public ChatResponse withLanguageCode(int value) {
        return ChatResponse.newBuilder()
            .mergeFrom(this)
            .setLanguageCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ChatResponse> cachedSchema() {
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
        ChatResponse that = (ChatResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + Integer.hashCode(this.languageCode);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (hasLanguageCode()) {
            parts.add("languageCode=" + getLanguageCode());
        }
        return "ChatResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ChatResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("content", 2);
        	__fieldMap.put("userName", 3);
        	__fieldMap.put("languageCode", 4);
        }

        @Override
        public ChatResponse newMessage() {
            return new ChatResponse();
        }

        @Override
        public Class<ChatResponse> typeClass() {
            return ChatResponse.class;
        }

        @Override
        public String messageName() {
            return ChatResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ChatResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ChatResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ChatResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.languageCode = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ChatResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.userName, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.languageCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "content";
        		case 3: return "userName";
        		case 4: return "languageCode";
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

        private String userID;

        private String content;

        private String userName;

        private int languageCode;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.content = "";
            this.userName = "";
            this.languageCode = 0;
        }

        public Builder mergeFrom(ChatResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            if (instance.hasLanguageCode()) {
                this.setLanguageCode(instance.getLanguageCode());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasContent() {
            return (__bitField0 & 2) == 2;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatResponse#userName to null");
            }

            this.userName = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserName() {
            return (__bitField0 & 4) == 4;
        }

        public int getLanguageCode() {
            return languageCode;
        }

        public Builder setLanguageCode(int value) {
            this.languageCode = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearLanguageCode() {
            this.languageCode = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasLanguageCode() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + Integer.hashCode(this.languageCode);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasLanguageCode()) {
                parts.add("languageCode=" + getLanguageCode());
            }
            return "ChatResponse{" + String.join(", ", parts) + "}";
        }

        public ChatResponse build() {
            proto.message.ChatResponse result = new proto.message.ChatResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.content = this.content;
            result.userName = this.userName;
            result.languageCode = this.languageCode;
            return result;
        }

    }



}