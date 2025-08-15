package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: oq0  reason: default package */
public final class oq0 {
    public static final oq0 c = new oq0(false, false);
    public boolean a;
    public boolean b;

    public /* synthetic */ oq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public oq0(bj6 bj6, int i) {
        boolean z;
        switch (i) {
            case 4:
                boolean z2 = false;
                this.b = false;
                this.a = bj6.e(AutoFlashUnderExposedQuirk.class) != null ? true : z2;
                return;
            case 6:
                Iterator it = bj6.f(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (it.hasNext()) {
                        z = ((CaptureIntentPreviewQuirk) it.next()).c() ? true : z;
                    } else {
                        z = false;
                    }
                }
                this.a = z;
                this.b = bj6.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.a = bj6.d(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = zi4.a.e(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                return;
        }
    }
}
