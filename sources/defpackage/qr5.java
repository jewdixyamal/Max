package defpackage;

/* renamed from: qr5  reason: default package */
public final class qr5 implements f2a, xae {
    public final vae a;
    public zl4 b;

    public qr5(vae vae) {
        this.a = vae;
    }

    public final void b() {
        this.a.b();
    }

    public final void c(zl4 zl4) {
        this.b = zl4;
        this.a.f(this);
    }

    public final void cancel() {
        this.b.g();
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final void j(long j) {
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
