package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: b88  reason: default package */
public abstract class b88 {
    public static void a(n78 n78, i4b i4b) {
        g4b g4b = i4b.a;
        g4b.getClass();
        LogSessionId logSessionId = g4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            n78.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
