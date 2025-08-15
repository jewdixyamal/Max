package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: za2  reason: default package */
public final class za2 extends ffe implements a66 {
    public String X;
    public zb2 Y;
    public int Z;
    public final /* synthetic */ zb2 s0;
    public final /* synthetic */ String t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public za2(zb2 zb2, String str, Continuation continuation) {
        super(2, continuation);
        this.s0 = zb2;
        this.t0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((za2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new za2(this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            tx3 r1 = defpackage.tx3.a
            int r2 = r8.Z
            zb2 r3 = r8.s0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x002e
            if (r2 == r0) goto L_0x002a
            if (r2 == r5) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            java.lang.String r8 = r8.X
            defpackage.od2.a0(r9)
            goto L_0x0072
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            zb2 r3 = r8.Y
            java.lang.String r2 = r8.X
            defpackage.od2.a0(r9)
            r7 = r2
            r2 = r9
            r9 = r7
            goto L_0x0061
        L_0x002a:
            defpackage.od2.a0(r9)
            goto L_0x004c
        L_0x002e:
            defpackage.od2.a0(r9)
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.Z = r0
            r9.getClass()
            tkc r2 = new tkc
            java.lang.String r6 = r8.t0
            r2.<init>(r9, r6, r0)
            ilc r9 = r9.a
            java.lang.Object r9 = defpackage.z04.e0(r9, r2, r8)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = defpackage.zb2.K0
            alc r2 = r3.e()
            r8.X = r9
            r8.Y = r3
            r8.Z = r5
            java.lang.Object r2 = r2.d(r8)
            if (r2 != r1) goto L_0x0061
            return r1
        L_0x0061:
            java.util.List r2 = (java.util.List) r2
            r8.X = r9
            r5 = 0
            r8.Y = r5
            r8.Z = r4
            java.lang.Object r8 = defpackage.zb2.j(r3, r2, r0, r8)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r8 = r9
        L_0x0072:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za2.o(java.lang.Object):java.lang.Object");
    }
}
