package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r28  reason: default package */
public final class r28 extends AtomicReference implements b38, zl4, erd {
    public final /* synthetic */ int a;
    public final b38 b;
    public final b66 c;

    public /* synthetic */ r28(b38 b38, b66 b66, int i) {
        this.a = i;
        this.b = b38;
        this.c = b66;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                    iqd iqd = (iqd) apply;
                    if (!h()) {
                        iqd.k(new va8((Object) this, 23, (Object) this.b));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null MaybeSource");
                    f38 f38 = (f38) apply2;
                    if (!h()) {
                        f38.a(new g38((AtomicReference) this, this.b));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    onError(th2);
                    return;
                }
        }
    }

    public void b() {
        this.b.b();
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4)) {
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.e(this, zl4)) {
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            default:
                dm4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return dm4.b((zl4) get());
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}
