package defpackage;

import android.os.Handler;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: dsa  reason: default package */
public final /* synthetic */ class dsa implements rj3 {
    public final /* synthetic */ nsa a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ dsa(nsa nsa, boolean z, SessionDescription sessionDescription) {
        this.a = nsa;
        this.b = z;
        this.c = sessionDescription;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        nsa nsa = this.a;
        Handler handler = nsa.C0;
        boolean z = this.b;
        SessionDescription sessionDescription = this.c;
        if (z) {
            handler.post(new hsa(nsa, sessionDescription, 0));
        } else {
            handler.post(new hsa(nsa, sessionDescription, 1));
        }
    }
}
