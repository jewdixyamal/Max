package defpackage;

import java.util.concurrent.Executor;

/* renamed from: z9g  reason: default package */
public final /* synthetic */ class z9g implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ gag c;

    public /* synthetic */ z9g(od odVar, sa0 sa0, int i) {
        this.a = i;
        this.b = odVar;
        this.c = sa0;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                odVar.getClass();
                ((Executor) odVar.c).execute(new aag(odVar, lq1, this.c, 0));
                return "setZoomRatio";
            default:
                od odVar2 = this.b;
                odVar2.getClass();
                ((Executor) odVar2.c).execute(new aag(odVar2, lq1, this.c, 1));
                return "setLinearZoom";
        }
    }
}
