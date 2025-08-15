package defpackage;

import android.content.Context;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* renamed from: it1  reason: default package */
public final class it1 extends dle {
    public final CameraEnumerator X;
    public final /* synthetic */ int o = 0;

    public it1(a4c a4c, boolean z) {
        super(a4c);
        this.X = new Camera1Enumerator(z);
    }

    public final CameraEnumerator H() {
        switch (this.o) {
            case 0:
                return (Camera1Enumerator) this.X;
            default:
                return (Camera2Enumerator) this.X;
        }
    }

    public it1(Context context, a4c a4c) {
        super(a4c);
        this.X = new Camera2Enumerator(context);
    }
}
