package defpackage;

/* renamed from: za3  reason: default package */
public final class za3 extends pa3 {
    public final /* synthetic */ int a;
    public final pa3 b;
    public final ztc c;

    public /* synthetic */ za3(pa3 pa3, ztc ztc, int i) {
        this.a = i;
        this.b = pa3;
        this.c = ztc;
    }

    public final void j(ab3 ab3) {
        switch (this.a) {
            case 0:
                this.b.i(new ya3(ab3, this.c));
                return;
            default:
                ya3 ya3 = new ya3(ab3, this.b);
                ab3.c(ya3);
                zl4 b2 = this.c.b(ya3);
                uy1 uy1 = (uy1) ya3.c;
                uy1.getClass();
                dm4.c(uy1, b2);
                return;
        }
    }
}
