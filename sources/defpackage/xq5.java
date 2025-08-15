package defpackage;

/* renamed from: xq5  reason: default package */
public final class xq5 extends dg4 implements gs5 {
    public xae X;
    public boolean Y;
    public final ol0 c;
    public final Object o;

    public xq5(vae vae, Object obj, ol0 ol0) {
        super(vae);
        this.c = ol0;
        this.o = obj;
    }

    public final void b() {
        if (!this.Y) {
            this.Y = true;
            g(this.o);
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.X.cancel();
    }

    public final void e(Object obj) {
        if (!this.Y) {
            try {
                this.c.accept(this.o, obj);
            } catch (Throwable th) {
                c37.B(th);
                this.X.cancel();
                onError(th);
            }
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
