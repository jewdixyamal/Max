package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e6e  reason: default package */
public final class e6e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ g6e s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e6e(g6e g6e, Continuation continuation) {
        super(2, continuation);
        this.s0 = g6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e6e e6e = new e6e(this.s0, continuation);
        e6e.Z = obj;
        return e6e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.Y
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0026
            if (r1 == r2) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            u4e r0 = r12.X
            java.lang.Object r1 = r12.Z
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r13)
            goto L_0x0077
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001e:
            java.lang.Object r1 = r12.Z
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r13)
            goto L_0x0056
        L_0x0026:
            defpackage.od2.a0(r13)
            java.lang.Object r13 = r12.Z
            sx3 r13 = (defpackage.sx3) r13
            g6e r1 = r12.s0
            java.util.concurrent.atomic.AtomicReference r1 = r1.g
            java.lang.Object r1 = r1.get()
            c6e r1 = (defpackage.c6e) r1
            g6e r4 = r12.s0
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            r5 = r4
            y4e r5 = (defpackage.y4e) r5
            java.lang.String r6 = r1.b
            long r7 = r1.a
            r12.Z = r13
            r12.Y = r2
            r10 = 4
            r9 = r12
            java.lang.Object r1 = defpackage.y4e.d(r5, r6, r7, r9, r10)
            if (r1 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x0056:
            u4e r13 = (defpackage.u4e) r13
            g6e r2 = r12.s0
            je7 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            a4e r2 = (defpackage.a4e) r2
            java.util.List r4 = r13.a
            uqd r2 = r2.c(r4)
            r12.Z = r1
            r12.X = r13
            r12.Y = r3
            java.lang.Object r2 = defpackage.s36.f(r2, r12)
            if (r2 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r0 = r13
            r13 = r2
        L_0x0077:
            java.util.List r13 = (java.util.List) r13
            g6e r2 = r12.s0
            java.util.concurrent.atomic.AtomicReference r2 = r2.g
            y5e r4 = new y5e
            r5 = 1
            r4.<init>(r0, r5)
            r2.updateAndGet(r4)
            g6e r2 = r12.s0
            q0e r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            d6e r2 = (defpackage.d6e) r2
            java.util.List r2 = r2.a
            if (r2 != 0) goto L_0x0096
            nz4 r2 = defpackage.nz4.a
        L_0x0096:
            java.util.ArrayList r13 = defpackage.x53.t0(r2, r13)
            g6e r12 = r12.s0
            q0e r12 = r12.d
            d6e r2 = new d6e
            r4 = 0
            r2.<init>(r3, r4, r13)
            r13 = 0
            r12.m(r13, r2)
            java.lang.Class r12 = r1.getClass()
            java.lang.String r12 = r12.getName()
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x00b5
            goto L_0x00de
        L_0x00b5:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x00de
            us7 r2 = defpackage.us7.X
            java.util.List r3 = r0.a
            int r3 = r3.size()
            long r4 = r0.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Stickers sets search. LoadNext. finish, size:"
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r3 = "|marker:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.d(r2, r12, r0, r13)
        L_0x00de:
            e5f r12 = defpackage.e5f.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6e.o(java.lang.Object):java.lang.Object");
    }
}
