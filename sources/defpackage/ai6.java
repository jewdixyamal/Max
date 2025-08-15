package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: ai6  reason: default package */
public final class ai6 extends xtc {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public ai6(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            boolean z = this.c;
            iz4 iz4 = iz4.a;
            if (z) {
                return iz4;
            }
            Handler handler = this.a;
            bi6 bi6 = new bi6(handler, runnable);
            Message obtain = Message.obtain(handler, bi6);
            obtain.obj = this;
            if (this.b) {
                obtain.setAsynchronous(true);
            }
            this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.c) {
                return bi6;
            }
            this.a.removeCallbacks(bi6);
            return iz4;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final void g() {
        this.c = true;
        this.a.removeCallbacksAndMessages(this);
    }

    public final boolean h() {
        return this.c;
    }
}
