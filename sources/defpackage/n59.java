package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: n59  reason: default package */
public final class n59 extends pnf {
    public static final /* synthetic */ bc7[] D1;
    public final String A0 = n59.class.getName();
    public final q0e A1;
    public final nx3 B0;
    public final w7c B1;
    public final je7 C0;
    public int C1;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final je7 V0;
    public final je7 W0;
    public final pz7 X;
    public final je7 X0;
    public final kke Y;
    public final je7 Y0;
    public final z3b Z;
    public final je7 Z0;
    public final je7 a1;
    public final v69 b;
    public final je7 b1;
    public final rg1 c;
    public final je7 c1;
    public final je7 d1;
    public final je7 e1;
    public final je7 f1;
    public final s35 g1;
    public final adb h1;
    public final w4d i1;
    public final w4d j1;
    public final w4d k1;
    public final w4d l1;
    public final w4d m1;
    public final w4d n1;
    public final t29 o;
    public final w7c o1;
    public final q0e p1;
    public final w7c q1;
    public final w7c r1;
    public final iy2 s0;
    public final khe s1;
    public final p31 t0;
    public final khe t1;
    public final qz7 u0;
    public final s35 u1;
    public final qrc v0;
    public final s35 v1;
    public final fc3 w0;
    public final ConcurrentHashMap w1;
    public final m5d x0;
    public final HashSet x1;
    public final q33 y0;
    public final khe y1;
    public final i00 z0;
    public final mn5 z1;

    static {
        Class<n59> cls = n59.class;
        D1 = new bc7[]{new oi9(cls, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "saveVideoProgressJob", "getSaveVideoProgressJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [fc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Object, adb] */
    public n59(v69 v69, rg1 rg1, bx bxVar, pz7 pz7, y7g y7g) {
        mn5 mn5;
        uj3 l;
        v69 v692 = v69;
        bx bxVar2 = bxVar;
        o19 o19 = o19.a;
        kke dispatchers = o19.getDispatchers();
        z3b z3b = (z3b) o19.getAccessor().c(z3b.class);
        iy2 iy2 = (iy2) o19.getAccessor().c(iy2.class);
        Class<y7d> cls = y7d.class;
        p31 p31 = new p31(o19.getAccessor().d(cls), o19.getAccessor().d(qe5.class), o19.getAccessor().d(y4e.class), 1);
        qz7 qz7 = new qz7((je7) o19.getAccessor().d(p7c.class));
        qrc b2 = o19.b();
        nx3 b3 = ((w9a) ((kke) o19.getAccessor().c(kke.class))).b();
        Class<gh3> cls2 = gh3.class;
        khe d = o19.getAccessor().d(cls2);
        qrc qrc = b2;
        Class<r79> cls3 = r79.class;
        khe d2 = o19.getAccessor().d(cls3);
        qz7 qz72 = qz7;
        qrc b4 = o19.b();
        p31 p312 = p31;
        ? obj = new Object();
        obj.a = (Context) o19.getAccessor().c(Context.class);
        obj.b = b3;
        obj.c = b4;
        obj.o = d2;
        obj.X = d;
        obj.Y = tu0.r(3, new zf3(10));
        obj.Z = tu0.r(3, new zf3(11));
        Class<pk> cls4 = pk.class;
        Class<av0> cls5 = av0.class;
        fc3 fc3 = obj;
        m5d m5d = new m5d((je7) o19.getAccessor().d(cls4), (je7) o19.getAccessor().d(cls5), (je7) o19.getAccessor().d(cls3));
        khe d3 = o19.getAccessor().d(cls4);
        khe d4 = o19.getAccessor().d(wha.class);
        khe d5 = o19.getAccessor().d(Application.class);
        khe d6 = o19.getAccessor().d(cls);
        khe khe = d5;
        khe d7 = o19.getAccessor().d(ds3.class);
        khe d8 = o19.getAccessor().d(cls3);
        khe khe2 = d7;
        khe d9 = o19.getAccessor().d(ns8.class);
        khe khe3 = d8;
        khe d10 = o19.getAccessor().d(hu8.class);
        khe d11 = o19.getAccessor().d(mm2.class);
        khe d12 = o19.getAccessor().d(u79.class);
        khe d13 = o19.getAccessor().d(kt8.class);
        khe d14 = o19.getAccessor().d(tp7.class);
        khe d15 = o19.getAccessor().d(ps2.class);
        khe d16 = o19.getAccessor().d(o89.class);
        khe d17 = o19.getAccessor().d(mw8.class);
        khe d18 = o19.getAccessor().d(lx8.class);
        khe d19 = o19.getAccessor().d(k6f.class);
        khe d20 = o19.getAccessor().d(pf5.class);
        kke dispatchers2 = o19.getDispatchers();
        khe khe4 = d9;
        khe khe5 = d6;
        m5d m5d2 = m5d;
        long j = v692.a;
        v19 v19 = new v19(j, (av0) o19.getAccessor().c(cls5), dispatchers2);
        a79 a79 = new a79((av0) o19.getAccessor().c(cls5), o19.getDispatchers());
        khe d21 = o19.getAccessor().d(s8g.class);
        a79 a792 = a79;
        khe d22 = o19.getAccessor().d(al.class);
        v19 v192 = v19;
        khe d23 = o19.getAccessor().d(vj7.class);
        khe d24 = o19.getAccessor().d(cls2);
        long j2 = j;
        khe d25 = o19.getAccessor().d(gj.class);
        khe d26 = o19.getAccessor().d(ab6.class);
        khe d27 = o19.getAccessor().d(ge2.class);
        khe d28 = o19.getAccessor().d(wrc.class);
        khe d29 = o19.getAccessor().d(bt1.class);
        khe d30 = o19.getAccessor().d(jhf.class);
        khe d31 = o19.getAccessor().d(uva.class);
        khe d32 = o19.getAccessor().d(pb6.class);
        this.b = v692;
        this.c = rg1;
        this.o = bxVar2;
        this.X = pz7;
        this.Y = dispatchers;
        this.Z = z3b;
        this.s0 = iy2;
        this.t0 = p312;
        this.u0 = qz72;
        this.v0 = qrc;
        this.w0 = fc3;
        this.x0 = m5d2;
        this.y0 = (q33) o19.getAccessor().c(q33.class);
        this.z0 = (i00) o19.getAccessor().c(i00.class);
        w9a w9a = (w9a) dispatchers;
        this.B0 = w9a.b().limitedParallelism(1, "messages-list-vm-io");
        this.C0 = d3;
        this.D0 = khe5;
        this.E0 = khe;
        khe khe6 = khe4;
        this.F0 = khe6;
        this.G0 = khe3;
        this.H0 = d12;
        this.I0 = d4;
        this.J0 = khe2;
        this.K0 = d17;
        this.L0 = d10;
        this.M0 = d13;
        this.N0 = d11;
        this.O0 = d15;
        this.P0 = d14;
        this.Q0 = d18;
        this.R0 = d19;
        this.S0 = d20;
        this.T0 = d21;
        this.U0 = d22;
        this.V0 = d23;
        this.W0 = d24;
        this.X0 = d25;
        this.Y0 = d26;
        this.Z0 = d27;
        this.a1 = d28;
        this.b1 = d29;
        this.c1 = d16;
        this.d1 = d30;
        this.e1 = d31;
        this.f1 = d32;
        this.g1 = new s35(0);
        List M = y53.M(new r92(y7g), new Object());
        ? obj2 = new Object();
        ArrayList arrayList = new ArrayList();
        for (Object next : M) {
            if (next instanceof r29) {
                arrayList.add(next);
            }
        }
        obj2.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = M.iterator();
        while (it.hasNext()) {
            it.next();
        }
        obj2.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = M.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        obj2.c = arrayList3;
        this.h1 = obj2;
        this.i1 = mqd.D();
        this.j1 = mqd.D();
        this.k1 = mqd.D();
        this.l1 = mqd.D();
        this.m1 = mqd.D();
        this.n1 = mqd.D();
        w7c m = ((jz2) iy2).m(j2);
        this.o1 = m;
        q0e a = r0e.a(l29.o);
        this.p1 = a;
        w7c w7c = new w7c(a);
        this.q1 = w7c;
        j31 j31 = new j31(m, w7c, new c3(this, (Continuation) null, 19), 4);
        nz4 nz4 = nz4.a;
        c32 c32 = wld.a;
        this.r1 = od2.X(j31, this.a, c32, nz4);
        this.s1 = new khe(new i39(this, 0));
        this.t1 = new khe(new i39(this, 1));
        this.u1 = new s35(0);
        this.v1 = new s35(0);
        this.w1 = new ConcurrentHashMap(0);
        this.x1 = new HashSet();
        this.y1 = new khe(new yf3(khe6, 18, this));
        this.z1 = od2.F(new m58(a, 7), w9a.a());
        q0e a2 = r0e.a((Object) null);
        this.A1 = a2;
        m58 m58 = new m58(a, 8);
        t03 t03 = new t03(m, 11);
        e52 e52 = (e52) m.a.getValue();
        if (e52 == null || (l = e52.l()) == null) {
            mn5 = new qn5(3, (Object) null);
        } else {
            mn5 = new t03(((ds3) this.J0.getValue()).c(l.n()), 11);
        }
        this.B1 = od2.X(od2.F(od2.s(m58, t03, a2, od2.w(mn5, new ai0(18)), new ik1(this, (Continuation) null, 1)), w9a.b()), this.a, c32, (Object) null);
        od2.L(od2.F(new zn5(new mqc(new j59(new j31(new t03(m, 11), bxVar2.B, new xh0(3, (Continuation) null, 20), 4), (Continuation) null, this)), new j39(this, (Continuation) null), 5), w9a.a()), this.a);
        pnf.n(this, w9a.b(), (vx3) null, new k39(this, (Continuation) null), 2);
        od2.L(new zn5(v192.e, new l39(this, (Continuation) null), 5), this.a);
        od2.L(new zn5(new v7c(a792.a), new m39(this, (Continuation) null), 5), this.a);
        ((uh9) z3b.a).e(z3b.g);
        z3b.b();
        j47.T(this.a, (lx3) null, (vx3) null, new n39(this, (Continuation) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r2 = r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.xz4 q(defpackage.n59 r10, defpackage.ml3 r11, defpackage.e52 r12, defpackage.eqe r13, defpackage.eqe r14) {
        /*
            r10.getClass()
            java.lang.String r0 = r11.b
            if (r0 == 0) goto L_0x001a
            je7 r1 = r10.f1
            java.lang.Object r1 = r1.getValue()
            pb6 r1 = (defpackage.pb6) r1
            java.util.List r2 = r11.c
            if (r2 != 0) goto L_0x0015
            nz4 r2 = defpackage.nz4.a
        L_0x0015:
            java.lang.CharSequence r0 = r1.a(r0, r2)
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = ""
        L_0x001c:
            r1 = 0
            l20 r11 = r11.a
            if (r11 == 0) goto L_0x0033
            x10 r2 = r11.b
            if (r2 == 0) goto L_0x0033
            je7 r10 = r10.e1
            java.lang.Object r10 = r10.getValue()
            uva r10 = (defpackage.uva) r10
            yt6 r10 = r10.a(r2, r11)
            r7 = r10
            goto L_0x0034
        L_0x0033:
            r7 = r1
        L_0x0034:
            int r10 = r0.length()
            if (r10 <= 0) goto L_0x003f
            iqe r13 = new iqe
            r13.<init>(r0)
        L_0x003f:
            r8 = r13
            int r10 = r0.length()
            if (r10 <= 0) goto L_0x0048
            iqe r14 = defpackage.jqe.a
        L_0x0048:
            r9 = r14
            kk0 r10 = defpackage.kk0.c
            jk0 r11 = defpackage.jk0.a
            java.lang.String r3 = r12.g(r10, r11)
            uj3 r10 = r12.l()
            if (r10 == 0) goto L_0x005b
            java.lang.CharSequence r1 = r10.m()
        L_0x005b:
            r4 = r1
            long r5 = r12.f()
            xz4 r10 = new xz4
            r2 = r10
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.q(n59, ml3, e52, eqe, eqe):xz4");
    }

    public static final r79 r(n59 n59) {
        return (r79) n59.G0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.n59 r12, defpackage.cu8 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof defpackage.y49
            if (r0 == 0) goto L_0x0016
            r0 = r14
            y49 r0 = (defpackage.y49) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x001b
        L_0x0016:
            y49 r0 = new y49
            r0.<init>(r12, r14)
        L_0x001b:
            java.lang.Object r14 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r8) goto L_0x0032
            if (r2 == r7) goto L_0x0032
            if (r2 == r6) goto L_0x003f
            if (r2 != r5) goto L_0x0037
        L_0x0032:
            defpackage.od2.a0(r14)
            goto L_0x00e9
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003f:
            l20 r12 = r0.Y
            cu8 r13 = r0.X
            n59 r2 = r0.o
            defpackage.od2.a0(r14)
            r10 = r12
            r8 = r13
            r7 = r2
            goto L_0x00c5
        L_0x004d:
            defpackage.od2.a0(r14)
            g20 r14 = defpackage.g20.c
            l20 r14 = r13.a(r14)
            kke r2 = r12.Y
            if (r14 == 0) goto L_0x00ff
            je7 r9 = r12.W0
            java.lang.Object r9 = r9.getValue()
            gh3 r9 = (defpackage.gh3) r9
            boolean r9 = r9.f()
            if (r9 != 0) goto L_0x006a
            goto L_0x00ff
        L_0x006a:
            boolean r8 = r14.d()
            x10 r9 = r14.b
            if (r8 == 0) goto L_0x008c
            if (r9 == 0) goto L_0x008a
            java.lang.String r8 = r9.a
            boolean r9 = defpackage.oag.t(r8)
            if (r9 != 0) goto L_0x008a
            boolean r9 = defpackage.oag.t(r8)
            if (r9 == 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            java.lang.String r9 = "&fn=legacy_44"
            java.lang.String r8 = defpackage.au1.g(r8, r9)
            goto L_0x0092
        L_0x008a:
            r8 = r4
            goto L_0x0092
        L_0x008c:
            if (r9 == 0) goto L_0x008a
            java.lang.String r8 = r9.a()
        L_0x0092:
            java.lang.String r9 = r14.s
            if (r9 == 0) goto L_0x009e
            int r10 = r9.length()
            if (r10 != 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r9
        L_0x009e:
            if (r8 == 0) goto L_0x00eb
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00a7
            goto L_0x00eb
        L_0x00a7:
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            c59 r7 = new c59
            r7.<init>(r12, r8, r14, r4)
            r0.o = r12
            r0.X = r13
            r0.Y = r14
            r0.t0 = r6
            java.lang.Object r2 = defpackage.j47.t0(r2, r7, r0)
            if (r2 != r1) goto L_0x00c1
            goto L_0x0112
        L_0x00c1:
            r7 = r12
            r8 = r13
            r10 = r14
            r14 = r2
        L_0x00c5:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r9 = r14.booleanValue()
            kke r12 = r7.Y
            w9a r12 = (defpackage.w9a) r12
            cx7 r12 = r12.c()
            b59 r13 = new b59
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r0.o = r4
            r0.X = r4
            r0.Y = r4
            r0.t0 = r5
            java.lang.Object r12 = defpackage.j47.t0(r12, r13, r0)
            if (r12 != r1) goto L_0x00e9
            goto L_0x0112
        L_0x00e9:
            r1 = r3
            goto L_0x0112
        L_0x00eb:
            w9a r2 = (defpackage.w9a) r2
            cx7 r14 = r2.c()
            a59 r2 = new a59
            r2.<init>(r12, r13, r4)
            r0.t0 = r7
            java.lang.Object r12 = defpackage.j47.t0(r14, r2, r0)
            if (r12 != r1) goto L_0x00e9
            goto L_0x0112
        L_0x00ff:
            w9a r2 = (defpackage.w9a) r2
            cx7 r14 = r2.c()
            z49 r2 = new z49
            r2.<init>(r12, r13, r4)
            r0.t0 = r8
            java.lang.Object r12 = defpackage.j47.t0(r14, r2, r0)
            if (r12 != r1) goto L_0x00e9
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.s(n59, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: e52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.n59 r28, defpackage.cu8 r29, kotlin.coroutines.Continuation r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            r28.getClass()
            boolean r3 = r2 instanceof defpackage.e59
            if (r3 == 0) goto L_0x001d
            r3 = r2
            e59 r3 = (defpackage.e59) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.u0 = r4
        L_0x001b:
            r11 = r3
            goto L_0x0023
        L_0x001d:
            e59 r3 = new e59
            r3.<init>(r0, r2)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r2 = r11.s0
            tx3 r3 = defpackage.tx3.a
            int r4 = r11.u0
            e5f r12 = defpackage.e5f.a
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            e52 r0 = r11.Z
            l20 r1 = r11.Y
            cu8 r3 = r11.X
            n59 r4 = r11.o
            defpackage.od2.a0(r2)
            r13 = r0
            r2 = r1
            r1 = r3
            r0 = r4
            goto L_0x0096
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            defpackage.od2.a0(r2)
            r2 = r12
            goto L_0x00d0
        L_0x0051:
            defpackage.od2.a0(r2)
            g20 r2 = defpackage.g20.o
            l20 r2 = r1.a(r2)
            w7c r4 = r0.o1
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            r13 = r4
            e52 r13 = (defpackage.e52) r13
            if (r2 == 0) goto L_0x0077
            if (r13 == 0) goto L_0x0077
            je7 r4 = r0.W0
            java.lang.Object r4 = r4.getValue()
            gh3 r4 = (defpackage.gh3) r4
            boolean r4 = r4.f()
            if (r4 != 0) goto L_0x0079
        L_0x0077:
            r2 = r12
            goto L_0x00d2
        L_0x0079:
            k6f r4 = r28.z()
            d20 r10 = defpackage.d20.X
            r11.o = r0
            r11.X = r1
            r11.Y = r2
            r11.Z = r13
            r11.u0 = r5
            long r7 = r1.b
            java.lang.String r9 = r2.r
            long r5 = r13.a
            java.lang.Object r4 = r4.a(r5, r7, r9, r10, r11)
            if (r4 != r3) goto L_0x0096
            goto L_0x00e8
        L_0x0096:
            je7 r3 = r0.C0
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            k20 r4 = r2.d
            long r5 = r4.a
            k92 r7 = r13.b
            long r7 = r7.a
            long r9 = r1.c
            r14 = r3
            k4a r14 = (defpackage.k4a) r14
            java.lang.String r3 = r2.r
            java.lang.String r4 = r4.m
            r15 = 1
            r30 = r12
            long r11 = r1.b
            r25 = 1
            r26 = 1
            r16 = r5
            r18 = r7
            r20 = r9
            r22 = r11
            r24 = r3
            r27 = r4
            r14.L(r15, r16, r18, r20, r22, r24, r25, r26, r27)
            java.util.concurrent.ConcurrentHashMap r0 = r0.w1
            java.lang.String r1 = r2.r
            r2 = r30
            r0.putIfAbsent(r1, r2)
        L_0x00d0:
            r3 = r2
            goto L_0x00e8
        L_0x00d2:
            kke r4 = r0.Y
            w9a r4 = (defpackage.w9a) r4
            cx7 r4 = r4.c()
            f59 r5 = new f59
            r7 = 0
            r5.<init>(r0, r1, r7)
            r11.u0 = r6
            java.lang.Object r0 = defpackage.j47.t0(r4, r5, r11)
            if (r0 != r3) goto L_0x00d0
        L_0x00e8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.t(n59, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void u(n59 n59) {
        wha C = n59.C();
        C.e(new kia(woc.I));
        C.g(new eqe(oda.h0));
        n59.M(C);
        C.i();
    }

    public final eg9 A() {
        return (eg9) this.y1.getValue();
    }

    public final l89 B() {
        return (l89) this.t1.getValue();
    }

    public final wha C() {
        return (wha) this.I0.getValue();
    }

    public final w5f D() {
        return (w5f) this.s1.getValue();
    }

    public final void E(String str) {
        vxd S = j47.S(this.a, ((w9a) this.Y).b(), vx3.b, new a49(this, str, (Continuation) null));
        this.l1.o1(this, D1[3], S);
    }

    public final void F(String str) {
        String a;
        if (str != null && (a = ((fl7) ((al) this.U0.getValue())).a(str)) != null) {
            E(a);
        }
    }

    public final void G(long j) {
        j47.T(this.a, (lx3) null, (vx3) null, new c49(this, j, (Continuation) null), 3);
    }

    public final boolean H(o00 o00, long j, String str) {
        if (A().d()) {
            A().e(j);
            return true;
        } else if (o00 instanceof bk3) {
            return false;
        } else {
            if (((o00 instanceof f53) && str == null) || (o00 instanceof k50) || (o00 instanceof wgf)) {
                return false;
            }
            vx3 vx3 = vx3.b;
            e49 e49 = new e49(o00, this, j, str, (Continuation) null);
            vxd S = j47.S(this.a, this.B0, vx3, e49);
            this.k1.o1(this, D1[2], S);
            return true;
        }
    }

    public final boolean I(MessageModel messageModel) {
        this.j1.o1(this, D1[1], j47.S(this.a, this.B0, vx3.b, new g49(this, messageModel, (Continuation) null)));
        return messageModel.b != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034c, code lost:
        r14 = r0.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(int r21, java.util.List r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = defpackage.mda.y
            s35 r4 = r0.u1
            if (r1 != r3) goto L_0x0023
            java.lang.Object r0 = defpackage.x53.i0(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0022
            long r0 = r0.longValue()
            nnd r2 = new nnd
            r2.<init>(r0)
            defpackage.pnf.o(r4, r2)
            goto L_0x03c2
        L_0x0022:
            return
        L_0x0023:
            int r3 = defpackage.mda.v
            r5 = 0
            w7c r6 = r0.q1
            r7 = 1
            s35 r8 = r0.v1
            if (r1 != r3) goto L_0x0071
            int r0 = r22.size()
            if (r0 != r7) goto L_0x0063
            java.lang.Object r0 = defpackage.x53.i0(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0062
            long r0 = r0.longValue()
            j0e r3 = r6.a
            java.lang.Object r3 = r3.getValue()
            l29 r3 = (defpackage.l29) r3
            one.me.messages.list.loader.MessageModel r0 = r3.d(r0)
            if (r0 != 0) goto L_0x004e
            return
        L_0x004e:
            u29 r1 = defpackage.u29.c
            tz r0 = r0.u0
            o00 r0 = r0.d
            boolean r0 = r0 instanceof defpackage.zf5
            r1.getClass()
            c64 r0 = defpackage.u29.Z1(r2, r0)
            defpackage.pnf.o(r8, r0)
            goto L_0x03c2
        L_0x0062:
            return
        L_0x0063:
            u29 r0 = defpackage.u29.c
            r0.getClass()
            c64 r0 = defpackage.u29.Z1(r2, r5)
            defpackage.pnf.o(r8, r0)
            goto L_0x03c2
        L_0x0071:
            int r3 = defpackage.mda.q
            r9 = 2
            r10 = 0
            kke r11 = r0.Y
            if (r1 != r3) goto L_0x0089
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            n49 r3 = new n49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0089:
            int r3 = defpackage.mda.z
            if (r1 != r3) goto L_0x009d
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            p49 r3 = new p49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x009d:
            int r3 = defpackage.mda.w
            kotlinx.coroutines.internal.ContextScope r12 = r0.a
            if (r1 != r3) goto L_0x00bf
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            vx3 r3 = defpackage.vx3.b
            r49 r4 = new r49
            r4.<init>(r0, r2, r10)
            vxd r1 = defpackage.j47.S(r12, r1, r3, r4)
            bc7[] r2 = D1
            r2 = r2[r5]
            w4d r3 = r0.i1
            r3.o1(r0, r2, r1)
            goto L_0x03c2
        L_0x00bf:
            int r3 = defpackage.mda.s
            if (r1 != r3) goto L_0x00d3
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            s49 r3 = new s49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00d3:
            int r3 = defpackage.mda.m
            if (r1 != r3) goto L_0x00e7
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            t49 r3 = new t49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00e7:
            int r3 = defpackage.mda.n
            if (r1 != r3) goto L_0x00fb
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            u49 r3 = new u49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00fb:
            int r3 = defpackage.mda.k
            if (r1 != r3) goto L_0x0113
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0112
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.SPAM
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x0112:
            return
        L_0x0113:
            int r3 = defpackage.mda.j
            if (r1 != r3) goto L_0x012b
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x012a
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.PORNO
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x012a:
            return
        L_0x012b:
            int r3 = defpackage.mda.g
            if (r1 != r3) goto L_0x0143
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0142
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.EXTREMISM
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x0142:
            return
        L_0x0143:
            int r3 = defpackage.mda.h
            if (r1 != r3) goto L_0x015b
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x015a
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.FAKE
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x015a:
            return
        L_0x015b:
            int r3 = defpackage.mda.l
            if (r1 != r3) goto L_0x0173
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0172
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.THREAT
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x0172:
            return
        L_0x0173:
            int r3 = defpackage.mda.i
            if (r1 != r3) goto L_0x018b
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x018a
            long r1 = r1.longValue()
            da3 r3 = defpackage.da3.OTHER
            r0.v(r1, r3)
            goto L_0x03c2
        L_0x018a:
            return
        L_0x018b:
            int r3 = defpackage.mda.x
            r13 = 3
            if (r1 != r3) goto L_0x0224
            w7c r0 = r0.o1
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            e52 r0 = (defpackage.e52) r0
            if (r0 != 0) goto L_0x019d
            return
        L_0x019d:
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0223
            es8 r0 = r0.X
            if (r0 == 0) goto L_0x01e6
            mg3 r0 = defpackage.hs8.a
            fnd r0 = new fnd
            java.util.List r1 = java.util.Collections.singletonList(r1)
            int r2 = defpackage.oda.J
            eqe r3 = new eqe
            r3.<init>(r2)
            mg3 r2 = new mg3
            int r6 = defpackage.mda.o
            int r7 = defpackage.oda.H
            eqe r8 = new eqe
            r8.<init>(r7)
            r2.<init>(r6, r8, r13, r5)
            mg3 r6 = new mg3
            int r7 = defpackage.mda.p
            int r8 = defpackage.oda.I
            eqe r9 = new eqe
            r9.<init>(r8)
            r6.<init>(r7, r9, r13, r5)
            mg3 r5 = defpackage.hs8.a
            mg3[] r2 = new defpackage.mg3[]{r2, r6, r5}
            java.util.List r2 = defpackage.y53.M(r2)
            r0.<init>(r1, r3, r10, r2)
            defpackage.pnf.o(r4, r0)
            goto L_0x03c2
        L_0x01e6:
            mg3 r0 = defpackage.hs8.a
            fnd r0 = new fnd
            java.util.List r1 = java.util.Collections.singletonList(r1)
            int r2 = defpackage.oda.G
            eqe r3 = new eqe
            r3.<init>(r2)
            mg3 r2 = new mg3
            int r6 = defpackage.mda.o
            int r7 = defpackage.oda.H
            eqe r8 = new eqe
            r8.<init>(r7)
            r2.<init>(r6, r8, r13, r5)
            mg3 r6 = new mg3
            int r7 = defpackage.mda.p
            int r8 = defpackage.oda.I
            eqe r9 = new eqe
            r9.<init>(r8)
            r6.<init>(r7, r9, r13, r5)
            mg3 r5 = defpackage.hs8.a
            mg3[] r2 = new defpackage.mg3[]{r2, r6, r5}
            java.util.List r2 = defpackage.y53.M(r2)
            r0.<init>(r1, r3, r10, r2)
            defpackage.pnf.o(r4, r0)
            goto L_0x03c2
        L_0x0223:
            return
        L_0x0224:
            int r3 = defpackage.mda.o
            if (r1 != r3) goto L_0x0238
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            v49 r3 = new v49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0238:
            int r3 = defpackage.mda.p
            if (r1 != r3) goto L_0x024c
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            w49 r3 = new w49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x024c:
            int r3 = defpackage.mda.C
            if (r1 != r3) goto L_0x0260
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            x49 r3 = new x49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0260:
            int r3 = defpackage.mda.B
            if (r1 != r3) goto L_0x027a
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0279
            long r1 = r1.longValue()
            eg9 r0 = r20.A()
            r0.e(r1)
            goto L_0x03c2
        L_0x0279:
            return
        L_0x027a:
            int r3 = defpackage.mda.u
            if (r1 != r3) goto L_0x0295
            java.lang.Object r0 = defpackage.x53.i0(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0294
            long r0 = r0.longValue()
            hnd r2 = new hnd
            r2.<init>(r0)
            defpackage.pnf.o(r4, r2)
            goto L_0x03c2
        L_0x0294:
            return
        L_0x0295:
            int r3 = defpackage.mda.c
            if (r1 != r3) goto L_0x02a9
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            j49 r3 = new j49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x02a9:
            int r3 = defpackage.mda.b
            if (r1 != r3) goto L_0x02bd
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            l49 r2 = new l49
            r2.<init>(r0, r10)
            defpackage.pnf.n(r0, r1, r10, r2, r9)
            goto L_0x03c2
        L_0x02bd:
            int r3 = defpackage.mda.a
            if (r1 != r3) goto L_0x02d1
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            m49 r3 = new m49
            r3.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x02d1:
            int r3 = defpackage.mda.A
            java.util.HashSet r4 = r0.x1
            if (r1 != r3) goto L_0x02fe
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x02fd
            long r2 = r1.longValue()
            boolean r5 = r4.contains(r1)
            if (r5 == 0) goto L_0x02ea
            return
        L_0x02ea:
            r4.add(r1)
            w9a r11 = (defpackage.w9a) r11
            nx3 r1 = r11.b()
            r39 r4 = new r39
            r4.<init>(r0, r2, r10)
            defpackage.pnf.n(r0, r1, r10, r4, r9)
            goto L_0x03c2
        L_0x02fd:
            return
        L_0x02fe:
            int r3 = defpackage.mda.r
            if (r1 != r3) goto L_0x0340
            java.lang.Object r1 = defpackage.x53.i0(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x033f
            long r2 = r1.longValue()
            boolean r5 = r4.contains(r1)
            if (r5 == 0) goto L_0x0315
            return
        L_0x0315:
            r4.add(r1)
            fc3 r1 = r0.w0
            r1.getClass()
            zw3 r4 = new zw3
            r4.<init>(r1, r2, r10)
            mqc r5 = new mqc
            r5.<init>(r4)
            java.lang.Object r1 = r1.b
            nx3 r1 = (defpackage.nx3) r1
            mn5 r1 = defpackage.od2.F(r5, r1)
            q39 r4 = new q39
            r4.<init>(r0, r2, r10)
            zn5 r0 = new zn5
            r2 = 5
            r0.<init>(r1, r4, r2)
            defpackage.od2.L(r0, r12)
            goto L_0x03c2
        L_0x033f:
            return
        L_0x0340:
            int r0 = defpackage.mwb.messages_list_context_action_share_externally
            if (r1 != r0) goto L_0x03c2
            java.lang.Object r0 = defpackage.x53.i0(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x03c2
            long r14 = r0.longValue()
            j0e r0 = r6.a
            java.lang.Object r0 = r0.getValue()
            l29 r0 = (defpackage.l29) r0
            one.me.messages.list.loader.MessageModel r0 = r0.d(r14)
            if (r0 != 0) goto L_0x035f
            return
        L_0x035f:
            tz r0 = r0.u0
            o00 r0 = r0.d
            if (r0 != 0) goto L_0x0366
            return
        L_0x0366:
            boolean r1 = r0 instanceof defpackage.zf5
            if (r1 == 0) goto L_0x03a3
            zf5 r0 = (defpackage.zf5) r0
            u29 r1 = defpackage.u29.c
            int r2 = r0.j
            int r2 = defpackage.au1.s(r2)
            if (r2 == 0) goto L_0x038d
            if (r2 == r7) goto L_0x038a
            if (r2 == r9) goto L_0x0387
            if (r2 != r13) goto L_0x0381
            en4 r2 = defpackage.en4.s0
        L_0x037e:
            r19 = r2
            goto L_0x0390
        L_0x0381:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0387:
            en4 r2 = defpackage.en4.Y
            goto L_0x037e
        L_0x038a:
            en4 r2 = defpackage.en4.b
            goto L_0x037e
        L_0x038d:
            en4 r2 = defpackage.en4.o
            goto L_0x037e
        L_0x0390:
            r1.getClass()
            long r1 = r0.a
            java.lang.String r0 = r0.c
            r16 = r1
            r18 = r0
            c64 r0 = defpackage.u29.a2(r14, r16, r18, r19)
            defpackage.pnf.o(r8, r0)
            goto L_0x03c2
        L_0x03a3:
            boolean r1 = r0 instanceof defpackage.bsd
            if (r1 == 0) goto L_0x03c2
            bsd r0 = (defpackage.bsd) r0
            u29 r1 = defpackage.u29.c
            wcf r2 = r0.c
            long r2 = r2.a
            en4 r19 = defpackage.en4.b
            r1.getClass()
            java.lang.String r0 = r0.b
            r16 = r2
            r18 = r0
            c64 r0 = defpackage.u29.a2(r14, r16, r18, r19)
            defpackage.pnf.o(r8, r0)
        L_0x03c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.J(int, java.util.List):void");
    }

    public final void K(long j, boolean z, boolean z2, boolean z3) {
        this.x1.remove(Long.valueOf(j));
        if (z) {
            int i = z2 ? oda.s0 : z3 ? oda.q0 : oda.r0;
            wha C = C();
            C.e(new kia(woc.m));
            C.g(new eqe(i));
            M(C);
            C.i();
            return;
        }
        wha C2 = C();
        C2.e(new kia(woc.I));
        C2.g(new eqe(oda.t0));
        M(C2);
        C2.i();
    }

    public final void L(boolean z) {
        Object value;
        l89 B = B();
        String str = B.i;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("Update scroll to bottom state, visible:", z), (Throwable) null);
        }
        q0e q0e = B.m;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, bxc.a((bxc) value, 0, z, false, (axc) null, 13)));
    }

    public final void M(wha wha) {
        wha.c(new eia(0, 0, this.C1, 3));
    }

    public final void p() {
        ((bx) this.o).h();
        z3b z3b = this.Z;
        w4d w4d = z3b.d;
        bc7[] bc7Arr = z3b.i;
        x77 x77 = (x77) w4d.T0(z3b, bc7Arr[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        z3b.d.o1(z3b, bc7Arr[0], (Object) null);
        z3b.e.setValue((Object) null);
        ((uh9) z3b.a).s(z3b.g);
        this.w1.clear();
        this.x1.clear();
        i00 i00 = this.z0;
        w4d w4d2 = i00.d;
        bc7[] bc7Arr2 = i00.f;
        x77 x772 = (x77) w4d2.T0(i00, bc7Arr2[0]);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        i00.d.o1(i00, bc7Arr2[0], (Object) null);
        i00.e.setValue((Object) null);
    }

    public final void v(long j, da3 da3) {
        pnf.n(this, ((w9a) this.Y).b(), (vx3) null, new p39(this, da3, j, (Continuation) null), 2);
    }

    public final tx8 w() {
        e52 e52 = (e52) this.o1.a.getValue();
        if (e52 == null) {
            return null;
        }
        boolean I = e52.I();
        k92 k92 = e52.b;
        if (I) {
            return new px8(k92.a);
        }
        if (e52.H()) {
            uj3 l = e52.l();
            if (l != null) {
                return new rx8(l.n());
            }
            return null;
        } else if (!e52.M()) {
            return new qx8(k92.a);
        } else {
            uj3 l2 = e52.l();
            if (l2 != null) {
                return new sx8(l2.n());
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(long r6, java.lang.String r8, long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof defpackage.s39
            if (r0 == 0) goto L_0x0013
            r0 = r12
            s39 r0 = (defpackage.s39) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            s39 r0 = new s39
            r0.<init>(r5, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.String r8 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x0092
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            defpackage.od2.a0(r12)
            je7 r12 = r5.D0
            java.lang.Object r12 = r12.getValue()
            y7d r12 = (defpackage.y7d) r12
            qyc r12 = (defpackage.qyc) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f93newmediaviewerenabled
            r4 = 0
            boolean r12 = r12.n(r2, r4)
            if (r12 == 0) goto L_0x007b
            u29 r5 = defpackage.u29.c
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = ":attach/viewer?chat_id="
            r5.<init>(r12)
            r5.append(r6)
            java.lang.String r6 = "&attach_id="
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = "&msg_id="
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = "&single="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            c64 r6 = new c64
            r6.<init>(r5)
            goto L_0x00af
        L_0x007b:
            je7 r5 = r5.P0
            java.lang.Object r5 = r5.getValue()
            tp7 r5 = (defpackage.tp7) r5
            q1a r5 = defpackage.tp7.a(r5, r9)
            r0.o = r8
            r0.Z = r3
            java.lang.Object r12 = defpackage.s36.f(r5, r0)
            if (r12 != r1) goto L_0x0092
            return r1
        L_0x0092:
            es8 r12 = (defpackage.es8) r12
            o19 r5 = defpackage.o19.a
            v4 r5 = r5.getAccessor()
            java.lang.Class<df7> r6 = defpackage.df7.class
            java.lang.Object r5 = r5.c(r6)
            df7 r5 = (defpackage.df7) r5
            r5.getClass()
            xw8 r5 = new xw8
            r5.<init>((defpackage.es8) r12)
            dma r6 = new dma
            r6.<init>(r5, r8)
        L_0x00af:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.x(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.t39
            if (r0 == 0) goto L_0x0013
            r0 = r11
            t39 r0 = (defpackage.t39) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            t39 r0 = new t39
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r11)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            defpackage.od2.a0(r11)
            je7 r8 = r8.F0
            java.lang.Object r8 = r8.getValue()
            ns8 r8 = (defpackage.ns8) r8
            r0.Y = r3
            java.io.Serializable r11 = r8.c(r9, r0)
            if (r11 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            at r8 = new at
            r9 = 2
            r8.<init>(r9, r11)
            g27 r9 = new g27
            r10 = 22
            r9.<init>(r10)
            qk5 r8 = defpackage.l6d.a0(r8, r9)
            om8 r9 = new om8
            is8 r2 = defpackage.is8.a
            java.lang.Class<is8> r3 = defpackage.is8.class
            java.lang.String r4 = "convert"
            r1 = 1
            java.lang.String r5 = "convert$message_list_release(Lru/ok/tamtam/messages/MessageAction;)Lone/me/sdk/contextmenu/ContextMenuAction;"
            r6 = 0
            r7 = 5
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1f r10 = new r1f
            r10.<init>(r8, r9)
            java.util.List r8 = defpackage.l6d.i0(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final k6f z() {
        return (k6f) this.R0.getValue();
    }
}
