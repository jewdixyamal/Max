package defpackage;

/* renamed from: mca  reason: default package */
public final /* synthetic */ class mca implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uca b;

    public /* synthetic */ mca(uca uca, int i) {
        this.a = i;
        this.b = uca;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return j1e.a((lx3) this.b.b.d.invoke());
            default:
                kk5 kk5 = (kk5) this.b.b.b.getValue();
                kk5.getClass();
                return new su7(kk5.g(kk5.b(), "upload").getAbsolutePath());
        }
    }
}
