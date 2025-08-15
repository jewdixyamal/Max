package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bz9  reason: default package */
public final class bz9 extends AtomicInteger implements f2a, zl4 {
    public dqd X;
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final b66 b;
    public final zy9 c;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public int u0;

    public bz9(y6d y6d, b66 b66, int i) {
        this.a = y6d;
        this.b = b66;
        this.o = i;
        this.c = new zy9(y6d, this, 1);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            while (!this.s0) {
                if (!this.Z) {
                    boolean z = this.t0;
                    try {
                        Object poll = this.X.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.s0 = true;
                            this.a.b();
                            return;
                        } else if (!z2) {
                            try {
                                Object apply = this.b.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                r1a r1a = (r1a) apply;
                                this.Z = true;
                                r1a.a(this.c);
                            } catch (Throwable th) {
                                c37.B(th);
                                g();
                                this.X.clear();
                                this.a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        g();
                        this.X.clear();
                        this.a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.X.clear();
        }
    }

    public final void b() {
        if (!this.t0) {
            this.t0 = true;
            a();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            if (zl4 instanceof tqb) {
                tqb tqb = (tqb) zl4;
                int n = tqb.n(3);
                if (n == 1) {
                    this.u0 = n;
                    this.X = tqb;
                    this.t0 = true;
                    this.a.c(this);
                    a();
                    return;
                } else if (n == 2) {
                    this.u0 = n;
                    this.X = tqb;
                    this.a.c(this);
                    return;
                }
            }
            this.X = new pwd(this.o);
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!this.t0) {
            if (this.u0 == 0) {
                this.X.offer(obj);
            }
            a();
        }
    }

    public final void g() {
        this.s0 = true;
        zy9 zy9 = this.c;
        zy9.getClass();
        dm4.a(zy9);
        this.Y.g();
        if (getAndIncrement() == 0) {
            this.X.clear();
        }
    }

    public final boolean h() {
        return this.s0;
    }

    public final void onError(Throwable th) {
        if (this.t0) {
            j47.Z(th);
            return;
        }
        this.t0 = true;
        g();
        this.a.onError(th);
    }
}
