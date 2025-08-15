package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: tr5  reason: default package */
public final class tr5 extends AtomicLong implements gs5, xae {
    public final vae a;
    public xae b;
    public boolean c;

    public tr5(vae vae) {
        this.a = vae;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.a.b();
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void e(Object obj) {
        if (!this.c) {
            if (get() != 0) {
                this.a.e(obj);
                ngg.D(this, 1);
                return;
            }
            this.b.cancel();
            onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.b, xae)) {
            this.b = xae;
            this.a.f(this);
            xae.j(Long.MAX_VALUE);
        }
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this, j);
        }
    }

    public final void onError(Throwable th) {
        if (this.c) {
            j47.Z(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }
}
