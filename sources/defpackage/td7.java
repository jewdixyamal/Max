package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: td7  reason: default package */
public final class td7 extends AtomicReference implements gs5, xae, zl4 {
    public final qj3 a;
    public final qj3 b;
    public final f6 c;
    public final qj3 o;

    public td7(tx7 tx7, sx7 sx7) {
        r66 r66 = ft.d;
        rr5 rr5 = rr5.a;
        this.a = tx7;
        this.b = sx7;
        this.c = r66;
        this.o = rr5;
    }

    public final void b() {
        Object obj = get();
        zae zae = zae.a;
        if (obj != zae) {
            lazySet(zae);
            try {
                this.c.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
        }
    }

    public final void cancel() {
        zae.a(this);
    }

    public final void e(Object obj) {
        if (!h()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                c37.B(th);
                ((xae) get()).cancel();
                onError(th);
            }
        }
    }

    public final void f(xae xae) {
        if (zae.c(this, xae)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                c37.B(th);
                xae.cancel();
                onError(th);
            }
        }
    }

    public final void g() {
        zae.a(this);
    }

    public final boolean h() {
        return get() == zae.a;
    }

    public final void j(long j) {
        ((xae) get()).j(j);
    }

    public final void onError(Throwable th) {
        Object obj = get();
        zae zae = zae.a;
        if (obj != zae) {
            lazySet(zae);
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
