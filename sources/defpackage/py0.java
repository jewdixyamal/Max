package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.b;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: py0  reason: default package */
public final class py0 implements xn1, mq7, NetworkMonitor.NetworkObserver {
    public static final ExecutorService o2 = Executors.newSingleThreadExecutor();
    public static final ExecutorService p2 = Executors.newSingleThreadExecutor();
    public boolean A0;
    public boolean A1;
    public boolean B0;
    public final boolean B1;
    public final boolean C0;
    public final boolean C1;
    public final gw3 D0;
    public final o9g D1;
    public final boolean E0;
    public final bg4 E1;
    public String F0;
    public final vte F1;
    public long G0;
    public final yuc G1;
    public long H0;
    public int H1 = 0;
    public boolean I0 = false;
    public bg1 I1;
    public final gwe J0 = new gwe(7, (Object) this);
    public List J1;
    public boolean K0 = false;
    public volatile boolean K1;
    public List L0;
    public final kd1 L1;
    public final ArrayList M0 = new ArrayList();
    public final wva M1;
    public boolean N0;
    public final dq1 N1;
    public final int O0;
    public final g03 O1;
    public boolean P0;
    public final glc P1;
    public ji6 Q0;
    public final oq9 Q1;
    public boolean R0;
    public final vk8 R1;
    public final kxf S0;
    public final vm1 S1;
    public final kxf T0;
    public final epd T1;
    public final d4c U0;
    public final qp4 U1;
    public final a4c V0;
    public final fd7 V1;
    public final rf0 W0;
    public final id1 W1;
    public final sbg X = new sbg(this);
    public final boolean X0;
    public final va8 X1;
    public final xx0 Y = new xx0(this);
    public boolean Y0 = true;
    public final sl1 Y1;
    public rod Z;
    public boolean Z0 = true;
    public final rh1 Z1;
    public boolean a;
    public boolean a1;
    public final t01 a2;
    public wq9 b;
    public b b1;
    public final die b2;
    public final wx0 c = new wx0(this, 2);
    public boolean c1;
    public final pl5 c2;
    public rj3 d1;
    public final boolean d2;
    public final re6 e1;
    public final tg4 e2;
    public long f1;
    public b0e f2;
    public final zbg g1 = new zbg(this);
    public final h7b g2;
    public final nh3 h1 = new nh3(1, this);
    public final od h2;
    public final oof i1 = new oof(this);
    public volatile boolean i2;
    public final s04 j1;
    public final vq7 j2;
    public final qld k1;
    public final va8 k2;
    public final d l1;
    public ssa l2;
    public final i50 m1;
    public ssa m2;
    public final aq7 n1;
    public final kj6 n2;
    public final wx0 o = new wx0(this, 0);
    public final i7b o1;
    public final kg1 p1;
    public final CopyOnWriteArraySet q1 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet r1 = new CopyOnWriteArraySet();
    public final Handler s0 = new Handler(Looper.getMainLooper());
    public boolean s1;
    public final Context t0;
    public yn1 t1;
    public final ag1 u0;
    public yn1 u1;
    public String v0;
    public pg4 v1;
    public boolean w0;
    public volatile ly0 w1;
    public final EglBase x0;
    public boolean x1;
    public final oe1 y0;
    public final ji9 y1;
    public final EnumSet z0 = EnumSet.noneOf(oy0.class);
    public final oq0 z1;

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, oq0] */
    /* JADX WARNING: type inference failed for: r12v5, types: [aab, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v28, types: [s04, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v44, types: [od, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [nld, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v11, types: [yb9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v58, types: [qp4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v59, types: [fd7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v34, types: [die, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v40, types: [od, java.lang.Object] */
    public py0(Context context, ag1 ag1, boolean z, boolean z2, fg1 fg1, hw3 hw3, boolean z3, boolean z4, d4c d4c, a4c a4c, b4c b4c, gy9 gy9, boolean z5, dnc dnc, bi biVar, wte wte, CallAnalyticsSender callAnalyticsSender, i7b i7b, yuc yuc) {
        Context context2 = context;
        ag1 ag12 = ag1;
        boolean z6 = z;
        fg1 fg12 = fg1;
        d4c d4c2 = d4c;
        a4c a4c2 = a4c;
        wte wte2 = wte;
        id1 id1 = new id1();
        this.W1 = id1;
        va8 va8 = new va8(id1);
        this.X1 = va8;
        this.n2 = new kj6(19);
        this.F1 = wte2;
        kg1 kg1 = new kg1(fg12, id1, va8, a4c2);
        this.p1 = kg1;
        this.u0 = ag12;
        this.e1 = new re6(9);
        this.B0 = z6;
        this.C0 = z2;
        ji9 ji9 = fg12.c;
        this.y1 = ji9;
        this.z1 = new Object();
        this.D0 = hw3;
        this.E0 = z4;
        this.U0 = d4c2;
        this.V0 = a4c2;
        ? obj = new Object();
        obj.a = a4c2;
        this.o1 = i7b;
        this.B1 = z5;
        this.d2 = ag12.i;
        o9g o9g = new o9g(19);
        this.D1 = o9g;
        this.N1 = new dq1(a4c2);
        o9g o9g2 = o9g;
        uf0 uf0 = ag12.A;
        va8 va82 = va8;
        this.W0 = new rf0(uf0.a != null, uf0.c.a);
        this.O1 = new g03(1, (Object) a4c2);
        aab aab = obj;
        ji9 ji92 = ji9;
        kg1 kg12 = kg1;
        this.R1 = new vk8(a4c, aab, new gy0(this, 0), new gy0(this, 1), new xx0(this), wte);
        Context applicationContext = context.getApplicationContext();
        this.t0 = applicationContext;
        NetworkMonitor.init(applicationContext);
        vm1 vm1 = new vm1(applicationContext, new qz7(d4c2, callAnalyticsSender), wte, (ConnectivityManager) context2.getSystemService("connectivity"), (TelephonyManager) context2.getSystemService("phone"), a4c, new vx0(this, 1), hw3);
        this.S1 = vm1;
        vm1.m.c.getClass();
        a4c2.log("OKRTCCall", "Call<init> caller = " + z6 + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        o9g o9g3 = o9g2;
        va8 va83 = va82;
        id1 id12 = id1;
        vm1 vm12 = vm1;
        wte wte3 = wte2;
        a4c a4c3 = a4c2;
        this.t1 = new zs4(kg12, ag1, a4c, d4c, id12);
        ? obj2 = new Object();
        obj2.d = new Hashtable();
        obj2.e = new wk8();
        obj2.f = ag12;
        obj2.g = d4c2;
        obj2.h = a4c3;
        obj2.i = fg12;
        this.j1 = obj2;
        v("rtc.init.sw.codec.false");
        v("rtc.abi." + Build.CPU_ABI);
        vq7 vq7 = new vq7(a4c3, d4c2);
        this.j2 = vq7;
        za3 k = new sa3(2, new l5(3, vq7)).k(muc.a());
        uy1 uy1 = new uy1(1);
        k.i(uy1);
        ((hc3) vq7.o).a(uy1);
        EglBase create = EglBase.create();
        this.x0 = create;
        a4c3.log("OKRTCCall", jb9.c(create) + " was created");
        this.y0 = new oe1(a4c3, create.getEglBaseContext(), EglBase.CONFIG_PLAIN, (String) null);
        int numberOfCameras = Camera.getNumberOfCameras();
        this.O0 = numberOfCameras;
        e0e e0e = e0e.callDevices;
        u(e0e, numberOfCameras + "_1");
        this.S0 = new kxf("pc_created", a4c3);
        this.T0 = new kxf("accepted", a4c3);
        tg4 tg4 = new tg4(a4c3);
        this.e2 = tg4;
        qld qld = new qld(create, a4c3, ag12, tg4);
        this.k1 = qld;
        aq7 aq7 = new aq7(context2, a4c3);
        this.n1 = aq7;
        ? obj3 = new Object();
        obj3.a = false;
        obj3.Y = context2;
        obj3.o = ag12.j;
        obj3.b = gy9;
        obj3.X = aq7;
        obj3.a = ag12.B.a;
        obj3.c = a4c3;
        if (((gy9) obj3.b) == null || ((aq7) obj3.X) == null) {
            throw new IllegalStateException();
        }
        i50 i50 = new i50((od) obj3);
        this.m1 = i50;
        u5e u5e = new u5e(this);
        ? obj4 = new Object();
        obj4.a = qld;
        obj4.b = i50;
        obj4.j = ag12.B.e;
        ji9 ji93 = ji92;
        obj4.c = ji93;
        obj4.i = null;
        obj4.d = context2;
        obj4.e = a4c3;
        obj4.k = ag12.c;
        obj4.l = create.getEglBaseContext();
        obj4.f = ag12;
        obj4.g = new xx0(this);
        obj4.m = aq7;
        obj4.o = dnc;
        obj4.n = wte3;
        aab aab2 = aab;
        obj4.p = new ync(12, aab2);
        obj4.h = u5e;
        if (obj4.a == null || obj4.b == null || obj4.m == null || obj4.d == null || obj4.c == null || obj4.e == null || obj4.f == null || obj4.g == null || obj4.o == null || obj4.h == null) {
            throw new IllegalStateException();
        }
        d dVar = new d(obj4);
        this.l1 = dVar;
        dVar.y0.add(this);
        ece ece = new ece(this);
        dVar.H0 = ece;
        if (dVar.z0 != null) {
            dVar.z0.x = ece;
        }
        this.C1 = z3;
        ji93.a.add(new yx0(this));
        kg1 kg13 = kg12;
        ji93.a.add(new e04(new ync(10, kg13)));
        AndroidVideoDecoder.errorCallback = new zx0(this);
        NetworkMonitor.getInstance().addObserver(this);
        this.X0 = ag12.k;
        this.M1 = new wva(a4c3, 6, b4c);
        this.P1 = new glc(new i50(new wmc(this, false), new mfe(this), a4c3, ag12));
        this.Q1 = new oq9(16);
        bg4 bg4 = r0;
        bg4 bg42 = new bg4(this, qld, a4c, o9g3, biVar, ji93, create);
        this.E1 = bg4;
        kd1 kd1 = new kd1(kg13, a4c, new bk(1, this), new Object(), new ky0(kg13, 0), aq7);
        this.L1 = kd1;
        epd epd = new epd(a4c3, kg13.a, kd1);
        this.T1 = epd;
        kg1 kg14 = kg13;
        aab aab3 = aab2;
        a4c a4c4 = a4c3;
        sl1 sl1 = new sl1(a4c, kg13, va82, kd1, id12, new h7b(epd.g, new vx0(this, 2), false, 20), new imc(epd.o, new vx0(this, 3), false, 20), this.F1);
        this.Y1 = sl1;
        bk bkVar = new bk(1, this);
        id1 id13 = this.W1;
        ag1 ag13 = this.u0;
        ? obj5 = new Object();
        obj5.b = new k8g((Object) kg14, (Object) epd.a, (Object) bkVar);
        obj5.c = new c8d(bkVar, a4c4, epd.b, epd.d);
        a4c a4c5 = a4c4;
        kg1 kg15 = kg14;
        obj5.a = new kxf(epd.m, epd.n, epd.o, sl1, ag13.t);
        obj5.o = new c8d(a4c5, epd.c, epd.h, id13.j);
        obj5.X = new djb(epd.p, id13.d, false, 13);
        obj5.Y = id13.p;
        obj5.Z = new adb(kg15, epd.q, id13.k);
        obj5.s0 = new bdb((Object) id13.q, 10, (Object) epd.k);
        obj5.t0 = new va8((Object) id13.r, 11, (Object) epd.l);
        this.U1 = obj5;
        ? obj6 = new Object();
        id1 id14 = id12;
        obj6.a = new mfe(id14.l);
        this.V1 = obj6;
        this.Z1 = new rh1(epd.i, id14);
        this.a2 = new t01(epd.j, id14);
        vm1 vm13 = vm12;
        n61 n61 = vm13.j;
        ? obj7 = new Object();
        obj7.a = n61;
        obj7.b = wte3;
        obj7.c = new LinkedHashMap();
        obj7.o = new LinkedHashSet();
        this.b2 = obj7;
        this.c2 = new pl5(vm13.j, aab3, wte, z, new vx0(this, 4), new ky0(kg15, 1), a4c);
        this.g2 = new h7b(8, (Object) this);
        this.G1 = yuc;
        vx0 vx0 = new vx0(this, 0);
        ? obj8 = new Object();
        obj8.b = a4c5;
        obj8.c = vx0;
        xpb xpb = new xpb();
        obj8.o = xpb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc a3 = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a3, "scheduler is null");
        obj8.X = new hz9(xpb, timeUnit, a3, 0).n(ce.a()).p(new xje(4, (Object) obj8));
        this.h2 = obj8;
        obj8.Y = new ync(10, kg15);
        AudioLevelListener audioLevelListener = new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new ule(16, new ync(11, obj8)));
        qld qld2 = this.k1;
        qld2.getClass();
        qld2.a.execute(new tb2((Object) qld2, (Object) audioLevelListener, 200, 6));
        this.k2 = new va8(7, (Object) a4c5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(defpackage.fg1 r2) {
        /*
            java.util.List r2 = r2.e
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            eg1 r0 = (defpackage.eg1) r0
            eg1 r1 = defpackage.eg1.b
            if (r0 == r1) goto L_0x001a
            eg1 r1 = defpackage.eg1.a
            if (r0 != r1) goto L_0x0006
        L_0x001a:
            r2 = 1
            return r2
        L_0x001c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.t(fg1):boolean");
    }

    public final void A(yn1 yn1, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.V0.log("OKRTCCall", "handleTopologyIceConnectionChange, " + yn1 + ", state=" + iceConnectionState);
        u(e0e.callIceConnectionState, iceConnectionState.toString());
        if (yn1 == this.t1) {
            boolean z = iceConnectionState == PeerConnection.IceConnectionState.CONNECTED;
            this.S1.k = z;
            if (z) {
                vm1 vm1 = this.S1;
                sm1 sm1 = vm1.h;
                sm1.i.g();
                sm1.j.c();
                h7b h7b = (h7b) sm1.l.o;
                h7b.b = null;
                h7b.c = null;
                sm1.k.c();
                glc glc = sm1.m;
                ((w4d) glc.b).b = null;
                ((w4d) glc.c).b = null;
                ((ece) vm1.g.o).a = null;
                this.K0 = true;
                if (this.Y0) {
                    a8g a8g = this.S1.f;
                    a8g.getClass();
                    long x = yn1.x();
                    if (x != -1) {
                        yn1.C(new rm1(a8g, SystemClock.elapsedRealtime() - x));
                    }
                }
                this.Y0 = false;
                this.H0 = SystemClock.elapsedRealtime();
                k(w51.a, (Object) null);
                this.s0.removeCallbacks(this.J0);
                if (this.X0) {
                    rf0 rf0 = this.W0;
                    rf0.c.b = 0.0d;
                    rf0.b.b = 0.0d;
                    rf0.m = false;
                    rf0.p = Double.NaN;
                    rf0.o = Double.NaN;
                    rf0.a();
                }
                this.H1 = 0;
                yn1 yn12 = this.u1;
                if (yn12 != null) {
                    yn12.L();
                    this.u1 = null;
                }
            } else if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
                if (this.K0) {
                    this.G0 = (SystemClock.elapsedRealtime() - this.H0) + this.G0;
                }
                this.K0 = false;
                k(w51.b, (Object) null);
            } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                yn1 yn13 = this.t1;
                xxe xxe = xxe.c;
                if (yn13.H(xxe) && NetworkMonitor.isOnline() && (i = this.H1) < 3) {
                    this.H1 = i + 1;
                    e(xxe, true);
                    c(this.t1);
                }
                this.s0.removeCallbacks(this.J0);
                boolean H = yn1.H(xxe.b);
                if ((this.F0 == null && this.f1 == 0 && this.C1) || !H) {
                    Handler handler = this.s0;
                    gwe gwe = this.J0;
                    this.u0.b.getClass();
                    handler.postDelayed(gwe, (long) 30000);
                }
            }
        } else if (yn1 != this.u1) {
            this.V0.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r7) {
        /*
            r6 = this;
            a4c r0 = r6.V0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "onUserAnswered"
            r0.log(r1, r2)
            boolean r0 = r6.K1
            r1 = 1
            if (r0 == 0) goto L_0x004c
            h7b r0 = r6.g2
            oy0 r2 = defpackage.oy0.X
            java.lang.Object r0 = r0.b
            py0 r0 = (defpackage.py0) r0
            java.util.EnumSet r0 = r0.z0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            h7b r0 = r6.g2
            java.lang.Object r2 = r0.b
            py0 r2 = (defpackage.py0) r2
            kg1 r3 = r2.p1
            java.util.Collection r3 = r3.i()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0033
            goto L_0x004c
        L_0x0033:
            java.lang.Object r6 = r0.c
            nqa r6 = (defpackage.nqa) r6
            if (r6 != 0) goto L_0x004b
            nqa r6 = new nqa
            r6.<init>(r0)
            id1 r7 = r2.W1
            nqa r7 = r7.c
            java.lang.Object r7 = r7.b
            java.util.concurrent.CopyOnWriteArraySet r7 = (java.util.concurrent.CopyOnWriteArraySet) r7
            r7.add(r6)
            r0.c = r6
        L_0x004b:
            return
        L_0x004c:
            h7b r0 = r6.g2
            java.lang.Object r2 = r0.c
            nqa r2 = (defpackage.nqa) r2
            r3 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Object r4 = r0.b
            py0 r4 = (defpackage.py0) r4
            id1 r4 = r4.W1
            nqa r4 = r4.c
            java.lang.Object r4 = r4.b
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            r4.remove(r2)
            r0.c = r3
        L_0x0066:
            boolean r0 = r6.A1
            r0 = r0 ^ r1
            r6.A1 = r1
            boolean r2 = r6.i()
            if (r2 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r2 = r6.i2
            r4 = 0
            if (r2 == 0) goto L_0x008f
            if (r7 == 0) goto L_0x0090
            aq7 r2 = r6.n1
            boolean r2 = r2.d
            if (r2 != 0) goto L_0x0090
            aq7 r7 = r6.n1
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x008f
            aq7 r7 = r6.n1
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x008f
            r7 = r1
            goto L_0x0090
        L_0x008f:
            r7 = r4
        L_0x0090:
            r6.s1 = r1
            e0e r2 = defpackage.e0e.callAcceptIncoming
            if (r7 == 0) goto L_0x0099
            java.lang.String r5 = "video"
            goto L_0x009b
        L_0x0099:
            java.lang.String r5 = "audio"
        L_0x009b:
            r6.u(r2, r5)
            r6.m(r7)
            kg1 r7 = r6.p1
            fg1 r7 = r7.a
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r1 = r4
        L_0x00af:
            boolean r0 = r7.b()
            if (r0 != 0) goto L_0x00be
            kpa r0 = defpackage.fg1.r
            r7.e(r0)
            r6.w()
            goto L_0x00c1
        L_0x00be:
            r6.x()
        L_0x00c1:
            if (r1 == 0) goto L_0x00cd
            yn1 r7 = r6.t1
            r6.c(r7)
            w51 r7 = defpackage.w51.u0
            r6.k(r7, r3)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.B(boolean):void");
    }

    public final void C() {
        if (this.I0) {
            this.V0.log("OKRTCCall", "Can't start interaction twice. Ignore");
            return;
        }
        this.I0 = true;
        x();
        for (fg1 u : this.p1.i()) {
            this.t1.u(u, true);
        }
        boolean z = this.E0;
        m(z);
        u(e0e.callStart, z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            yn1 r0 = r6.t1
            xxe r1 = defpackage.xxe.c
            boolean r0 = r0.H(r1)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            if (r7 == 0) goto L_0x0039
            d r7 = r6.l1
            ji9 r1 = r6.y1
            boolean r1 = r1.c
            kq7 r7 = r7.z0
            if (r7 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x002b
            zuc r7 = r7.t
            if (r7 == 0) goto L_0x0039
            org.webrtc.ScreenCapturerAndroid r7 = r7.a
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x002b:
            fwc r7 = r7.u
            if (r7 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            h26 r7 = r7.o
            org.webrtc.ScreenCapturerAndroid r7 = r7.Y
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x0039:
            r7 = r0
        L_0x003a:
            w51 r1 = defpackage.w51.X
            if (r7 == 0) goto L_0x0063
            qld r2 = r6.k1
            d r3 = r6.l1
            r2.getClass()
            ewc r4 = new ewc
            r5 = 2
            r4.<init>(r2, r3, r7, r5)
            java.util.concurrent.ExecutorService r7 = r2.a
            r7.execute(r4)
            ji9 r7 = r6.y1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 1
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
            goto L_0x0088
        L_0x0063:
            qld r7 = r6.k1
            d r2 = r6.l1
            r7.getClass()
            flc r3 = new flc
            r4 = 16
            r3.<init>(r7, r4, r2)
            java.util.concurrent.ExecutorService r7 = r7.a
            r7.execute(r3)
            ji9 r7 = r6.y1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 0
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.D(boolean):void");
    }

    public final void E(boolean z) {
        if (i()) {
            if (!z) {
                if (!this.n1.c && this.n1.a() && this.n1.c) {
                    qld qld = this.k1;
                    qld.getClass();
                    qld.a.execute(new pld(qld, 0));
                } else if (nsa.A().g) {
                    qld qld2 = this.k1;
                    qld2.getClass();
                    qld2.a.execute(new pld(qld2, 0));
                }
            }
            kd1 kd1 = this.L1;
            if (z) {
                kd1.getClass();
            } else if (kd1.f.c) {
                if (!kd1.d(new sq1(0, 1, hi9.class, kd1.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            } else {
                return;
            }
            qld qld3 = this.k1;
            qld3.getClass();
            qld3.a.execute(new old(qld3, z, 0));
            ji9 ji9 = this.y1;
            boolean z2 = !z;
            if (ji9.e != z2) {
                ji9.e = z2;
                ji9.a();
            }
            x();
        }
    }

    public final void F(wq9 wq9) {
        qld qld = this.k1;
        if (qld != null) {
            boolean z = wq9.c;
            boolean z2 = this.a1;
            boolean z3 = wq9.d;
            boolean z4 = wq9.b;
            if (z2) {
                z |= z3;
                z4 |= z3;
                z3 = false;
            }
            boolean z5 = z4;
            boolean z6 = z;
            this.b = wq9;
            this.V0.log("OKRTCCall", "new debug params " + wq9);
            boolean z7 = this.a1;
            String str = wq9.f;
            o2.execute(new fy0(this, wq9, qld, z6, !z7 && z3 && str != null, str));
            oq0 oq0 = this.z1;
            oq0.a = wq9.a;
            oq0.b = z5;
            this.Z.i(new vod(oq0));
        }
    }

    public final void G(boolean z) {
        if (i()) {
            v("rtc.video.switch");
            m(z);
            x();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [rpa, java.lang.Object] */
    public final void H(bg1 bg1) {
        this.p1.f(new dqa(bg1, new Object(), new Object(), new Object(), new Object(), new Object(), new Object()), xad.a);
    }

    public final void a(oy0 oy0) {
        int i = obg.a[oy0.ordinal()];
        k(i != 1 ? i != 2 ? i != 3 ? i != 4 ? w51.P0 : w51.O0 : w51.N0 : w51.M0 : w51.L0, (Object) null);
    }

    public final void b(kq7 kq7) {
        this.V0.log("OKRTCCall", "onLocalMediaStreamChanged, " + jb9.c(kq7));
        this.s0.post(new ux0(this, 2));
    }

    public final void c(yn1 yn1) {
        a4c a4c = this.V0;
        a4c.log("OKRTCCall", "maybeSetTopologyState, " + yn1 + ", state=" + yn1.B(1));
        if (!this.c1) {
            a4c.log("OKRTCCall", "cant set " + yn1 + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.B0) {
            if (!this.s1) {
                a4c.log("OKRTCCall", "cant set " + yn1 + " to active state, conversation is not started yet");
                return;
            } else if (!this.A1) {
                a4c.log("OKRTCCall", "cant set " + yn1 + " to active state, user is not accepted call yet");
                return;
            }
        }
        yn1.Q(this.L0);
        jb9.e();
        if (true != yn1.A0) {
            yn1.A0 = true;
            yn1.F();
        }
        jb9.e();
        if (1 != yn1.z0) {
            yn1.z0 = 1;
            yn1.G();
        }
        this.y1.a();
    }

    public final void d(ji6 ji6) {
        this.V0.log("OKRTCCall", "hangup, " + jb9.c(ji6) + ", unknown");
        jb9.e();
        u(e0e.callHangup, ji6.toString());
        if (this.Z == null) {
            p(ji6, "hangup." + ji6 + ".unknown");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", (Object) ji6.toString());
            rod rod = this.Z;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("command", (Object) "hangup");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                rod.p = false;
                jb9.e();
                u3c u3c = new u3c(16, rod);
                rod.c.postDelayed(u3c, 8000);
                rod.d(new ka6(jSONObject2), true, new cw0(rod, u3c), (qod) null);
                this.Z0 = false;
                p(ji6, "hangup." + ji6 + ".unknown");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [jk4, java.lang.Object] */
    public final void e(xxe xxe, boolean z) {
        yn1 yn1;
        u38 u38;
        ar0 ar0;
        u38 u382;
        ar0 ar02;
        xxe xxe2 = xxe;
        xxe y = this.t1.y();
        this.e2.a(this.t1);
        yn1 yn12 = this.u1;
        if (yn12 != null) {
            yn12.L();
            this.u1 = null;
        }
        if (this.t1.H(xxe2)) {
            this.t1.L();
        } else {
            this.u1 = this.t1;
        }
        xxe xxe3 = xxe.b;
        xxe xxe4 = xxe.c;
        boolean z2 = true;
        if (xxe2 == xxe3) {
            ? obj = new Object();
            obj.e = this.t0;
            obj.h = this.p1;
            obj.g = this.y1;
            obj.i = this.Z;
            obj.s = this.X;
            obj.l = this.U0;
            a4c a4c = this.V0;
            obj.k = a4c;
            obj.m = this.c2;
            ag1 ag1 = this.u0;
            obj.j = ag1;
            obj.a = this.k1;
            obj.d = o2;
            obj.f = this.x0;
            obj.c = this.i1;
            obj.b = this.l1;
            obj.n = this.B1;
            obj.o = this.D1;
            obj.p = this.E1;
            obj.q = this.W1;
            obj.t = this.F1;
            imc imc = ag1.w;
            if (imc == null || (ar02 = (ar0) imc.b) == null || !ar02.a) {
                u382 = null;
            } else {
                if (this.f2 == null) {
                    this.f2 = new b0e(this.R1, a4c, ag1.A.a != null);
                }
                u382 = new u38(this.f2, (r38) ((ar0) this.u0.w.b).b, this.U0, this.F1, this.V0, this.D0);
            }
            obj.r = u382;
            if (obj.a == null || obj.e == null || obj.h == null || obj.g == null || obj.i == null || obj.j == null || obj.k == null || obj.l == null || obj.f == null || obj.c == null || obj.b == null || obj.o == null || obj.q == null || obj.t == null) {
                throw new IllegalStateException();
            }
            yn1 = new kk4(obj);
        } else if (xxe2 == xxe4) {
            g7d g7d = new g7d();
            g7d.e = this.t0;
            g7d.h = this.p1;
            g7d.g = this.y1;
            g7d.i = this.Z;
            g7d.j.add(new loc(this.V0));
            g7d.k.add(this.X);
            g7d.k.add(new qoc(this.V0));
            g7d.p = this.U0;
            g7d.q = this.c2;
            g7d.o = this.V0;
            g7d.m = this.u0;
            g7d.n = this.e1;
            g7d.a = this.k1;
            g7d.d = o2;
            g7d.f = this.x0;
            g7d.c = this.i1;
            g7d.b = this.l1;
            g7d.r = this.o1;
            g7d.s = z;
            g7d.t = this.D1;
            g7d.u = this.E1;
            g7d.v = this.W1;
            g7d.x = this.b2;
            g7d.l.add(this.Y);
            ag1 ag12 = this.u0;
            imc imc2 = ag12.w;
            if (imc2 == null || (ar0 = (ar0) imc2.c) == null || !ar0.a) {
                u38 = null;
            } else {
                if (this.f2 == null) {
                    this.f2 = new b0e(this.R1, this.V0, ag12.A.a != null);
                }
                u38 = new u38(this.f2, (r38) ((ar0) this.u0.w.c).b, this.U0, this.F1, this.V0, this.D0);
            }
            g7d.w = u38;
            g7d.y = this.u0.z;
            vte vte = this.F1;
            g7d.z = vte;
            g7d.A = this.G1;
            if (g7d.e == null || g7d.h == null || g7d.g == null || g7d.i == null || g7d.m == null || g7d.o == null || g7d.p == null || g7d.f == null || g7d.c == null || g7d.b == null || g7d.t == null || g7d.v == null || vte == null) {
                throw new IllegalStateException();
            }
            yn1 = new h7d(g7d);
        } else {
            throw new IllegalArgumentException("Unsupported topology: " + xxe2);
        }
        yn1.Q(this.L0);
        jb9.e();
        yn1.y0 = this;
        this.t1 = yn1;
        tg4 tg4 = this.e2;
        u38 u383 = yn1.x0;
        tg4.a.log("MediaAdaptation", "Set new condition provider source. Is null = " + (u383 == null));
        pn9 pn9 = tg4.b;
        if (pn9 != null) {
            pn9.a(tg4.e);
        }
        tg4.b = u383;
        if (u383 == null) {
            o38 o38 = new o38(1, (ssa) null, true);
            tg4.a.log("MediaAdaptation", "Since there are no new provider, trigger state change to " + o38);
            tg4.e.p(o38);
        } else {
            u383.d(tg4.e);
        }
        this.e2.b(this.t1);
        boolean z3 = y == xxe3;
        if (xxe2 != xxe4) {
            z2 = false;
        }
        if (z3 && z2) {
            k(w51.R0, (Object) null);
        }
        xxe y2 = this.t1.y();
        Iterator it = this.r1.iterator();
        while (it.hasNext()) {
            ((yxe) it.next()).onTopologyUpdated(y, y2);
        }
    }

    public final void f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(oy0.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.V0.log("OKRTCCall", zr6.i("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.z0;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((oy0) it.next());
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            a((oy0) it2.next());
        }
    }

    public final void g(JSONObject jSONObject) {
        boolean z = true;
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        qp4 qp4 = this.U1;
        ((c8d) qp4.c).w(jSONObject);
        ((c8d) qp4.c).x(jSONObject);
        if (optJSONArray != null) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                } else if ("ADD_PARTICIPANT".equalsIgnoreCase(optJSONArray.optString(i))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        StringBuilder sb = new StringBuilder("setFeatureAddParticipantEnabled, ");
        boolean z2 = jb9.a;
        sb.append(z ? "yes" : "no");
        this.V0.log("OKRTCCall", sb.toString());
        if (this.x1 != z) {
            this.x1 = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v65, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, java.lang.String, bg1] */
    /* JADX WARNING: type inference failed for: r5v66 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r28v6, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r29v3, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r30v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r31v4, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r32v4, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r33v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x068e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06b1 A[Catch:{ JSONException -> 0x06ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06ee A[Catch:{ JSONException -> 0x0713 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(org.json.JSONObject r39, boolean r40, boolean r41) {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            java.lang.String r3 = "RecordInfoParser"
            java.lang.String r4 = "Can't parse record info from parent"
            r38.g(r39)
            kg1 r0 = r1.p1
            fg1 r0 = r0.a
            boolean r5 = r1.w0
            w51 r6 = defpackage.w51.c
            w51 r7 = defpackage.w51.o
            xad r15 = defpackage.xad.a
            java.lang.String r12 = "topology"
            java.lang.String r11 = "CALLED"
            java.lang.String r10 = "hangup.in.connection.notification"
            java.lang.String r9 = "HUNGUP"
            java.lang.String r8 = "accepted.on.other.device.con"
            java.lang.String r13 = "state"
            java.lang.String r14 = "participants"
            r18 = r4
            java.lang.String r4 = "ACCEPTED"
            r19 = r3
            java.lang.String r3 = "OKRTCCall"
            r20 = r0
            if (r5 == 0) goto L_0x0166
            if (r41 != 0) goto L_0x0166
            java.lang.String r5 = "connection already handled"
            a4c r0 = r1.V0
            r0.log(r3, r5)
            kg1 r0 = r1.p1
            fg1 r0 = r0.a
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            org.json.JSONArray r14 = r2.getJSONArray(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r22 = r3
            r21 = r12
            r12 = 0
            r18 = 0
        L_0x0053:
            int r3 = r14.length()
            if (r12 >= r3) goto L_0x00ca
            org.json.JSONObject r3 = r14.getJSONObject(r12)
            r40 = r14
            bg1 r14 = defpackage.f46.F(r3)
            r19 = r12
            java.lang.String r12 = r3.getString(r13)
            r23 = r13
            bg1 r13 = r0.a
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x009a
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x007c
            r18 = 1
            goto L_0x00c3
        L_0x007c:
            boolean r3 = r4.equals(r12)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            r1.k(r7, r3)
            r1.p(r3, r8)
            goto L_0x0165
        L_0x008b:
            r3 = 0
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r1.k(r6, r3)
            r1.p(r3, r10)
            goto L_0x0165
        L_0x009a:
            boolean r13 = r4.equals(r12)
            if (r13 == 0) goto L_0x00af
            r5.add(r14)
            epd r12 = r1.T1
            die r12 = r12.f
            dqa r3 = r12.p(r14, r3, r15)
            r2.add(r3)
            goto L_0x00c3
        L_0x00af:
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r5.add(r14)
            epd r12 = r1.T1
            die r12 = r12.f
            dqa r3 = r12.q(r14, r3, r15)
            r2.add(r3)
        L_0x00c3:
            int r12 = r19 + 1
            r14 = r40
            r13 = r23
            goto L_0x0053
        L_0x00ca:
            kg1 r0 = r1.p1
            r3 = 0
            r0.g(r3, r2)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00fe
            if (r18 != 0) goto L_0x00fe
            java.lang.String r0 = "Conversation has no participants"
            a4c r2 = r1.V0
            r3 = r22
            r2.log(r3, r0)
            va8 r0 = r1.k2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r2 = new ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Conversation without participants and current user"
            r3.<init>(r4)
            r2.<init>(r3)
            r0.E(r2)
            w51 r0 = defpackage.w51.w0
            r2 = 0
            r1.k(r0, r2)
            java.lang.String r0 = "conversation.without.participants"
            r1.p(r2, r0)
            goto L_0x0165
        L_0x00fe:
            r3 = r22
            kg1 r0 = r1.p1
            zad r2 = r0.k
            java.util.Map r0 = r0.d(r2)
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0115:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x012b
            java.lang.Object r4 = r0.next()
            bg1 r4 = (defpackage.bg1) r4
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto L_0x0115
            r2.add(r4)
            goto L_0x0115
        L_0x012b:
            kg1 r0 = r1.p1
            r4 = 0
            r0.m(r4, r2)
            oq9 r0 = r1.Q1
            ji9 r2 = r1.y1
            r0.getClass()
            dpd r0 = defpackage.oq9.h(r2)
            glc r2 = r1.P1
            r2.e(r0)
            java.lang.String r0 = "handleNewTopology"
            a4c r2 = r1.V0
            r2.log(r3, r0)
            r2 = r39
            r0 = r21
            java.lang.String r0 = r2.getString(r0)
            xxe r0 = defpackage.xxe.a(r0)
            yn1 r2 = r1.t1
            boolean r2 = r2.H(r0)
            if (r2 != 0) goto L_0x0160
            r2 = 0
            r1.e(r0, r2)
        L_0x0160:
            yn1 r0 = r1.t1
            r1.c(r0)
        L_0x0165:
            return
        L_0x0166:
            r0 = r12
            r23 = r13
            r5 = 1
            r1.w0 = r5
            java.lang.String r5 = "connected"
            a4c r12 = r1.V0
            r12.log(r3, r5)
            java.lang.String r5 = "id"
            java.lang.String r5 = r2.getString(r5)
            gw3 r12 = r1.D0
            boolean r13 = r12 instanceof defpackage.hw3
            if (r13 == 0) goto L_0x0183
            hw3 r12 = (defpackage.hw3) r12
            r12.a = r5
        L_0x0183:
            java.lang.String r5 = "joinLink"
            boolean r12 = r2.has(r5)
            if (r12 == 0) goto L_0x0191
            java.lang.String r5 = r2.getString(r5)
            r1.F0 = r5
        L_0x0191:
            if (r40 == 0) goto L_0x0197
            r5 = 1
            r1.R0 = r5
            goto L_0x01a2
        L_0x0197:
            boolean r5 = r1.R0
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = "onConnected isConcurrent from api"
            a4c r12 = r1.V0
            r12.log(r3, r5)
        L_0x01a2:
            org.json.JSONArray r5 = r2.getJSONArray(r14)
            kg1 r12 = r1.p1
            fg1 r14 = r12.a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r21 = r0
            r22 = r3
            r24 = r11
            r40 = r13
            r0 = 0
            r2 = 0
            r3 = 0
            r11 = 0
        L_0x01c0:
            int r13 = r5.length()
            if (r3 >= r13) goto L_0x03cd
            org.json.JSONObject r13 = r5.getJSONObject(r3)
            r25 = r5
            r5 = r23
            r23 = r0
            java.lang.String r0 = r13.getString(r5)
            r34 = r5
            bg1 r5 = defpackage.f46.F(r13)
            r35 = r2
            if (r3 != 0) goto L_0x01e6
            ag1 r2 = r1.u0
            yf1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 != 0) goto L_0x01ee
        L_0x01e6:
            bg1 r2 = r14.a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x034e
        L_0x01ee:
            ag1 r2 = r1.u0
            yf1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 == 0) goto L_0x022e
            o61 r2 = r14.p
            if (r2 != 0) goto L_0x0200
            o61 r2 = defpackage.f46.k(r13)
            r14.p = r2
        L_0x0200:
            bg1 r2 = r14.a
            if (r2 != 0) goto L_0x022e
            r14.a = r5
            pq9 r28 = new pq9
            r28.<init>()
            pq9 r29 = new pq9
            r29.<init>()
            pq9 r30 = new pq9
            r30.<init>()
            pq9 r31 = new pq9
            r31.<init>()
            pq9 r32 = new pq9
            r32.<init>()
            pq9 r33 = new pq9
            r33.<init>()
            dqa r2 = new dqa
            r26 = r2
            r27 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            if (r2 == 0) goto L_0x0234
            r12.add(r2)
        L_0x0234:
            java.lang.String r2 = "restricted"
            r5 = 0
            boolean r2 = r13.optBoolean(r2, r5)
            boolean r5 = r14.b()
            if (r5 != 0) goto L_0x0261
            boolean r5 = r4.equals(r0)
            if (r5 == 0) goto L_0x0253
            r5 = 0
            r1.k(r7, r5)
            r1.p(r5, r8)
        L_0x024e:
            r6 = r5
            r14 = r6
            r8 = 1
            goto L_0x043a
        L_0x0253:
            r5 = 0
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0262
            r1.k(r6, r5)
            r1.p(r5, r10)
            goto L_0x024e
        L_0x0261:
            r5 = 0
        L_0x0262:
            java.lang.String r0 = "permissions"
            org.json.JSONArray r0 = r13.optJSONArray(r0)
            epd r11 = r1.T1
            hd9 r11 = r11.a
            java.util.List r11 = r11.h(r13, r15)
            r14.q = r11
            if (r0 == 0) goto L_0x0293
            r11 = 0
        L_0x0275:
            int r5 = r0.length()
            if (r11 >= r5) goto L_0x0293
            java.lang.String r5 = r0.optString(r11)
            r23 = r0
            java.lang.String r0 = "MUTE_PARTICIPANTS"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x028d
            r5 = 1
            r1.a = r5
            goto L_0x0294
        L_0x028d:
            r5 = 1
            int r11 = r11 + 1
            r0 = r23
            goto L_0x0275
        L_0x0293:
            r5 = 1
        L_0x0294:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r11 = "offerTo"
            org.json.JSONArray r11 = r13.optJSONArray(r11)
            java.lang.String r5 = "offerToTypes"
            org.json.JSONArray r5 = r13.optJSONArray(r5)
            r23 = r2
            java.lang.String r2 = "offerToDeviceIdxs"
            org.json.JSONArray r2 = r13.optJSONArray(r2)
            r26 = r6
            r27 = r7
            if (r11 == 0) goto L_0x0308
            r6 = 0
        L_0x02b4:
            int r7 = r11.length()
            if (r6 >= r7) goto L_0x0308
            if (r5 == 0) goto L_0x02cf
            int r7 = r5.length()
            if (r6 >= r7) goto L_0x02cf
            java.lang.String r7 = r5.optString(r6)
            r28 = r5
            java.lang.String r5 = "GROUP"
            boolean r5 = r5.equals(r7)
            goto L_0x02d2
        L_0x02cf:
            r28 = r5
            r5 = 0
        L_0x02d2:
            if (r2 == 0) goto L_0x02e1
            int r7 = r2.length()
            if (r6 >= r7) goto L_0x02e1
            int r7 = r2.optInt(r6)
            r29 = r2
            goto L_0x02e4
        L_0x02e1:
            r29 = r2
            r7 = 0
        L_0x02e4:
            bg1 r2 = new bg1
            java.lang.String r30 = r11.optString(r6)
            r32 = r8
            r31 = r9
            long r8 = java.lang.Long.parseLong(r30)
            if (r5 == 0) goto L_0x02f6
            r5 = 2
            goto L_0x02f7
        L_0x02f6:
            r5 = 1
        L_0x02f7:
            r2.<init>(r5, r7, r8)
            r0.add(r2)
            int r6 = r6 + 1
            r5 = r28
            r2 = r29
            r9 = r31
            r8 = r32
            goto L_0x02b4
        L_0x0308:
            r32 = r8
            r31 = r9
            java.util.ArrayList r2 = defpackage.f46.y(r13)
            java.util.ArrayList r5 = r14.d
            r5.clear()
            r5.addAll(r2)
            w51 r2 = defpackage.w51.G0
            r1.k(r2, r14)
            kd1 r8 = r1.L1
            r2 = 2
            java.util.Map r11 = r8.g(r15, r2)
            java.lang.String r2 = "handleConversationParticipants"
            r5 = 1
            r6 = r32
            r7 = r31
            r9 = r13
            r28 = r10
            r10 = r2
            r2 = r24
            r7 = r12
            r6 = r21
            r12 = r5
            r36 = r40
            r37 = r13
            r16 = r34
            r5 = 1
            r13 = r15
            r17 = r14
            r6 = 0
            r14 = r15
            r8.n(r9, r10, r11, r12, r13, r14)
            r8 = r5
            r11 = r23
            r9 = r37
            r23 = r0
        L_0x034b:
            r0 = r36
            goto L_0x039d
        L_0x034e:
            r36 = r40
            r26 = r6
            r27 = r7
            r32 = r8
            r31 = r9
            r28 = r10
            r7 = r12
            r37 = r13
            r17 = r14
            r2 = r24
            r16 = r34
            r6 = 0
            r8 = 1
            boolean r9 = r4.equals(r0)
            if (r9 == 0) goto L_0x0379
            epd r0 = r1.T1
            die r0 = r0.f
            r9 = r37
            dqa r0 = r0.p(r5, r9, r15)
            r7.add(r0)
            goto L_0x034b
        L_0x0379:
            r9 = r37
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0398
            epd r0 = r1.T1
            die r0 = r0.f
            dqa r0 = r0.q(r5, r9, r15)
            r7.add(r0)
            int r0 = r5.b
            r5 = 2
            boolean r0 = defpackage.au1.c(r0, r5)
            if (r0 == 0) goto L_0x034b
            r35 = r8
            goto L_0x034b
        L_0x0398:
            r0 = r36
            r0.add(r5)
        L_0x039d:
            epd r5 = r1.T1
            ey1 r5 = r5.e
            dg1 r5 = r5.n(r9)
            if (r5 == 0) goto L_0x03b0
            id1 r9 = r1.W1
            hqa r9 = r9.n
            bg1 r10 = r5.b
            r9.onStateChanged(r10, r5)
        L_0x03b0:
            int r3 = r3 + 1
            r40 = r0
            r24 = r2
            r12 = r7
            r14 = r17
            r0 = r23
            r5 = r25
            r6 = r26
            r7 = r27
            r10 = r28
            r9 = r31
            r8 = r32
            r2 = r35
            r23 = r16
            goto L_0x01c0
        L_0x03cd:
            r23 = r0
            r35 = r2
            r7 = r12
            r6 = 0
            r8 = 1
            r0 = r40
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x03df:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03f1
            java.lang.Object r4 = r3.next()
            dqa r4 = (defpackage.dqa) r4
            bg1 r4 = r4.a
            r2.add(r4)
            goto L_0x03df
        L_0x03f1:
            kg1 r3 = r1.p1
            zad r4 = r3.k
            java.util.Map r3 = r3.d(r4)
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0401:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0417
            java.lang.Object r4 = r3.next()
            bg1 r4 = (defpackage.bg1) r4
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L_0x0401
            r0.add(r4)
            goto L_0x0401
        L_0x0417:
            kg1 r2 = r1.p1
            r2.m(r6, r0)
            kg1 r0 = r1.p1
            r0.g(r6, r7)
            oq9 r0 = r1.Q1
            ji9 r2 = r1.y1
            r0.getClass()
            dpd r0 = defpackage.oq9.h(r2)
            glc r2 = r1.P1
            r2.e(r0)
            qcg r14 = new qcg
            r0 = r23
            r2 = r35
            r14.<init>(r0, r11, r2)
        L_0x043a:
            if (r14 != 0) goto L_0x043d
            return
        L_0x043d:
            r2 = r39
            r0 = r21
            java.lang.String r0 = r2.optString(r0)
            xxe r0 = defpackage.xxe.a(r0)
            xxe r3 = defpackage.xxe.a
            xxe r4 = defpackage.xxe.b
            if (r0 != r3) goto L_0x0494
            a4c r3 = r1.V0
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "invalid.topology.identity."
            r7.<init>(r9)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r5.<init>(r7)
            java.lang.String r7 = "conn.notify.topology"
            r9 = r22
            r3.logException(r9, r7, r5)
            kg1 r3 = r1.p1
            int r3 = r3.r()
            if (r3 <= r8) goto L_0x0476
            xxe r3 = defpackage.xxe.c
            goto L_0x0477
        L_0x0476:
            r3 = r4
        L_0x0477:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Unknown topology specified ("
            r5.<init>(r7)
            r5.append(r0)
            java.lang.String r0 = ") , use "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            a4c r5 = r1.V0
            r5.log(r9, r0)
            r0 = r3
            goto L_0x0496
        L_0x0494:
            r9 = r22
        L_0x0496:
            boolean r3 = r1.R0
            if (r3 == 0) goto L_0x04ae
            java.lang.String r3 = "   isConcurrent"
            a4c r5 = r1.V0
            r5.log(r9, r3)
            boolean r3 = r1.B0
            if (r3 == 0) goto L_0x04aa
            r3 = 0
            r1.e(r0, r3)
            goto L_0x04ab
        L_0x04aa:
            r3 = 0
        L_0x04ab:
            r1.B0 = r3
            goto L_0x04af
        L_0x04ae:
            r3 = 0
        L_0x04af:
            yn1 r5 = r1.t1
            boolean r5 = r5.H(r0)
            if (r5 == 0) goto L_0x04b9
            if (r41 == 0) goto L_0x04bc
        L_0x04b9:
            r1.e(r0, r3)
        L_0x04bc:
            java.util.List r0 = r14.b
            if (r0 == 0) goto L_0x04f0
            yn1 r3 = r1.t1
            boolean r3 = r3.H(r4)
            if (r3 == 0) goto L_0x04f0
            java.util.Iterator r0 = r0.iterator()
        L_0x04cc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04f0
            java.lang.Object r3 = r0.next()
            bg1 r3 = (defpackage.bg1) r3
            kg1 r4 = r1.p1     // Catch:{ NumberFormatException -> 0x04df }
            fg1 r3 = r4.j(r3)     // Catch:{ NumberFormatException -> 0x04df }
            goto L_0x04e7
        L_0x04df:
            java.lang.String r3 = "Cant get participant id from responders"
            a4c r4 = r1.V0
            r4.log(r9, r3)
            r3 = r6
        L_0x04e7:
            if (r3 == 0) goto L_0x04cc
            yn1 r4 = r1.t1
            r5 = 0
            r4.u(r3, r5)
            goto L_0x04cc
        L_0x04f0:
            java.lang.String r0 = "options"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            if (r0 == 0) goto L_0x04fb
            r1.f(r0)
        L_0x04fb:
            boolean r0 = r1.B0
            if (r0 != 0) goto L_0x050a
            boolean r0 = r1.C0
            if (r0 == 0) goto L_0x0504
            goto L_0x050a
        L_0x0504:
            yn1 r0 = r1.t1
            r1.c(r0)
            goto L_0x0536
        L_0x050a:
            boolean r0 = r14.a
            r1.K1 = r0
            boolean r0 = r14.a
            if (r0 == 0) goto L_0x051a
            id1 r0 = r1.W1
            mrf r0 = r0.d
            r0.onMeInWaitingRoomChanged(r8)
            goto L_0x0536
        L_0x051a:
            id1 r0 = r1.W1
            mrf r0 = r0.d
            r3 = 0
            r0.onMeInWaitingRoomChanged(r3)
            yn1 r0 = r1.t1
            r1.c(r0)
            oy0 r0 = defpackage.oy0.b
            java.util.EnumSet r3 = r1.z0
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0536
            w51 r0 = defpackage.w51.P0
            r1.k(r0, r6)
        L_0x0536:
            boolean r0 = r1.R0
            if (r0 == 0) goto L_0x0553
            boolean r0 = r14.a
            if (r0 != 0) goto L_0x0553
            e0e r0 = defpackage.e0e.callAcceptConcurrent
            r1.u(r0, r6)
            boolean r0 = r20.b()
            ji9 r3 = r1.y1
            boolean r3 = r3.f
            r1.B(r3)
            if (r0 == 0) goto L_0x0553
            r38.w()
        L_0x0553:
            vk8 r0 = r1.R1
            zbg r3 = r1.g1
            java.lang.Object r4 = r0.k
            android.os.Handler r4 = (android.os.Handler) r4
            android.os.Looper r5 = r4.getLooper()
            java.lang.Thread r5 = r5.getThread()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            boolean r5 = defpackage.tpa.f(r5, r7)
            if (r5 == 0) goto L_0x0575
            java.lang.Object r0 = r0.f
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r0.remove(r3)
            goto L_0x057e
        L_0x0575:
            f0e r5 = new f0e
            r7 = 1
            r5.<init>(r0, r3, r7)
            r4.post(r5)
        L_0x057e:
            vk8 r0 = r1.R1
            zbg r3 = r1.g1
            r0.m(r3)
            vk8 r0 = r1.R1
            nh3 r3 = r1.h1
            java.lang.Object r0 = r0.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r3)
            vk8 r0 = r1.R1
            nh3 r3 = r1.h1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r7 = 5
            r0.c(r3, r7, r4)
            vk8 r0 = r1.R1
            pl5 r3 = r1.c2
            r9 = 1
            r0.c(r3, r9, r4)
            vk8 r0 = r1.R1
            java.lang.Object r3 = r0.k
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r5 = r0.m
            i0e r5 = (defpackage.i0e) r5
            r3.removeCallbacks(r5)
            r11 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r5, r11)
            java.lang.Object r3 = r0.l
            sd7 r3 = (defpackage.sd7) r3
            if (r3 == 0) goto L_0x05bf
            defpackage.dm4.a(r3)
        L_0x05bf:
            r0.l = r6
            o0a r3 = defpackage.qy9.l(r9, r4)
            ztc r5 = defpackage.ce.a()
            r0a r3 = r3.n(r5)
            gd1 r5 = new gd1
            r9 = 23
            r5.<init>(r9, r0)
            e0a r9 = new e0a
            r10 = 1
            r9.<init>(r3, r5, r10)
            ztc r3 = defpackage.muc.a()
            r0a r3 = r9.n(r3)
            gd1 r5 = new gd1
            java.lang.Object r9 = r0.b
            aab r9 = (defpackage.aab) r9
            r10 = 24
            r5.<init>(r10, r9)
            e0a r9 = new e0a
            r10 = 3
            r9.<init>(r3, r5, r10)
            ztc r3 = defpackage.ce.a()
            r0a r3 = r9.n(r3)
            nof r5 = new nof
            r5.<init>(r0)
            sd7 r3 = r3.p(r5)
            r0.l = r3
            nh3 r3 = new nh3
            java.lang.Object r5 = r0.h
            a4c r5 = (defpackage.a4c) r5
            r9 = 0
            r3.<init>(r9, r5)
            r0.c(r3, r7, r4)
            boolean r0 = r14.c
            if (r0 == 0) goto L_0x061c
            w51 r0 = defpackage.w51.v0
            r1.k(r0, r6)
        L_0x061c:
            java.lang.String r0 = "tamtamMultichatId"
            long r3 = r2.optLong(r0)
            long r3 = -r3
            r1.f1 = r3
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0634
            w51 r0 = defpackage.w51.A0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.k(r0, r3)
        L_0x0634:
            rh1 r3 = r1.Z1
            java.lang.String r0 = "recordInfo"
            aab r4 = r3.a
            r4.getClass()
            boolean r5 = r2.has(r0)     // Catch:{ JSONException -> 0x065f }
            if (r5 == 0) goto L_0x0663
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x065f }
            gpd r14 = defpackage.aab.f(r0)     // Catch:{ JSONException -> 0x064c }
            goto L_0x065a
        L_0x064c:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "Can't parse record info"
            java.lang.Object r7 = r4.a     // Catch:{ JSONException -> 0x065f }
            a4c r7 = (defpackage.a4c) r7     // Catch:{ JSONException -> 0x065f }
            r8 = r19
            r7.logException(r8, r0, r5)     // Catch:{ JSONException -> 0x065d }
            goto L_0x0663
        L_0x065a:
            r5 = r18
            goto L_0x066f
        L_0x065d:
            r0 = move-exception
            goto L_0x0665
        L_0x065f:
            r0 = move-exception
            r8 = r19
            goto L_0x0665
        L_0x0663:
            r14 = r6
            goto L_0x065a
        L_0x0665:
            java.lang.Object r4 = r4.a
            a4c r4 = (defpackage.a4c) r4
            r5 = r18
            r4.logException(r8, r5, r0)
            r14 = r6
        L_0x066f:
            if (r14 != 0) goto L_0x0672
            goto L_0x0682
        L_0x0672:
            id1 r0 = r3.b
            ncc r0 = r0.i
            oh1 r3 = new oh1
            mh1 r4 = defpackage.wmd.I(r14)
            r3.<init>(r15, r4)
            r0.onRecordStarted(r3)
        L_0x0682:
            java.lang.String r0 = "pinnedParticipantId"
            boolean r3 = r2.isNull(r0)
            java.lang.String r0 = r2.optString(r0, r6)
            if (r3 != 0) goto L_0x0697
            if (r0 == 0) goto L_0x0697
            bg1 r0 = defpackage.bg1.a(r0)
            r1.I1 = r0
            goto L_0x0699
        L_0x0697:
            r1.I1 = r6
        L_0x0699:
            qp4 r0 = r1.U1
            java.lang.Object r0 = r0.o
            c8d r0 = (defpackage.c8d) r0
            r0.t(r2)
            t01 r3 = r1.a2
            java.lang.String r0 = "asrInfo"
            ph4 r4 = r3.a
            r4.getClass()
            boolean r7 = r2.has(r0)     // Catch:{ JSONException -> 0x06ba }
            if (r7 == 0) goto L_0x06bc
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x06ba }
            o01 r14 = defpackage.ph4.s(r0)     // Catch:{ JSONException -> 0x06ba }
            goto L_0x06c8
        L_0x06ba:
            r0 = move-exception
            goto L_0x06be
        L_0x06bc:
            r14 = r6
            goto L_0x06c8
        L_0x06be:
            java.lang.Object r4 = r4.a
            a4c r4 = (defpackage.a4c) r4
            java.lang.String r7 = "AsrParser"
            r4.logException(r7, r5, r0)
            goto L_0x06bc
        L_0x06c8:
            if (r14 != 0) goto L_0x06cb
            goto L_0x06d7
        L_0x06cb:
            id1 r0 = r3.b
            ot r0 = r0.m
            p01 r3 = new p01
            r3.<init>(r15, r14)
            r0.onAsrRecordStarted(r3)
        L_0x06d7:
            qp4 r0 = r1.U1
            java.lang.Object r0 = r0.s0
            r1 = r0
            bdb r1 = (defpackage.bdb) r1
            java.lang.Object r0 = r1.c
            r3 = r0
            l7b r3 = (defpackage.l7b) r3
            r3.getClass()
            java.lang.String r0 = "urlSharingInfo"
            boolean r4 = r2.has(r0)     // Catch:{ JSONException -> 0x0713 }
            if (r4 == 0) goto L_0x0715
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x0713 }
            java.lang.String r2 = "initiatorId"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ JSONException -> 0x0713 }
            bg1 r2 = defpackage.bg1.a(r2)     // Catch:{ JSONException -> 0x0713 }
            java.lang.String r4 = "sharedUrl"
            java.lang.String r4 = defpackage.f8.t(r0, r4)     // Catch:{ JSONException -> 0x0713 }
            java.lang.Object r5 = r3.c     // Catch:{ JSONException -> 0x0713 }
            yb9 r5 = (defpackage.yb9) r5     // Catch:{ JSONException -> 0x0713 }
            r5.getClass()     // Catch:{ JSONException -> 0x0713 }
            zad r0 = defpackage.yb9.e(r0)     // Catch:{ JSONException -> 0x0713 }
            ylc r14 = new ylc     // Catch:{ JSONException -> 0x0713 }
            r14.<init>(r2, r4, r0)     // Catch:{ JSONException -> 0x0713 }
            goto L_0x0723
        L_0x0713:
            r0 = move-exception
            goto L_0x0717
        L_0x0715:
            r14 = r6
            goto L_0x0723
        L_0x0717:
            java.lang.Object r2 = r3.b
            a4c r2 = (defpackage.a4c) r2
            java.lang.String r3 = "UrlSharingParser"
            java.lang.String r4 = "Can't parse url sharing"
            r2.logException(r3, r4, r0)
            goto L_0x0715
        L_0x0723:
            if (r14 != 0) goto L_0x0726
            goto L_0x0741
        L_0x0726:
            java.lang.String r0 = r14.b
            if (r0 == 0) goto L_0x0732
            jpd r2 = new jpd
            bg1 r3 = r14.a
            r2.<init>(r3, r0)
            goto L_0x0733
        L_0x0732:
            r2 = r6
        L_0x0733:
            zn1 r0 = new zn1
            zad r3 = r14.c
            r0.<init>(r3, r2)
            java.lang.Object r1 = r1.b
            j9f r1 = (defpackage.j9f) r1
            r1.onUrlSharingInfoUpdated(r0)
        L_0x0741:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.h(org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean i() {
        if (!this.A0) {
            return true;
        }
        this.V0.log("OKRTCCall", "Call is already destroyed, reason=" + this.v0);
        return false;
    }

    public final void j(bg1 bg1, Boolean bool, Boolean bool2, qod qod) {
        a4c a4c = this.V0;
        a4c.log("OKRTCCall", "addParticipant, participant=" + bg1);
        if (i()) {
            fg1 j = this.p1.j(bg1);
            die die = this.S1.g;
            Long g = ((ece) die.o).g();
            if (g != null) {
                long longValue = g.longValue();
                HashMap hashMap = new HashMap();
                qz7 qz7 = (qz7) die.a;
                hashMap.put("vcid", ((d4c) qz7.b).conversationId);
                hashMap.put("stat_time_delta", String.valueOf(longValue));
                hashMap.put("network_type", jb9.b((ConnectivityManager) die.b, (TelephonyManager) die.c));
                die.k(bg1, j, hashMap);
                ((d4c) qz7.b).log(d4c.COLLECTOR_WEBRTC, "callAddParticipant", (Map) hashMap);
            }
            try {
                this.Z.d(f46.s(bg1, bool, bool2.booleanValue()), false, new dy0(this, bg1, qod), qod);
            } catch (JSONException e) {
                a4c.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final void k(w51 w51, Object obj) {
        a4c a4c = this.V0;
        a4c.log("OKRTCCall", "dispatch [ " + w51 + " ]");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Iterator it = this.M0.iterator();
            while (it.hasNext()) {
                try {
                    ((my0) it.next()).onEvent(this, w51, obj);
                } catch (Throwable th) {
                    a4c.logException("OKRTCCall", "Error on dispatch event " + w51, th);
                }
            }
            return;
        }
        this.s0.post(new f5((Object) this, (Object) w51, obj, 7));
    }

    public final void l(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rooms")) {
                kxf kxf = (kxf) this.U1.a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                if (kxf.b) {
                    ipd E = ((pl8) kxf.o).E(jSONObject2);
                    if (E != null) {
                        ((sl1) kxf.X).e(E);
                    }
                }
            }
        } catch (JSONException e) {
            this.V0.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void m(boolean z) {
        if (i()) {
            if (z) {
                this.n1.a();
            }
            kd1 kd1 = this.L1;
            if (!z) {
                kd1.getClass();
            } else if (kd1.f.d) {
                if (!kd1.d(new sq1(0, 3, hi9.class, kd1.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            } else {
                return;
            }
            if (z && this.y1.g) {
                this.E1.getClass();
            }
            a4c a4c = this.V0;
            a4c.log("OKRTCCall", "Update my settings with video enabled=" + z);
            ji9 ji9 = this.y1;
            if (ji9.f != z) {
                ji9.f = z;
                ji9.a();
            }
            k(w51.X, (Object) null);
        }
    }

    public final void n(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return;
        }
        if (optJSONObject.opt("sdk") != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk");
            if (optJSONObject2 != null && optJSONObject2.optString("type").equals("bad-net") && this.X0) {
                rf0 rf0 = this.W0;
                rf0.getClass();
                if ("bad-net".equals(optJSONObject2.optString("type"))) {
                    rf0.m = optJSONObject2.optBoolean("value");
                    rf0.n = optJSONObject2.has("value");
                    rf0.o = optJSONObject2.optDouble("rtt");
                    rf0.p = optJSONObject2.optDouble("loss");
                    rf0.a();
                    return;
                }
                return;
            }
            return;
        }
        this.s0.post(new f5((Object) this, (Object) f46.E(jSONObject), (Object) optJSONObject, 8));
    }

    public final void o(String str) {
        k(w51.c, (Object) null);
        rod rod = this.Z;
        if (rod != null) {
            rod.g();
        }
        p((ji6) null, "conversation_ended." + str);
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.s0.post(new ux0(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(ji6 ji6, String str) {
        ConversationEndReason conversationEndReason;
        long j;
        int i;
        this.V0.log("OKRTCCall", wg0.i("destroy.reason=", str));
        jb9.e();
        if (this.A0) {
            this.V0.log("OKRTCCall", "   already destroyed, reason=" + this.v0);
            return;
        }
        this.A0 = true;
        va8 va8 = this.k2;
        switch (ji6 == null ? -1 : ki6.$EnumSwitchMapping$0[ji6.ordinal()]) {
            case -1:
                conversationEndReason = null;
                break;
            case 1:
                conversationEndReason = ConversationEndReason.SignalingTimeout.INSTANCE;
                break;
            case 2:
                conversationEndReason = ConversationEndReason.Busy.INSTANCE;
                break;
            case 3:
                conversationEndReason = ConversationEndReason.Missed.INSTANCE;
                break;
            case 4:
                conversationEndReason = ConversationEndReason.Rejected.INSTANCE;
                break;
            case 5:
                conversationEndReason = new ConversationEndReason.Error(new RuntimeException("Call error"));
                break;
            case 6:
                conversationEndReason = ConversationEndReason.Hangup.INSTANCE;
                break;
            case 7:
                conversationEndReason = ConversationEndReason.Canceled.INSTANCE;
                break;
            case 8:
                conversationEndReason = ConversationEndReason.CallTimeout.INSTANCE;
                break;
            case 9:
                conversationEndReason = ConversationEndReason.RemovedFromCall.INSTANCE;
                break;
            case 10:
                conversationEndReason = new ConversationEndReason.ObsoleteClient((String) null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        va8.E(conversationEndReason);
        c11 c11 = this.S1.l;
        o23 o23 = (o23) c11.c;
        o23.o = null;
        try {
            ((Context) o23.a).unregisterReceiver((an) o23.X);
        } catch (Exception e) {
            ((a4c) o23.b).log("CallBatteryRetriever", wg0.i("Can't unregister BroadcastReceiver: ", e.getMessage()));
        }
        b11 b11 = (b11) c11.e;
        if (b11 != null && c11.a) {
            b11 b112 = (b11) c11.f;
            b11 b113 = (b11) c11.g;
            vte vte = (vte) c11.d;
            if (b112 == null || b113 == null) {
                ((wte) vte).getClass();
                j = SystemClock.elapsedRealtime() - b11.c;
                i = 0;
            } else {
                i = b113.b - b112.b;
                j = b113.c - b112.c;
            }
            Long a3 = ((wte) vte).a();
            if (a3 != null) {
                Map a0 = mz7.a0(new kpa("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), new kpa("stat_time_delta", EventItemValueKt.toEventItemValue(j)), new kpa("timestamp", EventItemValueKt.toEventItemValue(a3.longValue())));
                EventItemsMap eventItemsMap = (EventItemsMap) c11.i;
                if (eventItemsMap != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
                    linkedHashMap.putAll(a0);
                    ((CallAnalyticsSender) c11.b).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(linkedHashMap)).build());
                }
            }
        }
        q7 q7Var = this.S1.m;
        q7Var.b.a();
        q7Var.c.c = null;
        oe1 oe1 = this.y0;
        if (oe1 != null) {
            oe1.a();
        }
        bg4 bg4 = this.E1;
        ((bi) ((qz7) bg4.X).b).getClass();
        pi piVar = (pi) bg4.Y;
        if (!piVar.i) {
            piVar.i = true;
            piVar.c.removeCallbacksAndMessages((Object) null);
            piVar.c.postAtFrontOfQueue(new b(9, (Object) piVar));
            piVar.h.a();
            piVar.b.quitSafely();
            piVar.f.clear();
            piVar.d.quitSafely();
            piVar.a.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.q1.clear();
        this.r1.clear();
        vk8 vk8 = this.R1;
        vk8.g = true;
        ((Handler) vk8.k).removeCallbacks((i0e) vk8.m);
        ((LinkedHashSet) vk8.f).clear();
        sd7 sd7 = (sd7) vk8.l;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        vk8.l = null;
        this.s0.removeCallbacks(this.J0);
        this.t1.L();
        tg4 tg4 = this.e2;
        if (tg4 != null) {
            tg4.a(this.t1);
        }
        this.t1 = new zs4(this.p1, this.u0, this.V0, this.U0, this.W1);
        yn1 yn1 = this.u1;
        if (yn1 != null) {
            yn1.L();
            this.u1 = null;
        }
        b0e b0e = this.f2;
        if (b0e != null) {
            ((HashMap) b0e.a.d).remove(b0e);
        }
        v("rtc.destroy." + str);
        this.v0 = str;
        if (this.K0) {
            this.G0 = (SystemClock.elapsedRealtime() - this.H0) + this.G0;
            this.K0 = false;
        }
        long j3 = this.G0;
        if (j3 == 0) {
            v("rtc.connected.time2.-1");
        } else {
            long j4 = j3 / 60000;
            this.G0 = j4;
            this.G0 = Math.min(j4, 10);
            v("rtc.connected.time2." + this.G0);
        }
        rod rod = this.Z;
        if (rod != null && this.Z0) {
            rod.k.remove(this.c);
            this.Z.l.remove(this.o);
            this.Z.g();
            this.Z = null;
        }
        this.p1.h();
        kg1 kg1 = this.p1;
        kg1.e.b = wz4.a;
        kg1.i = null;
        kg1.f.clear();
        kg1.g.clear();
        kg1.h.clear();
        kg1.c.o();
        d dVar = this.l1;
        dVar.A0 = null;
        kq7 kq7 = dVar.z0;
        if (kq7 != null) {
            kq7.k((VideoSink) null);
        }
        d dVar2 = this.l1;
        dVar2.v0.log("SlmsSource", "release");
        dVar2.y0.clear();
        dVar2.X.a.remove(dVar2);
        dVar2.c.a.execute(new b(0, (Object) dVar2));
        this.m1.s0 = null;
        qld qld = this.k1;
        qld.b.log("SharedPeerConnectionFac", "release");
        qld.a.execute(new pld(qld, 1));
        this.u0.getClass();
        o2.execute(new ux0(this, 1));
        k(w51.s0, (Object) null);
        this.I1 = null;
        this.L1.getClass();
        sd7 sd72 = (sd7) this.P1.o;
        sd72.getClass();
        dm4.a(sd72);
        vm1 vm1 = this.S1;
        ((CallAnalyticsSender) vm1.a.c).setIdle(true);
        sd7 sd73 = (sd7) vm1.i.c;
        if (sd73 != null) {
            dm4.a(sd73);
        }
        sd7 sd74 = (sd7) this.h2.X;
        sd74.getClass();
        dm4.a(sd74);
        AndroidVideoDecoder.errorCallback = null;
        ((hc3) this.j2.o).g();
    }

    public final bg1 q() {
        kg1 kg1 = this.p1;
        kg1.getClass();
        ArrayList arrayList = new ArrayList(kg1.d(kg1.k).keySet());
        if (arrayList.size() == 1) {
            return (bg1) arrayList.get(0);
        }
        return null;
    }

    public final void r(hrf hrf, List list, boolean z) {
        Intent intent;
        a4c a4c = this.V0;
        a4c.log("OKRTCCall", "init");
        jb9.e();
        if (!this.N0) {
            boolean z2 = true;
            this.N0 = true;
            ag1 ag1 = this.u0;
            ag1.b.getClass();
            yf1 yf1 = ag1.B;
            hrf hrf2 = hrf;
            rod rod = new rod(hrf2, (hw3) this.D0, this.V0, this.U0, ag1.l, yf1.i);
            this.Z = rod;
            rod.k.add(this.c);
            this.Z.l.add(this.o);
            this.L0 = list;
            StringBuilder sb = new StringBuilder();
            kg1 kg1 = this.p1;
            sb.append(kg1.r());
            sb.append(" participants");
            a4c.log("OKRTCCall", sb.toString());
            if (kg1.r() > 1) {
                e(xxe.c, false);
            } else if (kg1.r() == 1) {
                e(xxe.b, false);
                if (z) {
                    yn1 yn1 = this.t1;
                    yn1.getClass();
                    jb9.e();
                    if (1 != yn1.z0) {
                        yn1.z0 = 1;
                        yn1.G();
                    }
                }
            }
            if (this.B0 && !yf1.j) {
                C();
            }
            if (this.X0) {
                this.W0.k.add(new rcg(this));
            }
            c11 c11 = this.S1.l;
            o23 o23 = (o23) c11.c;
            o23.o = (ey1) c11.h;
            b11 b11 = null;
            try {
                intent = ((Context) o23.a).registerReceiver((an) o23.X, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception e) {
                ((a4c) o23.b).log("CallBatteryRetriever", wg0.i("Can't register BroadcastReceiver: ", e.getMessage()));
                intent = null;
            }
            if (intent != null) {
                int intExtra = intent.getIntExtra("level", 0);
                ((wte) ((vte) o23.c)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int intExtra2 = intent.getIntExtra("status", -1);
                if (!(intExtra2 == 2 || intExtra2 == 5)) {
                    z2 = false;
                }
                b11 = new b11(intExtra, elapsedRealtime, z2);
            }
            c11.e = b11;
            return;
        }
        throw new IllegalStateException("Is already initialized");
    }

    public final boolean s() {
        return this.B0 ? this.T0.b : this.A1;
    }

    public final void u(e0e e0e, String str) {
        this.U0.log(e0e, str, (String) null);
    }

    public final void v(String str) {
        u(e0e.app_event, str);
    }

    public final void w() {
        this.Q1.getClass();
        dpd h = oq9.h(this.y1);
        this.P1.e(h);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-call");
            jSONObject.put("mediaSettings", (Object) f46.p(h, false, false));
            this.Z.h(new ka6(jSONObject), new wx0(this, 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void x() {
        this.V0.log("OKRTCCall", "sendMediaSettingsChange");
        this.Q1.getClass();
        this.P1.c(oq9.h(this.y1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: wmc} */
    /* JADX WARNING: type inference failed for: r14v0, types: [rpa] */
    /* JADX WARNING: type inference failed for: r16v0, types: [rpa] */
    /* JADX WARNING: type inference failed for: r12v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int y(defpackage.bg1 r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            xad r8 = defpackage.xad.a
            kg1 r9 = r0.p1
            if (r7 != 0) goto L_0x0036
            pq9 r12 = new pq9
            r12.<init>()
            pq9 r13 = new pq9
            r13.<init>()
            pq9 r14 = new pq9
            r14.<init>()
            pq9 r15 = new pq9
            r15.<init>()
            pq9 r16 = new pq9
            r16.<init>()
            pq9 r17 = new pq9
            r17.<init>()
            dqa r1 = new dqa
            r10 = r1
            r11 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            fg1 r1 = r9.f(r1, r8)
            goto L_0x00b6
        L_0x0036:
            java.lang.String r1 = "state"
            java.lang.String r1 = r7.optString(r1)
            java.lang.String r2 = "ACCEPTED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0046
            r0 = 2
            return r0
        L_0x0046:
            kd1 r1 = r0.L1
            hi9 r2 = r1.h(r8)
            java.util.EnumMap r5 = r2.a()
            java.lang.String r4 = "onParticipantAddedToCall"
            r6 = 1
            r2 = r20
            r3 = r19
            hi9 r1 = r1.f(r2, r3, r4, r5, r6)
            pq9 r2 = new pq9
            r2.<init>()
            pq9 r3 = new pq9
            r3.<init>()
            kpa r4 = defpackage.f46.q(r20)
            wmc r12 = new wmc
            r5 = 0
            r12.<init>(r4, r5)
            wmc r13 = new wmc
            r4 = 0
            r13.<init>(r1, r4)
            ji9 r1 = defpackage.f46.o(r20)
            if (r1 == 0) goto L_0x0081
            wmc r2 = new wmc
            r4 = 0
            r2.<init>(r1, r4)
        L_0x0081:
            r14 = r2
            java.util.ArrayList r1 = defpackage.f46.y(r20)
            wmc r15 = new wmc
            r2 = 0
            r15.<init>(r1, r2)
            o61 r1 = defpackage.f46.k(r20)
            if (r1 == 0) goto L_0x0098
            wmc r3 = new wmc
            r2 = 0
            r3.<init>(r1, r2)
        L_0x0098:
            r16 = r3
            epd r1 = r0.T1
            hd9 r1 = r1.a
            java.util.List r1 = r1.h(r7, r8)
            wmc r2 = new wmc
            r3 = 0
            r2.<init>(r1, r3)
            dqa r1 = new dqa
            r10 = r1
            r11 = r19
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            fg1 r1 = r9.f(r1, r8)
        L_0x00b6:
            yn1 r0 = r0.t1
            r2 = 1
            r0.u(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.y(bg1, org.json.JSONObject):int");
    }

    public final void z(yn1 yn1) {
        this.V0.log("OKRTCCall", "handleTopologyCreated, " + yn1);
        kxf kxf = this.S0;
        if (!kxf.b) {
            kxf.c();
        }
    }
}
