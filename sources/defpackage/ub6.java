package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ub6  reason: default package */
public final class ub6 extends ffe implements a66 {
    public iy2 X;
    public int Y;
    public final /* synthetic */ xb6 Z;
    public final /* synthetic */ ta3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub6(xb6 xb6, ua3 ua3, Continuation continuation) {
        super(2, continuation);
        this.Z = xb6;
        this.s0 = ua3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ub6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ub6(this.Z, (ua3) this.s0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: iy2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.od2.a0(r6)
            goto L_0x004d
        L_0x0010:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            iy2 r1 = r5.X
            defpackage.od2.a0(r6)
            goto L_0x003b
        L_0x001e:
            defpackage.od2.a0(r6)
            xb6 r6 = r5.Z
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            r1 = r6
            iy2 r1 = (defpackage.iy2) r1
            r5.X = r1
            r5.Y = r3
            ta3 r6 = r5.s0
            ua3 r6 = (defpackage.ua3) r6
            java.lang.Object r6 = r6.awaitInternal(r5)
            if (r6 != r0) goto L_0x003b
            return r0
        L_0x003b:
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r6 = 0
            r5.X = r6
            r5.Y = r2
            java.lang.Object r6 = r1.d(r3, r5)
            if (r6 != r0) goto L_0x004d
            return r0
        L_0x004d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub6.o(java.lang.Object):java.lang.Object");
    }
}
