package defpackage;

/* renamed from: rgd  reason: default package */
public final class rgd {
    public final jqe a;
    public final int b;
    public final boolean c = false;

    public rgd(int i, eqe eqe) {
        this.a = eqe;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgd)) {
            return false;
        }
        rgd rgd = (rgd) obj;
        return tpa.f(this.a, rgd.a) && this.b == rgd.b && this.c == rgd.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return au1.j(sb, this.c, ")");
    }
}
