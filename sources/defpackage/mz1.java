package defpackage;

/* renamed from: mz1  reason: default package */
public final /* synthetic */ class mz1 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l84 b;

    public /* synthetic */ mz1(l84 l84, int i) {
        this.a = i;
        this.b = l84;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.I((x9b) obj);
                return;
            case 1:
                x9b x9b = (x9b) obj;
                l84 l84 = this.b;
                l84.I(x9b);
                y7g y7g = (y7g) l84.e;
                c54.p("Pending request should be null", ((x9b) y7g.c) == null);
                y7g.c = x9b;
                return;
            default:
                this.b.L((ec0) obj);
                return;
        }
    }
}
