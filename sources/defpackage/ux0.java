package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

/* renamed from: ux0  reason: default package */
public final /* synthetic */ class ux0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ ux0(py0 py0, int i) {
        this.a = i;
        this.b = py0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                if (!py0.A0) {
                    Iterator it = py0.q1.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            case 1:
                py0 py02 = this.b;
                py02.s0.post(new ux0(py02, 3));
                return;
            case 2:
                py0 py03 = this.b;
                if (!py03.A0) {
                    int c = py03.l1.c();
                    boolean z = true;
                    if (!(c == 2 || c == 1)) {
                        z = false;
                    }
                    ji9 ji9 = py03.y1;
                    if (z != ji9.f) {
                        py03.V0.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + ji9.f + ") != camera video enabled state (" + z + "). Let us update media settings");
                        py03.G(z);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                py0 py04 = this.b;
                a4c a4c = py04.V0;
                EglBase eglBase = py04.x0;
                try {
                    a4c.log("OKRTCCall", "Releasing " + jb9.c(eglBase));
                    eglBase.release();
                    a4c.log("OKRTCCall", jb9.c(eglBase) + " was released");
                    return;
                } catch (Exception e) {
                    a4c.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            default:
                py0 py05 = this.b;
                py05.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = py05.k1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.clearDumpRequests();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    py05.V0.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
        }
    }

    public /* synthetic */ ux0(py0 py0, boolean z) {
        this.a = 0;
        this.b = py0;
    }
}
