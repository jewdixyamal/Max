package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;

/* renamed from: or4  reason: default package */
public final class or4 implements sr4 {
    public final er4 a(kr4 kr4, oy5 oy5) {
        if (oy5.z0 == null) {
            return null;
        }
        return new f35(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final int b(oy5 oy5) {
        return oy5.z0 != null ? 1 : 0;
    }

    public final void c(Looper looper, i4b i4b) {
    }
}
