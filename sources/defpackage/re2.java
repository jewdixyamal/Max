package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: re2  reason: default package */
public final class re2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ en4 t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public re2(ye2 ye2, long j, String str, en4 en4, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2;
        this.Z = j;
        this.s0 = str;
        this.t0 = en4;
        this.u0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((re2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new re2(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r0 = r9.z0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
        if (r0 == r2) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            tx3 r2 = defpackage.tx3.a
            int r0 = r1.X
            e5f r3 = defpackage.e5f.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            ye2 r8 = r1.Y
            if (r0 == 0) goto L_0x0031
            if (r0 == r7) goto L_0x002b
            if (r0 == r6) goto L_0x0026
            if (r0 == r5) goto L_0x0021
            if (r0 != r4) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            defpackage.od2.a0(r22)
            goto L_0x0165
        L_0x0026:
            defpackage.od2.a0(r22)
            goto L_0x00da
        L_0x002b:
            defpackage.od2.a0(r22)
            r0 = r22
            goto L_0x0047
        L_0x0031:
            defpackage.od2.a0(r22)
            je7 r0 = r8.X
            java.lang.Object r0 = r0.getValue()
            r79 r0 = (defpackage.r79) r0
            r1.X = r7
            long r9 = r1.Z
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r2) goto L_0x0047
            return r2
        L_0x0047:
            r9 = r0
            cu8 r9 = (defpackage.cu8) r9
            java.lang.String r10 = r1.s0
            r11 = 0
            if (r9 == 0) goto L_0x0059
            k8g r0 = r9.z0
            if (r0 == 0) goto L_0x0059
            l20 r0 = r0.j(r10)
            r12 = r0
            goto L_0x005a
        L_0x0059:
            r12 = r11
        L_0x005a:
            if (r12 == 0) goto L_0x00db
            boolean r0 = r12.c()
            if (r0 != r7) goto L_0x00db
            r1.X = r6
            r8.getClass()
            s10 r0 = r12.j
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            r0 = r3
            goto L_0x00d7
        L_0x006d:
            en4 r4 = r1.t0
            java.lang.String r5 = r12.s
            if (r5 == 0) goto L_0x00c5
            int r6 = r5.length()
            if (r6 != 0) goto L_0x007a
            goto L_0x00c5
        L_0x007a:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.exists()
            kld r5 = r8.u0
            if (r1 == 0) goto L_0x00b7
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r1 = r0.toString()
            int r6 = defpackage.tfg.c
            java.lang.String r6 = "content://"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x009a
            goto L_0x00ae
        L_0x009a:
            je7 r1 = r8.s0
            java.lang.Object r1 = r1.getValue()
            zi5 r1 = (defpackage.zi5) r1
            java.io.File r0 = defpackage.ft.A(r0)
            kk5 r1 = (defpackage.kk5) r1
            android.content.Context r6 = r8.b
            android.net.Uri r0 = r1.f(r6, r0)
        L_0x00ae:
            jn4 r1 = new jn4
            r1.<init>(r0, r4)
            r5.g(r1)
            goto L_0x006b
        L_0x00b7:
            r0 = 0
            int r0 = defpackage.ye2.u(r4, r0)
            in4 r1 = new in4
            r1.<init>(r0)
            r5.g(r1)
            goto L_0x006b
        L_0x00c5:
            java.util.concurrent.atomic.AtomicReference r5 = r8.z0
            me2 r6 = new me2
            r6.<init>(r9, r0, r12, r4)
            r5.updateAndGet(r6)
            java.lang.String r4 = r12.r
            java.lang.Object r0 = r8.s(r4, r0, r1)
            if (r0 != r2) goto L_0x006b
        L_0x00d7:
            if (r0 != r2) goto L_0x00da
            return r2
        L_0x00da:
            return r3
        L_0x00db:
            java.util.concurrent.atomic.AtomicReference r0 = r8.z0
            qe2 r6 = new qe2
            java.lang.String r14 = r1.s0
            en4 r15 = r1.t0
            r20 = r8
            long r7 = r1.Z
            long r4 = r1.u0
            r13 = r6
            r18 = r14
            r19 = r15
            r14 = r7
            r16 = r4
            r13.<init>(r14, r16, r18, r19)
            r0.updateAndGet(r6)
            java.io.File r0 = android.os.Environment.getDataDirectory()
            android.os.StatFs r4 = new android.os.StatFs     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0116 }
            r4.<init>(r0)     // Catch:{ all -> 0x0116 }
            long r5 = r4.getBlockSizeLong()     // Catch:{ all -> 0x0116 }
            long r7 = r4.getAvailableBlocksLong()     // Catch:{ all -> 0x0116 }
            long r5 = r5 * r7
            r7 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 / r7
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            goto L_0x011d
        L_0x0116:
            r0 = move-exception
            njc r4 = new njc
            r4.<init>(r0)
            r0 = r4
        L_0x011d:
            r4 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r5 = r0 instanceof defpackage.njc
            if (r5 == 0) goto L_0x0128
            r0 = r4
        L_0x0128:
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r6 = 1024(0x400, double:5.06E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0166
            if (r12 == 0) goto L_0x0139
            x10 r0 = r12.b
            goto L_0x013a
        L_0x0139:
            r0 = r11
        L_0x013a:
            if (r12 == 0) goto L_0x013f
            k20 r4 = r12.d
            goto L_0x0140
        L_0x013f:
            r4 = r11
        L_0x0140:
            if (r0 == 0) goto L_0x0157
            r5 = 3
            r1.X = r5
            ue2 r4 = new ue2
            r5 = r20
            r4.<init>(r0, r5, r11)
            java.lang.Object r0 = defpackage.j1e.k(r4, r1)
            if (r0 != r2) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r0 = r3
        L_0x0154:
            if (r0 != r2) goto L_0x0165
            return r2
        L_0x0157:
            r5 = r20
            if (r4 == 0) goto L_0x0165
            r6 = 4
            r1.X = r6
            java.lang.Object r0 = defpackage.ye2.q(r5, r10, r4, r9, r1)
            if (r0 != r2) goto L_0x0165
            return r2
        L_0x0165:
            return r3
        L_0x0166:
            r5 = r20
            r1 = 1
            r5.t(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re2.o(java.lang.Object):java.lang.Object");
    }
}
