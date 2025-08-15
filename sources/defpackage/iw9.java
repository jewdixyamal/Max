package defpackage;

/* renamed from: iw9  reason: default package */
public final class iw9 extends li0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry1 b;

    public /* synthetic */ iw9(sy1 sy1, int i) {
        this.a = i;
        this.b = sy1;
    }

    public final void d() {
        switch (this.a) {
            case 0:
                ry1 ry1 = this.b;
                if (ry1.isActive()) {
                    ry1.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                ry1 ry12 = this.b;
                if (ry12.isActive()) {
                    ry12.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
        }
    }

    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1 = this.b;
                if (ry1.isActive()) {
                    ry1.resumeWith(new njc(new Throwable("Fetch failed", g0Var.c())));
                    return;
                }
                return;
            default:
                this.b.resumeWith((Object) null);
                return;
        }
    }

    public final void f(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1 = this.b;
                if (ry1.isActive()) {
                    ry1.resumeWith(e5f.a);
                    return;
                }
                return;
            default:
                boolean h = g0Var.h();
                ry1 ry12 = this.b;
                if (!h) {
                    ry12.resumeWith((Object) null);
                    return;
                }
                o43 o = o43.o((o43) g0Var.e());
                if (o == null) {
                    ry12.resumeWith((Object) null);
                    return;
                } else {
                    ry12.resumeWith(o.e0());
                    return;
                }
        }
    }
}
