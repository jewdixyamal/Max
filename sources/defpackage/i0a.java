package defpackage;

/* renamed from: i0a  reason: default package */
public final class i0a implements ab3, vqb, tqb {
    public final f2a a;
    public zl4 b;

    public i0a(f2a f2a) {
        this.a = f2a;
    }

    public final void b() {
        this.b = dm4.a;
        this.a.b();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.b, zl4)) {
            this.b = zl4;
            this.a.c(this);
        }
    }

    public final void cancel() {
    }

    public final void clear() {
    }

    public final void g() {
        this.b.g();
        this.b = dm4.a;
    }

    public final boolean h() {
        return this.b.h();
    }

    public final boolean isEmpty() {
        return true;
    }

    public final void j(long j) {
    }

    public final int n(int i) {
        return 2;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onError(Throwable th) {
        this.b = dm4.a;
        this.a.onError(th);
    }

    public final Object poll() {
        return null;
    }
}
