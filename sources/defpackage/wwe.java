package defpackage;

/* renamed from: wwe  reason: default package */
public final /* synthetic */ class wwe implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ywe b;

    public /* synthetic */ wwe(ywe ywe, int i) {
        this.a = i;
        this.b = ywe;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return e5f.a;
            default:
                ywe ywe = this.b;
                return new twe(ywe.X, ywe.Y, ywe.c);
        }
    }
}
