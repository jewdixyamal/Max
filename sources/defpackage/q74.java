package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: q74  reason: default package */
public abstract class q74 {
    public static void a(AudioTrack audioTrack, j4b j4b) {
        h4b h4b = j4b.b;
        h4b.getClass();
        LogSessionId logSessionId = h4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
