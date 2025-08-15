package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.SessionDescription;

/* renamed from: h7d  reason: default package */
public final class h7d extends yn1 implements qod, NetworkMonitor.NetworkObserver {
    public final i7b D0;
    public final pg4 E0;
    public final rod F0;
    public long G0;
    public long H0;
    public final d5f I0;
    public final hx9 J0 = new Object();
    public final uj4 K0;

    /* JADX WARNING: type inference failed for: r0v5, types: [hx9, java.lang.Object] */
    public h7d(g7d g7d) {
        super(g7d.h, g7d.g, g7d.m, g7d.o, g7d.p, g7d.q, g7d.b, g7d.v, g7d.w, g7d.A);
        S(this + " ctor");
        rod rod = g7d.i;
        this.F0 = rod;
        this.E0 = g7d.c;
        this.D0 = g7d.r;
        rod.k.add(this);
        d5f d5f = new d5f(g7d, this);
        this.I0 = d5f;
        this.K0 = new uj4(g7d.o, d5f);
        NetworkMonitor.getInstance().addObserver(this);
    }

    public final Map A() {
        int i;
        bwc bwc = this.I0.B0.b;
        if (bwc == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = bwc.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            vbg vbg = (vbg) entry.getValue();
            if (vbg != null) {
                t54 t54 = vbg.g;
                long j = (long) vbg.l.get();
                long j2 = (long) vbg.m.get();
                long j3 = (long) vbg.n.get();
                long j4 = (long) vbg.o.get();
                Iterator it2 = it;
                HashMap hashMap2 = hashMap;
                long j5 = (long) vbg.p.get();
                long j6 = (long) vbg.q.get();
                long j7 = (long) vbg.r.get();
                long j8 = (long) vbg.s.get();
                long j9 = (long) vbg.t.get();
                long j10 = (long) vbg.y.get();
                long j11 = (long) vbg.z.get();
                cue cue = vbg.u;
                Map.Entry entry2 = entry;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j12 = j11;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                double convert = (double) timeUnit.convert((long) cue.b.b, timeUnit2);
                double convert2 = (double) timeUnit.convert((long) vbg.v.b.b, timeUnit2);
                double convert3 = (double) timeUnit.convert((long) vbg.w.b.b, timeUnit2);
                double convert4 = (double) timeUnit.convert((long) vbg.x.b.b, timeUnit2);
                if (t54 == null || (i = t54.Y) == 1 || i == 2) {
                    if (t54 != null) {
                        t54.x0.get();
                    }
                    if (t54 != null) {
                        t54.y0.get();
                    }
                    cwc cwc = r5;
                    cwc cwc2 = new cwc(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j12, convert, convert2, convert3, convert4, (r36) vbg.A.o);
                    hashMap = hashMap2;
                    hashMap.put((bg1) entry2.getKey(), cwc);
                    it = it2;
                } else {
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public final void C(y1e y1e) {
        ypc ypc = new ypc(this, 4, y1e);
        d5f d5f = this.I0;
        if (d5f.B0 != null) {
            nsa nsa = d5f.B0;
            nsa.getClass();
            nsa.i("getStats.legacy", new adg(nsa, new gsa(nsa, 2, ypc), 1));
        }
    }

    public final String D() {
        return "ServerCallTopology";
    }

    public final void E(bg1 bg1, List list, boolean z, ay0 ay0) {
        try {
            this.F0.h(f46.u(bg1, list, z), ay0);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f8 A[Catch:{ JSONException -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb A[Catch:{ JSONException -> 0x0117 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G() {
        /*
            r24 = this;
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleStateChanged, "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ", state = "
            r1.append(r2)
            r2 = 1
            java.lang.String r3 = defpackage.yn1.B(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.S(r1)
            boolean r1 = r24.I()
            java.lang.String r4 = " state"
            if (r1 == 0) goto L_0x015c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "enable processing signaling replies in "
            r1.<init>(r5)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            rod r1 = r0.F0
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.k
            r1.add(r0)
            d4c r1 = r0.X
            e0e r3 = defpackage.e0e.app_event
            java.lang.String r4 = "rtc.disable.hw.vpx"
            r5 = 0
            r1.log((defpackage.e0e) r3, (java.lang.String) r4, (java.lang.String) r5)
            d5f r1 = r0.I0
            boolean r0 = r24.I()
            if (r0 == 0) goto L_0x0158
            boolean r0 = r1.z0
            r3 = 0
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "request-realloc"
            ka6 r0 = defpackage.f46.b(r5, r0)
            rod r2 = r1.Z
            r2.i(r0)
            goto L_0x0121
        L_0x0067:
            java.lang.String r0 = "estimatedPerformanceIndex"
            i7b r4 = r1.s0
            java.lang.String r6 = "PeerConnectionWrapperBase"
            a4c r7 = r1.Y
            ag1 r8 = r1.a
            java.lang.String r9 = "video tracks count enabled: "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "sendRequestAllocConsumer,"
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = ", sdp=null"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            a4c r11 = r1.Y
            java.lang.String r12 = "UnifiedPeerConnection"
            r11.log(r12, r10)
            re6 r10 = r1.v0     // Catch:{ JSONException -> 0x0117 }
            java.lang.Object r10 = r10.b     // Catch:{ JSONException -> 0x0117 }
            khe r10 = (defpackage.khe) r10     // Catch:{ JSONException -> 0x0117 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ JSONException -> 0x0117 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ JSONException -> 0x0117 }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x0117 }
            int r10 = r8.g     // Catch:{ JSONException -> 0x0117 }
            if (r10 <= 0) goto L_0x00a3
            r12 = r2
            goto L_0x00a4
        L_0x00a3:
            r12 = r3
        L_0x00a4:
            if (r12 == 0) goto L_0x00b8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0117 }
            r12.<init>(r9)     // Catch:{ JSONException -> 0x0117 }
            r12.append(r10)     // Catch:{ JSONException -> 0x0117 }
            java.lang.String r9 = r12.toString()     // Catch:{ JSONException -> 0x0117 }
            r7.log(r6, r9)     // Catch:{ JSONException -> 0x0117 }
            r20 = r10
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r9 = "video tracks count disabled"
            r7.log(r6, r9)     // Catch:{ JSONException -> 0x0117 }
            r20 = r3
        L_0x00bf:
            rod r9 = r1.Z     // Catch:{ JSONException -> 0x0117 }
            android.content.SharedPreferences r10 = r4.a     // Catch:{ JSONException -> 0x0117 }
            boolean r10 = r10.contains(r0)     // Catch:{ JSONException -> 0x0117 }
            if (r10 == 0) goto L_0x00d3
            android.content.SharedPreferences r4 = r4.a     // Catch:{ JSONException -> 0x0117 }
            int r0 = r4.getInt(r0, r3)     // Catch:{ JSONException -> 0x0117 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0117 }
        L_0x00d3:
            r12 = r5
            uf0 r0 = r8.A     // Catch:{ JSONException -> 0x0117 }
            tf0 r0 = r0.c     // Catch:{ JSONException -> 0x0117 }
            boolean r0 = r0.b     // Catch:{ JSONException -> 0x0117 }
            if (r0 == 0) goto L_0x00df
            r0 = 3
        L_0x00dd:
            r13 = r0
            goto L_0x00e6
        L_0x00df:
            int r0 = r8.g     // Catch:{ JSONException -> 0x0117 }
            if (r0 <= 0) goto L_0x00e5
            r0 = 2
            goto L_0x00dd
        L_0x00e5:
            r13 = r2
        L_0x00e6:
            boolean r14 = r8.e     // Catch:{ JSONException -> 0x0117 }
            boolean r15 = r8.f     // Catch:{ JSONException -> 0x0117 }
            boolean r0 = r8.h     // Catch:{ JSONException -> 0x0117 }
            boolean r4 = r8.i     // Catch:{ JSONException -> 0x0117 }
            qsa r5 = defpackage.nsa.A()     // Catch:{ JSONException -> 0x0117 }
            boolean r5 = r5.b     // Catch:{ JSONException -> 0x0117 }
            bg4 r10 = r1.w0     // Catch:{ JSONException -> 0x0117 }
            if (r10 == 0) goto L_0x00fb
            r19 = r2
            goto L_0x00fd
        L_0x00fb:
            r19 = r3
        L_0x00fd:
            boolean r2 = r8.x     // Catch:{ JSONException -> 0x0117 }
            boolean r10 = r8.u     // Catch:{ JSONException -> 0x0117 }
            boolean r8 = r8.v     // Catch:{ JSONException -> 0x0117 }
            r16 = r0
            r17 = r4
            r18 = r5
            r21 = r2
            r22 = r10
            r23 = r8
            ka6 r0 = defpackage.f46.t(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0117 }
            r9.i(r0)     // Catch:{ JSONException -> 0x0117 }
            goto L_0x0121
        L_0x0117:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = "server.topology.send.alloc.consumer"
            r0.<init>(r2)
            r7.reportException(r6, r2, r0)
        L_0x0121:
            nsa r0 = r1.B0
            boolean r0 = r0.E()
            if (r0 != 0) goto L_0x0177
            qld r0 = r1.t0
            iy9 r0 = r0.e
            r0.c = r3
            nsa r0 = r1.B0
            boolean r0 = r0.E()
            if (r0 != 0) goto L_0x0177
            nsa r0 = r1.B0
            ag1 r2 = r1.a
            boolean r2 = r2.d
            if (r2 == 0) goto L_0x0150
            h7d r1 = r1.x0
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r1 = r1.t0
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L_0x0154
        L_0x0150:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0154:
            r0.y(r1)
            goto L_0x0177
        L_0x0158:
            r1.getClass()
            goto L_0x0177
        L_0x015c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "disable processing signaling replies in "
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.V(r1)
            rod r1 = r0.F0
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.k
            r1.remove(r0)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7d.G():void");
    }

    public final void K(bg1 bg1, zad zad, boolean z, by0 by0) {
        try {
            this.F0.h(f46.v(bg1, zad, z), by0);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.F0.k.remove(this);
        d5f d5f = this.I0;
        d5f.j();
        d5f.B0.p(true);
        super.L();
    }

    public final void M(long j, long j2) {
        chc chc = new chc(j, j2);
        sf0 sf0 = this.o.A.d;
        a4c a4c = this.Y;
        sf0.b(a4c, "ServerCallTopology", "send report-network-stat: " + chc);
        this.I0.B0.B().d(new ioc(new ioc((hoc) chc)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: hxd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(defpackage.c4c r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.c
            java.util.ArrayList r0 = defpackage.j1e.v(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0071
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            hxd r2 = (defpackage.hxd) r2
            cz1 r8 = r8.c()
            if (r8 == 0) goto L_0x002a
            java.util.ArrayList r8 = defpackage.j1e.J(r0, r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.lang.Object r8 = r8.get(r1)
            r2 = r8
            hxd r2 = (defpackage.hxd) r2
        L_0x002a:
            ag1 r8 = r7.o
            r8.getClass()
            long r0 = r2.o
            long r3 = r7.G0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x003f
            long r3 = r2.p
            long r5 = r7.H0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0071
        L_0x003f:
            long r2 = r2.p
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0071
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0071
            r7.G0 = r0
            r7.H0 = r2
            ehc r8 = new ehc
            r8.<init>(r2, r0)
            d5f r0 = r7.I0
            nsa r0 = r0.B0
            koc r0 = r0.B()
            bqc r1 = new bqc
            r2 = 6
            r1.<init>(r2, r7)
            ioc r7 = new ioc
            r7.<init>((defpackage.hoc) r8)
            r7.c = r1
            ioc r8 = new ioc
            r8.<init>((defpackage.ioc) r7)
            r0.d(r8)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7d.N(c4c):void");
    }

    public final void O(boolean z) {
        this.I0.B0.B().d(new ioc(new ioc((hoc) new nhc(z))));
        d5f d5f = this.I0;
        d5f.F0 = z;
        d5f.B0.u0 = d5f.F0;
    }

    public final void P(o1e o1e) {
        d5f d5f = this.I0;
        if (d5f.B0 != null) {
            nsa nsa = d5f.B0;
            nsa.getClass();
            nsa.i("getStats.new", new adg(nsa, new oj3(3, o1e), 1));
        }
    }

    public final void R(fp1 fp1, List list) {
        d5f d5f = this.I0;
        if (d5f.B0.E()) {
            bg1 bg1 = fp1.b;
            d5f.B0.p1.p("video-" + bg1.c(), fp1, list);
        }
    }

    public final void T(List list) {
        S("updateDisplayLayouts, " + this);
        this.K0.a(list);
        this.J0.getClass();
        this.I0.p(hx9.n(list));
    }

    public final void U(ssa ssa) {
        d5f d5f = this.I0;
        d5f.y0 = ssa;
        if (d5f.B0 != null) {
            d5f.B0.I(d5f.y0);
        }
    }

    public final void W() {
        this.I0.i();
    }

    public final void i(ji9 ji9) {
        d5f d5f = this.I0;
        d5f.B0.s(ji9);
        d5f.I0 = ji9;
    }

    public final void j(JSONObject jSONObject) {
        String str;
        List list;
        String string = jSONObject.getString("notification");
        if ("producer-updated".equals(string)) {
            d5f d5f = this.I0;
            d5f.getClass();
            d5f.Y.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + d5f + " " + jSONObject);
            String string2 = jSONObject.getString("sessionId");
            if (!d5f.E0 || !d5f.H0.contains(string2)) {
                String string3 = jSONObject.getString("description");
                SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
                Matcher matcher = d5f.J0.matcher(string3);
                HashSet hashSet = d5f.u0;
                hashSet.clear();
                while (matcher.find()) {
                    hashSet.add(matcher.group(1));
                }
                if (!d5f.E0 || (str = d5f.G0) == null || str.equals(string2)) {
                    if (d5f.B0.m1 && d5f.C0 != null) {
                        d5f.Y.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                        d5f.C0 = null;
                    }
                    if (d5f.B0.m1) {
                        d5f.Y.log("UnifiedPeerConnection", "set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + d5f.B0);
                        d5f.B0.J(sessionDescription);
                    } else {
                        d5f.Y.log("UnifiedPeerConnection", d5f.B0 + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                        d5f.C0 = sessionDescription;
                    }
                } else {
                    d5f.H0.add(d5f.G0);
                    d5f.Y.log("UnifiedPeerConnection", d5f.B0 + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    d5f.C0 = sessionDescription;
                    d5f.j();
                    d5f.i();
                    if (d5f.B0 != null) {
                        d5f.B0.I(d5f.y0);
                    }
                    d5f.t0.e.c = false;
                    if (!d5f.B0.E()) {
                        nsa nsa = d5f.B0;
                        if (d5f.a.d) {
                            h7d h7d = d5f.x0;
                            h7d.getClass();
                            list = Collections.unmodifiableList(new ArrayList(h7d.t0));
                        } else {
                            list = Collections.emptyList();
                        }
                        nsa.y(list);
                    }
                }
                d5f.G0 = string2;
            } else {
                d5f.Y.log("UnifiedPeerConnection", wg0.i("producer-updated contains expired sessionId: ", string2));
            }
            S("resendDisplayLayouts, " + this);
            List list2 = this.K0.c;
            this.J0.getClass();
            this.I0.p(hx9.n(list2));
            uj4 uj4 = this.K0;
            uj4.e = true;
            uj4.a(uj4.c);
        } else if ("consumer-answered".equals(string)) {
            this.I0.getClass();
        }
    }

    public final void onActiveParticipantUpdated(yy0 yy0) {
        onActiveParticipantsRemoved(new xy0(yy0.a, Collections.emptyList()));
    }

    public final void onActiveParticipantsAdded(uy0 uy0) {
    }

    public final void onActiveParticipantsChanged(vy0 vy0) {
    }

    public final void onActiveParticipantsDeAnonimized(wy0 wy0) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [l7d, java.lang.Object] */
    public final void onActiveParticipantsRemoved(xy0 xy0) {
        S("onCallParticipantsRemoved, " + xy0.a.size());
        for (fg1 fg1 : xy0.a) {
            bg1 bg1 = fg1.a;
            if (bg1 != null) {
                d5f d5f = this.I0;
                if (d5f.B0.E()) {
                    d5f.B0.p1.e(bg1, "video-" + bg1.c());
                }
            }
            bg1 bg12 = fg1.a;
            if (bg12 != null) {
                uj4 uj4 = this.K0;
                Set<fp1> set = (Set) uj4.d.get(bg12);
                if (set == null) {
                    set = new HashSet<>();
                }
                adb adb = new adb(3);
                adb.a = bg12;
                adb.b = olf.a;
                set.add(adb.c());
                adb adb2 = new adb(3);
                adb2.a = bg12;
                adb2.b = olf.b;
                set.add(adb2.c());
                ? obj = new Object();
                obj.a = true;
                ArrayList arrayList = new ArrayList();
                for (fp1 m7d : set) {
                    arrayList.add(new m7d(m7d, obj));
                }
                d6f d6f = new d6f(arrayList, false);
                koc B = ((d5f) uj4.b).B0.B();
                tj4 tj4 = new tj4(uj4, 2);
                tj4 tj42 = new tj4(uj4, 3);
                ioc ioc = new ioc((hoc) d6f);
                ioc.c = tj4;
                ioc.d = tj42;
                B.d(new ioc(ioc));
            }
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (NetworkMonitor.isOnline()) {
            this.a.post(new f7d(this, 0));
        }
    }

    public final void r(y8 y8Var) {
        d5f d5f = this.I0;
        pkf pkf = (pkf) y8Var.a;
        if (d5f.B0 != null) {
            nsa nsa = d5f.B0;
            nsa.getClass();
            Integer valueOf = Integer.valueOf(pkf.c);
            rz3 rz3 = nsa.o1;
            if (!pkf.equals((pkf) ((a8d) rz3.i).b.get(valueOf))) {
                a8d a8d = (a8d) rz3.i;
                a8d.getClass();
                a8d.b.put(Integer.valueOf(pkf.c), pkf);
                nsa.K0.log("PCRTCClient", "updateVideoQuality, " + nsa + " update=" + pkf);
                nsa.i("updateVideoQuality", new adg(nsa, new gsa(nsa, 1, pkf), 1));
            }
        }
    }

    public final Runnable w() {
        this.o.b.getClass();
        return new f7d(this, 1);
    }

    public final xxe y() {
        return xxe.c;
    }
}
