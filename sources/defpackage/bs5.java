package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bs5  reason: default package */
public final class bs5 extends dg4 implements gs5 {
    public xae X;
    public boolean Y;
    public final Object c;
    public final boolean o;

    public bs5(vae vae, Object obj, boolean z) {
        super(vae);
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.Y) {
            this.Y = true;
            Object obj = this.b;
            this.b = null;
            if (obj == null) {
                obj = this.c;
            }
            if (obj == null) {
                boolean z = this.o;
                vae vae = this.a;
                if (z) {
                    vae.onError(new NoSuchElementException());
                } else {
                    vae.b();
                }
            } else {
                g(obj);
            }
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.X.cancel();
    }

    public final void e(Object obj) {
        if (!this.Y) {
            if (this.b != null) {
                this.Y = true;
                this.X.cancel();
                this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.b = obj;
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.X, xae)) {
            this.X = xae;
            this.a.f(this);
            xae.j(Long.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        if (this.Y) {
            j47.Z(th);
            return;
        }
        this.Y = true;
        this.a.onError(th);
    }
}
