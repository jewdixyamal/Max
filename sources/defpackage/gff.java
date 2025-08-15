package defpackage;

/* renamed from: gff  reason: default package */
public final /* synthetic */ class gff implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm4 b;

    public /* synthetic */ gff(zm4 zm4, int i) {
        this.a = i;
        this.b = zm4;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                zm4 zm4 = this.b;
                zm4.l = lq1;
                return "ReleasedFuture " + zm4;
            default:
                zm4 zm42 = this.b;
                zm42.n = lq1;
                return "ReadyToReleaseFuture " + zm42;
        }
    }
}
