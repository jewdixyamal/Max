package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: qw1  reason: default package */
public final /* synthetic */ class qw1 implements RejectedExecutionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ qw1(int i) {
        this.a = i;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.a) {
            case 0:
                j40 j40 = rw1.c;
                return;
            default:
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                    return;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                    return;
                }
        }
    }
}
