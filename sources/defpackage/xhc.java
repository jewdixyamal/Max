package defpackage;

/* renamed from: xhc  reason: default package */
public final /* synthetic */ class xhc implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yhc b;

    public /* synthetic */ xhc(yhc yhc, int i) {
        this.a = i;
        this.b = yhc;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                this.b.e = lq1;
                return "CaptureCompleteFuture";
            default:
                this.b.f = lq1;
                return "RequestCompleteFuture";
        }
    }
}
