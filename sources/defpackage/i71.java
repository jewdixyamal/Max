package defpackage;

/* renamed from: i71  reason: default package */
public final /* synthetic */ class i71 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m71 b;

    public /* synthetic */ i71(m71 m71, int i) {
        this.a = i;
        this.b = m71;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                k56 k56 = this.b.M0;
                if (k56 != null) {
                    return (ugf) k56.invoke();
                }
                return null;
            default:
                return Integer.valueOf(this.b.L0.a);
        }
    }
}
