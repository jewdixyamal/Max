package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x1a  reason: default package */
public final class x1a extends AtomicInteger implements f2a, zl4, Runnable {
    public final boolean X;
    public final AtomicReference Y;
    public final qj3 Z;
    public final f2a a;
    public final long b = 3;
    public final TimeUnit c;
    public final xtc o;
    public zl4 s0;
    public volatile boolean t0;
    public Throwable u0;
    public volatile boolean v0;
    public volatile boolean w0;
    public boolean x0;

    public x1a(f2a f2a, TimeUnit timeUnit, xtc xtc) {
        this.a = f2a;
        this.c = timeUnit;
        this.o = xtc;
        this.X = false;
        this.Y = new AtomicReference();
        this.Z = null;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.Y;
            f2a f2a = this.a;
            int i = 1;
            while (!this.v0) {
                boolean z = this.t0;
                Throwable th = this.u0;
                if (!z || th == null) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (!z2) {
                            Object andSet = atomicReference.getAndSet((Object) null);
                            if (this.X) {
                                f2a.e(andSet);
                            } else {
                                qj3 qj3 = this.Z;
                                if (qj3 != null) {
                                    try {
                                        qj3.accept(andSet);
                                    } catch (Throwable th2) {
                                        c37.B(th2);
                                        f2a.onError(th2);
                                        this.o.g();
                                        return;
                                    }
                                }
                            }
                        }
                        f2a.b();
                        this.o.g();
                        return;
                    }
                    if (z2) {
                        if (this.w0) {
                            this.x0 = false;
                            this.w0 = false;
                        }
                    } else if (!this.x0 || this.w0) {
                        f2a.e(atomicReference.getAndSet((Object) null));
                        this.w0 = false;
                        this.x0 = true;
                        this.o.c(this, this.b, this.c);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    if (this.Z != null) {
                        Object andSet2 = atomicReference.getAndSet((Object) null);
                        if (andSet2 != null) {
                            try {
                                this.Z.accept(andSet2);
                            } catch (Throwable th3) {
                                c37.B(th3);
                                th = new CompositeException(th, th3);
                            }
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    f2a.onError(th);
                    this.o.g();
                    return;
                }
            }
            AtomicReference atomicReference2 = this.Y;
            qj3 qj32 = this.Z;
            if (qj32 != null) {
                Object andSet3 = atomicReference2.getAndSet((Object) null);
                if (andSet3 != null) {
                    try {
                        qj32.accept(andSet3);
                    } catch (Throwable th4) {
                        c37.B(th4);
                        j47.Z(th4);
                    }
                }
            } else {
                atomicReference2.lazySet((Object) null);
            }
        }
    }

    public final void b() {
        this.t0 = true;
        a();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.s0, zl4)) {
            this.s0 = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        Object andSet = this.Y.getAndSet(obj);
        qj3 qj3 = this.Z;
        if (!(qj3 == null || andSet == null)) {
            try {
                qj3.accept(andSet);
            } catch (Throwable th) {
                c37.B(th);
                this.s0.g();
                this.u0 = th;
                this.t0 = true;
            }
        }
        a();
    }

    public final void g() {
        this.v0 = true;
        this.s0.g();
        this.o.g();
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.Y;
            qj3 qj3 = this.Z;
            if (qj3 != null) {
                Object andSet = atomicReference.getAndSet((Object) null);
                if (andSet != null) {
                    try {
                        qj3.accept(andSet);
                    } catch (Throwable th) {
                        c37.B(th);
                        j47.Z(th);
                    }
                }
            } else {
                atomicReference.lazySet((Object) null);
            }
        }
    }

    public final boolean h() {
        return this.v0;
    }

    public final void onError(Throwable th) {
        this.u0 = th;
        this.t0 = true;
        a();
    }

    public final void run() {
        this.w0 = true;
        a();
    }
}
