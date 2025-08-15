package defpackage;

/* renamed from: dzf  reason: default package */
public final class dzf implements kzf {
    public final String a;
    public final String b;

    public dzf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzf)) {
            return false;
        }
        dzf dzf = (dzf) obj;
        return tpa.f(this.a, dzf.a) && tpa.f(this.b, dzf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendJsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return zr6.l(sb, this.b, ")");
    }
}
