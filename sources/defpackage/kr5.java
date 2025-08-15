package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kr5  reason: default package */
public final class kr5 extends AtomicInteger implements gs5, xae {
    public final hc3 X = new Object();
    public final AtomicInteger Y = new AtomicInteger(1);
    public final az Z = new AtomicReference();
    public final vae a;
    public final boolean b;
    public final int c;
    public final AtomicLong o = new AtomicLong();
    public final b66 s0;
    public final AtomicReference t0 = new AtomicReference();
    public xae u0;
    public volatile boolean v0;

    /* JADX WARNING: type inference failed for: r1v2, types: [hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public kr5(vae vae, b66 b66, boolean z, int i) {
        this.a = vae;
        this.s0 = b66;
        this.b = z;
        this.c = i;
    }

    public final void a() {
        pwd pwd = (pwd) this.t0.get();
        if (pwd != null) {
            pwd.clear();
        }
    }

    public final void b() {
        this.Y.decrementAndGet();
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    public final void cancel() {
        this.v0 = true;
        this.u0.cancel();
        this.X.g();
        this.Z.b();
    }

    public final void d() {
        int i;
        boolean z;
        vae vae = this.a;
        AtomicInteger atomicInteger = this.Y;
        AtomicReference atomicReference = this.t0;
        int i2 = 1;
        do {
            long j = this.o.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                z = false;
                if (i == 0) {
                    break;
                } else if (this.v0) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.Z.get()) == null) {
                    boolean z2 = atomicInteger.get() == 0;
                    pwd pwd = (pwd) atomicReference.get();
                    Object poll = pwd != null ? pwd.poll() : null;
                    boolean z3 = poll == null;
                    if (z2 && z3) {
                        this.Z.e(vae);
                        return;
                    } else if (z3) {
                        break;
                    } else {
                        vae.e(poll);
                        j2++;
                    }
                } else {
                    a();
                    this.Z.e(this.a);
                    return;
                }
            }
            if (i == 0) {
                if (this.v0) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.Z.get()) == null) {
                    boolean z4 = atomicInteger.get() == 0;
                    pwd pwd2 = (pwd) atomicReference.get();
                    if (pwd2 == null || pwd2.isEmpty()) {
                        z = true;
                    }
                    if (z4 && z) {
                        this.Z.e(vae);
                        return;
                    }
                } else {
                    a();
                    this.Z.e(vae);
                    return;
                }
            }
            if (j2 != 0) {
                ngg.D(this.o, j2);
                if (this.c != Integer.MAX_VALUE) {
                    this.u0.j(j2);
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    public final void e(Object obj) {
        try {
            Object apply = this.s0.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
            iqd iqd = (iqd) apply;
            this.Y.getAndIncrement();
            ez9 ez9 = new ez9(this, 1);
            if (!this.v0 && this.X.a(ez9)) {
                iqd.k(ez9);
            }
        } catch (Throwable th) {
            c37.B(th);
            this.u0.cancel();
            onError(th);
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.u0, xae)) {
            this.u0 = xae;
            this.a.f(this);
            int i = this.c;
            if (i == Integer.MAX_VALUE) {
                xae.j(Long.MAX_VALUE);
            } else {
                xae.j((long) i);
            }
        }
    }

    public final pwd g() {
        AtomicReference atomicReference = this.t0;
        pwd pwd = (pwd) atomicReference.get();
        if (pwd != null) {
            return pwd;
        }
        pwd pwd2 = new pwd(wq5.a);
        while (!atomicReference.compareAndSet((Object) null, pwd2)) {
            if (atomicReference.get() != null) {
                return (pwd) atomicReference.get();
            }
        }
        return pwd2;
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.o, j);
            c();
        }
    }

    public final void onError(Throwable th) {
        this.Y.decrementAndGet();
        if (this.Z.a(th)) {
            if (!this.b) {
                this.X.g();
            }
            c();
        }
    }
}
