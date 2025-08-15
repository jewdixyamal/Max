package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k1a  reason: default package */
public final class k1a extends AtomicInteger implements f2a, zl4 {
    public final br5 X = new br5(this);
    public final AtomicReference Y = new AtomicReference();
    public final r1a Z;
    public final f2a a;
    public final AtomicInteger b = new AtomicInteger();
    public final az c = new AtomicReference();
    public final vg3 o;
    public volatile boolean s0;

    /* JADX WARNING: type inference failed for: r1v2, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public k1a(f2a f2a, b7d b7d, r1a r1a) {
        this.a = f2a;
        this.o = b7d;
        this.Z = r1a;
    }

    public final void a() {
        if (this.b.getAndIncrement() == 0) {
            while (!h()) {
                if (!this.s0) {
                    this.s0 = true;
                    this.Z.a(this);
                }
                if (this.b.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        dm4.a(this.X);
        if (getAndIncrement() == 0) {
            this.c.d(this.a);
        }
    }

    public final void c(zl4 zl4) {
        dm4.c(this.Y, zl4);
    }

    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            f2a f2a = this.a;
            f2a.e(obj);
            if (decrementAndGet() != 0) {
                this.c.d(f2a);
            }
        }
    }

    public final void g() {
        dm4.a(this.Y);
        dm4.a(this.X);
    }

    public final boolean h() {
        return dm4.b((zl4) this.Y.get());
    }

    public final void onError(Throwable th) {
        dm4.c(this.Y, (zl4) null);
        this.s0 = false;
        this.o.e(th);
    }
}
