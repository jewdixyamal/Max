package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;

/* renamed from: y9  reason: default package */
public final class y9 {
    public final vq6 a;
    public final List b;
    public final List c;
    public final qq9 d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final e12 h;
    public final ob6 i;
    public final Proxy j;
    public final ProxySelector k;

    public y9(String str, int i2, qq9 qq9, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e12 e12, ob6 ob6, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.d = qq9;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = e12;
        this.i = ob6;
        this.j = proxy;
        this.k = proxySelector;
        od3 od3 = new od3();
        od3.m(sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME);
        od3.h(str);
        od3.k(i2);
        this.a = od3.b();
        this.b = naf.w(list);
        this.c = naf.w(list2);
    }

    public final boolean a(y9 y9Var) {
        return tpa.f(this.d, y9Var.d) && tpa.f(this.i, y9Var.i) && tpa.f(this.b, y9Var.b) && tpa.f(this.c, y9Var.c) && tpa.f(this.k, y9Var.k) && tpa.f(this.j, y9Var.j) && tpa.f(this.f, y9Var.f) && tpa.f(this.g, y9Var.g) && tpa.f(this.h, y9Var.h) && this.a.f == y9Var.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y9) {
            y9 y9Var = (y9) obj;
            return tpa.f(this.a, y9Var.a) && a(y9Var);
        }
    }

    public final int hashCode() {
        int d2 = rh4.d(527, 31, this.a.i);
        int hashCode = this.i.hashCode();
        int g2 = k7d.g(this.c, k7d.g(this.b, (hashCode + ((this.d.hashCode() + d2) * 31)) * 31, 31), 31);
        int hashCode2 = Objects.hashCode(this.j);
        int hashCode3 = Objects.hashCode(this.f);
        int hashCode4 = Objects.hashCode(this.g);
        return Objects.hashCode(this.h) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.k.hashCode() + g2) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        vq6 vq6 = this.a;
        sb.append(vq6.e);
        sb.append(':');
        sb.append(vq6.f);
        sb.append(", ");
        Proxy proxy = this.j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.k;
        }
        return zr6.l(sb, str, "}");
    }
}
