package defpackage;

/* renamed from: i75  reason: default package */
public final /* synthetic */ class i75 implements mm7, km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u75 b;

    public /* synthetic */ i75(u75 u75, int i) {
        this.a = i;
        this.b = u75;
    }

    public void d(Object obj, tm5 tm5) {
        u75 u75 = this.b;
        u75.getClass();
        ((n3b) obj).Y(u75.Z, new l3b(tm5));
    }

    public void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 1:
                n3b.c0(this.b.Z0);
                return;
            default:
                n3b.q0(this.b.X0);
                return;
        }
    }
}
