package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.protocol.HTTP;

/* renamed from: u2a  reason: default package */
public final class u2a implements Cloneable, ny0 {
    public static final List O0 = naf.k(sob.HTTP_2, sob.HTTP_1_1);
    public static final List P0 = naf.k(rh3.e, rh3.f);
    public final SSLSocketFactory A0;
    public final X509TrustManager B0;
    public final List C0;
    public final List D0;
    public final HostnameVerifier E0;
    public final e12 F0;
    public final a14 G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final long M0;
    public final wd6 N0;
    public final qqd X;
    public final boolean Y;
    public final ob6 Z;
    public final a8g a;
    public final bkg b;
    public final List c;
    public final List o;
    public final boolean s0;
    public final boolean t0;
    public final kj6 u0;
    public final qq9 v0;
    public final Proxy w0;
    public final ProxySelector x0;
    public final ob6 y0;
    public final SocketFactory z0;

    public u2a(t2a t2a) {
        ProxySelector proxySelector;
        this.a = t2a.a;
        this.b = t2a.b;
        this.c = naf.w(t2a.c);
        this.o = naf.w(t2a.d);
        this.X = t2a.e;
        this.Y = t2a.f;
        this.Z = t2a.g;
        this.s0 = t2a.h;
        this.t0 = t2a.i;
        this.u0 = t2a.j;
        this.v0 = t2a.k;
        Proxy proxy = t2a.l;
        this.w0 = proxy;
        if (proxy != null) {
            proxySelector = zx9.a;
        } else {
            proxySelector = t2a.m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = zx9.a;
            }
        }
        this.x0 = proxySelector;
        this.y0 = t2a.n;
        this.z0 = t2a.o;
        List list = t2a.r;
        this.C0 = list;
        this.D0 = t2a.s;
        this.E0 = t2a.t;
        this.H0 = t2a.w;
        this.I0 = t2a.x;
        this.J0 = t2a.y;
        this.K0 = t2a.z;
        this.L0 = t2a.A;
        this.M0 = t2a.B;
        wd6 wd6 = t2a.C;
        this.N0 = wd6 == null ? new wd6(25) : wd6;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((rh3) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = t2a.p;
                    if (sSLSocketFactory != null) {
                        this.A0 = sSLSocketFactory;
                        a14 a14 = t2a.v;
                        this.G0 = a14;
                        this.B0 = t2a.q;
                        e12 e12 = t2a.u;
                        this.F0 = !tpa.f(e12.b, a14) ? new e12(e12.a, a14) : e12;
                    } else {
                        q2b q2b = q2b.a;
                        X509TrustManager m = q2b.a.m();
                        this.B0 = m;
                        this.A0 = q2b.a.l(m);
                        a14 b2 = q2b.a.b(m);
                        this.G0 = b2;
                        e12 e122 = t2a.u;
                        this.F0 = !tpa.f(e122.b, b2) ? new e12(e122.a, b2) : e122;
                    }
                }
            }
        }
        this.A0 = null;
        this.G0 = null;
        this.B0 = null;
        this.F0 = e12.c;
        List list2 = this.c;
        if (list2 != null) {
            boolean z = true;
            if (!list2.contains((Object) null)) {
                List list3 = this.o;
                if (list3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                } else if (!list3.contains((Object) null)) {
                    List<rh3> list4 = this.C0;
                    boolean z2 = list4 instanceof Collection;
                    X509TrustManager x509TrustManager = this.B0;
                    a14 a142 = this.G0;
                    SSLSocketFactory sSLSocketFactory2 = this.A0;
                    if (!z2 || !list4.isEmpty()) {
                        for (rh3 rh3 : list4) {
                            if (rh3.a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null".toString());
                                } else if (a142 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                                } else if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null".toString());
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    if (!(sSLSocketFactory2 != null ? false : z)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (a142 != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (!tpa.f(this.F0, e12.c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                }
            } else {
                throw new IllegalStateException(("Null interceptor: " + list2).toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
    }

    public final t2a a() {
        t2a t2a = new t2a();
        t2a.a = this.a;
        t2a.b = this.b;
        d63.V(this.c, t2a.c);
        d63.V(this.o, t2a.d);
        t2a.e = this.X;
        t2a.f = this.Y;
        t2a.g = this.Z;
        t2a.h = this.s0;
        t2a.i = this.t0;
        t2a.j = this.u0;
        t2a.k = this.v0;
        t2a.l = this.w0;
        t2a.m = this.x0;
        t2a.n = this.y0;
        t2a.o = this.z0;
        t2a.p = this.A0;
        t2a.q = this.B0;
        t2a.r = this.C0;
        t2a.s = this.D0;
        t2a.t = this.E0;
        t2a.u = this.F0;
        t2a.v = this.G0;
        t2a.w = this.H0;
        t2a.x = this.I0;
        t2a.y = this.J0;
        t2a.z = this.K0;
        t2a.A = this.L0;
        t2a.B = this.M0;
        t2a.C = this.N0;
        return t2a;
    }

    public final b8c b(mhc mhc) {
        return new b8c(this, mhc, false);
    }

    public final m8c c(mhc mhc, frf frf) {
        m8c m8c = new m8c(foe.h, mhc, frf, new Random(), (long) this.L0, this.M0);
        if (mhc.d.a("Sec-WebSocket-Extensions") != null) {
            m8c.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
        } else {
            t2a a2 = a();
            byte[] bArr = naf.a;
            a2.e = new qqd(29, (byte) 0);
            ArrayList arrayList = new ArrayList(m8c.x);
            sob sob = sob.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(sob) && !arrayList.contains(sob.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            } else if (arrayList.contains(sob) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            } else if (!(!arrayList.contains(sob.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            } else if (!arrayList.contains((Object) null)) {
                arrayList.remove(sob.SPDY_3);
                if (!arrayList.equals(a2.s)) {
                    a2.C = null;
                }
                a2.s = Collections.unmodifiableList(arrayList);
                u2a u2a = new u2a(a2);
                l84 a3 = mhc.a();
                ((bj6) a3.c).h("Upgrade", "websocket");
                ((bj6) a3.c).h(HTTP.CONN_DIRECTIVE, "Upgrade");
                ((bj6) a3.c).h("Sec-WebSocket-Key", m8c.a);
                ((bj6) a3.c).h("Sec-WebSocket-Version", "13");
                ((bj6) a3.c).h("Sec-WebSocket-Extensions", "permessage-deflate");
                mhc r = a3.r();
                b8c b8c = new b8c(u2a, r, true);
                m8c.b = b8c;
                b8c.e(new wva(m8c, 3, r));
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }
        return m8c;
    }

    public final Object clone() {
        return super.clone();
    }

    public u2a() {
        this(new t2a());
    }
}
