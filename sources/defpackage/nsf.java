package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: nsf  reason: default package */
public final class nsf extends WeakReference implements zl4 {
    public final void g() {
        zl4 zl4 = (zl4) get();
        if (zl4 != null) {
            zl4.g();
        }
    }

    public final boolean h() {
        zl4 zl4 = (zl4) get();
        return zl4 == null || zl4.h();
    }
}
