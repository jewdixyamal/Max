package defpackage;

import android.net.Uri;

/* renamed from: pc4  reason: default package */
public class pc4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public pc4(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public jqe a(uj3 uj3) {
        return null;
    }

    public final q33 b() {
        return (q33) this.b.getValue();
    }

    public jqe c(uj3 uj3) {
        return uj3.n() == ((hyc) b()).t() ? new eqe(dpc.F) : (!uj3.t() || !uj3.v()) ? (!uj3.t() || uj3.v()) ? new iqe(((w7b) ((y7b) this.c.getValue()).a.getValue()).b(uj3)) : new eqe(jpc.p) : new eqe(jpc.O2);
    }

    public boolean d(uj3 uj3) {
        return true;
    }

    public boolean e(uj3 uj3) {
        return true;
    }

    public kn8 f(uj3 uj3) {
        r7b b2 = ((u7b) this.a.getValue()).b(uj3.n());
        String q = uj3.q(((hyc) b()).q(), kk0.c);
        boolean z = uj3.n() == ((hyc) b()).t();
        long n = uj3.n();
        String d = uj3.d();
        if (d != null) {
            return new kn8(n, d, bre.b(uj3.g()), c(uj3), q != null ? Uri.parse(q) : null, uj3.m(), uj3.u(), z, false, d(uj3), e(uj3), b2.b, a(uj3));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
