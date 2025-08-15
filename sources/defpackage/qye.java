package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qye  reason: default package */
public final class qye {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final wye a;
    public final dp3 b;
    public final gaa c = new gaa(18);
    public final djb d;
    public final glc e;
    public volatile boolean f;
    public final je7 g;
    public final AtomicInteger h;

    /* JADX WARNING: type inference failed for: r0v0, types: [dp3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0038, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qye(defpackage.wye r3) {
        /*
            r2 = this;
            dp3 r0 = new dp3
            r0.<init>()
            r2.<init>()
            r2.a = r3
            r2.b = r0
            gaa r0 = new gaa
            r1 = 18
            r0.<init>((int) r1)
            r2.c = r0
            djb r0 = r3.k
            r2.d = r0
            glc r1 = new glc
            r1.<init>((defpackage.wye) r3, (defpackage.djb) r0)
            r2.e = r1
            ie r0 = new ie
            r1 = 10
            r0.<init>((int) r1, (java.lang.Object) r2)
            r1 = 2
            je7 r0 = defpackage.tu0.r(r1, r0)
            r2.g = r0
            java.util.concurrent.ConcurrentHashMap r0 = i
            java.lang.String r3 = r3.a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            r2.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qye.<init>(wye):void");
    }

    public final void a(String str, Throwable th) {
        if (!this.f && ((Boolean) this.g.getValue()).booleanValue()) {
            djb djb = this.d;
            djb.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= djb.h().getLong("system.shutdown.until.ts", Long.MIN_VALUE) && currentTimeMillis >= djb.h().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE)) {
                int incrementAndGet = this.h.incrementAndGet();
                if (incrementAndGet <= 8) {
                    ((Executor) this.a.j.a).execute(new yg3(this, th, str));
                } else if (incrementAndGet - 8 == 1) {
                    ((Executor) this.a.j.a).execute(new ule(4, this));
                }
            }
        }
    }
}
