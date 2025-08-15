package defpackage;

/* renamed from: v9a  reason: default package */
public final /* synthetic */ class v9a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9a b;

    public /* synthetic */ v9a(w9a w9a, int i) {
        this.a = i;
        this.b = w9a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new z45(this.b.d().a());
            case 1:
                return new z45(this.b.d().c());
            case 2:
                iba d = this.b.d();
                d.getClass();
                bc7 bc7 = iba.p[4];
                return new z45(d.e(d.j));
            case 3:
                return new z45(this.b.d().d());
            default:
                iba d2 = this.b.d();
                d2.getClass();
                bc7 bc72 = iba.p[3];
                return new z45(d2.e(d2.i));
        }
    }
}
