package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nq0  reason: default package */
public final class nq0 extends pab {
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k = tu0.r(3, new m(22));
    public final sj4 l;

    public nq0(long j2, sx3 sx3) {
        super(j2);
        xcb xcb = xcb.a;
        je7 e = xcb.e();
        this.f = e;
        this.g = xcb.c();
        this.h = xcb.getAccessor().d(eyd.class);
        this.i = xcb.getAccessor().d(afe.class);
        je7 f2 = xcb.f();
        this.j = xcb.getAccessor().d(y7d.class);
        sj4 a = ((ecb) xcb.getAccessor().c(ecb.class)).a(j2);
        this.l = a;
        od2.L(od2.F(new zn5(new ac(new t03(((ds3) e.getValue()).c(j2), 11), 5, this), new lq0(2, this, nq0.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 0), 5), ((w9a) ((kke) f2.getValue())).a()), sx3);
        od2.L(od2.F(new zn5(new v7c(a.d), new lq0(2, this, nq0.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 1), 5), ((w9a) ((kke) f2.getValue())).a()), sx3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = ((defpackage.eyd) r4.h.getValue()).a(r0.longValue(), (java.lang.String) null, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            java.lang.Long r0 = r4.i()
            e5f r1 = defpackage.e5f.a
            if (r0 == 0) goto L_0x001e
            long r2 = r0.longValue()
            je7 r4 = r4.h
            java.lang.Object r4 = r4.getValue()
            eyd r4 = (defpackage.eyd) r4
            r0 = 0
            java.lang.Object r4 = r4.a(r2, r0, r5)
            tx3 r5 = defpackage.tx3.a
            if (r4 != r5) goto L_0x001e
            return r4
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = ((defpackage.afe) r4.i.getValue()).a(r0.longValue(), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            java.lang.Long r0 = r4.i()
            e5f r1 = defpackage.e5f.a
            if (r0 == 0) goto L_0x001d
            long r2 = r0.longValue()
            je7 r4 = r4.i
            java.lang.Object r4 = r4.getValue()
            afe r4 = (defpackage.afe) r4
            java.lang.Object r4 = r4.a(r2, r5)
            tx3 r5 = defpackage.tx3.a
            if (r4 != r5) goto L_0x001d
            return r4
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018b, code lost:
        if (r0.b.J.b(256) == true) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mab D(defpackage.uj3 r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = r27.j()
            java.lang.String r2 = defpackage.bre.c(r2)
            long r4 = r27.n()
            java.lang.String r9 = r27.d()
            java.lang.CharSequence r10 = r27.m()
            int r3 = defpackage.yea.W
            eqe r12 = new eqe
            r12.<init>(r3)
            java.util.List r7 = r27.r()
            kk0 r3 = defpackage.kk0.b
            java.lang.String r8 = r1.p(r3)
            boolean r3 = r27.s()
            r15 = 1
            r24 = 0
            if (r3 != 0) goto L_0x003c
            int r3 = r27.k()
            if (r3 == 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r14 = r24
            goto L_0x003d
        L_0x003c:
            r14 = r15
        L_0x003d:
            iqe r13 = new iqe
            r13.<init>(r2)
            boolean r2 = r27.u()
            tab r11 = new tab
            r6 = 0
            r16 = 0
            r17 = 64
            r3 = r11
            r25 = r11
            r11 = r16
            r15 = r2
            r16 = r17
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            je7 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            n1d r2 = (defpackage.n1d) r2
            e52 r3 = r26.E()
            r2.getClass()
            kl7 r4 = defpackage.j1e.l()
            r2.b(r4, r1, r3)
            ida r16 = r2.a()
            ida r2 = r2.a()
            java.lang.CharSequence r17 = r1.l(r2)
            r16.getClass()
            r20 = 0
            r23 = 1
            r19 = 1
            r21 = 1
            r22 = 0
            r18 = r24
            java.lang.CharSequence r1 = r16.a(r17, r18, r19, r20, r21, r22, r23)
            if (r1 == 0) goto L_0x00a5
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0096
            goto L_0x00a5
        L_0x0096:
            int r2 = defpackage.yea.F
            wib r3 = new wib
            eqe r5 = new eqe
            r5.<init>(r2)
            r3.<init>(r1, r5)
            r4.add(r3)
        L_0x00a5:
            oib r1 = new oib
            r1.<init>()
            r4.add(r1)
            kl7 r1 = defpackage.j1e.d(r4)
            je7 r2 = r0.b
            java.lang.Object r2 = r2.getValue()
            mv0 r2 = (defpackage.mv0) r2
            e52 r3 = r26.E()
            r2.getClass()
            i92 r4 = defpackage.i92.o
            r5 = 0
            if (r3 == 0) goto L_0x012e
            k92 r7 = r3.b
            long r8 = r7.a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x012e
            boolean r8 = r3.g0()
            if (r8 == 0) goto L_0x00d9
            i92 r7 = r7.c
            if (r7 != r4) goto L_0x00d9
            goto L_0x012e
        L_0x00d9:
            boolean r7 = r3.W()
            if (r7 == 0) goto L_0x0104
            l7a r2 = defpackage.mv0.d()
            l7a r3 = new l7a
            int r8 = defpackage.wea.n1
            int r7 = defpackage.yea.K
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r7 = defpackage.woc.H1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r12 = 0
            r13 = 52
            r10 = 0
            r7 = r3
            r7.<init>((int) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            l7a[] r2 = new defpackage.l7a[]{r2, r3}
            java.util.List r2 = defpackage.y53.M(r2)
            goto L_0x0158
        L_0x0104:
            kl7 r7 = defpackage.j1e.l()
            l7a r8 = defpackage.mv0.d()
            r7.add(r8)
            je7 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            boolean r2 = r3.V(r2)
            if (r2 == 0) goto L_0x0122
            l7a r2 = defpackage.mv0.a()
            goto L_0x0126
        L_0x0122:
            l7a r2 = defpackage.mv0.b()
        L_0x0126:
            r7.add(r2)
            kl7 r2 = defpackage.j1e.d(r7)
            goto L_0x0158
        L_0x012e:
            kl7 r2 = defpackage.j1e.l()
            l7a r3 = defpackage.mv0.d()
            r2.add(r3)
            l7a r3 = new l7a
            int r8 = defpackage.wea.n1
            int r7 = defpackage.yea.K
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r7 = defpackage.woc.H1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r12 = 0
            r13 = 52
            r10 = 0
            r7 = r3
            r7.<init>((int) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            r2.add(r3)
            kl7 r2 = defpackage.j1e.d(r2)
        L_0x0158:
            je7 r3 = r0.k
            java.lang.Object r3 = r3.getValue()
            zcb r3 = (defpackage.zcb) r3
            e52 r7 = r26.E()
            je7 r8 = r0.j
            java.lang.Object r8 = r8.getValue()
            y7d r8 = (defpackage.y7d) r8
            qyc r8 = (defpackage.qyc) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f12botcomplaintenabled
            r10 = 0
            boolean r8 = r8.n(r9, r10)
            if (r8 == 0) goto L_0x0191
            e52 r0 = r26.E()
            if (r0 == 0) goto L_0x018e
            k92 r0 = r0.b
            fm5 r0 = r0.J
            r8 = 256(0x100, float:3.59E-43)
            boolean r0 = r0.b(r8)
            r8 = 1
            if (r0 != r8) goto L_0x018f
            goto L_0x0192
        L_0x018e:
            r8 = 1
        L_0x018f:
            r15 = r8
            goto L_0x0194
        L_0x0191:
            r8 = 1
        L_0x0192:
            r15 = r24
        L_0x0194:
            r3.getClass()
            je7 r0 = r3.c
            if (r7 == 0) goto L_0x023d
            k92 r9 = r7.b
            long r10 = r9.a
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x023d
            boolean r5 = r7.g0()
            if (r5 == 0) goto L_0x01af
            i92 r5 = r9.c
            if (r5 != r4) goto L_0x01af
            goto L_0x023d
        L_0x01af:
            boolean r4 = r7.W()
            je7 r5 = r3.b
            je7 r6 = r3.a
            es8 r10 = r7.c
            if (r4 == 0) goto L_0x01ee
            kl7 r4 = defpackage.j1e.l()
            java.lang.Object r6 = r6.getValue()
            l7a r6 = (defpackage.l7a) r6
            r4.add(r6)
            if (r10 == 0) goto L_0x01d3
            java.lang.Object r5 = r5.getValue()
            l7a r5 = (defpackage.l7a) r5
            r4.add(r5)
        L_0x01d3:
            if (r15 == 0) goto L_0x01de
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r4.add(r0)
        L_0x01de:
            je7 r0 = r3.f
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r4.add(r0)
            kl7 r0 = defpackage.j1e.d(r4)
            goto L_0x0250
        L_0x01ee:
            kl7 r4 = defpackage.j1e.l()
            java.lang.Object r6 = r6.getValue()
            l7a r6 = (defpackage.l7a) r6
            r4.add(r6)
            if (r10 == 0) goto L_0x0206
            java.lang.Object r5 = r5.getValue()
            l7a r5 = (defpackage.l7a) r5
            r4.add(r5)
        L_0x0206:
            if (r15 == 0) goto L_0x0211
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r4.add(r0)
        L_0x0211:
            boolean r0 = r7.H()
            if (r0 == 0) goto L_0x0222
            fm5 r0 = r9.J
            r5 = 128(0x80, float:1.794E-43)
            boolean r0 = r0.b(r5)
            if (r0 == 0) goto L_0x0222
            goto L_0x0238
        L_0x0222:
            je7 r0 = r3.d
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r4.add(r0)
            je7 r0 = r3.h
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r4.add(r0)
        L_0x0238:
            kl7 r0 = defpackage.j1e.d(r4)
            goto L_0x0250
        L_0x023d:
            kl7 r3 = defpackage.j1e.l()
            if (r15 == 0) goto L_0x024c
            java.lang.Object r0 = r0.getValue()
            l7a r0 = (defpackage.l7a) r0
            r3.add(r0)
        L_0x024c:
            kl7 r0 = defpackage.j1e.d(r3)
        L_0x0250:
            kl7 r3 = defpackage.j1e.l()
            boolean r4 = r2.isEmpty()
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0262
            boolean r4 = r0.isEmpty()
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x026a
        L_0x0262:
            kib r4 = new kib
            r4.<init>(r2, r0, r8)
            r3.add(r4)
        L_0x026a:
            r3.addAll(r1)
            kl7 r0 = defpackage.j1e.d(r3)
            mab r1 = new mab
            r2 = r25
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.D(uj3):mab");
    }

    public final e52 E() {
        return ((jz2) ((iy2) this.g.getValue())).q(this.a);
    }

    public final void d() {
        sj4 sj4 = this.l;
        sj4.b.f(sj4);
    }

    public final String h() {
        uj3 uj3 = (uj3) ((ds3) this.f.getValue()).c(this.a).a.getValue();
        if (uj3 != null) {
            return uj3.g();
        }
        return null;
    }

    public final Long i() {
        e52 E = E();
        if (E != null) {
            return Long.valueOf(E.a);
        }
        return null;
    }

    public final Long j() {
        e52 E = E();
        if (E != null) {
            return Long.valueOf(E.b.a);
        }
        return null;
    }

    public final int k() {
        return 2;
    }

    public final hdb l() {
        return hdb.CONTACT;
    }

    public final Object n(Continuation continuation) {
        return ((jz2) ((iy2) this.g.getValue())).u(this.a, continuation);
    }

    public final c64 x() {
        dp3 dp3 = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=contact");
    }
}
