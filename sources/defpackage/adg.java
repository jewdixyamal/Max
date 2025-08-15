package defpackage;

import org.webrtc.PeerConnection;

/* renamed from: adg  reason: default package */
public final class adg extends ny1 {
    public final /* synthetic */ int c;
    public final rj3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adg(nsa nsa, rj3 rj3, int i) {
        super(nsa);
        this.c = i;
        switch (i) {
            case 1:
                super(nsa);
                this.o = rj3;
                return;
            default:
                this.o = rj3;
                return;
        }
    }

    public final void a(PeerConnection peerConnection) {
        switch (this.c) {
            case 0:
                this.o.accept(peerConnection);
                return;
            default:
                this.o.accept(peerConnection);
                return;
        }
    }
}
