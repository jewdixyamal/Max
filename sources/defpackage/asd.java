package defpackage;

/* renamed from: asd  reason: default package */
public final class asd extends dg4 implements erd {
    public zl4 c;

    public final void c(zl4 zl4) {
        if (dm4.f(this.c, zl4)) {
            this.c = zl4;
            this.a.f(this);
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.g();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
