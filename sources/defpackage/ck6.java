package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ck6  reason: default package */
public final class ck6 implements Executor {
    public static volatile ck6 c;
    public final /* synthetic */ int a;
    public final Object b;

    public ck6(Looper looper) {
        this.a = 1;
        this.b = new fc9(looper, 5);
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            default:
                ((fc9) this.b).post(runnable);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public ck6() {
        this.a = 0;
        this.b = Executors.newSingleThreadExecutor(new Object());
    }
}
