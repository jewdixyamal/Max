package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kt1  reason: default package */
public final /* synthetic */ class kt1 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ kt1(nx0 nx0, int i) {
        this.a = i;
        this.b = nx0;
    }

    public final String q(lq1 lq1) {
        int i = this.a;
        nx0 nx0 = this.b;
        nx0.getClass();
        switch (i) {
            case 0:
                ((Executor) nx0.o).execute(new jt1(nx0, lq1, 1));
                return "addCaptureRequestOptions";
            default:
                ((Executor) nx0.o).execute(new jt1(nx0, lq1, 0));
                return "clearCaptureRequestOptions";
        }
    }
}
