package ru.ok.android.externcalls.sdk;

public class SimpleConfigurationStore implements se3 {
    private final String appKey;
    private final String baseEndpoint;
    private re3 sessionInfo;

    public SimpleConfigurationStore(se3 se3) {
        this.appKey = se3.getAppKey();
        this.baseEndpoint = se3.getBaseEndpoint();
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    public re3 getSessionInfo() {
        return this.sessionInfo;
    }

    public void setSessionInfo(re3 re3) {
        this.sessionInfo = re3;
    }
}
