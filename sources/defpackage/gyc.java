package defpackage;

/* renamed from: gyc  reason: default package */
public final /* synthetic */ class gyc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hyc b;

    public /* synthetic */ gyc(hyc hyc, int i) {
        this.a = i;
        this.b = hyc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(this.b.t());
            default:
                return Integer.valueOf(this.b.e("request_id", 10));
        }
    }
}
