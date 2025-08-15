package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p28  reason: default package */
public final class p28 extends AtomicReference implements f2a, b38, zl4, erd {
    public final /* synthetic */ int a;
    public final f2a b;
    public final b66 c;

    public /* synthetic */ p28(f2a f2a, b66 b66, int i) {
        this.a = i;
        this.b = f2a;
        this.c = b66;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    r1a r1a = (r1a) apply;
                    if (!h()) {
                        r1a.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    this.b.onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null Publisher");
                    r1a r1a2 = (r1a) apply2;
                    if (!h()) {
                        r1a2.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    this.b.onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            default:
                this.b.b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4);
                return;
            default:
                dm4.c(this, zl4);
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e(obj);
                return;
            default:
                this.b.e(obj);
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
