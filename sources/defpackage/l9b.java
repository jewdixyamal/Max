package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* renamed from: l9b  reason: default package */
public final class l9b {
    public final k9b a;

    public l9b(k9b k9b) {
        this.a = k9b;
    }

    public final void a(l9f... l9fArr) {
        int i;
        k9b k9b = this.a;
        k9b.getClass();
        Trace.beginSection(c37.F("CX:unbind"));
        try {
            kq0.e();
            ay1 ay1 = k9b.d;
            if (ay1 == null) {
                i = 0;
            } else {
                yg2 yg2 = ay1.f;
                if (yg2 != null) {
                    i = ((l0f) yg2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                k9b.c.n(y53.M(Arrays.copyOf(l9fArr, l9fArr.length)));
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }
}
