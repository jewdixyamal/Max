package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: e36  reason: default package */
public abstract class e36 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, j4b j4b) {
        h4b h4b = j4b.b;
        h4b.getClass();
        LogSessionId logSessionId = h4b.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent d = mediaDrm.getPlaybackComponent(bArr);
            d.getClass();
            xs3.e(d).setLogSessionId(logSessionId);
        }
    }
}
