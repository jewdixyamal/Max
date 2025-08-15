package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: kk4  reason: default package */
public final class kk4 extends yn1 implements qod, msa, NetworkMonitor.NetworkObserver {
    public final bg4 D0;
    public final Context E0;
    public final rod F0;
    public final pg4 G0;
    public final qld H0;
    public final ExecutorService I0;
    public final HashMap J0 = new HashMap();
    public final HashMap K0 = new HashMap();
    public final HashMap L0 = new HashMap();
    public final td M0;
    public final HashMap N0 = new HashMap();
    public final HashMap O0 = new HashMap();
    public final o9g P0;
    public final vte Q0;
    public final poc R0;
    public final qoa S0;
    public final ik4 T0 = new ik4(this, 1);
    public final boolean U0;

    public kk4(jk4 jk4) {
        super(jk4.h, jk4.g, jk4.j, jk4.k, jk4.l, jk4.m, jk4.b, jk4.q, jk4.r, (yuc) null);
        S(this + " ctor");
        this.P0 = jk4.o;
        this.Q0 = jk4.t;
        this.M0 = new td(jk4.k);
        this.E0 = jk4.e;
        rod rod = jk4.i;
        this.F0 = rod;
        this.H0 = jk4.a;
        this.I0 = jk4.d;
        this.G0 = jk4.c;
        this.U0 = jk4.n;
        this.D0 = jk4.p;
        rod.k.add(this);
        this.R0 = jk4.s;
        for (fg1 fg1 : this.v0.i()) {
            this.J0.put(fg1.a, X());
        }
        uf0 uf0 = this.o.A;
        sf0 sf0 = uf0.d;
        qoa qoa = this.S0;
        qoa qoa2 = null;
        if (qoa != null) {
            qoa.f.invoke("stop reporter");
            sd7 sd7 = qoa.g;
            if (sd7 != null) {
                dm4.a(sd7);
            }
            qoa.g = null;
            qoa.h = null;
        }
        a4c a4c = this.Y;
        jy2 jy2 = new jy2(10, this);
        ga gaVar = new ga(this, 12, sf0);
        dhc dhc = uf0.b;
        if (dhc != null) {
            ey3 ey3 = new ey3(uf0, 2, a4c);
            rx0 rx0 = uf0.a;
            qoa2 = new qoa(dhc, rx0 != null ? new moa(rx0, ey3) : new oq9(14), a4c, jy2, gaVar, ey3);
        }
        this.S0 = qoa2;
        if (qoa2 != null) {
            ztc a = ce.a();
            qoa2.f.invoke("start reporter");
            sd7 sd72 = qoa2.g;
            if (sd72 != null) {
                dm4.a(sd72);
            }
            qoa2.h = a;
            r0a n = qy9.l((long) qoa2.a.b, TimeUnit.MILLISECONDS).n(a);
            ccg ccg = new ccg(qoa2, 0);
            ccg ccg2 = new ccg(qoa2, 1);
            sd7 sd73 = new sd7(new gpf(qoa2), new hgf((Object) qoa2), ft.d);
            Objects.requireNonNull(sd73, "observer is null");
            try {
                wz9 wz9 = new wz9(sd73, ccg2, 1);
                Objects.requireNonNull(wz9, "observer is null");
                n.a(new d0a(wz9, ccg, 1));
                qoa2.g = sd73;
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static bg1 W(nsa nsa, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() == nsa) {
                return (bg1) entry.getKey();
            }
        }
        return null;
    }

    public final void C(y1e y1e) {
        jb9.e();
        for (Map.Entry entry : this.K0.entrySet()) {
            nsa nsa = (nsa) entry.getValue();
            u00 u00 = new u00((Object) this, (Object) (bg1) entry.getKey(), (Object) y1e, 7);
            nsa.getClass();
            nsa.i("getStats.legacy", new adg(nsa, new gsa(nsa, 2, u00), 1));
        }
    }

    public final String D() {
        return "DirectCallTopology";
    }

    public final void E(bg1 bg1, List list, boolean z, ay0 ay0) {
        try {
            this.F0.h(f46.u(bg1, list, z), ay0);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    public final void F() {
        v("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        td tdVar = this.M0;
        tdVar.b = true;
        if (I()) {
            for (Map.Entry entry : this.K0.entrySet()) {
                fg1 z = z((bg1) entry.getKey());
                if (z != null) {
                    tdVar.b(z, (nsa) entry.getValue());
                }
            }
        }
    }

    public final void G() {
        StringBuilder sb = new StringBuilder("handleStateChanged, ");
        sb.append(this);
        sb.append(", state=");
        String B = yn1.B(1);
        sb.append(B);
        S(sb.toString());
        boolean I = I();
        rod rod = this.F0;
        if (I) {
            this.Y.log("DirectCallTopology", "enable processing signaling replies in " + B + " state");
            rod.k.add(this);
            U(this.B0);
        } else {
            V("disable processing signaling replies in " + B + " state");
            rod.k.remove(this);
        }
        a0();
    }

    public final void K(bg1 bg1, zad zad, boolean z, by0 by0) {
        try {
            this.F0.h(f46.v(bg1, zad, z), by0);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.F0.k.remove(this);
        HashMap hashMap = this.J0;
        for (nsa nsa : hashMap.values()) {
            nsa.Z0 = null;
            nsa.p(true);
        }
        HashMap hashMap2 = this.K0;
        for (nsa nsa2 : hashMap2.values()) {
            nsa2.Z0 = null;
            nsa2.p(true);
        }
        hashMap.clear();
        hashMap2.clear();
        this.L0.clear();
        ((HashMap) this.M0.c).clear();
        this.N0.clear();
        this.O0.clear();
        qoa qoa = this.S0;
        if (qoa != null) {
            qoa.f.invoke("stop reporter");
            sd7 sd7 = qoa.g;
            if (sd7 != null) {
                dm4.a(sd7);
            }
            qoa.g = null;
            qoa.h = null;
        }
        super.L();
    }

    public final void P(o1e o1e) {
        jb9.e();
        for (Map.Entry value : this.K0.entrySet()) {
            nsa nsa = (nsa) value.getValue();
            nsa.getClass();
            nsa.i("getStats.new", new adg(nsa, new oj3(3, o1e), 1));
        }
    }

    public final void Q(List list) {
        S("setIceServers, " + this);
        super.Q(list);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.t0));
        for (nsa nsa : this.K0.values()) {
            nsa.getClass();
            nsa.K0.log("PCRTCClient", "setConfig, servers=" + unmodifiableList + ", " + nsa);
            nsa.i("setConfig", new adg(nsa, new gsa(nsa, 4, unmodifiableList), 1));
        }
    }

    public final void R(fp1 fp1, List list) {
        S("setRemoteVideoRenderers, " + this + ", " + fp1);
        jb9.e();
        nsa nsa = (nsa) this.K0.get(fp1.b);
        if (nsa == null) {
            V("peer connection not found for " + fp1);
            return;
        }
        String str = (String) this.L0.get(fp1.b);
        if (TextUtils.isEmpty(str)) {
            V(this + ": video track not found for " + fp1);
            return;
        }
        nsa.p1.p(str, fp1, list);
    }

    public final void U(ssa ssa) {
        for (Map.Entry value : this.K0.entrySet()) {
            nsa nsa = (nsa) value.getValue();
            if (nsa != null) {
                nsa.I(ssa);
                return;
            }
        }
    }

    public final nsa X() {
        psa psa;
        v("> createPeerConnectionClient, " + this);
        lsa lsa = new lsa();
        lsa.a = this.H0;
        lsa.b = this.s0;
        lsa.c = this.I0;
        lsa.e = this.E0;
        lsa.q = 0;
        lsa.f = this.X;
        lsa.g = this.Y;
        ag1 ag1 = this.o;
        lsa.d = ag1;
        lsa.r = this.U0;
        lsa.w = this.P0;
        lsa.n = ag1.p;
        lsa.o = ag1.q;
        lsa.p = ag1.r;
        lsa.t = nsa.A().a;
        qsa A = nsa.A();
        boolean z = true;
        if (!A.i && ((psa = A.j) == null || !psa.a)) {
            z = false;
        }
        lsa.u = z;
        lsa.v = ag1.B.g;
        bg4 bg4 = this.D0;
        kad kad = (kad) bg4.o;
        lsa.y = new ni(bg4, kad);
        lsa.x = new kj(bg4, kad, (Integer) null);
        ((bi) bg4.c).getClass();
        lsa.z = 4;
        lsa.B = false;
        lsa.C = this.Q0;
        lsa.D = this.C0;
        nsa a = lsa.a();
        a.Z0 = this;
        a.V0 = null;
        a.W0 = false;
        a.a1 = null;
        a.b1 = null;
        a.c1 = null;
        a.e1 = null;
        a.i("createPeerConnectionFactoryInternal", new csa(a, 2));
        v("< createPeerConnectionClient, " + this);
        return a;
    }

    public final void Y(fg1 fg1) {
        S("maybeProcessRemoteAnswers, for " + fg1);
        if (!fg1.b()) {
            V(fg1 + " still not accepted call");
            return;
        }
        cbg cbg = (cbg) this.O0.get(fg1.a);
        if (cbg != null && cbg.e) {
            HashMap hashMap = cbg.a;
            SessionDescription sessionDescription = (SessionDescription) hashMap.get(fg1.j);
            if (sessionDescription != null) {
                StringBuilder sb = new StringBuilder("Found answer for ");
                sb.append(fg1);
                sb.append(", peerid=");
                this.Y.log("DirectCallTopology", zr6.l(sb, (String) fg1.j.a, ", apply it"));
                cbg.c = sessionDescription;
                hashMap.clear();
                ((nsa) this.K0.get(fg1.a)).J(sessionDescription);
            }
        }
    }

    public final void Z(nsa nsa, PeerConnection.IceConnectionState iceConnectionState) {
        S("maybeRestart, " + this);
        if (!I()) {
            V(this + ": is not active yet");
        } else if (!NetworkMonitor.isOnline()) {
            V("No net connectivity");
        } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            v(nsa + " has " + iceConnectionState + " state");
            if (!nsa.E() || !nsa.m1) {
                V(nsa + " not ready or not stable");
                return;
            }
            cbg cbg = (cbg) this.O0.get(W(nsa, this.K0));
            if (cbg != null && !cbg.d) {
                V("Ice failed, restart " + nsa);
                cbg.d = true;
                cbg.e = false;
                cbg.c = null;
                cbg.a.clear();
                nsa.x(true);
            }
        }
    }

    public final void a(nsa nsa, SessionDescription sessionDescription) {
        S("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + nsa);
        bg1 W = W(nsa, this.K0);
        if (sessionDescription.type == SessionDescription.Type.OFFER && this.N0.get(W) != null) {
            nsa.w();
        }
    }

    public final void a0() {
        S("maybeCreateConnection, " + this);
        if (!I()) {
            this.Y.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.t0));
        for (nsa nsa : this.J0.values()) {
            if (!nsa.E() && !nsa.j1) {
                nsa.y(unmodifiableList);
            }
        }
        c0();
        b0();
    }

    public final void b(nsa nsa) {
        S("onPeerConnectionRenegotiationNeeded, " + this + ", " + nsa);
    }

    public final void b0() {
        nsa nsa;
        S("maybeProcessSelfAnswers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.N0.entrySet()) {
            bg1 bg1 = (bg1) entry.getKey();
            cbg cbg = (cbg) entry.getValue();
            if (cbg.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + bg1);
            } else if (!cbg.d && !cbg.e && (nsa = (nsa) this.K0.get(bg1)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + bg1);
                cbg.d = true;
                nsa.J(cbg.b);
            }
        }
    }

    public final void c(nsa nsa) {
        xn1 xn1;
        S("onPeerConnectionCreated, " + this + ", " + nsa);
        HashMap hashMap = this.J0;
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == nsa) {
                hashMap.remove(entry.getKey());
                if (this.B0 != null) {
                    ((nsa) entry.getValue()).I(this.B0);
                }
                this.K0.put((bg1) entry.getKey(), (nsa) entry.getValue());
            }
        }
        a0();
        if (hashMap.size() == 0 && (xn1 = this.y0) != null) {
            ((py0) xn1).z(this);
        }
    }

    public final void c0() {
        nsa nsa;
        S("maybeProcessSelfOffers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.O0.entrySet()) {
            bg1 bg1 = (bg1) entry.getKey();
            cbg cbg = (cbg) entry.getValue();
            if (!cbg.d && !cbg.e && (nsa = (nsa) this.K0.get(bg1)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + bg1);
                cbg.d = true;
                cbg.a.clear();
                cbg.c = null;
                nsa.x(false);
            }
        }
    }

    public final void d() {
        this.Y.logException("DirectCallTopology", "direct.topology.create.sdp.failed", new Exception("direct.topology.create.sdp.failed"));
    }

    public final void e(String str) {
    }

    public final void f() {
        this.Y.logException("DirectCallTopology", "direct.topology.set.sdp.failed", new Exception("direct.topology.set.sdp.failed"));
    }

    public final void g(nsa nsa, String str) {
        bg1 bg1;
        S("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + nsa);
        fg1 z = z(W(nsa, this.K0));
        if (z == null || (bg1 = z.a) == null) {
            V(this + ": participant not found for " + jb9.c(nsa));
            return;
        }
        this.L0.put(bg1, str);
        bg1 bg12 = z.a;
        pg4 pg4 = this.G0;
        if (pg4.isEnabled()) {
            Map remoteVideoRenderers = pg4.getRemoteVideoRenderers(bg12);
            for (fp1 fp1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(fp1);
                if (list != null) {
                    nsa.p1.p(str, fp1, list);
                }
            }
        }
    }

    public final void h(nsa nsa, IceCandidate[] iceCandidateArr) {
        S("onPeerConnectionIceCandidatesRemoved, " + this + ", " + nsa);
        bg1 W = W(nsa, this.K0);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(W);
        S(sb.toString());
        try {
            this.F0.i(f46.x(W, iceCandidateArr));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(org.json.JSONObject r15) {
        /*
            r14 = this;
            java.lang.String r0 = "notification"
            java.lang.String r0 = r15.getString(r0)
            r0.getClass()
            java.lang.String r1 = "custom-data"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "type"
            r3 = 0
            java.lang.String r4 = "data"
            java.lang.String r5 = "DirectCallTopology"
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = "transmitted-data"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0273
        L_0x0022:
            bg1 r0 = defpackage.f46.E(r15)
            fg1 r1 = r14.z(r0)
            if (r1 != 0) goto L_0x003c
            a4c r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "td.unknown.participant.in.p2p"
            r15.<init>(r0)
            java.lang.String r0 = "transmitted.data.npe"
            r14.reportException(r5, r0, r15)
            goto L_0x0273
        L_0x003c:
            org.json.JSONObject r6 = r15.getJSONObject(r4)
            java.lang.String r7 = "sdp"
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            r8 = 0
            if (r6 == 0) goto L_0x005b
            org.webrtc.SessionDescription r9 = new org.webrtc.SessionDescription
            java.lang.String r2 = r6.getString(r2)
            org.webrtc.SessionDescription$Type r2 = org.webrtc.SessionDescription.Type.fromCanonicalForm(r2)
            java.lang.String r6 = r6.getString(r7)
            r9.<init>(r2, r6)
            goto L_0x005c
        L_0x005b:
            r9 = r8
        L_0x005c:
            if (r9 == 0) goto L_0x00f8
            org.webrtc.SessionDescription$Type r2 = r9.type
            org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.ANSWER
            if (r2 != r3) goto L_0x0273
            java.util.HashMap r2 = r14.O0
            java.lang.Object r2 = r2.get(r0)
            cbg r2 = (defpackage.cbg) r2
            if (r2 != 0) goto L_0x0094
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "no.scheduled.offer.found"
            r15.<init>(r1)
            java.util.HashMap r1 = r14.N0
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = ".but.answer.found"
            r15.append(r0)
        L_0x0082:
            a4c r14 = r14.Y
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            java.lang.String r15 = "answer.invariant"
            r14.logException(r5, r15, r0)
            goto L_0x0273
        L_0x0094:
            boolean r0 = r2.e
            if (r0 != 0) goto L_0x00a8
            a4c r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "offer.is.not.ready.yet"
            r15.<init>(r0)
            java.lang.String r0 = "direct.topology.no.offer.for.answer"
            r14.logException(r5, r0, r15)
            goto L_0x0273
        L_0x00a8:
            org.webrtc.SessionDescription r0 = r2.c
            if (r0 != 0) goto L_0x00e3
            kpa r0 = defpackage.f46.q(r15)
            if (r0 == 0) goto L_0x00bc
            java.util.HashMap r15 = r2.a
            r15.put(r0, r9)
            r14.Y(r1)
            goto L_0x0273
        L_0x00bc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sdp="
            r0.<init>(r1)
            java.lang.String r15 = r15.toString()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            a4c r0 = r14.Y
            r0.log(r5, r15)
            a4c r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "bad.sdp.answer.from.participant"
            r15.<init>(r0)
            java.lang.String r0 = "direct.topology.bad.sdp"
            r14.logException(r5, r0, r15)
            goto L_0x0273
        L_0x00e3:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Answer was already applied from "
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            a4c r14 = r14.Y
            r14.log(r5, r15)
            goto L_0x0273
        L_0x00f8:
            td r2 = r14.M0
            java.util.HashMap r14 = r14.K0
            java.lang.Object r14 = r14.get(r0)
            nsa r14 = (defpackage.nsa) r14
            java.lang.Object r0 = r2.o
            a4c r0 = (defpackage.a4c) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "handleTransmittedData, "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "IceCandidatesHandler"
            r0.log(r6, r5)
            kpa r0 = defpackage.f46.q(r15)
            if (r0 != 0) goto L_0x0136
            java.lang.Object r14 = r2.o
            a4c r14 = (defpackage.a4c) r14
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "No peer specified for "
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r14.log(r6, r15)
            goto L_0x0273
        L_0x0136:
            org.json.JSONObject r15 = r15.getJSONObject(r4)
            java.lang.String r4 = "candidate"
            org.json.JSONObject r5 = r15.optJSONObject(r4)
            java.lang.String r6 = "sdpMLineIndex"
            java.lang.String r7 = "sdpMid"
            if (r5 == 0) goto L_0x0158
            org.webrtc.IceCandidate r9 = new org.webrtc.IceCandidate
            java.lang.String r10 = r5.getString(r7)
            int r11 = r5.getInt(r6)
            java.lang.String r5 = r5.getString(r4)
            r9.<init>(r10, r11, r5)
            goto L_0x0159
        L_0x0158:
            r9 = r8
        L_0x0159:
            java.lang.String r5 = "candidates-removed"
            org.json.JSONArray r15 = r15.optJSONArray(r5)
            if (r15 != 0) goto L_0x0162
            goto L_0x0191
        L_0x0162:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = r15.length()
            r5.<init>(r10)
        L_0x016b:
            int r10 = r15.length()
            if (r3 >= r10) goto L_0x0190
            org.json.JSONObject r10 = r15.getJSONObject(r3)
            if (r10 == 0) goto L_0x0189
            org.webrtc.IceCandidate r11 = new org.webrtc.IceCandidate
            java.lang.String r12 = r10.getString(r7)
            int r13 = r10.getInt(r6)
            java.lang.String r10 = r10.getString(r4)
            r11.<init>(r12, r13, r10)
            goto L_0x018a
        L_0x0189:
            r11 = r8
        L_0x018a:
            r5.add(r11)
            int r3 = r3 + 1
            goto L_0x016b
        L_0x0190:
            r8 = r5
        L_0x0191:
            if (r9 != 0) goto L_0x0197
            if (r8 != 0) goto L_0x0197
            goto L_0x0273
        L_0x0197:
            java.lang.Object r15 = r2.c
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r15 = r15.get(r1)
            java.util.Map r15 = (java.util.Map) r15
            if (r15 != 0) goto L_0x01af
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.Object r3 = r2.c
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r1, r15)
        L_0x01af:
            java.lang.Object r3 = r15.get(r0)
            kpa r3 = (defpackage.kpa) r3
            if (r3 != 0) goto L_0x01c9
            kpa r3 = new kpa
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.<init>(r4, r5)
            r15.put(r0, r3)
        L_0x01c9:
            if (r9 == 0) goto L_0x01d2
            java.lang.Object r15 = r3.a
            java.util.List r15 = (java.util.List) r15
            r15.add(r9)
        L_0x01d2:
            if (r8 == 0) goto L_0x01db
            java.lang.Object r15 = r3.b
            java.util.List r15 = (java.util.List) r15
            r15.addAll(r8)
        L_0x01db:
            r2.b(r1, r14)
            goto L_0x0273
        L_0x01e0:
            ag1 r0 = r14.o
            uf0 r0 = r0.A
            sf0 r1 = r0.d
            tf0 r0 = r0.c
            boolean r0 = r0.a
            qoa r6 = r14.S0
            if (r0 == 0) goto L_0x0247
            if (r6 == 0) goto L_0x0247
            org.json.JSONObject r15 = r15.optJSONObject(r4)
            if (r15 == 0) goto L_0x0244
            java.lang.String r0 = "sdk"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            if (r15 == 0) goto L_0x0241
            java.lang.String r0 = r15.optString(r2)
            java.lang.String r2 = "bad-net"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = "bitrate"
            double r2 = r15.optDouble(r0)
            m56 r0 = r6.f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "submit bitrate: "
            r4.<init>(r7)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.invoke(r4)
            ztc r0 = r6.h
            if (r0 == 0) goto L_0x022f
            noa r4 = new noa
            r4.<init>(r6, r2)
            r0.b(r4)
        L_0x022f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "received bad-net: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            goto L_0x0260
        L_0x023e:
            java.lang.String r15 = "type != bad-net"
            goto L_0x0260
        L_0x0241:
            java.lang.String r15 = "no sdk"
            goto L_0x0260
        L_0x0244:
            java.lang.String r15 = "no data"
            goto L_0x0260
        L_0x0247:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "enabled && reporter != null = "
            r15.<init>(r2)
            r15.append(r0)
            java.lang.String r0 = " && "
            r15.append(r0)
            if (r6 == 0) goto L_0x0259
            r3 = 1
        L_0x0259:
            r15.append(r3)
            java.lang.String r15 = r15.toString()
        L_0x0260:
            a4c r14 = r14.Y
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "handleCustomDataNotification: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r1.b(r14, r5, r15)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk4.j(org.json.JSONObject):void");
    }

    public final void k(nsa nsa, PeerConnection.SignalingState signalingState) {
        S("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + nsa);
        if (signalingState == PeerConnection.SignalingState.STABLE) {
            Z(nsa, nsa.C());
        }
        fg1 z = z(W(nsa, this.K0));
        if (z != null) {
            this.M0.b(z, nsa);
        }
    }

    public final void l(nsa nsa, IceCandidate iceCandidate) {
        S("onPeerConnectionIceCandidate, " + this + ", " + nsa);
        bg1 W = W(nsa, this.K0);
        S("sendIceCandidateRequest, participant=" + W + ", candidate=" + iceCandidate);
        try {
            this.F0.i(f46.w(W, iceCandidate));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    public final void m(nsa nsa, SessionDescription sessionDescription) {
        xn1 xn1;
        S("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + nsa);
        bg1 W = W(nsa, this.K0);
        fg1 z = z(W);
        if (z == null) {
            this.Y.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            cbg cbg = (cbg) this.O0.get(W);
            if (cbg != null) {
                cbg.d = false;
                cbg.e = true;
            } else {
                throw new IllegalStateException();
            }
        } else {
            cbg cbg2 = (cbg) this.N0.get(W);
            if (cbg2 != null) {
                cbg2.d = false;
                cbg2.e = true;
            } else {
                throw new IllegalStateException();
            }
        }
        S("sendOfferAnswerRequest, participant=" + W + ", sdp type=" + sessionDescription.type.canonicalForm());
        try {
            this.F0.i(f46.b(f46.l(W, sessionDescription), "transmit-data"));
            if (sessionDescription.type == type2 && (xn1 = this.y0) != null) {
                ((py0) xn1).V0.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + z + ", sdp=" + sessionDescription.type);
            }
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    public final void n(nsa nsa, PeerConnection.IceConnectionState iceConnectionState) {
        Runnable runnable;
        S("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + nsa);
        Z(nsa, iceConnectionState);
        xn1 xn1 = this.y0;
        if (xn1 != null) {
            ((py0) xn1).A(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED && (runnable = this.c) != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public final void o(nsa nsa, long j) {
        bg1 W = W(nsa, this.J0);
        if (W == null) {
            W = W(nsa, this.K0);
        }
        if (W != null) {
            fg1 z = z(W);
            xn1 xn1 = this.y0;
            if (xn1 != null && z != null) {
                ((py0) xn1).W1.b.onCallParticipantFingerprint(z, j);
            }
        }
    }

    public final void onActiveParticipantUpdated(yy0 yy0) {
        onActiveParticipantsRemoved(new xy0(yy0.a, Collections.emptyList()));
        Collection collection = yy0.b;
        onActiveParticipantsAdded(new uy0(collection, collection));
    }

    public final void onActiveParticipantsAdded(uy0 uy0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<fg1> collection = uy0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1 : collection) {
            HashMap hashMap = this.J0;
            if (hashMap.get(fg1.a) == null && this.K0.get(fg1.a) == null) {
                hashMap.put(fg1.a, X());
            } else {
                throw new IllegalStateException("Peer connection is already created for " + fg1);
            }
        }
        a0();
    }

    public final void onActiveParticipantsChanged(vy0 vy0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        Collection<fg1> collection = vy0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1 : collection) {
            nsa nsa = (nsa) this.K0.get(fg1.a);
            if (nsa != null) {
                Y(fg1);
                this.M0.b(fg1, nsa);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(wy0 wy0) {
    }

    public final void onActiveParticipantsRemoved(xy0 xy0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<fg1> collection = xy0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1 : collection) {
            nsa nsa = (nsa) this.J0.remove(fg1.a);
            if (nsa == null) {
                nsa = (nsa) this.K0.remove(fg1.a);
            }
            if (nsa != null) {
                nsa.Z0 = null;
                nsa.p(true);
            }
            this.L0.remove(fg1.a);
            this.N0.remove(fg1.a);
            this.O0.remove(fg1.a);
            ((HashMap) this.M0.c).remove(fg1);
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        this.a.post(new ik4(this, 0));
    }

    public final void q(nsa nsa) {
        pl5 pl5 = this.Z;
        if (pl5 != null && !pl5.f.b && !pl5.d.b && !pl5.e.b) {
            P(new wn1(pl5));
        }
    }

    public final void s() {
        S("clearRemoteVideoRenderers");
        jb9.e();
        for (nsa nsa : this.K0.values()) {
            nsa.p1.d();
        }
    }

    public final void t(bg1 bg1, SessionDescription sessionDescription) {
        v("createAnswerFor, " + this + ", participant=" + bg1 + ", " + sessionDescription.type);
        jb9.e();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            fg1 z = z(bg1);
            if (z != null) {
                HashMap hashMap = this.O0;
                cbg cbg = (cbg) hashMap.get(bg1);
                a4c a4c = this.Y;
                if (cbg != null) {
                    if (cbg.e) {
                        a4c.log("DirectCallTopology", "Opponent " + bg1 + " is requesting for renegotiation, let us accept the request, ");
                        hashMap.remove(bg1);
                    } else {
                        a4c.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + z);
                        return;
                    }
                }
                HashMap hashMap2 = this.N0;
                cbg cbg2 = (cbg) hashMap2.get(bg1);
                if (cbg2 != null) {
                    SessionDescription sessionDescription2 = cbg2.b;
                    if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                        a4c.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                        return;
                    } else if (!cbg2.d) {
                        V(this + ": re-schedule answer creation for " + z);
                        hashMap2.remove(bg1);
                    } else {
                        a4c.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                        return;
                    }
                }
                hashMap2.put(bg1, new cbg(sessionDescription));
                b0();
                return;
            }
            throw new IllegalStateException("Participant(" + bg1 + ") not found");
        }
        throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
    }

    public final void u(fg1 fg1, boolean z) {
        S("createOfferFor, " + this + ", " + fg1);
        jb9.e();
        if (this.v0.k(fg1)) {
            HashMap hashMap = this.O0;
            cbg cbg = (cbg) hashMap.get(fg1.a);
            if (cbg == null) {
                hashMap.put(fg1.a, new cbg((SessionDescription) null));
            } else if (cbg.d) {
                this.Y.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
            } else if (z) {
                V(this + ": re-schedule offer creation for " + fg1);
                cbg.e = false;
            } else {
                V(this + ": offer already created for " + fg1);
            }
            c0();
            return;
        }
        throw new IllegalStateException("Participant not found");
    }

    public final Runnable w() {
        return this.T0;
    }

    public final long x() {
        jb9.e();
        Iterator it = this.K0.values().iterator();
        if (it.hasNext()) {
            return ((nsa) it.next()).U0;
        }
        return -1;
    }

    public final xxe y() {
        return xxe.b;
    }
}
