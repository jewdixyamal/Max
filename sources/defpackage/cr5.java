package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cr5  reason: default package */
public final class cr5 extends AtomicInteger implements xae, gs5 {
    public volatile int A0;
    public xae X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final az a = new AtomicReference();
    public final int b;
    public final int c;
    public dqd o;
    public boolean s0;
    public final vae t0;
    public final b66 u0;
    public final AtomicLong v0;
    public final br5 w0;
    public long x0;
    public int y0;
    public Object z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public cr5(vae vae, b66 b66, int i, int i2) {
        this.c = i2;
        this.b = i;
        this.t0 = vae;
        this.u0 = b66;
        this.v0 = new AtomicLong();
        this.w0 = new br5(0, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            vae vae = this.t0;
            int i = this.c;
            dqd dqd = this.o;
            az azVar = this.a;
            AtomicLong atomicLong = this.v0;
            int i2 = this.b;
            int i3 = i2 - (i2 >> 1);
            boolean z = this.s0;
            int i4 = 1;
            while (true) {
                if (this.Z) {
                    dqd.clear();
                    this.z0 = null;
                } else {
                    int i5 = this.A0;
                    if (azVar.get() == null || !(i == 1 || (i == 2 && i5 == 0))) {
                        if (i5 == 0) {
                            boolean z2 = this.Y;
                            try {
                                Object poll = dqd.poll();
                                boolean z3 = poll == null;
                                if (z2 && z3) {
                                    azVar.e(vae);
                                    return;
                                } else if (!z3) {
                                    if (!z) {
                                        int i6 = this.y0 + 1;
                                        if (i6 == i3) {
                                            this.y0 = 0;
                                            this.X.j((long) i3);
                                        } else {
                                            this.y0 = i6;
                                        }
                                    }
                                    try {
                                        Object apply = this.u0.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        iqd iqd = (iqd) apply;
                                        this.A0 = 1;
                                        iqd.k(this.w0);
                                    } catch (Throwable th) {
                                        c37.B(th);
                                        this.X.cancel();
                                        dqd.clear();
                                        azVar.a(th);
                                        azVar.e(vae);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                c37.B(th3);
                                this.X.cancel();
                                azVar.a(th3);
                                azVar.e(vae);
                                return;
                            }
                        } else if (i5 == 2) {
                            long j = this.x0;
                            if (j != atomicLong.get()) {
                                Object obj = this.z0;
                                this.z0 = null;
                                vae.e(obj);
                                this.x0 = j + 1;
                                this.A0 = 0;
                            }
                        }
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
            dqd.clear();
            this.z0 = null;
            azVar.e(vae);
        }
    }

    public final void b() {
        this.Y = true;
        a();
    }

    public final void cancel() {
        this.Z = true;
        this.X.cancel();
        br5 br5 = this.w0;
        br5.getClass();
        dm4.a(br5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.z0 = null;
        }
    }

    public final void e(Object obj) {
        if (obj == null || this.o.offer(obj)) {
            a();
            return;
        }
        this.X.cancel();
        onError(new QueueOverflowException());
    }

    public final void f(xae xae) {
        if (zae.e(this.X, xae)) {
            this.X = xae;
            if (xae instanceof vqb) {
                vqb vqb = (vqb) xae;
                int n = vqb.n(7);
                if (n == 1) {
                    this.o = vqb;
                    this.s0 = true;
                    this.Y = true;
                    this.t0.f(this);
                    a();
                    return;
                } else if (n == 2) {
                    this.o = vqb;
                    this.t0.f(this);
                    this.X.j((long) this.b);
                    return;
                }
            }
            this.o = new owd(this.b);
            this.t0.f(this);
            this.X.j((long) this.b);
        }
    }

    public final void j(long j) {
        ngg.b(this.v0, j);
        a();
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                br5 br5 = this.w0;
                br5.getClass();
                dm4.a(br5);
            }
            this.Y = true;
            a();
        }
    }
}
