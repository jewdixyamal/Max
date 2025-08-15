package defpackage;

/* renamed from: qpa  reason: default package */
public abstract class qpa {
    public static final sy0 a = new sy0(new eqe(b8a.J), (long) y7a.r, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(x7a.K0), 0, false, 880);
    public static final sy0 b = new sy0(new eqe(b8a.I), (long) y7a.G, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(gpc.Q), 0, false, 880);
    public static final sy0 c;
    public static final sy0 d;
    public static final sy0 e;
    public static final sy0 f;
    public static final sy0 g;
    public static final sy0 h;
    public static final sy0 i;
    public static final sy0 j;
    public static final sy0 k;
    public static final sy0 l;
    public static final sy0 m;
    public static final sy0 n;

    static {
        long j2 = (long) y7a.x;
        int i2 = b8a.O;
        eqe eqe = new eqe(i2);
        int i3 = x7a.r0;
        c = new sy0(eqe, j2, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(i3), 0, false, 880);
        d = new sy0(new eqe(b8a.S), (long) y7a.z, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(i3), 0, false, 880);
        long j3 = (long) y7a.y;
        eqe eqe2 = new eqe(i2);
        int i4 = x7a.m;
        jfd jfd = jfd.o;
        e = new sy0(eqe2, j3, jfd, new eqe(b8a.P), (hfd) null, Integer.valueOf(i4), 0, false, 320);
        long j4 = (long) y7a.s;
        int i5 = b8a.K;
        eqe eqe3 = new eqe(i5);
        int i6 = x7a.j0;
        int i7 = y7a.j0;
        f = new sy0(eqe3, j4, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(i6), i7, false, 624);
        g = new sy0(new eqe(b8a.R), (long) y7a.u, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(x7a.w0), i7, false, 624);
        h = new sy0(new eqe(b8a.L), (long) y7a.v, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(x7a.i0), i7, true, 112);
        i = new sy0(new eqe(i5), (long) y7a.t, jfd, new eqe(b8a.M), (hfd) null, Integer.valueOf(i6), i7, false, 64);
        long j5 = (long) y7a.b1;
        int i8 = b8a.g1;
        eqe eqe4 = new eqe(i8);
        int i9 = x7a.I;
        j = new sy0(eqe4, j5, (jfd) null, (eqe) null, (hfd) null, Integer.valueOf(i9), 0, false, 880);
        k = new sy0(new eqe(i8), j5, jfd, (eqe) null, (hfd) null, Integer.valueOf(i9), 0, false, 352);
        long j6 = (long) y7a.c1;
        int i10 = b8a.i1;
        eqe eqe5 = new eqe(i10);
        int i11 = b8a.h1;
        eqe eqe6 = new eqe(i11);
        int i12 = x7a.v0;
        l = new sy0(eqe5, j6, (jfd) null, eqe6, (hfd) null, Integer.valueOf(i12), 0, false, 848);
        m = new sy0(new eqe(i10), j6, jfd, new eqe(i11), (hfd) null, Integer.valueOf(i12), 0, false, 320);
        long j7 = (long) y7a.w;
        n = new sy0(new eqe(b8a.N), j7, (jfd) null, (eqe) null, cfd.a, Integer.valueOf(x7a.r), 0, false, 816);
    }

    public static void a(kl7 kl7, ak1 ak1) {
        if (!ak1.f && ak1.d) {
            kl7.add(e);
        } else if (ak1.a()) {
            kl7.add(d);
        } else {
            kl7.add(c);
        }
    }

    public static kl7 b(yj1 yj1) {
        kl7 l2 = j1e.l();
        boolean z = yj1.a;
        boolean z2 = yj1.b;
        boolean z3 = yj1.c;
        if (z3 && ((!z || !z3) && !z2)) {
            l2.add(h);
        } else if (z3 && (z2 || z)) {
            l2.add(g);
        } else if (!yj1.e || z2) {
            l2.add(f);
        } else {
            l2.add(i);
        }
        return j1e.d(l2);
    }
}
