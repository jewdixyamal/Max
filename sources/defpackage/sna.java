package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: sna  reason: default package */
public final class sna {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final rm4 a;

    public sna(rm4 rm4) {
        this.a = rm4;
    }

    public static void a(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        qna qna = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qna != null) {
            zl4 zl4 = qna.b;
            if (zl4 != null && !zl4.h()) {
                zl4.g();
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        c.remove(Long.valueOf(j));
    }

    public static void b(long j, long j2) {
        qna qna;
        if (j != 0 && (qna = (qna) b.get(Long.valueOf(j))) != null) {
            Iterator it = qna.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((pna) it.next()).b == j2) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (qna.a.isEmpty()) {
                zl4 zl4 = qna.b;
                if (zl4 != null && !zl4.h()) {
                    zl4.g();
                }
                b.remove(Long.valueOf(j));
            }
        }
    }

    public static qna c(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        qna qna = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qna != null) {
            return qna;
        }
        qna qna2 = new qna();
        concurrentHashMap.put(Long.valueOf(j), qna2);
        return qna2;
    }

    public final void d(long j, b10 b10) {
        if (j != 0) {
            long nanoTime = System.nanoTime();
            ConcurrentHashMap concurrentHashMap = c;
            rna rna = (rna) concurrentHashMap.get(Long.valueOf(j));
            if (rna != null) {
                if (b10 != rna.b) {
                    concurrentHashMap.remove(Long.valueOf(j));
                } else if (Math.abs(nanoTime - rna.a) < 5000000000L) {
                    return;
                }
            }
            concurrentHashMap.put(Long.valueOf(j), new rna(nanoTime, b10));
            k4a k4a = (k4a) ((pk) this.a.get());
            k4a.v(k4a, new wp3(2, ((p7b) k4a.y()).a.o(), j, b10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            qna r0 = c(r8)     // Catch:{ all -> 0x0018 }
            zl4 r1 = r0.b     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.h()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0054
            goto L_0x001a
        L_0x0018:
            r8 = move-exception
            goto L_0x0056
        L_0x001a:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0018 }
            ztc r6 = defpackage.muc.a()     // Catch:{ all -> 0x0018 }
            r1 = 0
            r3 = 6
            o0a r1 = defpackage.qy9.k(r1, r3, r5, r6)     // Catch:{ all -> 0x0018 }
            ztc r2 = defpackage.muc.b()     // Catch:{ all -> 0x0018 }
            r0a r1 = r1.n(r2)     // Catch:{ all -> 0x0018 }
            ona r2 = new ona     // Catch:{ all -> 0x0018 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            qy9 r1 = r1.i(r2, r3)     // Catch:{ all -> 0x0018 }
            jj9 r2 = new jj9     // Catch:{ all -> 0x0018 }
            r3 = 24
            r2.<init>((int) r3)     // Catch:{ all -> 0x0018 }
            ona r3 = new ona     // Catch:{ all -> 0x0018 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            r66 r8 = defpackage.ft.d     // Catch:{ all -> 0x0018 }
            sd7 r9 = new sd7     // Catch:{ all -> 0x0018 }
            r9.<init>(r2, r3, r8)     // Catch:{ all -> 0x0018 }
            r1.a(r9)     // Catch:{ all -> 0x0018 }
            r0.b = r9     // Catch:{ all -> 0x0018 }
        L_0x0054:
            monitor-exit(r7)
            return
        L_0x0056:
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sna.e(long):void");
    }

    public final void f(long j, b10 b10, long j2) {
        if (j != 0) {
            if (b10 == b10.AUDIO || b10 == b10.VIDEO || b10 == b10.VIDEO_MSG || b10 == b10.FILE) {
                LinkedBlockingDeque linkedBlockingDeque = c(j).a;
                Iterator it = linkedBlockingDeque.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((pna) it.next()).b == j2) {
                            break;
                        }
                    } else {
                        linkedBlockingDeque.push(new pna(j2, b10));
                        break;
                    }
                }
                e(j);
                return;
            }
            qna qna = (qna) b.get(Long.valueOf(j));
            if (qna == null || qna.a.isEmpty() || qna.b == null || qna.b.h()) {
                d(j, b10);
            }
        }
    }
}
