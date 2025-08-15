package defpackage;

import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;

/* renamed from: f7d  reason: default package */
public final /* synthetic */ class f7d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7d b;

    public /* synthetic */ f7d(h7d h7d, int i) {
        this.a = i;
        this.b = h7d;
    }

    public final void run() {
        xn1 xn1;
        int i = this.a;
        h7d h7d = this.b;
        switch (i) {
            case 0:
                h7d.getClass();
                if (NetworkMonitor.isOnline() && h7d.I0.D0 && (xn1 = h7d.y0) != null) {
                    ((py0) xn1).A(h7d, PeerConnection.IceConnectionState.FAILED);
                    return;
                }
                return;
            default:
                if (h7d.I()) {
                    d5f d5f = h7d.I0;
                    if (d5f.B0.C() != PeerConnection.IceConnectionState.CONNECTED) {
                        jb9.d(d5f.X, "SERVER_CONNECTION_TIMEOUT", "in");
                    }
                    if (d5f.B0 != null) {
                        d5f.B0.I(d5f.y0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
