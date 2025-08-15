package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g67  reason: default package */
public final class g67 extends ffe implements a66 {
    public final /* synthetic */ h67 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g67(h67 h67, Continuation continuation) {
        super(2, continuation);
        this.X = h67;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g67(this.X, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        defpackage.v3c.i(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.od2.a0(r7)
            h67 r6 = r6.X
            q0e r7 = r6.s0
            java.lang.Object r7 = r7.getValue()
            iqb r7 = (defpackage.iqb) r7
            android.graphics.Bitmap r7 = r7.c
            r0 = 0
            if (r7 != 0) goto L_0x0013
            return r0
        L_0x0013:
            je7 r1 = r6.o
            java.lang.Object r2 = r1.getValue()
            kk5 r2 = (defpackage.kk5) r2
            java.io.File r2 = r2.m()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "qr_tmp.png"
            r3.<init>(r2, r4)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0048 }
            r5 = 100
            r7.compress(r4, r5, r2)     // Catch:{ all -> 0x0048 }
            java.lang.Object r7 = r1.getValue()     // Catch:{ all -> 0x0048 }
            kk5 r7 = (defpackage.kk5) r7     // Catch:{ all -> 0x0048 }
            je7 r6 = r6.b     // Catch:{ all -> 0x0048 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0048 }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x0048 }
            android.net.Uri r6 = r7.f(r6, r3)     // Catch:{ all -> 0x0048 }
            defpackage.v3c.i(r2, r0)
            return r6
        L_0x0048:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004a }
        L_0x004a:
            r7 = move-exception
            defpackage.v3c.i(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g67.o(java.lang.Object):java.lang.Object");
    }
}
