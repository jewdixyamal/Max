package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vt6  reason: default package */
public final class vt6 extends qt6 {
    public ov6 A0;
    public ut6 B0;
    public final Executor y0;
    public final Object z0 = new Object();

    public vt6(Executor executor) {
        this.y0 = executor;
    }

    public final ov6 a(qv6 qv6) {
        return qv6.g();
    }

    public final void c() {
        synchronized (this.z0) {
            try {
                ov6 ov6 = this.A0;
                if (ov6 != null) {
                    ov6.close();
                    this.A0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ov6 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.z0
            monitor-enter(r0)
            boolean r1 = r5.x0     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            r6.close()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r5 = move-exception
            goto L_0x0054
        L_0x000e:
            ut6 r1 = r5.B0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0039
            su6 r1 = r6.getImageInfo()     // Catch:{ all -> 0x000c }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x000c }
            ut6 r3 = r5.B0     // Catch:{ all -> 0x000c }
            ov6 r3 = r3.b     // Catch:{ all -> 0x000c }
            su6 r3 = r3.getImageInfo()     // Catch:{ all -> 0x000c }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x000c }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002e
            r6.close()     // Catch:{ all -> 0x000c }
            goto L_0x0037
        L_0x002e:
            ov6 r1 = r5.A0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x0035:
            r5.A0 = r6     // Catch:{ all -> 0x000c }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0039:
            ut6 r1 = new ut6     // Catch:{ all -> 0x000c }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x000c }
            r5.B0 = r1     // Catch:{ all -> 0x000c }
            bm7 r5 = r5.b(r1)     // Catch:{ all -> 0x000c }
            w4d r6 = new w4d     // Catch:{ all -> 0x000c }
            r2 = 16
            r6.<init>((int) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x000c }
            ok4 r1 = defpackage.ju0.k()     // Catch:{ all -> 0x000c }
            defpackage.kq0.a(r5, r6, r1)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt6.e(ov6):void");
    }
}
