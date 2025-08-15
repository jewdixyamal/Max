package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pif  reason: default package */
public final class pif extends HandlerThread {
    public final /* synthetic */ sif X;
    public final Size a;
    public final eu4 b;
    public final long c = SystemClock.elapsedRealtime();
    public final AtomicReference o = new AtomicReference();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pif(sif sif, Size size, eu4 eu4) {
        super("videomsg-gl-thread");
        this.X = sif;
        this.a = size;
        this.b = eu4;
    }

    public final void onLooperPrepared() {
        String str = this.X.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.i(SystemClock.elapsedRealtime() - this.c, "onLooperPrepared, GL thread startup took=", " ms"), (Throwable) null);
        }
    }

    public final void run() {
        String str = this.X.a;
        Size size = this.a;
        eu4 eu4 = this.b;
        hm9.G(str, "run, previewSize=" + size + ", dynamicRange=" + eu4, (Throwable) null);
        if (this.X.b.get()) {
            hm9.m0(this.X.a, "run, video message processor was requested to exit during startup GL thread, skip GL initialization!", new Object[0]);
        } else {
            try {
                sif.d(this.X, this.a, this.b);
            } catch (Exception e) {
                hm9.p(this.X.a, "GL initialization failed", e);
                this.o.set(e);
            }
        }
        super.run();
        String str2 = this.X.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.Z, str2, "run, GL thread finished", (Throwable) null);
        }
    }
}
