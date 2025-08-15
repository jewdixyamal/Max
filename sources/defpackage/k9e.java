package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k9e  reason: default package */
public final class k9e extends AtomicInteger implements gs5, xae {
    public final AtomicBoolean X = new AtomicBoolean();
    public volatile boolean Y;
    public final vae a;
    public final az b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference o = new AtomicReference();

    /* JADX WARNING: type inference failed for: r1v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public k9e(vae vae) {
        this.a = vae;
    }

    public final void b() {
        this.Y = true;
        vae vae = this.a;
        az azVar = this.b;
        if (getAndIncrement() == 0) {
            azVar.e(vae);
        }
    }

    public final void cancel() {
        if (!this.Y) {
            zae.a(this.o);
        }
    }

    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            vae vae = this.a;
            vae.e(obj);
            if (decrementAndGet() != 0) {
                this.b.e(vae);
            }
        }
    }

    public final void f(xae xae) {
        if (this.X.compareAndSet(false, true)) {
            this.a.f(this);
            AtomicReference atomicReference = this.o;
            AtomicLong atomicLong = this.c;
            if (zae.c(atomicReference, xae)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    xae.j(andSet);
                    return;
                }
                return;
            }
            return;
        }
        xae.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void j(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(ey8.h(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        zae.b(this.o, this.c, j);
    }

    public final void onError(Throwable th) {
        this.Y = true;
        vae vae = this.a;
        az azVar = this.b;
        if (azVar.a(th) && getAndIncrement() == 0) {
            azVar.e(vae);
        }
    }
}
