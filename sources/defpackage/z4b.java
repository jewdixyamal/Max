package defpackage;

/* renamed from: z4b  reason: default package */
public final class z4b extends s06 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public z4b(mue mue, tb8 tb8) {
        super(mue);
        this.g = tb8;
    }

    public hue g(int i, hue hue, boolean z) {
        switch (this.f) {
            case 0:
                mue mue = this.e;
                hue g2 = mue.g(i, hue, z);
                if (mue.n(g2.c, (kue) this.g, 0).a()) {
                    g2.j(hue.a, hue.b, hue.c, hue.d, hue.e, s8.g, true);
                } else {
                    g2.f = true;
                }
                return g2;
            default:
                return super.g(i, hue, z);
        }
    }

    public kue n(int i, kue kue, long j) {
        switch (this.f) {
            case 1:
                super.n(i, kue, j);
                tb8 tb8 = (tb8) this.g;
                kue.c = tb8;
                ib8 ib8 = tb8.b;
                kue.b = ib8 != null ? ib8.h : null;
                return kue;
            default:
                return super.n(i, kue, j);
        }
    }

    public z4b(mue mue) {
        super(mue);
        this.g = new kue();
    }
}
