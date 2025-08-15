package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: bp8  reason: default package */
public final class bp8 extends pnf {
    public final k56 X;
    public final do8 Y;
    public final je7 Z;
    public final long b;
    public final ek2 c;
    public final Integer o;
    public final je7 s0;
    public final je7 t0;
    public Set u0 = wz4.a;
    public vxd v0;
    public final khe w0 = new khe(new zj7(4, this));
    public final w7c x0;
    public final ac y0;

    public bp8(long j, ek2 ek2, khe khe, Integer num, cp8 cp8, k56 k56) {
        ko8 ko8 = ko8.a;
        khe d = ko8.getAccessor().d(kke.class);
        khe d2 = ko8.getAccessor().d(ds3.class);
        this.b = j;
        this.c = ek2;
        this.o = num;
        this.X = cp8;
        this.Y = (do8) ko8.getAccessor().c(do8.class);
        this.Z = d;
        this.s0 = khe;
        this.t0 = d2;
        mn5 F = od2.F(od2.d0(new ap8(((lp8) khe.getValue()).d(), this, 0), new vp5((Continuation) null, (Object) this, 7)), ((w9a) ((kke) d.getValue())).a());
        nz4 nz4 = nz4.a;
        w7c X2 = od2.X(F, this.a, wld.a, nz4);
        this.x0 = X2;
        this.y0 = od2.t(X2, ((lp8) khe.getValue()).b(), (mn5) k56.invoke(), new mk1(this, (Continuation) null, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r12 == r1) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        if (r12 == r1) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.yn8 r9, defpackage.bp8 r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.wo8
            if (r0 == 0) goto L_0x0016
            r0 = r12
            wo8 r0 = (defpackage.wo8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            wo8 r0 = new wo8
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            defpackage.od2.a0(r12)
            goto L_0x00ee
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.util.List r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x006a
        L_0x003c:
            defpackage.od2.a0(r12)
            boolean r12 = r9 instanceof defpackage.vn8
            ek2 r2 = r10.c
            long r5 = r10.b
            if (r12 == 0) goto L_0x0077
            vn8 r9 = (defpackage.vn8) r9
            long r7 = r9.a
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x00f1
            ek2 r12 = r9.b
            if (r12 != r2) goto L_0x00f1
            java.util.Collection r9 = r9.c
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x005d
            goto L_0x00f1
        L_0x005d:
            r0.o = r11
            r0.Z = r4
            java.lang.Object r12 = r10.r(r9, r0)
            if (r12 != r1) goto L_0x006a
        L_0x0067:
            r11 = r1
            goto L_0x00f1
        L_0x006a:
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r9 = defpackage.x53.t0(r11, r12)
            java.util.Set r9 = defpackage.x53.H0(r9)
        L_0x0074:
            r11 = r9
            goto L_0x00f1
        L_0x0077:
            boolean r12 = r9 instanceof defpackage.xn8
            if (r12 == 0) goto L_0x00c0
            xn8 r9 = (defpackage.xn8) r9
            long r0 = r9.a
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x00f1
            ek2 r10 = r9.b
            if (r10 != r2) goto L_0x00f1
            java.util.Collection r9 = r9.c
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0090
            goto L_0x00f1
        L_0x0090:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x0099:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r12.next()
            r1 = r0
            kn8 r1 = (defpackage.kn8) r1
            long r1 = r1.a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            boolean r1 = r9.contains(r3)
            if (r1 == 0) goto L_0x0099
            r10.add(r0)
            goto L_0x0099
        L_0x00b7:
            java.util.Set r9 = defpackage.x53.H0(r10)
            java.util.List r9 = defpackage.x53.s0(r11, r9)
            goto L_0x0074
        L_0x00c0:
            boolean r12 = r9 instanceof defpackage.wn8
            if (r12 == 0) goto L_0x00f2
            r12 = r9
            wn8 r12 = (defpackage.wn8) r12
            java.util.List r12 = r12.a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00d0
            goto L_0x00f1
        L_0x00d0:
            je7 r12 = r10.Z
            java.lang.Object r12 = r12.getValue()
            kke r12 = (defpackage.kke) r12
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.a()
            xo8 r2 = new xo8
            r4 = 0
            r2.<init>(r9, r10, r11, r4)
            r0.Z = r3
            java.lang.Object r12 = defpackage.j47.t0(r12, r2, r0)
            if (r12 != r1) goto L_0x00ee
            goto L_0x0067
        L_0x00ee:
            java.util.Collection r12 = (java.util.Collection) r12
            r11 = r12
        L_0x00f1:
            return r11
        L_0x00f2:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp8.q(yn8, bp8, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.util.Collection r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.uo8
            if (r0 == 0) goto L_0x0013
            r0 = r9
            uo8 r0 = (defpackage.uo8) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            uo8 r0 = new uo8
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r9)
            goto L_0x0079
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            defpackage.od2.a0(r9)
            je7 r9 = r7.Z
            java.lang.Object r9 = r9.getValue()
            kke r9 = (defpackage.kke) r9
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            if (r9 != 0) goto L_0x0044
            lx3 r9 = r0.b
        L_0x0044:
            kotlinx.coroutines.internal.ContextScope r9 = defpackage.j1e.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x0057:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r8.next()
            to8 r5 = new to8
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zf4 r4 = defpackage.j47.h(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x0057
        L_0x0070:
            r0.Y = r3
            java.lang.Object r9 = defpackage.pag.c(r2, r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = defpackage.x53.e0(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp8.r(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
