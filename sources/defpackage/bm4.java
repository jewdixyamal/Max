package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bm4  reason: default package */
public final class bm4 implements cm4 {
    public final Future a;

    public bm4(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
