package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* renamed from: esa  reason: default package */
public final /* synthetic */ class esa implements RtpReceiver.Observer {
    public final /* synthetic */ nsa a;

    public /* synthetic */ esa(nsa nsa) {
        this.a = nsa;
    }

    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        nsa nsa = this.a;
        nsa.C0.post(new csa(nsa, 5));
    }
}
