package defpackage;

/* renamed from: f0  reason: default package */
public final class f0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b34 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g0 o;

    public f0(g0 g0Var, boolean z, b34 b34, boolean z2) {
        this.o = g0Var;
        this.a = z;
        this.b = b34;
        this.c = z2;
    }

    public final void run() {
        boolean z = this.a;
        g0 g0Var = this.o;
        b34 b34 = this.b;
        if (z) {
            b34.c(g0Var);
        } else if (this.c) {
            b34.d();
        } else {
            b34.a(g0Var);
        }
    }
}
