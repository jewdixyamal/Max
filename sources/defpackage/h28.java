package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h28  reason: default package */
public final class h28 extends AtomicInteger implements b38, xae {
    public final f38[] X;
    public int Y;
    public long Z;
    public final vae a;
    public final AtomicLong b = new AtomicLong();
    public final AtomicReference c = new AtomicReference(hv9.a);
    public final uy1 o = new uy1(2);

    public h28(vae vae, f38[] f38Arr) {
        this.a = vae;
        this.X = f38Arr;
    }

    public final void a(Object obj) {
        this.c.lazySet(obj);
        d();
    }

    public final void b() {
        this.c.lazySet(hv9.a);
        d();
    }

    public final void c(zl4 zl4) {
        uy1 uy1 = this.o;
        uy1.getClass();
        dm4.c(uy1, zl4);
    }

    public final void cancel() {
        uy1 uy1 = this.o;
        uy1.getClass();
        dm4.a(uy1);
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.c;
            do {
                uy1 uy1 = this.o;
                if (uy1.h()) {
                    atomicReference.lazySet((Object) null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    hv9 hv9 = hv9.a;
                    vae vae = this.a;
                    if (obj != hv9) {
                        long j = this.Z;
                        if (j != this.b.get()) {
                            this.Z = j + 1;
                            atomicReference.lazySet((Object) null);
                            vae.e(obj);
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    if (!uy1.h()) {
                        int i = this.Y;
                        f38[] f38Arr = this.X;
                        if (i == f38Arr.length) {
                            vae.b();
                            return;
                        } else {
                            this.Y = i + 1;
                            f38Arr[i].a(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.b, j);
            d();
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
