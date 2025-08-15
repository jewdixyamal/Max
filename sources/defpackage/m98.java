package defpackage;

/* renamed from: m98  reason: default package */
public final /* synthetic */ class m98 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ float c;

    public /* synthetic */ m98(w98 w98, float f, int i) {
        this.a = i;
        this.b = w98;
        this.c = f;
    }

    public final void c(qr6 qr6, int i) {
        switch (this.a) {
            case 0:
                qr6.x(this.b.c, i, this.c);
                return;
            default:
                qr6.y(this.b.c, i, this.c);
                return;
        }
    }
}
