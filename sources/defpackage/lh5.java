package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: lh5  reason: default package */
public final class lh5 extends ffe implements a66 {
    public final /* synthetic */ File X;
    public final /* synthetic */ mh5 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lh5(File file, mh5 mh5, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = mh5;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lh5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lh5(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            mh5 r0 = r11.Y
            java.io.File r1 = r11.X
            defpackage.od2.a0(r12)
            java.lang.String r12 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r12 = defpackage.tfg.q(r12)     // Catch:{ all -> 0x001a }
            if (r12 == 0) goto L_0x001c
            int r2 = r12.length()     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r6 = r12
            goto L_0x001f
        L_0x001a:
            r11 = move-exception
            goto L_0x004b
        L_0x001c:
            java.lang.String r12 = "*/*"
            goto L_0x0018
        L_0x001f:
            boolean r10 = r11.Z     // Catch:{ all -> 0x001a }
            android.content.Context r11 = r0.a     // Catch:{ all -> 0x001a }
            java.lang.String r12 = "download"
            java.lang.Object r11 = r11.getSystemService(r12)     // Catch:{ all -> 0x001a }
            boolean r12 = r11 instanceof android.app.DownloadManager     // Catch:{ all -> 0x001a }
            if (r12 == 0) goto L_0x0031
            android.app.DownloadManager r11 = (android.app.DownloadManager) r11     // Catch:{ all -> 0x001a }
        L_0x002f:
            r2 = r11
            goto L_0x0033
        L_0x0031:
            r11 = 0
            goto L_0x002f
        L_0x0033:
            if (r2 != 0) goto L_0x0036
            goto L_0x006a
        L_0x0036:
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x001a }
            long r8 = r1.length()     // Catch:{ all -> 0x001a }
            r5 = 0
            r2.addCompletedDownload(r3, r4, r5, r6, r7, r8, r10)     // Catch:{ all -> 0x001a }
            goto L_0x006a
        L_0x004b:
            java.lang.String r12 = defpackage.mh5.g
            java.lang.String r1 = "fail!"
            defpackage.hm9.p(r12, r1, r11)
            r0.getClass()
            bc7[] r12 = defpackage.mh5.f
            r1 = 1
            r12 = r12[r1]
            rm4 r12 = r0.b
            java.lang.Object r12 = r12.get()
            o45 r12 = (defpackage.o45) r12
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            r0.<init>(r11)
            ((defpackage.cba) r12).c(r0, false)
        L_0x006a:
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh5.o(java.lang.Object):java.lang.Object");
    }
}
