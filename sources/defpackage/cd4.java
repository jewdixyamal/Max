package defpackage;

import java.util.List;
import org.webrtc.PeerConnection;

/* renamed from: cd4  reason: default package */
public final /* synthetic */ class cd4 implements rj3 {
    public final /* synthetic */ fd4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fp1 c;
    public final /* synthetic */ List d;

    public /* synthetic */ cd4(fd4 fd4, String str, fp1 fp1, List list) {
        this.a = fd4;
        this.b = str;
        this.c = fp1;
        this.d = list;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        this.a.u(this.b, this.c, this.d);
    }
}
