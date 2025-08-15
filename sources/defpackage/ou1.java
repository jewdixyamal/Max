package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ou1  reason: default package */
public final class ou1 implements tu1 {
    public final st1 a;
    public boolean b = false;

    public ou1(st1 st1) {
        this.a = st1;
    }

    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        Integer num2;
        dw6 r = kq0.r(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return r;
        }
        int intValue = num.intValue();
        if ((intValue == 1 || intValue == 2) && (num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) != null && num2.intValue() == 0) {
            this.b = true;
            this.a.h.e(false);
        }
        return r;
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        if (this.b) {
            this.a.h.a(true, false);
        }
    }
}
