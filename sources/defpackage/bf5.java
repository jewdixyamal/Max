package defpackage;

/* renamed from: bf5  reason: default package */
public final class bf5 implements b34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f(g0 g0Var) {
    }

    public final void a(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1 = (ry1) this.b;
                if (!ry1.isCancelled() && g0Var.h()) {
                    ry1.resumeWith(g0Var.e());
                    return;
                }
                return;
            default:
                boolean f = g0Var.f();
                vjc vjc = (vjc) this.b;
                if (f) {
                    if (g0Var == vjc.h) {
                        vjc.l((Object) null, false, g0Var.a);
                        return;
                    }
                    return;
                } else if (g0Var.h()) {
                    vjc.getClass();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void b(g0 g0Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                vjc vjc = (vjc) this.b;
                if (g0Var == vjc.h) {
                    vjc.k(g0Var.d());
                    return;
                }
                return;
        }
    }

    public final void c(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1 = (ry1) this.b;
                if (ry1.isActive()) {
                    Throwable c = g0Var.c();
                    if (c == null) {
                        c = new IllegalStateException("fail");
                    }
                    ry1.resumeWith(new njc(c));
                    return;
                }
                return;
            default:
                ((vjc) this.b).getClass();
                return;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                ry1 ry1 = (ry1) this.b;
                if (ry1.isActive()) {
                    ry1.cancel((Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
