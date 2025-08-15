package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ndf  reason: default package */
public final class ndf extends iv1 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ lq1 c;
    public final /* synthetic */ bad d;

    public ndf(AtomicBoolean atomicBoolean, lq1 lq1, bad bad) {
        this.b = atomicBoolean;
        this.c = lq1;
        this.d = bad;
    }

    public final void b(int i, pv1 pv1) {
        Object obj;
        if (this.a) {
            this.a = false;
            pv1.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get() && (obj = pv1.c().a.get("androidx.camera.video.VideoCapture.streamUpdate")) != null) {
            int intValue = ((Integer) obj).intValue();
            lq1 lq1 = this.c;
            if (intValue == lq1.hashCode() && lq1.b((Object) null) && !atomicBoolean.getAndSet(true)) {
                ju0.D().execute(new fre(this, 5, this.d));
            }
        }
    }
}
