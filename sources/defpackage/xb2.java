package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xb2  reason: default package */
public final class xb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ CharSequence u0 = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xb2(zb2 zb2, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
        this.s0 = str;
        this.t0 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xb2(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 1
            r3 = 0
            zb2 r4 = r10.Z
            r5 = 3
            r6 = 2
            if (r1 == 0) goto L_0x0028
            if (r1 == r2) goto L_0x0024
            if (r1 == r6) goto L_0x001e
            if (r1 != r5) goto L_0x0016
            defpackage.od2.a0(r11)
            goto L_0x0070
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            zb2 r4 = r10.X
            defpackage.od2.a0(r11)
            goto L_0x0063
        L_0x0024:
            defpackage.od2.a0(r11)
            goto L_0x0052
        L_0x0028:
            defpackage.od2.a0(r11)
            java.lang.String r11 = defpackage.zb2.K0
            alc r11 = r4.e()
            java.lang.CharSequence r1 = r10.u0
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.toString()
            goto L_0x003b
        L_0x003a:
            r1 = r3
        L_0x003b:
            r10.Y = r2
            r11.getClass()
            xkc r7 = new xkc
            java.lang.String r8 = r10.t0
            java.lang.String r9 = r10.s0
            r7.<init>(r11, r8, r1, r9)
            ilc r11 = r11.a
            java.lang.Object r11 = defpackage.ote.j(r11, r7, r10)
            if (r11 != r0) goto L_0x0052
            return r0
        L_0x0052:
            java.lang.String r11 = defpackage.zb2.K0
            alc r11 = r4.e()
            r10.X = r4
            r10.Y = r6
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            java.util.List r11 = (java.util.List) r11
            r10.X = r3
            r10.Y = r5
            java.lang.Object r10 = defpackage.zb2.j(r4, r11, r2, r10)
            if (r10 != r0) goto L_0x0070
            return r0
        L_0x0070:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb2.o(java.lang.Object):java.lang.Object");
    }
}
