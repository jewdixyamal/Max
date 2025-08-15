package defpackage;

/* renamed from: w05  reason: default package */
public final /* synthetic */ class w05 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z05 b;

    public /* synthetic */ w05(z05 z05, int i) {
        this.a = i;
        this.b = z05;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                z05 z05 = this.b;
                z05.o.h.execute(new x05(z05, lq1, 0));
                return "fetchData";
            default:
                z05 z052 = this.b;
                z052.o.h.execute(new x05(z052, lq1, 1));
                return "acquireBuffer";
        }
    }
}
