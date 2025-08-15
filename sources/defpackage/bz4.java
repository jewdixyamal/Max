package defpackage;

/* renamed from: bz4  reason: default package */
public final /* synthetic */ class bz4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz4 b;

    public /* synthetic */ bz4(cz4 cz4, int i) {
        this.a = i;
        this.b = cz4;
    }

    public final Object invoke() {
        sy4 sy4;
        switch (this.a) {
            case 0:
                try {
                    sy4 = new sy4(this.b.a.getResources());
                } catch (Exception unused) {
                    sy4 = null;
                }
                return new ux4(sy4);
            default:
                cz4 cz4 = this.b;
                return new dy4((ux4) cz4.b.getValue(), cz4.d, cz4.c, cz4.e);
        }
    }
}
