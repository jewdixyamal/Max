package defpackage;

import java.util.Collections;
import java.util.regex.Matcher;
import org.json.HTTP;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: asa  reason: default package */
public final /* synthetic */ class asa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ asa(nsa nsa, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = nsa;
        this.c = sessionDescription;
    }

    public final void accept(Object obj) {
        String group;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsa = this.b;
                nsa.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                a4c a4c = nsa.K0;
                s5c.x(str, a4c);
                if (nsa.H0 != 2) {
                    str = nsa.d(str, true);
                }
                boolean z = nsa.Y;
                d4c d4c = nsa.J0;
                if (z) {
                    str = s5c.V(s5c.e(str, "dred", "100", d4c, a4c), Collections.singletonList("opus"), d4c, a4c);
                }
                Integer num = nsa.Z;
                if (num != null) {
                    str = s5c.e(str, "minptime", String.valueOf(num.intValue()), d4c, a4c);
                }
                Integer num2 = nsa.s0;
                if (num2 != null) {
                    str = s5c.e(str, "maxptime", String.valueOf(num2.intValue()), d4c, a4c);
                }
                if (nsa.o) {
                    str = s5c.V(str, Collections.singletonList("red"), d4c, a4c);
                }
                String j = rh4.j(str, str.endsWith("\n") ? "" : HTTP.CRLF, "a=animoji:2\r\n");
                if (!nsa.X) {
                    j = s5c.e(j, "usedtx", String.valueOf(1), d4c, a4c);
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, j);
                a4c.log("PCRTCClient", nsa.toString() + ": set local sdp from " + sessionDescription2.type);
                peerConnection.setLocalDescription(new jsa(nsa, sessionDescription2, 0), sessionDescription2);
                return;
            default:
                nsa nsa2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                nsa2.getClass();
                String str2 = sessionDescription3.description;
                s5c.x(str2, nsa2.K0);
                if (!nsa2.r1 && nsa2.g1 != null) {
                    if (nsa.w1.matcher(str2).find()) {
                        a4c a4c2 = nsa2.K0;
                        a4c2.log("PCRTCClient", nsa2.toString() + ": remote sdp supports h264 decoding");
                    } else {
                        a4c a4c3 = nsa2.K0;
                        a4c3.log("PCRTCClient", nsa2.toString() + ": remote does not support h264 decoding");
                        nsa2.g1.m(Float.valueOf(nsa2.s1), Float.valueOf(nsa2.t1));
                    }
                }
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, nsa2.d(str2, false));
                if (nsa2.t0.c == null) {
                    Matcher matcher = nsa.x1.matcher(sessionDescription3.description);
                    int i = 1;
                    if (matcher.find() && (group = matcher.group(1)) != null) {
                        i = Integer.parseInt(group);
                    }
                    nsa2.L0.getClass();
                    int min = Math.min(i, 2);
                    a4c a4c4 = nsa2.K0;
                    a4c4.log("PCRTCClient", nsa2.toString() + ": set animoji protocol version: " + min + "(local: 2, remote: " + i + ")");
                    kj kjVar = nsa2.t0;
                    if (kjVar.c != null) {
                        Throwable th = new Throwable("Resetting animoji protocol version");
                        a4c a4c5 = (a4c) kjVar.a.b;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        a4c5.logException("AniSend", message, th);
                    }
                    kjVar.c = Integer.valueOf(min);
                    rw4 rw4 = kjVar.g;
                    if (rw4 != null) {
                        rw4.a();
                    }
                }
                a4c a4c6 = nsa2.K0;
                a4c6.log("PCRTCClient", nsa2.toString() + ": set remote sdp from " + sessionDescription3.type);
                peerConnection2.setRemoteDescription(new jsa(nsa2, sessionDescription4, 1), sessionDescription4);
                return;
        }
    }
}
