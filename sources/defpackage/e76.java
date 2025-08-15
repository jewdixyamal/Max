package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: e76  reason: default package */
public final /* synthetic */ class e76 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledFuture b;

    public /* synthetic */ e76(ScheduledFuture scheduledFuture, int i) {
        this.a = i;
        this.b = scheduledFuture;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel(true);
                return;
            default:
                this.b.cancel(true);
                return;
        }
    }
}
