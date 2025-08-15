package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: ci6  reason: default package */
public final class ci6 extends ztc {
    public final Handler c;
    public final boolean d = true;

    public ci6(Handler handler) {
        this.c = handler;
    }

    public final xtc a() {
        return new ai6(this.c, this.d);
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.c;
            bi6 bi6 = new bi6(handler, runnable);
            Message obtain = Message.obtain(handler, bi6);
            if (this.d) {
                obtain.setAsynchronous(true);
            }
            handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bi6;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
