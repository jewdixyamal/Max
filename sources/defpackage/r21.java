package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: r21  reason: default package */
public final class r21 {
    public final je7 a;

    public r21(je7 je7) {
        this.a = je7;
    }

    public final CameraManager a() {
        Conversation a2 = ((fw3) this.a.getValue()).a();
        if (a2 != null) {
            return a2.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager a2 = a();
        return a2 != null && a2.isCapturingFromFrontCamera();
    }
}
