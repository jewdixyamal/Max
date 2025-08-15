package defpackage;

/* renamed from: o98  reason: default package */
public final /* synthetic */ class o98 implements km7, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o98(w98 w98, boolean z, int i) {
        this.a = i;
        this.b = w98;
        this.c = z;
    }

    public void c(qr6 qr6, int i) {
        switch (this.a) {
            case 1:
                qr6.E0(this.b.c, i, this.c);
                return;
            case 2:
                qr6.w0(this.b.c, i, this.c);
                return;
            default:
                qr6.c0(this.b.c, i, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 0:
                n3b.i(this.b.n.r, this.c);
                return;
            default:
                n3b.i(this.b.n.r, this.c);
                return;
        }
    }
}
