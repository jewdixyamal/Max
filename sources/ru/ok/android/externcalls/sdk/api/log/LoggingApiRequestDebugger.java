package ru.ok.android.externcalls.sdk.api.log;

import android.net.Uri;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Metadata;
import org.json.JSONException;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger;", "Lhl;", "La4c;", "log", "<init>", "(La4c;)V", "Lfl;", "request", "", "getParams", "(Lfl;)Ljava/lang/String;", "jsonString", "eraseSecrets", "(Ljava/lang/String;)Ljava/lang/String;", "getRawParams", "Lvk;", "engine", "Lwk;", "config", "Le5f;", "debugApiRequest", "(Lvk;Lfl;Lwk;)V", "Ldb7;", "reader", "debugApiResponseOk", "(Lvk;Lfl;Ldb7;)Ldb7;", "debugApiResponseFail", "Lru/ok/android/api/core/ApiException;", "exception", "debugApiException", "(Lvk;Lfl;Lru/ok/android/api/core/ApiException;)V", "Ljava/io/IOException;", "debugIoException", "(Lvk;Lfl;Ljava/io/IOException;)V", "La4c;", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "secretEraser", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class LoggingApiRequestDebugger implements hl {
    private static final Companion Companion = new Companion((z84) null);
    private static final String ERASED_SECRET = "<ERASED_SECRET>";
    private static final String TAG = "CallsApiDebug";
    private final a4c log;
    private final RequestSecretEraser secretEraser = new RequestSecretEraser(bcd.a0(ApiProtocol.KEY_TOKEN, "auth_data", "credential", "auth_token", "session_data"), ERASED_SECRET);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger$Companion;", "", "()V", "ERASED_SECRET", "", "TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public LoggingApiRequestDebugger(a4c a4c) {
        this.log = a4c;
    }

    private final String eraseSecrets(String str) {
        try {
            return this.secretEraser.eraseSecrets(str);
        } catch (JSONException e) {
            this.log.logException(TAG, "can't erase secrets from json", e);
            return ERASED_SECRET;
        }
    }

    private final String getParams(fl flVar) {
        return eraseSecrets(getRawParams(flVar));
    }

    private final String getRawParams(fl flVar) {
        StringWriter stringWriter = new StringWriter();
        p2b p2b = new p2b(stringWriter);
        try {
            p2b.s();
            flVar.writeParams(p2b);
            p2b.q();
            p2b.flush();
        } catch (Exception unused) {
            this.log.log(TAG, "failed to log request params");
        }
        return stringWriter.toString();
    }

    public void debugApiException(vk vkVar, fl flVar, ApiException apiException) throws IOException {
        a4c a4c = this.log;
        Uri uri = flVar.getUri();
        a4c.logException(TAG, "API request " + uri + " failed with API Exception", apiException);
    }

    public void debugApiRequest(vk vkVar, fl flVar, wk wkVar) throws IOException {
        a4c a4c = this.log;
        Uri uri = flVar.getUri();
        String params = getParams(flVar);
        a4c.log(TAG, "API request " + uri + " start with params " + params);
    }

    public db7 debugApiResponseFail(vk vkVar, fl flVar, db7 db7) throws IOException {
        String V = db7.V();
        String eraseSecrets = eraseSecrets(V);
        a4c a4c = this.log;
        Uri uri = flVar.getUri();
        a4c.log(TAG, "API request " + uri + " failed with response " + eraseSecrets);
        return eb7.d(V);
    }

    public db7 debugApiResponseOk(vk vkVar, fl flVar, db7 db7) throws IOException {
        String V = db7.V();
        String eraseSecrets = eraseSecrets(V);
        a4c a4c = this.log;
        Uri uri = flVar.getUri();
        a4c.log(TAG, "API request " + uri + " success with response " + eraseSecrets);
        return eb7.d(V);
    }

    public void debugIoException(vk vkVar, fl flVar, IOException iOException) throws IOException {
        a4c a4c = this.log;
        Uri uri = flVar.getUri();
        a4c.logException(TAG, "API request " + uri + " failed with IO Exception", iOException);
    }
}
