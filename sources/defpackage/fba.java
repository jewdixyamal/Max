package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: fba  reason: default package */
public final /* synthetic */ class fba implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ x45 c;

    public /* synthetic */ fba(iba iba, x45 x45, int i) {
        this.a = i;
        this.b = iba;
        this.c = x45;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                iba iba = this.b;
                eba b2 = iba.b();
                b2.getClass();
                x45 x45 = this.c;
                return iba.j(ScheduledExecutorService.class.cast(new ScheduledThreadPoolExecutor(x45.b, b2.a.s("OneMeScheduler", Integer.valueOf(x45.g)))), "OneMeScheduler");
            case 1:
                iba iba2 = this.b;
                return iba2.h(iba2.c(), this.c.a);
            case 2:
                iba iba3 = this.b;
                return iba3.h(iba3.a(), this.c.a);
            default:
                iba iba4 = this.b;
                return iba4.h(iba4.d(), this.c.a);
        }
    }
}
