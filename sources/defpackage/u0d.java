package defpackage;

/* renamed from: u0d  reason: default package */
public final class u0d implements z0d {
    public final jqe a;
    public final int b;
    public final long c;
    public final int o = iha.u;

    public u0d(eqe eqe, int i, long j) {
        this.a = eqe;
        this.b = i;
        this.c = j;
    }

    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0d)) {
            return false;
        }
        u0d u0d = (u0d) obj;
        return tpa.f(this.a, u0d.a) && this.b == u0d.b && this.c == u0d.c;
    }

    public final boolean g() {
        return false;
    }

    public final long getItemId() {
        return this.c;
    }

    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(4) + h4f.m(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", itemId=");
        ms2.j(this.c, ", sectionItemType=", "SOLO", sb);
        sb.append(")");
        return sb.toString();
    }

    public final int u() {
        return this.b;
    }
}
