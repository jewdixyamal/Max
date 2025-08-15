package defpackage;

/* renamed from: hj0  reason: default package */
public final /* synthetic */ class hj0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ el9 b;

    public /* synthetic */ hj0(el9 el9, int i) {
        this.a = i;
        this.b = el9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                el9 el9 = this.b;
                el9.s0.f("LOCATION_MAP_TYPE_NORMAL");
                el9.n(new fj0(10));
                return e5f.a;
            case 1:
                el9 el92 = this.b;
                el92.s0.f("LOCATION_MAP_TYPE_SATELLITE");
                el92.n(new fj0(9));
                return e5f.a;
            default:
                el9 el93 = this.b;
                el93.s0.f("LOCATION_MAP_TYPE_HYBRID");
                el93.n(new fj0(1));
                return e5f.a;
        }
    }
}
