package defpackage;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eba  reason: default package */
public final class eba {
    public final bkb a;

    public eba(bkb bkb) {
        this.a = bkb;
    }

    public final tk5 a(int i, String str) {
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, linkedTransferQueue, this.a.s(str, Integer.valueOf(i)));
        threadPoolExecutor.setRejectedExecutionHandler(new qw1(1));
        return threadPoolExecutor;
    }
}
