package defpackage;

/* renamed from: drd  reason: default package */
public final class drd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final ztc c;

    public /* synthetic */ drd(iqd iqd, ztc ztc, int i) {
        this.a = i;
        this.b = iqd;
        this.c = ztc;
    }

    public final void l(erd erd) {
        switch (this.a) {
            case 0:
                this.b.k(new z28(erd, this.c, 1));
                return;
            default:
                ya3 ya3 = new ya3(erd, this.b);
                erd.c(ya3);
                zl4 b2 = this.c.b(ya3);
                uy1 uy1 = (uy1) ya3.c;
                uy1.getClass();
                dm4.c(uy1, b2);
                return;
        }
    }
}
