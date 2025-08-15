package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* renamed from: f0a  reason: default package */
public final class f0a implements f2a, zl4 {
    public final /* synthetic */ int a;
    public final f2a b;
    public final b66 c;
    public zl4 o;

    public /* synthetic */ f0a(f2a f2a, b66 b66, int i) {
        this.a = i;
        this.b = f2a;
        this.c = b66;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                zl4 zl4 = this.o;
                dm4 dm4 = dm4.a;
                if (zl4 != dm4) {
                    this.o = dm4;
                    this.b.b();
                    return;
                }
                return;
            default:
                this.b.b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (this.o != dm4.a) {
                    try {
                        for (Object next : (Iterable) this.c.apply(obj)) {
                            try {
                                try {
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    this.b.e(next);
                                } catch (Throwable th) {
                                    c37.B(th);
                                    this.o.g();
                                    onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                c37.B(th2);
                                this.o.g();
                                onError(th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        this.o.g();
                        onError(th3);
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.e(obj);
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.o.g();
                this.o = dm4.a;
                return;
            default:
                this.o.g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o.h();
            default:
                return this.o.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                zl4 zl4 = this.o;
                dm4 dm4 = dm4.a;
                if (zl4 == dm4) {
                    j47.Z(th);
                    return;
                }
                this.o = dm4;
                this.b.onError(th);
                return;
            default:
                f2a f2a = this.b;
                try {
                    Object apply = this.c.apply(th);
                    if (apply == null) {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        f2a.onError(nullPointerException);
                        return;
                    }
                    f2a.e(apply);
                    f2a.b();
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    f2a.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
