package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ws5  reason: default package */
public final /* synthetic */ class ws5 implements rt1 {
    public final /* synthetic */ xs5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lq1 c;

    public /* synthetic */ ws5(xs5 xs5, long j, lq1 lq1) {
        this.a = xs5;
        this.b = j;
        this.c = lq1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        xs5 xs5 = this.a;
        xs5.getClass();
        if ((((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) != xs5.v || !st1.x(totalCaptureResult, this.b)) {
            return false;
        }
        lq1 lq1 = this.c;
        if (lq1 != null) {
            lq1.b((Object) null);
        }
        return true;
    }
}
