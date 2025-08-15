package defpackage;

/* renamed from: mte  reason: default package */
public final class mte extends rg4 {
    public final eab c;
    public final int d;
    public final jic e;
    public final /* synthetic */ r9 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mte(r9 r9Var, fi0 fi0, eab eab, int i) {
        super(fi0);
        this.f = r9Var;
        this.c = eab;
        this.d = i;
        this.e = ((oj0) eab).a.i;
    }

    public final void f(Throwable th) {
        r9 r9Var = this.f;
        fi0 fi0 = this.b;
        if (!r9Var.c(this.d + 1, fi0, this.c)) {
            fi0.e(th);
        }
    }

    public final void h(int i, Object obj) {
        g05 g05 = (g05) obj;
        fi0 fi0 = this.b;
        if (g05 != null && (fi0.b(i) || tu0.q(g05, this.e))) {
            fi0.g(i, g05);
        } else if (fi0.a(i)) {
            g05.d(g05);
            if (!this.f.c(this.d + 1, fi0, this.c)) {
                fi0.g(1, (Object) null);
            }
        }
    }
}
