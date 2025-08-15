package defpackage;

/* renamed from: ea8  reason: default package */
public final /* synthetic */ class ea8 implements fa8, hi8 {
    public final /* synthetic */ k3b a;

    public /* synthetic */ ea8(k3b k3b) {
        this.a = k3b;
    }

    public void a(nh8 nh8, int i) {
        nh8.h(i, this.a);
    }

    public void c(w98 w98) {
        boolean z;
        if (w98.isConnected()) {
            k3b k3b = w98.s;
            k3b k3b2 = this.a;
            if (!oaf.a(k3b, k3b2)) {
                w98.s = k3b2;
                k3b k3b3 = w98.t;
                k3b i = w98.i(w98.r, k3b2);
                w98.t = i;
                if (!i.equals(k3b3)) {
                    ffc ffc = w98.p;
                    ffc a2 = c73.a(w98.o, w98.q, w98.t);
                    w98.p = a2;
                    z = !a2.equals(ffc);
                    w98.h.f(13, new k98(w98, 19));
                } else {
                    z = false;
                }
                if (z) {
                    w98.a.o(new k98(w98, 0));
                }
            }
        }
    }
}
