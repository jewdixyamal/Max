package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b0a  reason: default package */
public final class b0a extends AtomicInteger implements zl4, f2a {
    public final hc3 X = new Object();
    public zl4 Y;
    public volatile boolean Z;
    public final ab3 a;
    public final az b = new AtomicReference();
    public final b66 c;
    public final boolean o;

    /* JADX WARNING: type inference failed for: r1v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [hc3, java.lang.Object] */
    public b0a(ab3 ab3, b66 b66, boolean z) {
        this.a = ab3;
        this.c = b66;
        this.o = z;
        lazySet(1);
    }

    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.c(this.a);
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            pa3 pa3 = (pa3) apply;
            getAndIncrement();
            ra3 ra3 = new ra3(this);
            if (!this.Z && this.X.a(ra3)) {
                pa3.i(ra3);
            }
        } catch (Throwable th) {
            c37.B(th);
            this.Y.g();
            onError(th);
        }
    }

    public final void g() {
        this.Z = true;
        this.Y.g();
        this.X.g();
        this.b.b();
    }

    public final boolean h() {
        return this.Y.h();
    }

    public final void onError(Throwable th) {
        if (!this.b.a(th)) {
            return;
        }
        if (!this.o) {
            this.Z = true;
            this.Y.g();
            this.X.g();
            this.b.c(this.a);
        } else if (decrementAndGet() == 0) {
            this.b.c(this.a);
        }
    }
}
