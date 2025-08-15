package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nf3  reason: default package */
public final class nf3 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ of3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf3(of3 of3, Continuation continuation) {
        super(2, continuation);
        this.Z = of3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nf3(this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = -1
            of3 r4 = r10.Z
            r5 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r5) goto L_0x0013
            long r6 = r10.X
            defpackage.od2.a0(r11)
            goto L_0x0046
        L_0x0013:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001b:
            defpackage.od2.a0(r11)
            q0e r11 = r4.y0
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
        L_0x002a:
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0048
            q0e r11 = r4.y0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            r8 = 0
            r11.m(r8, r1)
            r10.X = r6
            r10.Y = r5
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = defpackage.j47.x(r8, r10)
            if (r11 != r0) goto L_0x0046
            return r0
        L_0x0046:
            long r6 = r6 + r2
            goto L_0x002a
        L_0x0048:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf3.o(java.lang.Object):java.lang.Object");
    }
}
