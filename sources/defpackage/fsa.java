package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* renamed from: fsa  reason: default package */
public final /* synthetic */ class fsa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;

    public /* synthetic */ fsa(nsa nsa, int i) {
        this.a = i;
        this.b = nsa;
    }

    public final void accept(Object obj) {
        a4c a4c;
        RtpTransceiver rtpTransceiver;
        VideoTrack videoTrack;
        AudioTrack audioTrack;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsa = this.b;
                nsa.u(peerConnection, false);
                nsa.k(peerConnection, false);
                return;
            default:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                nsa nsa2 = this.b;
                nsa2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                RtpTransceiver rtpTransceiver2 = null;
                nsa2.c1 = null;
                nsa2.e1 = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    a4c = nsa2.K0;
                    if (hasNext) {
                        rtpTransceiver = it.next();
                        if (rtpTransceiver.getMid() != null && rtpTransceiver.getMid().contains("s") && rtpTransceiver.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            a4c.log("PCRTCClient", "audioShareTransceiver found");
                        }
                    } else {
                        rtpTransceiver = null;
                    }
                }
                d dVar = nsa2.E0;
                if (rtpTransceiver != null) {
                    try {
                        rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        a4c.log("PCRTCClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    kq7 kq7 = (kq7) dVar.a().b;
                    if (!(kq7 == null || (audioTrack = (AudioTrack) ((MediaStreamTrack) kq7.j.X)) == null)) {
                        RtpSender sender = rtpTransceiver.getSender();
                        nsa2.c1 = sender;
                        nsa2.B0.c(sender, "audio-share");
                        sender.setTrack(audioTrack, false);
                        a4c.log("PCRTCClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        RtpTransceiver next = it2.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            a4c.log("PCRTCClient", "shareScreenTransceiver found");
                            rtpTransceiver2 = next;
                        }
                    }
                }
                if (rtpTransceiver2 != null) {
                    try {
                        rtpTransceiver2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        a4c.log("PCRTCClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    kq7 kq72 = (kq7) dVar.a().b;
                    if (!(kq72 == null || (videoTrack = (VideoTrack) ((MediaStreamTrack) kq72.z.X)) == null)) {
                        RtpSender sender2 = rtpTransceiver2.getSender();
                        nsa2.B0.d(sender2, "screen-share", 30000, 2048000, (Double) null, false);
                        nsa2.e1 = sender2;
                        sender2.setTrack(videoTrack, false);
                        RtpSender rtpSender = nsa2.e1;
                        if (nsa2.r1 && rtpSender != null) {
                            rtpSender.setVideoEncoderObserver(new ar0((Object) nsa2, false));
                        }
                        a4c.log("PCRTCClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            nsa2.l(peerConnection2, false, true, nsa2.e1);
                        } catch (IllegalStateException e3) {
                            a4c.log("PCRTCClient", "IllegalStateException, " + nsa2 + " ex=" + e3);
                        } catch (Exception e4) {
                            a4c.log("PCRTCClient", "Exception, " + nsa2 + " ex=" + e4);
                        }
                    }
                }
                nsa2.v(peerConnection2);
                peerConnection2.createAnswer(new ksa(nsa2, 1), nsa2.Y0);
                return;
        }
    }
}
