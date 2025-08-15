package defpackage;

import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* renamed from: zx0  reason: default package */
public final /* synthetic */ class zx0 implements AndroidVideoDecoder.ErrorCallback, SignalingProvider {
    public final /* synthetic */ py0 a;

    public /* synthetic */ zx0(py0 py0) {
        this.a = py0;
    }

    public void error(Exception exc, String str) {
        py0 py0 = this.a;
        py0.getClass();
        py0.V0.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    public rod getSignaling() {
        return this.a.Z;
    }
}
