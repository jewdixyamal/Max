package defpackage;

import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* renamed from: dx1  reason: default package */
public final class dx1 {
    public final dle a;
    public final ArrayMap b = new ArrayMap(4);

    public dx1(ex1 ex1) {
        this.a = ex1;
    }

    public final xv1 a(String str) {
        xv1 xv1;
        synchronized (this.b) {
            xv1 = (xv1) this.b.get(str);
            if (xv1 == null) {
                try {
                    xv1 xv12 = new xv1(this.a.E(str), str);
                    this.b.put(str, xv12);
                    xv1 = xv12;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return xv1;
    }
}
