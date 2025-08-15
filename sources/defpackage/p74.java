package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: p74  reason: default package */
public abstract class p74 {
    public static void a(AudioTrack audioTrack, i4b i4b) {
        g4b g4b = i4b.a;
        g4b.getClass();
        LogSessionId logSessionId = g4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
