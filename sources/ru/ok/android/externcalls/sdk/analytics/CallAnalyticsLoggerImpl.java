package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/CallAnalyticsLoggerImpl;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Lkotlin/Function0;", "La4c;", "loggerProvider", "<init>", "(Lk56;)V", "", "tag", "message", "Le5f;", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "w", "", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "v", "report", "Lk56;", "getLogger", "()La4c;", "logger", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class CallAnalyticsLoggerImpl implements CallAnalyticsLogger {
    private final k56 loggerProvider;

    public CallAnalyticsLoggerImpl(k56 k56) {
        this.loggerProvider = k56;
    }

    private final a4c getLogger() {
        return (a4c) this.loggerProvider.invoke();
    }

    public void d(String str, String str2) {
        getLogger().log(str, str2);
    }

    public void e(String str, String str2) {
        getLogger().log(str, str2);
    }

    public void i(String str, String str2) {
        getLogger().log(str, str2);
    }

    public void report(String str, String str2, Throwable th) {
        getLogger().reportException(str, str2, th);
    }

    public void v(String str, String str2) {
        getLogger().log(str, str2);
    }

    public void w(String str, String str2) {
        getLogger().log(str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        getLogger().logException(str, str2, th);
    }

    public void w(String str, String str2, Throwable th) {
        getLogger().logException(str, str2, th);
    }
}
