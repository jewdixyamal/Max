package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: lx5  reason: default package */
public final class lx5 implements uw4 {
    public Handler X;
    public Executor Y;
    public ThreadPoolExecutor Z;
    public final Context a;
    public final bg4 b;
    public final dp3 c;
    public final Object o = new Object();
    public tu0 s0;

    public lx5(Context context, bg4 bg4) {
        dp3 dp3 = mx5.i;
        c54.o(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = bg4;
        this.c = dp3;
    }

    public final void a(tu0 tu0) {
        synchronized (this.o) {
            this.s0 = tu0;
        }
        c();
    }

    public final void b() {
        synchronized (this.o) {
            try {
                this.s0 = null;
                Handler handler = this.X;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.X = null;
                ThreadPoolExecutor threadPoolExecutor = this.Z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.Y = null;
                this.Z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.o) {
            try {
                if (this.s0 != null) {
                    if (this.Y == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pd3(0, "emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.Z = threadPoolExecutor;
                        this.Y = threadPoolExecutor;
                    }
                    this.Y.execute(new dd4(25, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vx5 d() {
        try {
            dp3 dp3 = this.c;
            Context context = this.a;
            bg4 bg4 = this.b;
            dp3.getClass();
            sh0 p = z7.p(context, bg4);
            int i = p.b;
            if (i == 0) {
                vx5[] vx5Arr = (vx5[]) p.c;
                if (vx5Arr != null && vx5Arr.length != 0) {
                    return vx5Arr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(wg0.g(i, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
