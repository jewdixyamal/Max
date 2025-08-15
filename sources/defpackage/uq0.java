package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: uq0  reason: default package */
public final class uq0 {
    public final yu2 a;
    public final q33 b;
    public final t03 c;

    public uq0(yu2 yu2, q33 q33, bt2 bt2, kke kke) {
        this.a = yu2;
        this.b = q33;
        ContextScope a2 = j1e.a(((w9a) kke).a().limitedParallelism(1, "bottom-bar-counters"));
        v7c v7c = new v7c(bt2.a);
        int i = ft4.o;
        this.c = new t03(od2.X(new zn5(od2.M(m6d.O(v7c, z7.R(1, kt4.SECONDS)), new rq0(this, (Continuation) null)), new sq0(this, (Continuation) null)), a2, wld.b, (Object) null), 11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.uq0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.tq0
            if (r0 == 0) goto L_0x0016
            r0 = r7
            tq0 r0 = (defpackage.tq0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            tq0 r0 = new tq0
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            ru2 r6 = r0.X
            uq0 r0 = r0.o
            defpackage.od2.a0(r7)
            r1 = r6
            r6 = r0
            goto L_0x0050
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            defpackage.od2.a0(r7)
            ru2 r7 = defpackage.ru2.a
            r0.o = r6
            r0.X = r7
            r0.s0 = r3
            yu2 r0 = r6.a
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Object r0 = r0.r(r7)
            if (r0 != r1) goto L_0x004e
            goto L_0x009d
        L_0x004e:
            r1 = r7
            r7 = r0
        L_0x0050:
            java.util.List r7 = (java.util.List) r7
            yu2 r0 = r6.a
            jz2 r0 = (defpackage.jz2) r0
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r0 = r0.s(r1, r2, r4, r5)
            java.util.ArrayList r7 = defpackage.x53.t0(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x006f
            goto L_0x0097
        L_0x006f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0073:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r7.next()
            e52 r0 = (defpackage.e52) r0
            k92 r2 = r0.b
            int r2 = r2.m
            if (r2 <= 0) goto L_0x0073
            q33 r2 = r6.b
            boolean r0 = r0.V(r2)
            if (r0 != 0) goto L_0x0073
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x0092
            goto L_0x0073
        L_0x0092:
            defpackage.y53.Q()
            r6 = 0
            throw r6
        L_0x0097:
            hy3 r6 = new hy3
            r6.<init>(r1)
            r1 = r6
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.a(uq0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
