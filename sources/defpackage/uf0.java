package defpackage;

/* renamed from: uf0  reason: default package */
public final class uf0 {
    public static final uf0 e = new uf0((rx0) null, (dhc) null, new tf0(false, false), new sf0(false, false));
    public final rx0 a;
    public final dhc b;
    public final tf0 c;
    public final sf0 d;

    public uf0(rx0 rx0, dhc dhc, tf0 tf0, sf0 sf0) {
        this.a = rx0;
        this.b = dhc;
        this.c = tf0;
        this.d = sf0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0 = (uf0) obj;
        return tpa.f(this.a, uf0.a) && tpa.f(this.b, uf0.b) && tpa.f(this.c, uf0.c) && tpa.f(this.d, uf0.d);
    }

    public final int hashCode() {
        int i = 0;
        rx0 rx0 = this.a;
        int hashCode = (rx0 == null ? 0 : rx0.hashCode()) * 31;
        dhc dhc = this.b;
        if (dhc != null) {
            i = dhc.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
