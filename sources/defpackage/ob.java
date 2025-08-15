package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ob  reason: default package */
public final class ob extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob(pb pbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ob) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ob(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            pb r6 = r7.Y
            if (r1 == 0) goto L_0x0027
            if (r1 == r5) goto L_0x0023
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            defpackage.od2.a0(r8)
            goto L_0x0066
        L_0x0017:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001f:
            defpackage.od2.a0(r8)
            goto L_0x0042
        L_0x0023:
            defpackage.od2.a0(r8)
            goto L_0x0033
        L_0x0027:
            defpackage.od2.a0(r8)
            r7.X = r5
            java.lang.Object r8 = defpackage.pb.a(r6, r7)
            if (r8 != r0) goto L_0x0033
            return r0
        L_0x0033:
            c6d r8 = (defpackage.c6d) r8
            java.util.List r8 = defpackage.l6d.i0(r8)
            r7.X = r4
            java.lang.Object r8 = defpackage.pag.c(r8, r7)
            if (r8 != r0) goto L_0x0042
            return r0
        L_0x0042:
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            je7 r8 = r6.b
            java.lang.Object r8 = r8.getValue()
            oq3 r8 = (defpackage.oq3) r8
            k8 r4 = new k8
            r5 = 8
            r4.<init>(r5)
            r8.c(r1, r4)
            r7.X = r3
            r7 = 0
            q0e r8 = r6.i
            r8.m(r7, r1)
            if (r2 != r0) goto L_0x0066
            return r0
        L_0x0066:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.g
            r8 = 0
            r7.set(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.o(java.lang.Object):java.lang.Object");
    }
}
