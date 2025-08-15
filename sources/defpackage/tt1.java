package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: tt1  reason: default package */
public final /* synthetic */ class tt1 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;

    public /* synthetic */ tt1(fu1 fu1, int i) {
        this.a = i;
        this.b = fu1;
    }

    public String q(lq1 lq1) {
        int i = this.a;
        fu1 fu1 = this.b;
        fu1.getClass();
        switch (i) {
            case 0:
                try {
                    fu1.c.execute(new wt1(fu1, 1, lq1));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    lq1.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                try {
                    ArrayList arrayList = new ArrayList(fu1.a.m().b().c);
                    arrayList.add((nw1) fu1.I0.Y);
                    arrayList.add(new xt1(fu1, lq1));
                    dx1 dx1 = fu1.b;
                    dx1.a.Z(fu1.t0.a, fu1.c, xfg.g(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    e.getMessage();
                    fu1.toString();
                    lq1.d(e);
                    return "configAndCloseTask";
                }
        }
    }
}
