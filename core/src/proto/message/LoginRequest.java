package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class LoginRequest
        implements io.protostuff.Message<LoginRequest> {

    private static final LoginRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String password;

    private String facebookID;

    private String facebookToken;

    private String facebookName;

    private String deviceUID;

    private String deviceName;

    private String clientVersion;

    private String osPlatform;

    private String osVersion;

    private String connectionType;

    private String clientSource;

    private String thirdPartySource;

    private int snsflag;

    private String avatar;

    private boolean orbitTransform;

    private String snsWrongId;

    private String appleToken;

    private String refCode;

    private String piggyDeviceID;

    private boolean useCompress;

    private int bucketGame;

    private int bucketMoney;

    private int telcolCarrier;

    private int languageCode;

    private String oUserID;

    private String oPassword;

    private String buildSource;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LoginRequest() {
        this.userID = "";
        this.password = "";
        this.facebookID = "";
        this.facebookToken = "";
        this.facebookName = "";
        this.deviceUID = "";
        this.deviceName = "";
        this.clientVersion = "";
        this.osPlatform = "";
        this.osVersion = "";
        this.connectionType = "";
        this.clientSource = "";
        this.thirdPartySource = "";
        this.snsflag = 0;
        this.avatar = "";
        this.orbitTransform = false;
        this.snsWrongId = "";
        this.appleToken = "";
        this.refCode = "";
        this.piggyDeviceID = "";
        this.useCompress = false;
        this.bucketGame = 0;
        this.bucketMoney = 0;
        this.telcolCarrier = 0;
        this.languageCode = 0;
        this.oUserID = "";
        this.oPassword = "";
        this.buildSource = "";
    }

    private LoginRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LoginRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LoginRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public LoginRequest withUserID(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getPassword() {
        return password;
    }

    public boolean hasPassword() {
        return (__bitField0 & 2) == 2;
    }

    public LoginRequest withPassword(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setPassword(value)
            .build();
    }

    public String getFacebookID() {
        return facebookID;
    }

    public boolean hasFacebookID() {
        return (__bitField0 & 4) == 4;
    }

    public LoginRequest withFacebookID(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setFacebookID(value)
            .build();
    }

    public String getFacebookToken() {
        return facebookToken;
    }

    public boolean hasFacebookToken() {
        return (__bitField0 & 8) == 8;
    }

    public LoginRequest withFacebookToken(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setFacebookToken(value)
            .build();
    }

    public String getFacebookName() {
        return facebookName;
    }

    public boolean hasFacebookName() {
        return (__bitField0 & 16) == 16;
    }

    public LoginRequest withFacebookName(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setFacebookName(value)
            .build();
    }

    public String getDeviceUID() {
        return deviceUID;
    }

    public boolean hasDeviceUID() {
        return (__bitField0 & 32) == 32;
    }

    public LoginRequest withDeviceUID(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setDeviceUID(value)
            .build();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean hasDeviceName() {
        return (__bitField0 & 64) == 64;
    }

    public LoginRequest withDeviceName(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setDeviceName(value)
            .build();
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public boolean hasClientVersion() {
        return (__bitField0 & 128) == 128;
    }

    public LoginRequest withClientVersion(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setClientVersion(value)
            .build();
    }

    public String getOsPlatform() {
        return osPlatform;
    }

    public boolean hasOsPlatform() {
        return (__bitField0 & 256) == 256;
    }

    public LoginRequest withOsPlatform(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setOsPlatform(value)
            .build();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public boolean hasOsVersion() {
        return (__bitField0 & 512) == 512;
    }

    public LoginRequest withOsVersion(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setOsVersion(value)
            .build();
    }

    public String getConnectionType() {
        return connectionType;
    }

    public boolean hasConnectionType() {
        return (__bitField0 & 1024) == 1024;
    }

    public LoginRequest withConnectionType(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setConnectionType(value)
            .build();
    }

    public String getClientSource() {
        return clientSource;
    }

    public boolean hasClientSource() {
        return (__bitField0 & 2048) == 2048;
    }

    public LoginRequest withClientSource(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setClientSource(value)
            .build();
    }

    public String getThirdPartySource() {
        return thirdPartySource;
    }

    public boolean hasThirdPartySource() {
        return (__bitField0 & 4096) == 4096;
    }

    public LoginRequest withThirdPartySource(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setThirdPartySource(value)
            .build();
    }

    public int getSnsflag() {
        return snsflag;
    }

    public boolean hasSnsflag() {
        return (__bitField0 & 8192) == 8192;
    }

    public LoginRequest withSnsflag(int value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setSnsflag(value)
            .build();
    }

    public String getAvatar() {
        return avatar;
    }

    public boolean hasAvatar() {
        return (__bitField0 & 16384) == 16384;
    }

    public LoginRequest withAvatar(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setAvatar(value)
            .build();
    }

    public boolean getOrbitTransform() {
        return orbitTransform;
    }

    public boolean hasOrbitTransform() {
        return (__bitField0 & 32768) == 32768;
    }

    public LoginRequest withOrbitTransform(boolean value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setOrbitTransform(value)
            .build();
    }

    public String getSnsWrongId() {
        return snsWrongId;
    }

    public boolean hasSnsWrongId() {
        return (__bitField0 & 65536) == 65536;
    }

    public LoginRequest withSnsWrongId(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setSnsWrongId(value)
            .build();
    }

    public String getAppleToken() {
        return appleToken;
    }

    public boolean hasAppleToken() {
        return (__bitField0 & 131072) == 131072;
    }

    public LoginRequest withAppleToken(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setAppleToken(value)
            .build();
    }

    public String getRefCode() {
        return refCode;
    }

    public boolean hasRefCode() {
        return (__bitField0 & 262144) == 262144;
    }

    public LoginRequest withRefCode(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setRefCode(value)
            .build();
    }

    public String getPiggyDeviceID() {
        return piggyDeviceID;
    }

    public boolean hasPiggyDeviceID() {
        return (__bitField0 & 524288) == 524288;
    }

    public LoginRequest withPiggyDeviceID(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setPiggyDeviceID(value)
            .build();
    }

    public boolean getUseCompress() {
        return useCompress;
    }

    public boolean hasUseCompress() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public LoginRequest withUseCompress(boolean value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setUseCompress(value)
            .build();
    }

    public int getBucketGame() {
        return bucketGame;
    }

    public boolean hasBucketGame() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public LoginRequest withBucketGame(int value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setBucketGame(value)
            .build();
    }

    public int getBucketMoney() {
        return bucketMoney;
    }

    public boolean hasBucketMoney() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public LoginRequest withBucketMoney(int value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setBucketMoney(value)
            .build();
    }

    public int getTelcolCarrier() {
        return telcolCarrier;
    }

    public boolean hasTelcolCarrier() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public LoginRequest withTelcolCarrier(int value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setTelcolCarrier(value)
            .build();
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public boolean hasLanguageCode() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public LoginRequest withLanguageCode(int value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setLanguageCode(value)
            .build();
    }

    public String getOUserID() {
        return oUserID;
    }

    public boolean hasOUserID() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public LoginRequest withOUserID(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setOUserID(value)
            .build();
    }

    public String getOPassword() {
        return oPassword;
    }

    public boolean hasOPassword() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public LoginRequest withOPassword(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setOPassword(value)
            .build();
    }

    public String getBuildSource() {
        return buildSource;
    }

    public boolean hasBuildSource() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public LoginRequest withBuildSource(String value) {
        return LoginRequest.newBuilder()
            .mergeFrom(this)
            .setBuildSource(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LoginRequest> cachedSchema() {
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
        LoginRequest that = (LoginRequest) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.password, that.password)) {
            return false;
        }
        if (!java.util.Objects.equals(this.facebookID, that.facebookID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.facebookToken, that.facebookToken)) {
            return false;
        }
        if (!java.util.Objects.equals(this.facebookName, that.facebookName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.deviceUID, that.deviceUID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.deviceName, that.deviceName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clientVersion, that.clientVersion)) {
            return false;
        }
        if (!java.util.Objects.equals(this.osPlatform, that.osPlatform)) {
            return false;
        }
        if (!java.util.Objects.equals(this.osVersion, that.osVersion)) {
            return false;
        }
        if (!java.util.Objects.equals(this.connectionType, that.connectionType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clientSource, that.clientSource)) {
            return false;
        }
        if (!java.util.Objects.equals(this.thirdPartySource, that.thirdPartySource)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsflag, that.snsflag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avatar, that.avatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orbitTransform, that.orbitTransform)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsWrongId, that.snsWrongId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.appleToken, that.appleToken)) {
            return false;
        }
        if (!java.util.Objects.equals(this.refCode, that.refCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.piggyDeviceID, that.piggyDeviceID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.useCompress, that.useCompress)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bucketGame, that.bucketGame)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bucketMoney, that.bucketMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.telcolCarrier, that.telcolCarrier)) {
            return false;
        }
        if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.oUserID, that.oUserID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.oPassword, that.oPassword)) {
            return false;
        }
        if (!java.util.Objects.equals(this.buildSource, that.buildSource)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
        result = 31 * result + (this.facebookID == null ? 0 : this.facebookID.hashCode());
        result = 31 * result + (this.facebookToken == null ? 0 : this.facebookToken.hashCode());
        result = 31 * result + (this.facebookName == null ? 0 : this.facebookName.hashCode());
        result = 31 * result + (this.deviceUID == null ? 0 : this.deviceUID.hashCode());
        result = 31 * result + (this.deviceName == null ? 0 : this.deviceName.hashCode());
        result = 31 * result + (this.clientVersion == null ? 0 : this.clientVersion.hashCode());
        result = 31 * result + (this.osPlatform == null ? 0 : this.osPlatform.hashCode());
        result = 31 * result + (this.osVersion == null ? 0 : this.osVersion.hashCode());
        result = 31 * result + (this.connectionType == null ? 0 : this.connectionType.hashCode());
        result = 31 * result + (this.clientSource == null ? 0 : this.clientSource.hashCode());
        result = 31 * result + (this.thirdPartySource == null ? 0 : this.thirdPartySource.hashCode());
        result = 31 * result + Integer.hashCode(this.snsflag);
        result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
        result = 31 * result + Boolean.hashCode(this.orbitTransform);
        result = 31 * result + (this.snsWrongId == null ? 0 : this.snsWrongId.hashCode());
        result = 31 * result + (this.appleToken == null ? 0 : this.appleToken.hashCode());
        result = 31 * result + (this.refCode == null ? 0 : this.refCode.hashCode());
        result = 31 * result + (this.piggyDeviceID == null ? 0 : this.piggyDeviceID.hashCode());
        result = 31 * result + Boolean.hashCode(this.useCompress);
        result = 31 * result + Integer.hashCode(this.bucketGame);
        result = 31 * result + Integer.hashCode(this.bucketMoney);
        result = 31 * result + Integer.hashCode(this.telcolCarrier);
        result = 31 * result + Integer.hashCode(this.languageCode);
        result = 31 * result + (this.oUserID == null ? 0 : this.oUserID.hashCode());
        result = 31 * result + (this.oPassword == null ? 0 : this.oPassword.hashCode());
        result = 31 * result + (this.buildSource == null ? 0 : this.buildSource.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasPassword()) {
            parts.add("password=" + getPassword());
        }
        if (hasFacebookID()) {
            parts.add("facebookID=" + getFacebookID());
        }
        if (hasFacebookToken()) {
            parts.add("facebookToken=" + getFacebookToken());
        }
        if (hasFacebookName()) {
            parts.add("facebookName=" + getFacebookName());
        }
        if (hasDeviceUID()) {
            parts.add("deviceUID=" + getDeviceUID());
        }
        if (hasDeviceName()) {
            parts.add("deviceName=" + getDeviceName());
        }
        if (hasClientVersion()) {
            parts.add("clientVersion=" + getClientVersion());
        }
        if (hasOsPlatform()) {
            parts.add("osPlatform=" + getOsPlatform());
        }
        if (hasOsVersion()) {
            parts.add("osVersion=" + getOsVersion());
        }
        if (hasConnectionType()) {
            parts.add("connectionType=" + getConnectionType());
        }
        if (hasClientSource()) {
            parts.add("clientSource=" + getClientSource());
        }
        if (hasThirdPartySource()) {
            parts.add("thirdPartySource=" + getThirdPartySource());
        }
        if (hasSnsflag()) {
            parts.add("snsflag=" + getSnsflag());
        }
        if (hasAvatar()) {
            parts.add("avatar=" + getAvatar());
        }
        if (hasOrbitTransform()) {
            parts.add("orbitTransform=" + getOrbitTransform());
        }
        if (hasSnsWrongId()) {
            parts.add("snsWrongId=" + getSnsWrongId());
        }
        if (hasAppleToken()) {
            parts.add("appleToken=" + getAppleToken());
        }
        if (hasRefCode()) {
            parts.add("refCode=" + getRefCode());
        }
        if (hasPiggyDeviceID()) {
            parts.add("piggyDeviceID=" + getPiggyDeviceID());
        }
        if (hasUseCompress()) {
            parts.add("useCompress=" + getUseCompress());
        }
        if (hasBucketGame()) {
            parts.add("bucketGame=" + getBucketGame());
        }
        if (hasBucketMoney()) {
            parts.add("bucketMoney=" + getBucketMoney());
        }
        if (hasTelcolCarrier()) {
            parts.add("telcolCarrier=" + getTelcolCarrier());
        }
        if (hasLanguageCode()) {
            parts.add("languageCode=" + getLanguageCode());
        }
        if (hasOUserID()) {
            parts.add("oUserID=" + getOUserID());
        }
        if (hasOPassword()) {
            parts.add("oPassword=" + getOPassword());
        }
        if (hasBuildSource()) {
            parts.add("buildSource=" + getBuildSource());
        }
        return "LoginRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LoginRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("password", 2);
        	__fieldMap.put("facebookID", 3);
        	__fieldMap.put("facebookToken", 4);
        	__fieldMap.put("facebookName", 5);
        	__fieldMap.put("deviceUID", 6);
        	__fieldMap.put("deviceName", 7);
        	__fieldMap.put("clientVersion", 8);
        	__fieldMap.put("osPlatform", 9);
        	__fieldMap.put("osVersion", 10);
        	__fieldMap.put("connectionType", 11);
        	__fieldMap.put("clientSource", 12);
        	__fieldMap.put("thirdPartySource", 13);
        	__fieldMap.put("snsflag", 14);
        	__fieldMap.put("avatar", 15);
        	__fieldMap.put("orbitTransform", 16);
        	__fieldMap.put("snsWrongId", 17);
        	__fieldMap.put("appleToken", 18);
        	__fieldMap.put("refCode", 19);
        	__fieldMap.put("piggyDeviceID", 20);
        	__fieldMap.put("useCompress", 21);
        	__fieldMap.put("bucketGame", 22);
        	__fieldMap.put("bucketMoney", 23);
        	__fieldMap.put("telcolCarrier", 24);
        	__fieldMap.put("languageCode", 25);
        	__fieldMap.put("oUserID", 26);
        	__fieldMap.put("oPassword", 27);
        	__fieldMap.put("buildSource", 28);
        }

        @Override
        public LoginRequest newMessage() {
            return new LoginRequest();
        }

        @Override
        public Class<LoginRequest> typeClass() {
            return LoginRequest.class;
        }

        @Override
        public String messageName() {
            return LoginRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LoginRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LoginRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LoginRequest instance) throws java.io.IOException {
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
                    	instance.password = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.facebookID = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.facebookToken = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.facebookName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.deviceUID = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.deviceName = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.clientVersion = input.readString();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.osPlatform = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.osVersion = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.connectionType = input.readString();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.clientSource = input.readString();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.thirdPartySource = input.readString();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.snsflag = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.avatar = input.readString();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.orbitTransform = input.readBool();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.snsWrongId = input.readString();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.appleToken = input.readString();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.refCode = input.readString();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.piggyDeviceID = input.readString();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.useCompress = input.readBool();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 22:
                    	instance.bucketGame = input.readInt32();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 23:
                    	instance.bucketMoney = input.readInt32();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 24:
                    	instance.telcolCarrier = input.readInt32();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 25:
                    	instance.languageCode = input.readInt32();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 26:
                    	instance.oUserID = input.readString();
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 27:
                    	instance.oPassword = input.readString();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 28:
                    	instance.buildSource = input.readString();
                    	instance.__bitField0 |= 134217728;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, LoginRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.password, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.facebookID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.facebookToken, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.facebookName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.deviceUID, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.deviceName, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.clientVersion, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.osPlatform, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.osVersion, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeString(11, instance.connectionType, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeString(12, instance.clientSource, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeString(13, instance.thirdPartySource, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(14, instance.snsflag, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeString(15, instance.avatar, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeBool(16, instance.orbitTransform, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeString(17, instance.snsWrongId, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeString(18, instance.appleToken, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeString(19, instance.refCode, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeString(20, instance.piggyDeviceID, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeBool(21, instance.useCompress, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeInt32(22, instance.bucketGame, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeInt32(23, instance.bucketMoney, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeInt32(24, instance.telcolCarrier, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeInt32(25, instance.languageCode, false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
                output.writeString(26, instance.oUserID, false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeString(27, instance.oPassword, false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
                output.writeString(28, instance.buildSource, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "password";
        		case 3: return "facebookID";
        		case 4: return "facebookToken";
        		case 5: return "facebookName";
        		case 6: return "deviceUID";
        		case 7: return "deviceName";
        		case 8: return "clientVersion";
        		case 9: return "osPlatform";
        		case 10: return "osVersion";
        		case 11: return "connectionType";
        		case 12: return "clientSource";
        		case 13: return "thirdPartySource";
        		case 14: return "snsflag";
        		case 15: return "avatar";
        		case 16: return "orbitTransform";
        		case 17: return "snsWrongId";
        		case 18: return "appleToken";
        		case 19: return "refCode";
        		case 20: return "piggyDeviceID";
        		case 21: return "useCompress";
        		case 22: return "bucketGame";
        		case 23: return "bucketMoney";
        		case 24: return "telcolCarrier";
        		case 25: return "languageCode";
        		case 26: return "oUserID";
        		case 27: return "oPassword";
        		case 28: return "buildSource";
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

        private String password;

        private String facebookID;

        private String facebookToken;

        private String facebookName;

        private String deviceUID;

        private String deviceName;

        private String clientVersion;

        private String osPlatform;

        private String osVersion;

        private String connectionType;

        private String clientSource;

        private String thirdPartySource;

        private int snsflag;

        private String avatar;

        private boolean orbitTransform;

        private String snsWrongId;

        private String appleToken;

        private String refCode;

        private String piggyDeviceID;

        private boolean useCompress;

        private int bucketGame;

        private int bucketMoney;

        private int telcolCarrier;

        private int languageCode;

        private String oUserID;

        private String oPassword;

        private String buildSource;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.password = "";
            this.facebookID = "";
            this.facebookToken = "";
            this.facebookName = "";
            this.deviceUID = "";
            this.deviceName = "";
            this.clientVersion = "";
            this.osPlatform = "";
            this.osVersion = "";
            this.connectionType = "";
            this.clientSource = "";
            this.thirdPartySource = "";
            this.snsflag = 0;
            this.avatar = "";
            this.orbitTransform = false;
            this.snsWrongId = "";
            this.appleToken = "";
            this.refCode = "";
            this.piggyDeviceID = "";
            this.useCompress = false;
            this.bucketGame = 0;
            this.bucketMoney = 0;
            this.telcolCarrier = 0;
            this.languageCode = 0;
            this.oUserID = "";
            this.oPassword = "";
            this.buildSource = "";
        }

        public Builder mergeFrom(LoginRequest instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasPassword()) {
                this.setPassword(instance.getPassword());
            }

            if (instance.hasFacebookID()) {
                this.setFacebookID(instance.getFacebookID());
            }

            if (instance.hasFacebookToken()) {
                this.setFacebookToken(instance.getFacebookToken());
            }

            if (instance.hasFacebookName()) {
                this.setFacebookName(instance.getFacebookName());
            }

            if (instance.hasDeviceUID()) {
                this.setDeviceUID(instance.getDeviceUID());
            }

            if (instance.hasDeviceName()) {
                this.setDeviceName(instance.getDeviceName());
            }

            if (instance.hasClientVersion()) {
                this.setClientVersion(instance.getClientVersion());
            }

            if (instance.hasOsPlatform()) {
                this.setOsPlatform(instance.getOsPlatform());
            }

            if (instance.hasOsVersion()) {
                this.setOsVersion(instance.getOsVersion());
            }

            if (instance.hasConnectionType()) {
                this.setConnectionType(instance.getConnectionType());
            }

            if (instance.hasClientSource()) {
                this.setClientSource(instance.getClientSource());
            }

            if (instance.hasThirdPartySource()) {
                this.setThirdPartySource(instance.getThirdPartySource());
            }

            if (instance.hasSnsflag()) {
                this.setSnsflag(instance.getSnsflag());
            }

            if (instance.hasAvatar()) {
                this.setAvatar(instance.getAvatar());
            }

            if (instance.hasOrbitTransform()) {
                this.setOrbitTransform(instance.getOrbitTransform());
            }

            if (instance.hasSnsWrongId()) {
                this.setSnsWrongId(instance.getSnsWrongId());
            }

            if (instance.hasAppleToken()) {
                this.setAppleToken(instance.getAppleToken());
            }

            if (instance.hasRefCode()) {
                this.setRefCode(instance.getRefCode());
            }

            if (instance.hasPiggyDeviceID()) {
                this.setPiggyDeviceID(instance.getPiggyDeviceID());
            }

            if (instance.hasUseCompress()) {
                this.setUseCompress(instance.getUseCompress());
            }

            if (instance.hasBucketGame()) {
                this.setBucketGame(instance.getBucketGame());
            }

            if (instance.hasBucketMoney()) {
                this.setBucketMoney(instance.getBucketMoney());
            }

            if (instance.hasTelcolCarrier()) {
                this.setTelcolCarrier(instance.getTelcolCarrier());
            }

            if (instance.hasLanguageCode()) {
                this.setLanguageCode(instance.getLanguageCode());
            }

            if (instance.hasOUserID()) {
                this.setOUserID(instance.getOUserID());
            }

            if (instance.hasOPassword()) {
                this.setOPassword(instance.getOPassword());
            }

            if (instance.hasBuildSource()) {
                this.setBuildSource(instance.getBuildSource());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#userID to null");
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

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#password to null");
            }

            this.password = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPassword() {
            this.password = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPassword() {
            return (__bitField0 & 2) == 2;
        }

        public String getFacebookID() {
            return facebookID;
        }

        public Builder setFacebookID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#facebookID to null");
            }

            this.facebookID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearFacebookID() {
            this.facebookID = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasFacebookID() {
            return (__bitField0 & 4) == 4;
        }

        public String getFacebookToken() {
            return facebookToken;
        }

        public Builder setFacebookToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#facebookToken to null");
            }

            this.facebookToken = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFacebookToken() {
            this.facebookToken = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFacebookToken() {
            return (__bitField0 & 8) == 8;
        }

        public String getFacebookName() {
            return facebookName;
        }

        public Builder setFacebookName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#facebookName to null");
            }

            this.facebookName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFacebookName() {
            this.facebookName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFacebookName() {
            return (__bitField0 & 16) == 16;
        }

        public String getDeviceUID() {
            return deviceUID;
        }

        public Builder setDeviceUID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#deviceUID to null");
            }

            this.deviceUID = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearDeviceUID() {
            this.deviceUID = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasDeviceUID() {
            return (__bitField0 & 32) == 32;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public Builder setDeviceName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#deviceName to null");
            }

            this.deviceName = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearDeviceName() {
            this.deviceName = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasDeviceName() {
            return (__bitField0 & 64) == 64;
        }

        public String getClientVersion() {
            return clientVersion;
        }

        public Builder setClientVersion(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#clientVersion to null");
            }

            this.clientVersion = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearClientVersion() {
            this.clientVersion = "";
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasClientVersion() {
            return (__bitField0 & 128) == 128;
        }

        public String getOsPlatform() {
            return osPlatform;
        }

        public Builder setOsPlatform(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#osPlatform to null");
            }

            this.osPlatform = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearOsPlatform() {
            this.osPlatform = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasOsPlatform() {
            return (__bitField0 & 256) == 256;
        }

        public String getOsVersion() {
            return osVersion;
        }

        public Builder setOsVersion(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#osVersion to null");
            }

            this.osVersion = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearOsVersion() {
            this.osVersion = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasOsVersion() {
            return (__bitField0 & 512) == 512;
        }

        public String getConnectionType() {
            return connectionType;
        }

        public Builder setConnectionType(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#connectionType to null");
            }

            this.connectionType = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearConnectionType() {
            this.connectionType = "";
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasConnectionType() {
            return (__bitField0 & 1024) == 1024;
        }

        public String getClientSource() {
            return clientSource;
        }

        public Builder setClientSource(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#clientSource to null");
            }

            this.clientSource = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearClientSource() {
            this.clientSource = "";
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasClientSource() {
            return (__bitField0 & 2048) == 2048;
        }

        public String getThirdPartySource() {
            return thirdPartySource;
        }

        public Builder setThirdPartySource(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#thirdPartySource to null");
            }

            this.thirdPartySource = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearThirdPartySource() {
            this.thirdPartySource = "";
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasThirdPartySource() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getSnsflag() {
            return snsflag;
        }

        public Builder setSnsflag(int value) {
            this.snsflag = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearSnsflag() {
            this.snsflag = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasSnsflag() {
            return (__bitField0 & 8192) == 8192;
        }

        public String getAvatar() {
            return avatar;
        }

        public Builder setAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#avatar to null");
            }

            this.avatar = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearAvatar() {
            this.avatar = "";
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasAvatar() {
            return (__bitField0 & 16384) == 16384;
        }

        public boolean getOrbitTransform() {
            return orbitTransform;
        }

        public Builder setOrbitTransform(boolean value) {
            this.orbitTransform = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearOrbitTransform() {
            this.orbitTransform = false;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasOrbitTransform() {
            return (__bitField0 & 32768) == 32768;
        }

        public String getSnsWrongId() {
            return snsWrongId;
        }

        public Builder setSnsWrongId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#snsWrongId to null");
            }

            this.snsWrongId = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearSnsWrongId() {
            this.snsWrongId = "";
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasSnsWrongId() {
            return (__bitField0 & 65536) == 65536;
        }

        public String getAppleToken() {
            return appleToken;
        }

        public Builder setAppleToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#appleToken to null");
            }

            this.appleToken = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearAppleToken() {
            this.appleToken = "";
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasAppleToken() {
            return (__bitField0 & 131072) == 131072;
        }

        public String getRefCode() {
            return refCode;
        }

        public Builder setRefCode(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#refCode to null");
            }

            this.refCode = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearRefCode() {
            this.refCode = "";
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasRefCode() {
            return (__bitField0 & 262144) == 262144;
        }

        public String getPiggyDeviceID() {
            return piggyDeviceID;
        }

        public Builder setPiggyDeviceID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#piggyDeviceID to null");
            }

            this.piggyDeviceID = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearPiggyDeviceID() {
            this.piggyDeviceID = "";
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasPiggyDeviceID() {
            return (__bitField0 & 524288) == 524288;
        }

        public boolean getUseCompress() {
            return useCompress;
        }

        public Builder setUseCompress(boolean value) {
            this.useCompress = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearUseCompress() {
            this.useCompress = false;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasUseCompress() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public int getBucketGame() {
            return bucketGame;
        }

        public Builder setBucketGame(int value) {
            this.bucketGame = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearBucketGame() {
            this.bucketGame = 0;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasBucketGame() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public int getBucketMoney() {
            return bucketMoney;
        }

        public Builder setBucketMoney(int value) {
            this.bucketMoney = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearBucketMoney() {
            this.bucketMoney = 0;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasBucketMoney() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public int getTelcolCarrier() {
            return telcolCarrier;
        }

        public Builder setTelcolCarrier(int value) {
            this.telcolCarrier = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearTelcolCarrier() {
            this.telcolCarrier = 0;
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasTelcolCarrier() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public int getLanguageCode() {
            return languageCode;
        }

        public Builder setLanguageCode(int value) {
            this.languageCode = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearLanguageCode() {
            this.languageCode = 0;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasLanguageCode() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public String getOUserID() {
            return oUserID;
        }

        public Builder setOUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#oUserID to null");
            }

            this.oUserID = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearOUserID() {
            this.oUserID = "";
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasOUserID() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public String getOPassword() {
            return oPassword;
        }

        public Builder setOPassword(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#oPassword to null");
            }

            this.oPassword = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearOPassword() {
            this.oPassword = "";
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasOPassword() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public String getBuildSource() {
            return buildSource;
        }

        public Builder setBuildSource(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginRequest#buildSource to null");
            }

            this.buildSource = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearBuildSource() {
            this.buildSource = "";
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasBuildSource() {
            return (__bitField0 & 134217728) == 134217728;
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
            if (!java.util.Objects.equals(this.password, that.password)) {
                return false;
            }
            if (!java.util.Objects.equals(this.facebookID, that.facebookID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.facebookToken, that.facebookToken)) {
                return false;
            }
            if (!java.util.Objects.equals(this.facebookName, that.facebookName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.deviceUID, that.deviceUID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.deviceName, that.deviceName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clientVersion, that.clientVersion)) {
                return false;
            }
            if (!java.util.Objects.equals(this.osPlatform, that.osPlatform)) {
                return false;
            }
            if (!java.util.Objects.equals(this.osVersion, that.osVersion)) {
                return false;
            }
            if (!java.util.Objects.equals(this.connectionType, that.connectionType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clientSource, that.clientSource)) {
                return false;
            }
            if (!java.util.Objects.equals(this.thirdPartySource, that.thirdPartySource)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsflag, that.snsflag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avatar, that.avatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orbitTransform, that.orbitTransform)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsWrongId, that.snsWrongId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.appleToken, that.appleToken)) {
                return false;
            }
            if (!java.util.Objects.equals(this.refCode, that.refCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.piggyDeviceID, that.piggyDeviceID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.useCompress, that.useCompress)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bucketGame, that.bucketGame)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bucketMoney, that.bucketMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.telcolCarrier, that.telcolCarrier)) {
                return false;
            }
            if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.oUserID, that.oUserID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.oPassword, that.oPassword)) {
                return false;
            }
            if (!java.util.Objects.equals(this.buildSource, that.buildSource)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
            result = 31 * result + (this.facebookID == null ? 0 : this.facebookID.hashCode());
            result = 31 * result + (this.facebookToken == null ? 0 : this.facebookToken.hashCode());
            result = 31 * result + (this.facebookName == null ? 0 : this.facebookName.hashCode());
            result = 31 * result + (this.deviceUID == null ? 0 : this.deviceUID.hashCode());
            result = 31 * result + (this.deviceName == null ? 0 : this.deviceName.hashCode());
            result = 31 * result + (this.clientVersion == null ? 0 : this.clientVersion.hashCode());
            result = 31 * result + (this.osPlatform == null ? 0 : this.osPlatform.hashCode());
            result = 31 * result + (this.osVersion == null ? 0 : this.osVersion.hashCode());
            result = 31 * result + (this.connectionType == null ? 0 : this.connectionType.hashCode());
            result = 31 * result + (this.clientSource == null ? 0 : this.clientSource.hashCode());
            result = 31 * result + (this.thirdPartySource == null ? 0 : this.thirdPartySource.hashCode());
            result = 31 * result + Integer.hashCode(this.snsflag);
            result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
            result = 31 * result + Boolean.hashCode(this.orbitTransform);
            result = 31 * result + (this.snsWrongId == null ? 0 : this.snsWrongId.hashCode());
            result = 31 * result + (this.appleToken == null ? 0 : this.appleToken.hashCode());
            result = 31 * result + (this.refCode == null ? 0 : this.refCode.hashCode());
            result = 31 * result + (this.piggyDeviceID == null ? 0 : this.piggyDeviceID.hashCode());
            result = 31 * result + Boolean.hashCode(this.useCompress);
            result = 31 * result + Integer.hashCode(this.bucketGame);
            result = 31 * result + Integer.hashCode(this.bucketMoney);
            result = 31 * result + Integer.hashCode(this.telcolCarrier);
            result = 31 * result + Integer.hashCode(this.languageCode);
            result = 31 * result + (this.oUserID == null ? 0 : this.oUserID.hashCode());
            result = 31 * result + (this.oPassword == null ? 0 : this.oPassword.hashCode());
            result = 31 * result + (this.buildSource == null ? 0 : this.buildSource.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasPassword()) {
                parts.add("password=" + getPassword());
            }
            if (hasFacebookID()) {
                parts.add("facebookID=" + getFacebookID());
            }
            if (hasFacebookToken()) {
                parts.add("facebookToken=" + getFacebookToken());
            }
            if (hasFacebookName()) {
                parts.add("facebookName=" + getFacebookName());
            }
            if (hasDeviceUID()) {
                parts.add("deviceUID=" + getDeviceUID());
            }
            if (hasDeviceName()) {
                parts.add("deviceName=" + getDeviceName());
            }
            if (hasClientVersion()) {
                parts.add("clientVersion=" + getClientVersion());
            }
            if (hasOsPlatform()) {
                parts.add("osPlatform=" + getOsPlatform());
            }
            if (hasOsVersion()) {
                parts.add("osVersion=" + getOsVersion());
            }
            if (hasConnectionType()) {
                parts.add("connectionType=" + getConnectionType());
            }
            if (hasClientSource()) {
                parts.add("clientSource=" + getClientSource());
            }
            if (hasThirdPartySource()) {
                parts.add("thirdPartySource=" + getThirdPartySource());
            }
            if (hasSnsflag()) {
                parts.add("snsflag=" + getSnsflag());
            }
            if (hasAvatar()) {
                parts.add("avatar=" + getAvatar());
            }
            if (hasOrbitTransform()) {
                parts.add("orbitTransform=" + getOrbitTransform());
            }
            if (hasSnsWrongId()) {
                parts.add("snsWrongId=" + getSnsWrongId());
            }
            if (hasAppleToken()) {
                parts.add("appleToken=" + getAppleToken());
            }
            if (hasRefCode()) {
                parts.add("refCode=" + getRefCode());
            }
            if (hasPiggyDeviceID()) {
                parts.add("piggyDeviceID=" + getPiggyDeviceID());
            }
            if (hasUseCompress()) {
                parts.add("useCompress=" + getUseCompress());
            }
            if (hasBucketGame()) {
                parts.add("bucketGame=" + getBucketGame());
            }
            if (hasBucketMoney()) {
                parts.add("bucketMoney=" + getBucketMoney());
            }
            if (hasTelcolCarrier()) {
                parts.add("telcolCarrier=" + getTelcolCarrier());
            }
            if (hasLanguageCode()) {
                parts.add("languageCode=" + getLanguageCode());
            }
            if (hasOUserID()) {
                parts.add("oUserID=" + getOUserID());
            }
            if (hasOPassword()) {
                parts.add("oPassword=" + getOPassword());
            }
            if (hasBuildSource()) {
                parts.add("buildSource=" + getBuildSource());
            }
            return "LoginRequest{" + String.join(", ", parts) + "}";
        }

        public LoginRequest build() {
            proto.message.LoginRequest result = new proto.message.LoginRequest();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.password = this.password;
            result.facebookID = this.facebookID;
            result.facebookToken = this.facebookToken;
            result.facebookName = this.facebookName;
            result.deviceUID = this.deviceUID;
            result.deviceName = this.deviceName;
            result.clientVersion = this.clientVersion;
            result.osPlatform = this.osPlatform;
            result.osVersion = this.osVersion;
            result.connectionType = this.connectionType;
            result.clientSource = this.clientSource;
            result.thirdPartySource = this.thirdPartySource;
            result.snsflag = this.snsflag;
            result.avatar = this.avatar;
            result.orbitTransform = this.orbitTransform;
            result.snsWrongId = this.snsWrongId;
            result.appleToken = this.appleToken;
            result.refCode = this.refCode;
            result.piggyDeviceID = this.piggyDeviceID;
            result.useCompress = this.useCompress;
            result.bucketGame = this.bucketGame;
            result.bucketMoney = this.bucketMoney;
            result.telcolCarrier = this.telcolCarrier;
            result.languageCode = this.languageCode;
            result.oUserID = this.oUserID;
            result.oPassword = this.oPassword;
            result.buildSource = this.buildSource;
            return result;
        }

    }



}