package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: rm6  reason: default package */
public final class rm6 extends dj0 implements hn6 {
    public final zl6 h;
    public final kb8 i;
    public final gaa j;
    public final mq9 k;
    public final sr4 l;
    public final buc m;
    public final boolean n;
    public final int o;
    public final boolean p = false;
    public final hb4 q;
    public final long r;
    public final rb8 s;
    public gb8 t;
    public y0f u;

    static {
        h85.a("goog.exo.hls");
    }

    public rm6(rb8 rb8, gaa gaa, oq9 oq9, mq9 mq9, sr4 sr4, buc buc, hb4 hb4, long j2, boolean z, int i2) {
        kb8 kb8 = rb8.b;
        kb8.getClass();
        this.i = kb8;
        this.s = rb8;
        this.t = rb8.c;
        this.j = gaa;
        this.h = oq9;
        this.k = mq9;
        this.l = sr4;
        this.m = buc;
        this.q = hb4;
        this.r = j2;
        this.n = z;
        this.o = i2;
    }

    public static gm6 p(long j2, List list) {
        gm6 gm6 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            gm6 gm62 = (gm6) list.get(i2);
            long j3 = gm62.X;
            if (j3 <= j2 && gm62.w0) {
                gm6 = gm62;
            } else if (j3 > j2) {
                break;
            }
        }
        return gm6;
    }

    public final yd8 a(xj8 xj8, n64 n64, long j2) {
        gk8 gk8 = new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8, 0);
        kr4 kr4 = new kr4(this.d.c, 0, xj8);
        y0f y0f = this.u;
        i4b i4b = this.g;
        np8.g(i4b);
        return new em6(this.h, this.q, this.j, y0f, this.l, kr4, this.m, gk8, n64, this.k, this.n, this.o, this.p, i4b);
    }

    public final rb8 f() {
        return this.s;
    }

    public final void g() {
        hb4 hb4 = this.q;
        jo7 jo7 = (jo7) hb4.w0;
        if (jo7 != null) {
            jo7.c();
        }
        Uri uri = hb4.X;
        if (uri != null) {
            fb4 fb4 = (fb4) hb4.b.get(uri);
            fb4.b.c();
            IOException iOException = fb4.u0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void i(y0f y0f) {
        this.u = y0f;
        sr4 sr4 = this.l;
        sr4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i4b i4b = this.g;
        np8.g(i4b);
        sr4.c(myLooper, i4b);
        gk8 gk8 = new gk8((CopyOnWriteArrayList) this.c.d, 0, (xj8) null, 0);
        Uri uri = this.i.a;
        hb4 hb4 = this.q;
        hb4.getClass();
        hb4.o = maf.m((Handler.Callback) null);
        hb4.v0 = gk8;
        hb4.x0 = this;
        aqa aqa = new aqa(((p24) ((gaa) hb4.s0).a).a(), uri, 4, ((dn6) hb4.t0).f());
        np8.f(((jo7) hb4.w0) == null);
        jo7 jo7 = new jo7("DefaultHlsPlaylistTracker:MultivariantPlaylist", 0);
        hb4.w0 = jo7;
        int i2 = aqa.c;
        gk8.k(new xn7(aqa.a, aqa.b, jo7.w(aqa, hb4, ((buc) hb4.u0).v(i2))), i2, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void k(yd8 yd8) {
        em6 em6 = (em6) yd8;
        em6.b.c.remove(em6);
        for (sn6 sn6 : em6.E0) {
            if (sn6.O0) {
                for (qn6 qn6 : sn6.G0) {
                    qn6.i();
                    er4 er4 = qn6.h;
                    if (er4 != null) {
                        er4.f(qn6.e);
                        qn6.h = null;
                        qn6.g = null;
                    }
                }
            }
            sn6.u0.p(sn6);
            sn6.C0.removeCallbacksAndMessages((Object) null);
            sn6.S0 = true;
            sn6.D0.clear();
        }
        em6.B0 = null;
    }

    public final void m() {
        hb4 hb4 = this.q;
        hb4.X = null;
        hb4.z0 = null;
        hb4.y0 = null;
        hb4.Z = -9223372036854775807L;
        ((jo7) hb4.w0).p((ho7) null);
        hb4.w0 = null;
        HashMap hashMap = hb4.b;
        for (fb4 fb4 : hashMap.values()) {
            fb4.b.p((ho7) null);
        }
        hb4.o.removeCallbacksAndMessages((Object) null);
        hb4.o = null;
        hashMap.clear();
        this.l.release();
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [pq9, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.pm6 r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            boolean r2 = r1.p
            long r5 = r1.h
            if (r2 == 0) goto L_0x0010
            long r7 = defpackage.maf.M(r5)
            r12 = r7
            goto L_0x0015
        L_0x0010:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0015:
            r2 = 1
            r7 = 2
            int r8 = r1.d
            if (r8 == r7) goto L_0x0024
            if (r8 != r2) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0025
        L_0x0024:
            r10 = r12
        L_0x0025:
            pq9 r25 = new pq9
            hb4 r9 = r0.q
            java.lang.Object r14 = r9.y0
            xm6 r14 = (defpackage.xm6) r14
            r14.getClass()
            r25.<init>()
            bm6 r26 = new bm6
            java.util.List r15 = r14.k
            boolean r7 = r14.c
            java.lang.String r2 = r14.a
            java.util.List r3 = r14.b
            java.util.List r4 = r14.e
            r20 = r12
            java.util.List r12 = r14.f
            java.util.List r13 = r14.g
            r39 = r10
            java.util.List r10 = r14.h
            java.util.List r11 = r14.i
            r22 = r8
            oy5 r8 = r14.j
            java.util.Map r0 = r14.l
            java.util.List r14 = r14.m
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r12
            r31 = r13
            r32 = r10
            r33 = r11
            r34 = r8
            r35 = r15
            r36 = r7
            r37 = r0
            r38 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r0 = r9.Y
            long r2 = r1.u
            zw6 r4 = r1.r
            boolean r10 = r1.g
            long r11 = r1.e
            if (r0 == 0) goto L_0x01bd
            long r13 = r9.Z
            long r28 = r5 - r13
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x0086
            long r13 = r28 + r2
            r14 = r13
            goto L_0x008b
        L_0x0086:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x008b:
            boolean r9 = r1.p
            if (r9 == 0) goto L_0x00a0
            r13 = r41
            long r7 = r13.r
            long r7 = defpackage.maf.t(r7)
            long r7 = defpackage.maf.D(r7)
            long r5 = r5 + r2
            long r7 = r7 - r5
            r32 = r7
            goto L_0x00a4
        L_0x00a0:
            r13 = r41
            r32 = 0
        L_0x00a4:
            gb8 r5 = r13.t
            long r5 = r5.a
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            om6 r7 = r1.v
            if (r9 == 0) goto L_0x00ba
            long r5 = defpackage.maf.D(r5)
            r30 = r5
            goto L_0x00e7
        L_0x00ba:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00c6
            long r8 = r2 - r11
            goto L_0x00e3
        L_0x00c6:
            long r8 = r7.d
            int r18 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r18 == 0) goto L_0x00d7
            r18 = r8
            long r8 = r1.n
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00d7
            r8 = r18
            goto L_0x00e3
        L_0x00d7:
            long r8 = r7.c
            int r26 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r26 == 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r5 = 3
            long r8 = r1.m
            long r8 = r8 * r5
        L_0x00e3:
            long r8 = r8 + r32
            r30 = r8
        L_0x00e7:
            long r2 = r2 + r32
            r34 = r2
            long r5 = defpackage.maf.k(r30, r32, r34)
            rb8 r8 = r13.s
            gb8 r8 = r8.c
            float r9 = r8.o
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            r27 = 0
            if (r9 != 0) goto L_0x0117
            float r8 = r8.X
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r8 = r7.c
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r7 = r7.d
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
            r7 = 1
            goto L_0x0119
        L_0x0117:
            r7 = r27
        L_0x0119:
            long r5 = defpackage.maf.M(r5)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x0124
            r37 = r8
            goto L_0x012a
        L_0x0124:
            gb8 r9 = r13.t
            float r9 = r9.o
            r37 = r9
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            r38 = r8
            goto L_0x0135
        L_0x012f:
            gb8 r7 = r13.t
            float r7 = r7.X
            r38 = r7
        L_0x0135:
            gb8 r7 = new gb8
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r30 = r7
            r31 = r5
            r33 = r35
            r30.<init>(r31, r33, r35, r37, r38)
            r13.t = r7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            long r5 = defpackage.maf.D(r5)
            long r11 = r2 - r5
        L_0x0157:
            if (r10 == 0) goto L_0x015e
            r2 = r11
        L_0x015a:
            r5 = r22
        L_0x015c:
            r4 = 2
            goto L_0x0191
        L_0x015e:
            zw6 r2 = r1.s
            gm6 r2 = p(r11, r2)
            if (r2 == 0) goto L_0x0169
            long r2 = r2.X
            goto L_0x015a
        L_0x0169:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0174
            r5 = r22
            r2 = 0
            goto L_0x015c
        L_0x0174:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.maf.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            km6 r2 = (defpackage.km6) r2
            zw6 r3 = r2.x0
            gm6 r3 = p(r11, r3)
            if (r3 == 0) goto L_0x018e
            long r2 = r3.X
            goto L_0x015a
        L_0x018e:
            long r2 = r2.X
            goto L_0x015a
        L_0x0191:
            if (r5 != r4) goto L_0x019a
            boolean r4 = r1.f
            if (r4 == 0) goto L_0x019a
            r24 = 1
            goto L_0x019c
        L_0x019a:
            r24 = r27
        L_0x019c:
            hrd r4 = new hrd
            r5 = 1
            r23 = r0 ^ 1
            gb8 r0 = r13.t
            r27 = r0
            r22 = 1
            rb8 r0 = r13.s
            r26 = r0
            long r0 = r1.u
            r16 = r0
            r9 = r4
            r10 = r39
            r0 = r13
            r12 = r20
            r18 = r28
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
            goto L_0x020b
        L_0x01bd:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r41
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01ea
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01cf
            goto L_0x01ea
        L_0x01cf:
            if (r10 != 0) goto L_0x01e8
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01d6
            goto L_0x01e8
        L_0x01d6:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.maf.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            km6 r2 = (defpackage.km6) r2
            long r2 = r2.X
            goto L_0x01ec
        L_0x01e8:
            r2 = r11
            goto L_0x01ec
        L_0x01ea:
            r2 = 0
        L_0x01ec:
            hrd r4 = new hrd
            r9 = r4
            rb8 r5 = r0.s
            r26 = r5
            r27 = 0
            long r5 = r1.u
            r14 = r5
            r16 = r5
            r18 = 0
            r22 = 1
            r23 = 0
            r24 = 1
            r10 = r39
            r12 = r20
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
        L_0x020b:
            r0.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm6.q(pm6):void");
    }
}
