package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ts5  reason: default package */
public final /* synthetic */ class ts5 implements rt1 {
    public final /* synthetic */ xs5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ ts5(int i, long j, xs5 xs5) {
        this.a = xs5;
        this.b = i;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        xs5 xs5 = this.a;
        xs5.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != this.b || !st1.x(totalCaptureResult, this.c)) {
            return false;
        }
        lq1 lq1 = xs5.u;
        if (lq1 != null) {
            lq1.b((Object) null);
            xs5.u = null;
        }
        return true;
    }
}
