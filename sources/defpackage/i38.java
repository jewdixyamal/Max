package defpackage;

/* renamed from: i38  reason: default package */
public final class i38 extends cg4 implements b38, erd {
    public final /* synthetic */ int c;
    public zl4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i38(f2a f2a, int i) {
        super(f2a);
        this.c = i;
    }

    public void b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        switch (this.c) {
            case 0:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.a.c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.a.c(this);
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.c) {
            case 0:
                super.g();
                this.o.g();
                return;
            default:
                super.g();
                this.o.g();
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                if ((get() & 54) != 0) {
                    j47.Z(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
            default:
                if ((get() & 54) != 0) {
                    j47.Z(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
        }
    }
}
