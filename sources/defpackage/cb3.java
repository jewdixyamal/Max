package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: cb3  reason: default package */
public final class cb3 implements ab3, zl4, b38, f2a, erd {
    public final /* synthetic */ int a;
    public zl4 b;
    public final Object c;
    public Object o;

    public /* synthetic */ cb3(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                b38 b38 = (b38) this.c;
                try {
                    Object apply = ((b66) this.o).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null item");
                    b38.a(apply);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    b38.onError(th);
                    return;
                }
            case 2:
                zl4 zl4 = this.b;
                dm4 dm4 = dm4.a;
                if (zl4 != dm4) {
                    try {
                        ((e38) this.o).b.accept(obj);
                        this.b = dm4;
                        ((b38) this.c).a(obj);
                        d();
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        f(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = dm4.a;
                ((erd) this.c).a(obj);
                return;
            case 6:
                ((erd) this.c).a(obj);
                try {
                    ((qj3) this.o).accept(obj);
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    j47.Z(th3);
                    return;
                }
            default:
                ((erd) this.c).a(obj);
                try {
                    ((f6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    c37.B(th4);
                    j47.Z(th4);
                    return;
                }
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                ab3 ab3 = (ab3) this.c;
                db3 db3 = (db3) this.o;
                if (this.b != dm4.a) {
                    try {
                        db3.o.run();
                        db3.X.run();
                        ab3.b();
                        try {
                            db3.Y.run();
                            return;
                        } catch (Throwable th) {
                            c37.B(th);
                            j47.Z(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        ab3.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((b38) this.c).b();
                return;
            case 2:
                zl4 zl4 = this.b;
                dm4 dm4 = dm4.a;
                if (zl4 != dm4) {
                    try {
                        ((e38) this.o).o.run();
                        this.b = dm4;
                        ((b38) this.c).b();
                        d();
                        return;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        f(th3);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = dm4.a;
                erd erd = (erd) this.c;
                Object obj = this.o;
                if (obj != null) {
                    erd.a(obj);
                    return;
                } else {
                    erd.onError(new NoSuchElementException("The MaybeSource is empty"));
                    return;
                }
            case 4:
                this.o = null;
                f2a f2a = (f2a) this.c;
                f2a.e((Collection) this.o);
                f2a.b();
                return;
            default:
                this.o = null;
                ((erd) this.c).a((Collection) this.o);
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                ab3 ab3 = (ab3) this.c;
                try {
                    ((db3) this.o).b.accept(zl4);
                    if (dm4.f(this.b, zl4)) {
                        this.b = zl4;
                        ab3.c(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    zl4.g();
                    this.b = dm4.a;
                    ab3.c(iz4.a);
                    ab3.onError(th);
                    return;
                }
            case 1:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((b38) this.c).c(this);
                    return;
                }
                return;
            case 2:
                b38 b38 = (b38) this.c;
                if (dm4.f(this.b, zl4)) {
                    try {
                        ((e38) this.o).getClass();
                        this.b = zl4;
                        b38.c(this);
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        zl4.g();
                        this.b = dm4.a;
                        b38.c(iz4.a);
                        b38.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((erd) this.c).c(this);
                    return;
                }
                return;
            case 4:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((f2a) this.c).c(this);
                    return;
                }
                return;
            case 5:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((erd) this.c).c(this);
                    return;
                }
                return;
            case 6:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((erd) this.c).c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.b, zl4)) {
                    this.b = zl4;
                    ((erd) this.c).c(this);
                    return;
                }
                return;
        }
    }

    public void d() {
        try {
            ((e38) this.o).getClass();
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
        }
    }

    public void e(Object obj) {
        switch (this.a) {
            case 4:
                ((Collection) this.o).add(obj);
                return;
            default:
                ((Collection) this.o).add(obj);
                return;
        }
    }

    public void f(Throwable th) {
        try {
            ((e38) this.o).c.accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        this.b = dm4.a;
        ((b38) this.c).onError(th);
        d();
    }

    public final void g() {
        switch (this.a) {
            case 0:
                try {
                    ((db3) this.o).Z.run();
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
                this.b.g();
                return;
            case 1:
                zl4 zl4 = this.b;
                this.b = dm4.a;
                zl4.g();
                return;
            case 2:
                try {
                    ((e38) this.o).getClass();
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(th2);
                }
                this.b.g();
                this.b = dm4.a;
                return;
            case 3:
                this.b.g();
                this.b = dm4.a;
                return;
            case 4:
                this.b.g();
                return;
            case 5:
                this.b.g();
                return;
            case 6:
                this.b.g();
                return;
            default:
                this.b.g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.b.h();
            case 1:
                return this.b.h();
            case 2:
                return this.b.h();
            case 3:
                return this.b.h();
            case 4:
                return this.b.h();
            case 5:
                return this.b.h();
            case 6:
                return this.b.h();
            default:
                return this.b.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                db3 db3 = (db3) this.o;
                if (this.b == dm4.a) {
                    j47.Z(th);
                    return;
                }
                try {
                    db3.c.accept(th);
                    db3.X.run();
                } catch (Throwable th2) {
                    c37.B(th2);
                    th = new CompositeException(th, th2);
                }
                ((ab3) this.c).onError(th);
                try {
                    db3.Y.run();
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    j47.Z(th3);
                    return;
                }
            case 1:
                ((b38) this.c).onError(th);
                return;
            case 2:
                if (this.b == dm4.a) {
                    j47.Z(th);
                    return;
                } else {
                    f(th);
                    return;
                }
            case 3:
                this.b = dm4.a;
                ((erd) this.c).onError(th);
                return;
            case 4:
                this.o = null;
                ((f2a) this.c).onError(th);
                return;
            case 5:
                this.o = null;
                ((erd) this.c).onError(th);
                return;
            case 6:
                ((erd) this.c).onError(th);
                return;
            default:
                ((erd) this.c).onError(th);
                try {
                    ((f6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    c37.B(th4);
                    j47.Z(th4);
                    return;
                }
        }
    }

    public cb3(db3 db3, ab3 ab3) {
        this.a = 0;
        this.o = db3;
        this.c = ab3;
    }
}
