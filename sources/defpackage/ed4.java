package defpackage;

import java.io.Serializable;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;

/* renamed from: ed4  reason: default package */
public final /* synthetic */ class ed4 implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ed4(Object obj, Object obj2, Serializable serializable, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = serializable;
    }

    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                fd4 fd4 = (fd4) this.d;
                fd4.getClass();
                MediaStreamTrack track = ((RtpReceiver) this.b).track();
                for (VideoTrack next : ((MediaStream[]) this.c)[0].videoTracks) {
                    String id = next.id();
                    String i = wg0.i("remote video track ", id);
                    a4c a4c = (a4c) fd4.b;
                    a4c.log("DefaultRemoteVideoTracks", i);
                    if (track != null && id.equals(track.id())) {
                        a4c.log("DefaultRemoteVideoTracks", "add remote video track ".concat(id));
                        if (id.startsWith("video-")) {
                            String substring = id.substring(6);
                            if (!substring.startsWith("u") && !substring.startsWith("g")) {
                                str = "video-u".concat(substring);
                                fd4.Z.put(str, next);
                                next.setEnabled(true);
                                nsa nsa = ((esa) fd4.o).a;
                                nsa.C0.post(new yra(nsa, id, 2));
                            }
                        }
                        str = id;
                        fd4.Z.put(str, next);
                        next.setEnabled(true);
                        nsa nsa2 = ((esa) fd4.o).a;
                        nsa2.C0.post(new yra(nsa2, id, 2));
                    }
                }
                return;
            case 1:
                kqa kqa = (kqa) this.d;
                RtpReceiver rtpReceiver = (RtpReceiver) this.b;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                synchronized (kqa) {
                    try {
                        MediaStreamTrack track2 = rtpReceiver.track();
                        for (VideoTrack next2 : mediaStreamArr[0].videoTracks) {
                            String id2 = next2.id();
                            ((a4c) kqa.b).log("ParticipantsAgnosticVideoTracks", "remote video track " + id2);
                            if (track2 != null) {
                                if (id2.equals(track2.id())) {
                                    ((a4c) kqa.b).log("ParticipantsAgnosticVideoTracks", "add remote video track ".concat(id2));
                                    lqa lqa = new lqa(kqa.u0, (o9g) kqa.X);
                                    jqa jqa = new jqa(kqa, id2);
                                    kqa.Z.add(lqa);
                                    kqa.s0.add(jqa);
                                    kqa.Y.add(next2);
                                    if (next2.isDisposed()) {
                                        ((a4c) kqa.b).log("ParticipantsAgnosticVideoTracks", "error: video track is disposed");
                                    } else {
                                        next2.addSink(lqa);
                                        next2.addSink(jqa);
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$0((m56) this.d, (m56) this.b, (ParticipantId) this.c, (bg1) obj);
                return;
        }
    }
}
