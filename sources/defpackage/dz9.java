package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dz9  reason: default package */
public final class dz9 extends AtomicInteger implements f2a, zl4 {
    public zl4 X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final az a = new AtomicReference();
    public final int b = 2;
    public final int c = 1;
    public dqd o;
    public final f2a s0;
    public final b66 t0;
    public final br5 u0;
    public Object v0;
    public volatile int w0;

    /* JADX WARNING: type inference failed for: r0v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public dz9(f2a f2a, b66 b66) {
        this.s0 = f2a;
        this.t0 = b66;
        this.u0 = new br5(1, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            f2a f2a = this.s0;
            int i = this.c;
            dqd dqd = this.o;
            az azVar = this.a;
            int i2 = 1;
            while (true) {
                if (this.Z) {
                    dqd.clear();
                    this.v0 = null;
                } else {
                    int i3 = this.w0;
                    if (azVar.get() == null || !(i == 1 || (i == 2 && i3 == 0))) {
                        boolean z = false;
                        if (i3 == 0) {
                            boolean z2 = this.Y;
                            try {
                                Object poll = dqd.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    azVar.d(f2a);
                                    return;
                                } else if (!z) {
                                    try {
                                        Object apply = this.t0.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        iqd iqd = (iqd) apply;
                                        this.w0 = 1;
                                        iqd.k(this.u0);
                                    } catch (Throwable th) {
                                        c37.B(th);
                                        this.X.g();
                                        dqd.clear();
                                        azVar.a(th);
                                        azVar.d(f2a);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                c37.B(th2);
                                this.Z = true;
                                this.X.g();
                                azVar.a(th2);
                                azVar.d(f2a);
                                return;
                            }
                        } else if (i3 == 2) {
                            Object obj = this.v0;
                            this.v0 = null;
                            f2a.e(obj);
                            this.w0 = 0;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            dqd.clear();
            this.v0 = null;
            azVar.d(f2a);
        }
    }

    public final void b() {
        this.Y = true;
        a();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.X, zl4)) {
            this.X = zl4;
            if (zl4 instanceof tqb) {
                tqb tqb = (tqb) zl4;
                int n = tqb.n(7);
                if (n == 1) {
                    this.o = tqb;
                    this.Y = true;
                    this.s0.c(this);
                    a();
                    return;
                } else if (n == 2) {
                    this.o = tqb;
                    this.s0.c(this);
                    return;
                }
            }
            this.o = new pwd(this.b);
            this.s0.c(this);
        }
    }

    public final void e(Object obj) {
        if (obj != null) {
            this.o.offer(obj);
        }
        a();
    }

    public final void g() {
        this.Z = true;
        this.X.g();
        br5 br5 = this.u0;
        br5.getClass();
        dm4.a(br5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.v0 = null;
        }
    }

    public final boolean h() {
        return this.Z;
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                br5 br5 = this.u0;
                br5.getClass();
                dm4.a(br5);
            }
            this.Y = true;
            a();
        }
    }
}
