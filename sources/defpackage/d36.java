package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: d36  reason: default package */
public abstract class d36 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, i4b i4b) {
        g4b g4b = i4b.a;
        g4b.getClass();
        LogSessionId logSessionId = g4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent d = mediaDrm.getPlaybackComponent(bArr);
            d.getClass();
            xs3.e(d).setLogSessionId(logSessionId);
        }
    }
}
