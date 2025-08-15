package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: x0a  reason: default package */
public final class x0a extends AtomicBoolean implements f2a, zl4 {
    public final f2a a;
    public final y0a b;
    public final w0a c;
    public zl4 o;

    public x0a(f2a f2a, y0a y0a, w0a w0a) {
        this.a = f2a;
        this.b = y0a;
        this.c = w0a;
    }

    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.x(this.c);
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.o, zl4)) {
            this.o = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r5 = this;
            zl4 r0 = r5.o
            r0.g()
            r0 = 0
            r1 = 1
            boolean r0 = r5.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0038
            y0a r0 = r5.b
            w0a r5 = r5.c
            monitor-enter(r0)
            w0a r1 = r0.c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0034
            if (r1 == r5) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            long r1 = r5.b     // Catch:{ all -> 0x0030 }
            r3 = 1
            long r1 = r1 - r3
            r5.b = r1     // Catch:{ all -> 0x0030 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            boolean r1 = r5.c     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            r0.y(r5)     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r5 = move-exception
            goto L_0x0036
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0a.g():void");
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.x(this.c);
            this.a.onError(th);
            return;
        }
        j47.Z(th);
    }
}
