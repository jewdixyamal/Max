package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: rf0  reason: default package */
public final class rf0 {
    public final ebg a = new ebg();
    public final jw4 b = new jw4();
    public final jw4 c = new jw4();
    public final boolean d;
    public final l7 e;
    public final l7 f;
    public final aw7 g;
    public final aw7 h;
    public final mbg i;
    public final mbg j;
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;

    /* JADX WARNING: type inference failed for: r2v1, types: [aw7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [aw7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [mbg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [mbg, java.lang.Object] */
    public rf0(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
        this.g = new Object();
        this.h = new Object();
        this.e = new l7(11, false);
        this.f = new l7(11, false);
        this.i = new Object();
        this.j = new Object();
    }

    public static boolean b(ebg ebg, double d2, double d3, double d4, pf0 pf0) {
        if (d2 > d4 && d4 > 0.0d) {
            return ebg.a(pf0, true);
        }
        if (d2 >= d3 || d3 <= 0.0d) {
            return false;
        }
        return ebg.a(pf0, false);
    }

    public final void a() {
        boolean a2;
        boolean a3;
        bg1 q;
        boolean z = this.a.b == 0;
        double d2 = this.b.b;
        ebg ebg = this.a;
        double d3 = (double) this.i.a;
        double d4 = (double) this.j.a;
        pf0 pf0 = pf0.b;
        boolean b2 = b(ebg, d2, d3, d4, pf0);
        double d5 = this.c.b;
        ebg ebg2 = this.a;
        double d6 = this.i.b;
        double d7 = this.j.b;
        pf0 pf02 = pf0.c;
        boolean b3 = b2 | b(ebg2, d5, d6, d7, pf02);
        boolean z2 = this.n;
        pf0 pf03 = pf0.a;
        boolean a4 = b3 | (z2 ? this.a.a(pf03, this.m) : this.a.a(pf03, false));
        boolean z3 = this.l;
        pf0 pf04 = pf0.X;
        pf0 pf05 = pf0.o;
        if (!z3 || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            a2 = a4 | this.a.a(pf04, false);
            a3 = this.a.a(pf05, false);
        } else {
            a2 = a4 | b(this.a, this.o, (double) this.i.a, (double) this.j.a, pf05);
            a3 = b(this.a, this.p, this.i.b, this.j.b, pf04);
        }
        if (a2 || a3) {
            ebg ebg3 = this.a;
            boolean z4 = ebg3.b == 0;
            HashSet hashSet = new HashSet();
            pf0[] values = pf0.values();
            int i2 = 0;
            while (true) {
                boolean[] zArr = ebg3.a;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    hashSet.add(values[i2]);
                }
                i2++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                qf0 qf0 = (qf0) it.next();
                if (z4 != z) {
                    if (z4) {
                        qf0.getClass();
                    } else {
                        qf0.getClass();
                    }
                }
                rcg rcg = (rcg) qf0;
                py0 py0 = rcg.b;
                boolean z5 = py0.u0.A.c.a;
                if (!py0.A0 && py0.t1.H(xxe.b) && !z5 && (q = py0.q()) != null) {
                    if (!rcg.a && (hashSet.contains(pf0) || hashSet.contains(pf02))) {
                        rcg.a = true;
                        py0.Z.i(z7.e(q, true));
                    } else if (rcg.a && !hashSet.contains(pf0) && !hashSet.contains(pf02)) {
                        rcg.a = false;
                        py0.Z.i(z7.e(q, false));
                    }
                }
            }
        }
    }
}
