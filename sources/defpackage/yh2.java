package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yh2  reason: default package */
public final class yh2 extends ffe implements a66 {
    public Object X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ gi2 s0;
    public final /* synthetic */ xm8 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh2(gi2 gi2, xm8 xm8, Continuation continuation) {
        super(2, continuation);
        this.s0 = gi2;
        this.t0 = xm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yh2(this.s0, this.t0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: gi2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Z
            e5f r2 = defpackage.e5f.a
            xm8 r3 = r9.t0
            r4 = 2
            r5 = 1
            gi2 r6 = r9.s0
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0025
            if (r1 != r4) goto L_0x001d
            s35 r0 = r9.Y
            java.lang.Object r9 = r9.X
            r6 = r9
            gi2 r6 = (defpackage.gi2) r6
            defpackage.od2.a0(r10)
            goto L_0x0065
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0025:
            java.lang.Object r1 = r9.X
            e52 r1 = (defpackage.e52) r1
            defpackage.od2.a0(r10)
            goto L_0x0048
        L_0x002d:
            defpackage.od2.a0(r10)
            bc7[] r10 = defpackage.gi2.R0
            e52 r1 = r6.v()
            if (r1 != 0) goto L_0x0039
            return r2
        L_0x0039:
            long r7 = r3.j()
            r9.X = r1
            r9.Z = r5
            java.lang.Object r10 = r6.y(r7, r9)
            if (r10 != r0) goto L_0x0048
            return r0
        L_0x0048:
            es8 r10 = (defpackage.es8) r10
            if (r10 != 0) goto L_0x004d
            return r2
        L_0x004d:
            s35 r5 = r6.K0
            khe r7 = r6.H0
            java.lang.Object r7 = r7.getValue()
            yd2 r7 = (defpackage.yd2) r7
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            java.lang.Object r10 = r7.b(r1, r10, r3, r9)
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r0 = r5
        L_0x0065:
            bc7[] r9 = defpackage.gi2.R0
            r6.getClass()
            defpackage.pnf.o(r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh2.o(java.lang.Object):java.lang.Object");
    }
}
