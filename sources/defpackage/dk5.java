package defpackage;

import java.io.File;

/* renamed from: dk5  reason: default package */
public final class dk5 extends tfg {
    public final File h;
    public final rl8 i;
    public final long j;
    public final pad k;
    public final jq6 l;
    public final int m;

    public dk5(File file, rl8 rl8, long j2, pad pad, tq6 tq6, int i2) {
        this.m = i2;
        this.h = file;
        this.i = rl8;
        this.j = j2;
        this.k = pad;
        this.l = tq6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[Catch:{ all -> 0x0027, all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(defpackage.eu0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            java.io.File r2 = r0.h
            java.util.logging.Logger r3 = defpackage.x2a.a
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r2)
            vx r2 = new vx
            oue r4 = new oue
            r4.<init>()
            r2.<init>(r3, r1, r4)
            y7c r3 = new y7c
            r3.<init>(r2)
            long r4 = r0.j     // Catch:{ all -> 0x0027 }
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x002b
            r3.R(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            r1 = r0
            goto L_0x00ab
        L_0x002b:
            int r2 = r0.m     // Catch:{ all -> 0x0027 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0027 }
        L_0x002f:
            us0 r8 = new us0     // Catch:{ all -> 0x0027 }
            r8.<init>(r3, r1)     // Catch:{ all -> 0x0027 }
            int r9 = r0.m     // Catch:{ all -> 0x0027 }
            r10 = 0
            int r8 = r8.read(r2, r10, r9)     // Catch:{ all -> 0x0027 }
            r9 = -1
            if (r8 == r9) goto L_0x00a7
            r9 = r18
            r9.b0(r10, r2, r8)     // Catch:{ all -> 0x0027 }
            long r10 = (long) r8     // Catch:{ all -> 0x0027 }
            long r4 = r4 + r10
            pad r10 = r0.k     // Catch:{ all -> 0x0027 }
            int r11 = r10.b     // Catch:{ all -> 0x0027 }
            int r11 = r11 + r8
            r10.b = r11     // Catch:{ all -> 0x0027 }
            java.io.File r8 = r0.h     // Catch:{ all -> 0x0027 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x009b
            java.io.File r8 = r0.h     // Catch:{ all -> 0x0027 }
            long r13 = r8.length()     // Catch:{ all -> 0x0027 }
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0093
            float r8 = (float) r4     // Catch:{ all -> 0x0027 }
            r10 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r10
            float r11 = (float) r13     // Catch:{ all -> 0x0027 }
            float r8 = r8 / r11
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x006a
        L_0x0068:
            r12 = r10
            goto L_0x0071
        L_0x006a:
            r10 = 0
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0070
            goto L_0x0068
        L_0x0070:
            r12 = r8
        L_0x0071:
            jq6 r8 = r0.l     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x0091
            tq6 r8 = (defpackage.tq6) r8     // Catch:{ all -> 0x0027 }
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.s0     // Catch:{ all -> 0x0027 }
            boolean r10 = r10.get()     // Catch:{ all -> 0x0027 }
            if (r10 == 0) goto L_0x0080
            goto L_0x0091
        L_0x0080:
            bq6 r15 = new bq6     // Catch:{ all -> 0x0027 }
            r16 = 1
            r10 = r15
            r11 = r8
            r1 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r15)     // Catch:{ all -> 0x0027 }
            xtc r8 = r8.Y     // Catch:{ all -> 0x0027 }
            r8.b(r1)     // Catch:{ all -> 0x0027 }
        L_0x0091:
            r1 = 1
            goto L_0x002f
        L_0x0093:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "FILE_ZERO_LENGTH"
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x009b:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0027 }
            java.io.File r0 = r0.h     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0027 }
            r1.<init>(r0)     // Catch:{ all -> 0x0027 }
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x00a7:
            r3.close()
            return
        L_0x00ab:
            r3.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b4
        L_0x00af:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x00b4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk5.E(eu0):void");
    }

    public final long g() {
        return this.h.length() - this.j;
    }

    public final rl8 h() {
        return this.i;
    }
}
