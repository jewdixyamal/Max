package defpackage;

/* renamed from: z0  reason: default package */
public final class z0 implements Runnable {
    public final k1 a;
    public final bm7 b;

    public z0(k1 k1Var, bm7 bm7) {
        this.a = k1Var;
        this.b = bm7;
    }

    public final void run() {
        if (this.a.a == this) {
            if (k1.Y.j(this.a, this, k1.h(this.b))) {
                k1.e(this.a, false);
            }
        }
    }
}
