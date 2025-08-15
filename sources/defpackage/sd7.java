package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sd7  reason: default package */
public final class sd7 extends AtomicReference implements f2a, zl4 {
    public final qj3 a;
    public final qj3 b;
    public final f6 c;
    public final qj3 o;

    public sd7(qj3 qj3, qj3 qj32, f6 f6Var) {
        kj6 kj6 = ft.e;
        this.a = qj3;
        this.b = qj32;
        this.c = f6Var;
        this.o = kj6;
    }

    public final void b() {
        if (!h()) {
            lazySet(dm4.a);
            try {
                this.c.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.e(this, zl4)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                c37.B(th);
                zl4.g();
                onError(th);
            }
        }
    }

    public final void e(Object obj) {
        if (!h()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                c37.B(th);
                ((zl4) get()).g();
                onError(th);
            }
        }
    }

    public final void g() {
        dm4.a(this);
    }

    public final boolean h() {
        return get() == dm4.a;
    }

    public final void onError(Throwable th) {
        if (!h()) {
            lazySet(dm4.a);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                c37.B(th2);
                j47.Z(new CompositeException(th, th2));
            }
        } else {
            j47.Z(th);
        }
    }
}
