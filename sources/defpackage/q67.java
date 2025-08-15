package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: q67  reason: default package */
public final class q67 implements Executor {
    public static volatile q67 c;
    public final /* synthetic */ int a;
    public final Object b;

    public q67(ExecutorService executorService) {
        this.a = 2;
        this.b = executorService;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ((Handler) this.b).post(runnable);
                return;
            case 2:
                ((Executor) this.b).execute(new tqc(runnable, 0));
                return;
            default:
                ((fc9) this.b).post(runnable);
                return;
        }
    }

    public q67(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                return;
            case 3:
                fc9 fc9 = new fc9(Looper.getMainLooper(), 3, false);
                Looper.getMainLooper();
                this.b = fc9;
                return;
            default:
                this.b = Executors.newFixedThreadPool(2, new j40(3));
                return;
        }
    }
}
