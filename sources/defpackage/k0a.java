package defpackage;

/* renamed from: k0a  reason: default package */
public final class k0a implements gs5, zl4 {
    public final f2a a;
    public xae b;

    public k0a(f2a f2a) {
        this.a = f2a;
    }

    public final void b() {
        this.a.b();
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final void f(xae xae) {
        if (zae.e(this.b, xae)) {
            this.b = xae;
            this.a.c(this);
            xae.j(Long.MAX_VALUE);
        }
    }

    public final void g() {
        this.b.cancel();
        this.b = zae.a;
    }

    public final boolean h() {
        return this.b == zae.a;
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
