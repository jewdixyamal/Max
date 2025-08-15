package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* renamed from: qrc  reason: default package */
public final class qrc {
    public final uuc a;
    public final nx3 b;
    public final qra c;

    public qrc(uuc uuc, nx3 nx3, qra qra) {
        this.a = uuc;
        this.b = nx3;
        this.c = qra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        defpackage.hm9.p("qrc", "onNewResultImpl: failed to save image", r11);
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        defpackage.hm9.p("qrc", "onNewResultImpl: failed to save image", r11);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0031, B:34:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC, Splitter:B:26:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable a(defpackage.qrc r11, java.lang.String r12, boolean r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r0 = 1
            r1 = 2
            r11.getClass()
            boolean r2 = r15 instanceof defpackage.lrc
            if (r2 == 0) goto L_0x0018
            r2 = r15
            lrc r2 = (defpackage.lrc) r2
            int r3 = r2.u0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.u0 = r3
            goto L_0x001d
        L_0x0018:
            lrc r2 = new lrc
            r2.<init>(r11, r15)
        L_0x001d:
            java.lang.Object r15 = r2.s0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.u0
            java.lang.String r5 = "onNewResultImpl: failed to save image"
            java.lang.String r6 = "qrc"
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L_0x0055
            if (r4 == r0) goto L_0x0046
            if (r4 == r1) goto L_0x0041
            if (r4 != r7) goto L_0x0039
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0036 }
            goto L_0x0111
        L_0x0036:
            r11 = move-exception
            goto L_0x0115
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0036 }
            goto L_0x00cd
        L_0x0046:
            boolean r14 = r2.Z
            boolean r13 = r2.Y
            wv6 r11 = r2.X
            qrc r12 = r2.o
            defpackage.od2.a0(r15)
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x00a6
        L_0x0055:
            defpackage.od2.a0(r15)
            uuc r15 = r11.a
            yd r15 = (defpackage.yd) r15
            af7 r15 = r15.e
            r15.getClass()
            java.lang.String r12 = defpackage.j47.O(r12)
            wv6 r12 = defpackage.wv6.b(r12)
            if (r12 != 0) goto L_0x006e
        L_0x006b:
            r3 = r8
            goto L_0x011a
        L_0x006e:
            r2.o = r11
            r2.X = r12
            r2.Y = r13
            r2.Z = r14
            r2.u0 = r0
            iv6 r15 = defpackage.s36.o()
            g0 r15 = r15.c(r12)
            sy1 r4 = new sy1
            kotlin.coroutines.Continuation r9 = defpackage.v3c.u(r2)
            r4.<init>(r0, r9)
            r4.n()
            iw9 r9 = new iw9
            r9.<init>(r4, r0)
            qq1 r0 = defpackage.qq1.a
            r15.m(r9, r0)
            af5 r0 = new af5
            r0.<init>(r15, r1)
            r4.d(r0)
            java.lang.Object r15 = r4.m()
            if (r15 != r3) goto L_0x00a6
            goto L_0x011a
        L_0x00a6:
            qq8 r15 = (defpackage.qq8) r15
            if (r15 != 0) goto L_0x00ab
            goto L_0x006b
        L_0x00ab:
            q5b r0 = new q5b     // Catch:{ all -> 0x0036 }
            r0.<init>(r15)     // Catch:{ all -> 0x0036 }
            je7 r4 = defpackage.pu6.d     // Catch:{ all -> 0x0036 }
            ou6 r0 = defpackage.i24.o(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "webp"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x00d0
            r2.o = r8     // Catch:{ all -> 0x0036 }
            r2.X = r8     // Catch:{ all -> 0x0036 }
            r2.u0 = r1     // Catch:{ all -> 0x0036 }
            java.lang.Object r15 = r11.e(r12, r13, r14, r2)     // Catch:{ all -> 0x0036 }
            if (r15 != r3) goto L_0x00cd
            goto L_0x011a
        L_0x00cd:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0036 }
            goto L_0x0113
        L_0x00d0:
            r2.o = r8     // Catch:{ all -> 0x0036 }
            r2.X = r8     // Catch:{ all -> 0x0036 }
            r2.u0 = r7     // Catch:{ all -> 0x0036 }
            r11.getClass()     // Catch:{ all -> 0x0036 }
            jjf r12 = new jjf     // Catch:{ all -> 0x0109 }
            if (r13 == 0) goto L_0x00de
            r1 = 5
        L_0x00de:
            if (r14 == 0) goto L_0x00fe
            qra r0 = r11.c     // Catch:{ all -> 0x0109 }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x0109 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0109 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = defpackage.qra.b     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0109 }
            goto L_0x0100
        L_0x00fe:
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ all -> 0x0109 }
        L_0x0100:
            r12.<init>(r15, r1, r0)     // Catch:{ all -> 0x0109 }
            android.net.Uri r11 = r11.d(r12, r13, r14)     // Catch:{ all -> 0x0109 }
            r15 = r11
            goto L_0x010e
        L_0x0109:
            r11 = move-exception
            defpackage.hm9.p(r6, r5, r11)     // Catch:{ all -> 0x0036 }
            r15 = r8
        L_0x010e:
            if (r15 != r3) goto L_0x0111
            goto L_0x011a
        L_0x0111:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0036 }
        L_0x0113:
            r3 = r15
            goto L_0x011a
        L_0x0115:
            defpackage.hm9.p(r6, r5, r11)
            goto L_0x006b
        L_0x011a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrc.a(qrc, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static Object c(qrc qrc, String str, boolean z, Continuation continuation) {
        qrc.getClass();
        return j47.t0(qrc.b, new nrc(qrc, str, z, false, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.mrc
            if (r0 == 0) goto L_0x0013
            r0 = r14
            mrc r0 = (defpackage.mrc) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            mrc r0 = new mrc
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r10) goto L_0x0028
            defpackage.od2.a0(r14)
            goto L_0x004f
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            defpackage.od2.a0(r14)
            r0.Y = r10
            xq9 r14 = defpackage.xq9.a
            nx3 r2 = r11.b
            lx3 r14 = r14.plus(r2)
            orc r2 = new orc
            r8 = 0
            r3 = r2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r14 = defpackage.j47.t0(r14, r2, r0)
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x004f:
            if (r14 == 0) goto L_0x0052
            r9 = r10
        L_0x0052:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrc.b(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri d(vuc vuc, boolean z, boolean z2) {
        uuc uuc = this.a;
        if (z2) {
            String b2 = uuc.b(z);
            qra qra = ((yd) uuc).c;
            StringBuilder l = au1.l(qra.a.getCacheDir().getPath());
            l.append(qra.b);
            String sb = l.toString();
            try {
                File file = new File(sb);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (IOException e) {
                hm9.r("PathHelper", e, rh4.k("Failed to create dir=", sb, " due to: ", e.getMessage()), new Object[0]);
            }
            File file2 = new File(sb, b2);
            vuc.f(file2);
            Context context = qra.a;
            String packageName = context.getPackageName();
            return FileProvider.d(context, file2, packageName + ".provider");
        }
        return ((yd) uuc).c(vuc, uuc.b(z));
    }

    public final Object e(wv6 wv6, boolean z, boolean z2, lrc lrc) {
        sy1 sy1 = new sy1(1, v3c.u(lrc));
        sy1.n();
        try {
            g0 a2 = s36.o().a(wv6, (Object) null);
            a2.m(new prc(a2, sy1, this, z2, z), qq1.a);
        } catch (Throwable th) {
            hm9.p("qrc", "onNewResultImpl: failed to save image", th);
            sy1.resumeWith((Object) null);
        }
        return sy1.m();
    }
}
