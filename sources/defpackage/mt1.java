package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: mt1  reason: default package */
public final /* synthetic */ class mt1 implements rt1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ lq1 b;

    public /* synthetic */ mt1(long j, lq1 lq1) {
        this.a = j;
        this.b = lq1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        if (!st1.x(totalCaptureResult, this.a)) {
            return false;
        }
        this.b.b((Object) null);
        return true;
    }
}
