package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* renamed from: k26  reason: default package */
public final /* synthetic */ class k26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;

    public /* synthetic */ k26(l26 l26, int i) {
        this.a = i;
        this.b = l26;
    }

    public final void run() {
        int i = this.a;
        l26 l26 = this.b;
        switch (i) {
            case 0:
                l26.x0 = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(l26);
                l26.Y = vpxEncoderWrapper;
                return;
            case 1:
                l26.a();
                return;
            default:
                l26.a();
                l26.Z = null;
                l26.s0 = null;
                return;
        }
    }
}
