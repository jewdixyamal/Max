package defpackage;

import android.graphics.SurfaceTexture;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ca5  reason: default package */
public final /* synthetic */ class ca5 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;

    public /* synthetic */ ca5(fa5 fa5, int i) {
        this.a = i;
        this.b = fa5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E0 = false;
                return;
            case 1:
                fa5 fa5 = this.b;
                fa5.B0 = null;
                if (!fa5.A0 || !fa5.u0.isEmpty()) {
                    fa5.B();
                    return;
                }
                fa5.A0 = false;
                ba5 ba5 = fa5.X;
                ba5.getClass();
                ((qi0) ba5).b();
                d54.a();
                ScheduledFuture scheduledFuture = fa5.D0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                fa5.D0 = null;
                return;
            case 2:
                fa5 fa52 = this.b;
                ConcurrentLinkedQueue concurrentLinkedQueue = fa52.u0;
                int size = concurrentLinkedQueue.size();
                int i = fa52.z0;
                Locale locale = Locale.US;
                StringBuilder n = rh4.n(size, "Forcing EOS after missing ", " frames for ");
                n.append(fa5.H0);
                n.append(" ms, with available frame count: ");
                n.append(i);
                z04.c0(n.toString());
                fa52.A0 = false;
                fa52.B0 = null;
                fa52.E0 = true;
                while (true) {
                    int i2 = fa52.z0;
                    if (i2 > 0) {
                        fa52.z0 = i2 - 1;
                        fa52.s0.updateTexImage();
                        fa52.u0.remove();
                    } else {
                        concurrentLinkedQueue.clear();
                        fa52.z();
                        return;
                    }
                }
            case 3:
                fa5 fa53 = this.b;
                if (!fa53.u0.isEmpty() || fa53.B0 != null) {
                    fa53.A0 = true;
                    ScheduledFuture scheduledFuture2 = fa53.D0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    fa53.D0 = null;
                    fa53.D0 = fa53.v0.schedule(new dd4(19, fa53), fa5.H0, TimeUnit.MILLISECONDS);
                    return;
                }
                ba5 ba52 = fa53.X;
                ba52.getClass();
                ((qi0) ba52).b();
                d54.a();
                ScheduledFuture scheduledFuture3 = fa53.D0;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(false);
                }
                fa53.D0 = null;
                return;
            case 4:
                fa5 fa54 = this.b;
                fa54.getClass();
                d54.a();
                if (fa54.E0) {
                    SurfaceTexture surfaceTexture = fa54.s0;
                    surfaceTexture.updateTexImage();
                    z04.c0("Dropping frame received on SurfaceTexture after forcing EOS: " + (surfaceTexture.getTimestamp() / 1000));
                    return;
                }
                if (fa54.A0) {
                    ScheduledFuture scheduledFuture4 = fa54.D0;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    fa54.D0 = null;
                    fa54.D0 = fa54.v0.schedule(new dd4(19, fa54), fa5.H0, TimeUnit.MILLISECONDS);
                }
                fa54.z0++;
                fa54.B();
                return;
            default:
                fa5 fa55 = this.b;
                fa55.y0++;
                fa55.B();
                return;
        }
    }
}
