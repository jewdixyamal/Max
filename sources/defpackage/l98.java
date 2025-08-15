package defpackage;

/* renamed from: l98  reason: default package */
public final /* synthetic */ class l98 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ l98(w98 w98, int i, int i2, int i3) {
        this.a = i3;
        this.b = w98;
        this.c = i;
        this.o = i2;
    }

    public final void c(qr6 qr6, int i) {
        switch (this.a) {
            case 0:
                qr6.K(this.b.c, i, this.c, this.o);
                return;
            case 1:
                qr6.s(this.b.c, i, this.c, this.o);
                return;
            default:
                qr6.C0(this.b.c, i, this.c, this.o);
                return;
        }
    }
}
