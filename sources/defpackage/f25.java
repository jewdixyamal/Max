package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f25  reason: default package */
public abstract class f25 extends Service {
    public int X = 0;
    public final ExecutorService a;
    public b7g b;
    public final Object c = new Object();
    public int o;

    public f25() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cm9("Firebase-Messaging-Intent-Handle", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            prf.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.X - 1;
                this.X = i;
                if (i == 0) {
                    stopSelfResult(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new b7g(new fd7(this));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b;
    }

    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.o = i2;
            this.X++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) c8d.r().o).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        qne qne = new qne();
        this.a.execute(new v05((Object) this, (Object) intent2, (Object) qne, 2));
        ukg ukg = qne.a;
        if (ukg.g()) {
            a(intent);
            return 2;
        }
        ukg.b(new cs(2), new d74(this, 11, intent));
        return 3;
    }
}
