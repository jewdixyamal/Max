package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g28  reason: default package */
public final class g28 extends AtomicReference implements b38, zl4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public Object o;

    public g28(qj3 qj3, qj3 qj32, f6 f6Var) {
        this.b = qj3;
        this.c = qj32;
        this.o = f6Var;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lazySet(dm4.a);
                try {
                    ((qj3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            default:
                try {
                    Object apply = ((b66) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    f38 f38 = (f38) apply;
                    if (!h()) {
                        f38.a(new gd1(14, this));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    ((b38) this.b).onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                lazySet(dm4.a);
                try {
                    ((f6) this.o).run();
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            default:
                ((b38) this.b).b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.e(this, zl4);
                return;
            default:
                if (dm4.f((zl4) this.o, zl4)) {
                    this.o = zl4;
                    ((b38) this.b).c(this);
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
                ((zl4) this.o).g();
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
                lazySet(dm4.a);
                try {
                    ((qj3) this.c).accept(th);
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(new CompositeException(th, th2));
                    return;
                }
            default:
                ((b38) this.b).onError(th);
                return;
        }
    }

    public g28(b38 b38, b66 b66) {
        this.b = b38;
        this.c = b66;
    }
}
