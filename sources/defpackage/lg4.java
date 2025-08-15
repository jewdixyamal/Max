package defpackage;

/* renamed from: lg4  reason: default package */
public final /* synthetic */ class lg4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg4 b;

    public /* synthetic */ lg4(mg4 mg4, int i) {
        this.a = i;
        this.b = mg4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b == mg4.REGULAR);
            default:
                return Boolean.valueOf(this.b == mg4.DELAYED);
        }
    }
}
