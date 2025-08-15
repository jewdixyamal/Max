package defpackage;

/* renamed from: zdd  reason: default package */
public final class zdd {
    public final jqe a;
    public final int b;
    public final boolean c;

    public zdd(int i, eqe eqe, boolean z) {
        this.a = eqe;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdd)) {
            return false;
        }
        zdd zdd = (zdd) obj;
        return tpa.f(this.a, zdd.a) && this.b == zdd.b && this.c == zdd.c;
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
