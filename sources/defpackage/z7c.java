package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z7c  reason: default package */
public final class z7c implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final gq1 b;
    public final /* synthetic */ b8c c;

    public z7c(b8c b8c, gq1 gq1) {
        this.c = b8c;
        this.b = gq1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "Callback failure for "
            java.lang.String r1 = "canceled due to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OkHttp "
            r2.<init>(r3)
            b8c r3 = r8.c
            mhc r3 = r3.B0
            vq6 r3 = r3.b
            java.lang.String r3 = r3.g()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = r3.getName()
            r3.setName(r2)
            b8c r2 = r8.c     // Catch:{ all -> 0x0047 }
            qp6 r2 = r2.c     // Catch:{ all -> 0x0047 }
            r2.i()     // Catch:{ all -> 0x0047 }
            r2 = 0
            b8c r5 = r8.c     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            yic r2 = r5.h()     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            r5 = 1
            gq1 r6 = r8.b     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            b8c r7 = r8.c     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r6.m(r7, r2)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            b8c r0 = r8.c     // Catch:{ all -> 0x0047 }
            u2a r0 = r0.A0     // Catch:{ all -> 0x0047 }
            a8g r0 = r0.a     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r0.j(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x00a8
        L_0x0047:
            r8 = move-exception
            goto L_0x00b6
        L_0x004a:
            r0 = move-exception
            r2 = r5
            goto L_0x0054
        L_0x004d:
            r1 = move-exception
            r2 = r5
            goto L_0x007a
        L_0x0050:
            r0 = move-exception
            goto L_0x0054
        L_0x0052:
            r1 = move-exception
            goto L_0x007a
        L_0x0054:
            b8c r5 = r8.c     // Catch:{ all -> 0x0077 }
            r5.d()     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0079
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r1)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            defpackage.j47.e(r2, r0)     // Catch:{ all -> 0x0077 }
            gq1 r1 = r8.b     // Catch:{ all -> 0x0077 }
            b8c r5 = r8.c     // Catch:{ all -> 0x0077 }
            r1.q(r5, r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r0 = move-exception
            goto L_0x00ac
        L_0x0079:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007a:
            if (r2 == 0) goto L_0x009a
            q2b r2 = defpackage.q2b.a     // Catch:{ all -> 0x0077 }
            q2b r2 = defpackage.q2b.a     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r0)     // Catch:{ all -> 0x0077 }
            b8c r0 = r8.c     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = defpackage.b8c.a(r0)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.getClass()     // Catch:{ all -> 0x0077 }
            r2 = 4
            defpackage.q2b.i(r2, r0, r1)     // Catch:{ all -> 0x0077 }
            goto L_0x00a1
        L_0x009a:
            gq1 r0 = r8.b     // Catch:{ all -> 0x0077 }
            b8c r2 = r8.c     // Catch:{ all -> 0x0077 }
            r0.q(r2, r1)     // Catch:{ all -> 0x0077 }
        L_0x00a1:
            b8c r0 = r8.c     // Catch:{ all -> 0x0047 }
            u2a r0 = r0.A0     // Catch:{ all -> 0x0047 }
            a8g r0 = r0.a     // Catch:{ all -> 0x0047 }
            goto L_0x0043
        L_0x00a8:
            r3.setName(r4)
            return
        L_0x00ac:
            b8c r1 = r8.c     // Catch:{ all -> 0x0047 }
            u2a r1 = r1.A0     // Catch:{ all -> 0x0047 }
            a8g r1 = r1.a     // Catch:{ all -> 0x0047 }
            r1.j(r8)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x00b6:
            r3.setName(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7c.run():void");
    }
}
