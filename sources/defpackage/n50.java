package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n50  reason: default package */
public final class n50 extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ p50 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n50(p50 p50, Continuation continuation) {
        super(2, continuation);
        this.Y = p50;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float valueOf = Float.valueOf(((Number) obj).floatValue());
        e5f e5f = e5f.a;
        ((n50) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n50 n50 = new n50(this.Y, continuation);
        n50.X = ((Number) obj).floatValue();
        return n50;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (defpackage.tpa.f(r1, defpackage.vu4.a) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            defpackage.od2.a0(r5)
            float r5 = r4.X
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r5)
            p50 r4 = r4.Y
            v50 r5 = r4.Q0
            r1 = 0
            if (r5 == 0) goto L_0x0014
            java.lang.Long r5 = r5.a
            goto L_0x0015
        L_0x0014:
            r5 = r1
        L_0x0015:
            u70 r2 = r4.D0
            if (r5 == 0) goto L_0x0043
            java.lang.Long r3 = r4.O0
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0030
            v50 r3 = r4.Q0
            if (r3 == 0) goto L_0x0027
            l30 r1 = r3.c
        L_0x0027:
            vu4 r3 = defpackage.vu4.a
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 == 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            boolean r1 = r2.G0
            if (r1 == 0) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            float r0 = r0.floatValue()
            java.lang.Long r4 = r4.O0
            boolean r4 = r5.equals(r4)
            r2.c(r0, r4)
            goto L_0x0048
        L_0x0043:
            r4 = 0
            r5 = 0
            r2.c(r4, r5)
        L_0x0048:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n50.o(java.lang.Object):java.lang.Object");
    }
}
