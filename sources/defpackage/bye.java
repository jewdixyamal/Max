package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bye  reason: default package */
public final class bye {
    public final st1 a;
    public final ci9 b = new xm7(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public lq1 f;
    public boolean g;

    /* JADX WARNING: type inference failed for: r3v2, types: [ci9, xm7] */
    public bye(st1 st1, xv1 xv1, q6d q6d) {
        this.a = st1;
        this.d = q6d;
        this.c = kq0.s(new ync(23, xv1));
        st1.p(new aye(this));
    }

    public static void b(ci9 ci9, Integer num) {
        if (kq0.t()) {
            ci9.k(num);
        } else {
            ci9.i(num);
        }
    }

    public final void a(lq1 lq1, boolean z) {
        if (this.c) {
            boolean z2 = this.e;
            ci9 ci9 = this.b;
            if (!z2) {
                b(ci9, 0);
                if (lq1 != null) {
                    lq1.d(new Exception("Camera is not active."));
                    return;
                }
                return;
            }
            this.g = z;
            this.a.r(z);
            b(ci9, Integer.valueOf(z ? 1 : 0));
            lq1 lq12 = this.f;
            if (lq12 != null) {
                lq12.d(new Exception("There is a new enableTorch being set"));
            }
            this.f = lq1;
        } else if (lq1 != null) {
            lq1.d(new IllegalStateException("No flash unit"));
        }
    }
}
