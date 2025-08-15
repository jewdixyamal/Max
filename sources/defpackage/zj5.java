package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zj5  reason: default package */
public final class zj5 implements gq1 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ vq6 Z;
    public final /* synthetic */ mhc a;
    public final /* synthetic */ jq6 b;
    public final /* synthetic */ pad c;
    public final /* synthetic */ File o;
    public final /* synthetic */ rl8 s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ bk5 u0;
    public final /* synthetic */ ek5 v0;

    public zj5(ek5 ek5, mhc mhc, tq6 tq6, pad pad, File file, AtomicBoolean atomicBoolean, String str, vq6 vq6, rl8 rl8, int i, bk5 bk5) {
        this.v0 = ek5;
        this.a = mhc;
        this.b = tq6;
        this.c = pad;
        this.o = file;
        this.X = atomicBoolean;
        this.Y = str;
        this.Z = vq6;
        this.s0 = rl8;
        this.t0 = i;
        this.u0 = bk5;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [pad, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:14|(1:16)(1:17)|18|19|20|21|(1:23)|24|25|(2:27|(1:29)(2:30|(1:33)(2:34|(1:58)(2:38|(2:40|119)(1:57)))))|31|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.b8c r13, defpackage.yic r14) {
        /*
            r12 = this;
            java.lang.String r13 = "error uploading, e: "
            i8c r0 = r14.Z
            boolean r1 = r14.m()     // Catch:{ all -> 0x0042 }
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            jq6 r14 = r12.b     // Catch:{ all -> 0x0042 }
            java.io.File r1 = r12.o     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            if (r14 == 0) goto L_0x0039
            java.lang.String r6 = r0.U()     // Catch:{ all -> 0x0042 }
            long r7 = r1.length()     // Catch:{ all -> 0x0042 }
            tq6 r14 = (defpackage.tq6) r14     // Catch:{ all -> 0x0042 }
            java.util.concurrent.atomic.AtomicBoolean r13 = r14.s0     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.get()     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            tb2 r13 = new tb2     // Catch:{ all -> 0x0042 }
            r9 = 2
            r4 = r13
            r5 = r14
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (long) r7, (int) r9)     // Catch:{ all -> 0x0042 }
            xtc r14 = r14.Y     // Catch:{ all -> 0x0042 }
            r14.b(r13)     // Catch:{ all -> 0x0042 }
        L_0x0039:
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            pad r12 = r12.c     // Catch:{ all -> 0x0042 }
            defpackage.ek5.a(r13, r12, r3, r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0042:
            r12 = move-exception
            goto L_0x014d
        L_0x0045:
            ek5 r1 = r12.v0     // Catch:{ all -> 0x0042 }
            w0f r1 = r1.c     // Catch:{ all -> 0x0042 }
            int r4 = r14.o     // Catch:{ all -> 0x0042 }
            je7 r1 = r1.a     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0042 }
            ad r1 = (defpackage.ad) r1     // Catch:{ all -> 0x0042 }
            js7 r5 = r1.a()     // Catch:{ all -> 0x0042 }
            boolean r5 = r5.c()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            java.lang.String r5 = "HTTP_ERROR"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0042 }
            r1.g(r5, r4)     // Catch:{ all -> 0x0042 }
        L_0x0067:
            ek5 r1 = r12.v0     // Catch:{ all -> 0x0042 }
            pad r4 = r12.c     // Catch:{ all -> 0x0042 }
            int r5 = r14.o     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0042 }
            r6 = 1
            defpackage.ek5.a(r1, r4, r6, r5)     // Catch:{ all -> 0x0042 }
            int r1 = r14.o     // Catch:{ all -> 0x0042 }
            ek5 r4 = r12.v0     // Catch:{ all -> 0x0042 }
            r4.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "X-Reason"
            cj6 r5 = r14.Y     // Catch:{ Exception -> 0x0087 }
            java.lang.String r4 = r5.a(r4)     // Catch:{ Exception -> 0x0087 }
            if (r4 == 0) goto L_0x0087
            r2 = r4
        L_0x0087:
            eq6 r1 = defpackage.nu0.j(r1, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "ek5"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r4.<init>(r13)     // Catch:{ all -> 0x0042 }
            r4.append(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0042 }
            defpackage.hm9.m(r2, r13, new java.lang.Object[0])     // Catch:{ all -> 0x0042 }
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            eq6 r13 = defpackage.nu0.Z     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 != 0) goto L_0x00b4
            eq6 r13 = defpackage.nu0.X     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r13 = r3
            goto L_0x00b5
        L_0x00b4:
            r13 = r6
        L_0x00b5:
            if (r13 == 0) goto L_0x00c5
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            jq6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            tq6 r12 = (defpackage.tq6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            defpackage.ek5.f(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x00c5:
            eq6 r13 = defpackage.nu0.c     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0139
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.X     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.compareAndSet(r3, r6)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0139
            long r7 = defpackage.ek5.e(r14)     // Catch:{ all -> 0x0042 }
            r13 = 0
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x012a
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            pad r14 = r12.c     // Catch:{ all -> 0x0042 }
            java.lang.String r14 = r14.a     // Catch:{ all -> 0x0042 }
            pad r9 = new pad     // Catch:{ all -> 0x0042 }
            r9.<init>()     // Catch:{ all -> 0x0042 }
            w0f r13 = r13.c     // Catch:{ all -> 0x0042 }
            long r1 = r13.b()     // Catch:{ all -> 0x0042 }
            r9.f = r1     // Catch:{ all -> 0x0042 }
            r9.a = r14     // Catch:{ all -> 0x0042 }
            ek5 r2 = r12.v0     // Catch:{ all -> 0x0042 }
            java.io.File r3 = r12.o     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r12.Y     // Catch:{ all -> 0x0042 }
            vq6 r5 = r12.Z     // Catch:{ all -> 0x0042 }
            rl8 r6 = r12.s0     // Catch:{ all -> 0x0042 }
            jq6 r13 = r12.b     // Catch:{ all -> 0x0042 }
            int r11 = r12.t0     // Catch:{ all -> 0x0042 }
            r10 = r13
            tq6 r10 = (defpackage.tq6) r10     // Catch:{ all -> 0x0042 }
            mhc r13 = r2.b(r3, r4, r5, r6, r7, r9, r10, r11)     // Catch:{ all -> 0x0042 }
            ek5 r14 = r12.v0     // Catch:{ all -> 0x0042 }
            khe r14 = r14.b     // Catch:{ all -> 0x0042 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0042 }
            u2a r14 = (defpackage.u2a) r14     // Catch:{ all -> 0x0042 }
            b8c r13 = r14.b(r13)     // Catch:{ all -> 0x0042 }
            bk5 r14 = r12.u0     // Catch:{ all -> 0x0042 }
            monitor-enter(r14)     // Catch:{ all -> 0x0042 }
            boolean r1 = r14.b     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0120
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0120:
            r14.a = r13     // Catch:{ all -> 0x0127 }
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            r13.e(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0127:
            r12 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0127 }
            throw r12     // Catch:{ all -> 0x0042 }
        L_0x012a:
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            jq6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            tq6 r12 = (defpackage.tq6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0139:
            ek5 r13 = r12.v0     // Catch:{ all -> 0x0042 }
            jq6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            tq6 r12 = (defpackage.tq6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
        L_0x0147:
            if (r0 == 0) goto L_0x014c
            r0.close()
        L_0x014c:
            return
        L_0x014d:
            if (r0 == 0) goto L_0x0157
            r0.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0157
        L_0x0153:
            r13 = move-exception
            r12.addSuppressed(r13)
        L_0x0157:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj5.m(b8c, yic):void");
    }

    public final void q(b8c b8c, IOException iOException) {
        rl8 rl8 = ek5.d;
        hm9.r("ek5", iOException, "onFailure %s", this.a);
        ek5 ek5 = this.v0;
        ad adVar = (ad) ek5.c.a.getValue();
        if (!adVar.a().c()) {
            adVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        hm9.p("ek5", "onFailure", (Throwable) null);
        boolean z = iOException instanceof FileNotFoundException;
        jq6 jq6 = this.b;
        if (z) {
            ((tq6) jq6).b("file not found", nu0.x0);
        } else if ("FILE_ZERO_LENGTH".equals(iOException.getMessage())) {
            ((tq6) jq6).b("file is zero length", nu0.y0);
        } else {
            String obj = iOException.toString();
            tq6 tq6 = (tq6) jq6;
            eq6 eq6 = nu0.w0;
            if (obj != null) {
                eq6 = new eq6(-1, "UNKNOWN_ERROR", obj);
            }
            tq6.b("upload failed", eq6);
        }
        ek5.a(ek5, this.c, true, iOException.getMessage());
    }
}
