package defpackage;

/* renamed from: f75  reason: default package */
public final /* synthetic */ class f75 implements km7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd8 b;

    public /* synthetic */ f75(gd8 gd8, int i) {
        this.a = i;
        this.b = gd8;
    }

    public void accept(Object obj) {
        ((x4b) obj).n0(this.b);
    }

    public void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 0:
                n3b.b0(this.b);
                return;
            default:
                n3b.c0(this.b);
                return;
        }
    }
}
