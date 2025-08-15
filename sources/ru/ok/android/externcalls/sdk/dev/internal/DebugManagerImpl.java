package ru.ok.android.externcalls.sdk.dev.internal;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "Lpy0;", "underlyingCall", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "stat", "Lgw3;", "cidProvider", "La4c;", "log", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lpy0;Lru/ok/android/externcalls/sdk/log/ExtLogger;Lgw3;La4c;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Le0e;", "operation", "", "param", "Le5f;", "report", "(Le0e;Ljava/lang/String;)V", "", "error", "reportError", "(Ljava/lang/Throwable;)V", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Lm1e;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Lm1e;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Lm1e;)V", "Lpy0;", "getUnderlyingCall", "()Lpy0;", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "Lgw3;", "La4c;", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "mediaDumpManager", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class DebugManagerImpl implements DebugManager {
    private static final Companion Companion = new Companion((z84) null);
    private static final String LOG_TAG = "DebugManager";
    private final gw3 cidProvider;
    private final a4c log;
    private final MediaDumpManagerImpl mediaDumpManager;
    private final ExtLogger stat;
    private final py0 underlyingCall;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public DebugManagerImpl(py0 py0, ExtLogger extLogger, gw3 gw3, a4c a4c, SignalingProvider signalingProvider) {
        this.underlyingCall = py0;
        this.stat = extLogger;
        this.cidProvider = gw3;
        this.log = a4c;
        this.mediaDumpManager = new MediaDumpManagerImpl(getUnderlyingCall(), signalingProvider);
    }

    public void enableFullAudioDump(String str) {
        py0 underlyingCall2 = getUnderlyingCall();
        qld qld = underlyingCall2.k1;
        if (qld != null) {
            py0.o2.execute(new f5((Object) underlyingCall2, (Object) qld, (Object) str, 6));
        }
    }

    public py0 getUnderlyingCall() {
        return this.underlyingCall;
    }

    public void registerStatListener(m1e m1e, int i, TimeUnit timeUnit) {
        getUnderlyingCall().R1.c(m1e, (long) i, timeUnit);
    }

    public void removeStatListener(m1e m1e) {
        ((HashMap) getUnderlyingCall().R1.d).remove(m1e);
    }

    public void report(e0e e0e, String str) {
        this.stat.logSimple(e0e, ((hw3) this.cidProvider).a, str);
    }

    public void reportError(Throwable th) {
        this.log.reportException(LOG_TAG, "error", th);
    }

    public MediaDumpManagerImpl getMediaDumpManager() {
        return this.mediaDumpManager;
    }
}
