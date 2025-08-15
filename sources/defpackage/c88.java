package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: c88  reason: default package */
public abstract class c88 {
    public static void a(o78 o78, j4b j4b) {
        h4b h4b = j4b.b;
        h4b.getClass();
        LogSessionId logSessionId = h4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            o78.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
