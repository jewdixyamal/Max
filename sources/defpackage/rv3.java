package defpackage;

/* renamed from: rv3  reason: default package */
public final /* synthetic */ class rv3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv3 b;

    public /* synthetic */ rv3(uv3 uv3, int i) {
        this.a = i;
        this.b = uv3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new sv3(this.b, 1);
            default:
                return new sv3(this.b, 0);
        }
    }
}
