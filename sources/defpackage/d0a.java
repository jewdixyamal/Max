package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d0a  reason: default package */
public final class d0a extends AtomicInteger implements f2a, zl4 {
    public final AtomicInteger X;
    public final az Y;
    public final b66 Z;
    public final /* synthetic */ int a;
    public final f2a b;
    public final boolean c;
    public final hc3 o;
    public final AtomicReference s0;
    public zl4 t0;
    public volatile boolean u0;

    /* JADX WARNING: type inference failed for: r1v2, types: [hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [az, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v7, types: [hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public d0a(f2a f2a, b66 b66, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = f2a;
                this.Z = b66;
                this.c = false;
                this.o = new Object();
                this.Y = new AtomicReference();
                this.X = new AtomicInteger(1);
                this.s0 = new AtomicReference();
                return;
            default:
                this.b = f2a;
                this.Z = b66;
                this.c = false;
                this.o = new Object();
                this.Y = new AtomicReference();
                this.X = new AtomicInteger(1);
                this.s0 = new AtomicReference();
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                f2a f2a = this.b;
                AtomicInteger atomicInteger = this.X;
                AtomicReference atomicReference = this.s0;
                int i = 1;
                while (!this.u0) {
                    if (this.c || ((Throwable) this.Y.get()) == null) {
                        boolean z = false;
                        boolean z2 = atomicInteger.get() == 0;
                        pwd pwd = (pwd) atomicReference.get();
                        Object poll = pwd != null ? pwd.poll() : null;
                        if (poll == null) {
                            z = true;
                        }
                        if (z2 && z) {
                            this.Y.d(f2a);
                            return;
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            f2a.e(poll);
                        }
                    } else {
                        pwd pwd2 = (pwd) this.s0.get();
                        if (pwd2 != null) {
                            pwd2.clear();
                        }
                        this.Y.d(f2a);
                        return;
                    }
                }
                pwd pwd3 = (pwd) this.s0.get();
                if (pwd3 != null) {
                    pwd3.clear();
                    return;
                }
                return;
            default:
                f2a f2a2 = this.b;
                AtomicInteger atomicInteger2 = this.X;
                AtomicReference atomicReference2 = this.s0;
                int i2 = 1;
                while (!this.u0) {
                    if (this.c || ((Throwable) this.Y.get()) == null) {
                        boolean z3 = false;
                        boolean z4 = atomicInteger2.get() == 0;
                        pwd pwd4 = (pwd) atomicReference2.get();
                        Object poll2 = pwd4 != null ? pwd4.poll() : null;
                        if (poll2 == null) {
                            z3 = true;
                        }
                        if (z4 && z3) {
                            this.Y.d(this.b);
                            return;
                        } else if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            f2a2.e(poll2);
                        }
                    } else {
                        pwd pwd5 = (pwd) this.s0.get();
                        if (pwd5 != null) {
                            pwd5.clear();
                        }
                        this.Y.d(f2a2);
                        return;
                    }
                }
                pwd pwd6 = (pwd) this.s0.get();
                if (pwd6 != null) {
                    pwd6.clear();
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
            default:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.t0, zl4)) {
                    this.t0 = zl4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.t0, zl4)) {
                    this.t0 = zl4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    f38 f38 = (f38) apply;
                    this.X.getAndIncrement();
                    j28 j28 = new j28(this);
                    if (!this.u0 && this.o.a(j28)) {
                        f38.a(j28);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    this.t0.g();
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.Z.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null SingleSource");
                    iqd iqd = (iqd) apply2;
                    this.X.getAndIncrement();
                    ez9 ez9 = new ez9(this, 2);
                    if (!this.u0 && this.o.a(ez9)) {
                        iqd.k(ez9);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    this.t0.g();
                    onError(th2);
                    return;
                }
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.u0 = true;
                this.t0.g();
                this.o.g();
                this.Y.b();
                return;
            default:
                this.u0 = true;
                this.t0.g();
                this.o.g();
                this.Y.b();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.u0;
            default:
                return this.u0;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.g();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.g();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
