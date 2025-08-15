package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import org.webrtc.VideoEncoderObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: gsa  reason: default package */
public final /* synthetic */ class gsa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsa(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsa = (nsa) this.b;
                nsa.getClass();
                PeerConnection.IceGatheringState iceGatheringState = PeerConnection.IceGatheringState.GATHERING;
                PeerConnection.IceGatheringState iceGatheringState2 = (PeerConnection.IceGatheringState) this.c;
                if (iceGatheringState2 == iceGatheringState) {
                    nsa.U0 = SystemClock.elapsedRealtime();
                }
                if (iceGatheringState2 == PeerConnection.IceGatheringState.COMPLETE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nsa.toString());
                    sb.append(": iceGatheringState=");
                    ArrayList arrayList = nsa.f1;
                    sb.append(arrayList.size());
                    sb.append(" ");
                    sb.append(arrayList);
                    nsa.K0.log("PCRTCClient", sb.toString());
                    if (nsa.h1) {
                        boolean z = false;
                        nsa.h1 = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IceCandidate iceCandidate = (IceCandidate) it.next();
                            if (iceCandidate.sdp.contains("typ srflx") || iceCandidate.sdp.contains("typ prflx") || iceCandidate.sdp.contains("typ relay")) {
                                z = true;
                            }
                        }
                        if (!z) {
                            nsa.J0.log(e0e.app_event, "rtc.no.stun.candidates", (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                nsa nsa2 = (nsa) this.b;
                nsa2.getClass();
                if (((pkf) this.c).c == 0) {
                    nsa2.u(peerConnection2, false);
                    return;
                } else {
                    nsa2.k(peerConnection2, false);
                    return;
                }
            case 2:
                nsa nsa3 = (nsa) this.b;
                nsa3.getClass();
                if (!((PeerConnection) obj).getStats((StatsObserver) this.c, (MediaStreamTrack) null)) {
                    nsa3.K0.log("PCRTCClient", nsa3.toString() + ": failed to get stats");
                    return;
                }
                return;
            case 3:
                PeerConnection peerConnection3 = (PeerConnection) obj;
                nsa nsa4 = (nsa) this.b;
                nsa4.getClass();
                StringBuilder sb2 = new StringBuilder("❄ -> removed ice candidates: ");
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                sb2.append(Arrays.toString(iceCandidateArr));
                nsa4.K0.log("PCRTCClient", sb2.toString());
                nsa4.C0.post(new do9(nsa4, 9, iceCandidateArr));
                return;
            case 4:
                ((PeerConnection) obj).setConfiguration(((nsa) this.b).g((List) this.c));
                return;
            case 5:
                PeerConnection peerConnection4 = (PeerConnection) obj;
                ar0 ar0 = (ar0) this.b;
                ar0.getClass();
                boolean isHardwareAccelerated = ((VideoEncoderObserver.EncoderInfo) this.c).isHardwareAccelerated();
                nsa nsa5 = (nsa) ar0.b;
                if (isHardwareAccelerated) {
                    nsa5.g1.m((Float) null, (Float) null);
                    return;
                } else {
                    nsa5.g1.m(Float.valueOf(nsa5.s1), Float.valueOf(nsa5.t1));
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4((WaitingRoomParticipants) this.b, (sqd) this.c, (cq1) obj);
                return;
        }
    }
}
