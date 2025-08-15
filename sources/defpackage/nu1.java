package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: nu1  reason: default package */
public final class nu1 implements tu1 {
    public final st1 a;
    public final oq0 b;
    public final int c;
    public boolean d = false;

    public nu1(st1 st1, int i, oq0 oq0) {
        this.a = st1;
        this.c = i;
        this.b = oq0;
    }

    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        if (!u40.g(this.c, totalCaptureResult)) {
            return kq0.r(Boolean.FALSE);
        }
        this.d = true;
        b76 a2 = b76.a(f8.g(new ync(24, this)));
        mu1 mu1 = new mu1(0);
        ok4 k = ju0.k();
        a2.getClass();
        return kq0.K(a2, new re6(15, (Object) mu1), k);
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final void c() {
        if (this.d) {
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
