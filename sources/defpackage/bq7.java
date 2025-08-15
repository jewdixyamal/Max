package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bq7  reason: default package */
public final class bq7 implements we8 {
    public final ze8 a;
    public final u65 b;
    public final ye8 c;
    public final Context d;
    public ve8 e;
    public fef f;
    public ue8 g;
    public float h;
    public boolean i;
    public boolean j;
    public PowerManager k;
    public PowerManager.WakeLock l;

    public bq7(ze8 ze8, u65 u65, ye8 ye8, Context context, float f2, boolean z, boolean z2) {
        this.a = ze8;
        this.b = u65;
        this.c = ye8;
        this.d = context;
        this.h = f2;
        this.i = z;
        this.j = z2;
    }

    public final void a() {
        ze8 ze8 = ze8.a;
        ze8 ze82 = this.a;
        if (ze82 != ze8 && ze82 != ze8.b && l()) {
            if (this.l == null) {
                if (this.k == null) {
                    this.k = (PowerManager) this.d.getSystemService("power");
                }
                PowerManager powerManager = this.k;
                Locale locale = Locale.ENGLISH;
                this.l = powerManager.newWakeLock(536870922, "tamtam:media_player_controller_" + ze82);
            }
            if (!this.l.isHeld()) {
                try {
                    this.l.acquire();
                    hm9.m("bq7", "New wake lock acquire %s", ze82);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String b(String str) {
        Locale locale = Locale.ENGLISH;
        StringBuilder o = rh4.o(str, "-");
        o.append(this.a);
        return o.toString();
    }

    public final boolean c() {
        if (this.f == null) {
            return false;
        }
        ye8 ye8 = this.c;
        ye8.getClass();
        ze8 ze8 = ze8.c;
        ze8 ze82 = this.a;
        if ((ze82 != ze8 || !ye8.q()) && ze82 != ze8.b) {
            return false;
        }
        lj9 lj9 = ye8.u0.B0;
        return (lj9 == null || !lj9.b()) && !ye8.Z.c.x;
    }

    public final long d() {
        long j2;
        if (this.f == null) {
            return 0;
        }
        u65 u65 = this.b;
        if (u65.Z == null) {
            return 0;
        }
        zpd zpd = u65.a;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        if (t75.n()) {
            z2b z2b = t75.k1;
            j2 = z2b.k.equals(z2b.b) ? maf.M(t75.k1.q) : t75.c();
        } else {
            t75.s2();
            if (t75.k1.a.q()) {
                j2 = t75.m1;
            } else {
                z2b z2b2 = t75.k1;
                if (z2b2.k.d != z2b2.b.d) {
                    j2 = maf.M(z2b2.a.n(t75.p0(), (jue) t75.b, 0).y0);
                } else {
                    long j3 = z2b2.q;
                    if (t75.k1.k.a()) {
                        z2b z2b3 = t75.k1;
                        gue h2 = z2b3.a.h(z2b3.k.a, t75.z0);
                        long j4 = h2.Z.a(t75.k1.k.b).a;
                        j3 = j4 == Long.MIN_VALUE ? h2.o : j4;
                    }
                    z2b z2b4 = t75.k1;
                    lue lue = z2b4.a;
                    Object obj = z2b4.k.a;
                    gue gue = t75.z0;
                    lue.h(obj, gue);
                    j2 = maf.M(j3 + gue.X);
                }
            }
        }
        return j2 - u65.Z.m();
    }

    public final lze e() {
        int intValue;
        fef fef = this.f;
        lze lze = lze.u0;
        if (fef == null) {
            return lze;
        }
        kad kad = this.b.b;
        bf4 bf4 = (bf4) kad.a;
        ez7 ez7 = bf4.c;
        if (ez7 == null || (intValue = ((Integer) kad.d(ez7).second).intValue()) < 0) {
            return lze;
        }
        qe4 a2 = ((ne4) bf4.e.get()).a(intValue, ez7.c[intValue]);
        if (a2 != null) {
            for (lze lze2 : kad.b().b) {
                if (lze2.s0 == a2.a && lze2.t0 == a2.b[0]) {
                    return lze2;
                }
            }
        }
        zpd zpd = (zpd) kad.b;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        m85[] m85Arr = (m85[]) t75.k1.i.X;
        int length = m85Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            oy5 oy5 = null;
            if (i2 < length) {
                m85 m85 = m85Arr[i2];
                if (m85 instanceof m85) {
                    oy5 = m85.j();
                }
            }
            if (oy5 != null && ha9.g(oy5.w0) == 1) {
                for (mze mze : (List) kad.o) {
                    Iterator it = mze.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            lze lze3 = (lze) it.next();
                            if (kad.a(lze3, oy5)) {
                                return lze3;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return lze;
    }

    public final long f() {
        if (this.f == null) {
            return 0;
        }
        u65 u65 = this.b;
        if (u65.Z == null) {
            return 0;
        }
        return u65.a.k() - u65.Z.m();
    }

    public final long g() {
        if (this.f == null) {
            return 0;
        }
        return this.b.v();
    }

    public final int h() {
        if (this.f == null) {
            return 0;
        }
        u65 u65 = this.b;
        if (u65.Z == null) {
            return 0;
        }
        return u65.v0;
    }

    public final int i() {
        if (this.f == null) {
            return 0;
        }
        return this.b.w0;
    }

    public final int j() {
        if (this.f == null) {
            return 0;
        }
        u65 u65 = this.b;
        if (u65.Z == null) {
            return 0;
        }
        return u65.u0;
    }

    public final boolean k() {
        if (this.f == null) {
            return false;
        }
        return this.b.b();
    }

    public final boolean l() {
        return this.h == 1.0f;
    }

    public final void m() {
        this.c.p(this);
        ve8 ve8 = this.e;
        if (ve8 != null) {
            ve8.i();
        }
        a();
    }

    public final void n() {
        if (this.f != null) {
            hm9.m("bq7", "Pause %s", this.a);
            this.j = false;
            this.b.pause();
        }
    }

    public final void o() {
        if (this.f != null) {
            hm9.m("bq7", "Play %s", this.a);
            this.j = true;
            this.b.play();
        }
    }

    public final void p() {
        PowerManager.WakeLock wakeLock = this.l;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.l.release();
            hm9.m("bq7", "Release wake lock %s", this.a);
        }
    }

    public final void q(long j2) {
        if (this.f != null) {
            u65 u65 = this.b;
            u65.getClass();
            u65.u();
            if (u65.Z != null) {
                zpd zpd = u65.a;
                zpd.Z1();
                t75 t75 = zpd.c;
                if (t75.c() != 0) {
                    zpd.Z1();
                    if (j2 > t75.c() - u65.Z.m()) {
                        return;
                    }
                }
                zpd.r(zpd.p0(), u65.Z.m() + j2);
            }
        }
    }

    public final void r(Surface surface) {
        hm9.m("bq7", "Set surface %s", this.a);
        u65 u65 = this.b;
        u65.getClass();
        u65.u();
        hm9.m("u65", "Set surface %s", surface);
        zpd zpd = u65.a;
        if (surface == null) {
            zpd.Z1();
            t75 t75 = zpd.c;
            t75.s2();
            t75.m2((Surface) null);
            t75.i2(0, 0);
            return;
        }
        zpd.Z1();
        t75 t752 = zpd.c;
        t752.s2();
        t752.m2(surface);
        t752.i2(-1, -1);
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [dj0] */
    /* JADX WARNING: type inference failed for: r16v0, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v1, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v18, types: [znb] */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r16v4, types: [rm6] */
    /* JADX WARNING: type inference failed for: r16v5, types: [x14] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.fef r39, defpackage.ue8 r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r40
            r2 = 23
            r3 = 0
            r4 = 1
            ze8 r5 = r0.a
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "bq7"
            java.lang.String r7 = "Set video content %s"
            defpackage.hm9.m(r6, r7, r5)
            r5 = r39
            r0.f = r5
            ue8 r5 = r0.g
            if (r5 == 0) goto L_0x0022
            if (r5 == r1) goto L_0x0022
            r5.c1()
        L_0x0022:
            r0.g = r1
            u65 r1 = r0.b
            r1.getClass()
            defpackage.u65.u()
            r1.Y = r0
            fef r5 = r0.f
            ok0 r5 = (defpackage.ok0) r5
            boolean r5 = r5.g
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x003a
        L_0x0038:
            float r5 = r0.h
        L_0x003a:
            r1.g(r5)
            boolean r5 = r0.i
            defpackage.u65.u()
            zpd r6 = r1.a
            r6.Z1()
            t75 r6 = r6.c
            r6.s2()
            int r7 = r6.N0
            if (r7 == r5) goto L_0x007c
            r6.N0 = r5
            f85 r7 = r6.w0
            aie r7 = r7.s0
            r7.getClass()
            yhe r8 = defpackage.aie.b()
            android.os.Handler r7 = r7.a
            r9 = 11
            android.os.Message r7 = r7.obtainMessage(r9, r5, r3)
            r8.a = r7
            r8.b()
            z64 r7 = new z64
            r7.<init>(r5, r4)
            z23 r5 = r6.x0
            r8 = 8
            r5.h(r8, r7)
            r6.o2()
            r5.e()
        L_0x007c:
            fef r5 = r0.f
            boolean r0 = r0.j
            defpackage.u65.u()
            fef r6 = r1.Z
            java.lang.String r7 = "u65"
            zpd r8 = r1.a
            r9 = 4
            if (r6 == 0) goto L_0x00e4
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00e4
            r8.Z1()
            t75 r6 = r8.c
            r6.s2()
            z2b r6 = r6.k1
            int r6 = r6.e
            if (r6 != r4) goto L_0x00a1
            goto L_0x00e4
        L_0x00a1:
            zpd r2 = r1.a
            r2.Z1()
            t75 r2 = r2.c
            r2.s2()
            z2b r2 = r2.k1
            int r2 = r2.e
            if (r2 != r9) goto L_0x00b9
            java.lang.String r2 = "Video ended. Seek to start"
            defpackage.hm9.m(r7, r2, new java.lang.Object[0])
            r1.B()
        L_0x00b9:
            r8.Z1()
            t75 r2 = r8.c
            r2.s2()
            z2b r2 = r2.k1
            int r2 = r2.e
            r3 = 3
            if (r2 != r3) goto L_0x00d3
            bq7 r2 = r1.Y
            if (r2 == 0) goto L_0x00d3
            ve8 r2 = r2.e
            if (r2 == 0) goto L_0x00d3
            r2.j1()
        L_0x00d3:
            r8.Y(r0)
            if (r0 == 0) goto L_0x035d
            bq7 r0 = r1.Y
            if (r0 == 0) goto L_0x00df
            r0.m()
        L_0x00df:
            r1.y()
            goto L_0x035d
        L_0x00e4:
            java.lang.String r6 = "Prepare new video content"
            defpackage.hm9.m(r7, r6, new java.lang.Object[0])
            r1.u0 = r3
            r1.v0 = r3
            r1.w0 = r3
            r1.x0 = r3
            bq7 r6 = r1.Y
            if (r6 == 0) goto L_0x00fc
            ve8 r6 = r6.e
            if (r6 == 0) goto L_0x00fc
            r6.y0()
        L_0x00fc:
            r1.Z = r5
            int r6 = r5.getWidth()
            float r6 = (float) r6
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r6 / r5
            r1.s0 = r6
            fef r5 = r1.Z
            kad r6 = r1.b
            r6.c = r5
            java.util.List r5 = java.util.Collections.emptyList()
            r6.o = r5
            java.lang.Object r5 = r6.a
            bf4 r5 = (defpackage.bf4) r5
            pe4 r7 = r5.b()
            android.util.SparseArray r10 = r7.M
            int r11 = r10.size()
            if (r11 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r10.clear()
        L_0x012b:
            r5.h(r7)
            r6.e()
            fef r5 = r1.Z
            android.net.Uri r6 = r5.l()
            r7 = r5
            ok0 r7 = (defpackage.ok0) r7
            boolean r7 = r7.c
            r7 = r7 ^ r4
            m65 r10 = r1.o
            p24 r7 = r10.a(r6, r7)
            boolean r10 = r5 instanceof defpackage.b24
            if (r10 == 0) goto L_0x0191
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r2.<init>(r7)
            rb8 r5 = defpackage.rb8.a(r6)
            kb8 r6 = r5.b
            r6.getClass()
            l14 r7 = new l14
            r7.<init>()
            java.util.List r6 = r6.c
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x016a
            ph4 r10 = new ph4
            r10.<init>((java.lang.Object) r7, (java.lang.Object) r6)
            r19 = r10
            goto L_0x016c
        L_0x016a:
            r19 = r7
        L_0x016c:
            x14 r6 = new x14
            y7g r7 = r2.c
            sr4 r22 = r7.x(r5)
            long r10 = r2.f
            mq9 r7 = r2.d
            buc r12 = r2.e
            p24 r13 = r2.b
            ey1 r2 = r2.a
            r16 = r6
            r17 = r5
            r18 = r13
            r20 = r2
            r21 = r7
            r23 = r12
            r24 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x028e
        L_0x0191:
            boolean r10 = r5 instanceof defpackage.yn6
            if (r10 == 0) goto L_0x01f0
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r2 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r2.<init>(r7)
            rb8 r5 = defpackage.rb8.a(r6)
            kb8 r6 = r5.b
            r6.getClass()
            rq9 r7 = r2.c
            java.util.List r6 = r6.c
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x01b5
            imc r10 = new imc
            r11 = 18
            r10.<init>(r7, r6, r3, r11)
            r7 = r10
        L_0x01b5:
            rm6 r6 = new rm6
            oq9 r10 = r2.b
            y7g r11 = r2.f
            sr4 r21 = r11.x(r5)
            av1 r11 = r2.d
            r11.getClass()
            hb4 r11 = new hb4
            buc r12 = r2.g
            gaa r13 = r2.a
            r11.<init>((defpackage.gaa) r13, (defpackage.buc) r12, (defpackage.dn6) r7)
            mq9 r7 = r2.e
            long r13 = r2.j
            boolean r9 = r2.h
            int r15 = r2.i
            gaa r2 = r2.a
            r16 = r6
            r17 = r5
            r18 = r2
            r19 = r10
            r20 = r7
            r22 = r12
            r23 = r11
            r24 = r13
            r26 = r9
            r27 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            goto L_0x028e
        L_0x01f0:
            boolean r9 = r5 instanceof defpackage.ee9
            if (r9 == 0) goto L_0x0263
            r6 = r5
            ee9 r6 = (defpackage.ee9) r6
            java.util.List r9 = r6.j
            int r10 = r9.size()
            dj0[] r10 = new defpackage.dj0[r10]
            r15 = r3
        L_0x0200:
            int r11 = r9.size()
            if (r15 >= r11) goto L_0x025d
            java.lang.Object r11 = r9.get(r15)
            ce9 r11 = (defpackage.ce9) r11
            ua4 r12 = new ua4
            r12.<init>()
            yt8 r14 = new yt8
            r14.<init>((int) r2, (java.lang.Object) r12)
            buc r16 = new buc
            r16.<init>()
            java.lang.String r11 = r11.a
            android.net.Uri r11 = android.net.Uri.parse(r11)
            rb8 r12 = defpackage.rb8.a(r11)
            kb8 r11 = r12.b
            r11.getClass()
            znb r13 = new znb
            kb8 r11 = r12.b
            r11.getClass()
            kb8 r11 = r12.b
            r11.getClass()
            or4 r17 = defpackage.sr4.a
            r11 = r13
            r3 = r13
            r13 = r7
            r19 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            boolean r11 = r5 instanceof defpackage.w2f
            if (r11 == 0) goto L_0x0256
            d43 r13 = new d43
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r14 = r6.k()
            long r11 = r11.toMicros(r14)
            r13.<init>(r3, r11)
            goto L_0x0257
        L_0x0256:
            r13 = r3
        L_0x0257:
            r10[r19] = r13
            int r15 = r19 + 1
            r3 = 0
            goto L_0x0200
        L_0x025d:
            bs8 r6 = new bs8
            r6.<init>(r10)
            goto L_0x028e
        L_0x0263:
            ua4 r3 = new ua4
            r3.<init>()
            yt8 r14 = new yt8
            r14.<init>((int) r2, (java.lang.Object) r3)
            buc r16 = new buc
            r16.<init>()
            rb8 r12 = defpackage.rb8.a(r6)
            kb8 r2 = r12.b
            r2.getClass()
            znb r6 = new znb
            kb8 r2 = r12.b
            r2.getClass()
            kb8 r2 = r12.b
            r2.getClass()
            or4 r15 = defpackage.sr4.a
            r11 = r6
            r13 = r7
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x028e:
            r1.t0 = r6
            r8.Y(r0)
            fef r2 = r1.Z
            r3 = r2
            ok0 r3 = (defpackage.ok0) r3
            long r5 = r3.b
            long r2 = r2.m()
            long r12 = java.lang.Math.max(r5, r2)
            fef r2 = r1.Z
            ok0 r2 = (defpackage.ok0) r2
            boolean r2 = r2.c
            t75 r3 = r8.c
            if (r2 != 0) goto L_0x02c9
            r5 = 0
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x02b3
            goto L_0x02c9
        L_0x02b3:
            dj0 r2 = r1.t0
            r8.Z1()
            r3.s2()
            java.util.List r10 = java.util.Collections.singletonList(r2)
            r3.s2()
            r14 = 0
            r11 = 0
            r9 = r3
            r9.l2(r10, r11, r12, r14)
            goto L_0x02e9
        L_0x02c9:
            dj0 r2 = r1.t0
            r8.Z1()
            r3.s2()
            java.util.List r20 = java.util.Collections.singletonList(r2)
            r3.s2()
            r3.s2()
            r24 = 1
            r21 = -1
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = r3
            r19.l2(r20, r21, r22, r24)
        L_0x02e9:
            r8.Z1()
            r3.s2()
            boolean r2 = r3.u()
            n40 r5 = r3.I0
            r6 = 2
            int r5 = r5.d(r6, r2)
            if (r2 == 0) goto L_0x0300
            if (r5 == r4) goto L_0x0300
            r7 = r6
            goto L_0x0301
        L_0x0300:
            r7 = r4
        L_0x0301:
            r3.p2(r5, r7, r2)
            z2b r2 = r3.k1
            int r5 = r2.e
            if (r5 == r4) goto L_0x030b
            goto L_0x0351
        L_0x030b:
            r5 = 0
            z2b r2 = r2.e(r5)
            lue r5 = r2.a
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x031a
            r9 = 4
            goto L_0x031b
        L_0x031a:
            r9 = r6
        L_0x031b:
            z2b r29 = r2.f(r9)
            int r2 = r3.O0
            int r2 = r2 + r4
            r3.O0 = r2
            f85 r2 = r3.w0
            aie r2 = r2.s0
            r2.getClass()
            yhe r4 = defpackage.aie.b()
            android.os.Handler r2 = r2.a
            r5 = 0
            android.os.Message r2 = r2.obtainMessage(r5)
            r4.a = r2
            r4.b()
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r37 = -1
            r30 = 1
            r31 = 1
            r32 = 0
            r33 = 0
            r34 = 5
            r28 = r3
            r28.q2(r29, r30, r31, r32, r33, r34, r35, r37)
        L_0x0351:
            if (r0 == 0) goto L_0x035d
            bq7 r0 = r1.Y
            if (r0 == 0) goto L_0x035a
            r0.m()
        L_0x035a:
            r1.y()
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq7.s(fef, ue8):void");
    }

    public final void t(float f2) {
        fef fef = this.f;
        if (fef == null || !((ok0) fef).g) {
            this.h = f2;
            this.b.g(f2);
            if (l() && this.f != null && l()) {
                this.c.p(this);
            }
        }
    }

    public final void u() {
        if (this.f != null) {
            hm9.m("bq7", "Stop %s", this.a);
            this.b.E();
        }
    }

    public final void v() {
        t(0.0f);
    }
}
