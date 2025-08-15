package defpackage;

import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: oj3  reason: default package */
public final /* synthetic */ class oj3 implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                fd4 fd4 = (fd4) this.b;
                PeerConnection peerConnection = (PeerConnection) obj;
                synchronized (fd4.Y) {
                    try {
                        for (String str : fd4.s0.keySet()) {
                            fd4.u(str, (fp1) fd4.s0.get(str), (List) null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) this.b);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new yt8(14, (Object) (o1e) this.b));
                return;
            case 4:
                StereoRoomManagerImpl.withInternalId$lambda$11((m56) this.b, (bg1) obj);
                return;
            default:
                ((nqd) ((sqd) this.b)).a((bg1) obj);
                return;
        }
    }
}
