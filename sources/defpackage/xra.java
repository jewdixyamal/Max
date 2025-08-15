package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* renamed from: xra  reason: default package */
public final /* synthetic */ class xra implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xra(nsa nsa, boolean z, int i) {
        this.a = i;
        this.b = nsa;
        this.c = z;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (this.a) {
            case 0:
                nsa nsa = this.b;
                MediaConstraints mediaConstraints = nsa.Y0;
                if (this.c) {
                    mediaConstraints = new MediaConstraints();
                    mediaConstraints.optional.addAll(nsa.Y0.optional);
                    mediaConstraints.mandatory.addAll(nsa.Y0.mandatory);
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                peerConnection.createOffer(new ksa(nsa, 0), mediaConstraints);
                return;
            default:
                nsa nsa2 = this.b;
                boolean z = this.c;
                nsa2.u(peerConnection, z);
                nsa2.k(peerConnection, z);
                return;
        }
    }
}
