package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hg7  reason: default package */
public final class hg7 implements ah7, fv1 {
    public final Object a = new Object();
    public final eh7 b;
    public final xx1 c;
    public boolean o = false;

    public hg7(eh7 eh7, xx1 xx1) {
        this.b = eh7;
        this.c = xx1;
        if (eh7.Q().d.a(fg7.o)) {
            xx1.e();
        } else {
            xx1.s();
        }
        eh7.Q().a(this);
    }

    public final yw1 a() {
        return this.c.C0;
    }

    public final eh7 c() {
        eh7 eh7;
        synchronized (this.a) {
            eh7 = this.b;
        }
        return eh7;
    }

    public final List e() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.c.w());
        }
        return unmodifiableList;
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    onStop(this.b);
                    this.o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p3a(eg7.ON_DESTROY)
    public void onDestroy(eh7 eh7) {
        synchronized (this.a) {
            xx1 xx1 = this.c;
            xx1.z((ArrayList) xx1.w());
        }
    }

    @p3a(eg7.ON_PAUSE)
    public void onPause(eh7 eh7) {
        this.c.a.j(false);
    }

    @p3a(eg7.ON_RESUME)
    public void onResume(eh7 eh7) {
        this.c.a.j(true);
    }

    @p3a(eg7.ON_START)
    public void onStart(eh7 eh7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p3a(eg7.ON_STOP)
    public void onStop(eh7 eh7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.o     // Catch:{ all -> 0x0009 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r3 = move-exception
            goto L_0x0025
        L_0x000b:
            r1 = 0
            r3.o = r1     // Catch:{ all -> 0x0009 }
            eh7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            gh7 r1 = r1.Q()     // Catch:{ all -> 0x0009 }
            fg7 r1 = r1.d     // Catch:{ all -> 0x0009 }
            fg7 r2 = defpackage.fg7.o     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.a(r2)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0023
            eh7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            r3.onStart(r1)     // Catch:{ all -> 0x0009 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg7.q():void");
    }
}
