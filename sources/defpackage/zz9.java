package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zz9  reason: default package */
public final class zz9 extends vk0 implements f2a {
    public final hc3 X = new Object();
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final az b = new AtomicReference();
    public final b66 c;
    public final boolean o;

    /* JADX WARNING: type inference failed for: r1v1, types: [az, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [hc3, java.lang.Object] */
    public zz9(f2a f2a, b66 b66, boolean z) {
        this.a = f2a;
        this.c = b66;
        this.o = z;
        lazySet(1);
    }

    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            this.a.c(this);
        }
    }

    public final void clear() {
    }

    public final void e(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            pa3 pa3 = (pa3) apply;
            getAndIncrement();
            nqd nqd = new nqd(this);
            if (!this.Z && this.X.a(nqd)) {
                pa3.i(nqd);
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

    public final boolean isEmpty() {
        return true;
    }

    public final int n(int i) {
        return 2;
    }

    public final void onError(Throwable th) {
        if (!this.b.a(th)) {
            return;
        }
        if (!this.o) {
            this.Z = true;
            this.Y.g();
            this.X.g();
            this.b.d(this.a);
        } else if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final Object poll() {
        return null;
    }
}
