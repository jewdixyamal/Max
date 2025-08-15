package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: zb2  reason: default package */
public final class zb2 implements ta2, qu7 {
    public static final String K0 = nec.a(zb2.class).b();
    public sd7 A0;
    public final khe B0;
    public final aj9 C0;
    public volatile at5 D0;
    public final AtomicBoolean E0;
    public final ConcurrentHashMap F0;
    public final khe G0;
    public vxd H0;
    public x77 I0;
    public final AtomicBoolean J0;
    public final q0e X;
    public final lx3 Y;
    public final ContextScope Z;
    public final je7 a;
    public final khe b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public ConcurrentHashMap t0 = new ConcurrentHashMap();
    public final HashMap u0 = new HashMap();
    public final je7 v0;
    public final je7 w0;
    public final xpb x0;
    public vxd y0;
    public vxd z0;

    public zb2(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, av0 av0, je7 je76, je7 je77, o45 o45, je7 je78) {
        this.a = je76;
        khe khe = new khe(new z30(8, je73));
        this.b = khe;
        this.c = je72;
        this.o = je78;
        q0e a2 = r0e.a((Object) null);
        this.X = a2;
        lx3 plus = ((nx3) khe.getValue()).plus(xq9.a);
        this.Y = plus;
        ContextScope a3 = j1e.a(plus.plus(new qj(o45)));
        this.Z = a3;
        this.s0 = tu0.r(2, new z30(9, je7));
        this.v0 = je74;
        this.w0 = je75;
        this.x0 = new xpb();
        this.B0 = new khe(new ua2(this, 0));
        this.C0 = bj9.a();
        this.E0 = new AtomicBoolean(false);
        this.F0 = new ConcurrentHashMap();
        this.G0 = new khe(new ua2(this, 1));
        this.J0 = new AtomicBoolean(false);
        i();
        h();
        av0.d(new va2(this));
        od2.L(new zn5(new t03(a2, 11), new wa2(je77, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.zb2 r7, java.util.ArrayList r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.qb2
            if (r0 == 0) goto L_0x0016
            r0 = r10
            qb2 r0 = (defpackage.qb2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x001b
        L_0x0016:
            qb2 r0 = new qb2
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.util.Iterator r7 = r0.Z
            java.util.Collection r8 = r0.Y
            java.util.Comparator r9 = r0.X
            zb2 r2 = r0.o
            defpackage.od2.a0(r10)
            r6 = r0
            r0 = r8
            r8 = r2
        L_0x0034:
            r2 = r6
            goto L_0x008c
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            defpackage.od2.a0(r10)
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x004a
            nz4 r1 = defpackage.nz4.a
            goto L_0x009c
        L_0x004a:
            if (r9 == 0) goto L_0x004f
            v00 r9 = defpackage.p82.J
            goto L_0x0051
        L_0x004f:
            v00 r9 = defpackage.p82.I
        L_0x0051:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x005d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r7.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            je7 r2 = r8.v0
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r7
            r0.u0 = r3
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r2 = r2.k(r4, r0)
            if (r2 != r1) goto L_0x0088
            goto L_0x009c
        L_0x0088:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L_0x0034
        L_0x008c:
            e52 r10 = (defpackage.e52) r10
            if (r10 == 0) goto L_0x0093
            r0.add(r10)
        L_0x0093:
            r10 = r0
            r0 = r2
            goto L_0x005d
        L_0x0096:
            java.util.List r10 = (java.util.List) r10
            java.util.List r1 = defpackage.x53.x0(r10, r9)
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.b(zb2, java.util.ArrayList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object j(zb2 zb2, List list, boolean z, Continuation continuation) {
        zb2.getClass();
        Object k = j1e.k(new rb2(zb2, list, z, (k56) null, (Continuation) null), continuation);
        return k == tx3.a ? k : e5f.a;
    }

    public final void a() {
        hm9.m(K0, "onLogout", new Object[0]);
        this.X.m((Object) null, nz4.a);
        vxd vxd = this.H0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        vxd vxd2 = this.y0;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        vxd vxd3 = this.z0;
        if (vxd3 != null) {
            vxd3.cancel((CancellationException) null);
        }
        sd7 sd7 = this.A0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        this.t0.clear();
        this.u0.clear();
        Object unused = j47.f0(hz4.a, new lb2(this, (Continuation) null));
    }

    public final Object c(String str, Continuation continuation) {
        Object t02 = j47.t0(this.Y, new ab2(this, str, (Continuation) null), continuation);
        return t02 == tx3.a ? t02 : e5f.a;
    }

    public final Object d(String str, Continuation continuation) {
        boolean f = tpa.f(str, "all.chat.folder");
        lx3 lx3 = this.Y;
        return f ? j47.t0(lx3, new db2(this, (Continuation) null), continuation) : j47.t0(lx3, new eb2(this, str, (Continuation) null), continuation);
    }

    public final alc e() {
        return (alc) this.s0.getValue();
    }

    public final void f(List list, Set set) {
        x77 x77 = this.I0;
        if (x77 == null || (x77.isCompleted() && !this.J0.get())) {
            this.z0 = j47.T(this.Z, (lx3) null, (vx3) null, new ib2(this, list, set, (Continuation) null), 3);
        }
    }

    public final t03 g() {
        return new t03(new w7c(this.X), 11);
    }

    public final void h() {
        sd7 sd7 = this.A0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        xpb xpb = this.x0;
        xpb.getClass();
        ztc a2 = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        o1a o1a = new o1a(xpb, 1, timeUnit, a2, true);
        sd7 sd72 = new sd7(new wd6(8, (Object) this), ft.f, ft.d);
        o1a.a(sd72);
        this.A0 = sd72;
    }

    public final void i() {
        vxd vxd = this.y0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        alc e = e();
        e.getClass();
        ykc ykc = new ykc(e, xlc.a(0, "SELECT * FROM chat_folder"), 0);
        this.y0 = od2.L(new zn5(new xk1(od2.F(new mqc(new cy3(e.a, new String[]{"chat_folder"}, ykc, (Continuation) null)), (nx3) this.b.getValue()), 12), new pb2(this, (Continuation) null), 5), this.Z);
    }

    public final void k(long j, e52 e52) {
        vxd vxd = this.H0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        ub2 ub2 = new ub2(this, j, e52, (Continuation) null);
        this.H0 = j47.T(this.Z, this.Y, (vx3) null, ub2, 2);
    }
}
