package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sgb  reason: default package */
public final class sgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sgb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sgb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sgb sgb = new sgb(this.Y, continuation);
        sgb.X = obj;
        return sgb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: njc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            vgb r0 = r4.Y
            defpackage.od2.a0(r5)
            java.lang.Object r4 = r4.X
            sx3 r4 = (defpackage.sx3) r4
            java.util.concurrent.atomic.AtomicReference r5 = r0.z0     // Catch:{ all -> 0x006b }
            je7 r1 = r0.Y
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x006b }
            r5.set(r2)     // Catch:{ all -> 0x006b }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x006b }
            kk5 r5 = (defpackage.kk5) r5     // Catch:{ all -> 0x006b }
            java.util.concurrent.atomic.AtomicReference r2 = r0.z0     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x006b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x006b }
            java.io.File r5 = r5.q(r2)     // Catch:{ all -> 0x006b }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ all -> 0x006b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x006b }
            int r3 = defpackage.tfg.c     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "content://"
            boolean r2 = r2.startsWith(r3)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006b }
            kk5 r1 = (defpackage.kk5) r1     // Catch:{ all -> 0x006b }
            je7 r2 = r0.Z     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x006b }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x006b }
            java.io.File r5 = defpackage.ft.A(r5)     // Catch:{ all -> 0x006b }
            android.net.Uri r5 = r1.f(r2, r5)     // Catch:{ all -> 0x006b }
        L_0x0053:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "output"
            r1.putExtra(r2, r5)     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x006b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006b }
            r1.putExtra(r5, r2)     // Catch:{ all -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r5 = move-exception
            njc r1 = new njc
            r1.<init>(r5)
        L_0x0071:
            java.lang.Throwable r5 = defpackage.pjc.a(r1)
            if (r5 == 0) goto L_0x0087
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "capturePhoto: failed to capture photo"
            defpackage.hm9.p(r4, r2, r5)
            r0.s()
        L_0x0087:
            boolean r4 = r1 instanceof defpackage.njc
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0099
            android.content.Intent r1 = (android.content.Intent) r1
            s35 r4 = r0.w0
            pfb r5 = new pfb
            r5.<init>(r1)
            defpackage.pnf.o(r4, r5)
        L_0x0099:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgb.o(java.lang.Object):java.lang.Object");
    }
}
