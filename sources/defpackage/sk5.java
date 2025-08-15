package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: sk5  reason: default package */
public final class sk5 extends ScheduledThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
