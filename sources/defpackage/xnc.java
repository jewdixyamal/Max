package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: xnc  reason: default package */
public final class xnc {
    public final y9 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public xnc(y9 y9Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = y9Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xnc) {
            xnc xnc = (xnc) obj;
            return tpa.f(xnc.a, this.a) && tpa.f(xnc.b, this.b) && tpa.f(xnc.c, this.c);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
