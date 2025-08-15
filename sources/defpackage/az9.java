package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: az9  reason: default package */
public final class az9 extends AtomicInteger implements f2a, zl4 {
    public final zy9 X;
    public final boolean Y;
    public dqd Z;
    public final f2a a;
    public final b66 b;
    public final int c;
    public final az o = new AtomicReference();
    public zl4 s0;
    public volatile boolean t0;
    public volatile boolean u0;
    public volatile boolean v0;
    public int w0;

    /* JADX WARNING: type inference failed for: r2v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public az9(f2a f2a, b66 b66, int i, boolean z) {
        this.a = f2a;
        this.b = b66;
        this.c = i;
        this.Y = z;
        this.X = new zy9(f2a, this, 0);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            f2a f2a = this.a;
            dqd dqd = this.Z;
            az azVar = this.o;
            while (true) {
                if (!this.t0) {
                    if (this.v0) {
                        dqd.clear();
                        return;
                    } else if (this.Y || ((Throwable) azVar.get()) == null) {
                        boolean z = this.u0;
                        try {
                            Object poll = dqd.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.v0 = true;
                                azVar.d(f2a);
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.b.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    r1a r1a = (r1a) apply;
                                    if (r1a instanceof kde) {
                                        try {
                                            Object obj = ((kde) r1a).get();
                                            if (obj != null && !this.v0) {
                                                f2a.e(obj);
                                            }
                                        } catch (Throwable th) {
                                            c37.B(th);
                                            azVar.a(th);
                                        }
                                    } else {
                                        this.t0 = true;
                                        r1a.a(this.X);
                                    }
                                } catch (Throwable th2) {
                                    c37.B(th2);
                                    this.v0 = true;
                                    this.s0.g();
                                    dqd.clear();
                                    azVar.a(th2);
                                    azVar.d(f2a);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            c37.B(th3);
                            this.v0 = true;
                            this.s0.g();
                            azVar.a(th3);
                            azVar.d(f2a);
                            return;
                        }
                    } else {
                        dqd.clear();
                        this.v0 = true;
                        azVar.d(f2a);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.u0 = true;
        a();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.s0, zl4)) {
            this.s0 = zl4;
            if (zl4 instanceof tqb) {
                tqb tqb = (tqb) zl4;
                int n = tqb.n(3);
                if (n == 1) {
                    this.w0 = n;
                    this.Z = tqb;
                    this.u0 = true;
                    this.a.c(this);
                    a();
                    return;
                } else if (n == 2) {
                    this.w0 = n;
                    this.Z = tqb;
                    this.a.c(this);
                    return;
                }
            }
            this.Z = new pwd(this.c);
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (this.w0 == 0) {
            this.Z.offer(obj);
        }
        a();
    }

    public final void g() {
        this.v0 = true;
        this.s0.g();
        zy9 zy9 = this.X;
        zy9.getClass();
        dm4.a(zy9);
        this.o.b();
    }

    public final boolean h() {
        return this.v0;
    }

    public final void onError(Throwable th) {
        if (this.o.a(th)) {
            this.u0 = true;
            a();
        }
    }
}
