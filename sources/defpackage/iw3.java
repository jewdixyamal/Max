package defpackage;

/* renamed from: iw3  reason: default package */
public final /* synthetic */ class iw3 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ iw3(rj3 rj3, int i) {
        this.a = i;
        this.b = rj3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        rj3 rj3 = this.b;
        switch (i) {
            case 0:
                rj3.accept((String) obj);
                return;
            default:
                rj3.accept((Throwable) obj);
                return;
        }
    }
}
