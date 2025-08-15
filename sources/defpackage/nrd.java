package defpackage;

/* renamed from: nrd  reason: default package */
public final class nrd implements grc {
    public int a;
    public boolean b;
    public final /* synthetic */ prd c;

    public nrd(prd prd) {
        this.c = prd;
    }

    public final void a() {
        if (!this.b) {
            prd prd = this.c;
            prd.X.m(ia9.g(prd.u0.n), prd.u0, 0, (Object) null, 0);
            this.b = true;
        }
    }

    public final void c() {
        prd prd = this.c;
        if (!prd.v0) {
            prd.t0.c();
        }
    }

    public final boolean d() {
        return this.c.w0;
    }

    public final int e(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        a();
        prd prd = this.c;
        boolean z = prd.w0;
        if (z && prd.x0 == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            p54.a(4);
            return -4;
        } else if ((i & 2) != 0 || i2 == 0) {
            y7g.c = prd.u0;
            this.a = 1;
            return -5;
        } else if (!z) {
            return -3;
        } else {
            prd.x0.getClass();
            p54.a(1);
            p54.Z = 0;
            if ((i & 4) == 0) {
                p54.x(prd.y0);
                p54.X.put(prd.x0, 0, prd.y0);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }
    }
}
