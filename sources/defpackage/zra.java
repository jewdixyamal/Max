package defpackage;

import org.webrtc.PeerConnection;
import org.webrtc.Size;

/* renamed from: zra  reason: default package */
public final /* synthetic */ class zra implements rj3 {
    public final /* synthetic */ nsa a;
    public final /* synthetic */ Size b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ zra(nsa nsa, Size size, int i, int i2) {
        this.a = nsa;
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        nsa nsa = this.a;
        nsa.F();
        Size size = this.b;
        int i = size.width;
        int i2 = size.height;
        int i3 = nsa.y0;
        rz3 rz3 = nsa.o1;
        if (!(i3 == i && nsa.z0 == i2)) {
            rz3.f = i2;
            rz3.c = i;
            StringBuilder sb = new StringBuilder("Camera video size changed: ");
            sb.append(nsa.y0);
            sb.append("x");
            ms2.k(sb, nsa.z0, " -> ", i, "x");
            sb.append(i2);
            nsa.K0.log("PCRTCClient", sb.toString());
            nsa.y0 = i;
            nsa.z0 = i2;
            nsa.u(peerConnection, false);
        }
        int i4 = nsa.w0;
        int i5 = this.c;
        int i6 = this.d;
        if (i4 != i5 || nsa.x0 != i6) {
            rz3.g = i5;
            rz3.h = i6;
            nsa.w0 = i5;
            nsa.x0 = i6;
            nsa.k(peerConnection, false);
        }
    }
}
