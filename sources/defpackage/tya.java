package defpackage;

import android.net.Uri;

/* renamed from: tya  reason: default package */
public final class tya {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public tya(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public final pxa a(uj3 uj3, boolean z) {
        jqe eqe;
        uj3 uj32 = uj3;
        int i = ((u7b) this.c.getValue()).b(uj3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        je7 je7 = this.a;
        String q = uj32.q(((hyc) ((q33) je7.getValue())).q(), kk0.c);
        if (uj3.t()) {
            eqe = new eqe(jpc.p);
        } else {
            CharSequence b2 = ((w7b) this.b.getValue()).b(uj32);
            eqe = b2.length() == 0 ? new eqe(r8a.G) : new iqe(b2);
        }
        jqe jqe = eqe;
        long t = z ? ((hyc) ((q33) je7.getValue())).t() ^ uj3.n() : uj3.n();
        long n = uj3.n();
        long n2 = uj3.n();
        String d = uj3.d();
        if (d != null) {
            return new pxa(n, n2, d, jqe, q != null ? Uri.parse(q) : null, z2, uj3.u(), new gza(t, fza.b), uj3.m(), true);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
