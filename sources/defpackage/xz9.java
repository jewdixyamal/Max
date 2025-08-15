package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xz9  reason: default package */
public final class xz9 extends AtomicReference implements f2a {
    public final yz9 a;
    public volatile boolean b;
    public volatile dqd c;
    public int o;

    public xz9(yz9 yz9) {
        this.a = yz9;
    }

    public final void b() {
        this.b = true;
        this.a.f();
    }

    public final void c(zl4 zl4) {
        if (dm4.e(this, zl4) && (zl4 instanceof tqb)) {
            tqb tqb = (tqb) zl4;
            int n = tqb.n(7);
            if (n == 1) {
                this.o = n;
                this.c = tqb;
                this.b = true;
                this.a.f();
            } else if (n == 2) {
                this.o = n;
                this.c = tqb;
            }
        }
    }

    public final void e(Object obj) {
        if (this.o == 0) {
            yz9 yz9 = this.a;
            if (yz9.get() != 0 || !yz9.compareAndSet(0, 1)) {
                dqd dqd = this.c;
                if (dqd == null) {
                    dqd = new pwd(yz9.X);
                    this.c = dqd;
                }
                dqd.offer(obj);
                if (yz9.getAndIncrement() != 0) {
                    return;
                }
            } else {
                yz9.a.e(obj);
                if (yz9.decrementAndGet() == 0) {
                    return;
                }
            }
            yz9.i();
            return;
        }
        this.a.f();
    }

    public final void onError(Throwable th) {
        if (this.a.s0.a(th)) {
            yz9 yz9 = this.a;
            if (!yz9.c) {
                yz9.d();
            }
            this.b = true;
            this.a.f();
        }
    }
}
