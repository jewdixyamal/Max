package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tqd  reason: default package */
public final class tqd extends AtomicReference implements erd, zl4 {
    public final /* synthetic */ int a;
    public final erd b;
    public final b66 c;

    public /* synthetic */ tqd(int i, b66 b66, erd erd) {
        this.a = i;
        this.b = erd;
        this.c = b66;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                erd erd = this.b;
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The single returned by the mapper is null");
                    iqd iqd = (iqd) apply;
                    if (!h()) {
                        iqd.k(new aab(this, erd));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    erd.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                return;
        }
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
                erd erd = this.b;
                try {
                    Object apply = this.c.apply(th);
                    Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                    ((iqd) apply).k(new wva(this, 4, erd));
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    erd.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
