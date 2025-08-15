package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zcd  reason: default package */
public final class zcd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zcd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zcd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zcd zcd = new zcd(this.Y, continuation);
        zcd.X = obj;
        return zcd;
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
            add r0 = r4.Y
            defpackage.od2.a0(r5)
            java.lang.Object r4 = r4.X
            sx3 r4 = (defpackage.sx3) r4
            java.util.concurrent.atomic.AtomicReference r5 = r0.F0     // Catch:{ all -> 0x0065 }
            je7 r1 = r0.u0
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0065 }
            r5.set(r2)     // Catch:{ all -> 0x0065 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0065 }
            kk5 r5 = (defpackage.kk5) r5     // Catch:{ all -> 0x0065 }
            java.util.concurrent.atomic.AtomicReference r2 = r0.F0     // Catch:{ all -> 0x0065 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0065 }
            java.io.File r5 = r5.q(r2)     // Catch:{ all -> 0x0065 }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0065 }
            int r3 = defpackage.tfg.c     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "content://"
            boolean r2 = r2.startsWith(r3)     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x003d
            goto L_0x004d
        L_0x003d:
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0065 }
            kk5 r1 = (defpackage.kk5) r1     // Catch:{ all -> 0x0065 }
            java.io.File r5 = defpackage.ft.A(r5)     // Catch:{ all -> 0x0065 }
            android.app.Application r2 = r0.X     // Catch:{ all -> 0x0065 }
            android.net.Uri r5 = r1.f(r2, r5)     // Catch:{ all -> 0x0065 }
        L_0x004d:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "output"
            r1.putExtra(r2, r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0065 }
            r1.putExtra(r5, r2)     // Catch:{ all -> 0x0065 }
            goto L_0x006b
        L_0x0065:
            r5 = move-exception
            njc r1 = new njc
            r1.<init>(r5)
        L_0x006b:
            java.lang.Throwable r5 = defpackage.pjc.a(r1)
            if (r5 == 0) goto L_0x0081
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "capturePhoto: failed to capture photo"
            defpackage.hm9.p(r4, r2, r5)
            r0.v()
        L_0x0081:
            boolean r4 = r1 instanceof defpackage.njc
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0093
            android.content.Intent r1 = (android.content.Intent) r1
            s35 r4 = r0.z0
            ygd r5 = new ygd
            r5.<init>(r1)
            defpackage.pnf.o(r4, r5)
        L_0x0093:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcd.o(java.lang.Object):java.lang.Object");
    }
}
