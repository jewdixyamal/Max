package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: us5  reason: default package */
public final /* synthetic */ class us5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ us5(int i, long j, xs5 xs5) {
        this.a = i;
        this.b = xs5;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xs5 xs5 = this.b;
                xs5.getClass();
                xs5.b.execute(new us5(3, this.c, xs5));
                return;
            case 1:
                xs5 xs52 = this.b;
                xs52.getClass();
                xs52.b.execute(new us5(2, this.c, xs52));
                return;
            case 2:
                xs5 xs53 = this.b;
                if (this.c == xs53.k) {
                    xs53.b();
                    return;
                }
                return;
            default:
                xs5 xs54 = this.b;
                if (this.c == xs54.k) {
                    xs54.m = false;
                    ScheduledFuture scheduledFuture = xs54.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        xs54.j = null;
                    }
                    lq1 lq1 = xs54.t;
                    if (lq1 != null) {
                        lq1.b(new ys5(false));
                        xs54.t = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
