package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.ScheduledFuture;

/* renamed from: rs5  reason: default package */
public final /* synthetic */ class rs5 implements rt1 {
    public final /* synthetic */ xs5 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ rs5(xs5 xs5, boolean z, long j) {
        this.a = xs5;
        this.b = z;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        xs5 xs5 = this.a;
        xs5.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (xs5.q.length > 0) {
            if (!this.b || num == null) {
                xs5.m = true;
                xs5.l = true;
            } else if (xs5.h.intValue() == 3) {
                if (num.intValue() == 4) {
                    xs5.m = true;
                    xs5.l = true;
                } else if (num.intValue() == 5) {
                    xs5.m = false;
                    xs5.l = true;
                }
            }
        }
        if (xs5.l && st1.x(totalCaptureResult, this.c)) {
            boolean z = xs5.m;
            ScheduledFuture scheduledFuture = xs5.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                xs5.j = null;
            }
            lq1 lq1 = xs5.t;
            if (lq1 != null) {
                lq1.b(new ys5(z));
                xs5.t = null;
            }
            return true;
        } else if (xs5.h.equals(num) || num == null) {
            return false;
        } else {
            xs5.h = num;
            return false;
        }
    }
}
