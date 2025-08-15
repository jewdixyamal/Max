package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: x14  reason: default package */
public final class x14 extends dj0 {
    public jo7 A;
    public y0f B;
    public DashManifestStaleException C;
    public Handler D;
    public gb8 E;
    public Uri F;
    public final Uri G;
    public h14 H = null;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final rb8 h;
    public final boolean i;
    public final p24 j;
    public final ey1 k;
    public final mq9 l;
    public final sr4 m;
    public final buc n;
    public final c8d o;
    public final long p;
    public final gk8 q;
    public final ypa r;
    public final sy4 s;
    public final Object t;
    public final SparseArray u;
    public final r14 v;
    public final r14 w;
    public final wmc x;
    public final ko7 y;
    public r24 z;

    static {
        h85.a("goog.exo.dash");
    }

    public x14(rb8 rb8, p24 p24, ypa ypa, ey1 ey1, mq9 mq9, sr4 sr4, buc buc, long j2) {
        this.h = rb8;
        this.E = rb8.c;
        kb8 kb8 = rb8.b;
        kb8.getClass();
        Uri uri = kb8.a;
        this.F = uri;
        this.G = uri;
        this.j = p24;
        this.r = ypa;
        this.k = ey1;
        this.m = sr4;
        this.n = buc;
        this.p = j2;
        this.l = mq9;
        this.o = new c8d(3);
        this.i = false;
        this.q = new gk8((CopyOnWriteArrayList) this.c.d, 0, (xj8) null, 0);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new wmc(this, false);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new sy4(11, (Object) this);
        this.y = new re6(11, (Object) this);
        this.v = new r14(this, 0);
        this.w = new r14(this, 1);
    }

    public static boolean p(jta jta) {
        int i2 = 0;
        while (true) {
            List list = jta.c;
            if (i2 >= list.size()) {
                return false;
            }
            int i3 = ((t8) list.get(i2)).b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
            i2++;
        }
        return true;
    }

    public final yd8 a(xj8 xj8, n64 n64, long j2) {
        xj8 xj82 = xj8;
        int intValue = ((Integer) xj82.a).intValue() - this.O;
        gk8 gk8 = new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8, this.H.b(intValue).b);
        kr4 kr4 = new kr4(this.d.c, 0, xj82);
        int i2 = this.O + intValue;
        h14 h14 = this.H;
        y0f y0f = this.B;
        long j3 = this.L;
        i4b i4b = this.g;
        np8.g(i4b);
        mq9 mq9 = this.l;
        wmc wmc = this.x;
        p14 p14 = new p14(i2, h14, this.o, intValue, this.k, y0f, this.m, kr4, this.n, gk8, j3, this.y, n64, mq9, wmc, i4b);
        this.u.put(i2, p14);
        return p14;
    }

    public final rb8 f() {
        return this.h;
    }

    public final void g() {
        this.y.c();
    }

    public final void i(y0f y0f) {
        this.B = y0f;
        sr4 sr4 = this.m;
        sr4.prepare();
        Looper myLooper = Looper.myLooper();
        i4b i4b = this.g;
        np8.g(i4b);
        sr4.c(myLooper, i4b);
        if (this.i) {
            s(false);
            return;
        }
        this.z = this.j.a();
        this.A = new jo7("DashMediaSource", 0);
        this.D = maf.m((Handler.Callback) null);
        t();
    }

    public final void k(yd8 yd8) {
        p14 p14 = (p14) yd8;
        e4b e4b = p14.x0;
        e4b.Y = true;
        e4b.b.removeCallbacksAndMessages((Object) null);
        for (s13 v2 : p14.C0) {
            v2.v(p14);
        }
        p14.B0 = null;
        this.u.remove(p14.a);
    }

    public final void m() {
        this.I = false;
        this.z = null;
        jo7 jo7 = this.A;
        if (jo7 != null) {
            jo7.p((ho7) null);
            this.A = null;
        }
        this.J = 0;
        this.K = 0;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        c8d c8d = this.o;
        ((HashMap) c8d.a).clear();
        ((HashMap) c8d.b).clear();
        ((HashMap) c8d.c).clear();
        this.m.release();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, fo7] */
    public final void q() {
        boolean z2;
        jo7 jo7 = this.A;
        y8 y8Var = new y8((Object) this);
        synchronized (nu0.A0) {
            z2 = nu0.B0;
        }
        if (z2) {
            y8Var.y();
            return;
        }
        if (jo7 == null) {
            jo7 = new jo7("SntpClient", 0);
        }
        jo7.w(new Object(), new w4d(25, (Object) y8Var), 1);
    }

    public final void r(aqa aqa, long j2, long j3) {
        aqa aqa2 = aqa;
        long j4 = aqa2.a;
        t1e t1e = aqa2.o;
        xn7 xn7 = new xn7(j4, aqa2.b, t1e.c, t1e.o, j2, j3, t1e.b);
        this.n.getClass();
        this.q.d(xn7, aqa2.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019a, code lost:
        if (r14.b != 3) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r43) {
        /*
            r42 = this;
            r1 = r42
            r2 = 0
            r3 = r2
        L_0x0004:
            android.util.SparseArray r0 = r1.u
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x00e7
            int r4 = r0.keyAt(r3)
            int r6 = r1.O
            if (r4 < r6) goto L_0x00e2
            java.lang.Object r0 = r0.valueAt(r3)
            r6 = r0
            p14 r6 = (defpackage.p14) r6
            h14 r7 = r1.H
            int r0 = r1.O
            int r4 = r4 - r0
            r6.F0 = r7
            r6.G0 = r4
            e4b r0 = r6.x0
            r0.X = r2
            r0.u0 = r7
            java.util.TreeMap r8 = r0.c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0034:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            java.lang.Object r11 = r0.u0
            h14 r11 = (defpackage.h14) r11
            long r11 = r11.h
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0034
            r8.remove()
            goto L_0x0034
        L_0x0058:
            s13[] r8 = r6.C0
            if (r8 == 0) goto L_0x0099
            int r9 = r8.length
            r10 = r2
        L_0x005e:
            if (r10 >= r9) goto L_0x0094
            r0 = r8[r10]
            f94 r11 = r0.X
            c94[] r0 = r11.h
            r11.j = r7     // Catch:{ BehindLiveWindowException -> 0x008d }
            r11.k = r4     // Catch:{ BehindLiveWindowException -> 0x008d }
            long r12 = r7.d(r4)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.util.ArrayList r14 = r11.a()     // Catch:{ BehindLiveWindowException -> 0x008d }
            r15 = r2
        L_0x0073:
            int r2 = r0.length     // Catch:{ BehindLiveWindowException -> 0x008d }
            if (r15 >= r2) goto L_0x0090
            m85 r2 = r11.i     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r2 = r2.f(r15)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            khc r2 = (defpackage.khc) r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            r5 = r0[r15]     // Catch:{ BehindLiveWindowException -> 0x008d }
            c94 r2 = r5.a(r12, r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            r0[r15] = r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008d:
            r0 = move-exception
            r11.l = r0
        L_0x0090:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x005e
        L_0x0094:
            wd8 r0 = r6.B0
            r0.c(r6)
        L_0x0099:
            jta r0 = r7.b(r4)
            java.util.List r0 = r0.d
            r6.H0 = r0
            f45[] r0 = r6.D0
            int r2 = r0.length
            r5 = 0
        L_0x00a5:
            if (r5 >= r2) goto L_0x00e2
            r8 = r0[r5]
            java.util.List r9 = r6.H0
            java.util.Iterator r9 = r9.iterator()
        L_0x00af:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r9.next()
            j45 r10 = (defpackage.j45) r10
            java.lang.String r11 = r10.a()
            j45 r12 = r8.X
            java.lang.String r12 = r12.a()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00af
            java.util.List r9 = r7.m
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
            boolean r11 = r7.d
            if (r11 == 0) goto L_0x00db
            if (r4 != r9) goto L_0x00db
            r9 = 1
            goto L_0x00dc
        L_0x00db:
            r9 = 0
        L_0x00dc:
            r8.a(r10, r9)
        L_0x00df:
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00e2:
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0004
        L_0x00e7:
            h14 r0 = r1.H
            r2 = 0
            jta r0 = r0.b(r2)
            h14 r2 = r1.H
            java.util.List r2 = r2.m
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            h14 r3 = r1.H
            jta r3 = r3.b(r2)
            h14 r4 = r1.H
            long r4 = r4.d(r2)
            long r6 = r1.L
            long r6 = defpackage.maf.t(r6)
            long r6 = defpackage.maf.D(r6)
            h14 r2 = r1.H
            r8 = 0
            long r9 = r2.d(r8)
            long r11 = r0.b
            long r11 = defpackage.maf.D(r11)
            boolean r2 = p(r0)
            r13 = r11
            r8 = 0
        L_0x0121:
            java.util.List r15 = r0.c
            r16 = r0
            int r0 = r15.size()
            r17 = r2
            if (r8 >= r0) goto L_0x0172
            java.lang.Object r0 = r15.get(r8)
            t8 r0 = (defpackage.t8) r0
            java.util.List r15 = r0.c
            if (r17 == 0) goto L_0x013c
            int r0 = r0.b
            r1 = 3
            if (r0 == r1) goto L_0x0169
        L_0x013c:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0143
            goto L_0x0169
        L_0x0143:
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            khc r0 = (defpackage.khc) r0
            z14 r0 = r0.c()
            if (r0 != 0) goto L_0x0151
            goto L_0x0173
        L_0x0151:
            long r1 = r0.E(r9, r6)
            r19 = 0
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x015c
            goto L_0x0173
        L_0x015c:
            long r1 = r0.k(r9, r6)
            long r0 = r0.b(r1)
            long r0 = r0 + r11
            long r13 = java.lang.Math.max(r13, r0)
        L_0x0169:
            int r8 = r8 + 1
            r1 = r42
            r0 = r16
            r2 = r17
            goto L_0x0121
        L_0x0172:
            r11 = r13
        L_0x0173:
            long r0 = r3.b
            long r0 = defpackage.maf.D(r0)
            boolean r2 = p(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x0183:
            java.util.List r13 = r3.c
            int r14 = r13.size()
            if (r10 >= r14) goto L_0x01e6
            java.lang.Object r14 = r13.get(r10)
            t8 r14 = (defpackage.t8) r14
            java.util.List r15 = r14.c
            if (r2 == 0) goto L_0x019d
            int r14 = r14.b
            r17 = r2
            r2 = 3
            if (r14 == r2) goto L_0x01a6
            goto L_0x01a0
        L_0x019d:
            r17 = r2
            r2 = 3
        L_0x01a0:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x01a8
        L_0x01a6:
            r15 = r3
            goto L_0x01e0
        L_0x01a8:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            khc r15 = (defpackage.khc) r15
            z14 r14 = r15.c()
            if (r14 != 0) goto L_0x01b9
            long r0 = r0 + r4
        L_0x01b6:
            r2 = r42
            goto L_0x01e9
        L_0x01b9:
            long r21 = r14.E(r4, r6)
            r18 = 0
            int r15 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r15 != 0) goto L_0x01c4
            goto L_0x01b6
        L_0x01c4:
            long r23 = r14.k(r4, r6)
            long r23 = r23 + r21
            r21 = 1
            r15 = r3
            long r2 = r23 - r21
            long r21 = r14.b(r2)
            long r21 = r21 + r0
            long r2 = r14.j(r2, r4)
            long r2 = r2 + r21
            long r2 = java.lang.Math.min(r8, r2)
            r8 = r2
        L_0x01e0:
            int r10 = r10 + 1
            r3 = r15
            r2 = r17
            goto L_0x0183
        L_0x01e6:
            r2 = r42
            r0 = r8
        L_0x01e9:
            h14 r3 = r2.H
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0217
            r3 = 0
        L_0x01f0:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x0215
            java.lang.Object r4 = r13.get(r3)
            t8 r4 = (defpackage.t8) r4
            java.util.List r4 = r4.c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            khc r4 = (defpackage.khc) r4
            z14 r4 = r4.c()
            if (r4 == 0) goto L_0x0217
            boolean r4 = r4.A()
            if (r4 == 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            int r3 = r3 + 1
            goto L_0x01f0
        L_0x0215:
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0231
            h14 r8 = r2.H
            long r8 = r8.f
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0231
            long r8 = defpackage.maf.D(r8)
            long r8 = r0 - r8
            long r11 = java.lang.Math.max(r11, r8)
        L_0x0231:
            long r31 = r0 - r11
            h14 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0384
            long r0 = r0.a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0241
            r0 = 1
            goto L_0x0242
        L_0x0241:
            r0 = 0
        L_0x0242:
            defpackage.np8.f(r0)
            h14 r0 = r2.H
            long r0 = r0.a
            long r0 = defpackage.maf.D(r0)
            long r6 = r6 - r0
            long r6 = r6 - r11
            long r0 = defpackage.maf.M(r6)
            rb8 r8 = r2.h
            gb8 r9 = r8.c
            long r9 = r9.c
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0262
            long r9 = java.lang.Math.min(r0, r9)
            goto L_0x0274
        L_0x0262:
            h14 r9 = r2.H
            fb8 r9 = r9.j
            if (r9 == 0) goto L_0x0273
            long r9 = r9.c
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0273
            long r9 = java.lang.Math.min(r0, r9)
            goto L_0x0274
        L_0x0273:
            r9 = r0
        L_0x0274:
            long r13 = r6 - r31
            long r13 = defpackage.maf.M(r13)
            r17 = 0
            int r15 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0286
            int r15 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0286
            r13 = 0
        L_0x0286:
            h14 r15 = r2.H
            r17 = r11
            long r11 = r15.c
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0298
            long r13 = r13 + r11
            long r11 = java.lang.Math.min(r13, r0)
            r23 = r11
            goto L_0x029a
        L_0x0298:
            r23 = r13
        L_0x029a:
            gb8 r8 = r8.c
            long r11 = r8.b
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x02ad
            r21 = r11
            r25 = r0
            long r23 = defpackage.maf.k(r21, r23, r25)
        L_0x02aa:
            r36 = r23
            goto L_0x02c2
        L_0x02ad:
            h14 r11 = r2.H
            fb8 r11 = r11.j
            if (r11 == 0) goto L_0x02aa
            long r11 = r11.b
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x02aa
            r21 = r11
            r25 = r0
            long r23 = defpackage.maf.k(r21, r23, r25)
            goto L_0x02aa
        L_0x02c2:
            int r0 = (r36 > r9 ? 1 : (r36 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c9
            r38 = r36
            goto L_0x02cb
        L_0x02c9:
            r38 = r9
        L_0x02cb:
            gb8 r0 = r2.E
            long r0 = r0.a
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x02d4
            goto L_0x02eb
        L_0x02d4:
            h14 r0 = r2.H
            fb8 r1 = r0.j
            if (r1 == 0) goto L_0x02e2
            long r9 = r1.a
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02e2
            r0 = r9
            goto L_0x02eb
        L_0x02e2:
            long r0 = r0.g
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x02e9
            goto L_0x02eb
        L_0x02e9:
            long r0 = r2.p
        L_0x02eb:
            int r9 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f1
            r0 = r36
        L_0x02f1:
            int r9 = (r0 > r38 ? 1 : (r0 == r38 ? 0 : -1))
            r10 = 5000000(0x4c4b40, double:2.470328E-317)
            r12 = 2
            if (r9 <= 0) goto L_0x030e
            long r0 = r31 / r12
            long r0 = java.lang.Math.min(r10, r0)
            long r0 = r6 - r0
            long r25 = defpackage.maf.M(r0)
            r27 = r36
            r29 = r38
            long r0 = defpackage.maf.k(r25, r27, r29)
        L_0x030e:
            r34 = r0
            float r0 = r8.o
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x031a
            goto L_0x0324
        L_0x031a:
            h14 r0 = r2.H
            fb8 r0 = r0.j
            if (r0 == 0) goto L_0x0323
            float r0 = r0.d
            goto L_0x0324
        L_0x0323:
            r0 = r1
        L_0x0324:
            float r8 = r8.X
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x032b
            goto L_0x0335
        L_0x032b:
            h14 r8 = r2.H
            fb8 r8 = r8.j
            if (r8 == 0) goto L_0x0334
            float r8 = r8.e
            goto L_0x0335
        L_0x0334:
            r8 = r1
        L_0x0335:
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0350
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0350
            h14 r1 = r2.H
            fb8 r1 = r1.j
            if (r1 == 0) goto L_0x0349
            long r14 = r1.a
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0350
        L_0x0349:
            r0 = 1065353216(0x3f800000, float:1.0)
            r40 = r0
            r41 = r40
            goto L_0x0354
        L_0x0350:
            r40 = r0
            r41 = r8
        L_0x0354:
            gb8 r0 = new gb8
            r33 = r0
            r33.<init>(r34, r36, r38, r40, r41)
            r2.E = r0
            h14 r0 = r2.H
            long r0 = r0.a
            long r8 = defpackage.maf.M(r17)
            long r8 = r8 + r0
            gb8 r0 = r2.E
            long r0 = r0.a
            long r0 = defpackage.maf.D(r0)
            long r0 = r6 - r0
            long r6 = r31 / r12
            long r6 = java.lang.Math.min(r10, r6)
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0381
            r33 = r6
        L_0x037c:
            r24 = r8
            r0 = r16
            goto L_0x038c
        L_0x0381:
            r33 = r0
            goto L_0x037c
        L_0x0384:
            r17 = r11
            r24 = r4
            r0 = r16
            r33 = 0
        L_0x038c:
            long r0 = r0.b
            long r0 = defpackage.maf.D(r0)
            long r29 = r17 - r0
            t14 r0 = new t14
            h14 r1 = r2.H
            long r6 = r1.a
            long r8 = r2.L
            int r10 = r2.O
            boolean r11 = r1.d
            if (r11 == 0) goto L_0x03a7
            gb8 r11 = r2.E
        L_0x03a4:
            r37 = r11
            goto L_0x03a9
        L_0x03a7:
            r11 = 0
            goto L_0x03a4
        L_0x03a9:
            rb8 r11 = r2.h
            r36 = r11
            r21 = r0
            r22 = r6
            r26 = r8
            r28 = r10
            r35 = r1
            r21.<init>(r22, r24, r26, r28, r29, r31, r33, r35, r36, r37)
            r2.j(r0)
            boolean r0 = r2.i
            if (r0 != 0) goto L_0x048b
            android.os.Handler r0 = r2.D
            r14 r1 = r2.w
            r0.removeCallbacks(r1)
            r6 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x0453
            android.os.Handler r0 = r2.D
            h14 r3 = r2.H
            long r8 = r2.L
            long r8 = defpackage.maf.t(r8)
            java.util.List r10 = r3.m
            int r10 = r10.size()
            r11 = 1
            int r10 = r10 - r11
            jta r11 = r3.b(r10)
            long r12 = r11.b
            long r12 = defpackage.maf.D(r12)
            long r14 = r3.d(r10)
            long r8 = defpackage.maf.D(r8)
            long r4 = r3.a
            long r3 = defpackage.maf.D(r4)
            long r17 = defpackage.maf.D(r6)
            r6 = r17
            r5 = 0
        L_0x03fd:
            java.util.List r10 = r11.c
            r21 = r11
            int r11 = r10.size()
            if (r5 >= r11) goto L_0x0448
            java.lang.Object r10 = r10.get(r5)
            t8 r10 = (defpackage.t8) r10
            java.util.List r10 = r10.c
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0417
            r11 = 0
            goto L_0x0443
        L_0x0417:
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            khc r10 = (defpackage.khc) r10
            z14 r10 = r10.c()
            if (r10 == 0) goto L_0x0443
            long r22 = r3 + r12
            long r24 = r10.m(r14, r8)
            long r24 = r24 + r22
            long r24 = r24 - r8
            r22 = 100000(0x186a0, double:4.94066E-319)
            long r26 = r6 - r22
            int r10 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r10 < 0) goto L_0x0441
            int r10 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0443
            long r22 = r6 + r22
            int r10 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r10 >= 0) goto L_0x0443
        L_0x0441:
            r6 = r24
        L_0x0443:
            int r5 = r5 + 1
            r11 = r21
            goto L_0x03fd
        L_0x0448:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r5 = java.math.RoundingMode.CEILING
            long r3 = defpackage.m6d.m(r6, r3, r5)
            r0.postDelayed(r1, r3)
        L_0x0453:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x045b
            r42.t()
            goto L_0x048b
        L_0x045b:
            if (r43 == 0) goto L_0x048b
            h14 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x048b
            long r0 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x048b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0477
            r6 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0478
        L_0x0477:
            r6 = r0
        L_0x0478:
            long r0 = r2.J
            long r0 = r0 + r6
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r5
            long r0 = java.lang.Math.max(r3, r0)
            android.os.Handler r3 = r2.D
            r14 r2 = r2.v
            r3.postDelayed(r2, r0)
        L_0x048b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x14.s(boolean):void");
    }

    public final void t() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (!this.A.n()) {
            if (this.A.o()) {
                this.I = true;
                return;
            }
            synchronized (this.t) {
                uri = this.F;
            }
            this.I = false;
            aqa aqa = new aqa(this.z, uri, 4, this.r);
            sy4 sy4 = this.s;
            this.n.getClass();
            this.q.k(new xn7(aqa.a, aqa.b, this.A.w(aqa, sy4, 3)), aqa.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
