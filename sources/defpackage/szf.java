package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: szf  reason: default package */
public final class szf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ byte[] s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ String u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public szf(zzf zzf, String str, byte[] bArr, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
        this.Z = str;
        this.s0 = bArr;
        this.t0 = str2;
        this.u0 = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((szf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new szf(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r5 = r7.u0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r4 = r7.t0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            e5f r2 = defpackage.e5f.a
            r3 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r3) goto L_0x000f
            defpackage.od2.a0(r8)
            goto L_0x005d
        L_0x000f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0017:
            defpackage.od2.a0(r8)
            zzf r8 = r7.Y
            c8d r8 = r8.D0
            r7.X = r3
            r8.getClass()
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            e1g r3 = defpackage.f1g.Companion
            cc7 r3 = r3.serializer()
            java.lang.String r4 = r7.Z
            java.lang.Object r1 = r1.a(r3, r4)
            f1g r1 = (defpackage.f1g) r1
            byte[] r3 = r7.s0
            if (r3 == 0) goto L_0x0048
            java.lang.String r4 = r7.t0
            if (r4 == 0) goto L_0x0048
            java.lang.String r5 = r7.u0
            if (r5 == 0) goto L_0x0048
            c1g r6 = new c1g
            r6.<init>(r4, r5, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            y97 r3 = new y97
            r3.<init>(r1, r6)
            java.lang.Object r8 = r8.o
            zt0 r8 = (defpackage.zt0) r8
            java.lang.Object r7 = r8.o(r3, r7)
            if (r7 != r0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r7 != r0) goto L_0x005d
            return r0
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szf.o(java.lang.Object):java.lang.Object");
    }
}
