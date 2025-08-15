package defpackage;

/* renamed from: dc8  reason: default package */
public final /* synthetic */ class dc8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc8 b;

    public /* synthetic */ dc8(hc8 hc8, int i) {
        this.a = i;
        this.b = hc8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                uc7 uc7 = (uc7) this.b.d.invoke();
                if (uc7 != null) {
                    uc7.m();
                }
                return e5f.a;
            default:
                hc8 hc8 = this.b;
                hc8.a();
                hc8.l = false;
                return e5f.a;
        }
    }
}
