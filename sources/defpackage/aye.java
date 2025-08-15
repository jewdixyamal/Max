package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: aye  reason: default package */
public final /* synthetic */ class aye implements rt1 {
    public final /* synthetic */ bye a;

    public /* synthetic */ aye(bye bye) {
        this.a = bye;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        bye bye = this.a;
        if (bye.f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == bye.g) {
                bye.f.b((Object) null);
                bye.f = null;
            }
        }
        return false;
    }
}
