package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: s67  reason: default package */
public final class s67 extends xtc implements Runnable {
    public final hc3 a;
    public final r67 b;
    public final t67 c;
    public final AtomicBoolean o = new AtomicBoolean();

    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, java.lang.Object] */
    public s67(r67 r67) {
        t67 t67;
        t67 t672;
        this.b = r67;
        this.a = new Object();
        if (r67.c.b) {
            t67 = u67.h;
        } else {
            while (true) {
                if (r67.b.isEmpty()) {
                    t672 = new t67(r67.Y);
                    r67.c.a(t672);
                    break;
                }
                t672 = (t67) r67.b.poll();
                if (t672 != null) {
                    break;
                }
            }
            t67 = t672;
        }
        this.c = t67;
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a.b) {
            return iz4.a;
        }
        return this.c.e(runnable, j, timeUnit, this.a);
    }

    public final void g() {
        if (this.o.compareAndSet(false, true)) {
            this.a.g();
            if (u67.i) {
                this.c.e(this, 0, TimeUnit.NANOSECONDS, (am4) null);
                return;
            }
            r67 r67 = this.b;
            r67.getClass();
            t67 t67 = this.c;
            t67.c = System.nanoTime() + r67.a;
            r67.b.offer(t67);
        }
    }

    public final boolean h() {
        return this.o.get();
    }

    public final void run() {
        r67 r67 = this.b;
        r67.getClass();
        t67 t67 = this.c;
        t67.c = System.nanoTime() + r67.a;
        r67.b.offer(t67);
    }
}
