package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: xm0  reason: default package */
public final class xm0 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public /* synthetic */ xm0(Handler handler) {
        this.a = 1;
        this.b = handler;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            default:
                this.b.post(runnable);
                return;
        }
    }

    public xm0() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }
}
