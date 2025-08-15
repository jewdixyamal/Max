package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* renamed from: m75  reason: default package */
public abstract class m75 {
    public static j4b a(Context context, u75 u75, boolean z, String str) {
        MediaMetricsManager g = xs3.g(context.getSystemService("media_metrics"));
        kd8 kd8 = g == null ? null : new kd8(context, g.createPlaybackSession());
        if (kd8 == null) {
            z04.c0("MediaMetricsService unavailable.");
            return new j4b(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            u75.getClass();
            i74 i74 = u75.D0;
            i74.getClass();
            i74.Y.a(kd8);
        }
        return new j4b(kd8.c.getSessionId(), str);
    }
}
