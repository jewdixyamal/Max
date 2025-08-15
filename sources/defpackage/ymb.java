package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ymb  reason: default package */
public final class ymb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ymb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ymb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ymb ymb = new ymb(this.Y, continuation);
        ymb.X = obj;
        return ymb;
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
            cnb r0 = r4.Y
            defpackage.od2.a0(r5)
            java.lang.Object r4 = r4.X
            sx3 r4 = (defpackage.sx3) r4
            java.util.concurrent.atomic.AtomicReference r5 = r0.P0     // Catch:{ all -> 0x005f }
            je7 r1 = r0.v0
            oe2 r2 = new oe2     // Catch:{ all -> 0x005f }
            r3 = 9
            r2.<init>(r3)     // Catch:{ all -> 0x005f }
            java.lang.Object r5 = r5.updateAndGet(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x005f }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x005f }
            kk5 r2 = (defpackage.kk5) r2     // Catch:{ all -> 0x005f }
            java.io.File r5 = r2.q(r5)     // Catch:{ all -> 0x005f }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x005f }
            int r3 = defpackage.tfg.c     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "content://"
            boolean r2 = r2.startsWith(r3)     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x0037
            goto L_0x0047
        L_0x0037:
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x005f }
            kk5 r1 = (defpackage.kk5) r1     // Catch:{ all -> 0x005f }
            java.io.File r5 = defpackage.ft.A(r5)     // Catch:{ all -> 0x005f }
            android.content.Context r2 = r0.Q0     // Catch:{ all -> 0x005f }
            android.net.Uri r5 = r1.f(r2, r5)     // Catch:{ all -> 0x005f }
        L_0x0047:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "output"
            r1.putExtra(r2, r5)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005f }
            r1.putExtra(r5, r2)     // Catch:{ all -> 0x005f }
            goto L_0x0065
        L_0x005f:
            r5 = move-exception
            njc r1 = new njc
            r1.<init>(r5)
        L_0x0065:
            java.lang.Throwable r5 = defpackage.pjc.a(r1)
            if (r5 == 0) goto L_0x007b
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "capturePhoto: failed to capture photo"
            defpackage.hm9.p(r4, r2, r5)
            r0.z()
        L_0x007b:
            boolean r4 = r1 instanceof defpackage.njc
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x008d
            android.content.Intent r1 = (android.content.Intent) r1
            s35 r4 = r0.z0
            tlb r5 = new tlb
            r5.<init>(r1)
            defpackage.pnf.o(r4, r5)
        L_0x008d:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymb.o(java.lang.Object):java.lang.Object");
    }
}
