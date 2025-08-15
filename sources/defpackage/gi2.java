package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: gi2  reason: default package */
public final class gi2 extends pnf implements dv, ad8 {
    public static final /* synthetic */ bc7[] R0;
    public final je7 A0;
    public final AtomicReference B0;
    public final je7 C0;
    public final w4d D0;
    public final w4d E0;
    public final w4d F0;
    public final khe G0;
    public final khe H0;
    public final q0e I0;
    public final q0e J0;
    public final s35 K0;
    public final khe L0;
    public final khe M0;
    public final gd1 N0;
    public final q0e O0;
    public final w7c P0;
    public final je7 Q0;
    public final au8 X;
    public final pk Y;
    public final av0 Z;
    public final long b;
    public final ih2 c;
    public final iy2 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final khe w0 = new khe(new m52(12));
    public final je7 x0;
    public final z7d y0;
    public final se5 z0;

    static {
        Class<gi2> cls = gi2.class;
        R0 = new bc7[]{new oi9(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;")};
    }

    public gi2(long j, ih2 ih2, jf2 jf2) {
        ih2 ih22 = ih2;
        xcb xcb = xcb.a;
        khe d = xcb.getAccessor().d(tp7.class);
        khe d2 = xcb.getAccessor().d(dv4.class);
        khe d3 = xcb.getAccessor().d(hu8.class);
        khe d4 = xcb.getAccessor().d(pf5.class);
        je7 f = xcb.f();
        khe d5 = xcb.getAccessor().d(o20.class);
        khe d6 = xcb.getAccessor().d(z3b.class);
        ge2 ge2 = (ge2) xcb.getAccessor().d(ge2.class).getValue();
        p82 p82 = (p82) xcb.getAccessor().c(p82.class);
        m7b m7b = (m7b) xcb.getAccessor().c(m7b.class);
        ns8 ns8 = (ns8) xcb.getAccessor().c(ns8.class);
        je7 je7 = f;
        fme fme = (fme) xcb.getAccessor().c(fme.class);
        hle hle = (hle) xcb.getAccessor().c(hle.class);
        o45 o45 = (o45) xcb.getAccessor().d(o45.class).getValue();
        av0 av0 = (av0) xcb.getAccessor().c(av0.class);
        khe d7 = xcb.getAccessor().d(wha.class);
        this.b = j;
        this.c = ih22;
        this.o = (iy2) ((khe) xcb.c()).getValue();
        this.X = (au8) xcb.getAccessor().c(au8.class);
        this.Y = (pk) ((khe) xcb.b()).getValue();
        this.Z = av0;
        this.s0 = d;
        this.t0 = d2;
        this.u0 = d3;
        this.v0 = d4;
        this.x0 = d7;
        p7b p7b = (p7b) m7b;
        this.y0 = p7b.b;
        this.z0 = p7b.e;
        this.A0 = d6;
        this.B0 = new AtomicReference((Object) null);
        this.C0 = je7;
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        this.G0 = new khe(new m52(13));
        this.H0 = new khe(new x2((Object) ns8, 23, (Object) m7b));
        this.I0 = r0e.a(new di9());
        this.J0 = r0e.a(new di9());
        this.K0 = new s35(0);
        av0 av02 = av0;
        p61 p61 = r0;
        p61 p612 = new p61(this, p82, ge2, m7b, fme, hle, o45, 1);
        this.L0 = new khe(p61);
        this.M0 = new khe(new md1(11, this));
        this.N0 = new gd1(1, this);
        q0e a = r0e.a(lh2.d);
        this.O0 = a;
        this.P0 = new w7c(a);
        this.Q0 = tu0.r(3, new bp(m7b, ge2, (je7) d5, (je7) d6));
        e52 v = v();
        es8 es8 = v != null ? v.c : null;
        if (es8 != null) {
            av02.d(this);
            if (ih22 == ih2.b) {
                z3b z3b = (z3b) d6.getValue();
                ((uh9) z3b.a).e(z3b.g);
                z3b.b();
            }
            tf2 x = x();
            if (x != null) {
                x.X.a(x.c.b(new xu(x, es8, 0)));
                x.Z = this;
            }
            od2.L(od2.F(new zn5(new ac(new t03(new w7c(p82.J(j)), 11), 11, this), new kh2(this, (Continuation) null), 5), ((w9a) w()).a()), this.a);
            od2.L(od2.F(new zn5(new v7c(jf2.b), new vw(2, this, gi2.class, "handleChatMediaEvent", "handleChatMediaEvent(Lone/me/profile/screens/media/ChatMediaEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 5), ((w9a) w()).a()), this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r12 = (defpackage.es8) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r12 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r10 = r10.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r10 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r10.X.a(r10.c.b(new defpackage.xu(r10, r12, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (((defpackage.di9) r10.I0.getValue()).b(((defpackage.cf2) r11).a) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r11 = ((defpackage.w9a) r10.w()).c();
        r12 = new defpackage.th2(r10, (kotlin.coroutines.Continuation) null);
        r0.o = null;
        r0.X = null;
        r0.s0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        if (defpackage.j47.t0(r11, r12, r0) != r1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        if (((defpackage.di9) r10.I0.getValue()).b(((defpackage.df2) r11).a) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0105, code lost:
        r11 = ((defpackage.w9a) r10.w()).c();
        r12 = new defpackage.uh2(r10, (kotlin.coroutines.Continuation) null);
        r0.o = null;
        r0.X = null;
        r0.s0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        if (defpackage.j47.t0(r11, r12, r0) != r1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.gi2 r10, defpackage.hf2 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.sh2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            sh2 r0 = (defpackage.sh2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            sh2 r0 = new sh2
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            switch(r2) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0044;
                case 2: goto L_0x003c;
                case 3: goto L_0x0038;
                case 4: goto L_0x002f;
                case 5: goto L_0x0038;
                case 6: goto L_0x0038;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002f:
            hf2 r11 = r0.X
            gi2 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00f1
        L_0x0038:
            defpackage.od2.a0(r12)
            goto L_0x0066
        L_0x003c:
            hf2 r11 = r0.X
            gi2 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00a7
        L_0x0044:
            gi2 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x0062
        L_0x004a:
            defpackage.od2.a0(r12)
            boolean r12 = r11 instanceof defpackage.bf2
            if (r12 == 0) goto L_0x0081
            bf2 r11 = (defpackage.bf2) r11
            long r11 = r11.a
            r0.o = r10
            r2 = 1
            r0.s0 = r2
            java.lang.Object r12 = r10.y(r11, r0)
            if (r12 != r1) goto L_0x0062
            goto L_0x01dd
        L_0x0062:
            es8 r12 = (defpackage.es8) r12
            if (r12 != 0) goto L_0x0069
        L_0x0066:
            r1 = r3
            goto L_0x01dd
        L_0x0069:
            tf2 r10 = r10.x()
            if (r10 == 0) goto L_0x0066
            xu r11 = new xu
            r0 = 0
            r11.<init>(r10, r12, r0)
            ztc r12 = r10.c
            zl4 r11 = r12.b(r11)
            hc3 r10 = r10.X
            r10.a(r11)
            goto L_0x0066
        L_0x0081:
            boolean r12 = r11 instanceof defpackage.cf2
            if (r12 == 0) goto L_0x00d8
            r12 = r11
            cf2 r12 = (defpackage.cf2) r12
            long r5 = r12.a
            q0e r2 = r10.J0
            java.lang.Object r2 = r2.getValue()
            di9 r2 = (defpackage.di9) r2
            long r7 = r12.a
            boolean r12 = r2.b(r7)
            r0.o = r10
            r0.X = r11
            r2 = 2
            r0.s0 = r2
            java.lang.Object r12 = r10.B(r5, r12, r0)
            if (r12 != r1) goto L_0x00a7
            goto L_0x01dd
        L_0x00a7:
            q0e r12 = r10.I0
            java.lang.Object r12 = r12.getValue()
            di9 r12 = (defpackage.di9) r12
            cf2 r11 = (defpackage.cf2) r11
            long r5 = r11.a
            boolean r11 = r12.b(r5)
            if (r11 != 0) goto L_0x00ba
            goto L_0x0066
        L_0x00ba:
            kke r11 = r10.w()
            w9a r11 = (defpackage.w9a) r11
            cx7 r11 = r11.c()
            th2 r12 = new th2
            r12.<init>(r10, r4)
            r0.o = r4
            r0.X = r4
            r10 = 3
            r0.s0 = r10
            java.lang.Object r10 = defpackage.j47.t0(r11, r12, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x00d8:
            boolean r12 = r11 instanceof defpackage.df2
            r2 = 0
            if (r12 == 0) goto L_0x0123
            r12 = r11
            df2 r12 = (defpackage.df2) r12
            long r5 = r12.a
            r0.o = r10
            r0.X = r11
            r12 = 4
            r0.s0 = r12
            java.lang.Object r12 = r10.B(r5, r2, r0)
            if (r12 != r1) goto L_0x00f1
            goto L_0x01dd
        L_0x00f1:
            q0e r12 = r10.I0
            java.lang.Object r12 = r12.getValue()
            di9 r12 = (defpackage.di9) r12
            df2 r11 = (defpackage.df2) r11
            long r5 = r11.a
            boolean r11 = r12.b(r5)
            if (r11 != 0) goto L_0x0105
            goto L_0x0066
        L_0x0105:
            kke r11 = r10.w()
            w9a r11 = (defpackage.w9a) r11
            cx7 r11 = r11.c()
            uh2 r12 = new uh2
            r12.<init>(r10, r4)
            r0.o = r4
            r0.X = r4
            r10 = 5
            r0.s0 = r10
            java.lang.Object r10 = defpackage.j47.t0(r11, r12, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x0123:
            boolean r12 = r11 instanceof defpackage.ff2
            if (r12 == 0) goto L_0x0152
            q0e r12 = r10.I0
            java.lang.Object r12 = r12.getValue()
            di9 r12 = (defpackage.di9) r12
            ff2 r11 = (defpackage.ff2) r11
            long r4 = r11.a
            long[] r6 = r12.a
            int r12 = r12.b
            r7 = r2
        L_0x0138:
            if (r7 >= r12) goto L_0x0145
            r8 = r6[r7]
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0142
            goto L_0x0066
        L_0x0142:
            int r7 = r7 + 1
            goto L_0x0138
        L_0x0145:
            r12 = 6
            r0.s0 = r12
            long r11 = r11.a
            java.lang.Object r10 = r10.B(r11, r2, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x0152:
            boolean r12 = r11 instanceof defpackage.ef2
            if (r12 == 0) goto L_0x01de
            w7c r12 = r10.P0
            j0e r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            lh2 r12 = (defpackage.lh2) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.z53.S(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x0171:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x018a
            java.lang.Object r1 = r12.next()
            xm8 r1 = (defpackage.xm8) r1
            long r1 = r1.j()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r0.add(r4)
            goto L_0x0171
        L_0x018a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0193:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b8
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r2 = r11
            ef2 r2 = (defpackage.ef2) r2
            java.util.List r2 = r2.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x0193
            r12.add(r1)
            goto L_0x0193
        L_0x01b8:
            java.util.Set r11 = defpackage.x53.H0(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x01c4
            goto L_0x0066
        L_0x01c4:
            tf2 r10 = r10.x()
            if (r10 == 0) goto L_0x0066
            c r12 = new c
            r0 = 4
            r12.<init>(r10, r0, r11)
            ztc r11 = r10.c
            zl4 r11 = r11.b(r12)
            hc3 r10 = r10.X
            r10.a(r11)
            goto L_0x0066
        L_0x01dd:
            return r1
        L_0x01de:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.q(gi2, hf2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.gi2 r31, defpackage.um8 r32, kotlin.coroutines.Continuation r33) {
        /*
            r0 = r31
            r1 = r32
            r2 = r33
            boolean r3 = r2 instanceof defpackage.di2
            if (r3 == 0) goto L_0x0019
            r3 = r2
            di2 r3 = (defpackage.di2) r3
            int r4 = r3.t0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.t0 = r4
            goto L_0x001e
        L_0x0019:
            di2 r3 = new di2
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Z
            tx3 r14 = defpackage.tx3.a
            int r4 = r3.t0
            e5f r15 = defpackage.e5f.a
            r5 = 1
            r13 = 2
            r6 = 3
            r7 = 4
            if (r4 == 0) goto L_0x0064
            if (r4 == r5) goto L_0x0059
            if (r4 == r13) goto L_0x0052
            if (r4 == r6) goto L_0x004d
            if (r4 != r7) goto L_0x0045
            long r0 = r3.Y
            um8 r4 = r3.X
            gi2 r3 = r3.o
            defpackage.od2.a0(r2)
            r29 = r0
            r0 = r3
            r1 = r4
            r3 = r29
            goto L_0x017e
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            defpackage.od2.a0(r2)
            goto L_0x012b
        L_0x0052:
            gi2 r0 = r3.o
            defpackage.od2.a0(r2)
            goto L_0x00ed
        L_0x0059:
            long r0 = r3.Y
            gi2 r4 = r3.o
            defpackage.od2.a0(r2)
            r5 = r0
            r0 = r4
            r1 = r13
            goto L_0x00b4
        L_0x0064:
            defpackage.od2.a0(r2)
            e52 r2 = r31.v()
            if (r2 == 0) goto L_0x012b
            hm9 r4 = r1.v0
            boolean r8 = r4 instanceof defpackage.rm8
            je7 r9 = r0.v0
            long r11 = r2.a
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r2 = r9.getValue()
            r4 = r2
            pf5 r4 = (defpackage.pf5) r4
            int r2 = r1.u0
            int r2 = defpackage.au1.s(r2)
            if (r2 == 0) goto L_0x0094
            if (r2 == r5) goto L_0x0092
            if (r2 != r13) goto L_0x008c
            r2 = r6
            goto L_0x0095
        L_0x008c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0092:
            r2 = r13
            goto L_0x0095
        L_0x0094:
            r2 = r5
        L_0x0095:
            r3.o = r0
            r3.Y = r11
            r3.t0 = r5
            long r7 = r1.b
            java.lang.String r9 = r1.s0
            java.lang.String r10 = r1.X
            java.lang.String r1 = r1.t0
            r5 = r11
            r27 = r11
            r11 = r1
            r12 = r2
            r1 = r13
            r13 = r3
            java.lang.Object r2 = r4.a(r5, r7, r9, r10, r11, r12, r13)
            if (r2 != r14) goto L_0x00b2
            goto L_0x01b1
        L_0x00b2:
            r5 = r27
        L_0x00b4:
            cma r2 = (defpackage.cma) r2
            zla r4 = defpackage.zla.a
            boolean r4 = defpackage.tpa.f(r2, r4)
            if (r4 != 0) goto L_0x012b
            boolean r4 = r2 instanceof defpackage.ama
            if (r4 == 0) goto L_0x00d4
            s35 r0 = r0.K0
            gg2 r1 = new gg2
            ama r2 = (defpackage.ama) r2
            android.content.Intent r3 = r2.a
            android.net.Uri r2 = r2.b
            r1.<init>(r3, r2)
            defpackage.pnf.o(r0, r1)
            goto L_0x01a4
        L_0x00d4:
            boolean r4 = r2 instanceof defpackage.bma
            if (r4 == 0) goto L_0x00f8
            bma r2 = (defpackage.bma) r2
            java.lang.String r7 = r2.b
            r3.o = r0
            r3.t0 = r1
            r10 = 1
            long r8 = r2.a
            r4 = r0
            r11 = r3
            java.lang.Object r2 = r4.z(r5, r7, r8, r10, r11)
            if (r2 != r14) goto L_0x00ed
            goto L_0x01b1
        L_0x00ed:
            pg2 r2 = (defpackage.pg2) r2
            if (r2 == 0) goto L_0x012b
            s35 r0 = r0.K0
            defpackage.pnf.o(r0, r2)
            goto L_0x01a4
        L_0x00f8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fe:
            r27 = r11
            boolean r2 = r4 instanceof defpackage.sm8
            q0e r5 = r0.J0
            long r10 = r1.b
            if (r2 == 0) goto L_0x012e
            java.lang.Object r0 = r5.getValue()
            di9 r0 = (defpackage.di9) r0
            r0.b(r10)
            java.lang.Object r0 = r9.getValue()
            r4 = r0
            pf5 r4 = (defpackage.pf5) r4
            r3.t0 = r6
            java.lang.String r11 = r1.s0
            long r7 = r1.b
            long r9 = r1.c
            r5 = r27
            r12 = r3
            java.lang.Object r0 = r4.b(r5, r7, r9, r11, r12)
            if (r0 != r14) goto L_0x012b
            goto L_0x01b1
        L_0x012b:
            r14 = r15
            goto L_0x01b1
        L_0x012e:
            boolean r2 = r4 instanceof defpackage.tm8
            if (r2 == 0) goto L_0x01ab
            java.lang.Object r2 = r5.getValue()
            di9 r2 = (defpackage.di9) r2
            r2.a(r10)
            java.lang.Object r2 = r9.getValue()
            pf5 r2 = (defpackage.pf5) r2
            r3.o = r0
            r3.X = r1
            r4 = r27
            r3.Y = r4
            r3.t0 = r7
            je7 r6 = r2.g
            java.lang.Object r6 = r6.getValue()
            kke r6 = (defpackage.kke) r6
            w9a r6 = (defpackage.w9a) r6
            nx3 r6 = r6.b()
            of5 r7 = new of5
            r26 = 0
            long r8 = r1.c
            long r10 = r1.b
            java.lang.String r12 = r1.s0
            java.lang.String r13 = r1.X
            r16 = r7
            r17 = r2
            r18 = r8
            r20 = r4
            r22 = r10
            r24 = r12
            r25 = r13
            r16.<init>(r17, r18, r20, r22, r24, r25, r26)
            java.lang.Object r2 = defpackage.j47.t0(r6, r7, r3)
            if (r2 != r14) goto L_0x017d
            goto L_0x01b1
        L_0x017d:
            r3 = r4
        L_0x017e:
            pzd r2 = (defpackage.pzd) r2
            boolean r5 = r2 instanceof defpackage.nzd
            if (r5 == 0) goto L_0x019c
            s35 r0 = r0.K0
            og2 r12 = new og2
            long r5 = r1.b
            nzd r2 = (defpackage.nzd) r2
            java.lang.String r11 = r2.a
            java.lang.String r10 = r1.X
            java.lang.String r7 = r1.s0
            long r8 = r1.c
            r2 = r12
            r2.<init>(r3, r5, r7, r8, r10, r11)
            defpackage.pnf.o(r0, r12)
            goto L_0x01a4
        L_0x019c:
            ozd r0 = defpackage.ozd.a
            boolean r0 = defpackage.tpa.f(r2, r0)
            if (r0 == 0) goto L_0x01a5
        L_0x01a4:
            goto L_0x012b
        L_0x01a5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ab:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.r(gi2, um8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void s(gi2 gi2) {
        wha wha = (wha) gi2.x0.getValue();
        wha.g(new eqe(yea.T1));
        wha.e(new kia(woc.I));
        wha.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.gi2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.fi2
            if (r0 == 0) goto L_0x0016
            r0 = r9
            fi2 r0 = (defpackage.fi2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            fi2 r0 = new fi2
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r7 = r0.X
            gi2 r0 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            defpackage.od2.a0(r9)
            q0e r9 = r7.O0
            java.lang.Object r9 = r9.getValue()
            lh2 r9 = (defpackage.lh2) r9
            java.util.List r9 = r9.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00b8
            ih2 r9 = defpackage.ih2.a
            ih2 r2 = r7.c
            if (r2 != r9) goto L_0x00b8
            int r9 = r8.size()
            java.util.ListIterator r8 = r8.listIterator(r9)
        L_0x0058:
            boolean r9 = r8.hasPrevious()
            r2 = 0
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r8.previous()
            r4 = r9
            vk6 r4 = (defpackage.vk6) r4
            boolean r5 = r4 instanceof defpackage.es8
            if (r5 == 0) goto L_0x0058
            es8 r4 = (defpackage.es8) r4
            cu8 r4 = r4.a
            if (r4 == 0) goto L_0x0058
            boolean r4 = r4.n()
            if (r4 != r3) goto L_0x0058
            goto L_0x0078
        L_0x0077:
            r9 = r2
        L_0x0078:
            boolean r8 = r9 instanceof defpackage.es8
            if (r8 == 0) goto L_0x007f
            r2 = r9
            es8 r2 = (defpackage.es8) r2
        L_0x007f:
            if (r2 == 0) goto L_0x0086
            cu8 r8 = r2.a
            long r8 = r8.b
            goto L_0x0088
        L_0x0086:
            r8 = 0
        L_0x0088:
            java.util.HashSet r2 = defpackage.b10.E0
            r0.o = r7
            r0.X = r8
            r0.s0 = r3
            iy2 r3 = r7.o
            jz2 r3 = (defpackage.jz2) r3
            long r4 = r7.b
            java.lang.Object r0 = r3.t(r4, r2, r0)
            if (r0 != r1) goto L_0x009d
            goto L_0x00ba
        L_0x009d:
            r6 = r0
            r0 = r7
            r7 = r8
            r9 = r6
        L_0x00a1:
            x82 r9 = (defpackage.x82) r9
            long r1 = r9.d
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x00b8
            iy2 r9 = r0.o
            jh2 r1 = new jh2
            r2 = 0
            r1.<init>(r7, r2)
            jz2 r9 = (defpackage.jz2) r9
            long r7 = r0.b
            r9.f(r7, r1)
        L_0x00b8:
            e5f r1 = defpackage.e5f.a
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.t(gi2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: nz4} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r15 = (defpackage.yc8) r2.Q0.getValue();
        r12 = (java.util.Set) r2.M0.getValue();
        r4.o = r2;
        r4.X = r0;
        r4.Y = r1;
        r4.Z = r9;
        r4.s0 = r8;
        r4.t0 = r8;
        r4.u0 = r7;
        r4.x0 = r6;
        r15.getClass();
        r13 = r2.c.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e3, code lost:
        if (r13 == 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
        if (r13 == r6) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        if (r13 == 2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        if (r13 != 3) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        r10 = r15.a(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r18 = r1;
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r10 = r15.c(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        r10 = r15.b(r11, r12, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r13 = r11.a.z0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r13 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        r13 = (java.util.List) r13.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        if (r13 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        r14 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        if (r13.hasNext() == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0120, code lost:
        r5 = r13.next();
        r6 = (defpackage.l20) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        if (r12.contains(r6.a.toString()) == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r6.t != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0137, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013d, code lost:
        if (r6.a == defpackage.g20.o) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013f, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (((defpackage.se5) r15.d).v() != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        if (r6.i() == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0152, code lost:
        r1 = r6.d.b;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        if (r1 == 2) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        r14.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015c, code lost:
        r10 = r6;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        r18 = r1;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0169, code lost:
        r18 = r1;
        r14 = defpackage.nz4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0172, code lost:
        if (r14.size() <= 1) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0177, code lost:
        r1 = defpackage.j1e.a(r4.b);
        r5 = new java.util.ArrayList(defpackage.z53.S(r14, 10));
        r6 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r6.hasNext() == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
        r13 = r6.next();
        r21 = r6;
        r6 = r12;
        r19 = r15;
        r12 = new defpackage.xc8(r13, (kotlin.coroutines.Continuation) null, r11, r10, r19);
        r5.add(defpackage.j47.h(r1, (defpackage.nx3) null, r6, 3));
        r6 = r21;
        r2 = r2;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        r23 = r2;
        r10 = defpackage.pag.c(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c3, code lost:
        if (r10 != r3) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c6, code lost:
        r11 = r23;
        r1 = r4;
        r2 = r7;
        r4 = r8;
        r7 = r4;
        r8 = r9;
        r9 = r18;
        r20 = r10;
        r10 = r0;
        r0 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(java.util.List r22, java.lang.Long r23, kotlin.coroutines.Continuation r24) {
        /*
            r21 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.rh2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            rh2 r1 = (defpackage.rh2) r1
            int r2 = r1.x0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.x0 = r2
            r2 = r21
            goto L_0x001e
        L_0x0017:
            rh2 r1 = new rh2
            r2 = r21
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.v0
            tx3 r3 = defpackage.tx3.a
            int r4 = r1.x0
            r5 = -1
            r6 = 1
            if (r4 == 0) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            int r2 = r1.u0
            java.util.ArrayList r4 = r1.t0
            java.util.ArrayList r7 = r1.s0
            java.util.List r8 = r1.Z
            java.lang.Long r9 = r1.Y
            java.util.List r10 = r1.X
            gi2 r11 = r1.o
            defpackage.od2.a0(r0)
            goto L_0x01d4
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            defpackage.od2.a0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r22.iterator()
        L_0x0051:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0063
            java.lang.Object r7 = r4.next()
            boolean r8 = r7 instanceof defpackage.es8
            if (r8 == 0) goto L_0x0051
            r0.add(r7)
            goto L_0x0051
        L_0x0063:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r0.size()
            int r7 = r7 - r6
            r9 = r0
            r8 = r4
            r0 = r22
            r4 = r1
            r1 = r23
        L_0x0074:
            if (r5 >= r7) goto L_0x01eb
            java.lang.Object r11 = r9.get(r7)
            es8 r11 = (defpackage.es8) r11
            khe r12 = r2.M0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            cu8 r13 = r11.a
            k8g r13 = r13.z0
            if (r13 != 0) goto L_0x0090
        L_0x008a:
            r18 = r1
            r23 = r2
            goto L_0x01e2
        L_0x0090:
            java.lang.Object r13 = r13.a
            java.util.List r13 = (java.util.List) r13
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x009b
            goto L_0x008a
        L_0x009b:
            java.util.Iterator r13 = r13.iterator()
        L_0x009f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x008a
            java.lang.Object r14 = r13.next()
            l20 r14 = (defpackage.l20) r14
            g20 r14 = r14.a
            java.lang.String r14 = r14.toString()
            boolean r14 = r12.contains(r14)
            if (r14 == 0) goto L_0x009f
            je7 r12 = r2.Q0
            java.lang.Object r12 = r12.getValue()
            r15 = r12
            yc8 r15 = (defpackage.yc8) r15
            khe r12 = r2.M0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            r4.o = r2
            r4.X = r0
            r4.Y = r1
            r4.Z = r9
            r4.s0 = r8
            r4.t0 = r8
            r4.u0 = r7
            r4.x0 = r6
            r15.getClass()
            ih2 r13 = r2.c
            int r13 = r13.ordinal()
            r14 = 3
            r10 = 2
            if (r13 == 0) goto L_0x0105
            if (r13 == r6) goto L_0x0100
            if (r13 == r10) goto L_0x00fb
            if (r13 != r14) goto L_0x00f5
            java.lang.Object r10 = r15.a(r11, r12, r4)
        L_0x00ef:
            r18 = r1
            r23 = r2
            goto L_0x01c3
        L_0x00f5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fb:
            java.lang.Object r10 = r15.c(r11, r12, r4)
            goto L_0x00ef
        L_0x0100:
            java.lang.Object r10 = r15.b(r11, r12, r1, r4)
            goto L_0x00ef
        L_0x0105:
            cu8 r13 = r11.a
            k8g r13 = r13.z0
            if (r13 == 0) goto L_0x0169
            java.lang.Object r13 = r13.a
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0169
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x011a:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x0166
            java.lang.Object r5 = r13.next()
            r6 = r5
            l20 r6 = (defpackage.l20) r6
            g20 r10 = r6.a
            java.lang.String r10 = r10.toString()
            boolean r10 = r12.contains(r10)
            if (r10 == 0) goto L_0x0162
            boolean r10 = r6.t
            if (r10 != 0) goto L_0x0162
            g20 r10 = defpackage.g20.o
            r18 = r1
            g20 r1 = r6.a
            if (r1 == r10) goto L_0x0141
        L_0x013f:
            r6 = 2
            goto L_0x0159
        L_0x0141:
            qe5 r1 = r15.d
            se5 r1 = (defpackage.se5) r1
            boolean r1 = r1.v()
            if (r1 != 0) goto L_0x014c
            goto L_0x013f
        L_0x014c:
            boolean r1 = r6.i()
            if (r1 == 0) goto L_0x0164
            k20 r1 = r6.d
            int r1 = r1.b
            r6 = 2
            if (r1 == r6) goto L_0x015c
        L_0x0159:
            r14.add(r5)
        L_0x015c:
            r10 = r6
            r1 = r18
            r5 = -1
            r6 = 1
            goto L_0x011a
        L_0x0162:
            r18 = r1
        L_0x0164:
            r6 = 2
            goto L_0x015c
        L_0x0166:
            r18 = r1
            goto L_0x016d
        L_0x0169:
            r18 = r1
            nz4 r14 = defpackage.nz4.a
        L_0x016d:
            int r1 = r14.size()
            r5 = 1
            if (r1 <= r5) goto L_0x0176
            r10 = 1
            goto L_0x0177
        L_0x0176:
            r10 = 0
        L_0x0177:
            lx3 r1 = r4.b
            kotlinx.coroutines.internal.ContextScope r1 = defpackage.j1e.a(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.z53.S(r14, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r14.iterator()
        L_0x018c:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r13 = r6.next()
            xc8 r14 = new xc8
            r16 = 0
            r12 = r14
            r23 = r2
            r21 = r6
            r6 = r14
            r2 = 3
            r14 = r16
            r19 = r15
            r15 = r11
            r16 = r10
            r17 = r19
            r12.<init>(r13, r14, r15, r16, r17)
            r12 = 0
            zf4 r6 = defpackage.j47.h(r1, r12, r6, r2)
            r5.add(r6)
            r6 = r21
            r2 = r23
            r15 = r19
            goto L_0x018c
        L_0x01bc:
            r23 = r2
            java.lang.Object r1 = defpackage.pag.c(r5, r4)
            r10 = r1
        L_0x01c3:
            if (r10 != r3) goto L_0x01c6
            return r3
        L_0x01c6:
            r11 = r23
            r1 = r4
            r2 = r7
            r4 = r8
            r7 = r4
            r8 = r9
            r9 = r18
            r20 = r10
            r10 = r0
            r0 = r20
        L_0x01d4:
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            r4 = r1
            r1 = r9
            r0 = r10
            r5 = -1
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r11
            goto L_0x01e7
        L_0x01e2:
            r2 = r23
            r1 = r18
            r5 = -1
        L_0x01e7:
            int r7 = r7 + r5
            r6 = 1
            goto L_0x0074
        L_0x01eb:
            boolean r1 = r0.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x01fe
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = r2 instanceof defpackage.uk6
            if (r2 == 0) goto L_0x01ff
            r2 = r5
            goto L_0x0200
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            r2 = r1
        L_0x0200:
            boolean r3 = r0.isEmpty()
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0216
            int r3 = r0.size()
            int r3 = r3 - r5
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = r0 instanceof defpackage.uk6
            if (r0 == 0) goto L_0x0216
            r6 = r5
            goto L_0x0217
        L_0x0216:
            r6 = r1
        L_0x0217:
            lh2 r0 = new lh2
            r0.<init>(r8, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.A(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (r2.c(r11, (defpackage.lh2) r12) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.vh2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            vh2 r0 = (defpackage.vh2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            vh2 r0 = new vh2
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.u0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.w0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r8 = r0.t0
            long r9 = r0.s0
            java.lang.Object r11 = r0.Z
            ti9 r2 = r0.Y
            java.util.List r5 = r0.X
            gi2 r6 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00dd
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            boolean r11 = r0.t0
            long r9 = r0.s0
            gi2 r8 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x008b
        L_0x004b:
            defpackage.od2.a0(r12)
            q0e r12 = r8.O0
            java.lang.Object r12 = r12.getValue()
            lh2 r12 = (defpackage.lh2) r12
            java.util.List r12 = r12.a
            boolean r2 = r12 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0064
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x0064
            goto L_0x00e5
        L_0x0064:
            java.util.Iterator r12 = r12.iterator()
        L_0x0068:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00e5
            java.lang.Object r2 = r12.next()
            xm8 r2 = (defpackage.xm8) r2
            long r6 = r2.j()
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0068
            r0.o = r8
            r0.s0 = r9
            r0.t0 = r11
            r0.w0 = r5
            java.lang.Object r12 = r8.y(r9, r0)
            if (r12 != r1) goto L_0x008b
            return r1
        L_0x008b:
            es8 r12 = (defpackage.es8) r12
            if (r12 != 0) goto L_0x0090
            return r3
        L_0x0090:
            tf2 r2 = r8.x()
            if (r2 == 0) goto L_0x00a7
            xu r5 = new xu
            r6 = 1
            r5.<init>(r2, r12, r6)
            ztc r12 = r2.c
            zl4 r12 = r12.b(r5)
            hc3 r2 = r2.X
            r2.a(r12)
        L_0x00a7:
            tf2 r12 = r8.x()
            if (r12 == 0) goto L_0x00e5
            nl6 r12 = r12.b
            java.util.ArrayList r12 = r12.e()
            q0e r2 = r8.O0
            r6 = r8
            r8 = r11
            r5 = r12
        L_0x00b8:
            java.lang.Object r11 = r2.getValue()
            r12 = r11
            lh2 r12 = (defpackage.lh2) r12
            if (r8 == 0) goto L_0x00c7
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r9)
            goto L_0x00c8
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            r0.o = r6
            r0.X = r5
            r0.Y = r2
            r0.Z = r11
            r0.s0 = r9
            r0.t0 = r8
            r0.w0 = r4
            java.lang.Object r12 = r6.A(r5, r12, r0)
            if (r12 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            lh2 r12 = (defpackage.lh2) r12
            boolean r11 = r2.c(r11, r12)
            if (r11 == 0) goto L_0x00b8
        L_0x00e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.B(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C(int i, xm8 xm8) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i2 = wea.Z;
        s35 s35 = this.K0;
        if (i == i2) {
            pnf.o(s35, new kg2(this.b, xm8.j()));
        } else if (i != wea.Y) {
            int i3 = wea.d0;
            vm8 vm8 = null;
            ContextScope contextScope = this.a;
            if (i == i3) {
                vxd S = j47.S(contextScope, ((w9a) w()).b(), vx3.b, new yh2(this, xm8, (Continuation) null));
                this.E0.o1(this, R0[1], S);
            } else if (i == wea.X) {
                u(xm8, true);
            } else if (i == wea.W) {
                u(xm8, false);
            } else if (i == wea.a0) {
                if (xm8 instanceof vm8) {
                    vm8 = (vm8) xm8;
                }
                if (vm8 != null && (charSequence3 = vm8.Z) != null) {
                    pnf.o(s35, new jg2(charSequence3.toString()));
                }
            } else if (i == wea.V) {
                if (xm8 instanceof vm8) {
                    vm8 = (vm8) xm8;
                }
                if (vm8 != null && (charSequence2 = vm8.Z) != null) {
                    pnf.o(s35, new fg2(charSequence2.toString()));
                    wha wha = (wha) this.x0.getValue();
                    wha.g(new eqe(yea.s1));
                    wha.e(new kia(woc.u));
                    wha.i();
                }
            } else if (i == wea.c0) {
                if (xm8 instanceof vm8) {
                    vm8 = (vm8) xm8;
                }
                if (vm8 != null && (charSequence = vm8.Z) != null) {
                    pnf.o(s35, new mg2(charSequence.toString()));
                }
            } else if (i == wea.b0 && (xm8 instanceof wm8)) {
                j47.T(contextScope, ((w9a) w()).b(), (vx3) null, new ci2(this, xm8, (Continuation) null), 2);
            }
        } else if (xm8 instanceof um8) {
            um8 um8 = (um8) xm8;
            pnf.o(s35, new lg2(Long.valueOf(um8.c), um8.b, false));
        } else if (xm8 instanceof vm8) {
            vm8 vm82 = (vm8) xm8;
            pnf.o(s35, new lg2(Long.valueOf(vm82.c), vm82.b, true));
        } else if (xm8 instanceof wm8) {
            wm8 wm8 = (wm8) xm8;
            pnf.o(s35, new lg2(Long.valueOf(wm8.c), wm8.b, true));
        } else if (xm8 instanceof qm8) {
            qm8 qm8 = (qm8) xm8;
            pnf.o(s35, new lg2(Long.valueOf(qm8.c), qm8.b, false));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final zc8 d() {
        zc8 zc8 = (zc8) this.B0.get();
        if (zc8 != null) {
            return zc8;
        }
        Set<String> set = (Set) this.M0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(set, 10));
        for (String a : set) {
            arrayList.add(b10.a(a));
        }
        return new zc8(0, 0, x53.H0(arrayList), this.b);
    }

    public final void k() {
        tf2 x = x();
        if (x != null) {
            j47.T(this.a, ((w9a) w()).b().plus(xq9.a), (vx3) null, new xh2(this, x, (Continuation) null), 2);
        }
    }

    public final void p() {
        tf2 x = x();
        if (x != null) {
            hm9.m(x.a, "clear", new Object[0]);
            ev evVar = x.s0;
            evVar.c();
            evVar.a();
            synchronized (evVar) {
                evVar.c = null;
            }
            ev evVar2 = x.u0;
            evVar2.c();
            evVar2.a();
            synchronized (evVar2) {
                evVar2.c = null;
            }
            ev evVar3 = x.t0;
            evVar3.c();
            evVar3.a();
            synchronized (evVar3) {
                evVar3.c = null;
            }
            x.X.d();
        }
        this.Z.f(this);
    }

    public final void u(xm8 xm8, boolean z) {
        vxd S = j47.S(this.a, ((w9a) w()).b(), vx3.b, new oh2(this, xm8, z, (Continuation) null));
        this.F0.o1(this, R0[2], S);
    }

    public final e52 v() {
        return (e52) ((jz2) this.o).m(this.b).a.getValue();
    }

    public final kke w() {
        return (kke) this.C0.getValue();
    }

    public final tf2 x() {
        return (tf2) this.L0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ph2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ph2 r0 = (defpackage.ph2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ph2 r0 = new ph2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0049
        L_0x0027:
            r4 = move-exception
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r7)
            je7 r4 = r4.s0     // Catch:{ all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0027 }
            tp7 r4 = (defpackage.tp7) r4     // Catch:{ all -> 0x0027 }
            q1a r4 = defpackage.tp7.a(r4, r5)     // Catch:{ all -> 0x0027 }
            r0.Y = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r7 = defpackage.s36.f(r4, r0)     // Catch:{ all -> 0x0027 }
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            es8 r7 = (defpackage.es8) r7     // Catch:{ all -> 0x0027 }
            goto L_0x0051
        L_0x004c:
            njc r7 = new njc
            r7.<init>(r4)
        L_0x0051:
            boolean r4 = r7 instanceof defpackage.njc
            if (r4 == 0) goto L_0x0056
            r7 = 0
        L_0x0056:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(long r15, java.lang.String r17, long r18, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r14 = this;
            r0 = r14
            r1 = r21
            boolean r2 = r1 instanceof defpackage.qh2
            if (r2 == 0) goto L_0x0016
            r2 = r1
            qh2 r2 = (defpackage.qh2) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001b
        L_0x0016:
            qh2 r2 = new qh2
            r2.<init>(r14, r1)
        L_0x001b:
            java.lang.Object r1 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            boolean r0 = r2.X
            java.lang.String r2 = r2.o
            defpackage.od2.a0(r1)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L_0x006d
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            defpackage.od2.a0(r1)
            z7d r1 = r0.y0
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f93newmediaviewerenabled
            r6 = 0
            boolean r1 = r1.n(r4, r6)
            if (r1 == 0) goto L_0x0058
            hg2 r0 = new hg2
            r6 = r0
            r7 = r15
            r9 = r18
            r11 = r17
            r12 = r20
            r6.<init>(r7, r9, r11, r12)
            goto L_0x008f
        L_0x0058:
            r1 = r17
            r2.o = r1
            r4 = r20
            r2.X = r4
            r2.s0 = r5
            r5 = r18
            java.lang.Object r0 = r14.y(r5, r2)
            if (r0 != r3) goto L_0x006b
            return r3
        L_0x006b:
            r2 = r0
            r0 = r4
        L_0x006d:
            es8 r2 = (defpackage.es8) r2
            if (r2 != 0) goto L_0x0073
            r0 = 0
            return r0
        L_0x0073:
            xcb r3 = defpackage.xcb.a
            v4 r3 = r3.getAccessor()
            java.lang.Class<df7> r4 = defpackage.df7.class
            java.lang.Object r3 = r3.c(r4)
            df7 r3 = (defpackage.df7) r3
            r3.getClass()
            xw8 r3 = new xw8
            r3.<init>((defpackage.es8) r2)
            ig2 r2 = new ig2
            r2.<init>(r3, r1, r0)
            r0 = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.z(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
