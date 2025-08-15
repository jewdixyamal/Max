package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: feb  reason: default package */
public final class feb extends pnf {
    public static final /* synthetic */ bc7[] G0;
    public final boolean A0;
    public final s35 B0;
    public final s35 C0;
    public final w4d D0;
    public final w4d E0;
    public final w7c F0;
    public final boolean X;
    public final iy2 Y;
    public final ds3 Z;
    public final long b;
    public final long c;
    public final rdb o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final q0e y0;
    public final q0e z0 = r0e.a((Object) null);

    static {
        Class<feb> cls = feb.class;
        G0 = new bc7[]{new oi9(cls, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;")};
    }

    public feb(long j, long j2, rdb rdb, boolean z, iy2 iy2, ds3 ds3, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.b = j;
        this.c = j2;
        this.o = rdb;
        this.X = z;
        this.Y = iy2;
        this.Z = ds3;
        this.s0 = je7;
        this.t0 = je73;
        this.u0 = je72;
        this.v0 = je74;
        this.w0 = je75;
        this.x0 = je76;
        q0e a = r0e.a((Object) null);
        this.y0 = a;
        this.A0 = rdb == rdb.SETUP_NEW_ADMIN;
        this.B0 = new s35(0);
        this.C0 = new s35(0);
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        if (z) {
            od2.L(od2.F(new zn5(new jp5(new mqc(new ceb(new j31(new t03(((jz2) iy2).m(j), 11), new t03(ds3.c(j2), 11), sdb.s0, 4), (Continuation) null, this)), 0), new tdb(this, (Continuation) null), 5), ((w9a) u()).a()), this.a);
        } else {
            od2.L(od2.F(new zn5(new mqc(new eeb(new j31(new t03(((jz2) iy2).m(j), 11), new t03(ds3.c(j2), 11), new c3(this, (Continuation) null, 25), 4), (Continuation) null, this)), new udb(this, (Continuation) null), 5), ((w9a) u()).a()), this.a);
        }
        this.F0 = od2.X(od2.F(od2.x(new ap8(new t03(a, 11), this, 7)), ((w9a) u()).a()), this.a, wld.a, new vdb());
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.pdb q(defpackage.feb r31, defpackage.e52 r32, defpackage.uj3 r33, boolean r34) {
        /*
            r0 = r32
            r31.getClass()
            long r1 = r33.n()
            k92 r3 = r0.b
            long r3 = r3.d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r31
            r4 = r2
            goto L_0x0019
        L_0x0016:
            r4 = 0
            r1 = r31
        L_0x0019:
            je7 r1 = r1.x0
            java.lang.Object r1 = r1.getValue()
            q33 r1 = (defpackage.q33) r1
            hyc r1 = (defpackage.hyc) r1
            long r5 = r1.t()
            boolean r1 = r32.d0()
            long r7 = r33.n()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0035
            r7 = r2
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            boolean r8 = r32.I()
            r9 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x004b
            long r10 = r33.n()
            int r8 = r0.e(r10)
            boolean r8 = defpackage.oag.s(r8, r9)
            goto L_0x0057
        L_0x004b:
            long r10 = r33.n()
            int r8 = r0.e(r10)
            boolean r8 = defpackage.oag.s(r8, r2)
        L_0x0057:
            boolean r10 = r32.I()
            if (r10 == 0) goto L_0x0066
            int r10 = r0.e(r5)
            boolean r9 = defpackage.oag.s(r10, r9)
            goto L_0x006a
        L_0x0066:
            boolean r9 = r32.x()
        L_0x006a:
            boolean r10 = r32.I()
            r11 = 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x007f
            long r12 = r33.n()
            int r10 = r0.e(r12)
            boolean r10 = defpackage.oag.s(r10, r11)
            goto L_0x008b
        L_0x007f:
            long r12 = r33.n()
            int r10 = r0.e(r12)
            boolean r10 = defpackage.oag.s(r10, r2)
        L_0x008b:
            boolean r12 = r32.I()
            if (r12 == 0) goto L_0x009a
            int r12 = r0.e(r5)
            boolean r11 = defpackage.oag.s(r12, r11)
            goto L_0x009e
        L_0x009a:
            boolean r11 = r32.x()
        L_0x009e:
            boolean r12 = r32.I()
            r13 = 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x00b3
            long r14 = r33.n()
            int r12 = r0.e(r14)
            boolean r12 = defpackage.oag.s(r12, r13)
            goto L_0x00bf
        L_0x00b3:
            long r14 = r33.n()
            int r12 = r0.e(r14)
            boolean r12 = defpackage.oag.s(r12, r2)
        L_0x00bf:
            boolean r14 = r32.I()
            if (r14 == 0) goto L_0x00ce
            int r14 = r0.e(r5)
            boolean r13 = defpackage.oag.s(r14, r13)
            goto L_0x00d2
        L_0x00ce:
            boolean r13 = r32.x()
        L_0x00d2:
            long r14 = r33.n()
            int r14 = r0.e(r14)
            r15 = 16
            boolean r14 = defpackage.oag.s(r14, r15)
            boolean r15 = r32.w()
            r16 = r4
            long r3 = r33.n()
            int r3 = r0.e(r3)
            r4 = 8
            boolean r3 = defpackage.oag.s(r3, r4)
            boolean r4 = r32.u()
            r31 = r3
            long r2 = r33.n()
            int r2 = r0.e(r2)
            r3 = 2
            boolean r2 = defpackage.oag.s(r2, r3)
            r18 = r2
            int r2 = r0.e(r5)
            boolean r2 = defpackage.oag.s(r2, r3)
            r3 = r7
            r19 = r8
            long r7 = r33.n()
            int r7 = r0.e(r7)
            r8 = 4
            boolean r7 = defpackage.oag.s(r7, r8)
            boolean r8 = r32.s()
            r20 = r2
            r21 = r3
            long r2 = r33.n()
            java.lang.Long r2 = r0.d(r2)
            if (r2 != 0) goto L_0x0134
            goto L_0x013e
        L_0x0134:
            long r2 = r2.longValue()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x013e
            if (r8 != 0) goto L_0x0140
        L_0x013e:
            if (r1 == 0) goto L_0x0142
        L_0x0140:
            r2 = 1
            goto L_0x0143
        L_0x0142:
            r2 = 0
        L_0x0143:
            if (r1 == 0) goto L_0x0164
            if (r34 == 0) goto L_0x0164
            odb r1 = new odb
            r2 = 1
            r1.<init>(r2, r2)
            odb r3 = new odb
            r4 = 0
            r3.<init>(r4, r2)
            r23 = r1
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r3
        L_0x0161:
            r5 = 1
            goto L_0x0259
        L_0x0164:
            if (r34 == 0) goto L_0x019c
            odb r1 = new odb
            r1.<init>(r9, r9)
            odb r2 = new odb
            r2.<init>(r11, r11)
            odb r3 = new odb
            r3.<init>(r13, r13)
            odb r5 = new odb
            r5.<init>(r15, r15)
            odb r6 = new odb
            r6.<init>(r4, r4)
            odb r4 = new odb
            r7 = r20
            r4.<init>(r7, r7)
            odb r7 = new odb
            r8 = 0
            r9 = 1
            r7.<init>(r8, r9)
            r23 = r1
            r24 = r2
            r25 = r3
            r28 = r4
            r26 = r5
            r27 = r6
            r29 = r7
            goto L_0x0161
        L_0x019c:
            r3 = r20
            r1 = 0
            if (r21 == 0) goto L_0x01d3
            odb r2 = new odb
            r2.<init>(r9, r1)
            odb r5 = new odb
            r5.<init>(r11, r1)
            odb r6 = new odb
            r6.<init>(r13, r1)
            odb r7 = new odb
            r7.<init>(r15, r1)
            odb r9 = new odb
            r9.<init>(r4, r1)
            odb r4 = new odb
            r4.<init>(r3, r1)
            odb r3 = new odb
            r3.<init>(r8, r1)
            r23 = r2
            r29 = r3
            r28 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r9
            goto L_0x0161
        L_0x01d3:
            if (r16 == 0) goto L_0x01eb
            odb r2 = new odb
            r5 = 1
            r2.<init>(r5, r1)
            r23 = r2
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            goto L_0x0259
        L_0x01eb:
            r5 = 1
            odb r6 = new odb
            if (r9 == 0) goto L_0x01f6
            if (r2 == 0) goto L_0x01f6
            r9 = r5
        L_0x01f3:
            r1 = r19
            goto L_0x01f8
        L_0x01f6:
            r9 = r1
            goto L_0x01f3
        L_0x01f8:
            r6.<init>(r1, r9)
            odb r1 = new odb
            if (r11 == 0) goto L_0x0203
            if (r2 == 0) goto L_0x0203
            r9 = r5
            goto L_0x0204
        L_0x0203:
            r9 = 0
        L_0x0204:
            r1.<init>(r10, r9)
            odb r9 = new odb
            if (r13 == 0) goto L_0x020f
            if (r2 == 0) goto L_0x020f
            r10 = r5
            goto L_0x0210
        L_0x020f:
            r10 = 0
        L_0x0210:
            r9.<init>(r12, r10)
            odb r10 = new odb
            if (r15 == 0) goto L_0x021b
            if (r2 == 0) goto L_0x021b
            r11 = r5
            goto L_0x021c
        L_0x021b:
            r11 = 0
        L_0x021c:
            r10.<init>(r14, r11)
            odb r11 = new odb
            if (r4 == 0) goto L_0x0229
            if (r2 == 0) goto L_0x0229
            r12 = r31
            r4 = r5
            goto L_0x022c
        L_0x0229:
            r4 = 0
            r12 = r31
        L_0x022c:
            r11.<init>(r12, r4)
            odb r4 = new odb
            if (r3 == 0) goto L_0x0239
            if (r2 == 0) goto L_0x0239
            r3 = r5
            r12 = r18
            goto L_0x023c
        L_0x0239:
            r12 = r18
            r3 = 0
        L_0x023c:
            r4.<init>(r12, r3)
            odb r3 = new odb
            if (r8 == 0) goto L_0x0247
            if (r2 == 0) goto L_0x0247
            r2 = r5
            goto L_0x0248
        L_0x0247:
            r2 = 0
        L_0x0248:
            r3.<init>(r7, r2)
            r24 = r1
            r29 = r3
            r28 = r4
            r23 = r6
            r25 = r9
            r26 = r10
            r27 = r11
        L_0x0259:
            pdb r1 = new pdb
            if (r34 != 0) goto L_0x0276
            boolean r2 = r32.J()
            if (r2 == 0) goto L_0x0276
            long r2 = r33.n()
            int r0 = r0.e(r2)
            r2 = 128(0x80, float:1.794E-43)
            boolean r0 = defpackage.oag.s(r0, r2)
            if (r0 == 0) goto L_0x0276
            r22 = r5
            goto L_0x0278
        L_0x0276:
            r22 = 0
        L_0x0278:
            r19 = 0
            r30 = 31
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feb.q(feb, e52, uj3, boolean):pdb");
    }

    public final void r() {
        pdb pdb;
        e52 e52;
        int n;
        q0e q0e = this.y0;
        pdb pdb2 = (pdb) q0e.getValue();
        boolean z = this.X;
        if (pdb2 != null && !pdb2.a && !pdb2.b && !pdb2.c && !pdb2.d && !pdb2.e && !pdb2.f && !z) {
            pnf.o(this.C0, new kdb(new eqe(vea.M0), (Integer) null));
        } else if ((!tpa.f(this.z0.getValue(), q0e.getValue()) || (z && this.o == rdb.SETUP_NEW_ADMIN)) && (pdb = (pdb) q0e.getValue()) != null && (e52 = (e52) ((jz2) this.Y).m(this.b).a.getValue()) != null) {
            long j = e52.b.a;
            if (z) {
                e52 s = s();
                boolean z2 = false;
                boolean I = s != null ? s.I() : false;
                odb odb = pdb.i;
                boolean z3 = I ? false : odb.a;
                boolean z4 = pdb.l.a;
                boolean z5 = pdb.m.a;
                boolean z6 = pdb.k.a;
                boolean z7 = pdb.j.a;
                boolean z8 = !I;
                boolean z9 = I ? pdb.g.a : false;
                boolean z10 = I ? pdb.h.a : false;
                if (I) {
                    z2 = odb.a;
                }
                n = oag.n(z3, z4, z5, z6, z7, z8, pdb.f, z9, z10, z2);
            } else {
                n = oag.n(pdb.b, pdb.e, pdb.a, pdb.d, pdb.c, true, pdb.f, false, false, false);
            }
            j47.T(this.a, ((w9a) u()).b(), (vx3) null, new wdb(this, j, n, (Continuation) null), 2);
        }
    }

    public final e52 s() {
        return (e52) ((jz2) this.Y).m(this.b).a.getValue();
    }

    public final uj3 t() {
        return (uj3) this.Z.c(this.c).a.getValue();
    }

    public final kke u() {
        return (kke) this.t0.getValue();
    }

    public final void v(long j, boolean z) {
        pdb pdb;
        odb odb;
        gqe gqe;
        int i = (j > ((long) sea.D) ? 1 : (j == ((long) sea.D) ? 0 : -1));
        boolean z2 = false;
        s35 s35 = this.C0;
        String str = null;
        if (i == 0) {
            e52 s = s();
            eqe eqe = (s == null || !s.I()) ? new eqe(vea.T0) : new eqe(vea.T0);
            e52 s2 = s();
            String str2 = "";
            if (s2 == null || !s2.I()) {
                int i2 = vea.R0;
                e52 s3 = s();
                if (s3 != null) {
                    str = s3.q();
                }
                if (str != null) {
                    str2 = str;
                }
                gqe = new gqe(i2, ys.m0(new Object[]{str2}));
            } else {
                int i3 = vea.q1;
                uj3 t = t();
                String d = t != null ? t.d() : null;
                if (d == null) {
                    d = str2;
                }
                e52 s4 = s();
                if (s4 != null) {
                    str = s4.q();
                }
                if (str != null) {
                    str2 = str;
                }
                gqe = new gqe(i3, ys.m0(new Object[]{d, str2}));
            }
            pnf.o(s35, new jdb(eqe, gqe, y53.M(new mg3(sea.H, new eqe(vea.Q0), 4, false), new mg3(sea.G, new eqe(vea.P0), 2, false))));
        } else if (j == ((long) sea.M)) {
            boolean z3 = this.X;
            q0e q0e = this.y0;
            if (z3 && (pdb = (pdb) q0e.getValue()) != null && (odb = pdb.l) != null && odb.a) {
                z2 = true;
            }
            pdb pdb2 = (pdb) q0e.getValue();
            if (pdb2 != null && !pdb2.e && !z2) {
                pnf.o(s35, new kdb(new eqe(vea.O0), (Integer) null));
            }
        } else if (z) {
            w();
        }
    }

    public final void w() {
        if (this.X) {
            vxd S = j47.S(this.a, ((w9a) u()).a(), vx3.b, new ydb(this, (Continuation) null));
            this.E0.o1(this, G0[1], S);
        }
    }

    public final void x() {
        if (!tpa.f(this.z0.getValue(), this.y0.getValue())) {
            pnf.o(this.C0, new jdb(new eqe(vea.U), (jqe) null, y53.M(new mg3(sea.d0, new eqe(vea.V), 3, false), new mg3(sea.c0, new eqe(vea.T), 2, false))));
            return;
        }
        pnf.o(this.B0, g43.b);
    }
}
