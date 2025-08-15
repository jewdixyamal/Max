package defpackage;

import org.webrtc.PeerConnectionFactory;

/* renamed from: iy0  reason: default package */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ iy0(py0 py0, Runnable runnable, int i) {
        this.a = i;
        this.b = py0;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                py0.s0.post(new iy0(py0, this.c, 1));
                return;
            default:
                py0 py02 = this.b;
                py02.V0.log("OKRTCCall", "disabling enhancer");
                if (!py02.A0) {
                    py02.a1 = true;
                    py02.F(new wq9(false, true, true, false, (PeerConnectionFactory.EnhancerKind) null, (String) null, 0, 0, 0, 0, 0, false, (yh0) null, 0));
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
