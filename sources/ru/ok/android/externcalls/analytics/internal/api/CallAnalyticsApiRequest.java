package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

public final class CallAnalyticsApiRequest implements yk {
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final String appVersion;
    private final sr0 items;
    private final CallAnalyticsLogger logger;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, sr0 sr0, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
        this.items = sr0;
        this.logger = callAnalyticsLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$getOkParser$0(db7 db7) throws IOException, JsonParseException {
        CallAnalyticsLogger callAnalyticsLogger = this.logger;
        callAnalyticsLogger.d(LOG_TAG, "Send response: " + db7.H());
        return null;
    }

    private void writeString(kb7 kb7, String str, String str2) throws IOException {
        writeString(kb7, str, str2, false);
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    public /* bridge */ /* synthetic */ za7 getFailParser() {
        return nd2.b;
    }

    public za7 getOkParser() {
        return new ync(14, this);
    }

    public int getPriority() {
        return 2;
    }

    public kl getScope() {
        return kl.c;
    }

    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    public Uri getUri() {
        return sl.a(this.apiMethod);
    }

    public boolean shouldGzip() {
        return true;
    }

    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    public void writeParams(kb7 kb7) throws IOException, JsonSerializeException {
        kb7.g0("data");
        kb7.s();
        writeString(kb7, "platform", this.platform, true);
        writeString(kb7, "app_version", this.appVersion);
        writeString(kb7, "sdk_type", this.sdkType);
        writeString(kb7, "sdk_version", this.sdkVersion);
        kb7.g0(ClientCookie.VERSION_ATTR);
        ((t1) kb7).a(Integer.toString(this.version));
        kb7.g0("items");
        this.items.write(kb7);
        kb7.q();
    }

    public /* bridge */ /* synthetic */ void writeSupplyParams(kb7 kb7) throws IOException, JsonSerializeException {
    }

    private void writeString(kb7 kb7, String str, String str2, boolean z) throws IOException {
        if (str2 == null) {
            return;
        }
        if (!z || !str2.isEmpty()) {
            kb7.g0(str);
            kb7.i(str2);
        }
    }
}
