package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: ck2  reason: default package */
public final class ck2 extends pnf implements ad8 {
    public static final /* synthetic */ bc7[] d1;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public t29 F0;
    public final Set G0;
    public final Set H0;
    public final AtomicReference I0;
    public final AtomicReference J0;
    public final AtomicReference K0;
    public final AtomicReference L0;
    public final AtomicLong M0;
    public final s35 N0;
    public final s35 O0;
    public final q0e P0;
    public final w7c Q0;
    public final q0e R0;
    public final w7c S0;
    public final q0e T0;
    public final w7c U0;
    public final q0e V0;
    public final w7c W0;
    public final boolean X;
    public final kld X0;
    public final boolean Y;
    public final v7c Y0;
    public final Context Z;
    public final w4d Z0;
    public final w4d a1;
    public final long b;
    public final w4d b1;
    public final String c;
    public final w4d c1;
    public final long o;
    public final r79 s0;
    public final kke t0;
    public final pk u0;
    public final v19 v0;
    public final String w0 = ck2.class.getName();
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<ck2> cls = ck2.class;
        d1 = new bc7[]{new oi9(cls, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;")};
    }

    public ck2(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, long j, String str, long j2, boolean z, boolean z2, Context context, r79 r79, kke kke, pk pkVar, v19 v19) {
        kke kke2 = kke;
        v19 v192 = v19;
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = z;
        this.Y = z2;
        this.Z = context;
        this.s0 = r79;
        this.t0 = kke2;
        this.u0 = pkVar;
        this.v0 = v192;
        this.x0 = je7;
        this.y0 = je73;
        this.z0 = je74;
        this.A0 = je75;
        this.B0 = je76;
        this.C0 = je77;
        this.D0 = je78;
        this.E0 = je79;
        b10 b10 = b10.PHOTO;
        b10 b102 = b10.VIDEO;
        this.G0 = bcd.a0("PHOTO", "VIDEO");
        this.H0 = bcd.a0(b10, b102);
        this.I0 = new AtomicReference((Object) null);
        this.J0 = new AtomicReference(new bj2(false, false));
        this.K0 = new AtomicReference((Object) null);
        this.L0 = new AtomicReference((Object) null);
        this.M0 = new AtomicLong();
        this.N0 = new s35(0);
        this.O0 = new s35(0);
        q0e a = r0e.a(cj2.c);
        this.P0 = a;
        this.Q0 = new w7c(a);
        q0e a2 = r0e.a(new aj2("", "", "", new zi2((n26) null, false, false, 7)));
        this.R0 = a2;
        this.S0 = new w7c(a2);
        q0e a3 = r0e.a(new dj2((jqe) null));
        this.T0 = a3;
        this.U0 = new w7c(a3);
        q0e a4 = r0e.a(new ej2((qb8) null, 3));
        this.V0 = a4;
        this.W0 = new w7c(a4);
        kld a5 = lld.a(1, 0, 2);
        this.X0 = a5;
        this.Y0 = new v7c(a5);
        this.Z0 = mqd.D();
        this.a1 = mqd.D();
        this.b1 = mqd.D();
        this.c1 = mqd.D();
        w9a w9a = (w9a) kke2;
        je7 je710 = je72;
        pnf.n(this, w9a.b(), (vx3) null, new xi2(this, je72, (Continuation) null), 2);
        od2.L(od2.F(new zn5(v192.e, new yi2(this, (Continuation) null), 5), w9a.b()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.ck2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.fj2
            if (r0 == 0) goto L_0x0016
            r0 = r9
            fj2 r0 = (defpackage.fj2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            fj2 r0 = new fj2
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            defpackage.od2.a0(r9)
            goto L_0x0089
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            ck2 r7 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x007c
        L_0x003e:
            defpackage.od2.a0(r9)
            q0e r9 = r7.P0
            java.lang.Object r9 = r9.getValue()
            cj2 r9 = (defpackage.cj2) r9
            java.util.List r9 = r9.a
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0089
            int r2 = r8.size()
            int r9 = r9.size()
            if (r2 == r9) goto L_0x0089
            java.lang.String r9 = r7.w0
            java.lang.String r2 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.hm9.m(r9, r2, new java.lang.Object[0])
            java.lang.Object r8 = defpackage.x53.i0(r8)
            sb8 r8 = (defpackage.sb8) r8
            if (r8 == 0) goto L_0x007f
            long r8 = r8.j()
            r0.o = r7
            r0.Z = r5
            r79 r2 = r7.s0
            java.lang.Object r9 = r2.a(r8, r0)
            if (r9 != r1) goto L_0x007c
            goto L_0x0095
        L_0x007c:
            cu8 r9 = (defpackage.cu8) r9
            goto L_0x0080
        L_0x007f:
            r9 = r6
        L_0x0080:
            if (r9 != 0) goto L_0x008b
            java.lang.String r7 = r7.w0
            java.lang.String r8 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.hm9.m0(r7, r8, new java.lang.Object[0])
        L_0x0089:
            r1 = r3
            goto L_0x0095
        L_0x008b:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r7 = r7.F(r9, r0)
            if (r7 != r1) goto L_0x0089
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.q(ck2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[EDGE_INSN: B:57:0x00d4->B:40:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.ck2 r6, defpackage.yu8 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.hj2
            if (r0 == 0) goto L_0x0016
            r0 = r8
            hj2 r0 = (defpackage.hj2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            hj2 r0 = new hj2
            r0.<init>(r6, r8)
        L_0x001b:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            ck2 r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            defpackage.od2.a0(r8)
            boolean r8 = r7 instanceof defpackage.su8
            r79 r2 = r6.s0
            if (r8 == 0) goto L_0x009d
            su8 r7 = (defpackage.su8) r7
            java.util.Collection r7 = r7.a
            r0.o = r6
            r0.Z = r4
            java.lang.Object r8 = r2.b(r7, r0)
            if (r8 != r1) goto L_0x004f
            goto L_0x0124
        L_0x004f:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x005d
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x005d
            goto L_0x00d4
        L_0x005d:
            java.util.Iterator r7 = r8.iterator()
        L_0x0061:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r7.next()
            cu8 r8 = (defpackage.cu8) r8
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x0061
            g20 r0 = defpackage.g20.c
            boolean r0 = r8.m(r0)
            if (r0 != 0) goto L_0x0083
            g20 r0 = defpackage.g20.o
            boolean r8 = r8.m(r0)
            if (r8 == 0) goto L_0x0061
        L_0x0083:
            java.lang.String r7 = r6.w0
            java.lang.String r8 = "Media viewer. On add new msg with media"
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            iy2 r7 = r6.w()
            we1 r8 = new we1
            r0 = 18
            r8.<init>(r0)
            jz2 r7 = (defpackage.jz2) r7
            long r0 = r6.b
            r7.f(r0, r8)
            goto L_0x00d4
        L_0x009d:
            boolean r8 = r7 instanceof defpackage.vu8
            if (r8 == 0) goto L_0x00d4
            java.util.concurrent.atomic.AtomicReference r8 = r6.K0
            java.lang.Object r8 = r8.get()
            java.lang.String r8 = (java.lang.String) r8
            q0e r0 = r6.P0
            java.lang.Object r0 = r0.getValue()
            cj2 r0 = (defpackage.cj2) r0
            java.util.List r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r1 = r0.next()
            r4 = r1
            sb8 r4 = (defpackage.sb8) r4
            java.lang.String r4 = r4.x()
            boolean r4 = defpackage.tpa.f(r4, r8)
            if (r4 == 0) goto L_0x00b7
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            sb8 r1 = (defpackage.sb8) r1
            if (r1 != 0) goto L_0x00d6
        L_0x00d4:
            r1 = r3
            goto L_0x0124
        L_0x00d6:
            vu8 r7 = (defpackage.vu8) r7
            java.util.Collection r7 = r7.a
            long r4 = r1.j()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x010c
            i35 r7 = new i35
            boolean r8 = r1 instanceof defpackage.jb8
            if (r8 == 0) goto L_0x00f2
            int r8 = defpackage.l8a.a
            goto L_0x00f8
        L_0x00f2:
            boolean r8 = r1 instanceof defpackage.qb8
            if (r8 == 0) goto L_0x0106
            int r8 = defpackage.l8a.b
        L_0x00f8:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            r7.<init>(r0)
            s35 r6 = r6.N0
            defpackage.pnf.o(r6, r7)
            goto L_0x00d4
        L_0x0106:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x010c:
            t29 r6 = r6.F0
            if (r6 == 0) goto L_0x00d4
            long r7 = r1.j()
            vlc r0 = r2.a
            t19 r0 = r0.d()
            long r7 = r0.k(r7)
            bx r6 = (defpackage.bx) r6
            r6.r(r7)
            goto L_0x00d4
        L_0x0124:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.r(ck2, yu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.ck2 r10, int r11, java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.lj2
            if (r0 == 0) goto L_0x0016
            r0 = r13
            lj2 r0 = (defpackage.lj2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            lj2 r0 = new lj2
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0038
            if (r2 != r5) goto L_0x0030
            defpackage.od2.a0(r13)
            goto L_0x00ca
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            sb8 r10 = r0.X
            ck2 r11 = r0.o
            defpackage.od2.a0(r13)
            r13 = r10
            r10 = r11
            goto L_0x00bc
        L_0x0043:
            defpackage.od2.a0(r13)
            java.util.concurrent.atomic.AtomicReference r13 = r10.K0
            java.lang.Object r13 = r13.get()
            java.lang.String r13 = (java.lang.String) r13
            q0e r2 = r10.P0
            r6 = -1
            if (r13 == 0) goto L_0x007a
            java.lang.Object r7 = r2.getValue()
            cj2 r7 = (defpackage.cj2) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x0060:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007a
            java.lang.Object r9 = r7.next()
            sb8 r9 = (defpackage.sb8) r9
            java.lang.String r9 = r9.x()
            boolean r9 = defpackage.tpa.f(r9, r13)
            if (r9 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x0060
        L_0x007a:
            r8 = r6
        L_0x007b:
            if (r11 < 0) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r8 < 0) goto L_0x009c
            java.lang.Object r11 = r2.getValue()
            cj2 r11 = (defpackage.cj2) r11
            java.util.List r11 = r11.a
            int r11 = r11.size()
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x009a
            int r13 = r12.size()
            int r11 = r11 - r8
            int r11 = r13 - r11
            goto L_0x009d
        L_0x009a:
            r11 = r8
            goto L_0x009d
        L_0x009c:
            r11 = r6
        L_0x009d:
            if (r11 < 0) goto L_0x00ca
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x00ca
            java.lang.Object r13 = r12.get(r11)
            sb8 r13 = (defpackage.sb8) r13
            int r12 = r12.size()
            r0.o = r10
            r0.X = r13
            r0.s0 = r4
            java.lang.Object r11 = r10.D(r11, r13, r12, r0)
            if (r11 != r1) goto L_0x00bc
            goto L_0x00cb
        L_0x00bc:
            r11 = 0
            r0.o = r11
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r10 = r10.C(r13, r0)
            if (r10 != r1) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r3
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.s(ck2, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: cu8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.ck2 r10, defpackage.cu8 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.nj2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            nj2 r0 = (defpackage.nj2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            nj2 r0 = new nj2
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x004e
            if (r2 == r6) goto L_0x0047
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            defpackage.od2.a0(r12)
            goto L_0x00bc
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            java.lang.Object r10 = r0.X
            sb8 r10 = (defpackage.sb8) r10
            ck2 r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00af
        L_0x0047:
            ck2 r10 = r0.o
            defpackage.od2.a0(r12)
        L_0x004c:
            r11 = r10
            goto L_0x0086
        L_0x004e:
            java.lang.Object r10 = r0.X
            r11 = r10
            cu8 r11 = (defpackage.cu8) r11
            ck2 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x006f
        L_0x0059:
            defpackage.od2.a0(r12)
            iy2 r12 = r10.w()
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            long r8 = r10.b
            java.lang.Object r12 = r12.d(r8, r0)
            if (r12 != r1) goto L_0x006f
            goto L_0x00be
        L_0x006f:
            e52 r12 = (defpackage.e52) r12
            je7 r2 = r10.y0
            java.lang.Object r2 = r2.getValue()
            u9a r2 = (defpackage.u9a) r2
            r0.o = r10
            r0.X = r7
            r0.s0 = r6
            java.lang.Object r12 = r2.j(r12, r11, r0)
            if (r12 != r1) goto L_0x004c
            goto L_0x00be
        L_0x0086:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            java.util.List r10 = defpackage.tfg.B(r12)
            q0e r12 = r11.P0
            cj2 r2 = new cj2
            r5 = 0
            r2.<init>(r10, r6, r5)
            r12.m(r7, r2)
            java.lang.Object r12 = defpackage.x53.g0(r10)
            sb8 r12 = (defpackage.sb8) r12
            int r10 = r10.size()
            r0.o = r11
            r0.X = r12
            r0.s0 = r4
            java.lang.Object r10 = r11.D(r5, r12, r10, r0)
            if (r10 != r1) goto L_0x00ae
            goto L_0x00be
        L_0x00ae:
            r10 = r12
        L_0x00af:
            r0.o = r7
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r10 = r11.C(r10, r0)
            if (r10 != r1) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            e5f r1 = defpackage.e5f.a
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.t(ck2, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean u(ck2 ck2, zc8 zc8) {
        if (zc8 != null) {
            if (zc8.d == ck2.b) {
                Set<b10> set = zc8.c;
                ArrayList arrayList = new ArrayList(z53.S(set, 10));
                for (b10 obj : set) {
                    arrayList.add(obj.toString());
                }
                if (x53.B0(arrayList).containsAll(ck2.G0)) {
                    return true;
                }
            }
        } else {
            ck2.getClass();
        }
        return false;
    }

    public final void A(long j, String str) {
        sb8 x = x();
        if (x != null && x.j() == j && tpa.f(x.x(), str)) {
            pnf.o(this.N0, new j35(4, false));
        }
    }

    public final void B(long j, String str) {
        sb8 x = x();
        if (x != null && x.j() == j && tpa.f(x.x(), str)) {
            pnf.o(this.N0, new j35(1, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(defpackage.sb8 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.mj2
            if (r0 == 0) goto L_0x0013
            r0 = r13
            mj2 r0 = (defpackage.mj2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            mj2 r0 = new mj2
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            cu8 r11 = r0.X
            ck2 r12 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x00a2
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            cu8 r11 = r0.X
            ck2 r12 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x0080
        L_0x0043:
            ck2 r11 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x005d
        L_0x0049:
            defpackage.od2.a0(r13)
            r79 r13 = r11.s0
            long r7 = r12.j()
            r0.o = r11
            r0.s0 = r6
            java.lang.Object r13 = r13.a(r7, r0)
            if (r13 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r12 = r13
            cu8 r12 = (defpackage.cu8) r12
            if (r12 != 0) goto L_0x0065
            e5f r11 = defpackage.e5f.a
            return r11
        L_0x0065:
            int r13 = r12.V0
            r2 = 4
            if (r13 != r2) goto L_0x0088
            iy2 r13 = r11.w()
            long r6 = r12.t0
            r0.o = r11
            r0.X = r12
            r0.s0 = r5
            java.lang.Object r13 = r13.d(r6, r0)
            if (r13 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x0080:
            e52 r13 = (defpackage.e52) r13
            r13.k0()
            java.lang.CharSequence r13 = r13.u0
            goto L_0x00b0
        L_0x0088:
            je7 r13 = r11.z0
            java.lang.Object r13 = r13.getValue()
            ds3 r13 = (defpackage.ds3) r13
            long r5 = r12.Y
            r0.o = r11
            r0.X = r12
            r0.s0 = r3
            java.lang.Comparable r13 = r13.b(r5, r0)
            if (r13 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x00a2:
            uj3 r13 = (defpackage.uj3) r13
            if (r13 == 0) goto L_0x00ab
            java.lang.String r13 = r13.d()
            goto L_0x00ac
        L_0x00ab:
            r13 = r4
        L_0x00ac:
            if (r13 != 0) goto L_0x00b0
            java.lang.String r13 = ""
        L_0x00b0:
            q0e r0 = r12.R0
            aj2 r1 = new aj2
            je7 r2 = r12.A0
            java.lang.Object r2 = r2.getValue()
            ida r2 = (defpackage.ida) r2
            long r5 = r11.o
            t33 r7 = r2.c
            long r7 = r7.n()
            b11 r7 = defpackage.ay7.o(r5, r7)
            int r7 = r7.b
            int r7 = defpackage.au1.s(r7)
            switch(r7) {
                case 0: goto L_0x0143;
                case 1: goto L_0x0143;
                case 2: goto L_0x0143;
                case 3: goto L_0x012a;
                case 4: goto L_0x0105;
                case 5: goto L_0x0105;
                case 6: goto L_0x0105;
                case 7: goto L_0x00e0;
                case 8: goto L_0x0105;
                case 9: goto L_0x00d7;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            java.lang.IncompatibleClassChangeError r11 = new java.lang.IncompatibleClassChangeError
            r11.<init>()
            throw r11
        L_0x00d7:
            android.content.Context r2 = r2.a
            int r5 = defpackage.c2c.presence_unknown_date
            java.lang.String r2 = r2.getString(r5)
            goto L_0x014f
        L_0x00e0:
            t33 r2 = r2.c
            java.util.Locale r2 = r2.v()
            java.lang.String r7 = "dd MMM yyyy"
            monitor-enter(r7)
            java.text.SimpleDateFormat r8 = defpackage.ay7.r     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x00f6
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = "dd MMM yyyy"
            r8.<init>(r9, r2)     // Catch:{ all -> 0x0102 }
            defpackage.ay7.r = r8     // Catch:{ all -> 0x0102 }
        L_0x00f6:
            java.text.SimpleDateFormat r2 = defpackage.ay7.r     // Catch:{ all -> 0x0102 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = r2.format(r5)     // Catch:{ all -> 0x0102 }
            monitor-exit(r7)     // Catch:{ all -> 0x0102 }
            goto L_0x014f
        L_0x0102:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0102 }
            throw r11
        L_0x0105:
            t33 r2 = r2.c
            java.util.Locale r2 = r2.v()
            java.lang.String r7 = "dd MMM"
            monitor-enter(r7)
            java.text.SimpleDateFormat r8 = defpackage.ay7.q     // Catch:{ all -> 0x0127 }
            if (r8 != 0) goto L_0x011b
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0127 }
            java.lang.String r9 = "dd MMM"
            r8.<init>(r9, r2)     // Catch:{ all -> 0x0127 }
            defpackage.ay7.q = r8     // Catch:{ all -> 0x0127 }
        L_0x011b:
            java.text.SimpleDateFormat r2 = defpackage.ay7.q     // Catch:{ all -> 0x0127 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r2.format(r5)     // Catch:{ all -> 0x0127 }
            monitor-exit(r7)     // Catch:{ all -> 0x0127 }
            goto L_0x014f
        L_0x0127:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0127 }
            throw r11
        L_0x012a:
            android.content.Context r7 = r2.a
            int r8 = defpackage.c2c.tt_dates_yesterday_format
            t33 r9 = r2.c
            java.util.Locale r9 = r9.v()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.ay7.k(r2, r5, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r7.getString(r8, r2)
            goto L_0x014f
        L_0x0143:
            t33 r7 = r2.c
            java.util.Locale r7 = r7.v()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.ay7.k(r2, r5, r7)
        L_0x014f:
            je7 r5 = r12.A0
            java.lang.Object r5 = r5.getValue()
            ida r5 = (defpackage.ida) r5
            java.lang.String r6 = r11.s0
            java.util.List r11 = r11.R0
            kqe r7 = defpackage.i4f.G
            du4 r8 = defpackage.du4.b
            long r7 = r7.g(r8)
            float r7 = defpackage.ck4.e(r7)
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = (int) r7
            java.lang.CharSequence r11 = r5.j(r6, r11, r7)
            if (r11 != 0) goto L_0x017b
            java.lang.String r11 = ""
        L_0x017b:
            zi2 r5 = new zi2
            je7 r12 = r12.E0
            java.lang.Object r12 = r12.getValue()
            qe5 r12 = (defpackage.qe5) r12
            se5 r12 = (defpackage.se5) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f81mediaviewervideocollageenabled
            r7 = 0
            boolean r12 = r12.n(r6, r7)
            r5.<init>(r4, r7, r12, r3)
            r1.<init>(r13, r2, r11, r5)
            r0.m(r4, r1)
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.C(sb8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(int r11, defpackage.sb8 r12, int r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.oj2
            if (r0 == 0) goto L_0x0013
            r0 = r14
            oj2 r0 = (defpackage.oj2) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v0 = r1
            goto L_0x0018
        L_0x0013:
            oj2 r0 = new oj2
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.t0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.v0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            int r13 = r0.s0
            int r11 = r0.Z
            bj2 r10 = r0.Y
            de2 r12 = r0.X
            ck2 r0 = r0.o
            defpackage.od2.a0(r14)
            goto L_0x00b1
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            defpackage.od2.a0(r14)
            java.lang.String r14 = r10.w0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Media viewer. Prepare toolbar state by position:"
            r2.<init>(r6)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r14, r2, new java.lang.Object[0])
            boolean r14 = r10.Y
            if (r14 == 0) goto L_0x007f
            boolean r11 = r12 instanceof defpackage.jb8
            if (r11 == 0) goto L_0x0063
            int r11 = defpackage.l8a.i
            eqe r12 = new eqe
            r12.<init>(r11)
            goto L_0x006e
        L_0x0063:
            boolean r11 = r12 instanceof defpackage.qb8
            if (r11 == 0) goto L_0x0079
            int r11 = defpackage.l8a.j
            eqe r12 = new eqe
            r12.<init>(r11)
        L_0x006e:
            q0e r10 = r10.T0
            dj2 r11 = new dj2
            r11.<init>(r12)
            r10.m(r5, r11)
            return r3
        L_0x0079:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x007f:
            java.util.concurrent.atomic.AtomicReference r12 = r10.L0
            java.lang.Object r12 = r12.get()
            de2 r12 = (defpackage.de2) r12
            java.util.concurrent.atomic.AtomicReference r14 = r10.J0
            java.lang.Object r14 = r14.get()
            bj2 r14 = (defpackage.bj2) r14
            if (r12 == 0) goto L_0x0094
            int r0 = r12.X
            goto L_0x00c2
        L_0x0094:
            iy2 r2 = r10.w()
            long r6 = r10.b
            r0.o = r10
            r0.X = r12
            r0.Y = r14
            r0.Z = r11
            r0.s0 = r13
            r0.v0 = r4
            java.lang.Object r0 = r2.d(r6, r0)
            if (r0 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r9 = r0
            r0 = r10
            r10 = r14
            r14 = r9
        L_0x00b1:
            e52 r14 = (defpackage.e52) r14
            k92 r14 = r14.b
            x82 r14 = r14.r
            if (r14 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            x82 r14 = defpackage.x82.g
        L_0x00bc:
            int r14 = r14.b
            r9 = r14
            r14 = r10
            r10 = r0
            r0 = r9
        L_0x00c2:
            boolean r14 = r14.b
            java.lang.String r1 = ", pos:"
            if (r14 != 0) goto L_0x011a
            java.lang.String r14 = r10.w0
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x00cf
            goto L_0x00ee
        L_0x00cf:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x00ee
            us7 r6 = defpackage.us7.X
            if (r12 == 0) goto L_0x00db
            r12 = r4
            goto L_0x00dc
        L_0x00db:
            r12 = 0
        L_0x00dc:
            java.lang.String r7 = "Media viewer. Prepare count for toolbar by server, total:"
            java.lang.String r8 = ", fromResp:"
            java.lang.StringBuilder r1 = defpackage.wg0.j(r7, r0, r1, r11, r8)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r2.d(r6, r14, r12, r5)
        L_0x00ee:
            int r12 = r0 - r13
            boolean r14 = r10.X
            if (r14 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r11 = r11 + 1
            int r11 = r13 - r11
        L_0x00f9:
            int r13 = r13 - r11
            int r13 = r13 + r12
            if (r13 >= r4) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            if (r13 <= r0) goto L_0x0102
            r4 = r0
            goto L_0x0103
        L_0x0102:
            r4 = r13
        L_0x0103:
            android.content.Context r11 = r10.Z
            int r12 = defpackage.l8a.h
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r4)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14}
            java.lang.String r11 = r11.getString(r12, r13)
            goto L_0x015b
        L_0x011a:
            java.lang.String r12 = r10.w0
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x0121
            goto L_0x013b
        L_0x0121:
            boolean r2 = r14.c()
            if (r2 == 0) goto L_0x013b
            us7 r2 = defpackage.us7.X
            java.lang.String r4 = "Media viewer. Prepare count for toolbar by local, s:"
            java.lang.String r6 = ", total:"
            java.lang.StringBuilder r1 = defpackage.wg0.j(r4, r13, r1, r11, r6)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r14.d(r2, r12, r1, r5)
        L_0x013b:
            boolean r12 = r10.X
            if (r12 == 0) goto L_0x0140
            goto L_0x0144
        L_0x0140:
            int r11 = r11 + 1
            int r11 = r13 - r11
        L_0x0144:
            android.content.Context r12 = r10.Z
            int r14 = defpackage.l8a.h
            int r13 = r13 - r11
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r13}
            java.lang.String r11 = r12.getString(r14, r11)
        L_0x015b:
            dj2 r12 = new dj2
            iqe r13 = new iqe
            r13.<init>(r11)
            r12.<init>(r13)
            q0e r10 = r10.T0
            r10.m(r5, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.D(int, sb8, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(int i) {
        vxd n = pnf.n(this, (lx3) null, vx3.b, new pj2(this, i, (Continuation) null), 1);
        this.b1.o1(this, d1[2], n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[Catch:{ all -> 0x004a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(defpackage.cu8 r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.qj2
            if (r2 == 0) goto L_0x0018
            r2 = r1
            qj2 r2 = (defpackage.qj2) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.s0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            qj2 r2 = new qj2
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r8.s0
            e5f r9 = defpackage.e5f.a
            r10 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x004d
            if (r3 == r5) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r0 = r8.X
            ck2 r2 = r8.o
            defpackage.od2.a0(r1)
            goto L_0x0124
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            ck2 r3 = r8.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x004a }
            goto L_0x00c6
        L_0x004a:
            r0 = move-exception
            goto L_0x00cb
        L_0x004d:
            java.lang.Object r0 = r8.X
            cu8 r0 = (defpackage.cu8) r0
            ck2 r3 = r8.o
            defpackage.od2.a0(r1)
            goto L_0x0074
        L_0x0057:
            defpackage.od2.a0(r1)
            iy2 r1 = r20.w()
            long r11 = r0.b
            r8.o = r0
            r3 = r21
            r8.X = r3
            r8.s0 = r6
            java.lang.Object r1 = r1.d(r11, r8)
            if (r1 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r19 = r3
            r3 = r0
            r0 = r19
        L_0x0074:
            e52 r1 = (defpackage.e52) r1
            long r11 = r0.c
            r13 = 0
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0132
            k92 r7 = r1.b
            long r11 = r7.a
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0088
            goto L_0x0132
        L_0x0088:
            java.lang.String r7 = r3.w0
            java.lang.String r11 = "Media viewer. Start request media total count."
            defpackage.hm9.m(r7, r11, new java.lang.Object[0])
            au r7 = new au
            k92 r1 = r1.b
            long r13 = r1.a
            long r0 = r0.c
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r0)
            java.util.Set r0 = r3.H0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r6)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r6)
            r12 = r7
            r16 = r0
            r17 = r1
            r18 = r11
            r12.<init>((long) r13, (java.lang.Long) r15, (java.util.Set) r16, (java.lang.Integer) r17, (java.lang.Integer) r18)
            rj2 r0 = new rj2     // Catch:{ all -> 0x004a }
            r0.<init>(r3, r7, r10)     // Catch:{ all -> 0x004a }
            r8.o = r3     // Catch:{ all -> 0x004a }
            r8.X = r10     // Catch:{ all -> 0x004a }
            r8.s0 = r5     // Catch:{ all -> 0x004a }
            r11 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = defpackage.fp3.I(r11, r0, r8)     // Catch:{ all -> 0x004a }
            if (r1 != r2) goto L_0x00c6
            return r2
        L_0x00c6:
            de2 r1 = (defpackage.de2) r1     // Catch:{ all -> 0x004a }
        L_0x00c8:
            r0 = r1
            r1 = r3
            goto L_0x00d1
        L_0x00cb:
            njc r1 = new njc
            r1.<init>(r0)
            goto L_0x00c8
        L_0x00d1:
            boolean r3 = r0 instanceof defpackage.njc
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            r3 = r0
            de2 r3 = (defpackage.de2) r3
            java.lang.String r5 = r1.w0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x00e0
            goto L_0x00f9
        L_0x00e0:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00f9
            us7 r7 = defpackage.us7.X
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Media viewer. Success request media total count: "
            r11.<init>(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r6.d(r7, r5, r11, r10)
        L_0x00f9:
            if (r3 == 0) goto L_0x0125
            java.util.concurrent.atomic.AtomicReference r5 = r1.L0
            iz0 r6 = new iz0
            r7 = 3
            r6.<init>(r7, r3)
            r5.updateAndGet(r6)
            iy2 r5 = r1.w()
            long r6 = r1.b
            java.util.Set r11 = r1.H0
            int r12 = r3.X
            r8.o = r1
            r8.X = r0
            r8.s0 = r4
            r3 = r5
            jz2 r3 = (defpackage.jz2) r3
            r4 = r6
            r6 = r11
            r7 = r12
            java.lang.Object r3 = r3.v(r4, r6, r7, r8)
            if (r3 != r2) goto L_0x0123
            return r2
        L_0x0123:
            r2 = r1
        L_0x0124:
            r1 = r2
        L_0x0125:
            java.lang.Throwable r0 = defpackage.pjc.a(r0)
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r1.w0
            java.lang.String r1 = "Media viewer. Fail request media total count."
            defpackage.hm9.p(r0, r1, r10)
        L_0x0132:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.F(cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zc8 d() {
        zc8 zc8 = (zc8) this.I0.get();
        return zc8 == null ? new zc8(0, 0, this.H0, this.b) : zc8;
    }

    public final void p() {
        t29 t29 = this.F0;
        if (t29 != null) {
            ((bx) t29).h();
        }
        v19 v19 = this.v0;
        v19.a.f(v19);
    }

    public final void v(long j, String str) {
        String str2 = this.w0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str2, "Media viewer. Call fetch video msg:" + j + ", attach:" + str, (Throwable) null);
        }
        this.Z0.o1(this, d1[0], j47.S(this.a, ((w9a) this.t0).b(), vx3.b, new gj2(this, j, str, (Continuation) null)));
    }

    public final iy2 w() {
        return (iy2) this.x0.getValue();
    }

    public final sb8 x() {
        Object obj;
        String str = (String) this.K0.get();
        Iterator it = ((cj2) this.P0.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (tpa.f(((sb8) obj).x(), str)) {
                break;
            }
        }
        return (sb8) obj;
    }

    public final sb8 y(long j, String str) {
        Object obj;
        Iterator it = ((cj2) this.Q0.a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            sb8 sb8 = (sb8) obj;
            if (sb8.j() == j && str.equals(sb8.x())) {
                break;
            }
        }
        return (sb8) obj;
    }

    public final void z(long j, String str) {
        sb8 x = x();
        if (x != null && x.j() == j && tpa.f(x.x(), str)) {
            pnf.o(this.N0, new j35(5, false));
        }
    }
}
