package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fs5  reason: default package */
public final class fs5 extends AtomicReference implements gs5, xae, Runnable {
    public final boolean X;
    public ypb Y;
    public final vae a;
    public final xtc b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();

    public fs5(vae vae, xtc xtc, ypb ypb, boolean z) {
        this.a = vae;
        this.b = xtc;
        this.Y = ypb;
        this.X = !z;
    }

    public final void a(long j, xae xae) {
        if (this.X || Thread.currentThread() == get()) {
            xae.j(j);
            return;
        }
        this.b.b(new es5(j, xae));
    }

    public final void b() {
        this.a.b();
        this.b.g();
    }

    public final void cancel() {
        zae.a(this.c);
        this.b.g();
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final void f(xae xae) {
        if (zae.c(this.c, xae)) {
            long andSet = this.o.getAndSet(0);
            if (andSet != 0) {
                a(andSet, xae);
            }
        }
    }

    public final void j(long j) {
        if (zae.d(j)) {
            AtomicReference atomicReference = this.c;
            xae xae = (xae) atomicReference.get();
            if (xae != null) {
                a(j, xae);
                return;
            }
            AtomicLong atomicLong = this.o;
            ngg.b(atomicLong, j);
            xae xae2 = (xae) atomicReference.get();
            if (xae2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, xae2);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.b.g();
    }

    public final void run() {
        lazySet(Thread.currentThread());
        ypb ypb = this.Y;
        this.Y = null;
        ((wq5) ypb).d(this);
    }
}
