package defpackage;

import java.util.NoSuchElementException;

/* renamed from: zq5  reason: default package */
public final class zq5 implements gs5, zl4 {
    public boolean X;
    public Object Y;
    public final /* synthetic */ int a = 1;
    public final erd b;
    public final Object c;
    public xae o;

    public zq5(erd erd, Object obj) {
        this.b = erd;
        this.c = obj;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    this.b.a(this.c);
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    Object obj = this.Y;
                    this.Y = null;
                    if (obj == null) {
                        obj = this.c;
                    }
                    erd erd = this.b;
                    if (obj != null) {
                        erd.a(obj);
                        return;
                    } else {
                        erd.onError(new NoSuchElementException());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        ((ol0) this.Y).accept(this.c, obj);
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.o.cancel();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.X) {
                    if (this.Y != null) {
                        this.X = true;
                        this.o.cancel();
                        this.o = zae.a;
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.Y = obj;
                    return;
                }
                return;
        }
    }

    public final void f(xae xae) {
        switch (this.a) {
            case 0:
                if (zae.e(this.o, xae)) {
                    this.o = xae;
                    this.b.c(this);
                    xae.j(Long.MAX_VALUE);
                    return;
                }
                return;
            default:
                if (zae.e(this.o, xae)) {
                    this.o = xae;
                    this.b.c(this);
                    xae.j(Long.MAX_VALUE);
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.o.cancel();
                this.o = zae.a;
                return;
            default:
                this.o.cancel();
                this.o = zae.a;
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o == zae.a;
            default:
                return this.o == zae.a;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                this.o = zae.a;
                this.b.onError(th);
                return;
            default:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                this.o = zae.a;
                this.b.onError(th);
                return;
        }
    }

    public zq5(erd erd, Object obj, ol0 ol0) {
        this.b = erd;
        this.Y = ol0;
        this.c = obj;
    }
}
