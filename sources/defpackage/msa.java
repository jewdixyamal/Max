package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: msa  reason: default package */
public interface msa {
    void a(nsa nsa, SessionDescription sessionDescription);

    void b(nsa nsa);

    void c(nsa nsa);

    void d();

    void e(String str);

    void f();

    void g(nsa nsa, String str);

    void h(nsa nsa, IceCandidate[] iceCandidateArr);

    void k(nsa nsa, PeerConnection.SignalingState signalingState);

    void l(nsa nsa, IceCandidate iceCandidate);

    void m(nsa nsa, SessionDescription sessionDescription);

    void n(nsa nsa, PeerConnection.IceConnectionState iceConnectionState);

    void o(nsa nsa, long j) {
    }

    void q(nsa nsa);
}
