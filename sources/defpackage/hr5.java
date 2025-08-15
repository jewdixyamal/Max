package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hr5  reason: default package */
public final class hr5 extends AtomicReference implements gs5, zl4 {
    public volatile boolean X;
    public volatile dqd Y;
    public long Z;
    public final long a;
    public final ir5 b;
    public final int c;
    public final int o;
    public int s0;

    public hr5(ir5 ir5, int i, long j) {
        this.a = j;
        this.b = ir5;
        this.o = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.s0 != 1) {
            long j2 = this.Z + j;
            if (j2 >= ((long) this.c)) {
                this.Z = 0;
                ((xae) get()).j(j2);
                return;
            }
            this.Z = j2;
        }
    }

    public final void b() {
        this.X = true;
        this.b.c();
    }

    public final void e(Object obj) {
        if (this.s0 != 2) {
            ir5 ir5 = this.b;
            if (ir5.get() != 0 || !ir5.compareAndSet(0, 1)) {
                dqd dqd = this.Y;
                if (dqd == null) {
                    dqd = new owd(ir5.X);
                    this.Y = dqd;
                }
                if (!dqd.offer(obj)) {
                    ir5.onError(new QueueOverflowException());
                    return;
                } else if (ir5.getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = ir5.v0.get();
                dqd dqd2 = this.Y;
                if (j == 0 || (dqd2 != null && !dqd2.isEmpty())) {
                    if (dqd2 == null) {
                        dqd2 = new owd(ir5.X);
                        this.Y = dqd2;
                    }
                    if (!dqd2.offer(obj)) {
                        ir5.onError(new QueueOverflowException());
                    }
                } else {
                    ir5.a.e(obj);
                    if (j != Long.MAX_VALUE) {
                        ir5.v0.decrementAndGet();
                    }
                    a(1);
                }
                if (ir5.decrementAndGet() == 0) {
                    return;
                }
            }
            ir5.d();
            return;
        }
        this.b.c();
    }

    public final void f(xae xae) {
        if (zae.c(this, xae)) {
            if (xae instanceof vqb) {
                vqb vqb = (vqb) xae;
                int n = vqb.n(7);
                if (n == 1) {
                    this.s0 = n;
                    this.Y = vqb;
                    this.X = true;
                    this.b.c();
                    return;
                } else if (n == 2) {
                    this.s0 = n;
                    this.Y = vqb;
                }
            }
            xae.j((long) this.o);
        }
    }

    public final void g() {
        zae.a(this);
    }

    public final boolean h() {
        return get() == zae.a;
    }

    public final void onError(Throwable th) {
        lazySet(zae.a);
        ir5 ir5 = this.b;
        if (ir5.s0.a(th)) {
            this.X = true;
            if (!ir5.c) {
                ir5.w0.cancel();
                for (hr5 hr5 : (hr5[]) ir5.u0.getAndSet(ir5.D0)) {
                    hr5.getClass();
                    zae.a(hr5);
                }
            }
            ir5.c();
        }
    }
}
