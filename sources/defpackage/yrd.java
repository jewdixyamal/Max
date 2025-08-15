package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yrd  reason: default package */
public final class yrd extends AtomicReference implements erd, Runnable, zl4 {
    public final long X;
    public final TimeUnit Y;
    public final erd a;
    public final AtomicReference b = new AtomicReference();
    public final br5 c;
    public iqd o;

    public yrd(erd erd, iqd iqd, long j, TimeUnit timeUnit) {
        this.a = erd;
        this.o = iqd;
        this.X = j;
        this.Y = timeUnit;
        if (iqd != null) {
            this.c = new br5(3, erd);
        } else {
            this.c = null;
        }
    }

    public final void a(Object obj) {
        zl4 zl4 = (zl4) get();
        dm4 dm4 = dm4.a;
        if (zl4 != dm4 && compareAndSet(zl4, dm4)) {
            dm4.a(this.b);
            this.a.a(obj);
        }
    }

    public final void c(zl4 zl4) {
        dm4.e(this, zl4);
    }

    public final void g() {
        dm4.a(this);
        dm4.a(this.b);
        br5 br5 = this.c;
        if (br5 != null) {
            dm4.a(br5);
        }
    }

    public final boolean h() {
        return dm4.b((zl4) get());
    }

    public final void onError(Throwable th) {
        zl4 zl4 = (zl4) get();
        dm4 dm4 = dm4.a;
        if (zl4 == dm4 || !compareAndSet(zl4, dm4)) {
            j47.Z(th);
            return;
        }
        dm4.a(this.b);
        this.a.onError(th);
    }

    public final void run() {
        if (dm4.a(this)) {
            iqd iqd = this.o;
            if (iqd == null) {
                this.a.onError(new TimeoutException(q45.e(this.X, this.Y)));
                return;
            }
            this.o = null;
            iqd.k(this.c);
        }
    }
}
