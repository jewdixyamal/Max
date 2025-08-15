package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ch4  reason: default package */
public final class ch4 extends m3 implements ScheduledFuture {
    public final ScheduledFuture s0;

    public ch4(bh4 bh4) {
        this.s0 = bh4.b(new bkg(12, this));
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.s0;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof g3) && ((g3) obj).a);
    }

    public final int compareTo(Object obj) {
        return this.s0.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.s0.getDelay(timeUnit);
    }
}
