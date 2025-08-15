package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lo9  reason: default package */
public final class lo9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mo9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lo9(mo9 mo9, Continuation continuation) {
        super(2, continuation);
        this.Z = mo9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lo9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lo9 lo9 = new lo9(this.Z, continuation);
        lo9.Y = obj;
        return lo9;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [njc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x000e
            defpackage.od2.a0(r7)
            goto L_0x00b5
        L_0x000e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0016:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            sx3 r7 = (defpackage.sx3) r7
            mo9 r1 = r6.Z
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x007a }
            r1.k = r3     // Catch:{ all -> 0x007a }
            je7 r3 = r1.b     // Catch:{ all -> 0x007a }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x007a }
            kk5 r3 = (defpackage.kk5) r3     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r1.k     // Catch:{ all -> 0x007a }
            java.io.File r3 = r3.q(r4)     // Catch:{ all -> 0x007a }
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x007a }
            int r5 = defpackage.tfg.c     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "content://"
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            je7 r4 = r1.b     // Catch:{ all -> 0x007a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x007a }
            kk5 r4 = (defpackage.kk5) r4     // Catch:{ all -> 0x007a }
            je7 r1 = r1.c     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x007a }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x007a }
            java.io.File r3 = defpackage.ft.A(r3)     // Catch:{ all -> 0x007a }
            android.net.Uri r3 = r4.f(r1, r3)     // Catch:{ all -> 0x007a }
        L_0x0062:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r4)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "output"
            r1.putExtra(r4, r3)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007a }
            r1.putExtra(r3, r4)     // Catch:{ all -> 0x007a }
            goto L_0x0081
        L_0x007a:
            r1 = move-exception
            njc r3 = new njc
            r3.<init>(r1)
            r1 = r3
        L_0x0081:
            mo9 r3 = r6.Z
            java.lang.Throwable r4 = defpackage.pjc.a(r1)
            if (r4 == 0) goto L_0x0099
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r5 = "capturePhoto: failed to capture photo"
            defpackage.hm9.p(r7, r5, r4)
            r3.a()
        L_0x0099:
            mo9 r7 = r6.Z
            boolean r3 = r1 instanceof defpackage.njc
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x00b5
            r3 = r1
            android.content.Intent r3 = (android.content.Intent) r3
            kld r7 = r7.g
            cd0 r4 = new cd0
            r4.<init>(r3)
            r6.Y = r1
            r6.X = r2
            java.lang.Object r6 = r7.a(r4, r6)
            if (r6 != r0) goto L_0x00b5
            return r0
        L_0x00b5:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo9.o(java.lang.Object):java.lang.Object");
    }
}
