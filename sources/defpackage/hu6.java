package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* renamed from: hu6  reason: default package */
public final class hu6 extends lu1 {
    public static final hu6 c = new hu6(new Object());
    public final crd b;

    public hu6(crd crd) {
        this.b = crd;
    }

    public final void a(o9f o9f, u40 u40) {
        super.a(o9f, u40);
        if (o9f instanceof gu6) {
            gu6 gu6 = (gu6) o9f;
            mi9 b2 = mi9.b();
            aa0 aa0 = gu6.b;
            if (gu6.o(aa0)) {
                crd crd = this.b;
                int intValue = ((Integer) gu6.h(aa0)).intValue();
                crd.getClass();
                if (((ImageCapturePixelHDRPlusQuirk) zi4.a.e(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b2.j(cv1.v0(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b2.j(cv1.v0(key2), Boolean.FALSE);
                    }
                }
            }
            u40.c(new re6(8, (Object) wma.a(b2)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
