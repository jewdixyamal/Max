package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xr5  reason: default package */
public final class xr5 extends AtomicInteger implements gs5, xae {
    public final AtomicLong X = new AtomicLong();
    public final boolean Y = false;
    public volatile boolean Z;
    public xae a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();
    public boolean s0;
    public final vae t0;
    public final vr5 u0;
    public final xae v0;
    public long w0;

    public xr5(c7d c7d, z6d z6d, wr5 wr5) {
        this.t0 = c7d;
        this.u0 = z6d;
        this.v0 = wr5;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            c();
        }
    }

    public final void b() {
        this.v0.cancel();
        this.t0.b();
    }

    public final void c() {
        int i = 1;
        long j = 0;
        xae xae = null;
        do {
            xae xae2 = (xae) this.c.get();
            if (xae2 != null) {
                xae2 = (xae) this.c.getAndSet((Object) null);
            }
            long j2 = this.o.get();
            if (j2 != 0) {
                j2 = this.o.getAndSet(0);
            }
            long j3 = this.X.get();
            if (j3 != 0) {
                j3 = this.X.getAndSet(0);
            }
            xae xae3 = this.a;
            if (this.Z) {
                if (xae3 != null) {
                    xae3.cancel();
                    this.a = null;
                }
                if (xae2 != null) {
                    xae2.cancel();
                }
            } else {
                long j4 = this.b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = ngg.c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            j47.Z(new IllegalStateException(ey8.h(j4, "More produced than requested: ")));
                            j4 = 0;
                        }
                    }
                    this.b = j4;
                }
                if (xae2 != null) {
                    if (xae3 != null && this.Y) {
                        xae3.cancel();
                    }
                    this.a = xae2;
                    if (j4 != 0) {
                        j = ngg.c(j, j4);
                        xae = xae2;
                    }
                } else if (!(xae3 == null || j2 == 0)) {
                    j = ngg.c(j, j2);
                    xae = xae3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            xae.j(j);
        }
    }

    public final void cancel() {
        if (!this.Z) {
            this.Z = true;
            a();
        }
        this.v0.cancel();
    }

    public final void d(xae xae) {
        if (this.Z) {
            xae.cancel();
            return;
        }
        Objects.requireNonNull(xae, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            xae xae2 = (xae) this.c.getAndSet(xae);
            if (xae2 != null && this.Y) {
                xae2.cancel();
            }
            a();
            return;
        }
        xae xae3 = this.a;
        if (xae3 != null && this.Y) {
            xae3.cancel();
        }
        this.a = xae;
        long j = this.b;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j != 0) {
            xae.j(j);
        }
    }

    public final void e(Object obj) {
        this.w0++;
        this.t0.e(obj);
    }

    public void f(xae xae) {
        d(xae);
    }

    public final void j(long j) {
        if (zae.d(j) && !this.s0) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                ngg.b(this.o, j);
                a();
                return;
            }
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                long c2 = ngg.c(j2, j);
                this.b = c2;
                if (c2 == Long.MAX_VALUE) {
                    this.s0 = true;
                }
            }
            xae xae = this.a;
            if (decrementAndGet() != 0) {
                c();
            }
            if (xae != null) {
                xae.j(j);
            }
        }
    }

    public final void onError(Throwable th) {
        d(b05.a);
        long j = this.w0;
        long j2 = 0;
        if (j != 0) {
            this.w0 = 0;
            if (!this.s0) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    ngg.b(this.X, j);
                    a();
                } else {
                    long j3 = this.b;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 - j;
                        if (j4 < 0) {
                            j47.Z(new IllegalStateException(ey8.h(j4, "More produced than requested: ")));
                        } else {
                            j2 = j4;
                        }
                        this.b = j2;
                    }
                    if (decrementAndGet() != 0) {
                        c();
                    }
                }
            }
        }
        this.v0.j(1);
        this.u0.e(th);
    }
}
