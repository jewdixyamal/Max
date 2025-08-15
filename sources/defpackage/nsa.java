package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;

/* renamed from: nsa  reason: default package */
public final class nsa implements mq7, lq7, al5, tcg, gqa {
    public static final Pattern w1 = Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
    public static final Pattern x1 = Pattern.compile("^a=animoji:(\\d+)", 8);
    public static volatile h7b y1 = null;
    public static final re6 z1 = new re6(23, false);
    public final boolean A0;
    public final hd9 B0;
    public final Handler C0 = new Handler(Looper.getMainLooper());
    public final qld D0;
    public final d E0;
    public final ExecutorService F0;
    public final roa G0;
    public final int H0;
    public final Context I0;
    public final d4c J0;
    public final a4c K0;
    public final ag1 L0;
    public final die M0;
    public final yr6 N0;
    public final koc O0;
    public final qp4 P0;
    public final bl5 Q0;
    public final boolean R0;
    public final String[] S0;
    public final String[] T0;
    public long U0 = -1;
    public volatile PeerConnection V0;
    public boolean W0;
    public final boolean X;
    public MediaConstraints X0;
    public final boolean Y;
    public MediaConstraints Y0;
    public final Integer Z;
    public msa Z0;
    public final boolean a;
    public RtpSender a1;
    public final bwc b;
    public RtpSender b1;
    public final c8d c;
    public RtpSender c1;
    public List d1;
    public RtpSender e1;
    public final ArrayList f1 = new ArrayList();
    public kq7 g1;
    public boolean h1 = true;
    public volatile boolean i1;
    public volatile boolean j1;
    public boolean k1;
    public volatile boolean l1;
    public volatile boolean m1 = true;
    public ssa n1;
    public final boolean o;
    public final rz3 o1;
    public final ej3 p1;
    public final yuc q1;
    public final boolean r1;
    public final Integer s0;
    public final float s1;
    public final kj t0;
    public final float t1;
    public boolean u0;
    public final boolean u1;
    public final ni v0;
    public final int v1;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;

    /* JADX WARNING: type inference failed for: r0v33, types: [java.lang.Object, c8d] */
    /* JADX WARNING: type inference failed for: r1v12, types: [cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v13, types: [qp4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [aab, java.lang.Object] */
    public nsa(lsa lsa) {
        roa roa;
        kra kra;
        lsa lsa2 = lsa;
        int i = lsa2.q;
        this.H0 = i;
        Context applicationContext = lsa2.e.getApplicationContext();
        this.I0 = applicationContext;
        d4c d4c = lsa2.f;
        this.J0 = d4c;
        a4c a4c = lsa2.g;
        this.K0 = a4c;
        ag1 ag1 = lsa2.d;
        this.L0 = ag1;
        this.B0 = new hd9(a4c);
        qld qld = lsa2.a;
        this.D0 = qld;
        ExecutorService executorService = qld != null ? qld.a : lsa2.c;
        this.F0 = executorService;
        this.R0 = lsa2.n;
        this.S0 = lsa2.o;
        this.T0 = lsa2.p;
        this.A0 = lsa2.B;
        if (executorService == null) {
            ag1.getClass();
            roa = new roa(d4c);
        } else {
            roa = null;
        }
        this.G0 = roa;
        this.E0 = lsa2.b;
        ag1.getClass();
        this.N0 = new yr6(d4c, a4c, i);
        o9g o9g = lsa2.w;
        if (lsa2.h) {
            Object re6 = ag1.A.c.b ? new re6(26, (Object) o9g) : new Object();
            ? obj = new Object();
            obj.b = re6;
            obj.a = a4c;
            this.O0 = new koc(obj);
        } else {
            this.O0 = null;
        }
        if (lsa2.i) {
            bdb bdb = new bdb(3);
            bdb.b = null;
            bdb.c = null;
            ? obj2 = new Object();
            obj2.a = o9g;
            obj2.b = new b9b(o9g, 14, a4c);
            obj2.c = new dq1(a4c);
            bdb.b = obj2;
            bdb.c = a4c;
            ? obj3 = new Object();
            obj3.a = new CopyOnWriteArrayList();
            obj3.Y = new Handler(Looper.getMainLooper());
            obj3.Z = new AtomicBoolean(false);
            obj3.s0 = new AtomicReference((Object) null);
            obj3.t0 = new vag(0, obj3);
            cjg cjg = (cjg) bdb.b;
            if (cjg != null) {
                a4c a4c2 = (a4c) bdb.c;
                if (a4c2 != null) {
                    obj3.b = cjg;
                    obj3.c = a4c2;
                    HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
                    obj3.o = handlerThread;
                    handlerThread.start();
                    obj3.X = new Handler(handlerThread.getLooper());
                    this.P0 = obj3;
                } else {
                    throw new IllegalArgumentException("Illegal 'log' value: null");
                }
            } else {
                throw new IllegalArgumentException("Illegal 'serializer' value: null");
            }
        } else {
            this.P0 = null;
        }
        yf1 yf1 = ag1.B;
        this.r1 = yf1.b;
        this.s1 = yf1.c;
        this.t1 = yf1.d;
        Future submit = (executorService == null || qld == null) ? null : executorService.submit(new l5(11, qld));
        if (!lsa2.j || submit == null) {
            this.b = null;
        } else {
            this.b = new bwc(lsa2.g, o9g, submit, this, lsa2.C);
        }
        if (lsa2.k) {
            ? obj4 = new Object();
            obj4.o = new CopyOnWriteArrayList();
            obj4.c = o9g;
            this.c = obj4;
        } else {
            this.c = null;
        }
        this.u0 = lsa2.l;
        this.Q0 = new bl5(this);
        this.a = lsa2.r;
        this.o = lsa2.t;
        this.Y = lsa2.u;
        this.X = lsa2.v;
        psa psa = A().j;
        if (psa != null) {
            this.Z = psa.g;
            this.s0 = psa.h;
        } else {
            this.Z = null;
            this.s0 = null;
        }
        if (lsa2.s) {
            this.p1 = new kqa(new isa(this), a4c, new esa(this), o9g);
        } else {
            this.p1 = new fd4(new isa(this), a4c, new esa(this), o9g);
        }
        this.t0 = lsa2.x;
        this.v0 = lsa2.y;
        this.v1 = lsa2.z;
        this.M0 = lsa2.A;
        if (!(qld == null || (kra = qld.j) == null)) {
            kra.Y.add(this);
        }
        this.o1 = new rz3(qld, applicationContext, ag1, a4c);
        this.q1 = lsa2.D;
        this.u1 = lsa2.m;
    }

    public static qsa A() {
        if (y1 != null) {
            return (qsa) y1.b;
        }
        Boolean bool = Boolean.FALSE;
        return new qsa(true, true, (String) null, (String) null, (Integer) null, false, false, false, false, new psa(false, (Integer) null, (Integer) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null), false, false, (String) null);
    }

    public static void D(Context context, h7b h7b, NativeLibraryLoader nativeLibraryLoader) {
        if (y1 == null) {
            y1 = h7b;
            a4c a4c = (a4c) y1.c;
            if (a4c != null) {
                re6 re6 = z1;
                re6.getClass();
                re6.b = new WeakReference(a4c);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(z1, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
        }
    }

    public static LinkedList f(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i);
                    if (!Character.isWhitespace(codePointAt)) {
                        linkedList.add(str);
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final koc B() {
        koc koc = this.O0;
        if (koc != null) {
            return koc;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public final PeerConnection.IceConnectionState C() {
        PeerConnection peerConnection = this.V0;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.K0.reportException("PCRTCClient", "pc.conn.state", e);
            return null;
        }
    }

    public final boolean E() {
        return !this.i1 && !this.j1 && this.V0 != null;
    }

    public final void F() {
        kq7 kq7 = this.g1;
        if (kq7 != null) {
            a4c a4c = this.K0;
            a4c.log("PCRTCClient", "maybeUpdateSenders, " + this + ", " + jb9.c(kq7));
            if (G() != null) {
                RtpSender rtpSender = this.b1;
                RtpSender rtpSender2 = this.a1;
                kq7.n.log("OKRTCLmsAdapter", "bindTracksWith, " + kq7 + ", audio sender=" + jb9.c(rtpSender) + " & video sender= " + jb9.c(rtpSender2));
                kq7.i.t(rtpSender);
                if (kq7.f.d) {
                    kq7.y.t(rtpSender2);
                }
            }
        }
    }

    public final PeerConnection G() {
        if (this.V0 != null && !this.i1 && !this.W0) {
            return this.V0;
        }
        StringBuilder sb = new StringBuilder();
        if (this.V0 == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.W0) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.i1) {
            a4c a4c = this.K0;
            a4c.log("PCRTCClient", this + ": (closed) " + sb);
            return null;
        }
        a4c a4c2 = this.K0;
        a4c2.log("PCRTCClient", this + ": (unclosed null peer connection) " + sb);
        return null;
    }

    public final void H(IceCandidate[] iceCandidateArr) {
        this.K0.log("PCRTCClient", "removeRemoteIceCandidates, " + this);
        i("removeRemoteIceCandidates", new adg(this, new oj3(2, iceCandidateArr), 1));
    }

    public final void I(ssa ssa) {
        if (ssa != null && !ssa.equals(this.n1)) {
            ssa ssa2 = this.n1;
            boolean z = ssa2 != null && !Objects.equals(ssa2.i, ssa.i);
            this.n1 = ssa;
            this.o1.j = ssa;
            this.K0.log("PCRTCClient", "setPeerVideoSettings, " + this + " settings=" + ssa.toString());
            i("setPeerVideoSettings", new adg(this, new xra(this, z, 1), 1));
        }
    }

    public final void J(SessionDescription sessionDescription) {
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.m1 = false;
        this.l1 = false;
        yr6 yr6 = this.N0;
        if (yr6.f == 0) {
            yr6.f = SystemClock.elapsedRealtime();
        }
        i("setRemoteDescription", new adg(this, new asa(this, sessionDescription, 1), 1));
    }

    public final void a(bg1 bg1, VideoFrame videoFrame) {
        die die = this.M0;
        if (die != null) {
            ((wte) ((vte) die.b)).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            muc.a().b(new ss5(die, bg1, new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), elapsedRealtime, 1));
        }
        this.p1.a(bg1, videoFrame);
    }

    public final void b(kq7 kq7) {
        this.K0.log("PCRTCClient", "onLocalMediaStreamChanged, " + this + " ms=" + jb9.c(kq7));
        org.webrtc.Size h = kq7.h();
        zuc zuc = kq7.t;
        int i = 0;
        int i2 = zuc != null ? zuc.g : 0;
        zuc zuc2 = kq7.t;
        if (zuc2 != null) {
            i = zuc2.f;
        }
        i("maybeUpdateSenders", new adg(this, new zra(this, h, i2, i), 1));
    }

    public final e24 c(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel createDataChannel = this.V0.createDataChannel(str, init);
        a4c a4c = this.K0;
        StringBuilder m = au1.m("DATACH create data channel: name: ", str, ", id: ");
        m.append(createDataChannel.id());
        a4c.log("PCRTCClient", m.toString());
        return new e24(createDataChannel, this.K0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r13 = defpackage.s5c.b(false, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r15.a.contains(java.lang.Integer.valueOf(r14)) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014a A[SYNTHETIC, Splitter:B:70:0x014a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "\\r\\n"
            java.lang.String[] r4 = r0.S0
            java.util.LinkedList r4 = f(r4)
            java.lang.String[] r5 = r0.T0
            java.util.LinkedList r5 = f(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "applyPreferCodec, local="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r8 = ", filter="
            r6.append(r8)
            boolean r8 = r0.R0
            r6.append(r8)
            java.lang.String r9 = ", video=["
            r6.append(r9)
            java.lang.String r9 = ", "
            java.lang.String r10 = "null"
            if (r5 != 0) goto L_0x0035
            r11 = r10
            goto L_0x005b
        L_0x0035:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.Iterator r12 = r5.iterator()
        L_0x003e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0057
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r11.length()
            if (r14 <= 0) goto L_0x0053
            r11.append(r9)
        L_0x0053:
            r11.append(r13)
            goto L_0x003e
        L_0x0057:
            java.lang.String r11 = r11.toString()
        L_0x005b:
            r6.append(r11)
            java.lang.String r11 = "], audio=["
            r6.append(r11)
            if (r4 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        L_0x006f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0088
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r10.length()
            if (r13 <= 0) goto L_0x0084
            r10.append(r9)
        L_0x0084:
            r10.append(r12)
            goto L_0x006f
        L_0x0088:
            java.lang.String r10 = r10.toString()
        L_0x008c:
            java.lang.String r9 = "]"
            java.lang.String r6 = defpackage.zr6.l(r6, r10, r9)
            a4c r10 = r0.K0
            java.lang.String r11 = "PCRTCClient"
            r10.log(r11, r6)
            java.lang.String r0 = "\r\n"
            java.lang.String[] r6 = r1.split(r0)
            r12 = 1
            r13 = 0
            r14 = 0
            if (r4 == 0) goto L_0x00b8
            dcg r15 = defpackage.s5c.b(r12, r6, r10)
            if (r15 == 0) goto L_0x00b5
            boolean r16 = r15.d(r4)
            if (r16 != 0) goto L_0x00b2
            if (r8 == 0) goto L_0x00b5
        L_0x00b2:
            r16 = r12
            goto L_0x00ba
        L_0x00b5:
            r16 = r14
            goto L_0x00ba
        L_0x00b8:
            r15 = r13
            goto L_0x00b5
        L_0x00ba:
            if (r5 == 0) goto L_0x00cd
            dcg r13 = defpackage.s5c.b(r14, r6, r10)
            if (r13 == 0) goto L_0x00cd
            boolean r17 = r13.d(r5)
            if (r17 != 0) goto L_0x00ca
            if (r8 == 0) goto L_0x00cd
        L_0x00ca:
            r17 = r12
            goto L_0x00cf
        L_0x00cd:
            r17 = r14
        L_0x00cf:
            if (r16 != 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            r4 = r1
            r20 = r10
            r21 = r11
            goto L_0x0144
        L_0x00da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r10
            r18 = r14
            r19 = r18
        L_0x00e5:
            int r10 = r6.length
            if (r14 >= r10) goto L_0x013e
            if (r16 == 0) goto L_0x010f
            int r10 = r15.c
            if (r14 != r10) goto L_0x00f4
            r15.f(r12, r4, r8)
            r21 = r11
            goto L_0x0139
        L_0x00f4:
            if (r14 == r10) goto L_0x0105
            java.util.HashSet r10 = r15.a
            r21 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0111
            goto L_0x0107
        L_0x0105:
            r21 = r11
        L_0x0107:
            if (r18 != 0) goto L_0x0139
            r15.c(r12, r4, r8)
            r18 = 1
            goto L_0x0139
        L_0x010f:
            r21 = r11
        L_0x0111:
            if (r17 == 0) goto L_0x0131
            int r10 = r13.c
            if (r14 != r10) goto L_0x011b
            r13.f(r12, r5, r8)
            goto L_0x0139
        L_0x011b:
            if (r14 == r10) goto L_0x0129
            java.util.HashSet r10 = r13.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0131
        L_0x0129:
            if (r19 != 0) goto L_0x0139
            r13.c(r12, r5, r8)
            r19 = 1
            goto L_0x0139
        L_0x0131:
            r10 = r6[r14]
            r12.append(r10)
            r12.append(r0)
        L_0x0139:
            int r14 = r14 + 1
            r11 = r21
            goto L_0x00e5
        L_0x013e:
            r21 = r11
            java.lang.String r4 = r12.toString()
        L_0x0144:
            boolean r5 = r1.equals(r4)
            if (r5 != 0) goto L_0x0197
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            r5.<init>(r7)     // Catch:{ all -> 0x018d }
            r5.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r6 = ", description before=["
            r5.append(r6)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.replace(r0, r3)     // Catch:{ all -> 0x018d }
            r5.append(r1)     // Catch:{ all -> 0x018d }
            r5.append(r9)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x018d }
            r5 = r20
            r6 = r21
            r5.log(r6, r1)     // Catch:{ all -> 0x018b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r1.<init>(r7)     // Catch:{ all -> 0x018b }
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r2 = ", description after=["
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r4.replace(r0, r3)     // Catch:{ all -> 0x018b }
            r1.append(r0)     // Catch:{ all -> 0x018b }
            r1.append(r9)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018b }
            r5.log(r6, r0)     // Catch:{ all -> 0x018b }
            goto L_0x0197
        L_0x018b:
            r0 = move-exception
            goto L_0x0192
        L_0x018d:
            r0 = move-exception
            r5 = r20
            r6 = r21
        L_0x0192:
            java.lang.String r1 = "applyPreferCodec, failed to log sdp difference"
            r5.reportException(r6, r1, r0)
        L_0x0197:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsa.d(java.lang.String, boolean):java.lang.String");
    }

    public final void e(long j) {
        msa msa = this.Z0;
        if (msa != null) {
            msa.o(this, j);
        }
    }

    public final PeerConnection.RTCConfiguration g(List list) {
        ArrayList arrayList = new ArrayList();
        this.L0.getClass();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            } else if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z2 = true;
            }
        }
        a4c a4c = this.K0;
        if (!z || !z2) {
            a4c.log("PCRTCClient", this + ": stun or turn servers are absent");
        }
        a4c.log("PCRTCClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        rTCConfiguration.iceTransportsType = this.a ? PeerConnection.IceTransportsType.RELAY : PeerConnection.IceTransportsType.ALL;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.suspendBelowMinBitrate = this.A0;
        return rTCConfiguration;
    }

    public final void h(String str) {
        this.K0.log("PCRTCClient", "handleSdpCreateFailure, " + this + ", error=" + str);
        i("handleSdpCreateFailure", new yra(this, str, 1));
    }

    public final void i(String str, Runnable runnable) {
        ExecutorService executorService = this.F0;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        roa roa = this.G0;
        roa.getClass();
        roa.a.execute(new mcg(roa, str, runnable));
    }

    public final void j(String str, String str2) {
        this.K0.reportException("PCRTCClient", rh4.k("reportError, ", str, " ", str2), new Exception(wg0.i("peer.connection.error.", str)));
        i("reportError", new csa(this, 6));
    }

    public final void k(PeerConnection peerConnection, boolean z) {
        a4c a4c = this.K0;
        try {
            l(peerConnection, z, true, this.e1);
        } catch (IllegalStateException e) {
            a4c.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            a4c.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.util.List} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(org.webrtc.PeerConnection r25, boolean r26, boolean r27, org.webrtc.RtpSender r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = 0
            r2 = 1
            ssa r3 = r1.n1
            if (r3 != 0) goto L_0x0012
            a4c r0 = r1.K0
            java.lang.String r1 = "PCRTCClient"
            java.lang.String r2 = "updatePVS(), no video settings, ignore this update"
            r0.log(r1, r2)
            return
        L_0x0012:
            java.lang.String r4 = "x"
            java.lang.String r5 = "VideoSettingCalculator"
            if (r27 == 0) goto L_0x00d9
            rz3 r7 = r1.o1
            kq7 r8 = r1.g1
            r7.getClass()
            int r9 = r3.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[]{r9}
            java.util.ArrayList r9 = defpackage.y53.N(r9)
            int r10 = r7.g
            int r11 = r7.h
            int r12 = java.lang.Math.max(r10, r11)
            int r10 = java.lang.Math.min(r10, r11)
            java.lang.Object r11 = r7.i
            a8d r11 = (defpackage.a8d) r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.util.Map r11 = r11.b
            java.lang.Object r11 = r11.get(r13)
            pkf r11 = (defpackage.pkf) r11
            if (r11 == 0) goto L_0x004e
            int r11 = r11.b
            goto L_0x004f
        L_0x004e:
            r11 = r0
        L_0x004f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.add(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x005f:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0076
            java.lang.Object r13 = r9.next()
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 <= 0) goto L_0x005f
            r11.add(r13)
            goto L_0x005f
        L_0x0076:
            java.lang.Comparable r9 = defpackage.x53.r0(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r8 == 0) goto L_0x0081
            yvc r8 = r8.z
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 != 0) goto L_0x0085
            goto L_0x00d9
        L_0x0085:
            java.lang.Object r7 = r7.e
            a4c r7 = (defpackage.a4c) r7
            int r11 = r3.d
            if (r9 == 0) goto L_0x00bf
            int r13 = r9.intValue()
            if (r13 >= r12) goto L_0x00bf
            float r10 = (float) r10
            float r12 = (float) r12
            float r10 = r10 / r12
            int r12 = r9.intValue()
            float r12 = (float) r12
            float r12 = r12 * r10
            int r10 = java.lang.Math.round(r12)
            int r12 = r9.intValue()
            r8.u(r12, r10, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "select screenshare dimension compressed: "
            r8.<init>(r11)
            r8.append(r9)
            r8.append(r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
            goto L_0x00d9
        L_0x00bf:
            r8.u(r12, r10, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "select screenshare dimension: "
            r8.<init>(r9)
            r8.append(r12)
            r8.append(r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
        L_0x00d9:
            int r7 = r3.h
            int r8 = r3.d
            int r9 = r3.a
            if (r27 != 0) goto L_0x0187
            rz3 r10 = r1.o1
            kq7 r11 = r1.g1
            r10.getClass()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[]{r9}
            java.util.ArrayList r9 = defpackage.y53.N(r9)
            if (r11 == 0) goto L_0x00f9
            rkf r11 = r11.y
            goto L_0x00fa
        L_0x00f9:
            r11 = 0
        L_0x00fa:
            if (r11 != 0) goto L_0x00fe
            goto L_0x0187
        L_0x00fe:
            java.lang.Object r10 = r10.i
            a8d r10 = (defpackage.a8d) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.util.Map r10 = r10.b
            java.lang.Object r10 = r10.get(r12)
            pkf r10 = (defpackage.pkf) r10
            if (r10 == 0) goto L_0x0113
            int r10 = r10.b
            goto L_0x0114
        L_0x0113:
            r10 = r0
        L_0x0114:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0124:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x013b
            java.lang.Object r12 = r9.next()
            r13 = r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 <= 0) goto L_0x0124
            r10.add(r12)
            goto L_0x0124
        L_0x013b:
            java.lang.Comparable r9 = defpackage.x53.r0(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r11.c
            a4c r10 = (defpackage.a4c) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Set restriction to video frame max dimension: "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "VideoRecord"
            r10.log(r13, r12)
            ogf r10 = r11.u0
            if (r9 == 0) goto L_0x0181
            r10.getClass()
            int r12 = r9.intValue()
            if (r12 <= 0) goto L_0x0181
            int r12 = r9.intValue()
            int r13 = r10.c
            if (r12 >= r13) goto L_0x0181
            int r9 = r9.intValue()
            int r12 = r9 % 16
            int r9 = r9 - r12
            r12 = 320(0x140, float:4.48E-43)
            r13 = 4096(0x1000, float:5.74E-42)
            int r9 = defpackage.ote.e(r9, r12, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            r10.d = r9
            r11.u()
        L_0x0187:
            rz3 r9 = r1.o1
            java.lang.Object r10 = r9.j
            ssa r10 = (defpackage.ssa) r10
            java.lang.Object r11 = r9.a
            qld r11 = (defpackage.qld) r11
            if (r11 == 0) goto L_0x019d
            kra r11 = r11.j
            org.webrtc.VideoCodecInfo r11 = r11.X
            if (r11 != 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            java.lang.String r11 = r11.name
            goto L_0x019e
        L_0x019d:
            r11 = 0
        L_0x019e:
            if (r11 != 0) goto L_0x01a2
            java.lang.String r11 = "unknown"
        L_0x01a2:
            java.lang.Object r12 = r9.b
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r13 = "connectivity"
            java.lang.Object r13 = r12.getSystemService(r13)
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13
            java.lang.String r14 = "phone"
            java.lang.Object r14 = r12.getSystemService(r14)
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14
            java.lang.Object r15 = r9.d
            ag1 r15 = (defpackage.ag1) r15
            xf1 r15 = r15.a
            boolean r16 = defpackage.jb9.a
            android.net.NetworkInfo r13 = r13.getNetworkInfo(r2)
            if (r13 == 0) goto L_0x01cf
            boolean r13 = r13.isConnected()
            if (r13 == 0) goto L_0x01cf
            int r12 = r15.d
            int r13 = r15.h
            goto L_0x01f9
        L_0x01cf:
            int r13 = android.os.Process.myPid()
            int r6 = android.os.Process.myUid()
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r12.checkPermission(r0, r13, r6)
            if (r0 == 0) goto L_0x01e4
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01f9
        L_0x01e4:
            int r0 = r14.getNetworkType()
            switch(r0) {
                case 1: goto L_0x01f5;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01f0;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01f0;
                case 7: goto L_0x01f5;
                case 8: goto L_0x01f0;
                case 9: goto L_0x01f0;
                case 10: goto L_0x01f0;
                case 11: goto L_0x01f5;
                case 12: goto L_0x01f0;
                case 13: goto L_0x01eb;
                case 14: goto L_0x01f0;
                case 15: goto L_0x01f0;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01f9
        L_0x01f0:
            int r12 = r15.b
            int r13 = r15.f
            goto L_0x01f9
        L_0x01f5:
            int r12 = r15.a
            int r13 = r15.e
        L_0x01f9:
            java.lang.String r0 = "; network maxBitrate="
            java.lang.String r0 = defpackage.zr6.h(r12, r0)
            java.lang.Object r6 = r9.e
            a4c r6 = (defpackage.a4c) r6
            if (r10 == 0) goto L_0x03bd
            if (r27 == 0) goto L_0x020a
            java.lang.String r14 = "for screenshare"
            goto L_0x020c
        L_0x020a:
            java.lang.String r14 = "for camera"
        L_0x020c:
            java.lang.String r15 = "select bitrate "
            java.lang.String r2 = " by videoSettings="
            java.lang.String r2 = defpackage.zr6.i(r15, r14, r2)
            if (r27 == 0) goto L_0x0219
            int r14 = r9.g
            goto L_0x021b
        L_0x0219:
            int r14 = r9.c
        L_0x021b:
            if (r27 == 0) goto L_0x0222
            int r15 = r9.h
        L_0x021f:
            r17 = r3
            goto L_0x0225
        L_0x0222:
            int r15 = r9.f
            goto L_0x021f
        L_0x0225:
            int r3 = java.lang.Math.max(r14, r15)
            r18 = r8
            int r8 = r10.c
            r19 = r7
            int r7 = r8 * 1000
            usa r1 = r10.f
            if (r1 == 0) goto L_0x0310
            if (r3 <= 0) goto L_0x0310
            r20 = r13
            int r13 = r10.b
            r21 = r9
            int r9 = r10.g
            int r13 = r13 / r9
            int r9 = java.lang.Math.min(r13, r3)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r11.toLowerCase(r13)
            java.util.Map r1 = r1.a
            java.lang.Object r13 = r1.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0261
            java.lang.String r13 = "generic"
            java.lang.Object r1 = r1.get(r13)
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0261
            nz4 r13 = defpackage.nz4.a
        L_0x0261:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x026d
            r22 = r0
            r23 = r12
            goto L_0x030e
        L_0x026d:
            java.util.Iterator r1 = r13.iterator()
        L_0x0271:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L_0x0289
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            tsa r1 = (defpackage.tsa) r1
            int r1 = r1.a
            if (r1 != r9) goto L_0x0286
            goto L_0x028b
        L_0x0286:
            r1 = r23
            goto L_0x0271
        L_0x0289:
            r22 = 0
        L_0x028b:
            r1 = r22
            tsa r1 = (defpackage.tsa) r1
            if (r1 == 0) goto L_0x0299
            int r1 = r1.b
            r22 = r0
            r23 = r12
            goto L_0x031a
        L_0x0299:
            ky6 r1 = new ky6
            r22 = r0
            r0 = 8
            r1.<init>(r0)
            java.util.List r0 = defpackage.x53.x0(r13, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x02aa:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x02c1
            java.lang.Object r13 = r1.next()
            r23 = r1
            r1 = r13
            tsa r1 = (defpackage.tsa) r1
            int r1 = r1.a
            if (r1 <= r9) goto L_0x02be
            goto L_0x02c2
        L_0x02be:
            r1 = r23
            goto L_0x02aa
        L_0x02c1:
            r13 = 0
        L_0x02c2:
            tsa r13 = (defpackage.tsa) r13
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x02cc:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x02e3
            java.lang.Object r1 = r0.previous()
            r23 = r0
            r0 = r1
            tsa r0 = (defpackage.tsa) r0
            int r0 = r0.a
            if (r0 >= r9) goto L_0x02e0
            goto L_0x02e4
        L_0x02e0:
            r0 = r23
            goto L_0x02cc
        L_0x02e3:
            r1 = 0
        L_0x02e4:
            tsa r1 = (defpackage.tsa) r1
            if (r1 == 0) goto L_0x02fd
            if (r13 == 0) goto L_0x02fd
            int r0 = r13.a
            r23 = r12
            int r12 = r1.a
            int r0 = r0 - r12
            int r13 = r13.b
            int r1 = r1.b
            int r13 = r13 - r1
            int r12 = r9 - r12
            int r12 = r12 * r13
            int r12 = r12 / r0
            int r12 = r12 + r1
            r1 = r12
            goto L_0x031a
        L_0x02fd:
            r23 = r12
            if (r13 == 0) goto L_0x0309
            int r0 = r13.b
            int r0 = r0 * r9
            int r1 = r13.a
            int r0 = r0 / r1
        L_0x0307:
            r1 = r0
            goto L_0x031a
        L_0x0309:
            if (r1 == 0) goto L_0x030e
            int r0 = r1.b
            goto L_0x0307
        L_0x030e:
            r1 = 0
            goto L_0x031a
        L_0x0310:
            r22 = r0
            r21 = r9
            r23 = r12
            r20 = r13
            r1 = 0
            r9 = 0
        L_0x031a:
            if (r1 <= 0) goto L_0x034d
            int r0 = java.lang.Math.min(r7, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = " by table; encoder="
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = " maxDimensionForTable="
            r3.append(r2)
            java.lang.String r2 = " tableBitrate="
            java.lang.String r4 = " maxBitrateSetting="
            defpackage.ms2.k(r3, r9, r2, r1, r4)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r6.log(r5, r1)
            r7 = r0
        L_0x034a:
            r12 = r23
            goto L_0x03a0
        L_0x034d:
            if (r3 <= 0) goto L_0x0388
            int r0 = r10.a
            if (r3 >= r0) goto L_0x0388
            int r0 = r14 * r15
            int r0 = r0 / 256
            int r0 = r0 * 533
            double r0 = (double) r0
            r3 = 1024(0x400, float:1.435E-42)
            int r8 = r8 * r3
            double r7 = (double) r8
            double r0 = java.lang.Math.min(r0, r7)
            double r7 = (double) r3
            double r0 = r0 / r7
            int r0 = (int) r0
            int r7 = r0 * 1024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by videoSize="
            r0.append(r1)
            r0.append(r14)
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034a
        L_0x0388:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by maxBitrateSetting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034a
        L_0x03a0:
            int r12 = java.lang.Math.min(r12, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = "; videoSettings maxBitrate="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = r21
            goto L_0x03c7
        L_0x03bd:
            r1 = r0
            r17 = r3
            r19 = r7
            r18 = r8
            r20 = r13
            r1 = r9
        L_0x03c7:
            java.lang.Object r1 = r1.i
            a8d r1 = (defpackage.a8d) r1
            if (r27 == 0) goto L_0x03dc
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.util.Map r1 = r1.b
            java.lang.Object r1 = r1.get(r3)
            pkf r1 = (defpackage.pkf) r1
            r3 = 0
            goto L_0x03ea
        L_0x03dc:
            r2 = 1
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.Map r1 = r1.b
            java.lang.Object r1 = r1.get(r4)
            pkf r1 = (defpackage.pkf) r1
        L_0x03ea:
            if (r1 == 0) goto L_0x0408
            int r1 = r1.a
            if (r1 <= 0) goto L_0x0408
            int r12 = java.lang.Math.min(r12, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "; videoQualityUpdate b="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
        L_0x0408:
            java.lang.String r1 = "getMaxBitrates() AudioBitrate="
            java.lang.String r4 = " VideoBitrate="
            r13 = r20
            java.lang.String r0 = defpackage.wg0.h(r1, r13, r4, r12, r0)
            r6.log(r5, r0)
            r1 = r24
            hd9 r13 = r1.B0
            if (r12 <= 0) goto L_0x0421
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r8 = r0
            goto L_0x0422
        L_0x0421:
            r8 = 0
        L_0x0422:
            if (r19 <= 0) goto L_0x042a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r9 = r0
            goto L_0x042b
        L_0x042a:
            r9 = 0
        L_0x042b:
            if (r18 <= 0) goto L_0x0435
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r10 = r6
            r0 = r17
            goto L_0x0438
        L_0x0435:
            r0 = r17
            r10 = 0
        L_0x0438:
            java.lang.String r0 = r0.e
            if (r27 == 0) goto L_0x0440
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
        L_0x043e:
            r11 = r0
            goto L_0x0487
        L_0x0440:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0484
            java.lang.String r0 = r0.toLowerCase()
            r0.getClass()
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case 270940796: goto L_0x046d;
                case 1250482734: goto L_0x0462;
                case 1330699787: goto L_0x0457;
                default: goto L_0x0455;
            }
        L_0x0455:
            r0 = r4
            goto L_0x0477
        L_0x0457:
            java.lang.String r2 = "maintain-framerate"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0460
            goto L_0x0455
        L_0x0460:
            r0 = 2
            goto L_0x0477
        L_0x0462:
            java.lang.String r3 = "maintain-resolution"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x046b
            goto L_0x0455
        L_0x046b:
            r0 = r2
            goto L_0x0477
        L_0x046d:
            java.lang.String r2 = "disabled"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0476
            goto L_0x0455
        L_0x0476:
            r0 = r3
        L_0x0477:
            switch(r0) {
                case 0: goto L_0x0481;
                case 1: goto L_0x047e;
                case 2: goto L_0x047b;
                default: goto L_0x047a;
            }
        L_0x047a:
            goto L_0x0484
        L_0x047b:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
            goto L_0x043e
        L_0x047e:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION
            goto L_0x043e
        L_0x0481:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.DISABLED
            goto L_0x043e
        L_0x0484:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.BALANCED
            goto L_0x043e
        L_0x0487:
            r13.getClass()
            if (r27 == 0) goto L_0x0490
            java.lang.String r0 = "screen-share"
        L_0x048e:
            r2 = r0
            goto L_0x0493
        L_0x0490:
            java.lang.String r0 = "video"
            goto L_0x048e
        L_0x0493:
            r4 = r13
            r5 = r28
            r6 = r2
            r7 = r26
            r4.f(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x049d }
            goto L_0x04ac
        L_0x049d:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "Error on update of sender "
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "RtpSenderHelper"
            a4c r4 = r13.a
            r4.reportException(r2, r0, r3)
        L_0x04ac:
            r24.v(r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsa.l(org.webrtc.PeerConnection, boolean, boolean, org.webrtc.RtpSender):void");
    }

    public final void m(SessionDescription sessionDescription) {
        this.K0.log("PCRTCClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        i("handleSdpCreateSuccess", new adg(this, new asa(this, sessionDescription, 0), 1));
    }

    public final void n(SessionDescription sessionDescription, boolean z) {
        this.K0.log("PCRTCClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        i("handleSdpSetSuccess", new adg(this, new dsa(this, z, sessionDescription), 1));
    }

    public final void o(SessionDescription sessionDescription, boolean z, String str) {
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description);
        a4c.reportException("PCRTCClient", zr6.l(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(str));
        i("onSetFailure", new yra(this, str, 0));
    }

    public final void p(boolean z) {
        kra kra;
        this.i1 = true;
        this.m1 = false;
        this.l1 = false;
        this.Z0 = null;
        this.p1.f();
        qld qld = this.D0;
        if (!(qld == null || (kra = qld.j) == null)) {
            kra.Y.remove(this);
        }
        this.C0.removeCallbacksAndMessages((Object) null);
        if (z) {
            i("releaseInternal", new csa(this, 7));
        } else {
            i("closeInternal", new csa(this, 8));
        }
    }

    public final void q() {
        e24 e24;
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "closeInternal, " + this);
        this.b1 = null;
        this.a1 = null;
        this.c1 = null;
        this.e1 = null;
        kq7 kq7 = this.g1;
        if (kq7 != null) {
            if (kq7.v == this) {
                kq7.v = null;
                fwc fwc = kq7.u;
                if (fwc != null) {
                    fwc.b.c(new flc(fwc, 9, (Object) null));
                }
            }
            this.g1.c.remove(this);
            this.g1 = null;
        }
        koc koc = this.O0;
        if (koc != null && koc.j.compareAndSet(false, true)) {
            koc.g.removeCallbacksAndMessages((Object) null);
            Handler handler = koc.f;
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new u60(12, koc));
            koc.e.quitSafely();
        }
        qp4 qp4 = this.P0;
        if (qp4 != null && ((AtomicBoolean) qp4.Z).compareAndSet(false, true)) {
            Handler handler2 = (Handler) qp4.X;
            handler2.removeCallbacksAndMessages((Object) null);
            handler2.post(new u60(13, qp4));
            ((HandlerThread) qp4.o).quitSafely();
        }
        c8d c8d = this.c;
        if (!(c8d == null || (e24 = (e24) c8d.a) == null)) {
            vag vag = (vag) c8d.b;
            if (vag != null) {
                e24.c(vag);
            }
            c8d.a = null;
            c8d.b = null;
        }
        koc koc2 = this.O0;
        if (koc2 != null) {
            try {
                koc2.e.join(500);
            } catch (InterruptedException e) {
                this.K0.reportException("PCRTCClient", "command.exec.shutdown", e);
            }
        }
        qp4 qp42 = this.P0;
        if (qp42 != null) {
            try {
                ((HandlerThread) qp42.o).join((long) 500);
            } catch (InterruptedException e2) {
                this.K0.reportException("PCRTCClient", "notif.recv.shutdown", e2);
            }
        }
        bwc bwc = this.b;
        if (bwc != null) {
            bwc.f = true;
            for (vbg vbg : bwc.a.values()) {
                if (vbg != null) {
                    vbg.a();
                }
            }
            e24 e242 = bwc.d;
            if (e242 != null) {
                vag vag2 = bwc.g;
                if (vag2 != null) {
                    e242.c(vag2);
                }
                bwc.d = null;
                bwc.g = null;
            }
        }
        ni niVar = this.v0;
        if (niVar != null) {
            e24 e243 = niVar.c;
            if (e243 != null) {
                e243.c(niVar);
            }
            niVar.c = null;
        }
        kj kjVar = this.t0;
        if (kjVar != null) {
            kjVar.b();
        }
        kj kjVar2 = this.t0;
        if (kjVar2 != null) {
            kjVar2.b();
        }
        ni niVar2 = this.v0;
        if (niVar2 != null) {
            e24 e244 = niVar2.c;
            if (e244 != null) {
                e244.c(niVar2);
            }
            niVar2.c = null;
        }
        if (this.V0 != null) {
            this.V0.dispose();
            a4c a4c2 = this.K0;
            a4c2.log("PCRTCClient", this + ": " + jb9.c(this.V0) + " was disposed");
            this.V0 = null;
        }
        a4c a4c3 = this.K0;
        a4c3.log("PCRTCClient", this + ": " + jb9.c(this) + " was closed");
    }

    public final void r(IceCandidate iceCandidate) {
        this.K0.log("PCRTCClient", "addRemoteIceCandidate, " + this);
        i("addRemoteIceCandidate", new adg(this, new bsa(this, iceCandidate, 0), 1));
    }

    public final void s(ji9 ji9) {
        yuc yuc = this.q1;
        if (yuc != null) {
            boolean z = ji9.b;
            if (z != this.k1) {
                this.k1 = z;
                i("screenCaptureEnable", new v05((Object) this, (Object) ji9, (Object) yuc, 22));
                return;
            }
            return;
        }
        this.K0.reportException("PCRTCClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
    }

    public final void t() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        this.X0 = mediaConstraints;
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        if (this.H0 == 2) {
            this.K0.log("PCRTCClient", this + ": video capture is disabled.");
        }
        this.Y0 = new MediaConstraints();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = jb9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('@');
        int i = this.H0;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : "Receive" : "Send" : "SendReceive");
        sb.append("PeerConnection@");
        PeerConnection peerConnection = this.V0;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(PeerConnection peerConnection, boolean z) {
        a4c a4c = this.K0;
        try {
            l(peerConnection, z, false, this.a1);
        } catch (IllegalStateException e) {
            a4c.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            a4c.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void v(PeerConnection peerConnection) {
        hd9 hd9 = this.B0;
        hd9.getClass();
        int g = hd9.g(this.e1) + hd9.g(this.a1) + hd9.g(this.c1) + hd9.g(this.b1);
        peerConnection.setBitrate(6000, (Integer) null, Integer.valueOf(g));
        this.K0.log("PCRTCClient", "Bitrate constraints were set to [6000:" + g + "]");
    }

    public final void w() {
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "createAnswer, " + this);
        this.m1 = false;
        i("createAnswer", new adg(this, new fsa(this, 1), 1));
    }

    public final void x(boolean z) {
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "createOffer, " + this + " iceRestart=" + z);
        this.m1 = false;
        i("createOffer", new adg(this, new xra(this, z, 0), 1));
    }

    public final void y(List list) {
        if (y1 == null) {
            this.K0.log("PCRTCClient", "Creating peer connection without initializing factory.");
        } else if (this.j1) {
            a4c a4c = this.K0;
            a4c.log("PCRTCClient", this + ": creation of a peer connection is already scheduled");
        } else {
            this.j1 = true;
            i("createPeerConnection", new do9(this, 10, list));
        }
    }

    public final void z() {
        a4c a4c = this.K0;
        a4c.log("PCRTCClient", "createPeerConnectionInternal, " + this);
        if (this.W0) {
            a4c a4c2 = this.K0;
            a4c2.log("PCRTCClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory peerConnectionFactory = this.D0.d;
        if (peerConnectionFactory == null) {
            a4c a4c3 = this.K0;
            a4c3.log("PCRTCClient", this + ": no peer connection factory");
            return;
        }
        a4c a4c4 = this.K0;
        a4c4.log("PCRTCClient", this + ": peer connection constraints: " + this.X0.toString());
        PeerConnection.RTCConfiguration g = g(this.d1);
        if ((this.G0 == null || roa.X.get() != roa.o) && this.F0 == null) {
            this.C0.post(new nn6(25, new RuntimeException()));
        }
        this.V0 = peerConnectionFactory.createPeerConnection(g, this.X0, (PeerConnection.Observer) new isa(this));
        if (this.V0 != null) {
            if (this.H0 != 2) {
                kq7 kq7 = (kq7) this.E0.a().b;
                this.g1 = kq7;
                if (kq7 != null) {
                    a4c a4c5 = this.K0;
                    a4c5.log("PCRTCClient", this + ": has " + jb9.c(this.g1));
                    org.webrtc.Size h = this.g1.h();
                    this.y0 = h.width;
                    this.z0 = h.height;
                    zuc zuc = this.g1.t;
                    this.x0 = zuc != null ? zuc.f : 0;
                    zuc zuc2 = this.g1.t;
                    this.w0 = zuc2 != null ? zuc2.g : 0;
                    rz3 rz3 = this.o1;
                    rz3.f = this.z0;
                    rz3.c = this.y0;
                    zuc zuc3 = this.g1.t;
                    rz3.h = zuc3 != null ? zuc3.f : 0;
                    rz3 rz32 = this.o1;
                    zuc zuc4 = this.g1.t;
                    rz32.g = zuc4 != null ? zuc4.g : 0;
                    PeerConnection peerConnection = this.V0;
                    kq7 kq72 = this.g1;
                    List singletonList = Collections.singletonList(kq72.m);
                    n60 n60 = kq72.i;
                    AudioTrack audioTrack = n60 != null ? (AudioTrack) ((MediaStreamTrack) n60.X) : null;
                    if (audioTrack != null) {
                        hd9 hd9 = this.B0;
                        RtpSender addTrack = peerConnection.addTrack(audioTrack, singletonList);
                        hd9.c(addTrack, MediaStreamTrack.AUDIO_TRACK_KIND);
                        this.b1 = addTrack;
                    }
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) kq72.y.X);
                    if (videoTrack != null) {
                        hd9 hd92 = this.B0;
                        RtpSender addTrack2 = peerConnection.addTrack(videoTrack, singletonList);
                        hd92.d(addTrack2, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, (Double) null, false);
                        this.a1 = addTrack2;
                    }
                    v(peerConnection);
                    RtpSender rtpSender = this.a1;
                    if (this.r1 && rtpSender != null) {
                        rtpSender.setVideoEncoderObserver(new ar0((Object) this, true));
                    }
                    a4c a4c6 = this.K0;
                    a4c6.log("PCRTCClient", this + ": " + jb9.c(this.b1) + "(audio) created");
                    a4c a4c7 = this.K0;
                    a4c7.log("PCRTCClient", this + ": " + jb9.c(this.a1) + "(video) created");
                    F();
                    this.g1.c.add(this);
                    if (this.u1) {
                        kq7 kq73 = this.g1;
                        e24 c2 = c("consumerScreenShare", new DataChannel.Init());
                        lq7 lq7 = kq73.v;
                        if (lq7 != null) {
                            nsa nsa = (nsa) lq7;
                            nsa.K0.log("PCRTCClient", "Data channel screen capturer unbound from " + nsa);
                        }
                        kq73.v = this;
                        this.K0.log("PCRTCClient", "Data channel screen capturer bound to " + this);
                        fwc fwc = kq73.u;
                        if (fwc == null) {
                            fwc = new fwc(kq73.a, kq73.d.getApplicationContext(), kq73.n, kq73.E, kq73.C);
                            kq73.u = fwc;
                        }
                        fwc.b.c(new flc(fwc, 9, c2));
                    }
                }
            }
            if (this.O0 != null) {
                e24 c3 = c("producerCommand", new DataChannel.Init());
                koc koc = this.O0;
                if (!koc.j.get()) {
                    koc.f.post(new flc(koc, 5, c3));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            if (this.P0 != null) {
                e24 c4 = c("producerNotification", new DataChannel.Init());
                qp4 qp4 = this.P0;
                if (!((AtomicBoolean) qp4.Z).get()) {
                    ((Handler) qp4.X).post(new flc(qp4, 6, c4));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            bwc bwc = this.b;
            if (bwc != null) {
                e24 c5 = c("producerScreenShare", new DataChannel.Init());
                e24 e24 = bwc.d;
                if (e24 != null) {
                    vag vag = bwc.g;
                    if (vag != null) {
                        e24.c(vag);
                    }
                    bwc.d = null;
                    bwc.g = null;
                }
                bwc.d = c5;
                vag vag2 = new vag(3, bwc);
                bwc.g = vag2;
                c5.a(vag2);
            }
            if (this.c != null) {
                e24 c6 = c("asr", new DataChannel.Init());
                c8d c8d = this.c;
                e24 e242 = (e24) c8d.a;
                if (e242 != null) {
                    vag vag3 = (vag) c8d.b;
                    if (vag3 != null) {
                        e242.c(vag3);
                    }
                    c8d.a = null;
                    c8d.b = null;
                }
                c8d.a = c6;
                vag vag4 = new vag(1, c8d);
                c8d.b = vag4;
                c6.a(vag4);
            }
            int i = this.v1;
            if (i == 1 || i == 3) {
                DataChannel.Init init = new DataChannel.Init();
                if (this.v1 == 3) {
                    init.id = 1;
                    init.negotiated = true;
                }
                e24 c7 = c("animoji", init);
                kj kjVar = this.t0;
                if (kjVar != null) {
                    kjVar.d(c7);
                }
                ni niVar = this.v0;
                if (niVar != null) {
                    e24 e243 = niVar.c;
                    if (e243 != null) {
                        e243.c(niVar);
                    }
                    niVar.c = c7;
                    kad kad = niVar.b;
                    ((AtomicInteger) kad.X).set(0);
                    ((AtomicInteger) kad.Y).set(0);
                    c7.a(niVar);
                }
            }
            a4c a4c8 = this.K0;
            a4c8.log("PCRTCClient", this + ": peer connection created");
            return;
        }
        throw new IllegalStateException("peerconnection is null");
    }
}
