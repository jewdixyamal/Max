package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.Continuation;

/* renamed from: te8  reason: default package */
public final class te8 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final d86 b;
    public final q3d c;
    public final s86 o;
    public final je7 s0;
    public final dua t0;
    public final dua u0;
    public final s35 v0;
    public final w7c w0;

    public te8(d86 d86, q3d q3d, s86 s86) {
        he8 he8 = he8.a;
        khe d = he8.getAccessor().d(kke.class);
        khe d2 = he8.getAccessor().d(zi5.class);
        khe d3 = he8.getAccessor().d(y7d.class);
        khe d4 = he8.getAccessor().d(Context.class);
        this.b = d86;
        this.c = q3d;
        this.o = s86;
        this.X = d;
        this.Y = d2;
        this.Z = d3;
        this.s0 = d4;
        String[] strArr = eua.m;
        dua dua = new dua(strArr);
        this.t0 = dua;
        dua dua2 = new dua(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.u0 = dua2;
        this.v0 = new s35(0);
        this.w0 = od2.X(new t03(new ac(new j31(new j31(dua, dua2, new i58(3, (Continuation) null, 2), 4), q3d.Z, new xi1(3, (Continuation) null, 3), 4), 29, this), 11), this.a, wld.a, new et3(new eqe(d86.s0 ? dda.b : dda.a)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.te8 r5, java.io.File r6, android.net.Uri r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof defpackage.qe8
            if (r0 == 0) goto L_0x0013
            r0 = r8
            qe8 r0 = (defpackage.qe8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            qe8 r0 = new qe8
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            te8 r5 = r0.o
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x002b }
            goto L_0x005f
        L_0x002b:
            r6 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.od2.a0(r8)
            boolean r8 = r6.exists()     // Catch:{ all -> 0x002b }
            if (r8 != 0) goto L_0x005f
            if (r7 == 0) goto L_0x005f
            je7 r8 = r5.s0     // Catch:{ all -> 0x002b }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x002b }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x002b }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x002b }
            java.io.InputStream r7 = r8.openInputStream(r7)     // Catch:{ all -> 0x002b }
            if (r7 == 0) goto L_0x005f
            kj6 r8 = defpackage.kj6.o     // Catch:{ all -> 0x002b }
            r0.o = r5     // Catch:{ all -> 0x002b }
            r0.Z = r4     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r8.q(r6, r7, r0)     // Catch:{ all -> 0x002b }
            if (r6 != r1) goto L_0x005f
            goto L_0x007a
        L_0x005f:
            r7 = r3
            goto L_0x0066
        L_0x0061:
            njc r7 = new njc
            r7.<init>(r6)
        L_0x0066:
            java.lang.Throwable r6 = defpackage.pjc.a(r7)
            if (r6 == 0) goto L_0x0079
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "failed to copy picked image"
            defpackage.hm9.p(r5, r7, r6)
        L_0x0079:
            r1 = r3
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.q(te8, java.io.File, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
