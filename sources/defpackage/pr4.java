package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;

/* renamed from: pr4  reason: default package */
public final class pr4 implements tr4 {
    public final fr4 a(lr4 lr4, qy5 qy5) {
        if (qy5.r == null) {
            return null;
        }
        return new g35(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final void c(Looper looper, j4b j4b) {
    }

    public final int d(qy5 qy5) {
        return qy5.r != null ? 1 : 0;
    }
}
