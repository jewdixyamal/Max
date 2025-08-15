package defpackage;

/* renamed from: g26  reason: default package */
public final /* synthetic */ class g26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h26 b;

    public /* synthetic */ g26(h26 h26, int i) {
        this.a = i;
        this.b = h26;
    }

    public final void run() {
        int i = this.a;
        h26 h26 = this.b;
        switch (i) {
            case 0:
                h26.t0 = false;
                if (h26.Y != null) {
                    h26.Y.stopCapture();
                }
                h26.u0 = false;
                return;
            default:
                h26.t0 = false;
                if (h26.Y != null) {
                    h26.Y.stopCapture();
                }
                h26.Y = null;
                h26.u0 = false;
                if (h26.X != null) {
                    h26.X.dispose();
                }
                h26.X = null;
                return;
        }
    }
}
