package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: gs2  reason: default package */
public final class gs2 extends ffe implements a66 {
    public File X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ks2 s0;
    public final /* synthetic */ Uri t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs2(ks2 ks2, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.s0 = ks2;
        this.t0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gs2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gs2 gs2 = new gs2(this.s0, this.t0, continuation);
        gs2.Z = obj;
        return gs2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            e5f r2 = defpackage.e5f.a
            r3 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            java.io.File r0 = r8.X
            java.lang.Object r1 = r8.Z
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x0015 }
            goto L_0x0069
        L_0x0015:
            r9 = move-exception
            goto L_0x0072
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Z
            r1 = r9
            sx3 r1 = (defpackage.sx3) r1
            ks2 r9 = r8.s0
            bc7[] r4 = defpackage.ks2.I0
            je7 r9 = r9.s0
            java.lang.Object r9 = r9.getValue()
            kk5 r9 = (defpackage.kk5) r9
            ks2 r4 = r8.s0
            java.lang.String r4 = r4.F0
            java.io.File r9 = r9.q(r4)
            android.net.Uri r4 = r8.t0
            ks2 r5 = r8.s0
            boolean r6 = r9.exists()     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x0070
            if (r4 == 0) goto L_0x0070
            je7 r5 = r5.x0     // Catch:{ all -> 0x006b }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x006b }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x006b }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x006b }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0070
            kj6 r5 = defpackage.kj6.o     // Catch:{ all -> 0x006b }
            r8.Z = r1     // Catch:{ all -> 0x006b }
            r8.X = r9     // Catch:{ all -> 0x006b }
            r8.Y = r3     // Catch:{ all -> 0x006b }
            java.lang.Object r4 = r5.q(r9, r4, r8)     // Catch:{ all -> 0x006b }
            if (r4 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r0 = r9
        L_0x0069:
            r9 = r0
            goto L_0x0070
        L_0x006b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x0072
        L_0x0070:
            r4 = r2
            goto L_0x0078
        L_0x0072:
            njc r4 = new njc
            r4.<init>(r9)
            r9 = r0
        L_0x0078:
            ks2 r0 = r8.s0
            java.lang.Throwable r4 = defpackage.pjc.a(r4)
            if (r4 == 0) goto L_0x0090
            r0.u()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "failed to copy picked image, e:"
            defpackage.hm9.p(r0, r1, r4)
        L_0x0090:
            ks2 r0 = r8.s0
            y7d r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            defpackage.j47.c0(r0, r1, r1)
            ks2 r0 = r8.s0
            y7d r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            defpackage.j47.a0(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            ks2 r1 = r8.s0
            je7 r1 = r1.x0
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ru.ok.messages.views.ActAvatarCrop> r4 = ru.ok.messages.views.ActAvatarCrop.class
            r0.<init>(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.URI"
            android.net.Uri r4 = android.net.Uri.fromFile(r9)
            r0.putExtra(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r9 = r9.getAbsolutePath()
            r0.putExtra(r1, r9)
            java.lang.String r9 = "ru.ok.tamtam.extra.SHOW_RECAPTURE"
            r0.putExtra(r9, r3)
            java.lang.String r9 = "ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND"
            r1 = 0
            r0.putExtra(r9, r1)
            ks2 r8 = r8.s0
            s35 r8 = r8.A0
            or2 r9 = new or2
            r9.<init>(r0)
            defpackage.pnf.o(r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs2.o(java.lang.Object):java.lang.Object");
    }
}
