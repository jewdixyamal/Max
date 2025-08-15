package defpackage;

/* renamed from: d2f  reason: default package */
public final class d2f extends z1f {
    public final /* synthetic */ int a = 1;
    public e2f b;

    public /* synthetic */ d2f() {
    }

    public void a(w1f w1f) {
        switch (this.a) {
            case 1:
                e2f e2f = this.b;
                if (!e2f.U0) {
                    e2f.O();
                    e2f.U0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(w1f w1f) {
        switch (this.a) {
            case 1:
                e2f e2f = this.b;
                int i = e2f.T0 - 1;
                e2f.T0 = i;
                if (i == 0) {
                    e2f.U0 = false;
                    e2f.n();
                }
                w1f.D(this);
                return;
            default:
                return;
        }
    }

    public void g(w1f w1f) {
        switch (this.a) {
            case 0:
                e2f e2f = this.b;
                e2f.R0.remove(w1f);
                if (!e2f.w()) {
                    e2f.A(e2f, hme.o, false);
                    e2f.E0 = true;
                    e2f.A(e2f, hme.c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public d2f(e2f e2f) {
        this.b = e2f;
    }
}
