package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ym9  reason: default package */
public final class ym9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ an9 Z;
    public final /* synthetic */ wuc s0;
    public final /* synthetic */ spa t0;
    public final /* synthetic */ ms7 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym9(int i, an9 an9, wuc wuc, spa spa, ms7 ms7, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = an9;
        this.s0 = wuc;
        this.t0 = spa;
        this.u0 = ms7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ym9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ym9(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.X
            wuc r2 = r12.s0
            r3 = 1
            e5f r4 = defpackage.e5f.a
            an9 r5 = r12.Z
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x0022
            if (r1 == r7) goto L_0x001e
            if (r1 != r6) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001e:
            defpackage.od2.a0(r13)
            goto L_0x0067
        L_0x0022:
            defpackage.od2.a0(r13)
            goto L_0x0036
        L_0x0026:
            defpackage.od2.a0(r13)
            int r8 = r12.Y
            if (r8 != r3) goto L_0x004f
            r12.X = r3
            java.lang.Object r13 = defpackage.an9.a(r5, r12)
            if (r13 != r0) goto L_0x0036
            return r0
        L_0x0036:
            r12.X = r7
            r5.getClass()
            int r6 = r2.a
            r7 = 0
            int r8 = r12.Y
            spa r9 = r12.t0
            r10 = 1
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r12 = r4
        L_0x004c:
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x004f:
            r12.X = r6
            r5.getClass()
            int r6 = r2.a
            ms7 r7 = r12.u0
            spa r9 = r12.t0
            r10 = 0
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r12 = r4
        L_0x0064:
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym9.o(java.lang.Object):java.lang.Object");
    }
}
