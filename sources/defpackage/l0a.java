package defpackage;

/* renamed from: l0a  reason: default package */
public final class l0a implements f2a, zl4 {
    public final /* synthetic */ int a;
    public zl4 b;
    public final Object c;

    public /* synthetic */ l0a(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(Object obj) {
    }

    private final void d(Object obj) {
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((f2a) this.c).b();
                return;
            default:
                ((ab3) this.c).b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                this.b = zl4;
                ((f2a) this.c).c(this);
                return;
            default:
                this.b = zl4;
                ((ab3) this.c).c(this);
                return;
        }
    }

    public final void e(Object obj) {
        int i = this.a;
    }

    public final void g() {
        switch (this.a) {
            case 0:
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
            default:
                return this.b.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                ((f2a) this.c).onError(th);
                return;
            default:
                ((ab3) this.c).onError(th);
                return;
        }
    }
}
