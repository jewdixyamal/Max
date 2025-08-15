package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;

/* renamed from: isa  reason: default package */
public final class isa implements PeerConnection.Observer {
    public final /* synthetic */ nsa a;

    public /* synthetic */ isa(nsa nsa) {
        this.a = nsa;
    }

    public void a(String str, rj3 rj3) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.i(str, new adg(nsa, rj3, 0));
    }

    public void onAddStream(MediaStream mediaStream) {
        String str;
        nsa nsa = this.a;
        a4c a4c = nsa.K0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(nsa);
        sb.append(", stream =");
        sb.append(jb9.c(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack next : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (next != null) {
                    sb2.append(next.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(next));
                } else {
                    sb2.append(216);
                }
                z = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        a4c.log("PCRTCClient", sb.toString());
    }

    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String str;
        nsa nsa = this.a;
        a4c a4c = nsa.K0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(nsa);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = jb9.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append(216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        a4c.log("PCRTCClient", sb.toString());
        rtpReceiver.SetObserver(new esa(nsa));
        nsa.p1.k(rtpReceiver, mediaStreamArr);
        nsa.C0.post(new do9(nsa, 7, mediaStreamArr));
    }

    public void onDataChannel(DataChannel dataChannel) {
        nsa nsa = this.a;
        nsa.getClass();
        boolean equals = "animoji".equals(dataChannel.label());
        a4c a4c = nsa.K0;
        if (equals && nsa.v1 == 2) {
            e24 e24 = new e24(dataChannel, a4c);
            ni niVar = nsa.v0;
            if (niVar != null) {
                e24 e242 = niVar.c;
                if (e242 != null) {
                    e242.c(niVar);
                }
                niVar.c = e24;
                kad kad = niVar.b;
                ((AtomicInteger) kad.X).set(0);
                ((AtomicInteger) kad.Y).set(0);
                e24.a(niVar);
            }
            kj kjVar = nsa.t0;
            if (kjVar != null) {
                kjVar.d(e24);
            }
        }
        a4c.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    public void onIceCandidate(IceCandidate iceCandidate) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionIceCandidate, " + nsa);
        nsa.i("onIceCandidate", new adg(nsa, new bsa(nsa, iceCandidate, 1), 1));
    }

    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionIceCandidatesRemoved, " + nsa);
        nsa.i("onIceCandidatesRemoved", new adg(nsa, new gsa(nsa, 3, iceCandidateArr), 1));
    }

    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionIceConnectionChange, " + nsa + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        yr6 yr6 = nsa.N0;
        if (iceConnectionState == iceConnectionState2) {
            yr6.a(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            yr6.a(false);
        }
        if (iceConnectionState == iceConnectionState2 && nsa.u0) {
            nhc nhc = new nhc(true);
            koc koc = nsa.O0;
            if (koc != null) {
                koc.d(new ioc(new ioc((hoc) nhc)));
            }
        }
        nsa.C0.post(new do9(nsa, 6, iceConnectionState));
    }

    public void onIceConnectionReceivingChange(boolean z) {
        this.a.getClass();
    }

    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionIceGatheringChange, " + nsa + ", state=" + iceGatheringState);
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            yr6 yr6 = nsa.N0;
            yr6.getClass();
            yr6.e = SystemClock.elapsedRealtime();
        }
        nsa.i("onIceGatheringChange", new adg(nsa, new gsa(nsa, 0, iceGatheringState), 1));
    }

    public void onRemoveStream(MediaStream mediaStream) {
        nsa nsa = this.a;
        a4c a4c = nsa.K0;
        a4c.log("PCRTCClient", "handlePeerConnectionRemoveStream, " + nsa + ", stream=" + jb9.c(mediaStream));
    }

    public void onRenegotiationNeeded() {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionRenegotiationNeeded, " + nsa);
        nsa.C0.post(new csa(nsa, 4));
    }

    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        nsa nsa = this.a;
        nsa.getClass();
        nsa.K0.log("PCRTCClient", "handlePeerConnectionSignalingChange, " + nsa + ", state=" + signalingState);
        nsa.C0.post(new do9(nsa, 5, signalingState));
    }
}
