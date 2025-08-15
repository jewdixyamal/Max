package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException;

/* renamed from: lh3  reason: default package */
public final class lh3 implements gh3 {
    public final Context a;
    public final Executor b;
    public final wmc c;
    public final je7 d;
    public final AtomicReference e;
    public final khe f = new khe(new ih3(this, 0));
    public final khe g = new khe(new ih3(this, 1));
    public volatile zh3 h = zh3.b;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final kh3 j = new kh3(0, this);
    public final AtomicReference k = new AtomicReference(jh3.f);
    public final String l = lh3.class.getName();

    public lh3(Context context, Executor executor, wmc wmc, khe khe) {
        this.a = context;
        this.b = executor;
        this.c = wmc;
        this.d = khe;
        AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        this.e = atomicReference;
        atomicReference.set(Boolean.valueOf(m(false)));
        an anVar = new an(5, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        z7.N(context, anVar, intentFilter, (String) null, 4);
    }

    public static zh3 j(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return zh3.b;
        }
        if (networkCapabilities.hasTransport(1)) {
            return zh3.c;
        }
        if (!networkCapabilities.hasTransport(0)) {
            return zh3.b;
        }
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        return linkDownstreamBandwidthKbps <= 150 ? zh3.o : linkDownstreamBandwidthKbps <= 23000 ? zh3.X : zh3.Y;
    }

    public final boolean a() {
        return k().getRestrictBackgroundStatus() != 3;
    }

    public final zh3 b() {
        zh3 zh3 = this.h;
        zh3 zh32 = zh3.b;
        if (zh3 != zh32) {
            return this.h;
        }
        Network activeNetwork = k().getActiveNetwork();
        if (activeNetwork != null) {
            try {
                zh32 = j(k().getNetworkCapabilities(activeNetwork));
            } catch (SecurityException e2) {
                l("failed getNetworkCapabilities", e2);
                zh32 = zh3.b;
            }
        }
        this.h = zh32;
        return zh32;
    }

    public final void c(fh3 fh3) {
        if (fh3 != null) {
            this.i.add(fh3);
        }
    }

    public final boolean d() {
        jh3 jh3 = (jh3) this.k.get();
        if (jh3 != null && ((Boolean) this.e.get()).booleanValue()) {
            return jh3.e;
        }
        NetworkCapabilities i2 = i(h());
        if (i2 != null) {
            return i2.hasTransport(4);
        }
        return false;
    }

    public final void e(fh3 fh3) {
        if (fh3 != null) {
            this.i.remove(fh3);
        }
    }

    public final boolean f() {
        boolean z = false;
        if (((Boolean) this.e.get()).booleanValue()) {
            jh3 jh3 = (jh3) this.k.get();
            if (!jh3.a) {
                return false;
            }
            return jh3.b;
        }
        ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException = new ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException();
        hm9.l0(this.l, "default network callback is not registered yet", connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException);
        ((cba) ((o45) ((cf7) this.d.getValue()).a.c(o45.class))).c(connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException, true);
        NetworkInfo activeNetworkInfo = k().getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        String str = this.l;
        ir6 ir6 = hm9.m;
        if (ir6 == null || !ir6.c()) {
            return z;
        }
        ir6.d(us7.X, str, ey8.j("fallbackOnDeprecatedCheckOfConnection: isConnected = ", z), (Throwable) null);
        return z;
    }

    public final boolean g() {
        return ((TelephonyManager) this.g.getValue()).isNetworkRoaming();
    }

    public final Network h() {
        String str = this.l;
        try {
            Network activeNetwork = k().getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            hm9.m0(str, "Unable to get active network (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            hm9.p(str, "Failed to get active network", th);
            return null;
        }
    }

    public final NetworkCapabilities i(Network network) {
        String str = this.l;
        try {
            NetworkCapabilities networkCapabilities = k().getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                return networkCapabilities;
            }
            hm9.m0(str, "Unable to get active network capabilities (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            hm9.p(str, "Failed to get active network capabilities", th);
            return null;
        }
    }

    public final void invalidate() {
        String str = this.l;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "invalidate", (Throwable) null);
        }
        this.e.set(Boolean.valueOf(m(true)));
        if (!((Boolean) this.e.get()).booleanValue()) {
            o((Network) null, (NetworkCapabilities) null);
        }
    }

    public final ConnectivityManager k() {
        return (ConnectivityManager) this.f.getValue();
    }

    public final void l(String str, Throwable th) {
        hm9.p(this.l, str, th);
        wmc wmc = this.c;
        wmc.getClass();
        hm9.p("ConnectionInfo", str, th);
        ((xie) ((v4) wmc.a).c(xie.class)).c().a((String) null, th);
    }

    public final boolean m(boolean z) {
        String str = this.l;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "registerNetworkCallback", (Throwable) null);
        }
        if (z) {
            try {
                k().unregisterNetworkCallback(this.j);
            } catch (Throwable th) {
                hm9.p(this.l, "registerNetworkCallback, unable to unregister default network callback", th);
            }
        }
        try {
            k().registerDefaultNetworkCallback(this.j);
            String str2 = this.l;
            ir6 ir62 = hm9.m;
            if (ir62 != null) {
                if (ir62.c()) {
                    ir62.d(us7.Y, str2, "registerNetworkCallback, default network callback successfully registered", (Throwable) null);
                }
            }
            return true;
        } catch (Throwable th2) {
            l("Unable to register default network callback", th2);
            return false;
        }
    }

    public final void n(jh3 jh3) {
        if (tpa.f((jh3) this.k.get(), jh3)) {
            hm9.m(this.l, "inet equals!", new Object[0]);
            return;
        }
        this.k.set(jh3);
        jh3 jh32 = (jh3) this.k.get();
        if (!jh32.a ? false : jh32.b) {
            String str = this.l;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.Y;
                ir6.d(us7, str, "updateInet, " + jh3 + " has working connection", (Throwable) null);
            }
        } else {
            String str2 = this.l;
            hm9.m0(str2, "updateInet, " + jh3 + " has no working connection", new Object[0]);
        }
        this.b.execute(new cu1(18, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        if (r6.hasTransport(3) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(android.net.Network r18, android.net.NetworkCapabilities r19) {
        /*
            r17 = this;
            r1 = r17
            long r2 = java.lang.System.currentTimeMillis()
            android.net.Network r4 = r17.h()
            r5 = 0
            if (r4 != 0) goto L_0x0014
            if (r18 != 0) goto L_0x0011
            goto L_0x0103
        L_0x0011:
            r0 = r18
            goto L_0x0015
        L_0x0014:
            r0 = r4
        L_0x0015:
            android.net.NetworkCapabilities r6 = r1.i(r4)
            if (r6 != 0) goto L_0x0021
            if (r19 != 0) goto L_0x001f
            goto L_0x0103
        L_0x001f:
            r6 = r19
        L_0x0021:
            if (r4 == 0) goto L_0x003f
            android.net.ConnectivityManager r0 = r17.k()     // Catch:{ all -> 0x0036 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = r1.l     // Catch:{ all -> 0x0036 }
            java.lang.String r7 = "Unable to get active network info"
            defpackage.hm9.m0(r0, r7, new java.lang.Object[0])     // Catch:{ all -> 0x0036 }
        L_0x0034:
            r0 = r5
            goto L_0x005a
        L_0x0036:
            r0 = move-exception
            java.lang.String r7 = r1.l
            java.lang.String r8 = "Failed to get active network info"
            defpackage.hm9.p(r7, r8, r0)
            goto L_0x0034
        L_0x003f:
            android.net.ConnectivityManager r7 = r17.k()     // Catch:{ all -> 0x0051 }
            android.net.NetworkInfo r0 = r7.getNetworkInfo(r0)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = r1.l     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = "Unable to get network info"
            defpackage.hm9.m0(r0, r7, new java.lang.Object[0])     // Catch:{ all -> 0x0051 }
            goto L_0x0034
        L_0x0051:
            r0 = move-exception
            java.lang.String r7 = r1.l
            java.lang.String r8 = "Failed to get network info"
            defpackage.hm9.p(r7, r8, r0)
            goto L_0x0034
        L_0x005a:
            android.net.ConnectivityManager r7 = r17.k()
            boolean r11 = r7.isActiveNetworkMetered()
            r7 = 16
            boolean r10 = r6.hasCapability(r7)
            r8 = 1
            if (r0 == 0) goto L_0x0073
            boolean r9 = r0.isRoaming()
            if (r9 != r8) goto L_0x0073
            r12 = r8
            goto L_0x0074
        L_0x0073:
            r12 = 0
        L_0x0074:
            r9 = 4
            boolean r13 = r6.hasTransport(r9)
            boolean r9 = r6.hasTransport(r9)
            if (r9 != 0) goto L_0x008b
            if (r0 == 0) goto L_0x0089
            boolean r9 = r0.isConnected()
            if (r9 != r8) goto L_0x0089
        L_0x0087:
            r9 = r8
            goto L_0x00be
        L_0x0089:
            r9 = 0
            goto L_0x00be
        L_0x008b:
            java.lang.String r9 = r1.l
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x0092
            goto L_0x009f
        L_0x0092:
            boolean r15 = r14.c()
            if (r15 == 0) goto L_0x009f
            us7 r15 = defpackage.us7.Y
            java.lang.String r7 = "retrieveInet, VPN detected"
            r14.d(r15, r9, r7, r5)
        L_0x009f:
            if (r0 == 0) goto L_0x00bc
            boolean r7 = r0.isConnected()
            if (r7 != r8) goto L_0x00bc
            r7 = 0
            boolean r9 = r6.hasTransport(r7)
            if (r9 != 0) goto L_0x0087
            boolean r9 = r6.hasTransport(r8)
            if (r9 != 0) goto L_0x0087
            r9 = 3
            boolean r9 = r6.hasTransport(r9)
            if (r9 == 0) goto L_0x00bd
            goto L_0x0087
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            r9 = r7
        L_0x00be:
            java.lang.String r7 = r1.l
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x00c5
            goto L_0x00fd
        L_0x00c5:
            boolean r14 = r8.c()
            if (r14 == 0) goto L_0x00fd
            us7 r14 = defpackage.us7.X
            long r15 = java.lang.System.currentTimeMillis()
            long r2 = r15 - r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r5 = "retrieveInet, took="
            r15.<init>(r5)
            r15.append(r2)
            java.lang.String r2 = "ms\nnet="
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = "\ncaps="
            r15.append(r2)
            r15.append(r6)
            java.lang.String r2 = "\ninfo="
            r15.append(r2)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r2 = 0
            r8.d(r14, r7, r0, r2)
        L_0x00fd:
            jh3 r5 = new jh3
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0103:
            if (r5 != 0) goto L_0x0106
            return
        L_0x0106:
            r1.n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh3.o(android.net.Network, android.net.NetworkCapabilities):void");
    }
}
