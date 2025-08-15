package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: wh6  reason: default package */
public final class wh6 extends cx7 implements hg4 {
    public final Handler a;
    public final String b;
    public final boolean c;
    public final wh6 o;

    public wh6(Handler handler, String str, boolean z) {
        wh6 wh6;
        this.a = handler;
        this.b = str;
        this.c = z;
        if (z) {
            wh6 = this;
        } else {
            wh6 = new wh6(handler, str, true);
        }
        this.o = wh6;
    }

    public final void d(lx3 lx3, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null) {
            x77.cancel(cancellationException);
        }
        ql4.c.dispatch(lx3, runnable);
    }

    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        if (!this.a.post(runnable)) {
            d(lx3, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wh6) {
            wh6 wh6 = (wh6) obj;
            return wh6.a == this.a && wh6.c == this.c;
        }
    }

    public final cx7 getImmediate() {
        return this.o;
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ System.identityHashCode(this.a);
    }

    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new vh6(this, runnable);
        }
        d(lx3, runnable);
        return er9.a;
    }

    public final boolean isDispatchNeeded(lx3 lx3) {
        return !this.c || !tpa.f(Looper.myLooper(), this.a.getLooper());
    }

    public final void scheduleResumeAfterDelay(long j, ry1 ry1) {
        h76 h76 = new h76(ry1, 8, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(h76, j)) {
            ry1.d(new ga(this, 15, h76));
        } else {
            d(ry1.getContext(), h76);
        }
    }

    public final String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String str = this.b;
        if (str == null) {
            str = this.a.toString();
        }
        return this.c ? au1.g(str, ".immediate") : str;
    }

    public wh6(Handler handler) {
        this(handler, (String) null, false);
    }
}
