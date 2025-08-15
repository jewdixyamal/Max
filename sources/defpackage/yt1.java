package defpackage;

import android.hardware.camera2.CameraManager;

/* renamed from: yt1  reason: default package */
public final class yt1 extends CameraManager.AvailabilityCallback implements tx1 {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ fu1 c;

    public yt1(fu1 fu1, String str) {
        this.c = fu1;
        this.a = str;
    }

    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.S0 == 4) {
                this.c.J(false);
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
