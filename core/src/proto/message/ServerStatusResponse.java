package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ServerStatusResponse
        implements io.protostuff.Message<ServerStatusResponse> {

    private static final ServerStatusResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean status;

    private java.util.List<proto.message.ServerStatusResponse.ServerStatus> servers;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServerStatusResponse() {
        this.status = false;
        this.servers = java.util.Collections.emptyList();
    }

    private ServerStatusResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServerStatusResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServerStatusResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean hasStatus() {
        return (__bitField0 & 1) == 1;
    }

    public ServerStatusResponse withStatus(boolean value) {
        return ServerStatusResponse.newBuilder()
            .mergeFrom(this)
            .setStatus(value)
            .build();
    }

    public java.util.List<proto.message.ServerStatusResponse.ServerStatus> getServersList() {
        return servers;
    }

    public int getServersCount() {
        return servers.size();
    }

    public proto.message.ServerStatusResponse.ServerStatus getServers(int index) {
        return servers.get(index);
    }

    public ServerStatusResponse withServers(java.util.List<proto.message.ServerStatusResponse.ServerStatus> value) {
        return ServerStatusResponse.newBuilder()
            .mergeFrom(this)
            .clearServers()
            .addAllServers(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServerStatusResponse> cachedSchema() {
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
        ServerStatusResponse that = (ServerStatusResponse) obj;
        if (!java.util.Objects.equals(this.status, that.status)) {
            return false;
        }
        if (!java.util.Objects.equals(this.servers, that.servers)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.status);
        result = 31 * result + (this.servers == null ? 0 : this.servers.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasStatus()) {
            parts.add("status=" + getStatus());
        }
        if (!servers.isEmpty()) {
            parts.add("servers=" + getServersList());
        }
        return "ServerStatusResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServerStatusResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("status", 1);
        	__fieldMap.put("servers", 2);
        }

        @Override
        public ServerStatusResponse newMessage() {
            return new ServerStatusResponse();
        }

        @Override
        public Class<ServerStatusResponse> typeClass() {
            return ServerStatusResponse.class;
        }

        @Override
        public String messageName() {
            return ServerStatusResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServerStatusResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServerStatusResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServerStatusResponse instance) throws java.io.IOException {
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
                    	instance.status = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.servers = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.servers.add(input.mergeObject(null, proto.message.ServerStatusResponse.ServerStatus.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.servers = java.util.Collections.unmodifiableList(instance.servers);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ServerStatusResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.status, false);
            }

            for(proto.message.ServerStatusResponse.ServerStatus servers : instance.servers) {
                output.writeObject(2, servers, proto.message.ServerStatusResponse.ServerStatus.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "status";
        		case 2: return "servers";
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

        private boolean status;

        private java.util.List<proto.message.ServerStatusResponse.ServerStatus> servers;

        private int __bitField0;

        private Builder() {
            this.status = false;
            this.servers = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ServerStatusResponse instance) {
            if (instance.hasStatus()) {
                this.setStatus(instance.getStatus());
            }

            this.addAllServers(instance.getServersList());

            return this;
        }

        public boolean getStatus() {
            return status;
        }

        public Builder setStatus(boolean value) {
            this.status = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearStatus() {
            this.status = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasStatus() {
            return (__bitField0 & 1) == 1;
        }

        public java.util.List<proto.message.ServerStatusResponse.ServerStatus> getServersList() {
            return servers;
        }

        public Builder setServers(int index, proto.message.ServerStatusResponse.ServerStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerStatusResponse#servers to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.servers.set(index, value);
            return this;
        }

        public Builder addServers(proto.message.ServerStatusResponse.ServerStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerStatusResponse#servers to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.servers.add(value);
            return this;
        }

        public Builder addAllServers(java.lang.Iterable<proto.message.ServerStatusResponse.ServerStatus> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServerStatusResponse#servers to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.ServerStatusResponse.ServerStatus value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServerStatusResponse#servers to null");
                }
                this.servers.add(value);
            }
            return this;
        }

        public Builder clearServers() {
            this.servers = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getServersCount() {
            return servers.size();
        }

        public proto.message.ServerStatusResponse.ServerStatus getServers(int index) {
            return servers.get(index);
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
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.servers, that.servers)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.status);
            result = 31 * result + (this.servers == null ? 0 : this.servers.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasStatus()) {
                parts.add("status=" + getStatus());
            }
            if (!servers.isEmpty()) {
                parts.add("servers=" + getServersList());
            }
            return "ServerStatusResponse{" + String.join(", ", parts) + "}";
        }

        public ServerStatusResponse build() {
            proto.message.ServerStatusResponse result = new proto.message.ServerStatusResponse();
            result.__bitField0 = __bitField0;
            result.status = this.status;
            result.servers = java.util.Collections.unmodifiableList(this.servers);
            return result;
        }

    }

    public static final class ServerStatus
            implements io.protostuff.Message<ServerStatus> {

        private static final ServerStatus DEFAULT_INSTANCE = newBuilder().build();

        private String ip;

        private int port;

        private boolean status;

        private String domain;

        private boolean __merge_lock = false;
        private int __bitField0;

        private ServerStatus() {
            this.ip = "";
            this.port = 0;
            this.status = false;
            this.domain = "";
        }

        private ServerStatus(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static ServerStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<ServerStatus> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public String getIp() {
            return ip;
        }

        public boolean hasIp() {
            return (__bitField0 & 1) == 1;
        }

        public ServerStatus withIp(String value) {
            return ServerStatus.newBuilder()
                .mergeFrom(this)
                .setIp(value)
                .build();
        }

        public int getPort() {
            return port;
        }

        public boolean hasPort() {
            return (__bitField0 & 2) == 2;
        }

        public ServerStatus withPort(int value) {
            return ServerStatus.newBuilder()
                .mergeFrom(this)
                .setPort(value)
                .build();
        }

        public boolean getStatus() {
            return status;
        }

        public boolean hasStatus() {
            return (__bitField0 & 4) == 4;
        }

        public ServerStatus withStatus(boolean value) {
            return ServerStatus.newBuilder()
                .mergeFrom(this)
                .setStatus(value)
                .build();
        }

        public String getDomain() {
            return domain;
        }

        public boolean hasDomain() {
            return (__bitField0 & 8) == 8;
        }

        public ServerStatus withDomain(String value) {
            return ServerStatus.newBuilder()
                .mergeFrom(this)
                .setDomain(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<ServerStatus> cachedSchema() {
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
            ServerStatus that = (ServerStatus) obj;
            if (!java.util.Objects.equals(this.ip, that.ip)) {
                return false;
            }
            if (!java.util.Objects.equals(this.port, that.port)) {
                return false;
            }
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.domain, that.domain)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
            result = 31 * result + Integer.hashCode(this.port);
            result = 31 * result + Boolean.hashCode(this.status);
            result = 31 * result + (this.domain == null ? 0 : this.domain.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasIp()) {
                parts.add("ip=" + getIp());
            }
            if (hasPort()) {
                parts.add("port=" + getPort());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus());
            }
            if (hasDomain()) {
                parts.add("domain=" + getDomain());
            }
            return "ServerStatus{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<ServerStatus>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("ip", 1);
            	__fieldMap.put("port", 2);
            	__fieldMap.put("status", 3);
            	__fieldMap.put("domain", 4);
            }

            @Override
            public ServerStatus newMessage() {
                return new ServerStatus();
            }

            @Override
            public Class<ServerStatus> typeClass() {
                return ServerStatus.class;
            }

            @Override
            public String messageName() {
                return ServerStatus.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return ServerStatus.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(ServerStatus message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, ServerStatus instance) throws java.io.IOException {
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
                        	instance.ip = input.readString();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.port = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.status = input.readBool();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.domain = input.readString();
                        	instance.__bitField0 |= 8;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, ServerStatus instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeString(1, instance.ip, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.port, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeBool(3, instance.status, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeString(4, instance.domain, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "ip";
            		case 2: return "port";
            		case 3: return "status";
            		case 4: return "domain";
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

            private String ip;

            private int port;

            private boolean status;

            private String domain;

            private int __bitField0;

            private Builder() {
                this.ip = "";
                this.port = 0;
                this.status = false;
                this.domain = "";
            }

            public Builder mergeFrom(ServerStatus instance) {
                if (instance.hasIp()) {
                    this.setIp(instance.getIp());
                }

                if (instance.hasPort()) {
                    this.setPort(instance.getPort());
                }

                if (instance.hasStatus()) {
                    this.setStatus(instance.getStatus());
                }

                if (instance.hasDomain()) {
                    this.setDomain(instance.getDomain());
                }

                return this;
            }

            public String getIp() {
                return ip;
            }

            public Builder setIp(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set ServerStatus#ip to null");
                }

                this.ip = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearIp() {
                this.ip = "";
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasIp() {
                return (__bitField0 & 1) == 1;
            }

            public int getPort() {
                return port;
            }

            public Builder setPort(int value) {
                this.port = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearPort() {
                this.port = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasPort() {
                return (__bitField0 & 2) == 2;
            }

            public boolean getStatus() {
                return status;
            }

            public Builder setStatus(boolean value) {
                this.status = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearStatus() {
                this.status = false;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasStatus() {
                return (__bitField0 & 4) == 4;
            }

            public String getDomain() {
                return domain;
            }

            public Builder setDomain(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set ServerStatus#domain to null");
                }

                this.domain = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearDomain() {
                this.domain = "";
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasDomain() {
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
                if (!java.util.Objects.equals(this.ip, that.ip)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.port, that.port)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.status, that.status)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.domain, that.domain)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
                result = 31 * result + Integer.hashCode(this.port);
                result = 31 * result + Boolean.hashCode(this.status);
                result = 31 * result + (this.domain == null ? 0 : this.domain.hashCode());

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasIp()) {
                    parts.add("ip=" + getIp());
                }
                if (hasPort()) {
                    parts.add("port=" + getPort());
                }
                if (hasStatus()) {
                    parts.add("status=" + getStatus());
                }
                if (hasDomain()) {
                    parts.add("domain=" + getDomain());
                }
                return "ServerStatus{" + String.join(", ", parts) + "}";
            }

            public ServerStatus build() {
                proto.message.ServerStatusResponse.ServerStatus result = new proto.message.ServerStatusResponse.ServerStatus();
                result.__bitField0 = __bitField0;
                result.ip = this.ip;
                result.port = this.port;
                result.status = this.status;
                result.domain = this.domain;
                return result;
            }

        }



    }


}