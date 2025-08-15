package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: k40  reason: default package */
public final class k40 implements Executor {
    public static volatile k40 c;
    public final /* synthetic */ int a;
    public Object b;

    public k40(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                return;
            case 2:
                return;
            default:
                this.b = Executors.newFixedThreadPool(2, new j40(0));
                return;
        }
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(intValue));
        }
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
                ThreadLocal threadLocal = (ThreadLocal) this.b;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(intValue));
                if (intValue <= 15) {
                    try {
                        runnable.run();
                    } finally {
                        a();
                    }
                } else {
                    xp0.d.a.execute(runnable);
                }
                return;
            default:
                ((Handler) ((bkb) this.b).b).post(runnable);
                return;
        }
    }

    public k40(bkb bkb) {
        this.a = 3;
        this.b = bkb;
    }
}
