package defpackage;

/* renamed from: li0  reason: default package */
public abstract class li0 implements b34 {
    public final void a(g0 g0Var) {
        boolean h = g0Var.h();
        try {
            f(g0Var);
        } finally {
            if (h) {
                g0Var.a();
            }
        }
    }

    public void b(g0 g0Var) {
    }

    public final void c(g0 g0Var) {
        try {
            e(g0Var);
        } finally {
            g0Var.a();
        }
    }

    public void d() {
    }

    public abstract void e(g0 g0Var);

    public abstract void f(g0 g0Var);
}
