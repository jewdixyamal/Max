package defpackage;

/* renamed from: eee  reason: default package */
public final /* synthetic */ class eee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iee b;

    public /* synthetic */ eee(iee iee, int i) {
        this.a = i;
        this.b = iee;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                iee iee = this.b;
                iee.getClass();
                ju0.D().execute(new eee(iee, 1));
                return;
            default:
                iee iee2 = this.b;
                if (!iee2.n) {
                    iee2.e();
                    return;
                }
                return;
        }
    }
}
