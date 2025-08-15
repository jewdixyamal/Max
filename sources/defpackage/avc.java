package defpackage;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: avc  reason: default package */
public final /* synthetic */ class avc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ avc(ScreenCapturerAndroid screenCapturerAndroid, int i) {
        this.a = i;
        this.b = screenCapturerAndroid;
    }

    public final void run() {
        int i = this.a;
        ScreenCapturerAndroid screenCapturerAndroid = this.b;
        switch (i) {
            case 0:
                screenCapturerAndroid.lambda$new$0();
                return;
            default:
                screenCapturerAndroid.updateVirtualDisplay();
                return;
        }
    }
}
