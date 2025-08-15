package defpackage;

/* renamed from: vf4  reason: default package */
public final /* synthetic */ class vf4 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf4 b;

    public /* synthetic */ vf4(xf4 xf4, int i) {
        this.a = i;
        this.b = xf4;
    }

    public final String q(lq1 lq1) {
        int i = this.a;
        xf4 xf4 = this.b;
        switch (i) {
            case 0:
                synchronized (xf4.a) {
                    xf4.d = lq1;
                }
                return "DeferrableSurface-termination(" + xf4 + ")";
            default:
                synchronized (xf4.a) {
                    xf4.f = lq1;
                }
                return "DeferrableSurface-close(" + xf4 + ")";
        }
    }
}
