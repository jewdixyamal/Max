package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: d5f  reason: default package */
public final class d5f implements rsa, msa {
    public static final Pattern J0 = Pattern.compile("a=ssrc:(\\d+)");
    public final lsa A0;
    public volatile nsa B0;
    public SessionDescription C0;
    public boolean D0;
    public final boolean E0;
    public boolean F0;
    public String G0;
    public final CopyOnWriteArraySet H0;
    public ji9 I0;
    public final d4c X;
    public final a4c Y;
    public final rod Z;
    public final ag1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList o;
    public final i7b s0;
    public final qld t0;
    public final HashSet u0 = new HashSet();
    public final re6 v0;
    public final bg4 w0;
    public final h7d x0;
    public ssa y0;
    public final boolean z0;

    public d5f(g7d g7d, h7d h7d) {
        ag1 ag1 = g7d.m;
        this.a = ag1;
        this.b = g7d.j;
        this.c = g7d.k;
        this.o = g7d.l;
        this.x0 = h7d;
        d4c d4c = g7d.p;
        this.X = d4c;
        a4c a4c = g7d.o;
        this.Y = a4c;
        this.Z = g7d.i;
        this.s0 = g7d.r;
        qld qld = g7d.a;
        this.t0 = qld;
        this.w0 = g7d.u;
        this.v0 = g7d.n;
        this.H0 = new CopyOnWriteArraySet();
        this.z0 = g7d.s;
        ag1 ag12 = g7d.m;
        this.E0 = ag12.m;
        lsa lsa = new lsa();
        lsa.a = qld;
        lsa.b = g7d.b;
        lsa.q = 0;
        lsa.c = g7d.d;
        lsa.e = g7d.e;
        lsa.f = d4c;
        lsa.g = a4c;
        lsa.h = true;
        lsa.i = true;
        lsa.d = ag1;
        lsa.j = ag1.h;
        lsa.m = ag1.i;
        lsa.s = ag1.g > 0;
        lsa.w = g7d.t;
        lsa.n = ag12.p;
        lsa.o = ag12.q;
        lsa.p = ag12.r;
        bg4 bg4 = g7d.u;
        lsa.x = new kj(bg4, (kad) bg4.o, 2);
        bg4 bg42 = g7d.u;
        lsa.y = new ni(bg42, (kad) bg42.o);
        lsa.z = 1;
        lsa.v = ag1.B.g;
        lsa.u = false;
        lsa.t = nsa.A().b;
        lsa.A = g7d.x;
        lsa.k = g7d.m.x;
        lsa.B = g7d.y;
        lsa.C = g7d.z;
        lsa.D = g7d.A;
        this.A0 = lsa;
        i();
        if (this.B0 != null) {
            this.B0.I(this.y0);
        }
    }

    public final void a(nsa nsa, SessionDescription sessionDescription) {
        if (sessionDescription.type != SessionDescription.Type.OFFER) {
            return;
        }
        if (!nsa.m1) {
            this.B0.w();
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(nsa nsa) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + nsa);
    }

    public final void c(nsa nsa) {
        if (this.B0.E()) {
            h7d h7d = this.x0;
            h7d.getClass();
            h7d.S("resendDisplayLayouts, " + h7d);
            uj4 uj4 = h7d.K0;
            List list = uj4.c;
            h7d.J0.getClass();
            h7d.I0.p(hx9.n(list));
            uj4.e = true;
            uj4.a(uj4.c);
            xn1 xn1 = h7d.y0;
            if (xn1 != null) {
                ((py0) xn1).z(h7d);
            }
        }
        if (this.B0.m1 && this.C0 != null) {
            this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.C0.type.canonicalForm() + " to just created " + nsa);
            this.B0.J(this.C0);
            this.C0 = null;
        }
        this.B0.s(this.I0);
    }

    public final void d() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topology.create.sdp", new Exception("server.topology.create.sdp"));
    }

    public final void e(String str) {
        this.Y.log("UnifiedPeerConnection", "audio-mix enabled");
        h7d h7d = this.x0;
        h7d.getClass();
        if (str != null && str.endsWith("audio-mix") && h7d.y0 != null) {
            h7d.v("audio-mix enabled");
        }
    }

    public final void f() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topolog.set.sdp", new Exception("server.topolog.set.sdp"));
    }

    public final void g(nsa nsa, String str) {
        bg1 bg1;
        h7d h7d = this.x0;
        h7d.getClass();
        h7d.S("onPeerConnectionRemoteVideoTrackAdded, " + h7d + ", client=" + nsa + ", track=" + str);
        bg1 a0 = f46.a0(str);
        fg1 z = a0 != null ? h7d.z(a0) : null;
        if (z == null || (bg1 = z.a) == null) {
            h7d.Y.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + nsa);
            return;
        }
        pg4 pg4 = h7d.E0;
        if (pg4.isEnabled()) {
            Map remoteVideoRenderers = pg4.getRemoteVideoRenderers(bg1);
            for (fp1 fp1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(fp1);
                if (list != null) {
                    nsa.p1.p(str, fp1, list);
                }
            }
        }
    }

    public final void h(nsa nsa, IceCandidate[] iceCandidateArr) {
    }

    public final void i() {
        lsa lsa = this.A0;
        lsa.l = this.F0;
        this.B0 = lsa.a();
        this.B0.Z0 = this;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            loc loc = (loc) it.next();
            k8g k8g = this.B0.B().n;
            if (loc != null) {
                ((CopyOnWriteArrayList) k8g.b).add(loc);
            } else {
                k8g.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            poc poc = (poc) it2.next();
            qp4 qp4 = this.B0.P0;
            if (qp4 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (poc != null) {
                ((CopyOnWriteArrayList) qp4.a).add(poc);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            xx0 xx0 = (xx0) it3.next();
            if (this.B0.c != null) {
                ((CopyOnWriteArrayList) this.B0.c.o).add(xx0);
            }
        }
        nsa nsa = this.B0;
        nsa.V0 = null;
        nsa.W0 = false;
        nsa.a1 = null;
        nsa.b1 = null;
        nsa.c1 = null;
        nsa.e1 = null;
        nsa.i("createPeerConnectionFactoryInternal", new csa(nsa, 2));
    }

    public final void j() {
        this.B0.Z0 = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            loc loc = (loc) it.next();
            k8g k8g = this.B0.B().n;
            if (loc != null) {
                ((CopyOnWriteArrayList) k8g.b).remove(loc);
            } else {
                k8g.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            poc poc = (poc) it2.next();
            qp4 qp4 = this.B0.P0;
            if (qp4 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (poc != null) {
                ((CopyOnWriteArrayList) qp4.a).remove(poc);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            xx0 xx0 = (xx0) it3.next();
            if (this.B0.c != null) {
                ((CopyOnWriteArrayList) this.B0.c.o).remove(xx0);
            }
        }
        this.B0.p(false);
    }

    public final void k(nsa nsa, PeerConnection.SignalingState signalingState) {
        if (signalingState == PeerConnection.SignalingState.STABLE && this.C0 != null) {
            this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.C0.type.canonicalForm() + " to " + nsa);
            this.B0.J(this.C0);
            this.C0 = null;
        }
    }

    public final void l(nsa nsa, IceCandidate iceCandidate) {
    }

    public final void m(nsa nsa, SessionDescription sessionDescription) {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        a4c a4c = this.Y;
        if (type == type2) {
            a4c.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
            try {
                rod rod = this.Z;
                HashSet hashSet = this.u0;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", (Object) sessionDescription.description);
                if (!hashSet.isEmpty()) {
                    jSONObject.put("ssrcs", (Object) new JSONArray((Collection<?>) hashSet));
                }
                rod.i(f46.b(jSONObject, "accept-producer"));
            } catch (JSONException unused) {
                a4c.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
            }
        } else {
            a4c.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
        }
    }

    public final void n(nsa nsa, PeerConnection.IceConnectionState iceConnectionState) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + nsa + " state=" + iceConnectionState);
        h7d h7d = this.x0;
        if (h7d.I()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                if (this.E0) {
                    this.H0.add(this.G0);
                    this.Z.i(f46.b((JSONObject) null, "request-realloc"));
                } else {
                    this.D0 = true;
                }
            }
            xn1 xn1 = h7d.y0;
            if (xn1 != null) {
                ((py0) xn1).A(h7d, iceConnectionState);
            }
        }
    }

    public final void p(ece ece) {
        bwc bwc = this.B0.b;
        if (bwc != null && !bwc.f) {
            bwc.h = Collections.unmodifiableSet((Set) ece.a);
            Iterator it = bwc.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!bwc.h.contains(entry.getKey())) {
                    vbg vbg = (vbg) entry.getValue();
                    if (vbg != null) {
                        vbg.a();
                    }
                    it.remove();
                }
            }
        }
    }

    public final void q(nsa nsa) {
        h7d h7d = this.x0;
        pl5 pl5 = h7d.Z;
        if (pl5 != null && !pl5.f.b && !pl5.d.b && !pl5.e.b) {
            h7d.P(new wn1(pl5));
        }
    }
}
