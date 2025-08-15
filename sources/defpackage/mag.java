package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* renamed from: mag  reason: default package */
public final class mag {
    public final xv1 a;
    public final nag b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e = false;
    public final boolean f = false;
    public hqc g;
    public oz1 h;
    public fw6 i;
    public ImageWriter j;

    /* JADX WARNING: type inference failed for: r7v6, types: [go9, nag] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, av1] */
    public mag(xv1 xv1) {
        boolean z;
        boolean z2 = false;
        this.a = xv1;
        int[] iArr = (int[]) xv1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr[i2] == 4) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        z = false;
        this.e = z;
        this.f = zi4.a.e(ZslDisablerQuirk.class) != null ? true : z2;
        this.b = new go9(3, (av1) new Object());
    }
}
