package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nc6  reason: default package */
public final class nc6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ oc6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nc6(oc6 oc6, Continuation continuation) {
        super(2, continuation);
        this.Y = oc6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nc6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nc6(this.Y, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        defpackage.v3c.i(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00df, code lost:
        throw r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.X
            r2 = 0
            r3 = 2
            r4 = 1
            oc6 r5 = r13.Y
            if (r1 == 0) goto L_0x001f
            if (r1 == r4) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            defpackage.od2.a0(r14)
            goto L_0x0065
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001b:
            defpackage.od2.a0(r14)
            goto L_0x0041
        L_0x001f:
            defpackage.od2.a0(r14)
            je7 r14 = r5.b
            java.lang.Object r14 = r14.getValue()
            blb r14 = (defpackage.blb) r14
            je7 r1 = r5.f
            java.lang.Object r1 = r1.getValue()
            q33 r1 = (defpackage.q33) r1
            hyc r1 = (defpackage.hyc) r1
            long r6 = r1.t()
            r13.X = r4
            java.lang.Object r14 = r14.a(r6, r13)
            if (r14 != r0) goto L_0x0041
            return r0
        L_0x0041:
            oab r14 = (defpackage.oab) r14
            uj3 r14 = r14.d
            kk0 r1 = defpackage.kk0.c
            java.lang.String r14 = r14.p(r1)
            if (r14 == 0) goto L_0x0068
            iv6 r6 = defpackage.s36.o()
            r1 = 6
            wv6 r7 = defpackage.h5a.b(r14, r2, r1)
            r13.X = r3
            r10 = 0
            r12 = 14
            r8 = 0
            r11 = r13
            java.lang.Object r14 = defpackage.fm9.u(r6, r7, r8, r10, r11, r12)
            if (r14 != r0) goto L_0x0065
            return r0
        L_0x0065:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            goto L_0x0069
        L_0x0068:
            r14 = r2
        L_0x0069:
            oq9 r13 = one.me.sdk.uikit.qr.QrCodeGenerator.a
            je7 r13 = r5.d
            java.lang.Object r13 = r13.getValue()
            y7d r13 = (defpackage.y7d) r13
            qyc r13 = (defpackage.qyc) r13
            java.lang.String r13 = r13.p()
            r0 = 244(0xf4, float:3.42E-43)
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            r1 = 24
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            android.graphics.Bitmap r13 = one.me.sdk.uikit.qr.QrCodeGenerator.a(r13, r0, r1, r14)
            if (r13 != 0) goto L_0x00a4
            return r2
        L_0x00a4:
            je7 r14 = r5.c
            java.lang.Object r0 = r14.getValue()
            kk5 r0 = (defpackage.kk5) r0
            java.io.File r0 = r0.m()
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "qr_tmp.png"
            r1.<init>(r0, r3)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00d9 }
            r4 = 100
            r13.compress(r3, r4, r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Object r13 = r14.getValue()     // Catch:{ all -> 0x00d9 }
            kk5 r13 = (defpackage.kk5) r13     // Catch:{ all -> 0x00d9 }
            je7 r14 = r5.a     // Catch:{ all -> 0x00d9 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x00d9 }
            android.content.Context r14 = (android.content.Context) r14     // Catch:{ all -> 0x00d9 }
            android.net.Uri r13 = r13.f(r14, r1)     // Catch:{ all -> 0x00d9 }
            defpackage.v3c.i(r0, r2)
            return r13
        L_0x00d9:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00db }
        L_0x00db:
            r14 = move-exception
            defpackage.v3c.i(r0, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc6.o(java.lang.Object):java.lang.Object");
    }
}
