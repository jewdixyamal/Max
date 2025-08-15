package defpackage;

/* renamed from: wsf  reason: default package */
public final class wsf {
    public final long a;
    public final String b;
    public final osf c;
    public final q42 d;
    public final String e = null;

    public wsf(long j, String str, osf osf, q42 q42) {
        this.a = j;
        this.b = str;
        this.c = osf;
        this.d = q42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsf)) {
            return false;
        }
        wsf wsf = (wsf) obj;
        return this.a == wsf.a && tpa.f(this.b, wsf.b) && this.c == wsf.c && tpa.f(this.d, wsf.d) && tpa.f(this.e, wsf.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppAnalyticsParam(botId=");
        sb.append(this.a);
        sb.append(", webAppName=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", sourceType=");
        sb.append(this.d);
        sb.append(", label=");
        return zr6.l(sb, this.e, ")");
    }
}
