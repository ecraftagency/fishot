package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerTeamsResponse
        implements io.protostuff.Message<SoccerTeamsResponse> {

    private static final SoccerTeamsResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.SoccerTeam> teams;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerTeamsResponse() {
        this.teams = java.util.Collections.emptyList();
    }

    private SoccerTeamsResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerTeamsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerTeamsResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.SoccerTeam> getTeamsList() {
        return teams;
    }

    public int getTeamsCount() {
        return teams.size();
    }

    public proto.message.SoccerTeam getTeams(int index) {
        return teams.get(index);
    }

    public SoccerTeamsResponse withTeams(java.util.List<proto.message.SoccerTeam> value) {
        return SoccerTeamsResponse.newBuilder()
            .mergeFrom(this)
            .clearTeams()
            .addAllTeams(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerTeamsResponse> cachedSchema() {
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
        SoccerTeamsResponse that = (SoccerTeamsResponse) obj;
        if (!java.util.Objects.equals(this.teams, that.teams)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.teams == null ? 0 : this.teams.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!teams.isEmpty()) {
            parts.add("teams=" + getTeamsList());
        }
        return "SoccerTeamsResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerTeamsResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("teams", 1);
        }

        @Override
        public SoccerTeamsResponse newMessage() {
            return new SoccerTeamsResponse();
        }

        @Override
        public Class<SoccerTeamsResponse> typeClass() {
            return SoccerTeamsResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerTeamsResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerTeamsResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerTeamsResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerTeamsResponse instance) throws java.io.IOException {
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
                    	    instance.teams = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.teams.add(input.mergeObject(null, proto.message.SoccerTeam.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.teams = java.util.Collections.unmodifiableList(instance.teams);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerTeamsResponse instance) throws java.io.IOException {
            for(proto.message.SoccerTeam teams : instance.teams) {
                output.writeObject(1, teams, proto.message.SoccerTeam.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "teams";
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

        private java.util.List<proto.message.SoccerTeam> teams;

        private int __bitField0;

        private Builder() {
            this.teams = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(SoccerTeamsResponse instance) {
            this.addAllTeams(instance.getTeamsList());

            return this;
        }

        public java.util.List<proto.message.SoccerTeam> getTeamsList() {
            return teams;
        }

        public Builder setTeams(int index, proto.message.SoccerTeam value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerTeamsResponse#teams to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.teams = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.teams.set(index, value);
            return this;
        }

        public Builder addTeams(proto.message.SoccerTeam value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerTeamsResponse#teams to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.teams = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.teams.add(value);
            return this;
        }

        public Builder addAllTeams(java.lang.Iterable<proto.message.SoccerTeam> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set SoccerTeamsResponse#teams to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.teams = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.SoccerTeam value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set SoccerTeamsResponse#teams to null");
                }
                this.teams.add(value);
            }
            return this;
        }

        public Builder clearTeams() {
            this.teams = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getTeamsCount() {
            return teams.size();
        }

        public proto.message.SoccerTeam getTeams(int index) {
            return teams.get(index);
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
            if (!java.util.Objects.equals(this.teams, that.teams)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.teams == null ? 0 : this.teams.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!teams.isEmpty()) {
                parts.add("teams=" + getTeamsList());
            }
            return "SoccerTeamsResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerTeamsResponse build() {
            proto.message.SoccerTeamsResponse result = new proto.message.SoccerTeamsResponse();
            result.__bitField0 = __bitField0;
            result.teams = java.util.Collections.unmodifiableList(this.teams);
            return result;
        }

    }



}