package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: iq1  reason: default package */
public final class iq1 extends AtomicReference implements ab3, zl4, erd, b38, f2a {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ iq1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 2:
                lazySet(dm4.a);
                try {
                    ((qj3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            case 3:
                ((b38) this.c).a(obj);
                return;
            case 4:
                ((b38) this.b).a(obj);
                return;
            case 6:
                ((erd) this.b).a(obj);
                return;
            default:
                try {
                    Object apply = ((b66) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                    pa3 pa3 = (pa3) apply;
                    if (!h()) {
                        pa3.i(this);
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
        switch (this.a) {
            case 0:
                try {
                    ((f6) this.c).run();
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
                lazySet(dm4.a);
                return;
            case 1:
                ((pa3) this.c).i(new imc(this, (ab3) this.b, false, 12));
                return;
            case 3:
                ((b38) this.c).b();
                return;
            case 4:
                zl4 zl4 = (zl4) get();
                if (zl4 != dm4.a && compareAndSet(zl4, (Object) null)) {
                    ((f38) this.c).a(new g38((b38) this.b, (AtomicReference) this));
                    return;
                }
                return;
            case 5:
                ((f2a) this.b).b();
                return;
            default:
                ((ab3) this.b).b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.e(this, zl4);
                return;
            case 1:
                if (dm4.e(this, zl4)) {
                    ((ab3) this.b).c(this);
                    return;
                }
                return;
            case 2:
                dm4.e(this, zl4);
                return;
            case 3:
                dm4.e(this, zl4);
                return;
            case 4:
                if (dm4.e(this, zl4)) {
                    ((b38) this.b).c(this);
                    return;
                }
                return;
            case 5:
                dm4.e((AtomicReference) this.c, zl4);
                return;
            case 6:
                if (dm4.f((zl4) this.c, zl4)) {
                    this.c = zl4;
                    ((erd) this.b).c(this);
                    return;
                }
                return;
            default:
                dm4.c(this, zl4);
                return;
        }
    }

    public void e(Object obj) {
        ((f2a) this.b).e(obj);
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            case 1:
                dm4.a(this);
                return;
            case 2:
                dm4.a(this);
                return;
            case 3:
                dm4.a(this);
                uy1 uy1 = (uy1) this.b;
                uy1.getClass();
                dm4.a(uy1);
                return;
            case 4:
                dm4.a(this);
                return;
            case 5:
                dm4.a((AtomicReference) this.c);
                dm4.a(this);
                return;
            case 6:
                f6 f6Var = (f6) getAndSet((Object) null);
                if (f6Var != null) {
                    try {
                        f6Var.run();
                    } catch (Throwable th) {
                        c37.B(th);
                        j47.Z(th);
                    }
                    ((zl4) this.c).g();
                    return;
                }
                return;
            default:
                dm4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return get() == dm4.a;
            case 1:
                return dm4.b((zl4) get());
            case 2:
                return get() == dm4.a;
            case 3:
                return dm4.b((zl4) get());
            case 4:
                return dm4.b((zl4) get());
            case 5:
                return dm4.b((zl4) get());
            case 6:
                return ((zl4) this.c).h();
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    ((qj3) this.b).accept(th);
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(th2);
                }
                lazySet(dm4.a);
                return;
            case 1:
                ((ab3) this.b).onError(th);
                return;
            case 2:
                lazySet(dm4.a);
                try {
                    ((qj3) this.c).accept(th);
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    j47.Z(new CompositeException(th, th3));
                    return;
                }
            case 3:
                ((b38) this.c).onError(th);
                return;
            case 4:
                ((b38) this.b).onError(th);
                return;
            case 5:
                ((f2a) this.b).onError(th);
                return;
            case 6:
                ((erd) this.b).onError(th);
                return;
            default:
                ((ab3) this.b).onError(th);
                return;
        }
    }

    public iq1(f2a f2a) {
        this.a = 5;
        this.b = f2a;
        this.c = new AtomicReference();
    }

    public iq1(erd erd, f6 f6Var) {
        this.a = 6;
        this.b = erd;
        lazySet(f6Var);
    }

    public iq1(b38 b38) {
        this.a = 3;
        this.c = b38;
        this.b = new uy1(2);
    }
}
