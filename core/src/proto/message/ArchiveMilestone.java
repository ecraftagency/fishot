package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ArchiveMilestone
        implements io.protostuff.Message<ArchiveMilestone> {

    private static final ArchiveMilestone DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private java.util.List<proto.message.ArchiveItem> archive;

    private java.util.List<proto.message.ArchiveItem> reward;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ArchiveMilestone() {
        this.id = 0;
        this.archive = java.util.Collections.emptyList();
        this.reward = java.util.Collections.emptyList();
    }

    private ArchiveMilestone(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ArchiveMilestone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ArchiveMilestone> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public ArchiveMilestone withId(int value) {
        return ArchiveMilestone.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public java.util.List<proto.message.ArchiveItem> getArchiveList() {
        return archive;
    }

    public int getArchiveCount() {
        return archive.size();
    }

    public proto.message.ArchiveItem getArchive(int index) {
        return archive.get(index);
    }

    public ArchiveMilestone withArchive(java.util.List<proto.message.ArchiveItem> value) {
        return ArchiveMilestone.newBuilder()
            .mergeFrom(this)
            .clearArchive()
            .addAllArchive(value)
            .build();
    }

    public java.util.List<proto.message.ArchiveItem> getRewardList() {
        return reward;
    }

    public int getRewardCount() {
        return reward.size();
    }

    public proto.message.ArchiveItem getReward(int index) {
        return reward.get(index);
    }

    public ArchiveMilestone withReward(java.util.List<proto.message.ArchiveItem> value) {
        return ArchiveMilestone.newBuilder()
            .mergeFrom(this)
            .clearReward()
            .addAllReward(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ArchiveMilestone> cachedSchema() {
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
        ArchiveMilestone that = (ArchiveMilestone) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.archive, that.archive)) {
            return false;
        }
        if (!java.util.Objects.equals(this.reward, that.reward)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.archive == null ? 0 : this.archive.hashCode());
        result = 31 * result + (this.reward == null ? 0 : this.reward.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (!archive.isEmpty()) {
            parts.add("archive=" + getArchiveList());
        }
        if (!reward.isEmpty()) {
            parts.add("reward=" + getRewardList());
        }
        return "ArchiveMilestone{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ArchiveMilestone>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("archive", 2);
        	__fieldMap.put("reward", 3);
        }

        @Override
        public ArchiveMilestone newMessage() {
            return new ArchiveMilestone();
        }

        @Override
        public Class<ArchiveMilestone> typeClass() {
            return ArchiveMilestone.class;
        }

        @Override
        public String messageName() {
            return ArchiveMilestone.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ArchiveMilestone.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ArchiveMilestone message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ArchiveMilestone instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.archive = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.archive.add(input.mergeObject(null, proto.message.ArchiveItem.getSchema()));

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.reward = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.reward.add(input.mergeObject(null, proto.message.ArchiveItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.archive = java.util.Collections.unmodifiableList(instance.archive);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.reward = java.util.Collections.unmodifiableList(instance.reward);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ArchiveMilestone instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            for(proto.message.ArchiveItem archive : instance.archive) {
                output.writeObject(2, archive, proto.message.ArchiveItem.getSchema(), true);
            }

            for(proto.message.ArchiveItem reward : instance.reward) {
                output.writeObject(3, reward, proto.message.ArchiveItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "archive";
        		case 3: return "reward";
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

        private java.util.List<proto.message.ArchiveItem> archive;

        private java.util.List<proto.message.ArchiveItem> reward;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.archive = java.util.Collections.emptyList();
            this.reward = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ArchiveMilestone instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            this.addAllArchive(instance.getArchiveList());

            this.addAllReward(instance.getRewardList());

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

        public java.util.List<proto.message.ArchiveItem> getArchiveList() {
            return archive;
        }

        public Builder setArchive(int index, proto.message.ArchiveItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#archive to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.archive = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.archive.set(index, value);
            return this;
        }

        public Builder addArchive(proto.message.ArchiveItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#archive to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.archive = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.archive.add(value);
            return this;
        }

        public Builder addAllArchive(java.lang.Iterable<proto.message.ArchiveItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#archive to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.archive = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.ArchiveItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ArchiveMilestone#archive to null");
                }
                this.archive.add(value);
            }
            return this;
        }

        public Builder clearArchive() {
            this.archive = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getArchiveCount() {
            return archive.size();
        }

        public proto.message.ArchiveItem getArchive(int index) {
            return archive.get(index);
        }

        public java.util.List<proto.message.ArchiveItem> getRewardList() {
            return reward;
        }

        public Builder setReward(int index, proto.message.ArchiveItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#reward to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.reward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.reward.set(index, value);
            return this;
        }

        public Builder addReward(proto.message.ArchiveItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#reward to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.reward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.reward.add(value);
            return this;
        }

        public Builder addAllReward(java.lang.Iterable<proto.message.ArchiveItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ArchiveMilestone#reward to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.reward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.ArchiveItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ArchiveMilestone#reward to null");
                }
                this.reward.add(value);
            }
            return this;
        }

        public Builder clearReward() {
            this.reward = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getRewardCount() {
            return reward.size();
        }

        public proto.message.ArchiveItem getReward(int index) {
            return reward.get(index);
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
            if (!java.util.Objects.equals(this.archive, that.archive)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reward, that.reward)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.archive == null ? 0 : this.archive.hashCode());
            result = 31 * result + (this.reward == null ? 0 : this.reward.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (!archive.isEmpty()) {
                parts.add("archive=" + getArchiveList());
            }
            if (!reward.isEmpty()) {
                parts.add("reward=" + getRewardList());
            }
            return "ArchiveMilestone{" + String.join(", ", parts) + "}";
        }

        public ArchiveMilestone build() {
            proto.message.ArchiveMilestone result = new proto.message.ArchiveMilestone();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.archive = java.util.Collections.unmodifiableList(this.archive);
            result.reward = java.util.Collections.unmodifiableList(this.reward);
            return result;
        }

    }



}