package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: yu1  reason: default package */
public final /* synthetic */ class yu1 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ yu1(zu1 zu1, int i) {
        this.a = i;
        this.b = zu1;
    }

    public bm7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                zu1 zu1 = this.b;
                if (!zu1.f) {
                    return dw6.c;
                }
                xs5 xs5 = zu1.a.h;
                xs5.getClass();
                return f8.g(new q64(28, (Object) xs5));
            default:
                un0 un0 = new un0(13);
                zu1 zu12 = this.b;
                ScheduledExecutorService scheduledExecutorService = zu12.e;
                long millis = TimeUnit.NANOSECONDS.toMillis(zu1.g);
                uu1 uu1 = new uu1(un0);
                st1 st1 = zu12.a;
                st1.p(uu1);
                wt1 wt1 = new wt1(st1, 4, uu1);
                oq1 oq1 = uu1.b;
                oq1.b.d(wt1, st1.c);
                return f8.g(new vg4(oq1, scheduledExecutorService, millis));
        }
    }

    public String q(lq1 lq1) {
        this.b.a.j.a(lq1, true);
        return "TorchOn";
    }
}
